<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_reader_1230_a.jsp
* 기능 		 : 독자정보관리(입금정보저장)
* 작성일자 	 :
* 작성자 	 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
	String result = (String)request.getAttribute("result");
	out.write("result  : " + result);

    //request
    String rdr_no = request.getParameter("rdr_no");
    String medicd = request.getParameter("medicd");
%>
<script language="javascript">
<!--
	alert("저장되었습니다.");
	// 상세정보 폼의 값을 reset 해준다.
	parent.rcpm_list_search('<%=rdr_no%>','<%=medicd%>', '');
-->
</script>
<%
	out.flush();
%>