<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1410_s.jsp
* ��� : Ȯ����Ȳ-Ȯ��������-��
* �ۼ����� : 2003-12-17
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-12
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_RECPCOMSCLOSDataSet ds = (SS_S_RECPCOMSCLOSDataSet)request.getAttribute("ds");
    //int mediListCount = 4;
    int mediListCount = 5000;
    
    //accflag ����, �� ��Ʈ�� �Ӽ� ����.
    //TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeDataToBulk(ds, root, "resTemp");
	//System.out.println(rxw.getXml());
	rxw.flush(out);
%>
