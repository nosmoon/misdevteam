<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_send_2201_a.jsp
* ��� : �߼����� �ʱ� ȭ��
* �ۼ����� : 2005-10-01
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-18
* ������ϸ� : ps_send_2201_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    String records_per_page = "5";
    //  dataset �ν��Ͻ� ����κ�
    PS_S_SEND_LUMP_PROCDataSet ds = (PS_S_SEND_LUMP_PROCDataSet)request.getAttribute("ds");  // request dataset

    // ȭ��� ������ Row��
    int li_per = 10;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    //rxw.add(initTemp, "recordPerPage", records_per_page);
    //rxw.add(initTemp, "js_fn_nm", "page_move");
            
    rxw.makeDataToList(ds, "bocdcur", "cicdnm", "cicodeval", "��ü", "", initTemp, "branchCombo");  // ó������
    rxw.makeDataToList(ds, "cmpycdcur", "cicdnm", "cicodeval", "��ü", "ALL", initTemp, "cmpyCombo"); // ����
    
	rxw.flush(out);
    
%>

