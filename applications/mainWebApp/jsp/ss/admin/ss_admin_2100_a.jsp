<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_2100_a.jsp
* ��� : ������������-����ϰ���-�α��ν��� �ʱ�_����Ͽ�
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
  System.out.println("=======ss_admin_2100_a.jsp=======");
   SS_MO_L_LOGINAPLC_INITDataSet ds = (SS_MO_L_LOGINAPLC_INITDataSet)request.getAttribute("ds");
    applySession = true ; //�������뿩��

  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");

	rxw.add(codeData, "applySession", String.valueOf(applySession));
	//rwx.add(codeData,"uid", String.valueOf(session.getAttribute("uid")));

	//�μ�(��)��� ǥ��.
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");

	//��Ʈ ��� ǥ�� - �ӽ�
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");

	//���� ��� ǥ��.
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");


	rxw.flush(out);
%>
