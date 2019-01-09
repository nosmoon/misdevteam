<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
  	, chosun.ciis.co.base.util.*
	,	chosun.ciis.co.dlco.rec.*
	,	chosun.ciis.co.dlco.ds.*;
	"
%>

<%
	CO_DLCO_1015_LDataSet ds = (CO_DLCO_1015_LDataSet)request.getAttribute("ds");
	String strEncodeImage = "";
	strEncodeImage = ds.getEncodeimage();
		
	RwXml rx = new RwXml();
  	int root = RwXml.rootNodeID;
	int resPhoto = 0;
	int record = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	resPhoto = rx.add(root, "resPhoto", "");
	try {
		 record = rx.add(resPhoto, "phot_img", 	strEncodeImage, 		  "type=\"xsd:base64Binary\""); 
	}catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(resPhoto, "errcode", errcode);
		rx.add(resPhoto, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>