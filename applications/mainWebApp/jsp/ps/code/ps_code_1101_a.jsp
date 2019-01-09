<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_code_1101_a.jsp
* ���     : ��ü �ڵ���� �ʱ�ȭ��
* �ۼ����� : 2004-02-20
* �ۼ���   : ���ȯ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-12
* ������ϸ� : ps_code_1101_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    //  dataset �ν��Ͻ� ����κ�
    PS_S_SEPBK_CODEDataSet ds = (PS_S_SEPBK_CODEDataSet)request.getAttribute("ds");  // request dataset

    // �������� ������ ���μ�
    String records_per_page = "10";
    int li_per = Integer.parseInt(records_per_page) ;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
    
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "js_fn_nm", "page_move");
    //rxw.add(initTemp, "today", Util.getDate());
             
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", initTemp, "mcCombo"); // ��ü
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "��ü", "ALL", initTemp, "mcCombo2"); // ��ü(�ϴ�)    
    rxw.makeDataToList(ds, "mediclsfcur", "cicdnm", "cicodeval", "����", "", initTemp, "mediclsfcurCombo"); // ��ü����
    rxw.makeDataToList(ds, "issuclsf", "cicdnm", "cicodeval", "����", "", initTemp, "issuclsfCombo"); // ���౸��
    rxw.makeDataToList(ds, "contclascur", "cicdnm", "cicodeval", "����", "", initTemp, "contclascurCombo"); // ����з��ڵ�
    rxw.makeDataToList(ds, "typecur", "cicdnm", "cicodeval", "����", "", initTemp, "typecurCombo"); // ����
    rxw.makeDataToList(ds, "absenceyncur", "cicdnm", "cicodeval", "����", "", initTemp, "absenceyncurCombo"); // ���ǿ���
    rxw.makeDataToList(ds, "sericdcur", "cicdnm", "cicodeval", "����", "", initTemp, "sericdcurCombo"); // �ø����ڵ�

    rxw.flush(out);
%>

