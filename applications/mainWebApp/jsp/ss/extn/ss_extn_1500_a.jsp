<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1500_a.jsp
* ��� : Ȯ����Ȳ-Ȯ��뿪���-(����IS)-�ʱ�ȭ��
* �ۼ����� : 2003-12-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: ������
* ��������	: 2009-03-18
* ������ϸ�: ss_extn_1500_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_EXTN_SERVCLOS_INITDataSet ds = (SS_L_RDR_EXTN_SERVCLOS_INITDataSet)request.getAttribute("ds");
	//int servListCount = 20;
    //int mediListCount = 13;
    int servListCount = 5000;
    int mediListCount = 5000;
	String paramGbn = "##";
    applySession = true;	// ���� ���� ����
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initTemp", "");
	
	rxw.add(initData, "defalutDate", Util.getDate());
	rxw.makeDataToList(ds, "curmedicd", "cicdnm", "cicodeval", "����", "", initData, "mcCombo"); // ��ü
	rxw.makeDataToList(ds, "curdeptcd", "boksnm", "deptcd", "����", "", initData, "deptCombo"); // �μ�
	
	rxw.flush(out);
%>
