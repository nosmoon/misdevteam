<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_share_1211_i.jsp
* ��� : �������� �Խ��� �������� ���
* �ۼ����� : 2004-02-24
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-03-04
* ������ϸ� : ps_share_1211_i.bak
---------------------------------------------------------------------------------------------------%>

<%
    PS_S_SEPBKDataSet ds = (PS_S_SEPBKDataSet)request.getAttribute("ds");    // request dataset

    String curr_page_no = request.getParameter("curr_page_no");
    if(curr_page_no == null) {curr_page_no = "1";}
    String records_per_page = (String)request.getAttribute("records_per_page");
    if(records_per_page == null) {records_per_page = "20";}

	String incmgpersnm = Util.checkString((String)request.getAttribute("incmgpersnm"));
	String incmgpers = Util.checkString((String)request.getAttribute("incmgpers"));

//    String cmpycd = Util.checkString((String)request.getAttribute("cmpycd"));
//    String rmsgexttcd = Util.checkString((String)request.getAttribute("rmsgexttcd"));
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));

    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
             
    rxw.makeDataToList(ds, "rmsgexttcdcur", "cicdnm", "cicodeval", initTemp, "rmsCombo"); // ���Ź���
          
	rxw.flush(out);
%>
