<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2163_a.jsp
* ��� : Ȯ����Ȳ-����/����-���ڵ�� �ʱ�ȭ��
* �ۼ����� : 2009-05-26
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_EXTN_EDURDR_INITDataSet ds = (SS_L_EXTN_EDURDR_INITDataSet)request.getAttribute("ds");
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "yyyymm", Util.getYear() + Util.getMonth()); // �Ⱓ ����
	rxw.add(codeData, "yyyymmdd", Util.getDate()); // �Ⱓ ��
	
	rxw.makeDataToList(ds, "curinstcd", "insttnm", "insttcd", codeData, "instCombo");
	rxw.makeDataToList(ds, "curmedicd", "cicdnm", "cicodeval", codeData, "mediCombo");
	
	rxw.flush(out);	
%>
