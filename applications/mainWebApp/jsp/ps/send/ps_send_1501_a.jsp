<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_1501_a.jsp
* 기능 : 매체 추가발송확인 초기화면
* 작성일자 : 2004-03-08
* 작성자 : 장수환
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-11
* 백업파일명 : ps_send_1501_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    //	dataset 인스턴스 선언부분
    PS_S_SEND_LUMP_CNFMDataSet ds = (PS_S_SEND_LUMP_CNFMDataSet)request.getAttribute("ds");  // request dataset

    // 화면당 보여줄 Row수
    int li_per = 10;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
    
    rxw.makeDataToList(ds, "hdqtsenddtcur", "hdqtsenddt_view", "hdqtsenddt", initTemp, "sendCombo"); // 발송일자
    rxw.makeDataToList(ds, "bocdcur", "cicdnm", "cicodeval", "전체", "", initTemp, "branchCombo");  // 확인지사
    
	rxw.flush(out);    
%>

