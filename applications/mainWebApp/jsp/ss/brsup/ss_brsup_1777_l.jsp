<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1777_l.jsp
* ��� : ������������-Billing�ڵ���ü-û������-������ û�����
* �ۼ����� : 2004-04-17
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����
* ������	: ����
* ��������	: 2009-03-09
* ������ϸ�: ss_brsup_1777_s.jsp.bak
---------------------------------------------------------------------------------------------------%>

<%
	SS_L_SHFT_CLAMDataSet ds = (SS_L_SHFT_CLAMDataSet)request.getAttribute("ds");
    //int moveListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    int moveListCount = 5000;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int tempData = rxw.add(root, "tempData", "");
	
	rxw.add(tempData, "totalcnt", ds.getTotalcnt());
	rxw.add(tempData, "pageno", request.getParameter("pageno"));
	rxw.add(tempData, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(tempData, "pagesize", moveListCount);
	rxw.add(tempData, "page_set_gubun", 0);
		
	rxw.makeDataToBulk(ds, "rsltcur", tempData, "ChargeListgrid");
	rxw.flush(out);
	
%>
