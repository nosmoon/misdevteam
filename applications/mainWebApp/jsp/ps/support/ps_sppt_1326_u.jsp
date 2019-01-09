<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_sppt_1226_u.jsp
* 기능     : 등록후 리턴되는곳
* 작성일자 : 2004-12-08
* 작성자   : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
String accflag = Util.checkString(request.getParameter("accflag"));
%>
<script language="javascript">
var lo_form1    = parent.document.code_search_form;
var ls_cur_page = lo_form1.curr_page_no.value;

if ('<%=accflag%>' == "20"){
       alert("처리 하였습니다.");
       parent.search_list(ls_cur_page);
       parent.setEventHandler();
}

</script>