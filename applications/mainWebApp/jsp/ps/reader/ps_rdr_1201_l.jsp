<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_rdr_1201_l.jsp
* ���     : Ȯ�嵶�ڳ��� �ʱ�
* �ۼ����� : 2004-02-25
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-13
* ������ϸ� : ps_rdr_1201_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    //dataset �ν��Ͻ� ����κ�
	PS_L_RDR_EXTN_SEARCHDataSet ds = (PS_L_RDR_EXTN_SEARCHDataSet)request.getAttribute("ds");

    //ȭ�鿡 ������ ���ڵ� �� ����
    int   showRecCnt  =  10;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "recordPerPage", showRecCnt);
    rxw.add(initTemp, "js_fn_nm", "page_move");
    rxw.add(initTemp, "sh_extndt_fr", Util.addMonth(Util.getDate(),-1));
    rxw.add(initTemp, "sh_extndt_to", Util.getDate());
    
    rxw.makeDataToList(ds, "aplcpathcdcur", "cicdnm", "cicodeval", "��ü", "ALL", initTemp, "routeCombo"); // ���
    rxw.makeDataToList(ds, "rdr_extntyecdcur", "cicdnm", "cicodeval", "��ü", "ALL", initTemp, "typeCombo"); // ����
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "��ü", "ALL", initTemp, "mcCombo"); // ��û��ü
        
	rxw.flush(out);
%>
