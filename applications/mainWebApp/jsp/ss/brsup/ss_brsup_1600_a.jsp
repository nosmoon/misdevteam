<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1600_a.jsp
* ��� : ��������-Billing-����EDI��������
* �ۼ����� : 2004-03-06
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: ������
* ��������	: 2009-04-17
* ������ϸ�: ss_brsup_1600_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_EDI_INITDataSet ds = (SS_L_EDI_INITDataSet)request.getAttribute("ds");

    int moveListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    int moveListCount2 = 6;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = false;	// ���� ���� ����
    
    //String uid			= request.getHeader("UID")   		== null ? "" : Util.Uni2Ksc(request.getHeader("UID")); 		 	  // ���̵�
    String uid = session.getAttribute("uid").toString();
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "initData", "");
	rxw.makeDataToList(ds, "jycur", "areanm", "areacd", "��ü", "", codeData, "areaCombo"); // ó��
	
	rxw.add(codeData, "defaultDate", Util.getDate()); // �Է�����
	rxw.add(codeData, "loginUserID", uid); // �α��� ���� ���̵�
	
	/*//�μ�(��)��� ǥ��.
	//int comboTeam = rxw.add(codeData, "teamlist" , "");
	//writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	//��Ʈ ��� ǥ�� - �ӽ�
	//int comboPart = rxw.add(codeData, "partlist_temp" , "");
	//rxw.addSelectItem(comboPart, "record", "dept_nm", "dept_cd", "��ü", "");
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	
	//���� ��� ǥ��.
    //int comboArea = rxw.add(codeData, "arealist_temp" , "");
	//writeAreaOpt(session, rxw, comboArea, true);
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");*/
			
	rxw.flush(out);	
%>
