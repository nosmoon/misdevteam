<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ss_brsup_2420_l.jsp
* 기능     : 주간조선관리-정산마감-마감내역
* 작성일자 : 2007-04-16
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-03
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    applySession			=	true;    	//세션 적용 여부

    // dataset 인스턴스 선언부분
	SS_L_WEEKSND_CLOSPTCRDataSet ds = (SS_L_WEEKSND_CLOSPTCRDataSet)request.getAttribute("ds");

	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "records_per_page", request.getParameter("pagesize"));
	rxw.add(resTemp, "totalcnt_f", Util.comma(ds.getTotalcnt()));
	
	rxw.makeDataToBulk(ds, "closptcrcur", resTemp, "listGrid");
	
	rxw.flush(out);
%>
