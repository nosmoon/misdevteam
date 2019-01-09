<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명        : ss_brmgr_2050_l.jsp
* 기능             : 아파트 투입률 리스트
* 작성일자   : 2009-08-13
* 작성자        : 권정윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_APTDONGUNITTHRWDataSet ds = (SS_L_APTDONGUNITTHRWDataSet)request.getAttribute("ds");  // request dataset

  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.makeDataToBulk(ds, "dongcur", resTemp, "listGrid");
	
	rxw.flush(out);
%> 
