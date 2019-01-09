<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.etccar.rec.*
	,	chosun.ciis.mt.etccar.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCCAR_1003_LDataSet ds = (MT_ETCCAR_1003_LDataSet)request.getAttribute("ds");
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
			MT_ETCCAR_1003_LCURLISTRecord rec = (MT_ETCCAR_1003_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "use_usag", StringUtil.replaceToXml(rec.use_usag));
			rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "use_usag", rec.use_usag);
			//rx.add(record, "cd_nm", rec.cd_nm);
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
<mt_etccar_1003_l>
	<dataSet>
		<CURLIST>
			<record>
				<use_usag/>
				<cd_nm/>
			</record>
		</CURLIST>
	</dataSet>
</mt_etccar_1003_l>
*/
%>

<% /* 작성시간 : Mon Jul 06 13:42:08 KST 2009 */ %>