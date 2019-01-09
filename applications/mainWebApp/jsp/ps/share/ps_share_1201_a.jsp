<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_share_1201_a.jsp
* 기능 : 정보공유 게시판 공지사항 초기화면
* 작성일자 : 2004-02-23
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-03-02
* 백업파일명 : ps_share_1201_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
    PS_L_INFOEXG_INITDataSet ds = (PS_L_INFOEXG_INITDataSet)request.getAttribute("ds");    // request dataset

    String js_fn_nm = request.getParameter("js_fn_nm");
    if(js_fn_nm == null) {js_fn_nm = "page_move";}

    String curr_page_no = request.getParameter("curr_page_no");
    if(curr_page_no == null) {curr_page_no = "1";}

    String records_per_page = (String)request.getAttribute("records_per_page");
    if(records_per_page == null) {records_per_page = "20";}

    int no_data_page = Integer.parseInt(records_per_page) -ds.infoexglist.size();
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
             
    rxw.makeDataToList(ds, "exttlist", "cicdnm", "cicodeval", "전체", "", initTemp, "rmsCombo"); // 수신범위
           
	rxw.flush(out);
%>

