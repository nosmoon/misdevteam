<%@ page contentType="text/xml;charset=euc-kr"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : ss_brmgr_1826_s.jsp
* 기능 		 : 공통 우편번호 검색을 통해 조회된 목록
* 작성일자 	 : 2004-03-05
* 작성자 	 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-10
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>

<%
    // getting dataset
    SS_L_ADDR_TO_APTDataSet ds = (SS_L_ADDR_TO_APTDataSet)request.getAttribute("ds");  // request dataset
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeDataToBulk(ds, "curcommlist", root, "gridZip");
	
	rxw.flush(out);

%>
