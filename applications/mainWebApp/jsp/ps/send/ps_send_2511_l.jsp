<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_2511_l.jsp
* 기능 : 배달비마감-마감내역 조회화면
* 작성일자 : 2008-07-29
* 작성자 : 김재일
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-02-11
* 백업파일명 : ps_send_2511_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // dataset 인스턴스 선언부분
	PS_L_WEEKSND_CLOSPTCRDataSet ds = (PS_L_WEEKSND_CLOSPTCRDataSet)request.getAttribute("ds");

    // 화면에 보여줄 라인수
    String pagesize			=	request.getParameter("pagesize");
    String curr_page_no		=	request.getParameter("curr_page_no");
    String totalcnt			=	String.valueOf(ds.getTotalcnt());
    String js_fn_nm			=	request.getParameter("js_fn_nm");

	int no_pagesize			=	Integer.parseInt(pagesize) - ds.closptcrcur.size();
	
	RwXmlWrapper rxw = new RwXmlWrapper();

    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
    
    // 조회 결과.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
   	rxw.makeDataToBulk(ds, "closptcrcur", acctTemp, "infoGrid");
    
	rxw.flush(out);
	
    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>

