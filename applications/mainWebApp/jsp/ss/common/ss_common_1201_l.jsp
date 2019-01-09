<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_common_1201_l.jsp
* 기능 : 
* 작성일자 : 
* 작성자 :
---------------------------------------------------------------------------------------------------%>

<%
	System.out.println("jspjspsjsp");
	CO_L_NEWGUGUNDataSet ds = (CO_L_NEWGUGUNDataSet)request.getAttribute("ds");
	
    RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm 서버처리 객체.
    int root = RwXmlWrapper.rootNodeID;
    //rxw.makeDataToList(ds, "curbolist", "bonm", "bocd", "전체", "", root, "branchlist");
    rxw.makeDataToList(ds, "curcommlist", "cicdynm", "cicdynm", "구/군", "", root, "gugunlist", "record", "gugun_nm", "gugun_cd");
    
	rxw.flush(out);
%>
