<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1010_l.jsp
* ��� : Ȯ����Ȳ-��û��Ȳ-Ȯ���ڼҼ� ���
* �ۼ����� : 2003-11-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-02309
* ������ϸ� : ss_extn_1010_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_EXTNBLNGCDDataSet ds = (SS_L_EXTNBLNGCDDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initTemp = rxw.add(root, "initTemp", "");
	       
	rxw.makeDataToList(ds, "curcommlist", "cicdnm", "cicodeval", "��ü", "", initTemp, "extnCombo");  // Ȯ���ڼҼ�
	rxw.flush(out);    
%>