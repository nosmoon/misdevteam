<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_send_2421_s.jsp
* 기능     : 주간조선관리-정산마감-마감내역-호수별 상세 조회
* 작성일자 : 2007-11-01
* 작성자   : 김재일
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 20090209
* 백업파일명 : ps_send_2421_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // dataset 인스턴스 선언부분
	PS_L_WEEKSND_CLOSPTCR_SERNODataSet ds = (PS_L_WEEKSND_CLOSPTCR_SERNODataSet)request.getAttribute("ds");
	
    String js_fn_nm			=	request.getParameter("js_fn_nm");
	int no_pagesize			=	10 - ds.closptcrcur.size();
	
	RwXmlWrapper rxw = new RwXmlWrapper();

    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
    
    // rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
    
    // 조회 결과.
    
   	rxw.makeDataToBulk(ds, "closptcrcur", acctTemp, "detailGrid");
   	
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
    
%>
