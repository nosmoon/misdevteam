<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1415_i.jsp
* 기능 : 관리자-작업-등록-등록
* 작성일자 : 2004-04-09
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응
* 수정자 : 권정윤
* 수정일자 : 2009-04-01
* 백업파일명 : ps_admin_1415_i.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
   String strMsg = "추가되었습니다.";
  
   RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm 서버처리 객체.
   int root = RwXmlWrapper.rootNodeID;
   rxw.setMessageAlert(strMsg);
   //rxw.add(root, "MsgData", strMsg);
   //System.out.println(rx.getXml());
   rxw.flush(out);
%>