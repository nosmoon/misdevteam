<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_move_1010_l.jsp
* ��� : �̸����-�̸�TMȮ��
* �ۼ����� : 2013-5-8
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>

<%
	SS_L_CAMP_TM_EXTNDataSet ds = (SS_L_CAMP_TM_EXTNDataSet)request.getAttribute("ds");
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.makeParentNode(root, "resTemp");
	
	// ��ȸ ���.
	rxw.makeDataToBulk(ds, "curcommlist", resTemp, "listGrid");
    
	rxw.flush(out);
%>