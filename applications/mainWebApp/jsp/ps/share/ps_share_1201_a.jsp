<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_share_1201_a.jsp
* ��� : �������� �Խ��� �������� �ʱ�ȭ��
* �ۼ����� : 2004-02-23
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-03-02
* ������ϸ� : ps_share_1201_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%-- dataset �ν��Ͻ� ����κ�--%>
<%
    PS_L_INFOEXG_INITDataSet ds = (PS_L_INFOEXG_INITDataSet)request.getAttribute("ds");    // request dataset

    String js_fn_nm = request.getParameter("js_fn_nm");
    if(js_fn_nm == null) {js_fn_nm = "page_move";}

    String curr_page_no = request.getParameter("curr_page_no");
    if(curr_page_no == null) {curr_page_no = "1";}

    String records_per_page = (String)request.getAttribute("records_per_page");
    if(records_per_page == null) {records_per_page = "20";}

    int no_data_page = Integer.parseInt(records_per_page) -ds.infoexglist.size();
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
             
    rxw.makeDataToList(ds, "exttlist", "cicdnm", "cicodeval", "��ü", "", initTemp, "rmsCombo"); // ���Ź���
           
	rxw.flush(out);
%>

