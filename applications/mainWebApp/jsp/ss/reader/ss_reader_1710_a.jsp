<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�      : ss_reader_1710_a.jsp
* ���           : ������Ȳ-���ڰ���-�ʱ�ȭ��
* �ۼ����� : 2009-08-07
* �ۼ���      : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������      : 
* ������           : 
* ��������      : 
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    //dataset �ν��Ͻ� ����κ�
	SS_L_RDR_MNGMEMB_INITDataSet ds = (SS_L_RDR_MNGMEMB_INITDataSet)request.getAttribute("ds");

    //ȭ�鿡 ������ ���ڵ� �� ����
    //int   listCount  =  20;
    
    //TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "defaultDate", Util.getDate());
		
	//���� ��� ǥ��
	rxw.makeDataToList(ds, "custtype", "cicdnm", "cicodeval", "��ü", "", codeData, "custCombo"); // ������ �޺�
	
	rxw.flush(out);
%>

