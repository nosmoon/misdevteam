<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�	: ss_brsup_1756_s.jsp
* ���		: //��������-����_�ڵ���ü-��û����-��ü�����ȯ �󼼺���
* �ۼ�����	: 2004-05-27
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

	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "dataExist", ds.rsltcur.size()==0 ? "false" : "true");

    if(ds.rsltcur.size()>0)
    {
    	SS_S_APLC_EXPYRSLTCURRecord rsltcurRec = (SS_S_APLC_EXPYRSLTCURRecord)ds.rsltcur.get(0);

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
		
   		int pymtInfoForm = rxw.add(resTemp, "pymtInfoForm", "");
    	
		rxw.add(pymtInfoForm, "shftclsf", shftclsf);
		rxw.add(pymtInfoForm, "shftclsf_txt", shftclsfTxt);
		rxw.add(pymtInfoForm, "pymtnm", rsltcurRec.pymtnm);
		rxw.add(pymtInfoForm, "pymttel1", rsltcurRec.tel1);
		rxw.add(pymtInfoForm, "pymttel2", rsltcurRec.tel2);
		rxw.add(pymtInfoForm, "pymttel3", rsltcurRec.tel3);
		rxw.add(pymtInfoForm, "medicd", request.getParameter("medicd"));
		rxw.add(pymtInfoForm, "recpinstt_txt", rsltcurRec.banknm);
		rxw.add(pymtInfoForm, "acctno_txt", rsltcurRec.acctno);
		rxw.add(pymtInfoForm, "cardcmpycd_txt", rsltcurRec.cardcmpynm);
		rxw.add(pymtInfoForm, "cardno_txt", rsltcurRec.cardno);
		rxw.add(pymtInfoForm, "vdtyyy_txt", rsltcurRec.vdtyprd);
		rxw.add(pymtInfoForm, "prn", rsltcurRec.prn);
		rxw.add(pymtInfoForm, "aplcdt", aplcdt);
		rxw.add(pymtInfoForm, "aplyyymm", new_shftbgnyymm);
		rxw.add(pymtInfoForm, "aplyyymm_txt", new_shftbgnyymm);
		rxw.add(pymtInfoForm, "email", rsltcurRec.email);
    }
    
    rxw.flush(out);
%>
