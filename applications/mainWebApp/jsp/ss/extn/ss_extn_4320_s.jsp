<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_4320_s.jsp
* ��� : Ȯ�����-�������˵��ڰ���-������ϸ��
* �ۼ����� : 2015-12-04
* �ۼ��� : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
System.out.println("======ss_extn_4320_s.jsp======");
	SS_S_MO_SVY_RDRDataSet ds = (SS_S_MO_SVY_RDRDataSet)request.getAttribute("ds");
	
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.makeDataToBulk(ds, "resplist", resTemp, "listGrid");
	
	rxw.flush(out);

%>

