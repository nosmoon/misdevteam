<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_2503_p.jsp
* ��� : �������������ý���-���˹������Ȳ-����ȸȭ��-���Ĺ�� �˾�
* �ۼ����� : 2009-05-19
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    applySession = true;		// ���� ���� ����
    
    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // ȸ���ڵ�
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    int codeData = rxw.add(root, "codeData", "");
    
    rxw.add(codeData, "inoutdt", Util.getDate()); // ����
 	    
    rxw.add(codeData, "applySession", String.valueOf(applySession));
    
    rxw.flush(out);
%> 