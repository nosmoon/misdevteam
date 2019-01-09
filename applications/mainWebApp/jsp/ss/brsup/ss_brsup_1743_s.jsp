<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1743_s.jsp
* 기능 : 지국업무지원-Billing자동이체-신청관리-납부자(구독)정보
* 작성일자 : 2004-03-29
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-16
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_APLCDataSet ds = (SS_S_APLCDataSet)request.getAttribute("ds");
    SS_S_APLCRSLTCURRecord rsltcurRec = (SS_S_APLCRSLTCURRecord)ds.rsltcur.get(0);

    boolean closYn = false;	// 마감여부 : true이면 구구독자번호만 수정할 수 있다.
    String trsmyn = Util.checkString(request.getParameter("trsmyn"));				// 전송여부
    String pymtinforflyn = Util.checkString(request.getParameter("pymtinforflyn"));	// 납부정보반영여부
    String closYnStr = null;

	// 마감여부 => 전송여부가 'Y'이거나, 입금정보반영여부가 'Y'이면 마감여부는 true. 상태변경 및 정보수정을 할 수 없음.
	if("Y".equals(trsmyn) || "Y".equals(pymtinforflyn)) {
		closYn = true;
		closYnStr = "Y";
	} else {
		closYn = false;
		closYnStr = "N";
	}
    boolean migryn = false;
    if("Y".equals(rsltcurRec.migryn)) {
    	migryn = true;
    }
    boolean mediyn = false;
    if(rsltcurRec.medicd!=null && !rsltcurRec.medicd.equals("")) {
        mediyn = true;
    }

   	StringBuffer rdrtel = new StringBuffer("");
   	if(rsltcurRec.rdrtel1!=null && !rsltcurRec.rdrtel1.equals("")) {
   		rdrtel.append(rsltcurRec.rdrtel1).append("-").append(rsltcurRec.rdrtel2).append("-").append(rsltcurRec.rdrtel3);
	} else {
		rdrtel.append(rsltcurRec.rdrtel2).append("-").append(rsltcurRec.rdrtel3);
	}
   	StringBuffer addr = new StringBuffer("");
   	if(rsltcurRec.zip.length()==6)
   		addr.append(rsltcurRec.zip.substring(0,3)).append("-").append(rsltcurRec.zip.substring(3, 6)).append(" ").append(rsltcurRec.dlvaddr).append(" ").append(rsltcurRec.dlvaddrdtls);

  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "bonm", Util.Uni2Ksc(Util.checkString(request.getParameter("bonm"))));
	rxw.add(resTemp, "botel", Util.checkString(request.getParameter("botel")));
	
	rxw.makeHugeStart(resTemp, "detailData", ds.rsltcur.size());
	//title 추가.
	rxw.add_ColVal("aplcno");
	rxw.add_ColVal("shftclsf");
	rxw.add_ColVal("aplcdt");
	rxw.add_ColVal("bocd");
	rxw.add_ColVal("closyn");
	rxw.add_ColVal("pymtnmtel");
	rxw.add_ColVal("rdrtel");
	rxw.add_ColVal("addr");
	//나머지 필드는 자동 생성.
	rxw.makeRecordToBulkTitle(rsltcurRec);
	//데이터 추가.
	rxw.add_ColVal(request.getParameter("aplcno"));
	rxw.add_ColVal(request.getParameter("shftclsf"));
	rxw.add_ColVal(request.getParameter("aplcdt"));
	rxw.add_ColVal(Util.checkString(request.getParameter("bocd")));
	rxw.add_ColVal("Y".equals(trsmyn) || "Y".equals(pymtinforflyn) ? "Y" : "N");
	rxw.add_ColVal(new StringBuffer().append(rsltcurRec.pymtnm).append("(").append(Util.checkString(request.getParameter("pymttel"))).append(")"));
	rxw.add_ColVal(rdrtel);
	rxw.add_ColVal(addr);
	//나머지 필드 자동생성.
	rxw.makeRecordToBulk(rsltcurRec, false);
	rxw.makeHugeEnd();

	//이체시작월.
	rxw.makeHugeListStart(resTemp, "aplyyymmCombo");
	rxw.addHugeListItem(Util.convertMonthS((rsltcurRec.aplyyymm)), rsltcurRec.aplyyymm);
	String tempDate = Util.getDate();
	for(int i=0; i<12; i++) {
		tempDate = Util.addMonth(tempDate, 1);
		rxw.addHugeListItem(Util.convertMonthS(tempDate.substring(0, 6)), tempDate.substring(0, 6));
	}
	rxw.makeHugeEnd();
	
	//매체.
	rxw.makeHugeListStart(resTemp, "medicdCombo");
	if(mediyn)
		rxw.addHugeListItem(rsltcurRec.medinm, rsltcurRec.medicd);
	else
		rxw.addHugeListItem("선택", "");
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
