<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1840_a.jsp
* ��� : ���־���Ʈ���� �ʱ�ȭ�� �� ����� �����Ѵ�.
* �ۼ����� : 2009-05-18
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_EXTN_APT_INITDataSet ds = (SS_L_EXTN_APT_INITDataSet)request.getAttribute("ds");
    //int listCount = 20;		// �� ȭ��� ����Ʈ �׸� ��
    int listCount = 5000;
    applySession = true;	// ���� ���� ����
    
    RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.
    
    int root = RwXmlWrapper.rootNodeID;
    int codeData = rxw.add(root, "codeData", "");    
        
    rxw.makeDataToList(ds, "teamlist", "dept_nm", "dept_cd", codeData, "deptCombo"); // �μ�
    
    //applySession
    //rxw.add(codeData, "applySession", String.valueOf(applySession));
    //rxw.add(codeData, "pagesize", listCount);
    //rxw.add(codeData, "defaultFrom", Util.getYear()+"0101");
    //rxw.add(codeData, "defaultTo", Util.getDate());
    
  	//�μ�(��)��� ǥ��.
	//int comboTeam = rxw.add(codeData, "teamlist" , "");
	//writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	//rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	//��Ʈ ��� ǥ�� - �ӽ�
	//rxw.makeEmpytList(codeData, "partlist_temp", "record", "dept_nm", "dept_cd", "��ü", "");
	//rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	
	//���� ��� ǥ��.
    //int comboArea = rxw.add(codeData, "arealist_temp" , "");
	//writeAreaOpt(session, rxw, comboArea, true);
	//rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	//���� ��� ǥ��
	//rxw.makeEmpytList(codeData, "codelist", "record", "cdnm", "cd", "��ü", "");
    
    rxw.flush(out);
%>

