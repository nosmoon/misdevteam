<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_3310_l.jsp
* ��� : Ȯ�����-�������˵��ڰ���-������ϸ��
* �ۼ����� : 2015-11-11
* �ۼ��� : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	System.out.println("ss_extn_3310_l.jsp");
	SS_L_MO_SVYDataSet ds = (SS_L_MO_SVYDataSet)request.getAttribute("ds");
        
    RwXmlWrapper2 rxw = new RwXmlWrapper2();
    
    int root = RwXmlWrapper2.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "dataTemp");
    
    rxw.makeDataToBulk(ds, "svycur", resTemp, "listGrid");
    
	rxw.flush(out);
%>



