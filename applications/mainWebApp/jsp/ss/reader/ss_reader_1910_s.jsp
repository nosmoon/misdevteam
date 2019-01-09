<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1910_s.jsp
* 기능 : 독자현황-우송독자관리 상세
* 작성일자 : 2015-06-18
* 작성자 : 장선희
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_POSTDLVRDRDataSet ds = (SS_S_POSTDLVRDRDataSet)request.getAttribute("ds");
	
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	

	rxw.makeDataToBulk(ds, resTemp, "detailData");
		
	rxw.flush(out);
	
%>

