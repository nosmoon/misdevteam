<%@ page contentType="text/xml; charset=ISO-8859-1" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_1315_i.jsp
* 기능 : 정보공유 게시판 공지사항 등록
* 작성일자 : 2003-12-08
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-03-19
* 백업파일명 : ss_share_1315_i.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	// 정상적 입력여부 확인
	//String chkresult = (String)request.getAttribute("result") ;
	String strMsg = "등록되었습니다.";
	
	RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm 서버처리 객체.
	int root = RwXmlWrapper.rootNodeID;
	rxw.setMessageAlert(strMsg);
	//rxw.add(root, "MsgData", strMsg);
	//System.out.println(rx.getXml());
	rxw.flush(out);	
%>