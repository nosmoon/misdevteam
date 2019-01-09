<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : ss_extn_2820_s.jsp
* 기능 		 : 확장현황-센터비독자관리-상세조회
* 작성일자 	 : 2013-07-02
* 작성자 	 : 이혁
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_RDR_RDRAREADataSet ds = (SS_S_RDR_RDRAREADataSet)request.getAttribute("ds");
	
    	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	/*rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", vscdListCount);
	rxw.add(resTemp, "page_set_gubun", 0);*/

	rxw.makeDataToBulk(ds, resTemp, "detailData");
		
	rxw.flush(out);
	
%>