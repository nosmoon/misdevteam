<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_print_1101_s.jsp
* ��� : ��¸���Ʈ �ʱ�ȭ��
* �ۼ����� : 2006-02-01
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-19
* ������ϸ� : ps_print_1101_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    //  dataset �ν��Ͻ� ����κ�
    PS_S_PRINT_INITDataSet ds = (PS_S_PRINT_INITDataSet)request.getAttribute("ds");  // request dataset
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
    
    rxw.makeDataToList(ds, "medicdlist", "cicdnm", "cicodeval", initTemp, "mcCombo");  // ��ü  
    rxw.makeDataToList(ds, "medicdlist", "cicdnm", "cicodeval", initTemp, "mcCombo2");  // ��ü 
    rxw.makeDataToList(ds, "medicdlist", "cicdnm", "cicodeval", "��ü", "ALL", initTemp, "mcCombo3");  // ��ü
    rxw.makeDataToList(ds, "medicdlist", "cicdnm", "cicodeval", "��ü", "ALL", initTemp, "mcCombo4");  // ��ü 
    rxw.makeDataToList(ds, "medicdlist", "cicdnm", "cicodeval", "��ü", "ALL", initTemp, "mcCombo5");  // ��ü
    rxw.makeDataToList(ds, "rdr_extntyecdcur", "cicdnm", "cicodeval", "����", "ALL", initTemp, "extnType");  // Ȯ������    
    rxw.makeDataToList(ds, "bocdcurlist", "bonm", "bocd", "��ü", "ALL", initTemp, "branchCombo");  // ����
    rxw.makeDataToList(ds, "asinbocdcur", "bonm", "bocd", "��ü", "ALL", initTemp, "branchCombo2");  // ����
                    
	rxw.flush(out);
%>
