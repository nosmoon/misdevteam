<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명	: sl_reader_1395_l.jsp
* 기능		: 독자-독자정보관리-자동이체신청 초기화
* 작성일자	: 2003-12-27
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
    SL_L_APLC_NEWDataSet ds = (SL_L_APLC_NEWDataSet)request.getAttribute("ds");

    String n = "1"; // 신규신청 탭의 백그라운드 이미지이름을 구성할 문자
    String e = ""; // 해지신청 탭의 백그라운드 이미지이름을 구성할 문자
    String c = ""; // 이체방법전환 탭의 백그라운드 이미지이름을 구성할 문자

    if("E".equals(request.getParameter("accflag"))) {
        n = "";
        e = "1";
    }

    if("C".equals(request.getParameter("accflag"))) {
        n = "";
        e = "";
        c = "1";
    }
    
  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//이전신청정보 리스트 -> 사용안함.
	rxw.makeDataToBulkList(ds, "pymtcur", "banknm", "acctno", "선택", "", resTemp, "pymtcurCombo");
	
	//은행코드 리스트
	rxw.makeDataToBulkList(ds, "bankcur", "cicdnm", "cicodeval", "선택", "", resTemp, "recpinsttCombo");
	
	//카드사 리스트
	rxw.makeDataToBulkList(ds, "cardcur", "cicdnm", "cicodeval", "선택", "", resTemp, "cardcmpycdCombo");
	
	//신청적용년월
	rxw.makeHugeListStart(resTemp, "aplyyymmCombo");
	rxw.addHugeListItem("선택", "");
	
	Calendar calendar = new GregorianCalendar(Locale.KOREA);
    calendar.add(Calendar.MONTH, 1);
    String tempStr = "";
    calendar.add(Calendar.MONTH, -1);

    for(int i=0; i<12; i++) {
        if(calendar.get(Calendar.MONTH)+1 < 10) {
            tempStr = "0" + String.valueOf(calendar.get(Calendar.MONTH)+1);
        } else {
            tempStr = String.valueOf(calendar.get(Calendar.MONTH)+1);
        }
        rxw.addHugeListItem(new StringBuffer().append(calendar.get(Calendar.YEAR)).append("년").append(calendar.get(Calendar.MONTH)+1).append("월").toString(), String.valueOf(calendar.get(Calendar.YEAR))+tempStr);
        calendar.add(Calendar.MONTH, 1);
    }
    rxw.makeHugeEnd();
    
    //신규이체신청가능 목록
    rxw.makeHugeStart(resTemp, "listGrid", ds.rsltcur.size());
	for(int i=0; i<ds.rsltcur.size(); i++){
		SL_L_APLC_NEWRSLTCURRecord rsltcurRec = (SL_L_APLC_NEWRSLTCURRecord)ds.rsltcur.get(i);
        
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("idx");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rsltcurRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal("");
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rsltcurRec, false);
	}
	rxw.makeHugeEnd();
	
	//기타데이터.
	int detailData = rxw.add(resTemp, "detailData", "");
	rxw.add(detailData, "aplcdt", Util.getDate());
	rxw.add(detailData, "accflag", "N");
	rxw.add(detailData, "shftclsf", "110");
	
	rxw.flush(out);
%>
