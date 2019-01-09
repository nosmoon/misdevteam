<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_common_1701_s.jsp
* 기능 : 독자번호로 독자정보검색(BOCD)
* 작성일자 : 2004-05-13
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-02-27
* 백업파일명 : ps_common_1701_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
   //  값을 Set해주는 function명
   String setFunction = request.getParameter("setFunction") ;
    // dataset 인스턴스 선언부분
    PS_S_RDRINFODataSet ds = (PS_S_RDRINFODataSet)request.getAttribute("ds");  // request dataset
	
    RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // 조회 결과.
    rxw.makeDataToBulk(ds, acctTemp, "detailGrid");
   	
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
%>

