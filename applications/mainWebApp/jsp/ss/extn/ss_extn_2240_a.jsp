<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2240_a.jsp
* 기능 : 확장현황-마감보고서-초기화면
* 작성일자 : 2011-12-15
* 작성자 : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	:
* 수정자	: 
* 수정일자	:
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    applySession = true;	// 세션 적용 여부

	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initData", "");
    rxw.add(initData, "closmm", (Util.addMonth(Util.getDate(),-1)).substring(0,6)); // 마감월

	rxw.flush(out);
%>

