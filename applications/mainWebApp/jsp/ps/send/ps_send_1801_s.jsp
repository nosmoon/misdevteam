<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_1801_s.jsp
* 기능 : 보너스북 발송 초기화면
* 작성일자 : 2004-02-20
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-09
* 백업파일명 : ps_send_1801_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // 페이지당 보여줄 라인수
    String records_per_page = "5";

    //	dataset 인스턴스 선언부분
    PS_S_SEND_BNSBKDataSet ds = (PS_S_SEND_BNSBKDataSet)request.getAttribute("ds");  // request dataset

    // 화면당 보여줄 Row수
    int li_per = 10;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "js_fn_nm", "page_move");
       
    rxw.makeDataToList(ds, "bnsbksenddtcur", "brch_offisend_dt_view", "brch_offisend_dt", initTemp, "sendCombo"); // 발송일자
    rxw.makeDataToList(ds, "asinbocdcur", "bonm", "bocd", "전체", "", initTemp, "branchCombo");  // 발송지사
    rxw.makeDataToList(ds, "sendmthdcur", "cicdnm", "cicodeval", initTemp, "sendMthCombo");  // 발송방법
	rxw.flush(out);
%>

