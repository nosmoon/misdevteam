<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_1310_i.jsp
* ��� : �������� �Խ��� �������� ���
* �ۼ����� : 2003-12-03
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-03-19
* ������ϸ� : ss_share_1310_i.jsp.bak
---------------------------------------------------------------------------------------------------%>

<%
	SS_L_INFOEXG_SAVE_INITDataSet ds = (SS_L_INFOEXG_SAVE_INITDataSet)request.getAttribute("ds");    // request dataset

    String pageno = (String)request.getAttribute("pageno");
    if(pageno == null) {pageno = "1";}
    String pagesize = (String)request.getAttribute("pagesize");
    if(pagesize == null) {pagesize = "5000";}//{pagesize = "10";}

    String rmsgexttcd = Util.checkString((String)request.getAttribute("rmsgexttcd"));     //���Ź�������
	String rmsgdept = Util.checkString((String)request.getAttribute("rmsgdept"));         //���źμ�����
    String rmsgarea = Util.checkString((String)request.getAttribute("rmsgarea"));         //������������
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));

    applySession = true;	// ���� ���� ����
    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // ȸ���ڵ�
	String makepersid = Util.getSessionParameterValue(request, "uid", false); // ���̵�
	String makepersnm = Util.getSessionParameterValue(request, "emp_nm", false); // ����ڸ�
	String deptcd = Util.getSessionParameterValue(request, "selldeptcd", false); // �Ҽ��Ǹźμ��ڵ�
	String deptnm = Util.getSessionParameterValue(request, "selldeptnm", false); // �Ҽ��Ǹźμ���

    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
    
    rxw.add(initTemp, "makepersnm", makepersnm); //����ڸ�
    rxw.add(initTemp, "deptnm", deptnm); //�μ���
    rxw.add(initTemp, "rmsgexttcd", rmsgexttcd); //���Ź�������
    rxw.add(initTemp, "rmsgdept", rmsgdept); //���źμ�����
    rxw.add(initTemp, "rmsgarea", rmsgarea); //�������� ����
    rxw.add(initTemp, "search_word", search_word); 
    rxw.add(initTemp, "search_word_kind", search_word_kind);
    
    rxw.add(initTemp, "notifrdt", Util.getDate()); //�Խý�������
	rxw.add(initTemp, "notitodt", Util.getDate()); //�Խ���������    
    
	//�μ�(��)��� ǥ��.
	int comboTeam = rxw.add(initTemp, "teamlist" , "");
	writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	
	//��Ʈ ��� ǥ�� - �ӽ�
	int comboPart = rxw.add(initTemp, "partlist_temp" , "");
	rxw.addSelectItem(comboPart, "record", "dept_nm", "dept_cd", "��ü", "");
	
	//���� ��� ǥ��.
    int comboArea = rxw.add(initTemp, "arealist_temp" , "");
	writeAreaOpt(session, rxw, comboArea, true);
	
    rxw.makeDataToList(ds, "rmsgexttcd_list", "cicdnm", "cicodeval", initTemp, "rmsgexttcdCombo");//���Ź���
    
	int listValue = rxw.makeParentNode(root, "listValue");
   	rxw.add(listValue, "pageno", pageno);
   	rxw.add(listValue, "pagesize", pagesize);
   	rxw.add(listValue, "rmsgexttcd", rmsgexttcd);
   	rxw.add(listValue, "rmsgdept", rmsgdept);
   	rxw.add(listValue, "rmsgarea", rmsgarea);
   	rxw.add(listValue, "search_word", search_word);
   	rxw.add(listValue, "search_word_kind", search_word_kind);
  	
	int insertValue = rxw.makeParentNode(root, "insertValue");
   	rxw.add(insertValue, "deptcd", deptcd);
   	rxw.add(insertValue, "deptnm", deptnm);
   	rxw.add(insertValue, "makepersid", makepersid);
   	rxw.add(insertValue, "makepersnm", makepersnm);

   	rxw.flush(out);
%>
