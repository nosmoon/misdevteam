<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
  , chosun.ciis.co.base.util.*
	,	chosun.ciis.as.com.rec.*
	,	chosun.ciis.as.com.ds.*;
	"
%>

<%
	AS_COM_1000_SDataSet ds = (AS_COM_1000_SDataSet)request.getAttribute("ds");
  String strEncodeImage = "";
  strEncodeImage = ds.getEncodeimage();

  RwXml rx = new RwXml();
  int root = RwXml.rootNodeID;
	int dataSet = 0;
	int record = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		record = rx.add(dataSet, "phot_img", strEncodeImage, "type=\"xsd:base64Binary\"");
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
			<phot_img/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 05 19:15:02 KST 2009 */ %>