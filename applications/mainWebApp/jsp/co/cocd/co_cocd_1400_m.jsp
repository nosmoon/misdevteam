<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.cocd.rec.*
	,	chosun.ciis.co.cocd.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : co_cocd_1450_m.jsp
* ��� : ���α��ڵ��˾�-�ʱ�ȭ��
* �ۼ����� : 2012-01-10
* �ۼ��� : �ӽº�
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	CO_COCD_1400_MDataSet ds = (CO_COCD_1400_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		rx.add(tempData, "title", ds.title);
		rx.add(tempData, "bis_cd", ds.bis_cd);	
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
