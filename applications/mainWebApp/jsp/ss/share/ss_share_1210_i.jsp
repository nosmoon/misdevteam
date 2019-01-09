<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_1200_a.jsp
* 기능 : 정보공유 실시간지국공지-초기화면
* 작성일자 : 2003-12-18
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-03-16
* 백업파일명 : ss_share_1200_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-04-14
* 백업파일명 : ss_share_1210_i.jsp.bak
---------------------------------------------------------------------------------------------------%>

<%
    SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet)request.getAttribute("ds");  // request dataset
    applySession = true;	// 세션 적용 여부
    
  	RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
        
    rxw.add(initTemp, "applySession", String.valueOf(applySession));
    
    // 세션으로부터 등록자정보를 얻는다.
	String deptnm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "selldeptnm", false)); 	//부서(팀)명
	String posinm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "posinm", false)); 		//직책명
	String emp_nm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "emp_nm", false)); 		//성명
	
	rxw.add(initTemp, "deptnm", Util.Uni2Ksc(Util.getSessionParameterValue(request, "selldeptnm", false))); //팀
	rxw.add(initTemp, "posinm", Util.Uni2Ksc(Util.getSessionParameterValue(request, "posinm", false))); //직책
	rxw.add(initTemp, "emp_nm", Util.Uni2Ksc(Util.getSessionParameterValue(request, "emp_nm", false))); //등록자	
	rxw.add(initTemp, "defaultFrom", Util.getDate()); //공지시작날짜
	rxw.add(initTemp, "defaultTimeFrom", Util.getTime().toString().replaceAll(":","")); //공지시작시간
	rxw.add(initTemp, "defaultTo", Util.getDate()); //공지종료날짜
	rxw.add(initTemp, "defaultTimeTo", Util.getTime().toString().replaceAll(":","")); //공지종료시간
	
	//부서(팀)목록 표시.
	int comboTeam = rxw.add(initTemp, "teamlist" , "");
	writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	
	//지역 목록 표시.
    int comboArea = rxw.add(initTemp, "arealist_temp" , "");
	writeAreaOpt(session, rxw, comboArea, true);
    
	rxw.flush(out);
%>
