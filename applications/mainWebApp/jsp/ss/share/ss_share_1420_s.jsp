<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_1420_s.jsp
* ��� : �������� �Խ��� �Ǹű� �󼼺���
* �ۼ����� : 2003-12-11
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-03-23
* ������ϸ� : ss_share_1420_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%-- dataset �ν��Ͻ� ����κ�--%>
<%
    SS_S_INFOEXGDataSet ds = (SS_S_INFOEXGDataSet)request.getAttribute("ds");  // request dataset

    applySession = true;	// ���� ���� ����
    String pageno = (String)request.getAttribute("pageno");
    if(pageno == null) {pageno = "1";}
    String pagesize = (String)request.getAttribute("pagesize");
    if(pagesize == null) {pagesize = "5000";}//{pagesize = "10";}

    String rmsgdept = Util.checkString((String)request.getAttribute("rmsgdept"));         //���źμ�����
    String search_word = Util.Uni2Ksc(Util.checkString((String)request.getAttribute("search_word")));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));
    
    RwXmlWrapper rxw = new RwXmlWrapper();    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");
    
    rxw.add(resTemp, "rmsgdept", rmsgdept);
    rxw.add(resTemp, "search_word", search_word);
    rxw.add(resTemp, "search_word_kind", search_word_kind);
    
	//�μ�(��)��� ǥ��.
	int comboTeam = rxw.add(resTemp, "teamlist" , "");
	writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
   	
	rxw.makeDataToBulk(ds, resTemp, "detailGrid");	
	
	int viewValue = rxw.makeParentNode(root, "viewValue");
   	rxw.add(viewValue, "pageno", pageno);
   	rxw.add(viewValue, "pagesize", pagesize);
   	rxw.add(viewValue, "rmsgdept_param", rmsgdept);
   	rxw.add(viewValue, "rmsgdept", rmsgdept);
   	rxw.add(viewValue, "search_word", search_word);
   	rxw.add(viewValue, "search_word_kind", search_word_kind);
   	rxw.add(viewValue, "seq", ds.getSeq());
   	rxw.add(viewValue, "answergrp", ds.getAnswergrp());
   	rxw.add(viewValue, "answerseq", ds.getAnswerseq());
   	rxw.add(viewValue, "answerlevl", ds.getAnswerlevl());
   	rxw.add(viewValue, "brwscnt", ds.getBrwscnt());
   	rxw.add(viewValue, "recomcnt", ds.getRecomcnt());
   	
	int updateValue = rxw.makeParentNode(root, "updateValue");
   	rxw.add(viewValue, "pageno", pageno);
   	rxw.add(viewValue, "pagesize", pagesize);
   	rxw.add(viewValue, "rmsgdept_param", rmsgdept);
   	rxw.add(viewValue, "search_word", search_word);
   	rxw.add(viewValue, "search_word_kind", search_word_kind);
   	rxw.add(viewValue, "seq", ds.getSeq());
   	rxw.add(viewValue, "makepersid", ds.getMakepersid());
   	rxw.add(viewValue, "makepersnm", ds.getMakepersnm());
   	rxw.add(viewValue, "brwscnt", ds.getBrwscnt());
   	rxw.add(viewValue, "rmsgdept_temp", ds.getRmsgdept());
   	
   	rxw.flush(out);   	
%>