<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1080_a.jsp
* 기능 : 관리자-계정코드-초기화면
* 작성일자 : 2004-05-01
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 권정윤
* 수정일자	: 2009-04-01
* 백업파일명: ss_admin_1080_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
//	dataset 인스턴스 선언부분
	SS_L_ACCTCD_INITDataSet ds = (SS_L_ACCTCD_INITDataSet)request.getAttribute("ds");
	int listCount = 10;		// 화면 당 항목 수
	
	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initTemp", "");
	
	//rxw.add(initData, "defaultDate", Util.getDate()); // 오늘날짜
	
	rxw.makeDataToList(ds, "imptexpnclsfcur", "cicdnm", "cicodeval", "전체", "", initData, "gubunCombo"); // 구분
	rxw.makeDataToList(ds, "imptexpnclsfcur", "cicdnm", "cicodeval", "전체", "", initData, "gubunCombo1"); // 구분
		
	rxw.flush(out);	
%>

