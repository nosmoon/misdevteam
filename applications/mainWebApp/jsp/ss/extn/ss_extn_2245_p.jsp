<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%

    applySession = true;	// 세션 적용 여부

	int jobcd = 0;
	String title;
	String filename;
	String 	yymm = request.getParameter("closmm");
	StringBuffer sb = new StringBuffer("");
	
	SL_L_CLOS_REPORTDataSet ds = (SL_L_CLOS_REPORTDataSet)request.getAttribute("ds");
	
	if( ds.curextncloslist.size() > 0 ) {
		jobcd	 = 0;
		title	 = "확장중지목록";
		filename = "EXTNCLOS_";
	} else if( ds.cursuspcloslist.size() > 0 ) {
		jobcd    = 1;
		title    = "중지독자명단";
		filename = "BOSUSPCLOS_";
	} else if( ds.curbocloscloslist.size() > 0 ) {
		jobcd    = 2;
		title    = "지국구역별마감";
		filename = "DSTCBOCLOS_";
	} else {
		jobcd    = -1;
		title    = "자료가 존재하지 않습니다.";
		filename = "";
	}


    	/*
	System.out.println( "result.........1");
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int tempData = rxw.add(root, "tempData", "");
	int result = rxw.add(tempData, "jobrslt", jobcd);
	int resultmsg = rxw.add(tempData, "jobmsg", title);
	rxw.flush(out);	



	response.reset();
	response.setHeader("Content-Type", "text/xml; charset=KSC5601");
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resData = rxw.add(root, "resData", "");
	int result = rxw.add(resData, "jobrslt", jobcd);
	int resultmsg = rxw.add(resData, "jobmsg", title);
	rxw.flush(out);	
	
	System.out.println( "result.........2");
	*/

	out.clearBuffer();	
	
	if(jobcd == 0) {
		//---------------------
		//확장중지마감
		//---------------------

		//테이블의 헤더 생성
		sb.append("\"부서코드\",\"부서명\",\"파트코드\",\"파트명\",\"지역코드\",\"지역명\",\"지국코드\",\"지국명\",\"대행여부\",\"독자명\",\"독자번호\",\"부수\",\"단가\",\"주소코드명\",\"주소\",\"독자전화1\",\"독자전화2\",\"독자전화3\",\"독자핸드폰1\",\"독자핸드폰2\",\"독자핸드폰3\",\"확장일자\",\"입력일자\",\"유가월\",\"우송료\",\"할인금액\",\"수금방법\",\"확장유형1\",\"확장유형2\",\"캠페인유형\",\"확장자명\",\"확장자코드\",\"신청경로\",\"주거형태\",\"입주일자\",\"입주종료일자\",\"재확여부\",\"모플회원ID\",\"확장전최종중지일자\",\"비고\",\"중지일자\",\"중지사유\",\"판촉물구분\",\"판촉물명\",\"서비스개월\",\"스포츠부수\",\"스포츠단가\",\"한경부수\",\"한경단가\",\"소년부수\",\"소년단가\",\"맛한부수\",\"맛한단가\",\"인계팀\",\"인계센터코드\",\"인계센터명\",\"배달방법\",\"자동이체신청\",\"사원확장여부\",\"타겟확장여부_중앙\",\"투입률조사여부_중앙\"\r\n");
		
		if(ds != null){ 
			for(int i=0; i<ds.curextncloslist.size(); i++){
				SL_L_CLOS_REPORTCUREXTNCLOSLISTRecord rec = (SL_L_CLOS_REPORTCUREXTNCLOSLISTRecord)ds.curextncloslist.get(i);
	
				//테이블의 데이타 생성
				sb.append("\"");
				sb.append(rec.deptcd).append("\",\"");
				sb.append(rec.deptnm).append("\",\"");
				sb.append(rec.partcd).append("\",\"");
				sb.append(rec.partnm).append("\",\"");
				sb.append(rec.areacd).append("\",\"");
				sb.append(rec.areanm).append("\",\"");
				sb.append(rec.bocd).append("\",\"");
				sb.append(rec.bonm).append("\",\"");
				sb.append(rec.oprenvclsf).append("\",\"");
				sb.append(rec.rdrnm).append("\",\"");
				sb.append(rec.rdr_no).append("\",\"");
				sb.append(rec.qty+"").append("\",\"");
				sb.append(rec.subsuprc).append("\",\"");
				sb.append(rec.addrcdnm).append("\",\"");
				sb.append(rec.addrs).append("\",\"");
				sb.append(rec.rdrtel_no1).append("\",\"");
				sb.append(rec.rdrtel_no2).append("\",\"");
				sb.append(rec.rdrtel_no3).append("\",\"");
				sb.append(rec.rdrptph_no1).append("\",\"");
				sb.append(rec.rdrptph_no2).append("\",\"");
				sb.append(rec.rdrptph_no3).append("\",\"");
				sb.append(rec.rdr_extndt ).append("\",\"");
				sb.append(rec.incmgdt).append("\",\"");
				sb.append(rec.valmm).append("\",\"");
				sb.append(rec.post_dlvfee+"").append("\",\"");
				sb.append(rec.dscnamt+"").append("\",\"");
				sb.append(rec.clamtmthd).append("\",\"");
				sb.append(rec.rdr_extntype1).append("\",\"");
				sb.append(rec.rdr_extntype2).append("\",\"");
				sb.append(rec.camptype).append("\",\"");
				sb.append(rec.extnnm).append("\",\"");
				sb.append(rec.stafno).append("\",\"");
				sb.append(rec.aplcpath).append("\",\"");
				sb.append(rec.resitype).append("\",\"");
				sb.append(rec.mvindt).append("\",\"");
				sb.append(rec.mvintodt).append("\",\"");
				sb.append(rec.reconfyn).append("\",\"");
				sb.append(rec.mormembid).append("\",\"");
				sb.append(rec.rdr_extnprvlastsuspdt).append("\",\"");
				sb.append(rec.remk).append("\",\"");
				sb.append(rec.suspdt).append("\",\"");
				sb.append(rec.suspresn).append("\",\"");
				sb.append(rec.bns_itemclsf).append("\",\"");
				sb.append(rec.bns_itemnm).append("\",\"");
				sb.append(rec.svcmm+"").append("\",\"");
				sb.append(rec.scqty+"").append("\",\"");
				sb.append(rec.scsubsuprc+"").append("\",\"");
				sb.append(rec.hkqty+"").append("\",\"");
				sb.append(rec.hksubsuprc).append("\",\"");
				sb.append(rec.boyqty+"").append("\",\"");
				sb.append(rec.boysubsuprc).append("\",\"");
				sb.append(rec.hanqty+"").append("\",\"");
				sb.append(rec.hansubsuprc).append("\",\"");
				sb.append(rec.trsfdeptnm).append("\",\"");
				sb.append(rec.trsfbocd).append("\",\"");
				sb.append(rec.trsfbonm).append("\",\"");
				sb.append(rec.dlvmthd).append("\",\"");
				sb.append(rec.shftyn).append("\",\"");
				sb.append(rec.ccempyn).append("\",\"");
				sb.append(rec.trgtyn_j).append("\",\"");
				sb.append(rec.thrwyn_j).append("\"\r\n");
			}
		}
	}
	else if(jobcd == 1) {
		//---------------------
		//중지독자명단
		//---------------------

		//테이블의 헤더 생성
		sb.append("\"부서코드\",\"부서\",\"파트코드\",\"파트명\",\"지역코드\",\"지역명\",\"지국코드\",\"지국명\",\"독자번호\",\"주소\",\"독자명\",\"구역\",\"매체\",\"구독시작일\",\"유가월\",\"무료구분\",\"주거형태\",\"독자전화1\",\"독자전화2\",\"독자전화3\",\"독자핸드폰1\",\"독자핸드폰2\",\"독자핸드폰3\",\"확장일자\",\"확장유형1\",\"확장유형2\",\"캠페인확장명\",\"신청경로\",\"캠페인유형\",\"확장자명\",\"단가\",\"부수\",\"수금사항\",\"수금개월\",\"최근6개월수금횟수\",\"총구독개월\",\"구독개월200407이후\",\"수금방법\",\"중지사유코드\",\"중지일자\",\"대행지국여부\",\"입력일자\",\"사원확장여부\",\"타겟확장여부_중앙\",\"투입률조사여부_중앙\"\r\n");

		if(ds != null){ 
			for(int i=0; i<ds.cursuspcloslist.size(); i++){
				SL_L_CLOS_REPORTCURSUSPCLOSLISTRecord rec = (SL_L_CLOS_REPORTCURSUSPCLOSLISTRecord)ds.cursuspcloslist.get(i);
				
				//테이블의 데이타 생성
				sb.append("\"");
				sb.append(rec.deptcd).append("\",\"");
				sb.append(rec.deptnm).append("\",\"");
				sb.append(rec.partcd).append("\",\"");
				sb.append(rec.partnm).append("\",\"");
				sb.append(rec.areacd).append("\",\"");
				sb.append(rec.areanm).append("\",\"");
				sb.append(rec.bocd).append("\",\"");
				sb.append(rec.bonm).append("\",\"");
				sb.append(rec.rdr_no).append("\",\"");
				sb.append(rec.addr).append("\",\"");
				sb.append(rec.rdrnm).append("\",\"");
				sb.append(rec.dstc).append("\",\"");
				sb.append(rec.medi).append("\",\"");
				sb.append(rec.subsbgndd).append("\",\"");
				sb.append(rec.valmm).append("\",\"");
				sb.append(rec.freeclsf).append("\",\"");
				sb.append(rec.resitype).append("\",\"");
				sb.append(rec.rdrtel_no1).append("\",\"");
				sb.append(rec.rdrtel_no2).append("\",\"");
				sb.append(rec.rdrtel_no3).append("\",\"");
				sb.append(rec.rdrptph_no1).append("\",\"");
				sb.append(rec.rdrptph_no2).append("\",\"");
				sb.append(rec.rdrptph_no3).append("\",\"");
				sb.append(rec.rdr_extndt).append("\",\"");
				sb.append(rec.rdr_extntype1).append("\",\"");
				sb.append(rec.rdr_extntype2).append("\",\"");
				sb.append(rec.camprdr_extnnm).append("\",\"");
				sb.append(rec.aplcpath).append("\",\"");
				sb.append(rec.camptype).append("\",\"");
				sb.append(rec.extnnm).append("\",\"");
				sb.append(rec.uprc+"").append("\",\"");
				sb.append(rec.qty+"").append("\",\"");
				sb.append(" "+rec.clamtmatt).append("\",\"");
				sb.append(rec.clamtmonth).append("\",\"");
				sb.append(rec.rcntclamt+"").append("\",\"");
				sb.append(rec.totsubsmonth).append("\",\"");
				sb.append(rec.subsmonth200407aft).append("\",\"");
				sb.append(rec.clamtmthd).append("\",\"");
				sb.append(rec.suspresncd).append("\",\"");
				sb.append(rec.suspdt).append("\",\"");
				sb.append(rec.vexcboyn).append("\",\"");
				sb.append(rec.incmgtm).append("\",\"");
				sb.append(rec.ccempyn).append("\",\"");
				sb.append(rec.trgtyn_j).append("\",\"");
				sb.append(rec.thrwyn_j).append("\"\r\n");				
			}
		}
	}
	else if(jobcd == 2) {
		//---------------------
		//지국구역별마감목록
		//---------------------

		//테이블의 헤더 생성
		sb.append("\"부서코드\",\"부서\",\"파트코드\",\"파트\",\"지역코드\",\"지역\",\"지국지사코드\",\"지국\",\"대행여부\",\"판매망구분\",\"구역코드\",\"확장신청\",\"확장직원\",\"확장요원\",\"확장이전\",\"확장본사\",\"확장품앗이\",\"확장권유\",\"확장기타\",\"확장율\",\"중지이사\",\"중지거절\",\"중지타지\",\"중지기타\",\"중지기타1\",\"중지기타2\",\"중지기타3\",\"중지기타4\",\"중지율\",\"중지신청\",\"중지직원\",\"중지요원\",\"중지이전\",\"중지본사\",\"중지품앗이\",\"중지권유확장\",\"중지기타확장\",\"당월발송부수\",\"당월유가부수\",\"후수1\",\"후수2\",\"후수3\",\"후수4\",\"후수5\",\"후수6\",\"초과후수6\",\"아파트부수\",\"연립부수\",\"주택부수\",\"사무실부수\",\"상가부수\",\"기타부수\",\"홍보지\",\"본사기증지\",\"지국기증지\",\"강투지\",\"기타무료지\",\"예비지\",\"쿠폰\",\"당월무가부수\",\"당월부수\",\"현미수부수\",\"조정부수\",\"재무부수\",\"결손부수\",\"선불부수\",\"휴독부수\",\"현미수금\",\"당월금액\",\"당월할인금액\",\"당월우송료\",\"조정액\",\"재무금액\",\"결손금액\",\"선불금액\",\"휴독금액\",\"지로수금액\",\"방문수금액\",\"지로자동이체수금액\",\"신한카드이체수금액\",\"일반카드이체수금액\",\"온라인결제수금액\",\"기타수금액\",\"미수입금\",\"신수입금\",\"선입금\",\"지역전단수금액\",\"조선IS전단수금액\",\"당월자동이체할인부수\",\"당월일반할인부수\",\"당월미수건수\",\"마감월\"\r\n");

		if(ds != null){ 
			for(int i=0; i<ds.curbocloscloslist.size(); i++){
				SL_L_CLOS_REPORTCURBOCLOSCLOSLISTRecord rec = (SL_L_CLOS_REPORTCURBOCLOSCLOSLISTRecord)ds.curbocloscloslist.get(i);

				//테이블의 데이타 생성
				sb.append("\"");
				sb.append(rec.deptcd+"").append("\",\"");
				sb.append(rec.deptnm).append("\",\"");
				sb.append(rec.partcd+"").append("\",\"");
				sb.append(rec.partnm).append("\",\"");
				sb.append(rec.areacd+"").append("\",\"");
				sb.append(rec.areanm).append("\",\"");
				sb.append(rec.bocd+"").append("\",\"");
				sb.append(rec.bonm).append("\",\"");
				sb.append(rec.oprenvclsfcd+"").append("\",\"");
				sb.append(rec.sellnetclsf+"").append("\",\"");
				sb.append(rec.dstccd+"").append("\",\"");
				sb.append(rec.rdr_extnaplc+"").append("\",\"");
				sb.append(rec.rdr_extnemp+"").append("\",\"");
				sb.append(rec.rdr_extnstaf+"").append("\",\"");
				sb.append(rec.rdr_extnrdr_movm+"").append("\",\"");
				sb.append(rec.rdr_extnhdqt+"").append("\",\"");
				sb.append(rec.rdr_extnexg+"").append("\",\"");
				sb.append(rec.rdr_extncnvs+"").append("\",\"");
				sb.append(rec.rdr_extnetc+"").append("\",\"");
				sb.append(rec.rdr_extnrate+"").append("\",\"");
				sb.append(rec.suspmovm+"").append("\",\"");
				sb.append(rec.susprefu+"").append("\",\"");
				sb.append(rec.suspothnwsp+"").append("\",\"");
				sb.append(rec.suspetc+"").append("\",\"");
				sb.append(rec.suspetc1+"").append("\",\"");
				sb.append(rec.suspetc2+"").append("\",\"");
				sb.append(rec.suspetc3+"").append("\",\"");
				sb.append(rec.suspetc4+"").append("\",\"");
				sb.append(rec.susprate+"").append("\",\"");
				sb.append(rec.suspaplc+"").append("\",\"");
				sb.append(rec.suspemp+"").append("\",\"");
				sb.append(rec.suspstaf+"").append("\",\"");
				sb.append(rec.susprdr_movm+"").append("\",\"");
				sb.append(rec.susphdqt+"").append("\",\"");
				sb.append(rec.suspexg+"").append("\",\"");
				sb.append(rec.suspcnvsrdr_extn+"").append("\",\"");
				sb.append(rec.suspetcrdr_extn+"").append("\",\"");
				sb.append(rec.thmmsendqty+"").append("\",\"");
				sb.append(rec.thmmvalqty+"").append("\",\"");
				sb.append(rec.aftcnt1+"").append("\",\"");
				sb.append(rec.aftcnt2+"").append("\",\"");
				sb.append(rec.aftcnt3+"").append("\",\"");
				sb.append(rec.aftcnt4+"").append("\",\"");
				sb.append(rec.aftcnt5+"").append("\",\"");
				sb.append(rec.aftcnt6+"").append("\",\"");
				sb.append(rec.excsaftcnt6+"").append("\",\"");
				sb.append(rec.aptqty+"").append("\",\"");
				sb.append(rec.villaqty+"").append("\",\"");
				sb.append(rec.housqty+"").append("\",\"");
				sb.append(rec.offi_roomqty+"").append("\",\"");
				sb.append(rec.shopqty+"").append("\",\"");
				sb.append(rec.etcqty+"").append("\",\"");
				sb.append(rec.pub_infonwsp+"").append("\",\"");
				sb.append(rec.hdqt_dntnwsp+"").append("\",\"");
				sb.append(rec.bodntnwsp+"").append("\",\"");
				sb.append(rec.frc_thrwnwsp+"").append("\",\"");
				sb.append(rec.etcfreenwsp+"").append("\",\"");
				sb.append(rec.resvnwsp+"").append("\",\"");
				sb.append(rec.cupn+"").append("\",\"");
				sb.append(rec.thmmno_valqty+"").append("\",\"");
				sb.append(rec.thmmqty+"").append("\",\"");
				sb.append(rec.nowun_recpqty+"").append("\",\"");
				sb.append(rec.medaqty+"").append("\",\"");
				sb.append(rec.re_freeqty+"").append("\",\"");
				sb.append(rec.lossqty+"").append("\",\"");
				sb.append(rec.ppymqty+"").append("\",\"");
				sb.append(rec.temp_stopqty+"").append("\",\"");
				sb.append(rec.now_un_recp_amt+"").append("\",\"");
				sb.append(rec.thmm_amt+"").append("\",\"");
				sb.append(rec.thmmdscnamt+"").append("\",\"");
				sb.append(rec.thmmpost_dlvfee+"").append("\",\"");
				sb.append(rec.meda_amt+"").append("\",\"");
				sb.append(rec.re_freeamt+"").append("\",\"");
				sb.append(rec.lossamt+"").append("\",\"");
				sb.append(rec.ppymamt+"").append("\",\"");
				sb.append(rec.temp_stopamt+"").append("\",\"");
				sb.append(rec.giroclamt+"").append("\",\"");
				sb.append(rec.vistclamt+"").append("\",\"");
				sb.append(rec.giroauto_shiftclamt+"").append("\",\"");
				sb.append(rec.docard_shiftclamt+"").append("\",\"");
				sb.append(rec.gnrcard_shiftclamt+"").append("\",\"");
				sb.append(rec.onlsetlclamt+"").append("\",\"");
				sb.append(rec.etcclamt+"").append("\",\"");
				sb.append(rec.un_recp_repm+"").append("\",\"");
				sb.append(rec.new_repm+"").append("\",\"");
				sb.append(rec.pre_repm+"").append("\",\"");
				sb.append(rec.arealeafclamt+"").append("\",\"");
				sb.append(rec.teampreisleafclamt+"").append("\",\"");
				sb.append(rec.thmmval_adsc_qty+"").append("\",\"");
				sb.append(rec.thmmval_ndsc_qty+"").append("\",\"");
				sb.append(rec.unclamtcnt+"").append("\",\"");
				sb.append(rec.closmm+"").append("\"\r\n");
			}
		}
	}
	
	
	if(jobcd>=0) {
		byte[] bytestream = sb.toString().getBytes();
	
		response.reset();
		response.setHeader("Content-Type", "application/vnd.ms-excel;charset=KSC5601");
		response.setHeader("Content-Disposition", "attachment; filename="+filename+yymm+".csv");
		response.setHeader("Content-Description", "JSP Generated Data");
		response.setHeader("Content-Transfer-Encoding", "binary;");
		response.setHeader("Pragma", "no-cache;");
		response.setHeader("Expires", "-1;");
	
		OutputStream outStream = response.getOutputStream();
		outStream.write(bytestream);
		outStream.close();
		
	} else {
		RwXmlWrapper rxw = new RwXmlWrapper();
		int root = RwXmlWrapper.rootNodeID;
		int codeData = rxw.add(root, "codeData", "");
		int result = rxw.add(codeData, "jobrslt", jobcd);
		int resultmsg = rxw.add(codeData, "jobmsg", title);
		rxw.flush(out);
	}

%>
