<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명	: ss_brsup_1755_l.jsp
* 기능		: 지국지원-빌링_자동이체-신청관리-이체방법전환 초기화면
* 작성일자	: 2003-12-29
* 작성자	: 김상열
* 비고		: 이체방법전환 대상목록은 해지신청 대상목록과 같다.
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-17
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>

<%
    SS_L_APLC_EXPYDataSet ds = (SS_L_APLC_EXPYDataSet)request.getAttribute("ds");

    String n = "1"; // 신규신청 탭의 백그라운드 이미지이름을 구성할 문자
    String e = ""; // 해지신청 탭의 백그라운드 이미지이름을 구성할 문자
    String c = ""; // 이체방법전환 탭의 백그라운드 이미지이름을 구성할 문자

    if("E".equals(request.getParameter("accflag"))) {
        n = "";
        e = "1";
        c = "";
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
	
	//이체방법전환가능 목록
    rxw.makeHugeStart(resTemp, "listGrid", ds.rsltcur.size());
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_APLC_EXPYRSLTCURRecord rsltcurRec = (SS_L_APLC_EXPYRSLTCURRecord)ds.rsltcur.get(i);
        
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
	
	rxw.add(resTemp, "bocd", request.getParameter("bocd"));
	rxw.add(resTemp, "rdr_no", request.getParameter("rdr_no"));
	rxw.add(resTemp, "accflag", "C");
	
	rxw.flush(out);
%>
