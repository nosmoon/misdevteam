<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1500_a.jsp
* ��� : ������Ȳ-VacationStop-�ڵ�-�ʱ�ȭ��
* �ۼ����� : 2004-03-29
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-02-09
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_VSCD_INITDataSet ds = (SS_L_VSCD_INITDataSet)request.getAttribute("ds");  // request dataset
    //int vscdListCount = 12;	// �� ȭ��� ����Ʈ �׸� ��
    int vscdListCount = 5000;
    applySession = false;	// ���� ���� ����

    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    int defData = rxw.add(root, "codeData", "");
		
	rxw.add(defData, "pagesize", vscdListCount);
	rxw.add(defData, "applySession", String.valueOf(applySession));
	
	//�μ�(��)��� ǥ��.
    //rxw.makeDataToList(ds, "curdeptcd", "boksnm", "deptcd", "����", "", defData, "teamlist", "record", "dept_nm", "dept_cd");
	rxw.makeDataToBulk(ds, "teamlist", defData, "teamlist");
	
	//��Ʈ ��� ǥ�� - �ӽ�
	//int comboPart = rxw.add(defData, "partlist_temp" , "");
	//rxw.addSelectItem(comboPart, "record", "dept_nm", "dept_cd", "��ü", "");
	rxw.makeDataToBulk(ds, "partlist", defData, "partlist_temp");
	
	//���� ��� ǥ��.
    //int comboArea = rxw.add(defData, "arealist_temp" , "");
	//writeAreaOpt(session, rxw, comboArea, false);
	rxw.makeDataToBulk(ds, "arealist", defData, "arealist_temp");
	
	//�ǿ�. �ʱ�ȭ�� ����ϱ� ���� ���� ���� �ʿ�
	rxw.makeDataToList(ds, "curarearegcd", "vaca_arearegnnm", "vaca_arearegncd", "��ü", "", defData, "comboVacaArea");
	rxw.makeDataToList(ds, "curarearegcd", "vaca_arearegnnm", "vaca_arearegncd", defData, "comboVacaArea2");
	//System.out.println(rxw.getXml());
	rxw.flush(out);
%>
