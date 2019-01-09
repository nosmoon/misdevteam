<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1230_a.jsp
* 기능 : 지국경영-부수증감 신청(담당)-초기화면
* 작성일자 : 2004-03-18
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-02-17
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%--
	본지를 제외한 부수증감신청은 소년(130),주간(110),스포츠(610),수능(111) 항목에 대해서만 처리한다.
	추가적인 매체에 대해 처리할 경우는  주석처리된 input 파라미터를 해제한다.(ss_brmgr_1240_l.jsp)
	본지를 제외한 부수증감신청 마감은 영업담당의 마감여부와 상관없이 처리한다.
--%>
<%
	SS_L_QTYAPLC_INITDataSet ds = (SS_L_QTYAPLC_INITDataSet)request.getAttribute("ds");
	//int listCount = 10;
	int listCount = 5000;
	applySession = true;	// 세션 적용 여부
	
	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "dt_clsf", Util.getDate());
	
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
	
	rxw.flush(out);
%>
