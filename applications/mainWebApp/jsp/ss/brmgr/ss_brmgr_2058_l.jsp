<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_2058_l.jsp
* 기능 : 지국지원-동단위 아파트 투입률-초기화면
* 작성일자 : 2009-08-21
* 작성자 : 권정윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: 
* 수정자	: 
* 수정일자	: 
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
SS_L_APTDONGUNITTHRW_INIT1DataSet ds = (SS_L_APTDONGUNITTHRW_INIT1DataSet)request.getAttribute("ds");
    
	//TrustForm 처리 시작
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "invsgdt1", Util.getYear()+"0101");
	rxw.add(codeData, "invsgdt2", Util.getDate());
	
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
	rxw.makeEmpytList(codeData, "codelist", "record", "cdnm", "cd", "전체", "");
	
	//아파트 목록 표시
	rxw.makeEmpytList(codeData, "aptlist", "전체", "");
	
	//동 목록 표시
	rxw.makeEmpytList(codeData, "donglist", "전체", "");
	
	rxw.flush(out); 
%>
