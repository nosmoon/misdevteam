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
	MT_SUBMATROUT_1150_LDataSet ds = (MT_SUBMATROUT_1150_LDataSet)request.getAttribute("ds");
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
			MT_SUBMATROUT_1150_LCURLISTRecord rec = (MT_SUBMATROUT_1150_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "owh_dt", rec.owh_dt);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "unit", rec.unit);
			rx.add(record, "std_modl", rec.std_modl);
			rx.add(record, "curdd_ewh_qunt", "0");
			rx.add(record, "plan_dt", "");
			rx.add(record, "plan_yn", "");
			//rx.add(record, "tmp_dt", StringUtil.replaceToXml(rec.tmp_dt));
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
			//rx.add(record, "unit", StringUtil.replaceToXml(rec.unit));
			//rx.add(record, "std_modl", StringUtil.replaceToXml(rec.std_modl));
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
<mt_submatrout_1150_l>
	<dataSet>
		<CURLIST>
			<record>
				<tmp_dt/>
				<matr_cd/>
				<matr_nm/>
				<unit/>
				<std_modl/>
			</record>
		</CURLIST>
	</dataSet>
</mt_submatrout_1150_l>
*/
%>

<% /* 작성시간 : Mon Nov 02 09:33:17 KST 2009 */ %>