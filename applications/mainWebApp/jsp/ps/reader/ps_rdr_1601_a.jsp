<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_rdr_1601_a.jsp
* ���     : ���+ ���ݿ����� �ʱ�
* �ۼ����� : 2004-04-21
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-23
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    //dataset �ν��Ͻ� ����κ�
    CO_L_RDRCRTS_GRAD_APLCDataSet ds = (CO_L_RDRCRTS_GRAD_APLCDataSet)request.getAttribute("ds");

    //ȭ�鿡 ������ ���ڵ� �� ����
    int   showRecCnt  =  5;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
    
    rxw.add(initTemp, "showRecCnt", showRecCnt);
    rxw.add(initTemp, "defaultFrom", Util.addDate(Util.getDate(),-180));
    rxw.add(initTemp, "defaultTo", Util.getDate());
    
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "��ü", "ALL", initTemp, "mcCombo"); // ��û��ü 
    rxw.makeDataToList(ds, "dtlsprocstatcur", "cicdnm", "cicodeval", "��ü", "ALL", initTemp, "moCombo"); // ����ȸ��
    rxw.makeDataToList(ds, "cashrcptstatcur", "cicdnm", "cicodeval", "��ü", "ALL", initTemp, "cashCombo"); // ���ݿ�����
    //rxw.makeDataToList(ds, "pusbocdcur", "bonm", "bocd", "����", "", initTemp, "branchCombo"); // ����
    //rxw.makeDataToList(ds, "dtlsprocstatcur", "cicdnm", "cicodeval", initTemp, "moCombo2"); // ����ȸ��
    //rxw.makeDataToList(ds, "errresncdcur", "cicdnm", "cicodeval", "����", "", initTemp, "errCombo"); // ��������
    //rxw.makeDataToList(ds, "cashrcptstatcur", "cicdnm", "cicodeval", initTemp, "cashCombo2"); // ���ݿ�����
        
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "��ü", "ALL", initTemp, "mcCombo2"); // ��ü(�ϴ�)

	rxw.flush(out);	
%>


