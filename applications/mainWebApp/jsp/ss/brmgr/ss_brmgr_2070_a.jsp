<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1000_a.jsp
* 기능 : 지국경영-지국부수현황-초기화면
* 작성일자 : 2004-03-06
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 : 목록에서 지국을 클릭시 해당지국의 통계일람 화면을 팝업으로 보여준다.
* 수정자 : 김대섭
* 수정일자 : 2004/12/08
* 백업파일명 : 없음(코드 추가)
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-02-12
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
	SS_L_ABC_INITDataSet ds = (SS_L_ABC_INITDataSet)request.getAttribute("ds");
	String paramGbn = "##";
    //int listCount = 20;	// 한 화면당 리스트 항목 수
    int listCount = 5000;
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
    
    //TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "pagesize", listCount);
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	//rxw.add(codeData, "yymm", ds.getYyyymm());
	rxw.add(codeData, "uid", uid);
	
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
	
	//매체코드 표시.
	int comboMedi = rxw.add(codeData, "medilist", "");
	writeMediOpt(session, rxw, comboMedi, false, ds, "curmedicd", "cicdnm", "cicodeval");
	
	rxw.flush(out);
%>
