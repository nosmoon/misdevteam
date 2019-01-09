<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_1600_l.jsp
* 기능 : 정보공유 게시판 업무협조 초기화면
* 작성일자 : 2003-12-03
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응. 
* 수정자   : 김용욱
* 수정일자 : 2009-03-24
* 백업파일명 : ss_share_1600_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
    SS_L_INFOEXG_INITDataSet ds = (SS_L_INFOEXG_INITDataSet)request.getAttribute("ds");    // request dataset

    String js_fn_nm = request.getParameter("js_fn_nm");
    if(js_fn_nm == null) {js_fn_nm = "page_move";}
    String pageno = request.getParameter("pageno");
    if(pageno == null) {pageno = "1";}
    String pagesize = (String)request.getAttribute("pagesize");
    if(pagesize == null) {pagesize = "5000";}//{pagesize = "10";}

    applySession = true;	// 세션 적용 여부
    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // 회사코드

    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int codeData = rxw.add(root, "codeData", "");
    
    rxw.add(codeData, "pageno", pageno);
    rxw.add(codeData, "js_fn_nm", js_fn_nm);    
    rxw.add(codeData, "pagesize", pagesize);
    
	//부서(팀)목록 표시.
	int comboTeam = rxw.add(codeData, "teamlist" , "");
	writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	
	//파트 목록 표시 - 임시
	int comboPart = rxw.add(codeData, "partlist_temp" , "");
	rxw.addSelectItem(comboPart, "record", "dept_nm", "dept_cd", "전체", "");
	
	//지역 목록 표시.
    int comboArea = rxw.add(codeData, "arealist_temp" , "");
	writeAreaOpt(session, rxw, comboArea, true);
	
    rxw.makeHugeStart(codeData, "listGrid", ds.infoexglist.size());
    
    for(int i=0 ; i< ds.infoexglist.size(); i++) {
        SS_L_INFOEXG_INITINFOEXGLISTRecord rec = (SS_L_INFOEXG_INITINFOEXGLISTRecord)ds.infoexglist.get(i);
        
        if(i == 0){
        	rxw.add_ColVal("titl_f");
			rxw.add_ColVal("regdt_f");        	
			rxw.makeRecordToBulkTitle(rec);
		}
        
        if(rec.answerseq == 0){
        	rxw.add_ColVal(Util.checkString(rec.titl));
        	rxw.add_ColVal(Util.Timestamp2Str(rec.regdt));        	
		}else if(rec.answerlevl == 1){
			rxw.add_ColVal(Util.checkString(rec.titl));
        	rxw.add_ColVal(Util.Timestamp2Str(rec.regdt));			
		}else{
			int imgsize = 8 * rec.answerlevl;
			rxw.add_ColVal(Util.checkString(rec.titl));
        	rxw.add_ColVal(Util.Timestamp2Str(rec.regdt));			
		}
        rxw.makeRecordToBulk(rec, false);
	}
	rxw.makeHugeEnd(); 
	
	rxw.flush(out);        
%>