<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1769_l.jsp
* ��� : ������������-Billing�ڵ���ü-�����ڰ���-�ű�/�������� �����ȸ
* �ۼ����� : 2004-04-12
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-09
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>

<%
    SS_L_APLC_IIDataSet ds = (SS_L_APLC_IIDataSet)request.getAttribute("ds");
    //int moveListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    int moveListCount = 5000;

    String tempStr = "�ű�";
    if("20".equals(request.getParameter("aplcclsf"))) tempStr = "����";
    
  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", moveListCount);
	
	rxw.makeDataToBulk(ds, "rsltcur", resTemp, "aplcGrid");
	
	rxw.flush(out);
%>
