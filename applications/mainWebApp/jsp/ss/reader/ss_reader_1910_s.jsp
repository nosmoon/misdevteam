<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1910_s.jsp
* ��� : ������Ȳ-��۵��ڰ��� ��
* �ۼ����� : 2015-06-18
* �ۼ��� : �弱��
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_POSTDLVRDRDataSet ds = (SS_S_POSTDLVRDRDataSet)request.getAttribute("ds");
	
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	

	rxw.makeDataToBulk(ds, resTemp, "detailData");
		
	rxw.flush(out);
	
%>

