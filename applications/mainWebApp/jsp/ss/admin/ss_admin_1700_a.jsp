<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>

<%
    applySession = true;	// 技记 利侩 咯何
    
  	//TrustForm 贸府 矫累
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;	
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "uid", String.valueOf( session.getAttribute("uid")));
	
	System.out.println("uid : "+String.valueOf( session.getAttribute("uid")));
	
	rxw.flush(out);	
	
%>


