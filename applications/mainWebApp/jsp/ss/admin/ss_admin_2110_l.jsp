<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_2110_l.jsp
* ��� : ������������-����ϰ���-�α��ν��� ��ȸ_����Ͽ�
* �ۼ����� : 2016-09-22
* �ۼ��� : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	System.out.println("=======ss_admin_2110_l.jsp=====");
    SS_MO_L_LOGINAPLC_APRVDataSet ds = (SS_MO_L_LOGINAPLC_APRVDataSet)request.getAttribute("ds");

    RwXmlWrapper rxw = new RwXmlWrapper();

    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "dataTemp");

    rxw.add(resTemp, "totalCount", Util.comma(ds.totalcnt)); // �ѰǼ�

    rxw.makeDataToBulk(ds, "aplclist", resTemp, "listGrid");

	rxw.flush(out);
%>
