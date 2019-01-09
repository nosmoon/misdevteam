<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_common_1201_s.jsp
* 기능 : 사원번호로 사원정보검색
* 작성일자 : 2004-02-20
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-03-03
* 백업파일명 : ps_common_1201_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
   // 영업사원과 관리사원 구부하여 값을 Set해주는 function명
   String setFunction = request.getParameter("setFunction") ;
    // dataset 인스턴스 선언부분
   PB_S_CORBOEMPDataSet ds = (PB_S_CORBOEMPDataSet)request.getAttribute("ds");  // request dataset
	    
   RwXmlWrapper rxw = new RwXmlWrapper();
   
   int root = RwXmlWrapper.rootNodeID;
   int acctTemp = rxw.makeParentNode(root, "dataTemp");

   // 조회 결과.
   rxw.makeDataToBulk(ds, acctTemp, "detailGrid");
  	
   rxw.flush(out);

   // data가 없을 경우 처리. 추가 필요. 
   
%>
