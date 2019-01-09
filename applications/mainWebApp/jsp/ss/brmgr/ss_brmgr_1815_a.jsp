<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : ss_brmgr_1815_a.jsp
* 기능 	 	 : 판매지국-통신실 아파트투입 현황조사 및 등록 초기화면
* 작성일자 	 : 2004-02-24
* 작성자 	 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ########## 수정 ###########
* 파일명 	 : ss_brmgr_1815_a.jsp
* 기능 	 	 : 판매국-지국경영-아파트투입율-아파트투입 현황조사 및 등록 초기화면
* 작성일자 	 : 2005-10-05
* 작성자 	 : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-10
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%--
    int page_rec = 5;
--%>

<%
    int page_rec = 5000;	//5 -> 5000

    // dataset 인스턴스 선언부분
    SS_L_COMM_APT_THRWDataSet ds = (SS_L_COMM_APT_THRWDataSet)request.getAttribute("ds");  // request dataset

    String concatDelimiter = "##";	// 일괄업데이트를 위한 구분자
    String incmgtype = Util.getSessionParameterValue(request, "uid", true);
    String reg1 = "";
    boolean applySession = true;	// 세션 적용 여부

    if( (incmgtype.substring(0,1)).equals("c") ) {
      reg1 = "10";
    } else if( (incmgtype.substring(0,1)).equals("i") ) {
      reg1 = "20";
    } else {
      reg1 = "30";
    }
    
  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	int defaultData = rxw.add(resTemp, "defaultData", "");
	rxw.add(defaultData, "applySession", String.valueOf(applySession));
	rxw.add(defaultData, "bocd", request.getParameter("bocd"));
	rxw.add(defaultData, "incmgtype", incmgtype);
	rxw.add(defaultData, "year", Util.getYear());
	rxw.add(defaultData, "month", Util.getMonth());
	rxw.add(defaultData, "day", Util.getDay());
	rxw.add(defaultData, "invsgpers", getCookieParameterValue(request, "EMP_NM", false));
	rxw.add(defaultData, "jobcdset", request.getParameter("jobcdset"));
	rxw.add(defaultData, "invsgdt1", Util.getYear()+"0101");
	rxw.add(defaultData, "invsgdt2", Util.getDate());
	rxw.add(defaultData, "sel_regtype1", reg1);
	
	int naviInfo = rxw.add(resTemp, "naviInfo", "");
	rxw.add(naviInfo, "records_per_page", page_rec);
	rxw.add(naviInfo, "curr_page_no", request.getParameter("curr_page_no")==null || "".equals(request.getParameter("curr_page_no")) ? "1" : request.getParameter("curr_page_no"));
	rxw.add(naviInfo, "total_records", "0");
	
	int useData = rxw.add(resTemp, "useData", "");
	
	//아파트목록.
	rxw.makeDataToBulkList(ds, "addrcdcur", "addrnm", "addrcd", "선택", "", useData, "addrcdCombo");
	
	//동목록.
	rxw.makeEmpytList(useData, "dongnoCombo", "선택", "");
	
	//등록자구분1
	rxw.makeDataToBulkList(ds, "regtypecur1", "cicdnm", "cicodeval", "선택", "", useData, "selRegtype1Combo");
	
	//등록자구분2
	rxw.makeDataToBulkList(ds, "regtypecur2", "cicdnm", "cicodeval", "선택", "", useData, "selRegtype2Combo");
	
	//배달상태
	rxw.makeDataToBulkList(ds, "dlvstatcur", "cicdnm", "cicodeval", "선택", "", useData, "selDlvstatcd1Combo");
	rxw.makeDataToBulkList(ds, "dlvstatcur", "cicdnm", "cicodeval", "선택", "", useData, "selDlvstatcd2Combo");
	rxw.makeDataToBulkList(ds, "dlvstatcur", "cicdnm", "cicodeval", "선택", "", useData, "selDlvstatcd3Combo");
	
	//아파트
	rxw.makeDataToBulkList(ds, "addrcdcur", "addrnm", "addrcd", "전체", "", useData, "thrwAddrcdCombo");
	
	rxw.flush(out);
%>

