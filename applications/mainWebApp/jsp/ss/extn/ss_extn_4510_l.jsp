<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_4510_l.jsp
* ��� : ����������-��ȸ
* �ۼ����� : 2016.01.29
* �ۼ��� : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	System.out.println("ss_extn_4510_l.jsp");
    SS_L_FREENWSPDataSet ds = (SS_L_FREENWSPDataSet)request.getAttribute("ds");

    RwXmlWrapper rxw = new RwXmlWrapper();

    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");

    rxw.makeDataToBulk(ds, "freelist", resTemp, "listGrid");

	rxw.flush(out);
%>



