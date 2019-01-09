<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_code_1411_i.jsp
* 기능 : 코드-지사통합코드관리 저장
* 작성일자 : 2004-03-20
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응
* 수정자 : 권정윤
* 수정일자 : 2009-02-12
* 백업파일명 : ps_code_1411_i.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
	String strMsg = "";
	String accflag = request.getParameter("accflag");
	
	if( accflag.equals("I") ) {
	  strMsg = "등록 되었습니다";
	} else if( accflag.equals("U") ) {
	  strMsg = "수정 되었습니다";
	} else if( accflag.equals("D") ) {
	  strMsg = "삭제 되었습니다";
	}
	
	RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm 서버처리 객체.
	int root = RwXmlWrapper.rootNodeID;
	rxw.setMessageAlert(strMsg);
	//rxw.add(root, "MsgData", strMsg);
	//System.out.println(rx.getXml());
	rxw.flush(out);
%>


