<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_5700_a.jsp
* ��� : Ȯ�����-���ⱸ����-�ʱ�
* �ۼ����� : 2018-01-10
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_EXTN_5700_ADataSet ds = (SS_SLS_EXTN_5700_ADataSet)request.getAttribute("ds");
    
    applySession = true;	// ���� ���� ����
    
    String resPath = request.getParameter("res_path");
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;	
	int codeData = rxw.add(root, resPath, "");	
	
	rxw.add(codeData, "fromDate", Util.getDate()); // �Ⱓ ����
	rxw.add(codeData, "toDate", Util.getDate()); // �Ⱓ ��	

	rxw.makeDataToList(ds, "cursubscnfmstatcd", "cicdnm", "cicodeval", "��ü", "", codeData, "errorCombo"); // ����
		
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");	
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");

	rxw.flush(out);	
%>
