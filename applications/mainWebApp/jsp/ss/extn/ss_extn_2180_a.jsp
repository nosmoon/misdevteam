<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2180_a.jsp
* 기능 : 확장현황-사원확장비관리 초기화면
* 작성일자 : 2009-05-29
* 작성자 : 권정윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_EXTN_COST_INITDataSet ds = (SS_L_EXTN_COST_INITDataSet)request.getAttribute("ds");
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "yyyymm", Util.getYear() + "0101"); // 기간 시작
	rxw.add(codeData, "yyyymmdd", Util.getDate()); // 기간 끝
		
	rxw.makeDataToList(ds, "curmedicd", "cicdnm", "cicodeval", "전체","", codeData, "mediCombo"); // 조회 리스트에서 이용
	rxw.makeDataToList(ds, "curmedicd", "cicdnm", "cicodeval", codeData, "mediCombo1"); // 신규등록 팝업에서 이용
	
	rxw.flush(out);	
%>
