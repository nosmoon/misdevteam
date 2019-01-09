<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1740_a.jsp
* 기능 : 지국업무지원-Billing자동이체-신청관리-초기화면
* 작성일자 : 2004-03-25
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-15
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    String concatDelimiter = "##";	// 입금처리 시 강 항목을 concatenate할 때 사용되는 delimiter
    
    SS_L_APLC_MANG_INITDataSet ds = (SS_L_APLC_MANG_INITDataSet)request.getAttribute("ds");
    
    int moveListCount = 5000;	// 한 화면당 리스트 항목 수 19 -> 5000
    applySession = false;	// 세션 적용 여부
    
  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	int boSearchForm = rxw.add(codeData, "boSearchForm", "");
	rxw.add(boSearchForm, "applySession", String.valueOf(applySession));
	rxw.add(boSearchForm, "pagesize", moveListCount);
	rxw.add(boSearchForm, "aplcdt", Util.getDate().substring(0,6));
	
	//지역.
	rxw.makeDataToBulkList(ds, "jycur", "areanm", "areacd", "전체", "", codeData, "arealist", "record", "area_nm", "area_cd", false);
	
	//이체구분.
	rxw.makeDataToBulkList(ds, "shftclsf", "cicdnm", "cicodeval", "전체", "", codeData, "shftclsfCombo");
	
	//처리상태. default : 10
	rxw.makeDataToBulkList(ds, "aplcprocstat", "cicdnm", "cicodeval", "전체", "", codeData, "aplcprocstatCombo");
	
	//신청구분.
	rxw.makeDataToBulkList(ds, "aplcclsf", "cicdnm", "cicodeval", "전체", "", codeData, "aplcclsfCombo");
	
	rxw.flush(out);
%>
