<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_share_1216_i.jsp
* 기능 : 정보공유 게시판 공지사항 등록
* 작성일자 : 2004-02-24
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응
* 수정자 : 권정윤
* 수정일자 : 2009-03-11
* 백업파일명 : ps_share_1216_i.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	// 정상적 입력여부 확인
	String chkresult = (String)request.getAttribute("result") ;
	String strMsg = "";
	
	if(chkresult == "false" ){
		strMsg = "파일 첨부중 용량을 초과했거나 오류가 발생하였습니다.\n용량이 5M가 넘습니다.";	
	} else {
		strMsg = "등록되었습니다.";  
	}
	
	RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm 서버처리 객체.
	int root = RwXmlWrapper.rootNodeID;
	rxw.setMessageAlert(strMsg);
	//rxw.add(root, "MsgData", strMsg);
	//System.out.println(rx.getXml());
	rxw.flush(out);	
%>