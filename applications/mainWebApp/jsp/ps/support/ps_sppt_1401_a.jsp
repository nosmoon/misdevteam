<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_sppt_1401_a.jsp
* ��� : ���ݿ����� ����Ʈ �ʱ� ȭ��
* �ۼ����� : 2005-12-09
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-17
* ������ϸ� : ps_sppr_1401_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    PS_L_DSCT_SPPTDataSet ds = (PS_L_DSCT_SPPTDataSet)request.getAttribute("ds");  // request dataset
    String records_per_page = "20";
    int loop_cnt = Integer.parseInt(records_per_page) ;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
    
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "js_fn_nm", "page_move");

    rxw.add(initTemp, "defaultFrom", Util.addDate(Util.getDate(),-30));
    rxw.add(initTemp, "defaultTo", Util.getDate());         

    rxw.makeDataToList(ds, "rcptclsfcur", "cicdnm", "cicodeval", "��ü", "", initTemp, "gubunCombo"); // �߱ޱ���
    rxw.makeDataToList(ds, "aplcpathcur", "cicdnm", "cicodeval", "��ü", "", initTemp, "routeCombo");  // ��û���
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "��ü", "", initTemp, "mcCombo");  // ��ü�ڵ�
    rxw.makeDataToList(ds, "bocdcur", "cicdnm", "cicodeval", "��ü", "", initTemp, "branchCombo");  // Ȯ������
    rxw.makeDataToList(ds, "rcptclsfcur", "cicdnm", "cicodeval", "��ü", "", initTemp, "rcptCombo");  // �߱޿���
       
	rxw.flush(out);
%>

