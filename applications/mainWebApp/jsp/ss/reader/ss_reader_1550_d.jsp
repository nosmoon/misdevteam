<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명	: ss_reader_1550_d.jsp
* 기능		: 독자현황-VacationStop-코드-삭제
* 작성일자	: 2004-03-29
* 작성자	: 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 김용욱
* 수정일자	: 2009-03-06
* 백업파일명: ss_reader_1550_d.jsp.bak
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
