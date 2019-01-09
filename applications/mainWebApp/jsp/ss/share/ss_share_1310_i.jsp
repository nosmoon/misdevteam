<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_1310_i.jsp
* 기능 : 정보공유 게시판 공지사항 등록
* 작성일자 : 2003-12-03
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-03-19
* 백업파일명 : ss_share_1310_i.jsp.bak
---------------------------------------------------------------------------------------------------%>

<%
	SS_L_INFOEXG_SAVE_INITDataSet ds = (SS_L_INFOEXG_SAVE_INITDataSet)request.getAttribute("ds");    // request dataset

    String pageno = (String)request.getAttribute("pageno");
    if(pageno == null) {pageno = "1";}
    String pagesize = (String)request.getAttribute("pagesize");
    if(pagesize == null) {pagesize = "5000";}//{pagesize = "10";}

    String rmsgexttcd = Util.checkString((String)request.getAttribute("rmsgexttcd"));     //수신범위선택
	String rmsgdept = Util.checkString((String)request.getAttribute("rmsgdept"));         //수신부서선택
    String rmsgarea = Util.checkString((String)request.getAttribute("rmsgarea"));         //수신지역선택
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));

    applySession = true;	// 세션 적용 여부
    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // 회사코드
	String makepersid = Util.getSessionParameterValue(request, "uid", false); // 아이디
	String makepersnm = Util.getSessionParameterValue(request, "emp_nm", false); // 사용자명
	String deptcd = Util.getSessionParameterValue(request, "selldeptcd", false); // 소속판매부서코드
	String deptnm = Util.getSessionParameterValue(request, "selldeptnm", false); // 소속판매부서명

    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
    
    rxw.add(initTemp, "makepersnm", makepersnm); //사용자명
    rxw.add(initTemp, "deptnm", deptnm); //부서명
    rxw.add(initTemp, "rmsgexttcd", rmsgexttcd); //수신범위선택
    rxw.add(initTemp, "rmsgdept", rmsgdept); //수신부서선택
    rxw.add(initTemp, "rmsgarea", rmsgarea); //수신지역 선택
    rxw.add(initTemp, "search_word", search_word); 
    rxw.add(initTemp, "search_word_kind", search_word_kind);
    
    rxw.add(initTemp, "notifrdt", Util.getDate()); //게시시작일자
	rxw.add(initTemp, "notitodt", Util.getDate()); //게시종료일자    
    
	//부서(팀)목록 표시.
	int comboTeam = rxw.add(initTemp, "teamlist" , "");
	writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	
	//파트 목록 표시 - 임시
	int comboPart = rxw.add(initTemp, "partlist_temp" , "");
	rxw.addSelectItem(comboPart, "record", "dept_nm", "dept_cd", "전체", "");
	
	//지역 목록 표시.
    int comboArea = rxw.add(initTemp, "arealist_temp" , "");
	writeAreaOpt(session, rxw, comboArea, true);
	
    rxw.makeDataToList(ds, "rmsgexttcd_list", "cicdnm", "cicodeval", initTemp, "rmsgexttcdCombo");//수신범위
    
	int listValue = rxw.makeParentNode(root, "listValue");
   	rxw.add(listValue, "pageno", pageno);
   	rxw.add(listValue, "pagesize", pagesize);
   	rxw.add(listValue, "rmsgexttcd", rmsgexttcd);
   	rxw.add(listValue, "rmsgdept", rmsgdept);
   	rxw.add(listValue, "rmsgarea", rmsgarea);
   	rxw.add(listValue, "search_word", search_word);
   	rxw.add(listValue, "search_word_kind", search_word_kind);
  	
	int insertValue = rxw.makeParentNode(root, "insertValue");
   	rxw.add(insertValue, "deptcd", deptcd);
   	rxw.add(insertValue, "deptnm", deptnm);
   	rxw.add(insertValue, "makepersid", makepersid);
   	rxw.add(insertValue, "makepersnm", makepersnm);

   	rxw.flush(out);
%>
