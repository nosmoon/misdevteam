<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_1200_a.jsp
* 기능 : 정보공유 실시간공지 지국공지 초기화면
* 작성일자 : 2009-04-14
* 작성자 : 권정윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_ANNCBO_INITDataSet ds = (SS_L_ANNCBO_INITDataSet)request.getAttribute("ds");    // request dataset

    String js_fn_nm = request.getParameter("js_fn_nm");
    
    /*if(js_fn_nm == null) {js_fn_nm = "page_move";}
    String pageno = request.getParameter("pageno");
    if(pageno == null) {pageno = "1";}
    String pagesize = (String)request.getAttribute("pagesize");
    if(pagesize == null) {pagesize = "5000";}//{pagesize = "10";}*/

    applySession = true;	// 세션 적용 여부
    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // 회사코드

    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;

    int codeData = rxw.add(root, "codeData", "");

    rxw.add(codeData, "js_fn_nm", js_fn_nm);    
    
    // 세션으로부터 등록자정보를 얻는다.
	String deptnm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "selldeptnm", false)); 	//부서(팀)명
	String posinm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "posinm", false)); 		//직책명
	String emp_nm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "emp_nm", false)); 		//성명
	rxw.add(codeData, "deptnm", Util.Uni2Ksc(Util.getSessionParameterValue(request, "selldeptnm", false))); //팀
	rxw.add(codeData, "posinm", Util.Uni2Ksc(Util.getSessionParameterValue(request, "posinm", false))); //직책
	rxw.add(codeData, "emp_nm", Util.Uni2Ksc(Util.getSessionParameterValue(request, "emp_nm", false))); //등록자	
	rxw.add(codeData, "defaultFrom", Util.getDate()); //공지시작날짜
	rxw.add(codeData, "defaultTimeFrom", Util.getTime().toString().replaceAll(":","")); //공지시작시간
	rxw.add(codeData, "defaultTo", Util.addDate(Util.getDate(), 7)); //공지종료날짜
	rxw.add(codeData, "defaultTimeTo", Util.getTime().toString().replaceAll(":","")); //공지종료시간
	
	//부서(팀)목록 표시.
	//int comboTeam = rxw.add(codeData, "teamlist" , "");
	//writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	//파트 목록 표시 - 임시
	//int comboPart = rxw.add(codeData, "partlist_temp" , "");
	//rxw.addSelectItem(comboPart, "record", "dept_nm", "dept_cd", "전체", "");
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	
	//지역 목록 표시.
    //int comboArea = rxw.add(codeData, "arealist_temp" , "");
	//writeAreaOpt(session, rxw, comboArea, true);
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");

	rxw.flush(out);
%>