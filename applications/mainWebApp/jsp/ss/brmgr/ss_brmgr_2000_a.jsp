<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : sl_reader_3100_a.jsp
* 기능      : 독자-캠페인확장대상자관리
* 작성일자  : 2005-03-03
* 작성자    : 노상현
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-04-15
* 백업파일명 : ss_brmgr_2000_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_BOSENDPCOND_INITDataSet ds = (SS_L_BOSENDPCOND_INITDataSet)request.getAttribute("ds");
	String paramGbn = "##";
	//int listCount = 15;	// 한 화면당 리스트 항목 수
	int listCount = 5000;	// 한 화면당 리스트 항목 수
	applySession = true;	// 세션 적용 여부

	// 공통코드 중 판매국 사용 매체코드가 ds에 존재하고 이중 지국확장이사통계에서 관리하고자 하는 매체코드 목록을 아래에 정의한다.
	// 스포츠조선 사원은 스포츠조선 매체만 보이게 한다.
	String[] medicdList = null;
	String cmpycd = (String)session.getAttribute("cmpycd");
	if("203".equals(cmpycd)){
		medicdList = new String[1];
		medicdList[0] = "610";
	}else{
		medicdList = new String[4];
		medicdList[0] = "110";
		medicdList[1] = "130";
		medicdList[2] = "610";
		medicdList[3] = "715";
	}

    // 20041208 김대섭 추가
    // 판매지국 통계일람 팝업시 필수항목
	String uid = (String)session.getAttribute("uid");
    
    
    long curr_page_no = ((String)request.getParameter("pageno") == null)? 1 : Long.parseLong(request.getParameter("pageno"));
    long records_per_page = ((String)request.getParameter("pagesize") == null)? 15 : Long.parseLong(request.getParameter("pagesize"));

    long start_no = ((curr_page_no - 1) * records_per_page)  + 1;
    
  //TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
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
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "pagesize", listCount);
	
	rxw.add(codeData, "sech_campdate_s", Util.getDate());
	rxw.add(codeData, "sech_campdate_e", Util.getDate());
	
	rxw.flush(out);
    
%>