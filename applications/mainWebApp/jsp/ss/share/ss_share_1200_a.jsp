<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_1200_a.jsp
* ��� : �������� �ǽð����� �������� �ʱ�ȭ��
* �ۼ����� : 2009-04-14
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_ANNCBO_INITDataSet ds = (SS_L_ANNCBO_INITDataSet)request.getAttribute("ds");    // request dataset

    String js_fn_nm = request.getParameter("js_fn_nm");
    
    /*if(js_fn_nm == null) {js_fn_nm = "page_move";}
    String pageno = request.getParameter("pageno");
    if(pageno == null) {pageno = "1";}
    String pagesize = (String)request.getAttribute("pagesize");
    if(pagesize == null) {pagesize = "5000";}//{pagesize = "10";}*/

    applySession = true;	// ���� ���� ����
    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // ȸ���ڵ�

    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;

    int codeData = rxw.add(root, "codeData", "");

    rxw.add(codeData, "js_fn_nm", js_fn_nm);    
    
    // �������κ��� ����������� ��´�.
	String deptnm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "selldeptnm", false)); 	//�μ�(��)��
	String posinm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "posinm", false)); 		//��å��
	String emp_nm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "emp_nm", false)); 		//����
	rxw.add(codeData, "deptnm", Util.Uni2Ksc(Util.getSessionParameterValue(request, "selldeptnm", false))); //��
	rxw.add(codeData, "posinm", Util.Uni2Ksc(Util.getSessionParameterValue(request, "posinm", false))); //��å
	rxw.add(codeData, "emp_nm", Util.Uni2Ksc(Util.getSessionParameterValue(request, "emp_nm", false))); //�����	
	rxw.add(codeData, "defaultFrom", Util.getDate()); //�������۳�¥
	rxw.add(codeData, "defaultTimeFrom", Util.getTime().toString().replaceAll(":","")); //�������۽ð�
	rxw.add(codeData, "defaultTo", Util.addDate(Util.getDate(), 7)); //�������ᳯ¥
	rxw.add(codeData, "defaultTimeTo", Util.getTime().toString().replaceAll(":","")); //��������ð�
	
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