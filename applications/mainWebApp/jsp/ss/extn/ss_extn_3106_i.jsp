<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2236_i.jsp
* 기능 : 확장현황-점검마감
* 작성일자 : 2011-11-23
* 작성자 : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>
<%
   SL_U_EXTNCLOS_JM_CLOSEDataSet ds = (SL_U_EXTNCLOS_JM_CLOSEDataSet)request.getAttribute("ds");
  
   String strMsg = "처리되었습니다"; //ds.getResult();	//"저장되었습니다.";
  
   RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm 서버처리 객체.
   int root = RwXmlWrapper.rootNodeID;
   rxw.setMessageAlert(strMsg);

   rxw.flush(out);
%>