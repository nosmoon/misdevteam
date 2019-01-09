<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_code_1501_a.jsp
* 기능 : 지사계좌관리 초기화면
* 작성일자 : 2006-11-09
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-12
* 백업파일명 : ps_code_1501_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // 페이지당 보여줄 라인수
    String records_per_page = "15";
    int li_per = Integer.parseInt(records_per_page) ;
    //	dataset 인스턴스 선언부분
    PS_L_BOACCTDataSet ds = (PS_L_BOACCTDataSet)request.getAttribute("ds");  // request dataset
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
    
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "js_fn_nm", "page_move");
             
    rxw.makeDataToList(ds, "asinbocdcur", "bonm", "bocd", "선택", "", initTemp, "branchCombo"); // 지사
    rxw.makeDataToList(ds, "asinbocdcur", "bonm", "bocd", "전체", "ALL", initTemp, "branchCombo2"); // 지사
    rxw.makeDataToList(ds, "bankcur", "cicdnm", "cicodeval", "선택", "", initTemp, "bankCombo");  // 은행계좌
    rxw.makeDataToList(ds, "accitmcur", "cicdnm", "cicodeval", "선택", "", initTemp, "accountCombo");  // 계좌항목 
       
	rxw.flush(out);
%>

