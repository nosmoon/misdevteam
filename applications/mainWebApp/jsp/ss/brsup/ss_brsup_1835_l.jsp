<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1835_l.jsp
* ��� : ��������-����-����������-����-���
* �ۼ����� : 2004-03-09
* �ۼ��� : �迵��
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-12
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RECPCOMSCLOSDataSet ds = (SS_L_RECPCOMSCLOSDataSet)request.getAttribute("ds");
	//int slsListCount = 20;
	int slsListCount = 5000;
	
	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", ""); 

	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", slsListCount);
	rxw.add(resTemp, "totalcnt_f", Util.comma(ds.getTotalcnt()));

	rxw.makeDataToBulk(ds, "curcommlist", resTemp, "listGrid");
	//System.out.println(rxw.getXml());
	rxw.flush(out);
%>
