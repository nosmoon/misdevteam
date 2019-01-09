<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_share_1206_l.jsp
* 기능 : 정보공유 게시판 공지사항 검색리스트 가져오기
* 작성일자 : 2004-02-24
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-03-03
* 백업파일명 : ps_send_1206_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
    PS_L_INFOEXG_SRCHDataSet ds = (PS_L_INFOEXG_SRCHDataSet)request.getAttribute("ds");    // request dataset

    String js_fn_nm = request.getParameter("js_fn_nm");
    if(js_fn_nm == null) {js_fn_nm = "page_move";}

    String curr_page_no = (String)request.getAttribute("curr_page_no");
    if(curr_page_no == null) {curr_page_no = "1";}
    String records_per_page = (String)request.getAttribute("records_per_page");
    if(records_per_page == null) {records_per_page = "20";}

    int no_data_page = Integer.parseInt(records_per_page) -ds.infoexglist.size();

    String rmsgexttcd = Util.checkString((String)request.getAttribute("rmsgexttcd"));

    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // 조회 결과.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
    
  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid");
	
	for(int i=0; i < ds.infoexglist.size() ; i++)
	{
		PS_L_INFOEXG_SRCHINFOEXGLISTRecord rec = (PS_L_INFOEXG_SRCHINFOEXGLISTRecord)ds.infoexglist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("incmgdt_detail");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rec);
		}

		//데이터 추가.
		rxw.add_ColVal(Util.Timestamp2Str(rec.incmgdt, "yyyyMMdd' '"));
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.

%>


