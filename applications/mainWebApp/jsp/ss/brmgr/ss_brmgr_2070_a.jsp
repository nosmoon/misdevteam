<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_1000_a.jsp
* ��� : �����濵-�����μ���Ȳ-�ʱ�ȭ��
* �ۼ����� : 2004-03-06
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� : ��Ͽ��� ������ Ŭ���� �ش������� ����϶� ȭ���� �˾����� �����ش�.
* ������ : ��뼷
* �������� : 2004/12/08
* ������ϸ� : ����(�ڵ� �߰�)
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-02-12
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%-- dataset �ν��Ͻ� ����κ�--%>
<%
	SS_L_ABC_INITDataSet ds = (SS_L_ABC_INITDataSet)request.getAttribute("ds");
	String paramGbn = "##";
    //int listCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    int listCount = 5000;
    applySession = true;	// ���� ���� ����

    // �����ڵ� �� �Ǹű� ��� ��ü�ڵ尡 ds�� �����ϰ� ���� ����Ȯ���̻���迡�� �����ϰ��� �ϴ� ��ü�ڵ� ����� �Ʒ��� �����Ѵ�.
    // ���������� ����� ���������� ��ü�� ���̰� �Ѵ�.
    String[] medicdList = null;
    String cmpycd = (String)session.getAttribute("cmpycd");
    if("203".equals(cmpycd)){
    	medicdList = new String[1];
    	medicdList[0] = "610";
    }else{
    	medicdList = new String[4];
    	medicdList[0] = "110";
    	medicdList[1] = "130";
    	medicdList[2] = "610";
    	medicdList[3] = "715";
    }

    // 20041208 ��뼷 �߰�
    // �Ǹ����� ����϶� �˾��� �ʼ��׸�
    String uid = (String)session.getAttribute("uid");
    
    //TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "pagesize", listCount);
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	//rxw.add(codeData, "yymm", ds.getYyyymm());
	rxw.add(codeData, "uid", uid);
	
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
	
	//��ü�ڵ� ǥ��.
	int comboMedi = rxw.add(codeData, "medilist", "");
	writeMediOpt(session, rxw, comboMedi, false, ds, "curmedicd", "cicdnm", "cicodeval");
	
	rxw.flush(out);
%>
