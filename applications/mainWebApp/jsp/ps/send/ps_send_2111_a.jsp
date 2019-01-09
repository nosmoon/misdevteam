<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_send_2111_a.jsp
* 기능     : 반송리스트 수정및 저장
* 작성일자 : 2004-03-20
* 작성자   : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응
* 수정자 : 권정윤
* 수정일자 : 2009-02-27
* 백업파일명 : ps_send_2111_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
   String gbnflag =  request.getParameter("gbnflag");
   String strMsg = "확인 되었습니다.";

   if( gbnflag == "U" ){
	   strMsg = "수정하였습니다.";
   }else{
	   strMsg = "입력하였습니다.";
   }
    
   RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm 서버처리 객체.
   int root = RwXmlWrapper.rootNodeID;
   rxw.setMessageAlert(strMsg);
   //rxw.add(root, "MsgData", strMsg);
   //System.out.println(rx.getXml());
   rxw.flush(out);
%>
