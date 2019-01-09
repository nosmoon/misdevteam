<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_ca_1010_s.jsp
* 기능 : 사이버센터-사이버센터장-상세
* 작성일자 : 2005-04-18
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-04-02
* 백업파일명 : ss_ca_1010_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_CA_HEADDataSet ds = (SS_S_CA_HEADDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
		
	rxw.makeDataToBulk(ds, resTemp, "detailData");
    rxw.makeDataToBulk(ds, "extnlist", resTemp, "listGrid2");
	
	rxw.flush(out);
%>