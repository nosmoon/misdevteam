<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1800_a.jsp
* ��� : �̸����-�̸�TMȮ��
* �ۼ����� : 2013-5-8
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>

<%
	SS_L_CAMP_TM_EXTN_INITDataSet ds = (SS_L_CAMP_TM_EXTN_INITDataSet)request.getAttribute("ds");
   
	
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "defaultFrom", Util.getDate()); //��¥
	rxw.add(codeData, "defaultTo", Util.getDate()); //��¥
	
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
	
	rxw.makeDataToBulk(ds, "subscnfmstatcdcur", codeData, "subscnfmstatcd");
	
	rxw.flush(out);
%>