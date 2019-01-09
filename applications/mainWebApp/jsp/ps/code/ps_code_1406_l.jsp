<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_code_1406_l.jsp
* 기능 : 지국통합코드관리 리스트
* 작성일자 : 2004-01-12
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-02-12
* 백업파일명 : ps_code_1406_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // 화면에 보여줄 라인수
    String records_per_page =   request.getParameter("records_per_page");
    // dataset 인스턴스 선언부분
    PS_L_CMPYBO_INTGDataSet ds = (PS_L_CMPYBO_INTGDataSet)request.getAttribute("ds");  // request dataset
	int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) - ds.curcommlist.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // 조회 결과.
   	rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "infoGrid");
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>

