<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_2010_l.jsp
* ��� : ������� ��ȸ
* �ۼ����� : 2015-10-12
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RDR_DSCTSTATDataSet ds = (SS_L_RDR_DSCTSTATDataSet)request.getAttribute("ds");
        
    RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");
    
    rxw.makeDataToBulk(ds, "curbolist", resTemp, "listGrid1");
    rxw.makeDataToBulk(ds, "curdtlist", resTemp, "listGrid2");
    rxw.makeDataToBulk(ds, "curcnfmlist", resTemp, "listGrid3");
    
	rxw.flush(out);
%>