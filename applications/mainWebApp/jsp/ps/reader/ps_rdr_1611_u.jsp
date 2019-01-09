<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_rdr_1611_u.jsp
* 기능     : 모닝+ 현금영수증 독자등급 저장후 리턴되는곳
* 작성일자 : 2004-04-26
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응
* 수정자 : 권정윤
* 수정일자 : 2009-03-05
* 백업파일명 : ps_rdr_1611_u.jsp.bak
---------------------------------------------------------------------------------------------------%>

<%
    //dataset 인스턴스 선언부분
	CO_U_RDRCRTS_GRAD_GRNTDataSet ds = (CO_U_RDRCRTS_GRAD_GRNTDataSet)request.getAttribute("ds");

	String strMsg = "";
	//현재페이지 request
	//String curr_page =   request.getParameter("pageno");

    //정상적으로 처리(저장)되었을 경우
	if("".equals(ds.getChkwantcol()) || ds.getChkwantcol() == null) {
		
	   strMsg = "수정되었습니다.";		 

	} else {
		strMsg = ds.getChkmessage();
	}

   RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm 서버처리 객체.
   int root = RwXmlWrapper.rootNodeID;
   rxw.setMessageAlert(strMsg);
   //rxw.add(root, "MsgData", strMsg);
   //System.out.println(rx.getXml());
   rxw.flush(out);
%>

