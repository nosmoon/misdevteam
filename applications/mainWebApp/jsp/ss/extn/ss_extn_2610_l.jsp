<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2610_a.jsp
* ��� : Ȯ����Ȳ-��ŸȮ��-����������
* �ۼ����� : 2013-1-28
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ : 
* �������� :
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_YEARLY_SUBSDataSet ds = (SS_L_YEARLY_SUBSDataSet)request.getAttribute("ds");
   
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");

    // ��ȸ ���.
  	rxw.makeDataToBulk(ds, "curcommlist", resTemp, "listGrid");
    
  	rxw.add(resTemp, "selcnt", ds.getSelcnt());
	rxw.add(resTemp, "usecnt", ds.getUsecnt());
  	
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>


