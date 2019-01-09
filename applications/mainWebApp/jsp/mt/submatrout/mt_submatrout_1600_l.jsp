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
	MT_SUBMATROUT_1600_LDataSet ds = (MT_SUBMATROUT_1600_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_SUBMATROUT_1600_LCURLISTRecord rec = (MT_SUBMATROUT_1600_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "owh_dt", StringUtil.replaceToXml(rec.owh_dt));
			rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			rx.add(record, "fac_clsf_nm", StringUtil.replaceToXml(rec.fac_clsf_nm));
			rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
			rx.add(record, "owh_qunt", StringUtil.replaceToXml(rec.owh_qunt));
			rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "owh_dt", rec.owh_dt);
			//rx.add(record, "fac_clsf", rec.fac_clsf);
			//rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			//rx.add(record, "matr_cd", rec.matr_cd);
			//rx.add(record, "matr_nm", rec.matr_nm);
			//rx.add(record, "owh_qunt", rec.owh_qunt);
			//rx.add(record, "occr_dt", rec.occr_dt);
			//rx.add(record, "seq", rec.seq);
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
<mt_submatrout_1600_l>
	<dataSet>
		<CURLIST>
			<record>
				<owh_dt/>
				<fac_clsf/>
				<fac_clsf_nm/>
				<matr_cd/>
				<matr_nm/>
				<owh_qunt/>
				<occr_dt/>
				<seq/>
			</record>
		</CURLIST>
	</dataSet>
</mt_submatrout_1600_l>
*/
%>

<% /* 작성시간 : Mon Sep 21 20:28:33 KST 2009 */ %>