<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1800_a.jsp
* 기능 : 이마상담-이마TM확장
* 작성일자 : 2013-5-8
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>

<%
	SS_L_CAMP_TM_EXTN_INITDataSet ds = (SS_L_CAMP_TM_EXTN_INITDataSet)request.getAttribute("ds");
   
	
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "defaultFrom", Util.getDate()); //날짜
	rxw.add(codeData, "defaultTo", Util.getDate()); //날짜
	
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
	
	rxw.makeDataToBulk(ds, "subscnfmstatcdcur", codeData, "subscnfmstatcd");
	
	rxw.flush(out);
%>