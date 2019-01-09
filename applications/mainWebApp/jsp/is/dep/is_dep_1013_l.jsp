<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.dep.rec.*
	,	chosun.ciis.is.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_DEP_1013_LDataSet ds = (IS_DEP_1013_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
//	int resData = rx.add(root, "resData", "");

	try {  
	

//차변:기타입금대체		
		int gridData5 = rx.add( root , "gridData5" , "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_DEP_1013_LCURLISTRecord rec = (IS_DEP_1013_LCURLISTRecord)ds.curlist.get(i);

			int record = rx.add(gridData5, "record", "");
			rx.add(record, "checked", "");
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "occr_amt", rec.occr_amt);
			rx.add(record, "rcpm_slip_no", rec.rcpm_slip_no);
			rx.add(record, "occr_dt", "");
			rx.add(record, "slip_clsf", "");
			rx.add(record, "seq", "");
			rx.add(record, "subseq", "");
//			rx.add(record, "rcpm_slip_no", rec.rcpm_slip_no);
//			rx.add(record, "occr_dt", rec.occr_dt);
//			rx.add(record, "slip_clsf", rec.slip_clsf);
//			rx.add(record, "seq", rec.seq);			
//			rx.add(record, "subseq", rec.subseq);	
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
