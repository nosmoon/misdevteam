<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%@ page language="java" import="java.io.*" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_send_2101_s.jsp
* ��� : �ݼ���ȸ
* �ۼ����� : 2003-12-08
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-18
* ������ϸ� : ps_send_2101_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    String records_per_page = "15";
    int li_per = Integer.parseInt(records_per_page) ;
    // dataset �ν��Ͻ� ����κ�
    PS_S_SEND_RETNDataSet ds = (PS_S_SEND_RETNDataSet)request.getAttribute("ds");  // request dataset
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "js_fn_nm", "page_move");
    
    rxw.add(initTemp, "defaultDate", Util.getDate());
    rxw.add(initTemp, "defaultFrom", Util.getDate());
//    rxw.add(initTemp, "defaultFrom", Util.addDate(Util.getDate(),-31)); 
    rxw.add(initTemp, "defaultTo", Util.getDate()); 
       
    rxw.makeDataToList(ds, "retnkindcur", "cicdnm", "cicodeval", "����", "", initTemp, "retnkindCombo"); // �ݼ�����
    rxw.makeDataToList(ds, "retnkindcur", "cicdnm", "cicodeval", "��ü", "", initTemp, "retnkindCombo2"); // �ݼ�����(�ϴ�)
    rxw.makeDataToList(ds, "retnresncur", "cicdnm", "cicodeval", "����", "", initTemp, "retnresnCombo");  // �ݼۻ��� 
    rxw.makeDataToList(ds, "intgbocdcur", "bonm", "bocd", "��ü", "", initTemp, "branchCombo");  // ó������
       
	rxw.flush(out);
%>

