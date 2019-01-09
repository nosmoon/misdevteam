<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1400_a.jsp
* 기능 : 지국지원-상해보험-마감-초기화면
* 작성일자 : 2004-02-05
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 권정윤
* 수정일자	: 2009-03-26
* 백업파일명: ss_brsup_1400_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	int insrclosListCount = 10;

	//TrustForm 처리 시작
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initTemp", "");
	
	rxw.add(initData, "defaultDate", Util.getDate()); // 오늘날짜
			
	rxw.flush(out);	
%>

