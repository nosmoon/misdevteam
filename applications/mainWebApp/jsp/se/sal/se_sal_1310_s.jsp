<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.sal.rec.*
	,	chosun.ciis.se.sal.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_sal_1310_s.jsp
* ��� :   �Ǹ� - ������� - ������� - ������ ������� ����
* �ۼ����� : 2009-04-01
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
	SE_SAL_1310_SDataSet ds = (SE_SAL_1310_SDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;

	try {
		formData			= rx.add(root, "closInfo", "");
		rx.add(formData, "clos_yn"	, ds.clos_yn	);
		rx.add(formData, "chrg_pers", ds.chrg_pers	);
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