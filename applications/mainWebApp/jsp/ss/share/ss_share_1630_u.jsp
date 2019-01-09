<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_1630_u.jsp
* 기능 : 정보공유 게시판 업무협조 수정
* 작성일자 : 2003-12-08
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    String seq = Util.checkString((String)request.getAttribute("seq"));
    String pageno = Util.checkString((String)request.getAttribute("pageno"));
    String pagesize = Util.checkString((String)request.getAttribute("pagesize"));
    String rmsgdept = Util.checkString((String)request.getAttribute("rmsgdept"));         //수신부서선택
    String rmsgarea = Util.checkString((String)request.getAttribute("rmsgarea"));         //수신지역선택
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));
    String brwscnt = Util.checkString((String)request.getAttribute("brwscnt"));
    int brwscnt_int = Integer.parseInt(brwscnt) - 1;  

%>

<script language="javascript">
<!--
//업무협조 수정확인
function update_ok(){
    alert("수정되었습니다.");
    infoexg_update_form.action="/ss/share/1620";
    infoexg_update_form.submit();
}    
-->
</script>

<body onload=update_ok();>
<form name="infoexg_update_form" method="post" action="">
	<input type="hidden" name="seq" value="<%=seq%>">
	<input type="hidden" name="pageno" value="<%=pageno%>">
	<input type="hidden" name="pagesize" value="<%=pagesize%>">	
	<input type="hidden" name="rmsgdept" value="<%=rmsgdept%>">
	<input type="hidden" name="rmsgarea" value="<%=rmsgarea%>">
	<input type="hidden" name="search_word" value="<%=search_word%>">
	<input type="hidden" name="search_word_kind" value="<%=search_word_kind%>">
	<input type="hidden" name="brwscnt" value="<%= brwscnt_int%>">
</form>
</body>
