<%@ page contentType="text/xml; charset=EUC-KR" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>

<%
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int curDepth = rxw.add(root, "reqData", "");
	curDepth = rxw.add(curDepth, "reqform", "");
	curDepth = rxw.add(curDepth, "tempform", "");

	Enumeration names = request.getParameterNames();
	while(names.hasMoreElements())
	{
		rxw.add(curDepth, (String)names.nextElement(), "");
	}
	
	rxw.flush(out);
%>