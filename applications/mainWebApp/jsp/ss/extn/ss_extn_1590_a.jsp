<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1590_a.jsp
* 기능 : 확장현황-확장용역비용-정산내역-초기화면
* 작성일자 : 2003-12-24
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 권정윤
* 수정일자	: 2009-02-19
* 백업파일명: ss_extn_1590_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    //int adjmListCount = 10;	// 한 화면당 리스트 항목 수
    int adjmListCount = 5000;
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initTemp", "");
	
	rxw.add(initData, "defalutDate", Util.getYyyyMm());
	
	rxw.flush(out);
	
%>

