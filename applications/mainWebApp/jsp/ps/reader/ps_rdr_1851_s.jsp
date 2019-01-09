<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_rdr_1851_s.jsp
* 기능 : 독자-지국독자조회
* 작성일자 : 2007-03-26
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-13
* 백업파일명 : ps_rdr_1851_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    //  dataset 인스턴스 선언부분
	PS_S_PUBL_RDRDataSet ds = (PS_S_PUBL_RDRDataSet)request.getAttribute("ds");

	// 검색 리스트 초기 카운트
	int recCount  =  10;
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    //rxw.add(initTemp, "recordPerPage", recCount);
    rxw.add(initTemp, "pagesize", recCount);
    rxw.add(initTemp, "js_fn_nm", "page_move");

    rxw.makeDataToList(ds, "curdeptcd", "boksnm", "deptcd", "전체", "", initTemp, "deptCombo"); // 부서
    rxw.makeDataToList(ds, "areacdcur", "areanm", "areacd", "전체", "", initTemp, "areaCombo");  // 지역
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", initTemp, "mcCombo"); // 신청매체
        
	rxw.flush(out);
    
%>

