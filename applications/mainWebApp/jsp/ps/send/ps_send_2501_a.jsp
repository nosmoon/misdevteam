<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_send_2501_s.jsp
* ���     : ��޺񸶰� �ʱ�
* �ۼ����� : 2008-07-29
* �ۼ���   : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-11
* ������ϸ� : ps_send_2501_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    PS_S_SEND_LUMP_CNFMDataSet ds = (PS_S_SEND_LUMP_CNFMDataSet)request.getAttribute("ds");  // request dataset
      
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "js_fn_nm", "page_move");

    rxw.add(initTemp, "todaymm", Util.getYyyyMm());
    rxw.add(initTemp, "today", Util.getDate());
    rxw.add(initTemp, "bas_frdt", Util.getCutStr(Util.addDate(ds.getIv_bas_dt(),+1),8));
    rxw.add(initTemp, "fryymm", Util.getCutStr(Util.addMonth(Util.getDate(),-2),6));
          
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "��ü", "ALL", initTemp, "mcCombo"); // ��ü����
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "��ü", "ALL", initTemp, "mcCombo2"); // ��ü����
        
	rxw.flush(out);
%>

