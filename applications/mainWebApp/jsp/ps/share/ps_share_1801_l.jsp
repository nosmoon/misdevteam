<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_share_1801_l.jsp
* 기능 : 정보공유 게시판 공지사항 초기화면 - MAIN
* 작성일자 : 2004-04-23
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%-- dataset 인스턴스 선언부분--%>
<%
    PS_L_INFOEXG_INITDataSet ds = (PS_L_INFOEXG_INITDataSet)request.getAttribute("ds");    // request dataset

    String js_fn_nm = request.getParameter("js_fn_nm");
    if(js_fn_nm == null) {js_fn_nm = "page_move";}
    String curr_page_no = request.getParameter("curr_page_no");
    if(curr_page_no == null) {curr_page_no = "1";}
    String records_per_page = (String)request.getAttribute("records_per_page");
    if(records_per_page == null) {records_per_page = "5";}

	int no_data_page = 5 - ds.infoexglist.size();

%>


<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
// 이벤트 핸들러 초기화
function jsInit(){
    setEventHandler();
	setInputBackgroundColor();
}

// form 단위로 유효성을 검증한 예제
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// page 이동
function page_move(curr_page_no) {
    var lo_form1 = document.infoexg_form;

    if(!curr_page_no) {
        lo_form1.curr_page_no.value = '1';
    } else {
        lo_form1.curr_page_no.value = curr_page_no;
    }

    list_search(curr_page_no);
}


// 게시판 공지사항 상세보기
function infoexg_view(seq,brwscnt) {
    var lo_form1 = document.infoexg_form;
    var ls_win   = "scrollbars=no,toolbar=no,location=no,directories=no,width=800, height=550 resizable=no,mebar=no,left=140,top=50";

    window.open("about:blank" , "info_pop", ls_win);

    lo_form1.seq.value = seq;
    lo_form1.brwscnt.value = brwscnt;
    lo_form1.target = "info_pop";
    lo_form1.action = "/ps/share/1806";
    lo_form1.submit();

}

//게시판 공지사항 다운로드
function infoexg_dwload(seq,dwloadcnt) {
    var lo_form1 = document.infoexg_form;

    // 시퀀스값을 "/ps/share/1811" 서블릿으로 보낸다
    lo_form1.seq.value = seq;
    lo_form1.dwloadcnt.value = dwloadcnt;
    lo_form1.target = "ifrm";
    lo_form1.action = "/ps/share/1811";
    lo_form1.submit();
}
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" LEFTMARGIN="0" TOPMARGIN="0" MARGINWIDTH="0" MARGINHEIGHT="0" onload="jsInit();">

<!--INFOEXG_FORM START--------------------------------------------------------------------------------->
<form name="infoexg_form" method="post" action="">
	<input type="hidden" name="seq" value="">
	<input type="hidden" name="brwscnt" value="">
	<input type="hidden" name="dwloadcnt" value="">  <!--다운로드수-->
    <input type="hidden" name="curr_page_no" value ="<%=curr_page_no%>">
    <input type="hidden" name="records_per_page" value ="<%=records_per_page%>">
    <input type="hidden" name="js_fn_nm" value ="<%=js_fn_nm%>">

<table width="100%" border="0" cellspacing="0" cellpadding="0" height="100%">
  <tr>
    <td valign="top" align="center"><br>
      <br>
      <table width="820" height="20" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#0B8785">
        <tr>
          <td bgcolor="#0B8785"><b><font color="#FFFFFF">공지사항 </font></b></td>
          <td align="right"><a href="/ps/share/1206" onblur><b><font color="#FFFFFF"> more..</font></b></a></td>
        </tr>
      </table>
      <table width="820" border="0" align="center" cellpadding="2" cellspacing="0">

	<%

    for(int i=0 ; i< ds.infoexglist.size() && i<5 ; i++) {
        PS_L_INFOEXG_INITINFOEXGLISTRecord rec = (PS_L_INFOEXG_INITINFOEXGLISTRecord)ds.infoexglist.get(i);
    %>

        <tr>
    <%
        if(rec.clsf.equals("101")) {
    %>
          <td width="40" align="center" height="23" class="list"><font color="#FF6600">[공지]</font></td>
    <%
        } else {
    %>
          <td width="40" align="center" height="23" class="list"><font color="#FF6600">[기타]</font></td>
    <%
        }
    %>
          <td height="23" class="list">
            <a onClick="infoexg_view('<%=rec.getSeq()%>','<%=rec.brwscnt%>');" style="cursor:hand;">
            &nbsp;<%= Util.checkString(rec.titl)%>
            </a>
          </td>
          <td width="150" height="23" class="list"><%= Util.checkString(rec.incmgpersnm)%>/<%=Util.checkString(rec.deptnm)%></td>
          <td width="80" align="center" height="23" class="list"><%=Util.convertDate(Util.trimDate(Util.Timestamp2Str(rec.incmgdt)),"-")%> </td>
          <td width="50" height="23" align="center" class="list">
    <%
    if(!Util.checkString(rec.filenm).equals("")) {
    %>
            <a onClick="infoexg_dwload('<%=rec.getSeq()%>','<%=rec.dwloadcnt%>');" style="cursor:hand;">
            <img src="/html/comm_img/bu_down.gif" width="40" height="14">
    <!--    	<font color="blue">&nbsp;%= Util.checkString(rec.filenm)%> </font> -->
            </a>
    <%
    } else {
    %>
            &nbsp;
    <%
    }
    %>
          </td>
        </tr>
    <%
    }
	for(int i=0; i < no_data_page; i++) {
    %>
        <tr>
          <td width="40" align="center" height="23" class="list">&nbsp; </td>
          <td height="23" class="list">&nbsp; </td>
          <td width="150" height="23" class="list">&nbsp; </td>
          <td width="80" align="center" height="23" class="list">&nbsp; </td>
          <td width="50" height="23" align="center" class="list">&nbsp; </td>
        </tr>
<%
	}
%>

      </table>
      <table>
        <iframe src="/ps/share/1601"  style="filter: Alpha(Opacity=100);" framespacing=0 scrolling=no frameborder=0 HEIGHT="465" WIDTH="830" BORDER="0" cellpadding=0 cellspacing=0 align=center bgcolor=black>
		이 메세지가 보이면 iframe을 지원하지 않는것입니다.
		</iframe>
      </table>
</table>
</form>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width=0 height=0></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->

</body>
</html>
