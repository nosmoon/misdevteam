<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_send_2001_a.jsp
* ��� : �����߰��߼�ó�� �ʱ�ȭ��
* �ۼ����� : 2004/03/15
* �ۼ��� : ���ȯ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-10
* ������ϸ� : ps_send_2001_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    //  dataset �ν��Ͻ� ����κ�
    PS_S_SEND_LUMP_PROCDataSet ds = (PS_S_SEND_LUMP_PROCDataSet)request.getAttribute("ds");  // request dataset

    // ȭ��� ������ Row��
    int li_per = 20;
    
	String yesterday = Util.addDate(Util.getDate(),-1);
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "recordPerPage", li_per);
    rxw.add(initTemp, "js_fn_nm", "page_move");
    rxw.add(initTemp, "yesterday", yesterday);
       
    rxw.makeDataToList(ds, "bocdcur", "cicdnm", "cicodeval", "��ü", "ALL", initTemp, "branchCombo");  // �߼�����
    rxw.flush(out);   
    
%>

