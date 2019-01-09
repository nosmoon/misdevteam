<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_1401_a.jsp
* 기능 : 매체 일일발송 발송처리 초기화면
* 작성일자 : 2004-03-04
* 작성자 : 장수환
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-09
* 백업파일명 : ps_send_1401_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    String records_per_page = "5";
    //  dataset 인스턴스 선언부분
    PS_S_SEND_LUMP_PROCDataSet ds = (PS_S_SEND_LUMP_PROCDataSet)request.getAttribute("ds");  // request dataset

    // 화면당 보여줄 Row수
    int li_per = 10;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "js_fn_nm", "page_move");
       
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", initTemp, "mcCombo"); // 매체종류
    rxw.makeDataToList(ds, "bocdcur", "cicdnm", "cicodeval", "전체", "", initTemp, "branchCombo");  // 발송지사
    rxw.makeDataToList(ds, "sendclsfcur", "cicdnm", "cicodeval", initTemp, "sendMthCombo");  // 발송방법
    rxw.makeDataToList(ds, "sendkindcur", "cicdnm", "cicodeval", initTemp, "sendKindCombo");  // 발송종류
	rxw.flush(out);
%>

