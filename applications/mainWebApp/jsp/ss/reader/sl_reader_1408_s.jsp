<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명	: sl_reader_1408_l.jsp
* 기능		: 독자-독자정보관리-자동이체해지신청리스트 상세보기
* 작성일자	: 2003-12-30
* 작성자	: 김상열

* 수정내역	:
* 수정자	:
* 수정일자 	:
* 백업파일명:
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-08
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    SL_S_APLC_EXPYDataSet ds = (SL_S_APLC_EXPYDataSet)request.getAttribute("ds");

	//TrustForm 처리.
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
			shftclsfTxt = "지로자동이체";
		else if("130".equals(rsltcurRec.shftclsf))
			shftclsfTxt = "카드이체";
		
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
