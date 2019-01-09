<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_common_1113_l.jsp
* 기능 : 지국 검색 목록(엔터키)
* 작성일자 : 2004-03-22
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응
* 수정자 : 황성진
* 수정일자 : 2009-02-09
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_BO_SRCH_TEMPDataSet ds = (SS_L_BO_SRCH_TEMPDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeDataToBulk(ds, "curbolist", root, "branchGrid");
	
	rxw.flush(out);
%>