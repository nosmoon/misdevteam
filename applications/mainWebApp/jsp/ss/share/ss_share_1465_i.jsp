<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_1465_i.jsp
* 기능 : 정보공유 게시판 판매국 등록
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
    String pageno = (String)request.getAttribute("pageno");
    if(pageno == null) {pageno = "1";}
    String pagesize = (String)request.getAttribute("pagesize");
    if(pagesize == null) {pagesize = "10";}
    String rmsgdept = Util.checkString((String)request.getAttribute("rmsgdept"));         //수신부서선택
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));    
        
%>
<script language="javascript">
<!--
// 게시판 판매국 등록 확인
function insert_ok(){
    alert("답변등록 되었습니다.");
    infoexg_insert_form.action="/ss/share/1401";
    infoexg_insert_form.submit();
}    
-->
</script>

<body onload=insert_ok();>
<form name="infoexg_insert_form" method="post" action="">
	<input type="hidden" name="pageno" value="<%=pageno%>">
	<input type="hidden" name="pagesize" value="<%=pagesize%>">
	<input type="hidden" name="rmsgdept" value="<%=rmsgdept%>">		
	<input type="hidden" name="search_word" value="<%=search_word%>">
	<input type="hidden" name="search_word_kind" value="<%=search_word_kind%>">
</form>
</body>
