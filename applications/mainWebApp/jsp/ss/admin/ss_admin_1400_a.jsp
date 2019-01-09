<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1400_a.jsp
* 기능 : 관리자-작업-등록-초기화면
* 작성일자 : 2004-04-09
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 권정윤
* 수정일자	: 2009-04-01
* 백업파일명: ss_admin_1400_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_WRK_INITDataSet ds = (SS_L_WRK_INITDataSet)request.getAttribute("ds");
    int wrkListCount = 12;	// 한 화면당 리스트 항목 수
    applySession = true;	// 세션 적용 여부
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initTemp", "");
	
	//rxw.add(initData, "defaultDate", Util.getDate()); // 오늘날짜
	
	rxw.makeDataToList(ds, "curcommlist", "cicdnm", "cicodeval", "전체", "", initData, "cycleCombo"); // 구분
	rxw.makeDataToList(ds, "curcommlist", "cicdnm", "cicodeval", "전체", "", initData, "cycleCombo1"); // 구분
		
	rxw.flush(out);	
%>

