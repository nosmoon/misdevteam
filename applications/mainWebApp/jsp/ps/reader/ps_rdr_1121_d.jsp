<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_rdr_1121_d.jsp
* 기능     : 확장독자관리 화면에서 확장독자를 삭제한후 리턴되는곳
* 작성일자 : 2004-02-28
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응
* 수정자 : 권정윤
* 수정일자 : 2009-02-25
* 백업파일명 : ps_rdr_1116_u.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
   String strMsg = "삭제되었습니다.";
  
   RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm 서버처리 객체.
   int root = RwXmlWrapper.rootNodeID;
   rxw.setMessageAlert(strMsg);
   //rxw.add(root, "MsgData", strMsg);
   //System.out.println(rx.getXml());
   rxw.flush(out);
%>