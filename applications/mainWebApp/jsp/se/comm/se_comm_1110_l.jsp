<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.comm.rec.*
	,	chosun.ciis.se.comm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SE_COMM_1110_LDataSet ds = (SE_COMM_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	dataSet = rx.add(root, "gridData", "");

	try {

		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_COMM_1110_LCURLISTRecord rec = (SE_COMM_1110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_cdseq", rec.bo_cd+rec.bo_seq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "chrg_flnm", rec.chrg_flnm);
			rx.add(record, "bo_tel_no", rec.bo_telno);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "area_cd", rec.area_cd);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "supr_dept_cd", rec.supr_dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
		}

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
