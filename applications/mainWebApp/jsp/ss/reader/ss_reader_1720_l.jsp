<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명        : ss_reader_1720_l.jsp
* 기능             : 독자현황-비독자관리 상세조회
* 작성일자   : 2009-08-07
* 작성자        : 권정윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	    // getting dataset
    SS_S_RDR_MNGMEMBDataSet ds = (SS_S_RDR_MNGMEMBDataSet)request.getAttribute("ds");  // request dataset

  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
		
	rxw.makeDataToBulk(ds, "rdrmngmemb", resTemp, "detailGrid");
	
	rxw.flush(out);
%>
