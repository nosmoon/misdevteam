<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_send_2506_u.jsp
* 기능     : 배달비마감-마감/마감취소
* 작성일자 : 2008-07-29
* 작성자   : 김재일
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응
* 수정자 : 권정윤
* 수정일자 : 2009-03-03
* 백업파일명 : ps_send_2506_u.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    String accflag	=	request.getParameter("accflag");

	String strMsg = "";
	
	if(accflag.equals("M")){
		strMsg = "배달비마감이 완료되었습니다.";
	} else if(accflag.equals("C")){
		strMsg = "배달비마감이 취소되었습니다.";
	}
	
	RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm 서버처리 객체.
	int root = RwXmlWrapper.rootNodeID;
	rxw.setMessageAlert(strMsg);
	//rxw.add(root, "MsgData", strMsg);
	//System.out.println(rx.getXml());
	rxw.flush(out);
%>

