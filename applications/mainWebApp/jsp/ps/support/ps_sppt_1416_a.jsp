<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_sppt_1416_a.jsp
* 기능  : 현금영수증 입력/삭제
* 작성일자 : 2004-06-10
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응
* 수정자 : 권정윤
* 수정일자 : 2009-02-25
* 백업파일명 : ps_sppt_1416_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
   String flag = Util.checkString(request.getParameter("flag"));
   String strMsg = "";

   if(flag == "I") {
      strMsg = "신청 되었습니다.";
   } else if(flag == "U") {
	  strMsg = "수정 되었습니다.";
   } else if(flag == "D") {
	  strMsg = "취소 되었습니다.";
   }
  
   RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm 서버처리 객체.
   int root = RwXmlWrapper.rootNodeID;
   rxw.add(root, "MsgData", strMsg);
   //System.out.println(rx.getXml());
   rxw.flush(out);
%>
