<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2300_a.jsp
* ��� : Ȯ����Ȳ-���Ȯ�������Ȳ-�ʱ�ȭ��
* �ۼ����� : 2012-2-10
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>

<%
	SS_L_EXTN_RDR_STATS_INITDataSet ds = (SS_L_EXTN_RDR_STATS_INITDataSet)request.getAttribute("ds");
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "fromDate", Util.getDate()); // �Ⱓ ����
	rxw.add(codeData, "toDate", Util.getDate()); // �Ⱓ ��
	rxw.add(codeData, "fixDate", "20140101"); // �Ⱓ ��
	
	rxw.makeDataToBulk(ds, "curcmpylist", codeData, "teamlist");
	
	rxw.makeDataToBulk(ds, "curoffilist", codeData, "partlist_temp");
	
	rxw.makeDataToBulk(ds, "curdeptlist", codeData, "arealist_temp");
	
	//rxw.makeDataToList(ds, "curcmpylist", "cmpynm", "cmpycd", "��ü", "", codeData, "cmpylist");//ó��
	
	//rxw.makeDataToList(ds, "curoffilist", "offinm", "officd", "��ü", "", codeData, "offilist");//ó��	

	//rxw.makeDataToList(ds, "curdeptlist", "deptnm", "deptcd", "��ü", "", codeData, "deptlist");//ó��
	
	rxw.flush(out);	
%>
