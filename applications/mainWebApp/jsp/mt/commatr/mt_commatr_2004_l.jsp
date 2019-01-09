<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.commatr.rec.*
	,	chosun.ciis.mt.commatr.ds.*
    ,   chosun.ciis.co.base.util.StringUtil;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_COMMATR_2004_LDataSet ds = (MT_COMMATR_2004_LDataSet)request.getAttribute("ds");
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
			MT_COMMATR_2004_LCURLISTRecord rec = (MT_COMMATR_2004_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "uprc_meda_dt", rec.uprc_meda_dt);
			rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "dlco_eps_no", StringUtil.replaceToXml(rec.dlco_eps_no));
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "setl_cond", rec.setl_cond);
			rx.add(record, "purc_uprc", rec.purc_uprc);
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
<dataSet>
	<CURLIST>
		<record>
			<uprc_meda_dt/>
			<matr_cd/>
			<matr_nm/>
			<dlco_eps_no/>
			<dlco_nm/>
			<setl_cond/>
			<purc_uprc/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Mar 23 19:32:36 KST 2009 */ %>