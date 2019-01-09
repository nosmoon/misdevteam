<%@ page contentType="text/xml; charset=euc-kr" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1740_a.jsp
* 기능 : 지국업무지원-Billing자동이체-청구결과관리-초기화면
* 작성일자 : 2004-03-25
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-04-16
* 백업파일명 : ss_brsup_1770_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    String concatDelimiter = "##";	// 입금처리 시 강 항목을 concatenate할 때 사용되는 delimiter

    SS_L_APLC_MANG_INITDataSet ds = (SS_L_APLC_MANG_INITDataSet)request.getAttribute("ds");

    //int moveListCount = 20;	// 한 화면당 리스트 항목 수
    int moveListCount = 5000;	// 한 화면당 리스트 항목 수
    applySession = false;	// 세션 적용 여부

    String monthOptionsHtml = null; // 년월 리스트를 구성할 options를 write하기 위한 임시 변수

	StringBuffer sb = new StringBuffer("");
	Calendar calendar = new GregorianCalendar(Locale.KOREA);
//    calendar.add(Calendar.YEAR, -1);

	String tempMonth = null;
	for(int i=0; i<13; i++){
		tempMonth = String.valueOf(calendar.get(Calendar.MONTH)+1);
		if(tempMonth.length()==1) {
    		tempMonth = "0" + tempMonth;
    	}
		sb.append("<option value=\"");
		sb.append(String.valueOf(calendar.get(Calendar.YEAR))+tempMonth);
		sb.append("\"");
		sb.append(">");
		sb.append(calendar.get(Calendar.YEAR) + "년 " + tempMonth + "월");
		sb.append("</option>");

		calendar.add(Calendar.MONTH, -1);
	}
	monthOptionsHtml = sb.toString();
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int codeData = rxw.add(root, "codeData", "");
    
    rxw.add(codeData, "applySession", String.valueOf(applySession));    
    rxw.add(codeData, "pagesize", moveListCount);
    
	rxw.add(codeData, "f_basidt", Util.getDate()); //청구월 시작
	rxw.add(codeData, "t_basidt", Util.getDate()); //청구월 끝
	
	rxw.makeDataToList(ds, "shftclsf", "cicdnm", "cicodeval", "전체", "", codeData, "shftCombo");//이체구분
	rxw.makeDataToList(ds, "jycur", "areanm", "areacd", "전체", "", codeData, "areaCombo");//지역

	rxw.flush(out);
%>