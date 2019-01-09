<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_1411_l.jsp
* 기능 : 매체 일괄발송 발송처리 발송방법별 상세조회
* 작성일자 : 2004-03-03
* 작성자 : 장수환
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 20090209
* 백업파일명 : ps_send_1411_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    String records_per_page = request.getParameter("records_per_page");
    // dataset 인스턴스 선언부분
    PS_L_SEND_DD_PROC_DTLSDataSet ds = (PS_L_SEND_DD_PROC_DTLSDataSet)request.getAttribute("ds");  // request dataset

	int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) - ds.curcommlist.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // 조회 결과.
    rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "detailGrid");
   	
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>

