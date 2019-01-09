<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_1320_s.jsp
* ��� : �������� �Խ��� �������� �󼼺���
* �ۼ����� : 2003-12-11
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-03-18
* ������ϸ� : ss_share_1320_s.jsp.bak
---------------------------------------------------------------------------------------------------%>

<%-- dataset �ν��Ͻ� ����κ�--%>
<%
    SS_S_INFOEXGDataSet ds = (SS_S_INFOEXGDataSet)request.getAttribute("ds");  // request dataset

    applySession = true;	// ���� ���� ����

    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // ȸ���ڵ�

    String pageno = (String)request.getAttribute("pageno");
    if(pageno == null) {pageno = "1";}
    String pagesize = (String)request.getAttribute("pagesize");
    if(pagesize == null) {pagesize = "5000";}//{pagesize = "10";}

    String rmsgexttcd = Util.checkString((String)request.getAttribute("rmsgexttcd"));     //���Ź�������
    String rmsgdept = Util.checkString((String)request.getAttribute("rmsgdept"));         //���źμ�����
    String rmsgarea = Util.checkString((String)request.getAttribute("rmsgarea"));         //������������
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));
    
	RwXmlWrapper rxw = new RwXmlWrapper();    
    int root = RwXmlWrapper.rootNodeID;
    int dataTemp = rxw.makeParentNode(root, "dataTemp");
    
    rxw.add(dataTemp, "rmsgdept", rmsgdept);
    rxw.add(dataTemp, "rmsgexttcd", rmsgexttcd);
    rxw.add(dataTemp, "rmsgarea", rmsgarea);
    rxw.add(dataTemp, "search_word", search_word);
    rxw.add(dataTemp, "search_word_kind", search_word_kind);
    //rxw.add(dataTemp, "hmpg", Util.Uni2Ksc(ds.getHmpg()));
    
    //�μ�(��)��� ǥ��.
	int comboTeam = rxw.add(dataTemp, "teamlist" , "");
	writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	//��Ʈ ��� ǥ�� - �ӽ�
	int comboPart = rxw.add(dataTemp, "partlist_temp" , "");
	rxw.addSelectItem(comboPart, "record", "dept_nm", "dept_cd", "��ü", "");
	//rxw.makeEmpytList(dataTemp, "partlist_temp", "record", "dept_nm", "dept_cd", "��ü", "");
	//���� ��� ǥ��.
    int comboArea = rxw.add(dataTemp, "arealist_temp" , "");
	//writeAreaOpt(session, rxw, comboArea, true);
	if("".equals(ds.getRmsgarea())){
		rxw.addSelectItem(comboArea, "record", "area_nm", "area_cd", "��ü", "");	
	}else{
		rxw.addSelectItem(comboArea, "record", "area_nm", "area_cd", ds.getRmsgareanm(), ds.getRmsgarea());
	}
	
	rxw.makeDataToList(ds, "rmsgexttcd_list", "cicdnm", "cicodeval", dataTemp, "rmsgexttcdCombo");//���Ź���
   	rxw.makeDataToBulk(ds, dataTemp, "infoGrid");
   	
	int viewValue = rxw.makeParentNode(root, "viewValue");
   	rxw.add(viewValue, "pageno", pageno);
   	rxw.add(viewValue, "pagesize", pagesize);
   	rxw.add(viewValue, "rmsgexttcd", rmsgexttcd); //���Ź�������
   	rxw.add(viewValue, "rmsgdept", rmsgdept); //���źμ�����
   	rxw.add(viewValue, "rmsgarea", rmsgarea); //������������
   	rxw.add(viewValue, "search_word", search_word);
   	rxw.add(viewValue, "search_word_kind", search_word_kind);
   	rxw.add(viewValue, "seq", ds.getSeq());
   	rxw.add(viewValue, "brwscnt", ds.getBrwscnt());
   	rxw.add(viewValue, "recomcnt", ds.getRecomcnt());
   	
   	int updateValue = rxw.makeParentNode(root, "updateValue");
   	rxw.add(updateValue, "pageno", pageno);
   	rxw.add(updateValue, "pageno", pagesize);
   	rxw.add(updateValue, "rmsgexttcd_param", rmsgexttcd);
   	rxw.add(updateValue, "rmsgdept_param", rmsgdept);
   	rxw.add(updateValue, "rmsgarea_param", rmsgarea);
   	rxw.add(updateValue, "search_word", search_word);
   	rxw.add(updateValue, "search_word_kind", search_word_kind);
   	rxw.add(updateValue, "seq", ds.getSeq());
   	rxw.add(updateValue, "makepersid", ds.getMakepersid());
   	rxw.add(updateValue, "makepersnm", ds.getMakepersnm());
   	rxw.add(updateValue, "brwscnt", ds.getBrwscnt());
	
   	rxw.flush(out);    

%>
