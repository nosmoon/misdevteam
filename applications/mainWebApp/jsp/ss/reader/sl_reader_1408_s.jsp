<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�	: sl_reader_1408_l.jsp
* ���		: ����-������������-�ڵ���ü������û����Ʈ �󼼺���
* �ۼ�����	: 2003-12-30
* �ۼ���	: ���

* ��������	:
* ������	:
* �������� 	:
* ������ϸ�:
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-08
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    SL_S_APLC_EXPYDataSet ds = (SL_S_APLC_EXPYDataSet)request.getAttribute("ds");

	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "dataExist", String.valueOf(ds.rsltcur.size()!=0));
	
	if(ds.rsltcur.size()!=0)
	{
		int detailData = rxw.add(resTemp, "detailData", "");
		SL_S_APLC_EXPYRSLTCURRecord rsltcurRec = (SL_S_APLC_EXPYRSLTCURRecord)ds.rsltcur.get(0);
		
		String shftclsfTxt = "";
		if("110".equals(rsltcurRec.shftclsf))
			shftclsfTxt = "�����ڵ���ü";
		else if("130".equals(rsltcurRec.shftclsf))
			shftclsfTxt = "ī����ü";
		
		rxw.add(detailData, "shftclsf_txt", shftclsfTxt);
		rxw.add(detailData, "pymtnm", rsltcurRec.pymtnm);
		rxw.add(detailData, "pymttel1", rsltcurRec.tel1);
		rxw.add(detailData, "pymttel2", rsltcurRec.tel2);
		rxw.add(detailData, "pymttel3", rsltcurRec.tel3);
		rxw.add(detailData, "recpinstt_txt", rsltcurRec.banknm);
		rxw.add(detailData, "acctno_txt", rsltcurRec.acctno);
		rxw.add(detailData, "cardcmpycd_txt", rsltcurRec.cardcmpynm);
		rxw.add(detailData, "cardno_txt", rsltcurRec.cardno);
		rxw.add(detailData, "vdtyyy_txt", rsltcurRec.vdtyprd);
		rxw.add(detailData, "prn", rsltcurRec.prn);
		rxw.add(detailData, "aplcdt", rsltcurRec.aplcdt);
		rxw.add(detailData, "aplyyymm_txt", rsltcurRec.shftbgnyymm);
		rxw.add(detailData, "email", rsltcurRec.email);
	}
	
	rxw.flush(out);
%>
