<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1830_a.jsp
* 기능 : 지국지원-빌링-수납수수료-마감-초기화면
* 작성일자 : 2004-03-09
* 작성자 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-12
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    //int listCount = 20;	// 한 화면당 리스트 항목 수
    int listCount = 5000;	// 한 화면당 리스트 항목 수
    
  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int defaultData = rxw.add(root, "defaultData", "");
	
	rxw.add(defaultData, "frdt", Util.addDate(Util.getDate(),-120));
	rxw.add(defaultData, "todt", Util.getDate());
	rxw.add(defaultData, "pagesize", listCount);
	
	rxw.flush(out);
%>
