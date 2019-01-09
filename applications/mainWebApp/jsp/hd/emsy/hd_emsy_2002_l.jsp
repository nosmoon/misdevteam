<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.emsy.rec.*
	,	chosun.ciis.hd.emsy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EMSY_2002_LDataSet ds = (HD_EMSY_2002_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		int record = rx.add(recordSet, "record", "");
		rx.add(record, "ov_saly_clos_yn", ds.saly_clos_yn);
		

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
<hd_emsy_2002_l>
	<dataSet>
		<CURLIST>
			<record>
				<ov_saly_clos_yn/>
			</record>
		</CURLIST>
	</dataSet>
</hd_emsy_2002_l>
*/
%>

<% /* 작성시간 : Mon Oct 11 17:34:13 KST 2010 */ %>