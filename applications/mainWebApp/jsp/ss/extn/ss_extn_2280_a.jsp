<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2280_a.jsp
* 기능 : 확장현황-일괄확장 등록
* 작성일자 : 2011-03-30
* 작성자 : 김태희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	:
* 수정자	: 
* 수정일자	:
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_A_BATCH_EXTNDataSet ds = (SS_A_BATCH_EXTNDataSet)request.getAttribute("ds");
	int extnmovmListCount = 10;
	
  applySession = true;	// 세션 적용 여부

	//TrustForm 처리 시작
  RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	/*
	rxw.add(codeData, "applySession", String.valueOf(applySession));

	if(frdt.equals("")){
		rxw.add(codeData, "defalutDate", Util.getYear() + Util.getMonth());
	} else {
		rxw.add(codeData, "defalutDate", frdt);
	}
		
	rxw.makeDataToList(ds, "curtype1", "name", "code", "전체", "", codeData, "type1"); // 확장유형1
	rxw.makeDataToList(ds, "curtype2", "name", "code", "전체", "", codeData, "type2"); // 확장유형2 
	rxw.makeDataToList(ds, "curresitype", "name", "code", "전체", "", codeData, "resitype"); // 주거형태 
	rxw.makeDataToList(ds, "aplcpath", "name", "code", "전체", "", codeData, "aplcpath"); // 신청경로
	rxw.makeDataToList(ds, "suspresncd", "name", "code", "전체", "", codeData, "suspresncd"); // 중지사유
	*/
	rxw.flush(out);
%>


