<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_2504_p.jsp
* ��� : ��������-������Ȳ-���˹������Ȳ ��������� �˾�
* �ۼ����� : 2009-06-19
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_I_BNSITEMTOTALOUT_INITDataSet ds = (SS_I_BNSITEMTOTALOUT_INITDataSet)request.getAttribute("ds");
    applySession = true;		// ���� ���� ����
    
    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // ȸ���ڵ�
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    int codeData = rxw.add(root, "codeData", "");
    
    rxw.add(codeData, "send_qty", ds.send_qty); //������(��������)
    rxw.add(codeData, "owh_dt", Util.getDate()); // ������� 
 	    
    rxw.add(codeData, "applySession", String.valueOf(applySession));
    
    rxw.flush(out);
%> 