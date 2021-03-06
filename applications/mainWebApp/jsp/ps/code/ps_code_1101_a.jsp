<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_code_1101_a.jsp
* 기능     : 매체 코드관리 초기화면
* 작성일자 : 2004-02-20
* 작성자   : 장수환
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-12
* 백업파일명 : ps_code_1101_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    //  dataset 인스턴스 선언부분
    PS_S_SEPBK_CODEDataSet ds = (PS_S_SEPBK_CODEDataSet)request.getAttribute("ds");  // request dataset

    // 페이지당 보여줄 라인수
    String records_per_page = "10";
    int li_per = Integer.parseInt(records_per_page) ;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
    
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "js_fn_nm", "page_move");
    //rxw.add(initTemp, "today", Util.getDate());
             
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", initTemp, "mcCombo"); // 매체
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "전체", "ALL", initTemp, "mcCombo2"); // 매체(하단)    
    rxw.makeDataToList(ds, "mediclsfcur", "cicdnm", "cicodeval", "선택", "", initTemp, "mediclsfcurCombo"); // 매체구분
    rxw.makeDataToList(ds, "issuclsf", "cicdnm", "cicodeval", "선택", "", initTemp, "issuclsfCombo"); // 발행구분
    rxw.makeDataToList(ds, "contclascur", "cicdnm", "cicodeval", "선택", "", initTemp, "contclascurCombo"); // 내용분류코드
    rxw.makeDataToList(ds, "typecur", "cicdnm", "cicodeval", "선택", "", initTemp, "typecurCombo"); // 판형
    rxw.makeDataToList(ds, "absenceyncur", "cicdnm", "cicodeval", "선택", "", initTemp, "absenceyncurCombo"); // 절판여부
    rxw.makeDataToList(ds, "sericdcur", "cicdnm", "cicodeval", "선택", "", initTemp, "sericdcurCombo"); // 시리즈코드

    rxw.flush(out);
%>

