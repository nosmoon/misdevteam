<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.dep.rec.*
	,	chosun.ciis.sp.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_DEP_1012_LDataSet ds = (SP_DEP_1012_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
//	int resData = rx.add(root, "resData", "");

	try {  

//차변:예수금대체		
		int gridData4 = rx.add( root , "gridData4" , "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SP_DEP_1012_LCURLISTRecord rec = (SP_DEP_1012_LCURLISTRecord)ds.curlist.get(i);
 
// 			amt = StringUtil.toLong(rec.occr_amt)-StringUtil.toLong(rec.extnc_amt);
 
			int record = rx.add(gridData4, "record", "");
			rx.add(record, "checked", ""); 
			rx.add(record, "swit_dlco", rec.occr_dlco_cd);
			rx.add(record, "swit_dlco_nm", rec.occr_dlco_nm);
			rx.add(record, "amt", StringUtil.toLong(rec.occr_amt)-StringUtil.toLong(rec.extnc_amt));
			rx.add(record, "rcpm_slip_no", rec.occr_slip);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "slip_clsf", rec.slip_clsf);
			rx.add(record, "seq", rec.seq);			
			rx.add(record, "subseq", rec.subseq);
			rx.add(record, "budg_cd", rec.budg_cd);	  
		}	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
