<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1850_l.jsp
* ��� : ��������-����-����������-����-���
* �ۼ����� : 2004-02-23
* �ۼ��� : �迵��
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-04
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RCPCMSBSDataSet ds = (SS_L_RCPCMSBSDataSet)request.getAttribute("ds");
    //int rcpcmsbsListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    int rcpcmsbsListCount = 5000;
    
  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", rcpcmsbsListCount);
	
	rxw.makeDataToBulk(ds, "curcommlist", resTemp, "listGrid");
	
	rxw.flush(out);
%>
