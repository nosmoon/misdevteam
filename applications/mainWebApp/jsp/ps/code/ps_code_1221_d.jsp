<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_code_1221_d.jsp
* 기능 : 매체단가 삭제
* 작성일자 : 2004-02-20
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응
* 수정자 : 권정윤
* 수정일자 : 2009-02-12
* 백업파일명 : ps_code_1216_u.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
   String strMsg = "삭제되었습니다.";
  
   RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm 서버처리 객체.
   int root = RwXmlWrapper.rootNodeID;
   //rxw.add(root, "MsgData", strMsg);
   rxw.setMessageAlert(strMsg);

   //System.out.println(rx.getXml());
   rxw.flush(out);
%>



