<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_4900_a.jsp
* ��� : ����Ŀ�Ȯ��-���Ȯ�� �����Է�
* �ۼ����� : 2016-02-15
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_EXTN_4900_ADataSet ds = (SS_SLS_EXTN_4900_ADataSet)request.getAttribute("ds");
    
    applySession = true;	// ���� ���� ����
    
    String resPath = request.getParameter("res_path");
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;	
	int codeData = rxw.add(root, resPath, "");	
	
	rxw.makeDataToList(ds, "curdncomp", "cicdnm", "cicodeval", "��ü", "", codeData, "dncompCombo"); // �볳���

	rxw.flush(out);	
%>
