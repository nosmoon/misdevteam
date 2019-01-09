<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brinfo_1160_i.jsp
* 기능 : 지국경영-계좌관리(실시간계좌이체) 등록,수정,삭제
* 작성일자 : 2006-11-28
* 작성자 : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응
* 수정자 : 황성진
* 수정일자 : 2009-01-23
* 백업파일명 : ss_brinfo_1160_i.jsp_org
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
   } else {
     strMsg = "처리 되었습니다";
   }
   
   RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm 서버처리 객체.
   int root = RwXmlWrapper.rootNodeID;
   rxw.add(root, "MsgData", strMsg);
   //System.out.println(rx.getXml());
   rxw.flush(out);
%>

