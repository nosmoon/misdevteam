<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_code_1101_a.jsp
* ��� : ��ü�ܰ� �ʱ�ȭ��
* �ۼ����� : 2004-02-20
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-12
* ������ϸ� : ps_code_1201_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // �������� ������ ���μ�
    String records_per_page = "15";
    int li_per = Integer.parseInt(records_per_page) ;
    //	dataset �ν��Ͻ� ����κ�
    PS_S_MEDI_UPRCDataSet ds = (PS_S_MEDI_UPRCDataSet)request.getAttribute("ds");  // request dataset
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
    
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "js_fn_nm", "page_move");
    rxw.add(initTemp, "today", Util.getDate());
             
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", initTemp, "mcCombo"); // ��ü
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", initTemp, "mcCombo2"); // ��ü(�ϴ�)
    
    rxw.makeDataToList(ds, "bocd", "bonm", "bocd", initTemp, "branchCombo"); // ���������
    rxw.makeDataToList(ds, "bocd", "bonm", "bocd", initTemp, "branchCombo2"); // ���������(�ϴ�)
    rxw.makeDataToList(ds, "acpntype", "cicdnm", "cicodeval", initTemp, "acpntypeCombo"); // ��������
    rxw.makeDataToList(ds, "acpnclsf", "cicdnm", "cicodeval", initTemp, "acpnclsfCombo"); // ��������
       
	rxw.flush(out);
    
%>
