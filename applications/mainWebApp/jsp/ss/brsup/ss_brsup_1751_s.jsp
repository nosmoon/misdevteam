<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�	: ss_brsup_1751_s.jsp
* ���		: ������������-Billing�ڵ���ü-��û����-�ڵ���ü ������û����� �󼼺���
* �ۼ�����	: 2004-04-01
* �ۼ���	: ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-20
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_APLC_EXPYDataSet ds = (SS_S_APLC_EXPYDataSet)request.getAttribute("ds");
    SS_S_APLC_EXPYRSLTCURRecord rsltcurRec = (SS_S_APLC_EXPYRSLTCURRecord)ds.rsltcur.get(0);
    
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "dataExist", rsltcurRec==null ? "false" : "true");
	
	if(rsltcurRec!=null)
	{
		int pymtInfoForm = rxw.add(resTemp, "pymtInfoForm", "");
		rxw.add(pymtInfoForm, "pymtnm", rsltcurRec.pymtnm);
		rxw.add(pymtInfoForm, "pymttel1", rsltcurRec.tel1);
		rxw.add(pymtInfoForm, "pymttel2", rsltcurRec.tel2);
		rxw.add(pymtInfoForm, "pymttel3", rsltcurRec.tel3);
		rxw.add(pymtInfoForm, "prn", rsltcurRec.prn);
		rxw.add(pymtInfoForm, "aplcdt", rsltcurRec.aplcdt);
		rxw.add(pymtInfoForm, "email", rsltcurRec.email);
		rxw.add(pymtInfoForm, "recpinstt_txt", rsltcurRec.banknm);
		rxw.add(pymtInfoForm, "acctno_txt", rsltcurRec.acctno);
		rxw.add(pymtInfoForm, "cardcmpycd_txt", rsltcurRec.cardcmpynm);
		rxw.add(pymtInfoForm, "cardno_txt", rsltcurRec.cardno);
		rxw.add(pymtInfoForm, "vdtyyy_txt", rsltcurRec.vdtyprd);
		rxw.add(pymtInfoForm, "aplyyymm_txt", rsltcurRec.shftbgnyymm);
	}
	
	rxw.flush(out);
%>
