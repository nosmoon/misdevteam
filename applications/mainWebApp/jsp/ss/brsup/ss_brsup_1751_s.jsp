<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명	: ss_brsup_1751_s.jsp
* 기능		: 지국업무지원-Billing자동이체-신청관리-자동이체 해지신청대상목록 상세보기
* 작성일자	: 2004-04-01
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
    SS_S_APLC_EXPYRSLTCURRecord rsltcurRec = (SS_S_APLC_EXPYRSLTCURRecord)ds.rsltcur.get(0);
    
  	//TrustForm 처리.
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
