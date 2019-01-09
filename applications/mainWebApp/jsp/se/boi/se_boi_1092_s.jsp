<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.se.boi.ds.*
	,	chosun.ciis.se.boi.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_boi_1092_m.jsp
* 기능 : 센터정보관리-센터대표정보-센터대표사진 조회
* 작성일자 : 2017-05-15
* 작성자 : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SE_BOI_1092_SDataSet ds	= (SE_BOI_1092_SDataSet)request.getAttribute("ds");
	String strEncodeImage = "";
	strEncodeImage = ds.getEncodeimage();

	RwXml rx = new RwXml();
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
%>