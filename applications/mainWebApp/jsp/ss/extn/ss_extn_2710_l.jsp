<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2710_l.jsp
* ��� : Ȯ��-������� ����
* �ۼ����� : 2013-3-6
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>

<%
	SS_L_EMP_NWSPRDRDataSet ds = (SS_L_EMP_NWSPRDRDataSet)request.getAttribute("ds");
        
    RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");
    
    rxw.makeDataToBulk(ds, "curempnwsplist", resTemp, "listGrid");
    
	rxw.flush(out);
%>