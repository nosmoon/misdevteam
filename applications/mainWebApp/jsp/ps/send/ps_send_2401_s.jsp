<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_send_2401_s.jsp
* ���     : �ְ���������-���긶��-�ʱ�ȭ��
* �ۼ����� : 2007-11-01
* �ۼ���   : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-10
* ������ϸ� : ps_send_2401_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    PS_S_SEND_LUMP_CNFMDataSet ds = (PS_S_SEND_LUMP_CNFMDataSet)request.getAttribute("ds");  // request dataset
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    //rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "js_fn_nm", "page_move");
    
    rxw.add(initTemp, "fryymm", Util.getCutStr(Util.addMonth(Util.getDate(),-10),6));
    rxw.add(initTemp, "toyymm", Util.getYyyyMm());
    rxw.add(initTemp, "closyymm", Util.getYyyyMm());
          
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "��ü", "ALL",initTemp, "mcCombo"); // ��ü����
        
	rxw.flush(out);
    
%>

