<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1596_a.jsp
* ��� : Ȯ����Ȳ-����Ȯ���̻����-�ʱ�ȭ��
* �ۼ����� : 2003-12-26
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: ������
* ��������	: 2009-03-17
* ������ϸ�: ss_extn_1596_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_EXTN_MOVM_INITDataSet ds = (SS_L_EXTN_MOVM_INITDataSet)request.getAttribute("ds");
	int extnmovmListCount = 10;
	String paramGbn = "##";
    applySession = true;	// ���� ���� ����
    // �����ڵ� �� �Ǹű� ��� ��ü�ڵ尡 ds�� �����ϰ� ���� ����Ȯ���̻���迡�� �����ϰ��� �ϴ� ��ü�ڵ� ����� �Ʒ��� �����Ѵ�.
    String[] medicdList = {"110","130","210","220","230","240","270","420","610"};

	String jobcd = Util.getSessionParameterValue(request, "jobcd", false);	// ���������ڵ�(�Ǹű���,��������,���������� ��� ��ȸ �ɼ��� �����ش�.)
	
	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "defalutDate", Util.getDate());
	rxw.add(codeData, "jobCode", jobcd);
	
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
	
	rxw.flush(out);
%>

