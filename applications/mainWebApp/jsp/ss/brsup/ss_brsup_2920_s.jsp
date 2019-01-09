<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_2920_S.jsp
* 기능 : 센터지원-판촉현황-요원관리-요원별실적관리-조회-상세(팝업)
* 작성일자 : 2016-08-11
* 작성자 : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
	SS_SLS_BRSUP_2920_SDataSet ds = (SS_SLS_BRSUP_2920_SDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();

    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

	// 조회 결과.
  	rxw.makeDataToBulk(ds, "staflist", acctTemp, "listGrid");

	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.

    // page 처리. 추가 필요.
%>


