<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_rdr_1701_a.jsp
* 기능 : 지사별입력목록 초기
* 작성일자 : 2004-02-21
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-05
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    // 페이지당 보여줄 라인수
    String records_per_page = "15";
    int li_per = Integer.parseInt(records_per_page) ;
    //	dataset 인스턴스 선언부분
	PS_S_PUBL_RDRDataSet ds = (PS_S_PUBL_RDRDataSet)request.getAttribute("ds");

	String input_fromdt = Util.Uni2Ksc(Util.checkString(request.getParameter("input_fromdt"))); //신청기간(from)
	String input_todt = Util.Uni2Ksc(Util.checkString(request.getParameter("input_todt"))); //신청기간(to)


	//신청기간(from) 초기화 체크
	if (input_fromdt.equals("")) {
		input_fromdt  =  Util.addDate(Util.getDate(),-5);   //현재일자로부터 10일전
	}

	//신청기간(to) 초기화 체크
	if (input_todt.equals("")) {
		input_todt  =  Util.getDate();                     //현재일자
	}
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "defaultFrom", input_fromdt);
    rxw.add(initTemp, "defaultTo", input_todt);
    rxw.add(initTemp, "js_fn_nm", "page_move");
       
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "전체", "", initTemp, "mcCombo");
    rxw.makeDataToList(ds, "asinbocdcur", "bonm", "bocd", "전체", "", initTemp, "branchCombo");
    
	rxw.flush(out);

%>

