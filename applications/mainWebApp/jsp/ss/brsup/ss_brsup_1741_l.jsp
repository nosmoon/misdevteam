<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1741_l.jsp
* ��� : ������������-Billing�ڵ���ü-��û����-��û���
* �ۼ����� : 2004-03-26
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-16
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>

<%
    SS_L_APLC_SSUMDataSet ds = (SS_L_APLC_SSUMDataSet)request.getAttribute("ds");
    int moveListCount = 5000;	// �� ȭ��� ����Ʈ �׸� �� 19 -> 5000
    
  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.makeDataToBulk(ds, "rsltcur", resTemp, "aplcSumGrid");
	
	int naviInfo = rxw.add(resTemp, "naviInfo", "");
	rxw.add(naviInfo, "pageno", request.getParameter("pageno"));
	rxw.add(naviInfo, "totalcnt", ds.getTotalcnt());
	rxw.add(naviInfo, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(naviInfo, "pagesize", moveListCount);
	
	rxw.flush(out);
%>
