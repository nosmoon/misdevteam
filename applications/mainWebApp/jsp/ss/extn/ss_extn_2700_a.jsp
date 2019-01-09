<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2300_a.jsp
* 기능 : 확장현황-사원구독관리-초기화면
* 작성일자 : 2013-3-5
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>

<%
	SS_L_EMP_NWSPRDR_INITDataSet ds = (SS_L_EMP_NWSPRDR_INITDataSet)request.getAttribute("ds");
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "cntrno", ds.getMaxcntrno() ); // 기간 시작  ds.getMaxcntrno()
	
	rxw.makeDataToList(ds, "curcmpylist", "dept_nm", "dept_cd", "전체", "", codeData, "teamlist"); // 오류
	
	rxw.flush(out);	
%>
