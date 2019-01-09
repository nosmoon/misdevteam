<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명	: ss_brsup_1757_u.jsp
* 기능		: 지국지원-빌링_자동이체-신청관리-이체방법전환
* 작성일자	: 2004-05-27
* 작성자	: 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-20
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>

<%
	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTEmp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTEmp, "msg", "변경하였습니다.");
	rxw.add(resTEmp, "temp", request.getParameter("temp"));			//reset을 용이하게 하기 위해 이체구분 combo의 값을 다시 돌려줌.
	rxw.add(resTEmp, "accflag", request.getParameter("accflag"));	//처리구분.
	
	rxw.flush(out);
%>
