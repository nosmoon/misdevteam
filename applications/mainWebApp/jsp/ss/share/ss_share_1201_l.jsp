<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_1201_l.jsp
* 기능 : 정보공유 실시간 지국공지 리스트(조회)
* 작성일자 : 2009-04-15
* 작성자 : 권정윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
    SS_L_ANNCBODataSet ds = (SS_L_ANNCBODataSet)request.getAttribute("ds");    // request dataset
    applySession = true;	// 세션 적용 여부

    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // 회사코드
    //String cmpycd = "100";

    String js_fn_nm = request.getParameter("js_fn_nm");
    if(js_fn_nm == null) {js_fn_nm = "page_move";}

    String pageno = (String)request.getAttribute("pageno");
    if(pageno == null) {pageno = "1";}
    String pagesize = (String)request.getAttribute("pagesize");
    if(pagesize == null) {pagesize = "5000";} //{pagesize = "10";}

    /*String rmsgexttcd = Util.checkString((String)request.getAttribute("rmsgexttcd"));     //수신범위선택
    String rmsgdept = Util.checkString((String)request.getAttribute("rmsgdept"));         //수신부서(팀)선택
    String rmsgarea = Util.checkString((String)request.getAttribute("rmsgarea"));         //수신지역선택
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));*/

    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "resTemp");
    
    rxw.makeHugeStart(acctTemp, "listGrid", ds.anncbolist.size());
    
    for(int i=0 ; i< ds.anncbolist.size(); i++) {
    	SS_L_ANNCBOANNCBOLISTRecord rec = (SS_L_ANNCBOANNCBOLISTRecord)ds.anncbolist.get(i);
        //SS_L_INFOEXG_SRCHINFOEXGLISTRecord rec = (SS_L_INFOEXG_SRCHINFOEXGLISTRecord)ds.infoexglist.get(i);
        
        if(i == 0)
		{
			//rxw.add_ColVal("regdt_f");
			rxw.makeRecordToBulkTitle(rec);
		}
        
        //rxw.add_ColVal(Util.Timestamp2Str(rec.regdt));
        
        rxw.makeRecordToBulk(rec, false);
    }
	rxw.makeHugeEnd();        

	//rxw.makeDataToBulk(ds, "infoexglist", acctTemp, "listGrid");
	rxw.flush(out);

%>