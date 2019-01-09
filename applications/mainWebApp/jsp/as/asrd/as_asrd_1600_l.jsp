<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.asrd.rec.*
	,	chosun.ciis.as.asrd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_ASRD_1600_LDataSet ds = (AS_ASRD_1600_LDataSet)request.getAttribute("ds");
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
			AS_ASRD_1600_LCURLISTRecord rec = (AS_ASRD_1600_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			rx.add(record, "aset_no", StringUtil.replaceToXml(rec.aset_no));
			rx.addCData(record, "aset_nm", StringUtil.replaceToXml(rec.aset_nm));
			//rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//rx.add(record, "aset_no", rec.aset_no);
			//rx.add(record, "aset_nm", rec.aset_nm);
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
<as_asrd_1600_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<aset_no/>
				<aset_nm/>
			</record>
		</CURLIST>
	</dataSet>
</as_asrd_1600_l>
*/
%>

<% /* 작성시간 : Wed Jul 08 11:04:36 KST 2009 */ %>