<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_4310_l.jsp
* ��� : Ȯ�����-�������˵��ڰ���-�ش絶�ڷϸ��
* �ۼ����� : 2015-12-03
* �ۼ��� : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	System.out.println("ss_extn_4310_l.jsp");
	SS_L_MO_SVY_RDRDataSet ds = (SS_L_MO_SVY_RDRDataSet)request.getAttribute("ds");
        
    RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "dataTemp");
    
    rxw.makeDataToBulk(ds, "rdrlist", resTemp, "listGrid");
    
	rxw.flush(out);
%>



