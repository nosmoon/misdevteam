<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1885_l.jsp
* ��� : ��������-����-���μ�����Ȳ-�����ȸ
* �ۼ����� : 2007-03-22
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-02-27
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_GIRORECP_LISTDataSet ds = (SS_L_GIRORECP_LISTDataSet)request.getAttribute("ds");
    //int rcpListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    int rcpListCount = 5000;
    
  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", rcpListCount);
	
	rxw.makeDataToBulk(ds, resTemp, "summary");
	
	rxw.makeDataToBulk(ds, "rsltcur", resTemp, "listGrid");
	
	rxw.flush(out);
%>
