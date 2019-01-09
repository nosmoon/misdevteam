<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_reader_1225_s.jsp
* 기능 		 : 독자정보관리(입금내역상세)
* 작성일자 	 : 2003-12-22
* 작성자 	 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-24
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	// request
    String basiyymm = Util.checkString(request.getParameter("basiyymm"));       //검색기준년월
    String rdr_no = Util.checkString(request.getParameter("rdr_no"));           //독자번호
    String medicd = Util.checkString(request.getParameter("medicd"));           //매체코드
    String dlvdstccd = Util.checkString(request.getParameter("dlvdstccd"));     //구역코드
    String subsmappli = Util.checkString(request.getParameter("subsmappli"));   //구독월분

    // getting dataset
    SL_S_RDR_NWSPCLAMTDataSet ds = (SL_S_RDR_NWSPCLAMTDataSet)request.getAttribute("ds");  // request dataset

	SL_S_RDR_NWSPCLAMTDEFAULTCURRecord defaultcurRec  = null;
	SL_S_RDR_NWSPCLAMTCLAMTCURRecord   clamtcurRec    = null;
    if(ds.clamtcur.size()   == 1  ) clamtcurRec   = (SL_S_RDR_NWSPCLAMTCLAMTCURRecord)ds.clamtcur.get(0);
    if(ds.defaultcur.size() == 1  ) defaultcurRec = (SL_S_RDR_NWSPCLAMTDEFAULTCURRecord)ds.defaultcur.get(0);

    String recpdt      = "";
    String clamamt     = "";
    String clamt       = "";
    String clamtmthdcd = "";
    String rcpmclsfcd  = "";

	if(clamtcurRec == null){ //해당 구독월분에 대한 수금 레코드가 존재 하지 않는 경우
		if(ds.curryymm.compareTo(subsmappli) < 0) { //당월보다 큰 구독월분일 경우
			rcpmclsfcd = "050";                 //수금구분("050":선불)
		}else{ //당월과 구독월분이 같은 경우
			rcpmclsfcd = "010";//수금구분("010":수금)
		}
	}else{ //해당 구독월분에 대한 수금 레코드가 존재하는 경우
		recpdt = clamtcurRec.recpdt;
		clamamt = String.valueOf(clamtcurRec.clamamt);
		clamt = String.valueOf(clamtcurRec.clamt);
		clamtmthdcd = clamtcurRec.clamtmthdcd;
		rcpmclsfcd = clamtcurRec.rcpmclsfcd;
	}
	
	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	int rcpmDetailForm = rxw.add(resTemp, "rcpmDetailForm", "");
	//data
	rxw.add(rcpmDetailForm, "dataExist",	clamtcurRec == null ? "N" : "Y");
	//hidden
	rxw.add(rcpmDetailForm, "bocd", 		Util.getSessionParameterValue(request, "bocd", true));
	rxw.add(rcpmDetailForm, "incmgpers", 	Util.getSessionParameterValue(request, "uid", true));
	rxw.add(rcpmDetailForm, "rdr_no", 		rdr_no);
	rxw.add(rcpmDetailForm, "medicd", 		medicd);
	rxw.add(rcpmDetailForm, "dlvdstccd", 	dlvdstccd);
	rxw.add(rcpmDetailForm, "basiyymm", 	basiyymm);
	/*** 2004-05-20 추가( 사유: 입금구분에 따른 기본값 셋팅을 위함) ****/
	rxw.add(rcpmDetailForm, "h_recpdt", 	Util.getDate());
	rxw.add(rcpmDetailForm, "h_clamamt", 	(defaultcurRec == null)? "" : String.valueOf(defaultcurRec.clamamt));
	rxw.add(rcpmDetailForm, "h_clamt", 		(defaultcurRec == null)? ds.realsubsamt : String.valueOf(defaultcurRec.clamamt));
	rxw.add(rcpmDetailForm, "h_clamtmthdcd",(defaultcurRec == null)? "" : defaultcurRec.clamtmthdcd);
	//입력개체
	rxw.add(rcpmDetailForm, "subsmappli", 	subsmappli);
	rxw.add(rcpmDetailForm, "clamamt", 		clamamt);
	rxw.add(rcpmDetailForm, "recpdt", 		recpdt);
	rxw.add(rcpmDetailForm, "clamt", 		clamt);
	rxw.add(rcpmDetailForm, "rcpmclsfcd", 	rcpmclsfcd);
	rxw.add(rcpmDetailForm, "clamtmthdcd", 	clamtmthdcd);
	
	//combbo
	int comboData = rxw.add(resTemp, "comboData", "");
	//입금구분
	rxw.makeDataToBulkList(ds, "rcpmclsfcur", "cicdnm", "cicodeval", comboData, "clamtmthdcdCombo");
	//수금방법
	rxw.makeDataToBulkList(ds, "clamtmthdcur", "cicdnm", "cicodeval", comboData, "rcpmclsfcdCombo");
	
	rxw.flush(out);
%>

