<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1910_l.jsp
* ��� : ����������-���
* �ۼ����� : 2015-02-27
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_SUSP_DEFDataSet ds = (SS_L_SUSP_DEFDataSet)request.getAttribute("ds");
        
    RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "dataTemp");
    
    rxw.makeDataToBulk(ds, "suspdefcur", resTemp, "listGrid");
    
	rxw.flush(out);
%>


