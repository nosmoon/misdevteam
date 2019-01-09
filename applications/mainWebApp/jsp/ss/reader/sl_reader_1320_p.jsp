<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_reader_1320_p_jsp
* 기능 		 : 독자정보관리(중지팝업)(초기화면) /ss/slreader/1320
* 작성일자 	 : 2003-12-12
* 작성자 	 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-02
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>

<%
	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "bocd", Util.getSessionParameterValue(request, "bocd", true));
	rxw.add(resTemp, "today", Util.getDate());
	
	rxw.flush(out);
%>

