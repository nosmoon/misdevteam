<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2710_l.jsp
* ��� : ������� ���
* �ۼ����� : 2015-09-30
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_VACT_STATDataSet ds = (SS_S_VACT_STATDataSet)request.getAttribute("ds");
        
    RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");
    
    rxw.makeDataToBulk(ds, "currdrlist", resTemp, "detailGrid");    
    
	rxw.flush(out);
%>