<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_share_1101_a.jsp
* 기능 : 정보공유 일정관리 초기화면
* 작성일자 : 2004-02-23
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-12
* 백업파일명 : ps_share_1101_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
    int moveListCount = 10;	// 한 화면당 리스트 항목 수
   
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
    
    rxw.add(initTemp, "recordPerPage", moveListCount);
    rxw.add(initTemp, "js_fn_nm", "page_move");
    rxw.add(initTemp, "startday", Util.getYyyyMm()+"01");
    rxw.add(initTemp, "lastday", Util.getLastDay(Util.getYyyyMm()+"01"));

    rxw.flush(out);
%>

