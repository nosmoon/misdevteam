<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1800_a.jsp
* 기능 :
* 작성일자 : 2006-06-07
* 작성자 : 이혁
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 권정윤
* 수정일자	: 2009-02-19
* 백업파일명: ss_extn_1800_a.jsp
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_READER_BOINFO_INITDataSet ds = (SS_L_READER_BOINFO_INITDataSet)request.getAttribute("ds");
    //int listCount = 20;		// 한 화면당 리스트 항목 수
    int listCount = 5000;
    applySession = true;	// 세션 적용 여부

    String strFromDt = "";
    String strToDt = "";

    strFromDt = (Util.addDate( (Util.getDate()).substring(0,6) + "01", -1 )).substring( 0, 6 ) + "21";
    strToDt = (Util.getDate()).substring(0,6) + "20";
	
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "defaultFrom", strFromDt);
	rxw.add(codeData, "defaultTo", strToDt);
	
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
	
	rxw.flush(out);
%>
