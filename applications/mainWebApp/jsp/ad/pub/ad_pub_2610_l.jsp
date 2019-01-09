<%@	page contentType="text/xml; charset=EUC-KR"%>

<%@	page
	import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.ad.pub.ds.*;
	"%>

<%
	RwXml rx = new RwXml();
	AD_PUB_2610_LDataSet ds = (AD_PUB_2610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int gridData = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	resData = rx.add(root, "resData", "");
	int sec_no			= Integer.parseInt(ds.sec_no);
		
//변수선언부
long day_plus = 0;
long mon_plus = 0;
long p_day_plus = 0;
long p_mon_plus = 0;
long tot_cnt = 0;
long p_tot_cnt = 0;
int  mon_reset = 0;
int  p_mon_reset = 0;
//변수선언부
	try {
		/****** CURLIST BEGIN */

		String prev_month       = "";
		int    n				= 0;
		int tmp_idx = 0;
		for(int i = 0; i < ds.curlist.size(); i++){//월의 갯수 
			AD_PUB_2610_LCURLISTRecord rec = (AD_PUB_2610_LCURLISTRecord)ds.curlist.get(i);
			if(StringUtil.toLong(rec.day_tot) != 0){
				String cur_month = rec.dt.substring(0,6);
				if(tmp_idx++ != 0 && !prev_month.equals(cur_month)){
					n++;
				}
				if(rec == null){
					n++;
				}
				prev_month = cur_month;
			}	
		}
		if(n == 0){
			n += ds.curlist.size();
		}
		int[]  monthly_cur_cnt 	= new int[n+3];
		int[]  monthly_prv_cnt 	= new int[n+3];
		int    line_indx        = 0;
			   prev_month       = "";
		int		cnt          	= 0;
			 tmp_idx = 0;	
		for(int i = 0; i < ds.curlist.size(); i++) {//기준년도 월의 row수
			AD_PUB_2610_LCURLISTRecord rec = (AD_PUB_2610_LCURLISTRecord)ds.curlist.get(i);
			if(StringUtil.toLong(rec.day_tot) != 0){
				String cur_month = rec.dt.substring(0,6);
				if(tmp_idx++ != 0  && !prev_month.equals(cur_month)){
					monthly_cur_cnt[line_indx++] = cnt;
					cnt = 0;
				}else{
					cnt++;
				}
				prev_month = cur_month;
			}
		}		
		monthly_cur_cnt[line_indx++] = cnt;
		cnt       = 0;
		line_indx = 0; tmp_idx = 0;
		for(int i = 0; i < ds.curlist.size(); i++) {//전년도  월의 row수
			AD_PUB_2610_LCURLISTRecord rec = (AD_PUB_2610_LCURLISTRecord)ds.curlist.get(i);
			if(StringUtil.toLong(rec.prv_day_tot) != 0){
				String cur_month = rec.prv_dt.substring(0,6);
				if(tmp_idx++ != 0 && !prev_month.equals(cur_month)){
					monthly_prv_cnt[line_indx++] = cnt;
					cnt = 0;
				}else{
					cnt++;
				}
				prev_month = cur_month;
			}
		}	
		monthly_cur_cnt[line_indx++] = cnt;
		line_indx = 0;
		prev_month = "";
		ArrayList list = new ArrayList();
	   tmp_idx = 0;
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_2610_LCURLISTRecord rec = (AD_PUB_2610_LCURLISTRecord)ds.curlist.get(i);

			if(StringUtil.toLong(rec.day_tot) != 0){
				String cur_month = rec.dt.substring(0,6);

				if(tmp_idx++ != 0 && !prev_month.equals(cur_month)){

					for(int k=0; k<monthly_prv_cnt[line_indx] - monthly_cur_cnt[line_indx]; k++){
						list.add(new AD_PUB_2610_LCURLISTRecord());
						tot_cnt++;
					}
					line_indx++;
					list.add(new AD_PUB_2610_LCURLISTRecord());
					tot_cnt++;
				}
				
				AD_PUB_2610_LCURLISTRecord tmp_rec = new AD_PUB_2610_LCURLISTRecord();
				tmp_rec.day_tot 	= rec.day_tot;
				tmp_rec.day_myun 	= rec.day_myun;
				tmp_rec.dt 			= rec.dt;
				tmp_rec.yoil 		= rec.yoil;
				list.add(tmp_rec);
				tot_cnt++;
				prev_month = cur_month;
			}
		}
		
		line_indx = 0;
		prev_month = "";
		int idx     = 0;
		tmp_idx = 0;
		for(int j = 0; j < ds.curlist.size(); j++){
			AD_PUB_2610_LCURLISTRecord prv_rec = (AD_PUB_2610_LCURLISTRecord)ds.curlist.get(j);
			AD_PUB_2610_LCURLISTRecord tmp_rec = null;

			if(StringUtil.toLong(prv_rec.prv_day_tot) != 0){
				String cur_month = prv_rec.dt.substring(0,6);

				if(tmp_idx++ != 0 && !prev_month.equals(cur_month)){
					for(int k=0; k<monthly_cur_cnt[line_indx] - monthly_prv_cnt[line_indx]; k++){
						list.add(new AD_PUB_2610_LCURLISTRecord());
						idx++;
						p_tot_cnt++;
					}
					line_indx++;
					
					list.add(new AD_PUB_2610_LCURLISTRecord());					
					idx++;
					p_tot_cnt++;
				}
				try{
					tmp_rec = (AD_PUB_2610_LCURLISTRecord)list.get(idx++);
					if(!cur_month.equals(tmp_rec.dt.substring(0,6))){
						tmp_rec = null;
					}					
				}catch(Exception ignore){
				}
				if(tmp_rec == null){
					tmp_rec = new AD_PUB_2610_LCURLISTRecord();
					tmp_rec.prv_day_tot 	= prv_rec.prv_day_tot;
					tmp_rec.prv_day_myun 	= prv_rec.prv_day_myun;					
					tmp_rec.prv_dt 	    	= prv_rec.prv_dt;
					tmp_rec.prv_yoil 		= prv_rec.prv_yoil;
					list.add(tmp_rec);

					p_tot_cnt++;
				}else{//기본 update
					tmp_rec.prv_day_tot 	= prv_rec.prv_day_tot;
					tmp_rec.prv_day_myun 	= prv_rec.prv_day_myun;
					tmp_rec.prv_dt 	    	= prv_rec.prv_dt;
					tmp_rec.prv_yoil 		= prv_rec.prv_yoil;
					p_tot_cnt++;					
				}
				
				prev_month = cur_month;
			}	
		}

		gridData = rx.add(resData, "gridData", "");
		idx = 0;
		String day_tot = "";
		String day_myun = "";
		String prv_day_tot = "";
		String prv_day_myun = "";
		for(int i = 0; i < list.size(); i++) {
			AD_PUB_2610_LCURLISTRecord rec 	= (AD_PUB_2610_LCURLISTRecord)list.get(i);
			int record = rx.add(gridData, "record", "");
			//sec_no = 1 : 게재액 , 2 : 발행면 , 3 : 면당게재액  
			rx.add(record, "dt", rec.dt);
			rx.add(record, "yoil", rec.yoil);
			if(sec_no == 1){
				day_tot = rec.day_tot;							
			}
			else if(sec_no == 2){
				if("".equals(rec.day_myun)){
					day_tot = "0";
				}
				else{				
					day_tot = rec.day_myun;
				}						
			}
			else{//sec_no = 3
				day_tot = rec.day_tot;
				day_myun = rec.day_myun;
				if(day_tot == null && day_myun == null){
				}
				else{							
					if("".equals(day_tot)){
						day_tot = "0";
					}
					if("".equals(day_myun)){
						day_myun = "0";
					}
					long dt = Long.parseLong(day_tot);
					long dm = Long.parseLong(day_myun);
					if(dm == 0){
						day_tot = "0";			
					}
					else{
						day_tot = Long.toString(dt/dm);			
					}								
					
				}
			}
			rx.add(record, "day_tot", day_tot);
			if(day_tot != null){
				if(mon_reset == 1){
					day_plus = 0;
					day_plus += Long.parseLong(day_tot);					
					mon_reset = 0;
				}
				else{
					day_plus += Long.parseLong(day_tot);					
					}
				rx.add(record, "mon_tot", day_plus);
				mon_plus += Long.parseLong(day_tot);					
				rx.add(record, "year_tot", mon_plus);				
			}
			else{
				if(rec.prv_day_tot == null){
					rx.add(record, "mon_tot", "");
					rx.add(record, "year_tot", "");
					mon_reset = 1;						
				}
				else{
					if(mon_reset == 1){
						day_plus = 0;
						rx.add(record, "mon_tot", day_plus);
						rx.add(record, "year_tot", mon_plus);											
						mon_reset = 1;
					}
					else{
						rx.add(record, "mon_tot", day_plus);
						rx.add(record, "year_tot", mon_plus);					
					}
				}
			}
		
			rx.add(record, "prv_dt", rec.prv_dt);
			rx.add(record, "prv_yoil", rec.prv_yoil);
			if(sec_no == 1){
				prv_day_tot = rec.prv_day_tot;
			}
			else if(sec_no == 2){
				if("".equals(rec.prv_day_myun)){
					prv_day_tot = "0";
				}
				else{				
					prv_day_tot = rec.prv_day_myun;
				}
			}
			else{
				prv_day_tot = rec.prv_day_tot;
				prv_day_myun = rec.prv_day_myun;
				if(prv_day_tot == null && prv_day_myun == null){
				}
				else{							
					if("".equals(prv_day_tot)){
						prv_day_tot = "0";
					}
					if("".equals(prv_day_myun)){
						prv_day_myun = "0";
					}
					long pdt = Long.parseLong(prv_day_tot);
					long pdm = Long.parseLong(prv_day_myun);
					if(pdm == 0){
						prv_day_tot = "0";
					}
					else{
						prv_day_tot = Long.toString(pdt/pdm);
					}								
								
				}
			}
			rx.add(record, "prv_day_tot", prv_day_tot);
			if(rec.prv_day_tot != null){
				if(p_mon_reset == 1){
					p_day_plus = 0;
					p_day_plus += Long.parseLong(prv_day_tot);
					p_mon_reset = 0;
				}
				else{
					p_day_plus += Long.parseLong(prv_day_tot);
					}				
				rx.add(record, "prv_mon_tot", p_day_plus);
				p_mon_plus += Long.parseLong(prv_day_tot);
				rx.add(record, "prv_year_tot", p_mon_plus);
			}
			else{
				if(rec.day_tot == null){
					rx.add(record, "prv_mon_tot", "");
					rx.add(record, "prv_year_tot", "");
					p_mon_reset = 1;//바뀐달의 첫날					
				}	else{
					rx.add(record, "prv_mon_tot", p_day_plus);
					rx.add(record, "prv_year_tot", p_mon_plus);					
					p_mon_reset = 0;//월중 
				}
			}

			//증감율
			//Math.round((((w-z)/z)*100)*100)/100.0
			double x = 0; 
			double y = 0;
			double w = 0; 
			double z = 0;
			String dp = Long.toString(day_plus);
			String pdp = Long.toString(p_day_plus);
			String mp = Long.toString(mon_plus);
			String pmp = Long.toString(p_mon_plus);
			x = Double.valueOf(dp).doubleValue();
			y = Double.valueOf(pdp).doubleValue();//월
			w = Double.valueOf(mp).doubleValue();
			z = Double.valueOf(pmp).doubleValue();//년
			if(rec.day_tot == null && rec.prv_day_tot == null){
				rx.add(record, "mrate", "");
				rx.add(record, "yrate", "");
			}					
			else{
				
				rx.add(record, "mrate",  y == 0 ? x == 0 ? "0" : "100" : DigitUtil.cutUnderPoint(((x-y)/y)*100, 2));
				rx.add(record, "yrate",  z == 0 ? w == 0 ? "0" : "100" : DigitUtil.cutUnderPoint(((w-z)/z)*100, 2));
			}
		
			String tcs = "";
			if(tot_cnt > p_tot_cnt){
				tcs = Long.toString(tot_cnt);
			}
			else{
				tcs = Long.toString(p_tot_cnt);
			}
			int tc =  Integer.parseInt(tcs);
			if(i == tc-1){
				 //3:평균 1, 2:합계
				 if(sec_no == 3){
				 	rx.add(gridData, "record", "");
					rx.add(record, "yoil", "");
					if(mon_plus == 0 || tot_cnt == 0){
						rx.add(record, "dt", "평균");
						rx.add(record, "day_tot", "0");
					}
					else{
						rx.add(record, "dt", "평균");
					 	rx.add(record, "day_tot", (mon_plus/tot_cnt));
					} 
					rx.add(record, "day_myun", "");
					rx.add(record, "prv_yoil", "");
					if(p_mon_plus == 0 || p_tot_cnt == 0){
						rx.add(record, "prv_dt", "평균");
						rx.add(record, "prv_day_tot", "0");
					}
					else{
						rx.add(record, "prv_dt", "평균");
					 	rx.add(record, "prv_day_tot", (p_mon_plus/p_tot_cnt));
					}
					rx.add(record, "prv_day_myun", "");				
					rx.add(record, "mrate", "");
					rx.add(record, "yrate", "");		 	
				 }
				 if(sec_no == 1 || sec_no == 2){
				 	rx.add(gridData, "record", "");
					rx.add(record, "dt", "합계");
					rx.add(record, "yoil", "");
				 	rx.add(record, "day_tot", mon_plus);
					rx.add(record, "day_myun", "");
					rx.add(record, "prv_dt", "합계");
					rx.add(record, "prv_yoil", "");
					rx.add(record, "prv_day_tot", p_mon_plus);
					rx.add(record, "prv_day_myun", "");				
					rx.add(record, "mrate", "");
					rx.add(record, "yrate", "");		 				 
				 }
			}
		 }

			/****** CURLIST END */
	} 
	catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

