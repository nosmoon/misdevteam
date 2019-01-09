<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_1410_i.jsp
* 기능 : 정보공유 게시판 판매국 등록
* 작성일자 : 2003-12-03
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-03-23
* 백업파일명 : ss_share_1410_i.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_INFOEXG_SAVE_INITDataSet ds = (SS_L_INFOEXG_SAVE_INITDataSet)request.getAttribute("ds");    // request dataset

    String rmsgdept = Util.checkString((String)request.getAttribute("rmsgdept"));         //수신부서선택
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));

    String pageno = (String)request.getAttribute("pageno");
    if(pageno == null) {pageno = "1";}
    String pagesize = (String)request.getAttribute("pagesize");
    if(pagesize == null) {pagesize = "5000";} //{pagesize = "10";}

    applySession = true;	// 세션 적용 여부
    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // 회사코드
	String makepersid = Util.getSessionParameterValue(request, "uid", false); // 아이디
	String makepersnm = Util.getSessionParameterValue(request, "emp_nm", false); // 사용자명
	String deptcd = Util.getSessionParameterValue(request, "selldeptcd", false); // 소속부서코드
	String deptnm = Util.getSessionParameterValue(request, "selldeptnm", false); // 소속부서명
	
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.add(root, "resTemp", "");
    
    rxw.add(resTemp, "makepersnm", makepersnm); //사용자명
    rxw.add(resTemp, "deptnm", deptnm); //부서명    
    rxw.add(resTemp, "rmsgdept", rmsgdept);
    rxw.add(resTemp, "search_word", search_word);
    rxw.add(resTemp, "search_word_kind", search_word_kind);

	//부서(팀)목록 표시.
	int comboTeam = rxw.add(resTemp, "teamlist" , "");
	writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	
	int viewValue = rxw.makeParentNode(root, "viewValue");
   	rxw.add(viewValue, "pageno", pageno);
   	rxw.add(viewValue, "pagesize", pagesize);
   	rxw.add(viewValue, "rmsgdept", rmsgdept);
   	rxw.add(viewValue, "search_word", search_word);
   	rxw.add(viewValue, "search_word_kind", search_word_kind);
   	
	int insertValue = rxw.makeParentNode(root, "insertValue");
   	rxw.add(insertValue, "deptcd", deptcd);
   	rxw.add(insertValue, "deptnm", deptnm);
   	rxw.add(insertValue, "makepersid", makepersid);
   	rxw.add(insertValue, "makepersnm", makepersnm);
   	
   	rxw.flush(out);   	
%>