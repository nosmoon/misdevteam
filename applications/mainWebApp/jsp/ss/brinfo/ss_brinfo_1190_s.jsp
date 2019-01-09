<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brinfo_1190_s.jsp
* 기능 : 
* 작성일자 : 2015-09-22
* 작성자 : 장선희
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_BOACCT_LISTDataSet ds = (SS_S_BOACCT_LISTDataSet)request.getAttribute("ds");


	RwXmlWrapper rxw = new RwXmlWrapper();
	
    int root = RwXmlWrapper.rootNodeID;
	int histTemp = rxw.makeParentNode(root, "getHistTemp");
	
	
	//dataSet = rxw.add(root, "gridData", "");
	
   	rxw.makeDataToBulk(ds, "histlist", histTemp, "histGrid");
	
	
	rxw.flush(out);

%>

