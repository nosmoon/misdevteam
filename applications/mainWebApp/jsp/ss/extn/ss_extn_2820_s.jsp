<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : ss_extn_2820_s.jsp
* ��� 		 : Ȯ����Ȳ-���ͺ��ڰ���-����ȸ
* �ۼ����� 	 : 2013-07-02
* �ۼ��� 	 : ����
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