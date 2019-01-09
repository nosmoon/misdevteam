<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.se.ang.rec.*
	,	chosun.ciis.se.ang.ds.*
	,	org.json.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SE_ANG_1030_UDataSet ds = (SE_ANG_1030_UDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
	}
	catch (Exception e) {
		//errcode += " JSP Error";
		//errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		//-----------------------------------------
		// *����: ������ XML ��ü��  �������� ����� ����
		//-----------------------------------------
		//out.println(rx.xmlFlush());
		//out.println(rx.xmlEndFlush());


		//-----------------------------------------
		// *�ű�: ������ XML�� JSON���·� ��ȯ�Ͽ� ������
		//-----------------------------------------
		JSONObject obj = XML.toJSONObject(rx.getXml());
		out.println(obj.toString());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* �ۼ��ð� : Tue Sep 19 18:00:08 KST 2017 */ %>