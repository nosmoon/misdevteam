<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pb_rdr_1851_s.jsp
* ��� : ����-������ȸ
* �ۼ����� : 2007-03-26
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ������
* �������� : 2009-04-09
* ������ϸ� : ss_brmgr_1951_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    //  dataset �ν��Ͻ� ����κ�
	SS_S_BO_SEND_INITDataSet ds = (SS_S_BO_SEND_INITDataSet)request.getAttribute("ds");

	// �˻� ����Ʈ �ʱ� ī��Ʈ
	int recCount  =  10;
	
	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "pagesize", recCount);

	
	//�μ�(��)��� ǥ��.
	int comboTeam = rxw.add(codeData, "teamlist" , "");
	writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	//rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	//��Ʈ ��� ǥ�� - �ӽ�
	int comboPart = rxw.add(codeData, "partlist_temp" , "");
	rxw.addSelectItem(comboPart, "record", "dept_nm", "dept_cd", "��ü", "");
	//rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	
	//���� ��� ǥ��.
    int comboArea = rxw.add(codeData, "arealist_temp" , "");
	writeAreaOpt(session, rxw, comboArea, true);
	//rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
			
	rxw.flush(out);
%>
