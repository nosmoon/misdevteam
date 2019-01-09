<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1610_a.jsp
* 기능 : 관리자-마스터 우편번호 변경처리-초기화면
* 작성일자 : 2004-05-07
* 작성자 : 권정윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: 
* 수정자	: 
* 수정일자	: 
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_CHGZIPCODE_INITDataSet ds = (SS_L_CHGZIPCODE_INITDataSet)request.getAttribute("ds");
    int wrkListCount = 12;	// 한 화면당 리스트 항목 수
    applySession = true;	// 세션 적용 여부
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initTemp", "");
		
	rxw.makeDataToList(ds, "curdatelist", "workvernm", "workver", initData, "dateCombo"); //변경발생일
		
	rxw.flush(out);	
%>

