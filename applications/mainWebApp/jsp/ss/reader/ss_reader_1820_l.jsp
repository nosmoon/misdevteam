<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1820_l.jsp
* ��� : ���� ����Ʈ 
* �ۼ����� : 2013-5-10
* �ۼ��� :
---------------------------------------------------------------------------------------------------%>

<%
	SS_L_TM_AGENTLISTDataSet ds = (SS_L_TM_AGENTLISTDataSet)request.getAttribute("ds");

    RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.
    int root = RwXmlWrapper.rootNodeID;
    //rxw.makeDataToList(ds, "curbolist", "bonm", "bocd", "��ü", "", root, "branchlist");
    rxw.makeDataToList(ds, "curagentlist", "agentnm", "agentid", "��ü", "", root, "agentlist", "record", "cdnm", "cd");
    
    
	rxw.flush(out);
%>
