<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : ss_brsup_2130_a.jsp
* 기능 	 	 : 지국지원-컴퓨터AS(등록,수정,삭제)
* 작성일자 	 : 2004-03-15
* 작성자 	 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%-- 비품등록이었을 경우 --%>
<% 
	String acc_flg = request.getParameter("accflag");
	if("I".equals(acc_flg)){
%>
<script language="javascript">

	alert("추가되었습니다.");
	
	// 상세정보 폼의 값을 reset 해준다.
	parent.bocomp_cancel();
	
	// 검색조건을 체크해서 검색조건이 있을 경우,
	// 즉 검색 후 추가를 하였다면 다시한번 submit 하여 리스트를 갱신해준다.
	parent.list_search();
</script>
<% } %>
<%-- 현금출납부 수정이었을 경우 --%>
<% 
	if("U".equals(acc_flg)){
%>
<script language="javascript">

	alert("수정되었습니다.");
	
	// 무조건 검색 후 수정이므로 검색폼을 submit 시켜준다.
	 parent.list_search();
</script>
<% } %>
<%-- 현금출납부 삭제이었을 경우 --%>
<% 
	if("D".equals(acc_flg)){
%>
<script language="javascript">

	alert("삭제되었습니다.");
	
	// 상세정보 폼의 값을 reset 해준다.
	parent.bocomp_cancel();
	
	// 검색조건을 체크해서 검색조건이 있을 경우,
	// 즉 검색 후 추가를 하였다면 다시한번 submit 하여 리스트를 갱신해준다.
	parent.list_search();
</script>
<% } %>