<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>

<%
	SL_S_EXTNCLOS_DTLSDataSet ds = (SL_S_EXTNCLOS_DTLSDataSet)request.getAttribute("ds");
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	
	//dataSet = rxw.add(root, "gridData", "");
	rxw.makeDataToBulk(ds, root, "detailData");

	rxw.flush(out);

%>

<% /* 작성시간 : Mon Nov 14 14:27:37 KST 2011 */ %>