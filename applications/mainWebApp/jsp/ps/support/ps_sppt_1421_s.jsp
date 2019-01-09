<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_sppt_1421_s.jsp
* 기능 : 현금영수증신청내역 상세조회
* 작성일자 : 2005-12-20
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-02-17
* 백업파일명 : ps_sspt_1421_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // dataset 인스턴스 선언부분
    PS_S_CASHRCPTDataSet ds = (PS_S_CASHRCPTDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	// 조회 결과.
	rxw.makeDataToBulk(ds, acctTemp, "detailGrid");
		
	rxw.flush(out);
	
	// data가 없을 경우 처리. 추가 필요.
%>