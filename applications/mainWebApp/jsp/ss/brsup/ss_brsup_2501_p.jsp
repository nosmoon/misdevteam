<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_2501_p.jsp
* ��� : �������������ý���-���˹������Ȳ-����ȸȭ��-�԰��߰� �˾�
* �ۼ����� : 2009-05-06
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_POPINBNSITEMINOUT_INITDataSet ds = (SS_L_POPINBNSITEMINOUT_INITDataSet)request.getAttribute("ds");    
	
    applySession = true;		// ���� ���� ����
    
    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // ȸ���ڵ�
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    int codeData = rxw.add(root, "codeData", "");
    
    rxw.add(codeData, "inoutdt", Util.getDate()); // ����
 	    
    rxw.add(codeData, "applySession", String.valueOf(applySession));

    rxw.makeDataToList(ds, "popinlist", "cicdnm", "cicodeval", codeData, "inwareCombo");//�԰�â��
    rxw.flush(out);
%> 