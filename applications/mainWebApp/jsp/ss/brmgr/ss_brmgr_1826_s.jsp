<%@ page contentType="text/xml;charset=euc-kr"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : ss_brmgr_1826_s.jsp
* ��� 		 : ���� �����ȣ �˻��� ���� ��ȸ�� ���
* �ۼ����� 	 : 2004-03-05
* �ۼ��� 	 : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-10
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>

<%
    // getting dataset
    SS_L_ADDR_TO_APTDataSet ds = (SS_L_ADDR_TO_APTDataSet)request.getAttribute("ds");  // request dataset
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeDataToBulk(ds, "curcommlist", root, "gridZip");
	
	rxw.flush(out);

%>
