<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_commun_2650_a.jsp
* 기능 	 	 : 판매지국-통신실 아파트투입 현황조사 및 등록 초기화면
* 작성일자 	 : 2004-02-24
* 작성자 	 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-14
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>

<%
	// dataset 인스턴스 선언부분
    SL_A_COMM_APT_THRWDataSet ds = (SL_A_COMM_APT_THRWDataSet)request.getAttribute("ds");  // request dataset

	String acc_flg = request.getParameter("accflag");
	String hmflag = request.getParameter("hmflag");
    String invsgdt = request.getParameter("invsgdt");
    String addrcd = request.getParameter("addrcd");
    String dongno = request.getParameter("dongno");
    
  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;

	String msg = "";
	if("I".equals(acc_flg) && "H".equals(hmflag))
		msg = "등록 되었습니다";
	else if("U".equals(acc_flg) && "H".equals(hmflag))
		msg = "수정 되었습니다";
	else if("D".equals(acc_flg) && "H".equals(hmflag))
		msg = "삭제 되었습니다";
	
	rxw.setMessageAlert(msg);
	
	rxw.flush(out);
%>
