<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ss_reader_1600_a.jsp
* 기능     : 독자현황-독자등급관리-초기화면
* 작성일자 : 2004-04-21
* 작성자   : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 이름으로 지국검색 대신 지국목록 변경
* 수정자   : 김대섭
* 수정일자 : 2005-05-06
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 검색조건 및 조회내용 변경(현금영수증 및 회원명 추가)
* 수정자   : 김대섭
* 수정일자 : 2005-11-23
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 오류사유코드를 flag로 이용하여 현금영수증, 모플가입 조회를 별도로한다.
* 수정자   : 김대섭
* 수정일자 : 2005-11-24
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 권정윤
* 수정일자	: 2009-04-08
* 백업파일명: ss_reader_1600_a.jsp
---------------------------------------------------------------------------------------------------%>
<%
    //dataset 인스턴스 선언부분
	SS_L_RDRCRTS_INITDataSet ds = (SS_L_RDRCRTS_INITDataSet)request.getAttribute("ds");

    //화면에 보여줄 레코드 수 설정
    int   listCount  =  20;
    
  //TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "defaultDate", Util.getDate());
	
	//부서(팀)목록 표시.
	//int comboTeam = rxw.add(codeData, "teamlist" , "");
	//writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	//파트 목록 표시 - 임시
	//rxw.makeEmpytList(codeData, "partlist_temp", "record", "dept_nm", "dept_cd", "전체", "");
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	
	//지역 목록 표시.
    //int comboArea = rxw.add(codeData, "arealist_temp" , "");
	//writeAreaOpt(session, rxw, comboArea, true);
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	//지국 목록 표시
	//rxw.makeEmpytList(codeData, "codelist", "record", "cdnm", "cd", "전체", "");
	
	rxw.makeDataToList(ds, "curdtlsprocstatcd", "cicdnm", "cicodeval", "전체", "", codeData, "userCombo"); // 모플회원
	rxw.makeDataToList(ds, "currmblestat", "cicdnm", "cicodeval", "전체", "", codeData, "mobileCombo"); // 모바일상태
	rxw.makeDataToList(ds, "currecstat", "cicdnm", "cicodeval", "전체", "", codeData, "cashCombo"); // 현금영수증
	
	rxw.flush(out);
%>

