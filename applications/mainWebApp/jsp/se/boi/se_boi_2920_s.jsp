<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.boi.ds.*
	,	chosun.ciis.se.boi.rec.*
	,	chosun.ciis.co.lib.xi.RwXmlWrapper;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_boi_2910_l.jsp
* ��� : ��������뺸
* �ۼ����� : 2016-11-02
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	SE_BOI_2920_SDataSet ds = (SE_BOI_2920_SDataSet)request.getAttribute("ds");
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.makeParentNode(root, "resTemp");
	
	rxw.makeDataToBulk(ds, "curlist", resTemp, "gridData3");
		
	rxw.flush(out);
%>
