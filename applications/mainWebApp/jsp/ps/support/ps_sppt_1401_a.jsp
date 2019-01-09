<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_sppt_1401_a.jsp
* 기능 : 현금영수증 리스트 초기 화면
* 작성일자 : 2005-12-09
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-17
* 백업파일명 : ps_sppr_1401_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    PS_L_DSCT_SPPTDataSet ds = (PS_L_DSCT_SPPTDataSet)request.getAttribute("ds");  // request dataset
    String records_per_page = "20";
    int loop_cnt = Integer.parseInt(records_per_page) ;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
    
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "js_fn_nm", "page_move");

    rxw.add(initTemp, "defaultFrom", Util.addDate(Util.getDate(),-30));
    rxw.add(initTemp, "defaultTo", Util.getDate());         

    rxw.makeDataToList(ds, "rcptclsfcur", "cicdnm", "cicodeval", "전체", "", initTemp, "gubunCombo"); // 발급구분
    rxw.makeDataToList(ds, "aplcpathcur", "cicdnm", "cicodeval", "전체", "", initTemp, "routeCombo");  // 신청경로
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "전체", "", initTemp, "mcCombo");  // 매체코드
    rxw.makeDataToList(ds, "bocdcur", "cicdnm", "cicodeval", "전체", "", initTemp, "branchCombo");  // 확인지사
    rxw.makeDataToList(ds, "rcptclsfcur", "cicdnm", "cicodeval", "전체", "", initTemp, "rcptCombo");  // 발급여부
       
	rxw.flush(out);
%>

