<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_5800_a.jsp
* ��� : �۾����Ʈ - �ʱ�ȭ��
* �ۼ����� : 2018-02-09
* �ۼ��� : �α�ȫ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ : 
* �������� :
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_EXTN_5800_ADataSet ds = (SS_SLS_EXTN_5800_ADataSet)request.getAttribute("ds");
	
	applySession = true;	// ���� ���� ����
	
	String resPath = request.getParameter("res_path"); //TrustForm ó�� ����
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;	
	int codeData = rxw.add(root, resPath, "");	
	
	rxw.add(codeData, "fromDate", Util.getDate()); // �Ⱓ ����
	rxw.add(codeData, "toDate", Util.getDate()); // �Ⱓ ��	
	
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");	
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	rxw.makeDataToBulk(ds, "errlist", codeData, "errlist");
	
	rxw.flush(out);
%>