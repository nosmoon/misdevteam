<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.res.rec.*
				,chosun.ciis.ad.res.ds.*
				,chosun.ciis.co.base.util.*
				,somo.framework.util.* " %>

<%

	RwXml rx = new RwXml();         // XML 객체 생성 
	
	AD_RES_1410_LDataSet ds = (AD_RES_1410_LDataSet)request.getAttribute("ds");
	
	int root 	 = RwXml.rootNodeID;
	int resData  = rx.add( root , "resData" , "");
	
	rx.add(resData, "preng_clos_yn", ds.preng_clos_yn); //예약마감여부
	rx.add(resData, "asum_shet_aprv_yn", ds.asum_shet_aprv_yn); //추정표승인여부
	rx.add(resData, "tot_side_cnt", ds.tot_side_cnt); //총광고면수
	rx.add(resData, "tot_dn_cnt",   ds.tot_dn_cnt); //총광고단수
	rx.add(resData, "advs_ocpy_rate", ds.advs_ocpy_rate); //광고점유율
	rx.add(resData, "unasin_uprc", ds.unasin_uprc); //미배정단가
	
	long   tot_advt_fee  = StringUtil.toLong(ds.tot_advt_fee);
	double avg_uprc 	 = 0.0d;
	long   tot_dn	 	 = 0;
	int    sect_cnt 	 = ds.sectcurlist.size();
	int    unasin_uprc   = StringUtil.toNumber(ds.unasin_uprc);
	
	double[] sect_tot_dn	 = new double[sect_cnt];
	long[] sect_tot_uprc	 = new long[sect_cnt];
	long[] sect_tot_advt_fee = new long[sect_cnt];
	long[] datarows 	     = new long[sect_cnt];
	
	
	for(int i=0; i<ds.sectcurlist.size(); i++){
		AD_RES_1410_LSECTCURLISTRecord rec = (AD_RES_1410_LSECTCURLISTRecord)ds.sectcurlist.get(i);
		
		String sect_cd   	= rec.sect_cd;
		
		int gridData = rx.add(resData, "gridData" + (i+1), "");
		
		if(!"".equals(rec.edt_clsf_nm)){
			rx.addCData(gridData, "sect_nm", rec.sect_nm +"("+rec.sect_cd +rec.max_seq+") :"+rec.edt_clsf_nm );
		}else{
			rx.addCData(gridData, "sect_nm", rec.sect_nm +"("+rec.sect_cd +rec.max_seq+")" );
		}
		
		for(int j = 0; j < ds.curlist.size(); j++) {
			AD_RES_1410_LCURLISTRecord sub_rec = (AD_RES_1410_LCURLISTRecord)ds.curlist.get(j);
		
			if(!sect_cd.equals(sub_rec.sect_cd)) continue;		
			 
			int record   = rx.add(gridData , "record" , "");
			
			double cm 		= StringUtil.toDouble(sub_rec.cm);
			double dn 		= StringUtil.toDouble(sub_rec.dn); 
			int    advt_fee = StringUtil.toNumber(sub_rec.advt_fee);
			int    ex_advt_fee = StringUtil.toNumber(sub_rec.ex_advt_fee);
			int    uprc		= StringUtil.toNumber(sub_rec.uprc);
			
			String preng_occr_seq = StringUtil.nvl(sub_rec.preng_occr_seq);
			
			String dlco_nm	 = StringUtil.nvl(sub_rec.dlco_nm);
			String advt_cont = StringUtil.nvl(sub_rec.advt_cont);
			
			String tmp_advt_cont = "";
			if(!"".equals(advt_cont)){
				tmp_advt_cont	=	advt_cont;
			}else{
				tmp_advt_cont	=	dlco_nm;
			}
			
			rx.add(record, "sect", sub_rec.sect_cd + sub_rec.sect_seq); 
			rx.add(record, "dn", DigitUtil.cutUnderPoint(sub_rec.dn,1)); 
			rx.add(record, "cm", DigitUtil.cutUnderPoint(cm, 1)); 
			rx.add(record, "chro_clsf_nm", sub_rec.chro_clsf_nm); 
			rx.addCData(record, "advt_cont", tmp_advt_cont); 
			rx.add(record, "uprc", sub_rec.uprc); 
			rx.add(record, "advt_fee", sub_rec.advt_fee); 
			rx.add(record, "slcrg_pers", sub_rec.slcrg_pers); 
			rx.add(record, "agn_nm", sub_rec.agn_nm);  
			rx.add(record, "agn", sub_rec.agn);  
			rx.add(record, "dlco_clsf", sub_rec.dlco_clsf); 
			rx.add(record, "preng_occr_seq", preng_occr_seq); 
			rx.add(record, "issu_side", sub_rec.issu_side);  
			rx.add(record, "sect_cd", sub_rec.sect_cd);  
			rx.add(record, "sect_seq", sub_rec.sect_seq);  
			rx.add(record, "chro_clsf", StringUtil.toNumber(sub_rec.chro_clsf));    
			rx.add(record, "bw_clr_yn", sub_rec.bw_clr_yn); 
			
//			tot_advt_fee  		 += (advt_fee != 0 ? advt_fee : ex_advt_fee); 
			
			sect_tot_dn[i]     	 += cm * dn;
			tot_dn				 += cm * dn;
			sect_tot_uprc[i]     += (uprc != 0 ? uprc : unasin_uprc);
			sect_tot_advt_fee[i] += (advt_fee != 0 ? advt_fee : ex_advt_fee) ;
			if(tot_dn > 0){
				datarows[i]++;
			}
		}
	}
	
	avg_uprc = tot_dn == 0 ? 0 : tot_advt_fee / tot_dn;
	
	rx.add(resData, "tot_advt_fee", tot_advt_fee);  //게재예정액
	rx.add(resData, "avg_uprc", DigitUtil.cutUnderPoint(avg_uprc,0));  //평균단가
	
	for(int i=0; i<sect_tot_dn.length; i++){
		int sumGridData = rx.add(resData, "sumGridData" + (i+1), "");
		int record = rx.add(sumGridData, "record", "");
	
		rx.add(record, "lbl", "계"); 
		rx.add(record, "dn", 		DigitUtil.cutUnderPoint((double)sect_tot_dn[i]/(double)37, 1)); 
		rx.add(record, "uprc", 		Math.round(sect_tot_dn[i] == 0 ? 0 : sect_tot_advt_fee[i]/sect_tot_dn[i]));//datarows[i] == 0 ? 0 : sect_tot_uprc[i]/datarows[i]); 
		rx.add(record, "advt_fee",  sect_tot_advt_fee[i]); 
		
	}
	
	
	rx.add(resData, "sect_cnt", sect_cnt); 
	rx.add(resData, "show_uprc", "Y"); 
	rx.add(resData, "out_tot_advt_fee", ds.out_tot_advt_fee); 
	rx.add(resData, "ex_tot_advt_fee", ds.ex_tot_advt_fee); 
	
    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>