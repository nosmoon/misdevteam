<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_share_1341_i.jsp
* ��� : �������� �Խ��� ���� �亯���
* �ۼ����� : 2004-02-24
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-03-05
* ������ϸ� : ps_share_1341_i.jsp_org
---------------------------------------------------------------------------------------------------%>

<%

    String curr_page_no = (String)request.getAttribute("curr_page_no");
    if(curr_page_no == null) {curr_page_no = "1";}
    String records_per_page = (String)request.getAttribute("records_per_page");
    if(records_per_page == null) {records_per_page = "20";}

    String cmpycd = Util.checkString((String)request.getAttribute("cmpycd"));
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));
    String titl = Util.checkString((String)request.getAttribute("titl"));
    String answergrp = Util.checkString((String)request.getAttribute("answergrp"));
    String answerseq = Util.checkString((String)request.getAttribute("answerseq"));
    String answerlevl = Util.checkString((String)request.getAttribute("answerlevl"));
	
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
             
    rxw.add(initTemp, "title", titl);
        
	rxw.flush(out);
%>
