<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_2058_l.jsp
* ��� : ��������-������ ����Ʈ ���Է�-�ʱ�ȭ��
* �ۼ����� : 2009-08-21
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: 
* ������	: 
* ��������	: 
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
SS_L_APTDONGUNITTHRW_INIT1DataSet ds = (SS_L_APTDONGUNITTHRW_INIT1DataSet)request.getAttribute("ds");
    
	//TrustForm ó�� ����
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "invsgdt1", Util.getYear()+"0101");
	rxw.add(codeData, "invsgdt2", Util.getDate());
	
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
	rxw.makeEmpytList(codeData, "codelist", "record", "cdnm", "cd", "��ü", "");
	
	//����Ʈ ��� ǥ��
	rxw.makeEmpytList(codeData, "aptlist", "��ü", "");
	
	//�� ��� ǥ��
	rxw.makeEmpytList(codeData, "donglist", "��ü", "");
	
	rxw.flush(out); 
%>
