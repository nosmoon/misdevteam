<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_2126_s.jsp
* 기능 : 보너스북 반송내역 조회 상세화면
* 작성일자 : 2003-12-08
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-02-18
* 백업파일명 : ps_send_2126_s.jsp_org
---------------------------------------------------------------------------------------------------%>

<%
	String retnseq = request.getParameter("retnseq");
    // dataset 인스턴스 선언부분
    PS_S_SEND_RETN_DTLDataSet ds = (PS_S_SEND_RETN_DTLDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
	
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	rxw.makeDataToList(ds, "bns_bookcdcur", "bns_booknm", "bns_bookcd", "선택", "", acctTemp, "bookCombo"); // 반송보너스북
	
	// 조회 결과.
	rxw.makeDataToBulk(ds, acctTemp, "detailGrid");
		
	rxw.flush(out);
	
	// data가 없을 경우 처리. 추가 필요.
%>
