<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_share_1211_i.jsp
* 기능 : 정보공유 게시판 공지사항 등록
* 작성일자 : 2004-02-24
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-03-04
* 백업파일명 : ps_share_1211_i.bak
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
             
    rxw.makeDataToList(ds, "rmsgexttcdcur", "cicdnm", "cicodeval", initTemp, "rmsCombo"); // 수신범위
          
	rxw.flush(out);
%>
