<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : ss_cns_1410_a.jsp
* ��� 	 	 : ����-�ڵ���ü���Խ�û(ī��)
* �ۼ����� 	 : 2004-07-16
* �ۼ��� 	 : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-03-26
* ������ϸ� : ss_cns_1410_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%

    //	datacct �ν��Ͻ� ����κ�
    SS_L_SHFTAPLC_INIT_TMDataSet ds = (SS_L_SHFTAPLC_INIT_TMDataSet)request.getAttribute("ds");  // request datacct
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int codeData = rxw.add(root, "codeData", "");

    rxw.add(codeData, "year", Util.getYear());
    rxw.add(codeData, "month", Util.getMonth());

    rxw.makeDataToList(ds, "curcardcd", "cicdnm", "cicodeval", codeData, "cardCombo");//��ü����

	rxw.flush(out);
%>