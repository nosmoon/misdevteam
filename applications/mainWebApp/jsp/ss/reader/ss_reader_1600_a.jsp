<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ss_reader_1600_a.jsp
* ���     : ������Ȳ-���ڵ�ް���-�ʱ�ȭ��
* �ۼ����� : 2004-04-21
* �ۼ���   : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : �̸����� �����˻� ��� ������� ����
* ������   : ��뼷
* �������� : 2005-05-06
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : �˻����� �� ��ȸ���� ����(���ݿ����� �� ȸ���� �߰�)
* ������   : ��뼷
* �������� : 2005-11-23
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : ���������ڵ带 flag�� �̿��Ͽ� ���ݿ�����, ���ð��� ��ȸ�� �������Ѵ�.
* ������   : ��뼷
* �������� : 2005-11-24
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: ������
* ��������	: 2009-04-08
* ������ϸ�: ss_reader_1600_a.jsp
---------------------------------------------------------------------------------------------------%>
<%
    //dataset �ν��Ͻ� ����κ�
	SS_L_RDRCRTS_INITDataSet ds = (SS_L_RDRCRTS_INITDataSet)request.getAttribute("ds");

    //ȭ�鿡 ������ ���ڵ� �� ����
    int   listCount  =  20;
    
  //TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "defaultDate", Util.getDate());
	
	//�μ�(��)��� ǥ��.
	//int comboTeam = rxw.add(codeData, "teamlist" , "");
	//writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	//��Ʈ ��� ǥ�� - �ӽ�
	//rxw.makeEmpytList(codeData, "partlist_temp", "record", "dept_nm", "dept_cd", "��ü", "");
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	
	//���� ��� ǥ��.
    //int comboArea = rxw.add(codeData, "arealist_temp" , "");
	//writeAreaOpt(session, rxw, comboArea, true);
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	//���� ��� ǥ��
	//rxw.makeEmpytList(codeData, "codelist", "record", "cdnm", "cd", "��ü", "");
	
	rxw.makeDataToList(ds, "curdtlsprocstatcd", "cicdnm", "cicodeval", "��ü", "", codeData, "userCombo"); // ����ȸ��
	rxw.makeDataToList(ds, "currmblestat", "cicdnm", "cicodeval", "��ü", "", codeData, "mobileCombo"); // ����ϻ���
	rxw.makeDataToList(ds, "currecstat", "cicdnm", "cicodeval", "��ü", "", codeData, "cashCombo"); // ���ݿ�����
	
	rxw.flush(out);
%>

