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
* ���ϸ� : se_boi_1092_m.jsp
* ��� : ������������-���ʹ�ǥ����-���ʹ�ǥ���� ��ȸ
* �ۼ����� : 2017-05-15
* �ۼ��� : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
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