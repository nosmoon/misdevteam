<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_reader_1370_p.jsp
* 기능 		 : 독자정보관리(판촉물내역팝업-초기화면)
* 작성일자 	 : 2003-12-12
* 작성자 	 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-07
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>

<%
	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "frpaydt", Util.addDays(Util.getDate(), -730, "yyyyMMdd", "yyyyMMdd" ));
	rxw.add(resTemp, "topaydt", Util.addDays(Util.getDate(), 365, "yyyyMMdd", "yyyyMMdd" ));
	rxw.add(resTemp, "paydt", Util.getDate());
	
	rxw.flush(out);
%>
