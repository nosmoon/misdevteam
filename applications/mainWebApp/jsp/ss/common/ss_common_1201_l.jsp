<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_common_1201_l.jsp
* ��� : 
* �ۼ����� : 
* �ۼ��� :
---------------------------------------------------------------------------------------------------%>

<%
	System.out.println("jspjspsjsp");
	CO_L_NEWGUGUNDataSet ds = (CO_L_NEWGUGUNDataSet)request.getAttribute("ds");
	
    RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.
    int root = RwXmlWrapper.rootNodeID;
    //rxw.makeDataToList(ds, "curbolist", "bonm", "bocd", "��ü", "", root, "branchlist");
    rxw.makeDataToList(ds, "curcommlist", "cicdynm", "cicdynm", "��/��", "", root, "gugunlist", "record", "gugun_nm", "gugun_cd");
    
	rxw.flush(out);
%>
