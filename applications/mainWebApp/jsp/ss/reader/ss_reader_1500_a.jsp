<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1500_a.jsp
* 기능 : 독자현황-VacationStop-코드-초기화면
* 작성일자 : 2004-03-29
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-02-09
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_VSCD_INITDataSet ds = (SS_L_VSCD_INITDataSet)request.getAttribute("ds");  // request dataset
    //int vscdListCount = 12;	// 한 화면당 리스트 항목 수
    int vscdListCount = 5000;
    applySession = false;	// 세션 적용 여부

    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    int defData = rxw.add(root, "codeData", "");
		
	rxw.add(defData, "pagesize", vscdListCount);
	rxw.add(defData, "applySession", String.valueOf(applySession));
	
	//부서(팀)목록 표시.
    //rxw.makeDataToList(ds, "curdeptcd", "boksnm", "deptcd", "선택", "", defData, "teamlist", "record", "dept_nm", "dept_cd");
	rxw.makeDataToBulk(ds, "teamlist", defData, "teamlist");
	
	//파트 목록 표시 - 임시
	//int comboPart = rxw.add(defData, "partlist_temp" , "");
	//rxw.addSelectItem(comboPart, "record", "dept_nm", "dept_cd", "전체", "");
	rxw.makeDataToBulk(ds, "partlist", defData, "partlist_temp");
	
	//지역 목록 표시.
    //int comboArea = rxw.add(defData, "arealist_temp" , "");
	//writeAreaOpt(session, rxw, comboArea, false);
	rxw.makeDataToBulk(ds, "arealist", defData, "arealist_temp");
	
	//권역. 초기화에 사용하기 위해 별도 저장 필요
	rxw.makeDataToList(ds, "curarearegcd", "vaca_arearegnnm", "vaca_arearegncd", "전체", "", defData, "comboVacaArea");
	rxw.makeDataToList(ds, "curarearegcd", "vaca_arearegnnm", "vaca_arearegncd", defData, "comboVacaArea2");
	//System.out.println(rxw.getXml());
	rxw.flush(out);
%>
