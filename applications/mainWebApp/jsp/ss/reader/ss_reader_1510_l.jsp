<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1510_l.jsp
* 기능 : 독자현황-VacationStop-코드-목록
* 작성일자 : 2004-03-29
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-06
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_VSCDDataSet ds = (SS_L_VSCDDataSet)request.getAttribute("ds");  // request dataset
    //int vscdListCount = 12;	// 한 화면당 리스트 항목 수
    int vscdListCount = 5000;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	rxw.add(resTemp, "totalCount", Util.comma(ds.getTotalcnt()));
	
	rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", vscdListCount);
	rxw.add(resTemp, "page_set_gubun", 0);
	
	rxw.makeDataToBulk(ds, "curcommlist", resTemp, "listgrid");
	
	rxw.flush(out);
	//건수가 없을 경우 "검색 결과가 없습니다"
%>


