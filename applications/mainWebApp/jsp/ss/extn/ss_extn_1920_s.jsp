<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1920_s.jsp
* ��� : Ȯ����Ȳ-Ȯ������-��
* �ۼ����� : 2007-07-13
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-03-16
* ������ϸ� : ss_extn_1920_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    CO_S_EXTN_RESDataSet ds = (CO_S_EXTN_RESDataSet)request.getAttribute("ds");

    //String cns_empcnfmstat = ds.cns_empcnfmstatcd.equals("00") ? "<font color='#ff0000'>��Ȯ��</font>" : "Ȯ��";
    String cns_empcnfmstat = ds.cns_empcnfmstatcd.equals("00") ? "��Ȯ��" : "Ȯ��";
    String cns_empcnfmocom = ds.cns_empcnfmocomcd;
    //String chrg_cnfmstat = ds.chrg_cnfmstatcd.equals("00") ? "<font color='#ff0000'>��Ȯ��</font>" : "Ȯ��";
    String chrg_cnfmstat = ds.chrg_cnfmstatcd.equals("00") ? "��Ȯ��" : "Ȯ��";

    String cns_cnfmdt = ds.cns_cnfmdt + "";
    String chrg_cnfmdt = ds.chrg_cnfmdt + "";
    String valmm = ds.valmm + "";

    cns_cnfmdt = cns_cnfmdt.equals("null") ? "" : cns_cnfmdt.substring(0,19);
    chrg_cnfmdt = chrg_cnfmdt.equals("null") ? "" : chrg_cnfmdt.substring(0,19);

    if( cns_empcnfmocom.equals("00") ) {
      cns_empcnfmocom = "����";
    } else if( cns_empcnfmocom.equals("10") ) {
      cns_empcnfmocom = "������";
    } else if( cns_empcnfmocom.equals("20") ) {
      cns_empcnfmocom = "������";
    } else {
      cns_empcnfmocom = "";
    }
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "cns_empcnfmstat", cns_empcnfmstat); // Ȯ�λ���(����)
	rxw.add(resTemp, "cns_empcnfmocom", cns_empcnfmocom); // Ȯ�ΰ��
	rxw.add(resTemp, "chrg_cnfmstat", chrg_cnfmstat); // Ȯ�λ���(���)
	
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);

%>

