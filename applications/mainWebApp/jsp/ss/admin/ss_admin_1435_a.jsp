<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1435_a.jsp
* 기능 : 관리자-작업-이력-초기화면
* 작성일자 : 2004-04-10
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 권정윤
* 수정일자	: 2009-04-01
* 백업파일명: ss_admin_1435_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    int wrkListCount = 10;		// 한 화면당 리스트 항목 수
    int wrkdtlListCount = 5;	// 한 화면당 리스트 항목 수(내역)
    applySession = true;		// 세션 적용 여부

	SS_L_WRKHIST_INITDataSet ds = (SS_L_WRKHIST_INITDataSet)request.getAttribute("ds");
    
	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initTemp", "");
	
	rxw.add(initData, "defaultDate", Util.getDate()); // 오늘날짜	
	rxw.makeDataToList(ds, "wrklist", "descri", "id", "전체", "", initData, "idCombo"); // 아이디
		
	rxw.flush(out);	
%>
