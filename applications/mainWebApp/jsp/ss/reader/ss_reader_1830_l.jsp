<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1830_l.jsp
* ��� : ķ���� ����Ʈ 
* �ۼ����� : 2013-5-29
* �ۼ��� :
---------------------------------------------------------------------------------------------------%>

<%
	SS_L_TM_CAMPLISTDataSet ds = (SS_L_TM_CAMPLISTDataSet)request.getAttribute("ds");

    RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.
    int root = RwXmlWrapper.rootNodeID;
   
    //rxw.makeDataToList(ds, "curbolist", "bonm", "bocd", "��ü", "", root, "branchlist");
    rxw.makeDataToList(ds, "curcamplist", "campnm", "campid", "��ü", "", root, "camplist", "record", "cdnm", "cd");
    
	rxw.flush(out);
%>
