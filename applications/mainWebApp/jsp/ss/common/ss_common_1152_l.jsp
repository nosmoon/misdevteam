<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : ss_common_1152_l.jsp
* ��� 		 : ���� �����ȣ �˻� (�����ȣ �Է� ���� �˻�)
* �ۼ����� 	 : 2004-03-05
* �ۼ��� 	 : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 : TrustForm ����
* ������ 	 : Ȳ����
* �������� 	 : 2009-02-11
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	CO_L_ZIPDataSet ds = (CO_L_ZIPDataSet)request.getAttribute("ds");
    CO_L_ZIPCURCOMMLISTRecord rec = null;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeDataToBulk(ds, "curcommlist", root, "zipGrid");
	
	rxw.flush(out);

%>







