<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_4330_l.jsp
* ��� : Ȯ�����-�������˵��ڰ���-�ش絶�����丮��Ʈ
* �ۼ����� : 2015-12-07
* �ۼ��� : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	System.out.println("ss_extn_4330_l.jsp");
	SS_L_MO_SVY_RESPDataSet ds = (SS_L_MO_SVY_RESPDataSet)request.getAttribute("ds");
        
    RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int respTemp = rxw.makeParentNode(root, "dataTemp");
    
    rxw.makeDataToBulk(ds, "resplist", respTemp, "listGrid");
    
	rxw.flush(out);
%>



