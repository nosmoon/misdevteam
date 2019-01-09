<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.tax.rec.*
	,	chosun.ciis.ad.tax.ds.*;
	"
%>

<%!
    public String getMonthLastFriday(String date){//해당월의 마지막 날자(금요일) 찾기 
		//System.out.println("date::"+date);
		int year = Integer.parseInt(date.substring(0,4));
		int mon  = Integer.parseInt(date.substring(4,6));
		
		Calendar calendar = Calendar.getInstance( Locale.KOREA );
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH,mon);
		calendar.set(Calendar.DATE, 1);
		
		calendar.add(Calendar.DATE, -1);
		//System.out.println("data1::"+String.valueOf(calendar.get(Calendar.YEAR))+String.valueOf(calendar.get(Calendar.MONTH))+String.valueOf(calendar.get(Calendar.DATE)));
		int day_of_week = calendar.get(Calendar.DAY_OF_WEEK);
		//System.out.println("day_of_week::"+day_of_week);
//		일월화수목금토 : 1234567

		if(day_of_week == 1){
			calendar.add(Calendar.DATE, -2);
		}else if(day_of_week == 7){
			calendar.add(Calendar.DATE, -1);
		}
		//System.out.println("return::"+date.substring(0,4) + date.substring(4,6) + String.valueOf(calendar.get(Calendar.DATE)));
		return  date.substring(0,4) + date.substring(4,6) + String.valueOf(calendar.get(Calendar.DATE));
    }
    
%>
<%
	RwXml rx = new RwXml();
	AD_TAX_1210_SDataSet ds = (AD_TAX_1210_SDataSet)request.getAttribute("ds");
	int root 	= RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");
	//System.out.println("11");
	try {
			 
		int advt_fee = 0;
		
		String tmp_medi_nm = "";
		String tmp_medi_cd = "";
		String tmp_proc_dt = "";
		String tmp_proc_seq = "";
		String tmp_dlco_nm = "";
		String tmp_advt_fee = "";	
					 
		int gridData1 = rx.add(resData, "gridData1", "");

		//String last_proc_dt = "";
		//String last_pubc_dt = "";		
		//AD_TAX_1210_SCURLISTRecord last_rec = (AD_TAX_1210_SCURLISTRecord)ds.curlist.get(ds.curlist.size()-1);
		//last_proc_dt = last_rec.pubc_slip_no.substring(3,11);
		//last_pubc_dt = last_rec.pubc_dt;
		//String lastFriday = getMonthLastFriday(last_proc_dt);
		//String lastFriday2 = getMonthLastFriday(last_pubc_dt);

		for(int i=0; i<ds.curlist.size(); i++){ 
			AD_TAX_1210_SCURLISTRecord rec = (AD_TAX_1210_SCURLISTRecord)ds.curlist.get(i);
			
			String medi_cd  = rec.pubc_slip_no.substring(0,3);
			String proc_dt  = rec.pubc_slip_no.substring(3,11);
			String proc_seq = rec.pubc_slip_no.substring(11);		
			System.out.println("proc_dt::"+proc_dt);
//			String lastFriday = getMonthLastFriday(proc_dt);
			//String pubc_dt = rec.pubc_dt;
			//System.out.println("pubc_dt::"+pubc_dt);
			//20111230 김상훈 20111031자 데이터 하드코딩 이후 로직을 파악 후에 수정 
			//20120329 김상훈 가게재를 말일자로 등록하고 분할이 발생(말일자이후로)하면 실게재에 분할된 게재건이 잡힘, 게재일자가 말일자면 가게재로 파악함
			//System.out.println("lastFriday.equals(proc_dt)::"+lastFriday.equals(proc_dt));
			//System.out.println("lastFriday2.equals(pubc_dt)::"+lastFriday2.equals(pubc_dt));
			
			//20130926 김상훈 게재일자로 확인하던 방식에서 선발행여부로 변경함			
			String pre_issu_yn = rec.pre_issu_yn;
			System.out.println("pre_issu_yn::"+pre_issu_yn);
			//if(!lastFriday.equals(proc_dt) && !lastFriday2.equals(pubc_dt)  )
			if(pre_issu_yn.equals("N"))
			{
				int record  = rx.add( gridData1 , "record" , "");
				rx.add ( record, "medi_nm", rec.medi_nm);
				rx.add ( record, "medi_cd", medi_cd);
				rx.add ( record, "proc_dt", proc_dt);
				rx.add ( record, "proc_seq", proc_seq);
				rx.add ( record, "dlco_nm", rec.dlco_nm);
				rx.add ( record, "advt_fee", rec.advt_fee);
			}
			else{
				tmp_medi_nm  = rec.medi_nm;
				tmp_medi_cd  = medi_cd;
				tmp_proc_dt  = proc_dt;
				tmp_proc_seq = proc_seq;
				tmp_dlco_nm  = rec.dlco_nm;
				tmp_advt_fee = rec.advt_fee;
			}
			advt_fee += StringUtil.toNumber(rec.advt_fee);
		}	
		for(int i=0; i< 10 - ds.curlist.size(); i++){
			int record1  = rx.add( gridData1 , "record" , "");
			
			rx.add ( record1, "medi_nm", "");
			rx.add ( record1, "medi_cd", "");
			rx.add ( record1, "proc_dt", "");
			rx.add ( record1, "proc_seq", "");
			rx.add ( record1, "dlco_nm", "");
			rx.add ( record1, "advt_fee", "");
		}
		
		int gridData2 = rx.add(resData, "gridData2", "");
		int record2  = rx.add( gridData2 , "record" , "");
		rx.add ( record2, "medi_nm", ds.medi_nm);
		rx.add ( record2, "medi_cd", ds.medi_cd);
		rx.add ( record2, "proc_dt", "");
		rx.add ( record2, "proc_seq", "");
		rx.add ( record2, "dlco_nm", "");
		rx.add ( record2, "advt_fee", "");
		rx.add ( record2, "dlco_no", "");
		rx.add ( record2, "pubc_dt", "");
		
		int gridData3 = rx.add(resData, "gridData3", "");
		int record3  = rx.add( gridData3 , "record" , "");
		
		rx.add ( record3, "medi_nm",  tmp_medi_nm);
		rx.add ( record3, "medi_cd",  tmp_medi_cd);
		rx.add ( record3, "proc_dt",  tmp_proc_dt);
		rx.add ( record3, "proc_seq", tmp_proc_seq);
		rx.add ( record3, "dlco_nm",  tmp_dlco_nm);
		rx.add ( record3, "advt_fee", tmp_advt_fee);
						
		int resForm = rx.add(resData, "resForm", "");
		rx.add( resForm , "dlco_nm" , ds.dlco_nm);
		rx.add( resForm , "dlco_no" , ds.dlco_cd);
		rx.add( resForm , "ern" , ds.ern);	
		rx.add( resForm , "presi_nm" , ds.presi_nm);	
		rx.add( resForm , "advt_fee" , advt_fee);	
		rx.add( resForm , "bef_tot_pubc_amt" , advt_fee);	
		rx.add( resForm , "aft_tot_pubc_amt" , "");	
		rx.add( resForm , "chk_cnt" , ds.chk_cnt);	
		rx.add( resForm , "suply_amt" , ds.suply_amt);	
		rx.add( resForm , "medi_cd" , ds.medi_cd);	
		rx.add( resForm , "medi_nm" , ds.medi_nm);	
		rx.add( resForm , "make_dt" , ds.make_dt);	
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>