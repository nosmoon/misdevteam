<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_common_1117_l.jsp
* ��� : 
* �ۼ����� : 
* �ۼ��� :
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������ : Ȳ����
* �������� : 2009-01-23
* ������ϸ� : ss_common_1116_l.jsp_org
* �������� : TrustForm ����.
---------------------------------------------------------------------------------------------------%>
<%
	SL_L_GUGUNDataSet ds = (SL_L_GUGUNDataSet)request.getAttribute("ds");
    
    RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.
    int root = RwXmlWrapper.rootNodeID;
    //rxw.makeDataToList(ds, "curbolist", "bonm", "bocd", "��ü", "", root, "branchlist");
    rxw.makeDataToList(ds, "curcommlist", "cicdynm", "cicdynm", "��/��", "", root, "gugunlist", "record", "gugun_nm", "gugun_cd");
    
	rxw.flush(out);
%>
