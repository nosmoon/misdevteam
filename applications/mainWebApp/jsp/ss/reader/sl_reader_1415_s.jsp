<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�	: sl_reader_1415_l.jsp
* ���		: ����-������������-��ü�����ȯ����Ʈ �󼼺���
* �ۼ�����	: 2004-05-27
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
		
		String new_shftbgnyymm = null;
        String curryymm = Util.getYyyyMm();
        String aplcdt = null;
        
        if(rsltcurRec.aplcdt==null || rsltcurRec.aplcdt.equals("")) {
        	aplcdt = Util.getDate();
        } else {
        	aplcdt = rsltcurRec.aplcdt;
        }
        
        /*
		        ��� ������ ������û �� �űԽ�û�̹Ƿ�,
		        ��ü���ۿ��� ��������� ���ſ��� ��� ������� �����Ѵ�.
		        ��, ȭ���� �������� �״�� �����ش�.
        */
        if(rsltcurRec.shftbgnyymm==null || rsltcurRec.shftbgnyymm.equals("") || Integer.parseInt(rsltcurRec.shftbgnyymm) < Integer.parseInt(curryymm)) {
            new_shftbgnyymm = curryymm;
        } else {
            new_shftbgnyymm = rsltcurRec.shftbgnyymm;
        }
		
        String shftclsf = "";
		String shftclsfTxt = "";
		if("110".equals(rsltcurRec.shftclsf))
		{
			shftclsf = "130";
			shftclsfTxt = "�����ڵ���ü";
		}
		else if("130".equals(rsltcurRec.shftclsf))
		{
			shftclsf = "110";
			shftclsfTxt = "ī����ü";
		}
		
		rxw.add(detailData, "shftclsf", shftclsf);
		rxw.add(detailData, "shftclsf_txt", shftclsfTxt);
		rxw.add(detailData, "pymtnm", rsltcurRec.pymtnm);
		rxw.add(detailData, "pymttel1", rsltcurRec.tel1);
		rxw.add(detailData, "pymttel2", rsltcurRec.tel2);
		rxw.add(detailData, "pymttel3", rsltcurRec.tel3);
		rxw.add(detailData, "medicd", request.getParameter("medicd"));
		rxw.add(detailData, "recpinstt_txt", rsltcurRec.banknm);
		rxw.add(detailData, "acctno_txt", rsltcurRec.acctno);
		rxw.add(detailData, "cardcmpycd_txt", rsltcurRec.cardcmpynm);
		rxw.add(detailData, "cardno_txt", rsltcurRec.cardno);
		rxw.add(detailData, "vdtyyy_txt", rsltcurRec.vdtyprd);
		rxw.add(detailData, "prn", rsltcurRec.prn);
		rxw.add(detailData, "aplcdt", aplcdt);
		rxw.add(detailData, "aplyyymm", new_shftbgnyymm);
		rxw.add(detailData, "aplyyymm_txt", new_shftbgnyymm);
		rxw.add(detailData, "email", rsltcurRec.email);
	}
	
	rxw.flush(out);

%>
