<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2010_l.jsp
* ��� : Ȯ����Ȳ-������Ȳ-��ȸ
* �ۼ����� : 2009-05-14
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ : 
* �������� :
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_EXTN_SUSPDataSet ds = (SS_L_EXTN_SUSPDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");

    // ��ȸ ���.
  	rxw.makeDataToBulk(ds, "susplist", resTemp, "infoGrid");
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>


