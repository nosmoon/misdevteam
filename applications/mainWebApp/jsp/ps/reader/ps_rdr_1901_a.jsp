<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명  : ps_rdr_1901_a.jsp
* 기능    : 수금입력목록 초기
* 작성일자 : 2008-07-14
* 작성자  : 김재일
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-06
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    // 페이지당 보여줄 라인수
    String records_per_page = "15";
    int li_per = Integer.parseInt(records_per_page);
    //	dataset 인스턴스 선언부분
	PS_S_PUBL_RDRDataSet ds = (PS_S_PUBL_RDRDataSet)request.getAttribute("ds");

	String procdt_fr = Util.Uni2Ksc(Util.checkString(request.getParameter("procdt_fr"))); //입금일자(from)
	String procdt_to = Util.Uni2Ksc(Util.checkString(request.getParameter("procdt_to"))); //입금일자(to)


	//입금일자(from) 초기화 체크
	if (procdt_fr.equals("")) {
		procdt_fr  =  Util.addDate(Util.getDate(),-5);   //현재일자로부터 10일전
	}

	//입금일자(to) 초기화 체크
	if (procdt_to.equals("")) {
		procdt_to  =  Util.getDate();                    //현재일자
	}
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "defaultFrom", procdt_fr);
    rxw.add(initTemp, "defaultTo", procdt_to);
    rxw.add(initTemp, "js_fn_nm", "page_move");
       
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "전체", "", initTemp, "mcCombo"); // 신청매체
    rxw.makeDataToList(ds, "asinbocdcur", "bonm", "bocd", "전체", "", initTemp, "branchCombo");  // 지사
    rxw.makeDataToList(ds, "rcpmmthdcur", "cicdnm", "cicodeval", "전체", "", initTemp, "rcpCombo");  // 입금방법
    
	rxw.flush(out);

%>

