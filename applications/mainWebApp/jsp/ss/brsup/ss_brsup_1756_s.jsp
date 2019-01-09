<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명	: ss_brsup_1756_s.jsp
* 기능		: //지국지원-빌링_자동이체-신청관리-이체방법전환 상세보기
* 작성일자	: 2004-05-27
* 작성자	: 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-20
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_APLC_EXPYDataSet ds = (SS_S_APLC_EXPYDataSet)request.getAttribute("ds");

	//TrustForm 처리.
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
	        방법 변경은 해지신청 후 신규신청이므로,
	        이체시작월이 현재월보다 과거월일 경우 현재월로 세팅한다.
	        단, 화면은 기존값을 그대로 보여준다.
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
			shftclsfTxt = "지로자동이체";
		}
		else if("130".equals(rsltcurRec.shftclsf))
		{
			shftclsf = "110";
			shftclsfTxt = "카드이체";
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
