<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_5500_a.jsp
* ��� : Ȯ��������
* �ۼ����� : 2017-10-31
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_EXTN_5500_ADataSet ds = (SS_SLS_EXTN_5500_ADataSet)request.getAttribute("ds");
    
    applySession = true;	// ���� ���� ����
    
    String resPath = request.getParameter("res_path");
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;	
	int codeData = rxw.add(root, resPath, "");	
	
	rxw.add(codeData, "yymm", Util.getDate().substring(0,6)); // �Ⱓ ����
		
	rxw.makeDataToList(ds, "curextnaloncd", "cicdnm", "cicodeval", "��ü", "", codeData, "extnaloncdCombo"); // Ȯ����籸��
		
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");	
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
		
	rxw.flush(out);	
%>
