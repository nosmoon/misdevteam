<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_rdr_1101_a.jsp
* ���     : Ȯ�嵶�ڰ���
* �ۼ����� : 2004-02-25
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-18
* ������ϸ� : ps_rdr_1126_l.jsp_org
---------------------------------------------------------------------------------------------------%>

<%
    //���ó�¥
    String toDate      = Util.getDate2();

    //dataset �ν��Ͻ� ����κ�
	PS_S_RDR_EXTNDataSet ds = (PS_S_RDR_EXTNDataSet)request.getAttribute("ds");

    //Ȯ�嵶������ dataset
    PS_S_RDR_EXTNRDREXTNINFOCURRecord rdrextninfocurRec = null;
    boolean  rdrChk = false;            //Ȯ�嵶�� ����Ÿ ����üũ

    if (ds.rdrextninfocur.size() > 0) {
        rdrextninfocurRec = (PS_S_RDR_EXTNRDREXTNINFOCURRecord)ds.rdrextninfocur.get(0);
        rdrChk  =  true;
    }
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "defaultDate", Util.getDate());
    
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "����", "", initTemp, "mcCombo2"); // ��û��ü
    rxw.makeDataToList(ds, "acqclsfcur", "cicdnm", "cicodeval", "����", "", initTemp, "acqclsfCombo"); // ���뱸��
    rxw.makeDataToList(ds, "rcpmmthdcur", "cicdnm", "cicodeval", "����", "", initTemp, "rcpmmthdCombo"); // ���ι��
    rxw.makeDataToList(ds, "rshpclsfcdcur", "cicdnm", "cicodeval", "����", "", initTemp, "rshpclsfcdCombo"); // ��û�ΰ�����
    rxw.makeDataToList(ds, "resiclsfcdcur", "cicdnm", "cicodeval", "����", "", initTemp, "resiclsfcdCombo"); // �ְű���
    rxw.makeDataToList(ds, "resitypecdcur", "cicdnm", "cicodeval", "����", "", initTemp, "resitypecdCombo"); // �ְ�����
    rxw.makeDataToList(ds, "rdr_extnclsfcdcur", "cicdnm", "cicodeval", "����", "", initTemp, "extnclsfcdCombo"); // Ȯ�屸��
    //System.out.println(rxw.getXml());
	rxw.flush(out);
%>

