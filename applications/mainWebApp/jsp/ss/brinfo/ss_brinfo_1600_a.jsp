<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : ss_brinfo_1600_a.jsp
* 기능 	 	 : 지국info-발송노선정보조회 초기화면
* 작성일자 	 : 2004-04-02
* 작성자 	 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 권정윤
* 수정일자	: 2009-03-17
* 백업파일명: ss_brinfo_1600_a.jsp
---------------------------------------------------------------------------------------------------%>

<%
    //	dataset 인스턴스 선언부분
    //chosun.ciis.ss.sls.common.ds.SS_L_NWBUSEOCDDataSet ds = (chosun.ciis.ss.sls.common.ds.SS_L_NWBUSEOCDDataSet)request.getAttribute("ds");  // request dataset
    SS_L_BSNS_INITDataSet ds = (SS_L_BSNS_INITDataSet)request.getAttribute("ds");  // request dataset
	int listCount = 20;		// 한화면에 조회되는 레코드수
    applySession = true;	// 세션 적용 여부
    
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
	rxw.makeEmpytList(codeData, "codelist", "record", "cdnm", "cd", "전체", "");
	
	rxw.flush(out);
	
%>

