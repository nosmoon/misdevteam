<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.res.rec.*
				,chosun.ciis.ad.res.ds.*
				,chosun.ciis.co.base.util.*
				,somo.framework.util.* " %>

<%

	String	pubc_clsf	=	Util.checkString(request.getParameter("pubc_clsf"));
	
	RwXml rx = new RwXml();         // XML 객체 생성 
	
	AD_RES_1420_LDataSet ds = (AD_RES_1420_LDataSet)request.getAttribute("ds");
	
	int root 	 = RwXml.rootNodeID;
	int resData1  = rx.add( root , "resData1" , "");
	

	long sect_tot_size	 	= 0;
	long sect_tot_uprc	 	= 0;
	long sect_tot_advt_fee	= 0;
	long datarows 	       	= 0;	
	
	int gridData 	= 0;//rx.add(resData1, "gridData", "");
	int sumGridData = 0;//rx.add(resData1, "sumGridData", "");
	
	if("0".equals(pubc_clsf)){
		gridData 	= rx.add(resData1, "gridData", "");
	}else if("2".equals(pubc_clsf)){
		gridData 	= rx.add(resData1, "gridData1", "");
	}else if("9".equals(pubc_clsf)){
		gridData 	= rx.add(resData1, "gridData2", "");
	}	
	      
	for(int j = 0; j < ds.curlist.size(); j++) {
		AD_RES_1420_LCURLISTRecord rec = (AD_RES_1420_LCURLISTRecord)ds.curlist.get(j);
	
		int record   = rx.add(gridData , "record" , "");
		
		double cm 		= StringUtil.toDouble(rec.cm);
		double dn 		= StringUtil.toDouble(rec.dn);
		int    advt_fee = StringUtil.toNumber(rec.advt_fee);
		int    uprc		= StringUtil.toNumber(rec.uprc);
		
		String preng_occr_seq = StringUtil.nvl(rec.preng_occr_seq);
		String dlco_nm	 = StringUtil.nvl(rec.dlco_nm);
		String advt_cont = StringUtil.nvl(rec.advt_cont);
		
		String tmp_advt_cont = "";
		if(!"".equals(advt_cont)){
			tmp_advt_cont	=	advt_cont;
		}else{
			tmp_advt_cont	=	dlco_nm;
		}
			
		rx.add(record, "sect", rec.sect);
		rx.add(record, "dn", DigitUtil.cutUnderPoint(rec.dn, 1)); 
		rx.add(record, "cm", DigitUtil.cutUnderPoint(cm, 1)); 
		rx.add(record, "chro_clsf", rec.chro_clsf); 
		rx.add(record, "chro_clsf_nm", rec.chro_clsf_nm); 
		rx.add(record, "advt_cont", tmp_advt_cont); 
		rx.add(record, "uprc", uprc); 
		rx.add(record, "advt_fee", advt_fee); 
		rx.add(record, "slcrg_pers", rec.slcrg_pers); 
		rx.add(record, "agn_nm", rec.agn_nm);     
		rx.add(record, "agn", rec.agn);  
		rx.add(record, "dlco_clsf", rec.dlco_clsf); 
		rx.add(record, "preng_occr_seq", preng_occr_seq); 
		
		sect_tot_size     += cm * dn;
		sect_tot_uprc     += uprc;
		sect_tot_advt_fee += advt_fee;
		if(!"".equals(preng_occr_seq)){
			datarows++;		
		}
	}
	for(int i=0; i<30-ds.curlist.size(); i++){
	  
		int record   = rx.add(gridData , "record" , "");
		
		rx.add(record, "sect", "");
		rx.add(record, "dn", ""); 
		rx.add(record, "cm", ""); 
		rx.add(record, "chro_clsf", "");
		rx.add(record, "chro_clsf_nm", ""); 
		rx.add(record, "advt_cont", ""); 
		rx.add(record, "uprc", ""); 
		rx.add(record, "advt_fee", ""); 
		rx.add(record, "slcrg_pers", ""); 
		rx.add(record, "agn_nm", "");  
		rx.add(record, "agn", "");  
		rx.add(record, "dlco_clsf", ""); 
		rx.add(record, "preng_occr_seq", ""); 
		
	}
	
	if("0".equals(pubc_clsf)){
		sumGridData 	= rx.add(resData1, "sumGridData", "");
	}else if("2".equals(pubc_clsf)){
		sumGridData 	= rx.add(resData1, "sumGridData1", "");
	}else if("9".equals(pubc_clsf)){
		sumGridData 	= rx.add(resData1, "sumGridData2", "");
	}	

	int record = rx.add(sumGridData, "record", "");

	rx.add(record, "lbl", "계"); 
	rx.add(record, "dn", 		DigitUtil.cutUnderPoint((double)sect_tot_size/(double)37, 1)); 
	rx.add(record, "uprc", 		Math.round(sect_tot_uprc == 0 ? 0 : sect_tot_advt_fee/sect_tot_size)); 
	rx.add(record, "advt_fee",  sect_tot_advt_fee); 
		
	
    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>