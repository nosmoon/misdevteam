<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_rdr_1501_a.jsp
* ���     : �������ó�� �ʱ�
* �ۼ����� : 2004-03-02
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : Ȳ����
* �������� : 2009-02-04
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    //dataset �ν��Ͻ� ����κ�
	PS_L_EXTN_ASIN_SEARCHDataSet ds = (PS_L_EXTN_ASIN_SEARCHDataSet)request.getAttribute("ds");
	//��������
	PS_L_EXTN_ASIN_SEARCHASINBOCDCURRecord asinbocdcurRec = null;
    //ȭ�鿡 ������ ���ڵ� �� ����
    int   showRecCnt  =  5;
    String defaultFrom = Util.addMonth(Util.getDate(),-1);
    String defaultTo = Util.getDate();
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
    
    rxw.add(initTemp, "showRecCnt", showRecCnt);
    rxw.add(initTemp, "defaultFrom", defaultFrom);
    rxw.add(initTemp, "defaultTo", defaultTo);
    
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "��ü", "ALL", initTemp, "mcCombo");
    rxw.makeDataToList(ds, "asinbocdcur", "bonm", "bocd", "��ü", "ALL", initTemp, "branchCombo");

	rxw.flush(out);
%>