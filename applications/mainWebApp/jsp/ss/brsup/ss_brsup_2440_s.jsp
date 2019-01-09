<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ss_brsup_2440_s.jsp
* 기능     : 주간조선관리-정산마감-마감내역-호수별 상세 조회
* 작성일자 : 2007-08-29
* 작성자   : 이혁
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
	SS_L_WEEKSND_CLOSPTCR_SERNODataSet ds = (SS_L_WEEKSND_CLOSPTCR_SERNODataSet)request.getAttribute("ds");

    String js_fn_nm			=	request.getParameter("js_fn_nm");
	int no_pagesize			=	10 - ds.closptcrcur.size();
	
	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeDataToBulk(ds, "closptcrcur", root, "detailGrid");
	/*rxw.makeHugeStart(root, "detailGrid", ds.closptcrcur.size());
	for(int i=0; i < ds.closptcrcur.size(); i++)
	{
		SS_L_WEEKSND_CLOSPTCR_SERNOCLOSPTCRCURRecord closptcrcurRec = (SS_L_WEEKSND_CLOSPTCR_SERNOCLOSPTCRCURRecord)ds.closptcrcur.get(i);
		
		//title 추가.
		if(i == 0)
		{
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(closptcrcurRec);
		}
		
		//데이터 추가.
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(closptcrcurRec, false);
	}
	rxw.makeHugeEnd();*/
	
	rxw.flush(out);
%>
