<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1320_u.jsp
* 기능 : 지국경영-부수증감 본지신청(부수담당) 마감
* 작성일자 : 2004-03-18
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-02-17
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	//TrustForm 처리 시작
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	rxw.add(root, "MsgData", "수정되었습니다.");
	
	rxw.flush(out);
%>
