<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_4340_l.jsp
* ��� : ������ ����Ʈ
* �ۼ����� : 2016-02-29
* �ۼ��� :
---------------------------------------------------------------------------------------------------%>

<%
    SS_L_MO_SVYLISTDataSet ds = (SS_L_MO_SVYLISTDataSet)request.getAttribute("ds");

    RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.
    int root = RwXmlWrapper.rootNodeID;

    //rxw.makeDataToList(ds, "curbolist", "bonm", "bocd", "��ü", "", root, "branchlist");
    rxw.makeDataToList(ds, "mosvylist", "svynm", "svyid", "��ü", "", root, "svylist", "record", "svynm", "svyid");

	rxw.flush(out);
%>
