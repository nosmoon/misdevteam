<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_2810_l.jsp
* ��� : ��������-������Ȳ-�������-13��������
* �ۼ����� : 2016-05-03
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>

<%
	SS_SLS_BRSUP_2810_LDataSet ds = (SS_SLS_BRSUP_2810_LDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
	
	// ��ȸ ���.
  	rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "listGrid");
  	rxw.add(acctTemp, "t_caption", ds.getCaption());
	    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
