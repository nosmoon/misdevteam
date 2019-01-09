<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1860_a.jsp
* 기능 : 지국지원-빌링-수납수수료-마감-마감취소
* 작성일자 : 2004-03-09
* 작성자 : 김영윤
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-12
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_A_RECPCOMSCLOS_CLOSEDataSet ds = (SS_A_RECPCOMSCLOS_CLOSEDataSet)request.getAttribute("ds");

	//TrustForm 처리 시작
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.setMessageAlert("마감취소 되었습니다.");
	//System.out.println(rxw.getXml());
	rxw.flush(out);
%>

<%--
message만 처리하고. 화면갱신은 xrw 화면에 설정된 값을 이용한다.
<script language="javascript">
    alert("마감취소 되었습니다.");

    // 상세화면을 갱신해준다.
	parent.sls_detail_view('<%//= ds.basidt%>');
</script>
--%>