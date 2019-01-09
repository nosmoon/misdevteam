<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_1410_i.jsp
* ��� : �������� �Խ��� �Ǹű� ���
* �ۼ����� : 2003-12-03
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-03-23
* ������ϸ� : ss_share_1410_i.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_INFOEXG_SAVE_INITDataSet ds = (SS_L_INFOEXG_SAVE_INITDataSet)request.getAttribute("ds");    // request dataset

    String rmsgdept = Util.checkString((String)request.getAttribute("rmsgdept"));         //���źμ�����
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));

    String pageno = (String)request.getAttribute("pageno");
    if(pageno == null) {pageno = "1";}
    String pagesize = (String)request.getAttribute("pagesize");
    if(pagesize == null) {pagesize = "5000";} //{pagesize = "10";}

    applySession = true;	// ���� ���� ����
    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // ȸ���ڵ�
	String makepersid = Util.getSessionParameterValue(request, "uid", false); // ���̵�
	String makepersnm = Util.getSessionParameterValue(request, "emp_nm", false); // ����ڸ�
	String deptcd = Util.getSessionParameterValue(request, "selldeptcd", false); // �ҼӺμ��ڵ�
	String deptnm = Util.getSessionParameterValue(request, "selldeptnm", false); // �ҼӺμ���
	
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.add(root, "resTemp", "");
    
    rxw.add(resTemp, "makepersnm", makepersnm); //����ڸ�
    rxw.add(resTemp, "deptnm", deptnm); //�μ���    
    rxw.add(resTemp, "rmsgdept", rmsgdept);
    rxw.add(resTemp, "search_word", search_word);
    rxw.add(resTemp, "search_word_kind", search_word_kind);

	//�μ�(��)��� ǥ��.
	int comboTeam = rxw.add(resTemp, "teamlist" , "");
	writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	
	int viewValue = rxw.makeParentNode(root, "viewValue");
   	rxw.add(viewValue, "pageno", pageno);
   	rxw.add(viewValue, "pagesize", pagesize);
   	rxw.add(viewValue, "rmsgdept", rmsgdept);
   	rxw.add(viewValue, "search_word", search_word);
   	rxw.add(viewValue, "search_word_kind", search_word_kind);
   	
	int insertValue = rxw.makeParentNode(root, "insertValue");
   	rxw.add(insertValue, "deptcd", deptcd);
   	rxw.add(insertValue, "deptnm", deptnm);
   	rxw.add(insertValue, "makepersid", makepersid);
   	rxw.add(insertValue, "makepersnm", makepersnm);
   	
   	rxw.flush(out);   	
%>