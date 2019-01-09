<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.submatrcla.rec.*
	,	chosun.ciis.mt.submatrcla.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATRCLA_2004_LDataSet ds = (MT_SUBMATRCLA_2004_LDataSet)request.getAttribute("ds");
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
			MT_SUBMATRCLA_2004_LCURLISTRecord rec = (MT_SUBMATRCLA_2004_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
			rx.add(record, "std_modl", StringUtil.replaceToXml(rec.std_modl));
			rx.add(record, "purc_uprc", StringUtil.replaceToXml(rec.purc_uprc));
			rx.add(record, "unit", StringUtil.replaceToXml(rec.unit));
			//rx.add(record, "matr_nm", rec.matr_nm);
			//rx.add(record, "std_modl", rec.std_modl);
			//rx.add(record, "purc_uprc", rec.purc_uprc);
			//rx.add(record, "unit", rec.unit);
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
<mt_submatrcla_2004_l>
	<dataSet>
		<CURLIST>
			<record>
				<matr_nm/>
				<std_modl/>
				<purc_uprc/>
				<unit/>
			</record>
		</CURLIST>
	</dataSet>
</mt_submatrcla_2004_l>
*/
%>

<% /* 작성시간 : Wed Jul 08 20:48:59 KST 2009 */ %>