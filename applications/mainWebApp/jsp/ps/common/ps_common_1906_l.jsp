<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_common_1906_l.jsp
* 기능 : 지국 검색 목록(엔터키)
* 작성일자 : 2004-03-22
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	PS_L_BO_SRCHDataSet ds = (PS_L_BO_SRCHDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeDataToBulk(ds, "curbolist", root, "branchGrid");
	
	rxw.flush(out);
%>