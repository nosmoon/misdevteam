<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_common_1116_l.jsp
* ��� : ���� �����ڵ�,������ ��� ��������
* �ۼ����� : 2005-04-14
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
	SS_L_BOLISTDataSet ds = (SS_L_BOLISTDataSet)request.getAttribute("ds");
    String applySessionStr = (String)request.getParameter("applySession");

    RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.
    int root = RwXmlWrapper.rootNodeID;
    //rxw.makeDataToList(ds, "curbolist", "bonm", "bocd", "��ü", "", root, "branchlist");
    rxw.makeDataToList(ds, "curbolist", "bonm", "bocd", "��ü", "", root, "codelist", "record", "cdnm", "cd");
    
	rxw.flush(out);
%>
