<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_1500_a.jsp
* 기능 : 정보공유 게시판 이슈 초기화면
* 작성일자 : 2003-12-03
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
    SS_L_INFOEXG_INITDataSet ds = (SS_L_INFOEXG_INITDataSet)request.getAttribute("ds");    // request dataset

    String js_fn_nm = request.getParameter("js_fn_nm");
    if(js_fn_nm == null) {js_fn_nm = "page_move";}
    String pageno = request.getParameter("pageno");
    if(pageno == null) {pageno = "1";}
    String pagesize = (String)request.getAttribute("pagesize");
    if(pagesize == null) {pagesize = "10";}

    applySession = true;	// 세션 적용 여부

%>


<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
// 이벤트 핸들러 초기화
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
	setInputBackgroundColor();
	document.infoexg_form.search_word.focus();
}


// form 단위로 유효성을 검증한 예제
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// 게시판 이슈 등록화면
function annc_write(){
    var lo_form1 = document.infoexg_form;

    // 액션을 "/ss/share/1510" 서블릿으로 보낸다
    lo_form1.target = "_self";
    lo_form1.action = "/ss/share/1510";
    lo_form1.submit();

}

// 게시판 이슈 검색 리스트
function list_search(){
    var lo_form1 = document.infoexg_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
	lo_form1.pageno.value = '1';									// 페이지번호 초기화

    // 부서(팀) 또는 검색조건을 "/ss/share/1501" 서블릿으로 보낸다
    lo_form1.target = "_self";
    lo_form1.action = "/ss/share/1501";
    lo_form1.submit();

}

// 페이지 이동
function page_move(pageno) {

    var lo_form1 = document.infoexg_form;

    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    // 부서(팀) 또는 검색조건을 "/ss/share/1500" 서블릿으로 보낸다
    if(!check_all(lo_form1)) return;
    lo_form1.target = "_self";
    lo_form1.action = "/ss/share/1500";
    lo_form1.submit();
}

// 게시판 이슈 상세보기
function infoexg_view(seq,brwscnt) {
    var lo_form1 = document.infoexg_form;

    // 시퀀스값을 "/ss/share/1520" 서블릿으로 보낸다
    lo_form1.seq.value = seq;
    lo_form1.brwscnt.value = brwscnt;
    lo_form1.target = "_self";
    lo_form1.action = "/ss/share/1520";
    lo_form1.submit();
}

//게시판 이슈 다운로드
function infoexg_dwload(seq,dwloadcnt) {
    var lo_form1 = document.infoexg_form;

    // 시퀀스값을 "/ss/share/1360" 서블릿으로 보낸다
    lo_form1.seq.value = seq;
    lo_form1.dwloadcnt.value = dwloadcnt;
    lo_form1.target = "ifrm";
    lo_form1.action = "/ss/share/1570";
    lo_form1.submit();
}

-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1"  onload="jsInit()">

<!--INFOEXG_FORM START--------------------------------------------------------------------------------->
<form name="infoexg_form" method="post" action="">
	<input type="hidden" name="seq" value="">
	<input type="hidden" name="brwscnt" value="">
	<input type="hidden" name="dwloadcnt" value="">  <!--다운로드수-->
    <input type="hidden" name="pageno" value ="<%=pageno%>">
    <input type="hidden" name="pagesize" value ="<%=pagesize%>">
    <input type="hidden" name="js_fn_nm" value ="<%=js_fn_nm%>">
    <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->


<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >정보공유
      &gt; </b> 게시판 > 이슈</td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>
<!--검색 -->
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
  <tr>
    <td bgcolor="#EBE9DC" width="50" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">팀&nbsp;</td>
    <td bgcolor="#EBE9DC" class="title">
      <select name="rmsgdept" class="sel_all">
<%
	  writeDeptOpt(session, out, ds.buseolistOptHtml(""), true);
%>
      </select>
    </td>
    <td bgcolor="#EBE9DC" class="title" align="right">
      <select name="search_word_kind" class="sel_all">
        <option value="titl">제목</option>
        <option value="makepersnm">작성자</option>
        <option value="cont">내용</option>
      </select>
      <input name="search_word" type="text" size="12" class="text_box">
      <input type="image" id="search_id" border="0" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" class="sel_all" onclick="javascript:list_search();">
    </td>
  </tr>
  <tr>
    <td height="3" colspan="2">
      <!--여백-->
    </td>
  </tr>
</table>
<!--타이틀 -->

<table width="830" border="0"  cellpadding="1" cellspacing="0" align="center">
  <tr>
    <td  height="27" bgcolor="#EBE9DC" class="title">이슈 게시판 목록</td>
    <td  height="27" bgcolor="#EBE9DC" class="title" width="40" align="right">
    	<input type="image" id="insert_id" border="0" src="/html/comm_img/bu_write.gif" width="36" height="19" align="absmiddle" border="0" onclick="javascript:annc_write()">
    </td>
  </tr>
  <tr>
    <td height="3" colspan="2">
      <!--여백-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="1" align="center" bgcolor="#FFFFFF" class="gray">
  <tr bgcolor="#dddddd" align="center">
    <td width="40" class="gray"  > 번호 </td>
    <td class="gray" > 제목 </td>
    <td width="90" class="gray" > 팀&nbsp; </td>
    <td width="75" class="gray" > 작성자 </td>
    <td width="70" class="gray" > 작성일자 </td>
    <td width="40" class="gray" > 조회수 </td>
    <td class="gray" > 첨부파일 </td>
    <td width="40" class="gray" > 다운수 </td>
    <td width="40" class="gray" > 추천 </td>
  </tr>
	<%--정보공유 리스트 가져 오는 부분 --%>
	<%

    for(int i=0 ; i< ds.infoexglist.size(); i++) {
        SS_L_INFOEXG_INITINFOEXGLISTRecord rec = (SS_L_INFOEXG_INITINFOEXGLISTRecord)ds.infoexglist.get(i);
    %>
  <tr>
    <td width="40" class="gray" align="right">&nbsp;<%= rec.getSeq()%>&nbsp;</td>
		<%
		if(rec.answerseq == 0)
		{
		%>
    <td class="gray" width="250">
    	<a onClick="infoexg_view('<%=rec.getSeq()%>','<%=rec.brwscnt%>');" style="cursor:hand;">
    	<font color="blue"><%=Util.checkString(rec.titl)%> </font>
    	</a>
    </td>
		<%
		}else if(rec.answerlevl == 1){
		%>
    <td class="gray" width="250">
    	<a onClick="infoexg_view('<%=rec.getSeq()%>','<%=rec.brwscnt%>');" style="cursor:hand;">
    	<img src="/html/comm_img/ic_re.gif" width="32" height="14" align="absmiddle" border="0">
    	<font color="blue"><%=Util.checkString(rec.titl)%> </font>
    	</a>
    </td>
		<%
		}else{
			int imgsize = 8 * rec.answerlevl;
		%>
    <td class="gray" width="250">
    	<a onClick="infoexg_view('<%=rec.getSeq()%>','<%=rec.brwscnt%>');" style="cursor:hand;">
    	<img src="/html/comm_img/ic_blank.gif" width="<%=imgsize%>" height="14" align="absmiddle" border="0">
    	<img src="/html/comm_img/ic_re.gif" width="32" height="14" align="absmiddle" border="0">
    	<font color="blue"><%=Util.checkString(rec.titl)%> </font>
    	</a>
    </td>
		<%
		}
		%>

    <td width="90" class="gray" >&nbsp;<%= Util.checkString(rec.deptnm)%></td>
    <td width="75" class="gray" >&nbsp;<%= Util.checkString(rec.makepersnm)%></td>
    <td width="70" align="center" class="gray" >&nbsp;<%= Util.Timestamp2Str(rec.regdt)%></td>
    <td width="40" align="right" class="gray" >&nbsp;<%= rec.brwscnt%>&nbsp;</td>
    <td class="gray" >&nbsp;
    	<a onClick="infoexg_dwload('<%=rec.getSeq()%>','<%=rec.dwloadcnt%>');" style="cursor:hand;">
    	<font color="blue">&nbsp;<%= Util.checkString(rec.filenm)%> </font>
    	</a>
    </td>
    <td align="right" width="40" class="gray" align="right">&nbsp;<%= Util.comma(rec.dwloadcnt)%>&nbsp;</td>
    <td align="right" width="40" class="gray" align="right">&nbsp;<%= Util.comma(rec.recomcnt)%>&nbsp;</td>
  </tr>
	<%
	}
	%>
</table>
<!---button-->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
  <tr>
    <td align="center" height="2">
      <!--여백-->
    </td>
  </tr>
  <tr>
    <td align="center" height="24" bgcolor="#E8E8E8">
	    <!--JSP PAGE START---------------------------------------------------------------------------------->
	    <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
	    <jsp:param name = "pageno" 		value="<%=pageno%>"/>
	    <jsp:param name = "totalcnt" 		value="<%=ds.getTotalcnt()%>"/>
	    <jsp:param name = "js_fn_nm" 			value="<%=js_fn_nm%>"/>
	    <jsp:param name = "pagesize" 	value="<%=pagesize%>"/>
	    <jsp:param name = "page_set_gubun" 		value="0"/>
	    </jsp:include>
	    <!--JSP PAGE END------------------------------------------------------------------------------------>

	</td>
  </tr>
</table>
<br>
<br>
</form>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width=0 height=0></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
