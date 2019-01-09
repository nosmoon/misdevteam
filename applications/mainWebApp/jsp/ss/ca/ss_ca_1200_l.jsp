<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ss_ca_1200_l.jsp
* 기능     : 사이버센터-수당지급-초기화면
* 작성일자 : 2005-06-22
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 권정윤
* 수정일자	: 2009-04-02
* 백업파일명: ss_ca_1200_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    int listCount = 15;      //한 화면당 리스트 항목 수
    applySession  = true;    //세션 적용 여부
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initTemp", "");
	
	//rxw.add(initData, "defaultDate", Util.getDate()); // 오늘날짜
	
	rxw.flush(out);	
%>

