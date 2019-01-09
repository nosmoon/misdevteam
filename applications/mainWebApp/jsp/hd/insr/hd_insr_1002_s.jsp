<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	HD_INFO_1002_SDataSet ds	= (HD_INFO_1002_SDataSet)request.getAttribute("ds");
	String strEncodeImage = "";
	strEncodeImage = ds.getEncodeimage();
	
//	byte[] bytearray = ds.getImage();
//	String strbase64encode = "";
//	strbase64encode = Base64Util.base64Encode(bytearray);
//	out.write(strbase64encode);
	
	RwXml rx = new RwXml();
//	HD_INFO_1001_LDataSet ds = (HD_INFO_1001_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempForm = 0;
	int recordSet = 0;

	try {
		int photo = rx.add(root, "resPhoto", strEncodeImage, "type=\"xsd:base64Binary\"");
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
//	<newElement type="xsd:base64Binary">
//	response.reset();
//	response.setContentType("image/gif");
	
//	ServletOutputStream sout = response.getOutputStream();	
	
//	if(sout != null) {
//		sout.write(bytearray,0,bytearray.length-1);
//	} else {
//		out.println("../../images/knowbrd/organ_noimg.gif");
//	}
//	System.out.println("#############################################");
	
//	System.out.println("#############################################");
//	sout.close();
%>