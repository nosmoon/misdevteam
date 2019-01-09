<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1010_l.jsp
* 기능 : 확장현황-신청현황-확장자소속 목록
* 작성일자 : 2003-11-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-02309
* 백업파일명 : ss_extn_1010_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_EXTNBLNGCDDataSet ds = (SS_L_EXTNBLNGCDDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initTemp = rxw.add(root, "initTemp", "");
	       
	rxw.makeDataToList(ds, "curcommlist", "cicdnm", "cicodeval", "전체", "", initTemp, "extnCombo");  // 확장자소속
	rxw.flush(out);    
%>