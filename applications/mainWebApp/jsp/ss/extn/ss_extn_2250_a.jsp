<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2250_a.jsp
* ��� : Ȯ����Ȳ-������������-�ʱ�ȭ��
* �ۼ����� : 2009-07-10
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	:
* ������	: 
* ��������	:
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_TASLM_BOSUSPCLOS_INITDataSet ds = (SS_L_TASLM_BOSUSPCLOS_INITDataSet)request.getAttribute("ds");
	int extnmovmListCount = 10;

	String frdt = request.getParameter("frdt");
	
    applySession = true;	// ���� ���� ����

	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));

	if(frdt.equals("")){
		rxw.add(codeData, "defalutDate", Util.getYear() + Util.getMonth());
	} else {
		rxw.add(codeData, "defalutDate", frdt);
	}
	
	//rxw.makeDataToList(ds, "curmedicd", "cicdnm", "cicodeval", "��ü", "", codeData, "mcCheck"); // ����
	
	//�μ�(��)��� ǥ��.
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
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	rxw.makeDataToList(ds, "curtype1", "name", "code", "��ü", "", codeData, "type1"); // Ȯ������1
	rxw.makeDataToList(ds, "curtype2", "name", "code", "��ü", "", codeData, "type2"); // Ȯ������2 
	rxw.makeDataToList(ds, "curresitype", "name", "code", "��ü", "", codeData, "resitype"); // �ְ����� 
	rxw.makeDataToList(ds, "aplcpath", "name", "code", "��ü", "", codeData, "aplcpath"); // ��û���
	rxw.makeDataToList(ds, "suspresncd", "name", "code", "��ü", "", codeData, "suspresncd"); // ��������
	rxw.flush(out);
%>

