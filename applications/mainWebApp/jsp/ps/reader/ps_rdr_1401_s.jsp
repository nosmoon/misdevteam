<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_rdr_1401_s.jsp
* 기능 : 독자-독자조회
* 작성일자 : 2004-02-21
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-05
* 백업파일명 : ps_rdr_1401_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
	// 페이지당 보여줄 라인수
    String records_per_page = "15";
    int li_per = Integer.parseInt(records_per_page) ;
    
    //	dataset 인스턴스 선언부분
	PS_S_PUBL_RDRDataSet ds = (PS_S_PUBL_RDRDataSet)request.getAttribute("ds");

	String aplcdtfr = Util.Uni2Ksc(Util.checkString(request.getParameter("aplcdtfr"))); //신청기간(from)
	String aplcdtto = Util.Uni2Ksc(Util.checkString(request.getParameter("aplcdtto"))); //신청기간(to)

	//신청기간(from) 초기화 체크
	if (aplcdtfr.equals("")) {
		aplcdtfr  =  Util.addMonth(Util.getDate(),-24);   //현재일자로부터 24개월전
	}

	//신청기간(to) 초기화 체크
	if (aplcdtto.equals("")) {
		aplcdtto  =  Util.getDate();                     //현재일자
	}
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "defaultFrom", aplcdtfr);
    rxw.add(initTemp, "defaultTo", aplcdtto);
    rxw.add(initTemp, "js_fn_nm", "page_move");
       
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "전체", "", initTemp, "mcCombo");
    rxw.makeDataToList(ds, "asinbocdcur", "bonm", "bocd", "전체", "", initTemp, "branchCombo");
    
	rxw.flush(out);
	
%>

