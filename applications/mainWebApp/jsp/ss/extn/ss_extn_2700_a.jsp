<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2300_a.jsp
* ��� : Ȯ����Ȳ-�����������-�ʱ�ȭ��
* �ۼ����� : 2013-3-5
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>

<%
	SS_L_EMP_NWSPRDR_INITDataSet ds = (SS_L_EMP_NWSPRDR_INITDataSet)request.getAttribute("ds");
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "cntrno", ds.getMaxcntrno() ); // �Ⱓ ����  ds.getMaxcntrno()
	
	rxw.makeDataToList(ds, "curcmpylist", "dept_nm", "dept_cd", "��ü", "", codeData, "teamlist"); // ����
	
	rxw.flush(out);	
%>
