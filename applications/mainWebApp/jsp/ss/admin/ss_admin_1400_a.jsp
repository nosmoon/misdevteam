<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1400_a.jsp
* ��� : ������-�۾�-���-�ʱ�ȭ��
* �ۼ����� : 2004-04-09
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: ������
* ��������	: 2009-04-01
* ������ϸ�: ss_admin_1400_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_WRK_INITDataSet ds = (SS_L_WRK_INITDataSet)request.getAttribute("ds");
    int wrkListCount = 12;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;	// ���� ���� ����
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initTemp", "");
	
	//rxw.add(initData, "defaultDate", Util.getDate()); // ���ó�¥
	
	rxw.makeDataToList(ds, "curcommlist", "cicdnm", "cicodeval", "��ü", "", initData, "cycleCombo"); // ����
	rxw.makeDataToList(ds, "curcommlist", "cicdnm", "cicodeval", "��ü", "", initData, "cycleCombo1"); // ����
		
	rxw.flush(out);	
%>

