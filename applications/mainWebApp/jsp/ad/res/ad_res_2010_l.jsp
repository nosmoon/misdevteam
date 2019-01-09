<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.res.rec.*
				,chosun.ciis.ad.res.ds.*
				,chosun.ciis.co.base.util.*
				,somo.framework.util.* " %>
				
<%!
	String getAmt(long amt){
		
		StringBuffer sb = new StringBuffer();

		int quotient = 0; //억단위
		int remnant  = 0; //천만단위
		int million  = 0; //백만단위
		int unit     = 0; 

		if(amt/100000000 > 0){//억단위

			unit 	 	= 100000000;				
			quotient	= (int)(amt/unit);
			remnant		= (int)((amt%unit)/(unit/10));
			million		= (int)((amt%10000000)/(unit/100));	
					
			sb.append(String.valueOf(quotient)).append("억");
			if(remnant > 0 || million > 0){
				if(remnant > 0){
					sb.append(remnant).append("천");
				}
				if(million > 0){
					sb.append(million).append("백");
				}				
				sb.append("만 원");
			}else{
				sb.append("원");
			}
		}else if(amt/10000000 > 0){//천만단위
			
			unit 	 = 10000000;	
			quotient = (int)(amt/unit);
			million	 = (int)((amt%unit)/(unit/10));
			
			sb.append(quotient).append("천");
			if(million > 0){
				sb.append(million).append("백");
			}
			sb.append("만 원");
		}else if(amt/1000000 > 0){//백만단위
			
			unit 	 = 1000000;
			quotient = (int)(amt/unit);
			
			sb.append(quotient).append("백만 원");
		}else {
			sb.append(DigitUtil.nf_format(amt)).append(" 원");
		}

		return sb.toString();
	}
%>				

<%


	
	RwXml rx = new RwXml();         // XML 객체 생성 
	
	AD_RES_2010_LDataSet ds = (AD_RES_2010_LDataSet)request.getAttribute("ds");
	
	int root 	 = RwXml.rootNodeID;
	int resData  = rx.add( root , "resData" , "");
	
	String[] sect_nm    		= new String[ds.sectcurlist.size()];
	String[] sect_cd_arr   	 	= new String[ds.sectcurlist.size()];
	double[] tot_dn_arr 		= new double[ds.sectcurlist.size()];
	double   tot_dn     		= 0.0d;
	long[]   tot_pubc_amt_arr 	= new long[ds.sectcurlist.size()];
	long     tot_pubc_amt     	= 0;
	
	long	 tot_ex_amt			= 0;
	long	 tot_out_amt        = 0;
	long	 sect_ex_amt     	= 0;
	long	 sect_out_amt       = 0;    
//    int      tot_side_cnt	  	= ds.curlist.size();
    int      tot_side_cnt	  	= 0;    

	for(int i=0; i<ds.sectcurlist.size(); i++){
		AD_RES_2010_LSECTCURLISTRecord rec = (AD_RES_2010_LSECTCURLISTRecord)ds.sectcurlist.get(i);
		
		String sect_cd   	= rec.sect_cd;
		
		int gridData = rx.add(resData, "gridData" + (i+1), "");
		
		sect_nm[i] 		= rec.sect_nm.replaceAll("&amp;","&");
		sect_cd_arr[i] 	= rec.sect_cd;
		tot_side_cnt    += StringUtil.toNumber(rec.max_seq);
		for(int j = 0; j < ds.curlist.size(); j++) {
			AD_RES_2010_LCURLISTRecord sub_rec = (AD_RES_2010_LCURLISTRecord)ds.curlist.get(j);
		
			if(!sect_cd.equals(sub_rec.sect_cd)) continue;		
			
//			int record   = rx.add(gridData , "record" , "");
			 
			double cm = StringUtil.toDouble(sub_rec.cm);
			double dn = StringUtil.toDouble(sub_rec.dn);
//		    int	   advt_fee = StringUtil.toNumber(sub_rec.ex_advt_fee);
//			int	   advt_fee = StringUti.toNumber(sub_rec.advt_fee );
			long   advt_fee = StringUtil.toLong(sub_rec.advt_fee);
			String stat = sub_rec.stat;
			
			String size = "";
			//System.out.println("stat::"+stat);
			if(stat.equals("1")){//20130314	
				if(cm < 37 && dn != 0){
					size = sub_rec.dn + "*" + sub_rec.cm + "C";
				}else{
					size = sub_rec.dn + "";
				}			
				int record   = rx.add(gridData , "record" , "");								
				rx.add(record, "sect", sub_rec.sect_cd + sub_rec.sect_seq); 
	//			rx.add(record, "cm", DigitUtil.cutUnderPoint(sub_rec.cm, 1)); 
				rx.add(record, "dn", size); 
				rx.addCData(record, "advt_cont", sub_rec.advt_cont); 
				rx.add(record, "uprc", sub_rec.uprc); 
				
				if(sub_rec.advt_cont.equals("") || sub_rec.uprc.equals("")){
					rx.add(record, "advt_fee", "");
				}else{
					rx.add(record, "advt_fee", sub_rec.advt_fee); 
				}
				
				double tmp_dn = 0.0d;
				
				if(cm == 37){
					tmp_dn = dn;
				}else{
				tmp_dn = (dn * cm) / 37;
				}
				
				tot_dn_arr[i] += tmp_dn;
				tot_dn +=        tmp_dn;				
//				tot_side_cnt += 1;
			}
			if(advt_fee != 0){
				tot_pubc_amt_arr[i] += 	advt_fee;
				tot_pubc_amt		+=	advt_fee;
			}
		}
		tot_dn = Math.round(tot_dn);
		//System.out.println("tot_dn_arr["+i+"]="+tot_dn_arr[i]);
		//System.out.println("round(tot_dn)="+Math.round(tot_dn));		
		//System.out.println("tot_dn="+tot_dn);
		rx.addCData(gridData, "sect_nm", rec.sect_nm.replaceAll("&amp;","&") +"("+rec.sect_cd +rec.max_seq+") " + " ￦"+DigitUtil.nf_format(tot_pubc_amt_arr[i]));		
	}
	
//돌출	
	StringBuffer extrude = new StringBuffer();	
	int gridData11 = rx.add(resData, "gridData11", "");
	for(int i=0; i<ds.extrudecurlist.size(); i++){
		AD_RES_2010_LEXTRUDECURLISTRecord rec = (AD_RES_2010_LEXTRUDECURLISTRecord)ds.extrudecurlist.get(i);
		int record   = rx.add(gridData11 , "record" , "");

		double cm = StringUtil.toDouble(rec.cm);
		int    dn = StringUtil.toNumber(rec.dn);
	    int	   advt_fee = StringUtil.toNumber(rec.advt_fee);
		String sect = rec.sect_cd;//20130314
		String size = "";
		
		if(cm < 37 && dn != 0){
			size = rec.dn + "*" + rec.cm + "C";
		}else{
			size = rec.dn + "";
		}
		rx.add(record, "sect", rec.sect_cd + rec.sect_seq); 
		rx.add(record, "dn", size); 
		rx.addCData(record, "advt_cont", rec.advt_cont); 
		rx.add(record, "uprc", rec.uprc); 
		
		if(rec.advt_cont.equals("") || rec.uprc.equals("")){
			rx.add(record, "advt_fee", "");
		}else{
			rx.add(record, "advt_fee", rec.advt_fee); 
		} 

		if(advt_fee != 0){
			if(sect == ""){//20130314
				sect_ex_amt     +=  advt_fee;
			}
			tot_ex_amt 			+= 	advt_fee;
		}

	}
	
	rx.addCData(resData, "ex_lbl", "돌출 " + " ￦"+DigitUtil.nf_format(tot_ex_amt)); 
//지방판	
	int gridData12 = rx.add(resData, "gridData12", "");
	for(int i=0; i<ds.edtcurlist.size(); i++){
		AD_RES_2010_LEDTCURLISTRecord rec = (AD_RES_2010_LEDTCURLISTRecord)ds.edtcurlist.get(i);
		int record   = rx.add(gridData12 , "record" , "");

		double cm = StringUtil.toDouble(rec.cm);
		int    dn = StringUtil.toNumber(rec.dn); 
	    int	   advt_fee = StringUtil.toNumber(rec.advt_fee);
		String sect = rec.sect_cd;//20130314 		
		String size = "";
		if(cm < 37 && dn != 0){
			size = rec.dn + "*" + rec.cm + "C";
		}else{
			size = rec.dn + "";
		}
					
		rx.add(record, "sect", rec.sect_cd + rec.sect_seq); 
		rx.add(record, "dn", size); 
		rx.addCData(record, "advt_cont", rec.advt_cont); 
		rx.add(record, "uprc", rec.uprc); 
		
		if(rec.advt_cont.equals("") || rec.uprc.equals("")){
			rx.add(record, "advt_fee", "");
		}else{
			rx.add(record, "advt_fee", rec.advt_fee); 
		}

		if(advt_fee != 0){
			if(sect == ""){//20130314
				sect_out_amt    += 	advt_fee;
			}
			tot_out_amt		    += 	advt_fee;
		}
	}
	rx.addCData(resData, "sur_lbl", "지방판 " + " ￦"+DigitUtil.nf_format(tot_out_amt));
	//System.out.println(	"("+tot_dn+ "* 100)/(15 *"+ tot_side_cnt+")");
	double ocpy_rate = (tot_dn * 100)/(15 * tot_side_cnt);
	
	rx.add(resData, "extrude", extrude.toString());
	rx.add(resData, "tot_dn", Math.round(tot_dn) + " 단 " + "("+Math.round(ocpy_rate)+"%)");
	
	StringBuffer sum_dn = new StringBuffer();
	int n = 0;
	for(int i=0; i<tot_dn_arr.length; i++){
		//System.out.println(sect_nm[i]+" ="+tot_dn_arr[i]);	
		//System.out.println(sect_nm[i]+" round="+Math.round(tot_dn_arr[i]));
		//System.out.println(sect_nm[i]+" floor="+Math.floor(tot_dn_arr[i]));		
		sum_dn.append("*").append("".equals(sect_nm[i]) ? sect_cd_arr[i] : sect_nm[i]).append(" : ").append(Math.round(tot_dn_arr[i])).append("단   ");
		if(i != 0 && i % 2 == 1){
			n = n + 1;
			if(n < 3){
				sum_dn.append("\n");
			}
		}		
	}
	rx.addCData(resData, "sum_dn", sum_dn.toString());
	
	
//	long	tmp	=	tot_pubc_amt + tot_out_amt + tot_ex_amt;
	long	tmp	=	tot_pubc_amt + sect_out_amt + sect_ex_amt;	
	//System.out.println(tmp + " => " + getAmt(tmp));
	
	rx.add(resData, "tot_pubc_amt", getAmt(tmp));
	
	StringBuffer sum_pubc_amt = new StringBuffer();
	int m = 0;
	for(int i=0; i<tot_pubc_amt_arr.length; i++){
		sum_pubc_amt.append("*").append("".equals(sect_nm[i]) ? sect_cd_arr[i] : sect_nm[i]).append(" : ").append(getAmt(tot_pubc_amt_arr[i])).append("   ");
		if(i != 0 && i % 2 == 1){
			m = m + 1;
			if(m < 3){
				sum_pubc_amt.append("\n");
			}
		}
	}
//	sum_pubc_amt.append("*기타 : ").append(getAmt(tot_out_amt + tot_ex_amt));
	if(!getAmt(sect_out_amt + sect_ex_amt).equals("0 원")){
		sum_pubc_amt.append("*기타 : ").append(getAmt(sect_out_amt + sect_ex_amt));	
	}
	rx.addCData(resData, "sum_pubc_amt", sum_pubc_amt.toString());
	
	rx.addCData(resData, "remk", ds.remk);
	rx.addCData(resData, "job_trsf", ds.job_trsf);
	rx.addCData(resData, "sect_cnt", ds.sectcurlist.size());  
	
	//엑셀 출력용
	int gridData0 = rx.add(resData, "gridData0", "");
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_2010_LCURLISTRecord rec = (AD_RES_2010_LCURLISTRecord)ds.curlist.get(i);
		int record   = rx.add(gridData0 , "record" , "");

		double cm = StringUtil.toDouble(rec.cm);
		int    dn = StringUtil.toNumber(rec.dn); 
	    int	   advt_fee = StringUtil.toNumber(rec.advt_fee);
		String sect = rec.sect_cd;//20130314 		
		String size = "";
		if(cm < 37 && dn != 0){
			size = rec.dn + "*" + rec.cm + "C";
		}else{
			size = rec.dn + "";
		}
		
		rx.addCData(record, "sect_nm", rec.sect_nm_cd);
		rx.add(record, "sect", rec.sect_cd + rec.sect_seq); 
		rx.add(record, "dn", size); 
		rx.addCData(record, "advt_cont", rec.advt_cont); 
		rx.add(record, "uprc", rec.uprc); 
		
		if(rec.advt_cont.equals("") || rec.uprc.equals("")){
			rx.add(record, "advt_fee", "");
		}else{
			rx.add(record, "advt_fee", rec.advt_fee); 
		}

	}	
	
    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>