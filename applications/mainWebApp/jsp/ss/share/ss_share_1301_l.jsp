<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_1301_l.jsp
* 기능 : 정보공유 게시판 공지사항 검색리스트 가져오기
* 작성일자 : 2003-12-11
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-03-17
* 백업파일명 : ss_share_1301_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
    SS_L_INFOEXG_SRCHDataSet ds = (SS_L_INFOEXG_SRCHDataSet)request.getAttribute("ds");    // request dataset
    applySession = true;	// 세션 적용 여부

    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // 회사코드
    //String cmpycd = "100";

    String js_fn_nm = request.getParameter("js_fn_nm");
    if(js_fn_nm == null) {js_fn_nm = "page_move";}

    String pageno = (String)request.getAttribute("pageno");
    if(pageno == null) {pageno = "1";}
    String pagesize = (String)request.getAttribute("pagesize");
    if(pagesize == null) {pagesize = "5000";} //{pagesize = "10";}

    String rmsgexttcd = Util.checkString((String)request.getAttribute("rmsgexttcd"));     //수신범위선택
    String rmsgdept = Util.checkString((String)request.getAttribute("rmsgdept"));         //수신부서(팀)선택
    String rmsgarea = Util.checkString((String)request.getAttribute("rmsgarea"));         //수신지역선택
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));

    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
    
    rxw.makeHugeStart(acctTemp, "listGrid", ds.infoexglist.size());
       
	for(int i=0 ; i< ds.infoexglist.size(); i++) {
        SS_L_INFOEXG_SRCHINFOEXGLISTRecord rec = (SS_L_INFOEXG_SRCHINFOEXGLISTRecord)ds.infoexglist.get(i);
          
        if(i == 0)
		{
			rxw.add_ColVal("regdt_f");
			rxw.makeRecordToBulkTitle(rec);
		}
      
        rxw.add_ColVal(Util.Timestamp2Str(rec.regdt));
        
        rxw.makeRecordToBulk(rec, false);
    }
	rxw.makeHugeEnd();        

	//rxw.makeDataToBulk(ds, "infoexglist", acctTemp, "listGrid");
	rxw.flush(out);

%>