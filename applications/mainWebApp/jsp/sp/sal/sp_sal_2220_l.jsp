<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sal.rec.*
	,	chosun.ciis.sp.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SAL_2220_LDataSet ds = (SP_SAL_2220_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");

	try {
		if(ds.reg_clsf.equals("1")){
			/****** CURLIST BEGIN */
			int gridData2 = rx.add( resData , "gridData2" , "");
			for(int i = 0; i < ds.curlist.size(); i++) {
				SP_SAL_2220_LCURLISTRecord rec = (SP_SAL_2220_LCURLISTRecord)ds.curlist.get(i);
				int record = rx.add( gridData2 , "record" , "");	
				rx.add(record, "work_yymm", rec.work_yymm);
				rx.add(record, "seq", rec.seq);
				rx.add(record, "rcpm_dt", rec.rcpm_dt);
				rx.addCData(record, "purc_adjm_clsf_nm", rec.purc_adjm_clsf_nm);
				rx.addCData(record, "c_dlco_no", rec.c_dlco_no);
				rx.addCData(record, "c_dlco_nm", rec.c_dlco_nm);
				rx.addCData(record, "b_dlco_no", rec.b_dlco_no);
				rx.addCData(record, "b_dlco_nm", rec.b_dlco_nm);
				rx.add(record, "amt", rec.amt);
				rx.addCData(record, "rdr_nm", rec.rdr_nm);
				rx.addCData(record, "rdr_addr",rec.rdr_addr ); //rec.rdr_addr'
			}
			/****** CURLIST END */
		}else if(ds.reg_clsf.equals("2")){
			/****** CURLIST BEGIN */
			int gridData3 = rx.add( resData , "gridData3" , "");
			for(int i = 0; i < ds.curlist.size(); i++) {
				SP_SAL_2220_LCURLISTRecord rec = (SP_SAL_2220_LCURLISTRecord)ds.curlist.get(i);
				int record = rx.add( gridData3 , "record" , "");	
				rx.add(record, "work_yymm", rec.work_yymm);
				rx.add(record, "seq", rec.seq);
				rx.addCData(record, "rcpm_dt", rec.rcpm_dt);
				rx.addCData(record, "purc_adjm_clsf_nm", rec.purc_adjm_clsf_nm);
				rx.addCData(record, "c_dlco_no", rec.c_dlco_no);
				rx.addCData(record, "c_dlco_nm", rec.c_dlco_nm);
				rx.addCData(record, "b_dlco_no", rec.b_dlco_no);
				rx.addCData(record, "b_dlco_nm", rec.b_dlco_nm);
				rx.add(record, "amt", rec.amt);
				rx.addCData(record, "rdr_nm", rec.rdr_nm);
				rx.addCData(record, "rdr_addr", rec.rdr_addr);
			}
			/****** CURLIST END */
		}
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
