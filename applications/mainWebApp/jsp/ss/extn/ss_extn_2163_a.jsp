<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2163_a.jsp
* 기능 : 확장현황-에듀/제휴-독자등록 초기화면
* 작성일자 : 2009-05-26
* 작성자 : 권정윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_EXTN_EDURDR_INITDataSet ds = (SS_L_EXTN_EDURDR_INITDataSet)request.getAttribute("ds");
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "yyyymm", Util.getYear() + Util.getMonth()); // 기간 시작
	rxw.add(codeData, "yyyymmdd", Util.getDate()); // 기간 끝
	
	rxw.makeDataToList(ds, "curinstcd", "insttnm", "insttcd", codeData, "instCombo");
	rxw.makeDataToList(ds, "curmedicd", "cicdnm", "cicodeval", codeData, "mediCombo");
	
	rxw.flush(out);	
%>
