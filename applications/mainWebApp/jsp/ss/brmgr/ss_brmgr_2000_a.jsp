<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : sl_reader_3100_a.jsp
* ���      : ����-ķ����Ȯ�����ڰ���
* �ۼ�����  : 2005-03-03
* �ۼ���    : �����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :TrustForm ����.
* ������   : ����
* �������� : 2009-04-15
* ������ϸ� : ss_brmgr_2000_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_BOSENDPCOND_INITDataSet ds = (SS_L_BOSENDPCOND_INITDataSet)request.getAttribute("ds");
	String paramGbn = "##";
	//int listCount = 15;	// �� ȭ��� ����Ʈ �׸� ��
	int listCount = 5000;	// �� ȭ��� ����Ʈ �׸� ��
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
    
    
    long curr_page_no = ((String)request.getParameter("pageno") == null)? 1 : Long.parseLong(request.getParameter("pageno"));
    long records_per_page = ((String)request.getParameter("pagesize") == null)? 15 : Long.parseLong(request.getParameter("pagesize"));

    long start_no = ((curr_page_no - 1) * records_per_page)  + 1;
    
  //TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
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
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "pagesize", listCount);
	
	rxw.add(codeData, "sech_campdate_s", Util.getDate());
	rxw.add(codeData, "sech_campdate_e", Util.getDate());
	
	rxw.flush(out);
    
%>