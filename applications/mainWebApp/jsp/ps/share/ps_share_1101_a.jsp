<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_share_1101_a.jsp
* ��� : �������� �������� �ʱ�ȭ��
* �ۼ����� : 2004-02-23
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-12
* ������ϸ� : ps_share_1101_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%-- dataset �ν��Ͻ� ����κ�--%>
<%
    int moveListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
   
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
    
    rxw.add(initTemp, "recordPerPage", moveListCount);
    rxw.add(initTemp, "js_fn_nm", "page_move");
    rxw.add(initTemp, "startday", Util.getYyyyMm()+"01");
    rxw.add(initTemp, "lastday", Util.getLastDay(Util.getYyyyMm()+"01"));

    rxw.flush(out);
%>

