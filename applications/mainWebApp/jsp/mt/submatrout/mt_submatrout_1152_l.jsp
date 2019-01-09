<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.submatrout.rec.*
	,	chosun.ciis.mt.submatrout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATROUT_1152_LDataSet ds = (MT_SUBMATROUT_1152_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_SUBMATROUT_1152_LCURLISTRecord rec = (MT_SUBMATROUT_1152_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "owh_dt", rec.owh_dt);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "unit", rec.unit);
			rx.add(record, "std_modl", rec.std_modl);
			rx.add(record, "curdd_ewh_qunt", rec.curdd_ewh_qunt);
			rx.add(record, "stmt_dt", rec.stmt_dt);
			rx.add(record, "stmt_yn", rec.stmt_yn);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			//rx.add(record, "owh_dt", StringUtil.replaceToXml(rec.owh_dt));
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
			//rx.add(record, "unit", StringUtil.replaceToXml(rec.unit));
			//rx.add(record, "std_modl", StringUtil.replaceToXml(rec.std_modl));
			//rx.add(record, "curdd_ewh_qunt", StringUtil.replaceToXml(rec.curdd_ewh_qunt));
			//rx.add(record, "stmt_dt", StringUtil.replaceToXml(rec.stmt_dt));
			//rx.add(record, "stmt_yn", StringUtil.replaceToXml(rec.stmt_yn));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_submatrout_1152_l>
	<dataSet>
		<CURLIST>
			<record>
				<owh_dt/>
				<matr_cd/>
				<matr_nm/>
				<unit/>
				<std_modl/>
				<curdd_ewh_qunt/>
				<stmt_dt/>
				<stmt_yn/>
				<occr_dt/>
				<seq/>
			</record>
		</CURLIST>
	</dataSet>
</mt_submatrout_1152_l>
*/
%>

<% /* 작성시간 : Tue Nov 03 14:54:11 KST 2009 */ %>