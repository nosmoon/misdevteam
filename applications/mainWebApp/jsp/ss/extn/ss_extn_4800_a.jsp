<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_4800_a.jsp
* ��� : ����Ŀ�Ȯ��-�����������
* �ۼ����� : 2016-05-26
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_EXTN_4800_ADataSet ds = (SS_SLS_EXTN_4800_ADataSet)request.getAttribute("ds");
    
    applySession = true;	// ���� ���� ����
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;	
	int codeData = rxw.add(root, "codeData", "");	
	
	rxw.add(codeData, "fryymm", Util.getDate().substring(0,6)); // �Ⱓ ����
	rxw.add(codeData, "toyymm", Util.getDate().substring(0,6)); // �Ⱓ ��	
	
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");	
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");

	rxw.flush(out);	
%>
