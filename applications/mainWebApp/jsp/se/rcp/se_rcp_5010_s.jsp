<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.rcp.rec.*
	,	chosun.ciis.se.rcp.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_rcp_5000_m.jsp
* ��� :  �Ǹ� - �Աݰ��� - �������� - ���Աݸ���
* �ۼ����� : 2009-05-20
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx 				= new RwXml();
	SE_RCP_5010_SDataSet ds = (SE_RCP_5010_SDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;

	try {
		formData			= rx.add(root, "closInfo", "");
		rx.add(formData, "clos_yn"	, ds.clos_yn	);
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<resform>
		<clos_yn/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Wed Apr 01 10:01:41 KST 2009 */ %>