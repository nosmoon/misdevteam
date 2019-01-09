<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_2351_a.jsp
* 기능 : 지국별발송처리 초기화면
* 작성일자 : 2004-03-02
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-10
* 백업파일명 : ps_send_2351_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    String records_per_page = "20";
    //  dataset 인스턴스 선언부분
    PS_S_BO_SEND_INITDataSet ds = (PS_S_BO_SEND_INITDataSet)request.getAttribute("ds");  // request dataset

    // 화면당 보여줄 Row수
    int li_per = 20;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "js_fn_nm", "page_move");
    rxw.add(initTemp, "weekDate", ds.getWeekyymmdd()); // ex)2009/02/14
    rxw.add(initTemp, "weekDay", ds.getWeekday()); // ex)토요일
       
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", initTemp, "mcCombo"); // 매체종류
    rxw.makeDataToList(ds, "curdeptcd", "boksnm", "deptcd", "전체", "", initTemp, "deptCombo");  // 부서
    rxw.makeDataToList(ds, "areacdcur", "areanm", "areacd", "전체", "", initTemp, "areaCombo");  // 지역
   
	rxw.flush(out);    
%>

