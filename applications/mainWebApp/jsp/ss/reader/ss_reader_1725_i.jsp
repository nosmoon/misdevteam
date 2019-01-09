<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1725_i.jsp
* 기능 : 비독자관리 일괄등록
* 작성일자 : 2008-08-11
* 작성자 : 권정윤
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>
<%
	// 정상적 입력여부 확인
	//String chkresult = (String)request.getAttribute("result") ;
	String strMsg = "등록되었습니다";
	
	RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm 서버처리 객체.
	int root = RwXmlWrapper.rootNodeID;
	rxw.setMessageAlert(strMsg);
	//rxw.add(root, "MsgData", strMsg);
	//System.out.println(rx.getXml());
	rxw.flush(out);	
%>
