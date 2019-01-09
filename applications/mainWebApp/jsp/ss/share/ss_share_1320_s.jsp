<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_1320_s.jsp
* 기능 : 정보공유 게시판 공지사항 상세보기
* 작성일자 : 2003-12-11
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-03-18
* 백업파일명 : ss_share_1320_s.jsp.bak
---------------------------------------------------------------------------------------------------%>

<%-- dataset 인스턴스 선언부분--%>
<%
    SS_S_INFOEXGDataSet ds = (SS_S_INFOEXGDataSet)request.getAttribute("ds");  // request dataset

    applySession = true;	// 세션 적용 여부

    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // 회사코드

    String pageno = (String)request.getAttribute("pageno");
    if(pageno == null) {pageno = "1";}
    String pagesize = (String)request.getAttribute("pagesize");
    if(pagesize == null) {pagesize = "5000";}//{pagesize = "10";}

    String rmsgexttcd = Util.checkString((String)request.getAttribute("rmsgexttcd"));     //수신범위선택
    String rmsgdept = Util.checkString((String)request.getAttribute("rmsgdept"));         //수신부서선택
    String rmsgarea = Util.checkString((String)request.getAttribute("rmsgarea"));         //수신지역선택
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));
    
	RwXmlWrapper rxw = new RwXmlWrapper();    
    int root = RwXmlWrapper.rootNodeID;
    int dataTemp = rxw.makeParentNode(root, "dataTemp");
    
    rxw.add(dataTemp, "rmsgdept", rmsgdept);
    rxw.add(dataTemp, "rmsgexttcd", rmsgexttcd);
    rxw.add(dataTemp, "rmsgarea", rmsgarea);
    rxw.add(dataTemp, "search_word", search_word);
    rxw.add(dataTemp, "search_word_kind", search_word_kind);
    //rxw.add(dataTemp, "hmpg", Util.Uni2Ksc(ds.getHmpg()));
    
    //부서(팀)목록 표시.
	int comboTeam = rxw.add(dataTemp, "teamlist" , "");
	writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	//파트 목록 표시 - 임시
	int comboPart = rxw.add(dataTemp, "partlist_temp" , "");
	rxw.addSelectItem(comboPart, "record", "dept_nm", "dept_cd", "전체", "");
	//rxw.makeEmpytList(dataTemp, "partlist_temp", "record", "dept_nm", "dept_cd", "전체", "");
	//지역 목록 표시.
    int comboArea = rxw.add(dataTemp, "arealist_temp" , "");
	//writeAreaOpt(session, rxw, comboArea, true);
	if("".equals(ds.getRmsgarea())){
		rxw.addSelectItem(comboArea, "record", "area_nm", "area_cd", "전체", "");	
	}else{
		rxw.addSelectItem(comboArea, "record", "area_nm", "area_cd", ds.getRmsgareanm(), ds.getRmsgarea());
	}
	
	rxw.makeDataToList(ds, "rmsgexttcd_list", "cicdnm", "cicodeval", dataTemp, "rmsgexttcdCombo");//수신범위
   	rxw.makeDataToBulk(ds, dataTemp, "infoGrid");
   	
	int viewValue = rxw.makeParentNode(root, "viewValue");
   	rxw.add(viewValue, "pageno", pageno);
   	rxw.add(viewValue, "pagesize", pagesize);
   	rxw.add(viewValue, "rmsgexttcd", rmsgexttcd); //수신범위선택
   	rxw.add(viewValue, "rmsgdept", rmsgdept); //수신부서선택
   	rxw.add(viewValue, "rmsgarea", rmsgarea); //수신지역선택
   	rxw.add(viewValue, "search_word", search_word);
   	rxw.add(viewValue, "search_word_kind", search_word_kind);
   	rxw.add(viewValue, "seq", ds.getSeq());
   	rxw.add(viewValue, "brwscnt", ds.getBrwscnt());
   	rxw.add(viewValue, "recomcnt", ds.getRecomcnt());
   	
   	int updateValue = rxw.makeParentNode(root, "updateValue");
   	rxw.add(updateValue, "pageno", pageno);
   	rxw.add(updateValue, "pageno", pagesize);
   	rxw.add(updateValue, "rmsgexttcd_param", rmsgexttcd);
   	rxw.add(updateValue, "rmsgdept_param", rmsgdept);
   	rxw.add(updateValue, "rmsgarea_param", rmsgarea);
   	rxw.add(updateValue, "search_word", search_word);
   	rxw.add(updateValue, "search_word_kind", search_word_kind);
   	rxw.add(updateValue, "seq", ds.getSeq());
   	rxw.add(updateValue, "makepersid", ds.getMakepersid());
   	rxw.add(updateValue, "makepersnm", ds.getMakepersnm());
   	rxw.add(updateValue, "brwscnt", ds.getBrwscnt());
	
   	rxw.flush(out);    

%>
