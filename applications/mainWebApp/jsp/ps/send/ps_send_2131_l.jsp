<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_send_2131_l.jsp
* ��� : ���õ� ���ڿ� �ش��ϴ� ���ʽ��� ��ȸ
* �ۼ����� : 2003-12-08
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    //  dataset �ν��Ͻ� ����κ�
    PS_L_BNS_BOOK_CDDataSet ds = (PS_L_BNS_BOOK_CDDataSet)request.getAttribute("ds");

    // ȭ��� ������ Row��
    int li_per = 10;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "dataTemp", "");
                 
    //rxw.makeDataToBulk(ds, initTemp, "detailGrid");
    rxw.makeDataToList(ds, "bns_bookcdcur", "bns_booknm", "bns_bookcd", initTemp, "bookCombo");  // ó������
    
	rxw.flush(out);    
%>

