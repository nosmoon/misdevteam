<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_1800_a.jsp
* 기능 : 정보공유 일일업무일지 초기화면
* 작성일자 : 2003-12-20
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
    SS_L_JOBREC_INITDataSet ds = (SS_L_JOBREC_INITDataSet)request.getAttribute("ds");    // request dataset
    applySession = true;	// 세션 적용 여부

    String js_fn_nm = request.getParameter("js_fn_nm");
    if(js_fn_nm == null) {js_fn_nm = "page_move";}
    String curr_page_no = request.getParameter("curr_page_no");
    if(curr_page_no == null) {curr_page_no = "1";}
    String records_per_page = (String)request.getAttribute("records_per_page");
    if(records_per_page == null) {records_per_page = "10";}

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
	document.jobrec_form.makedt1.focus();
}


// 폼 유효성 체크
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// 일일업무일지 등록화면
function job_write(){
    var lo_form1 = document.jobrec_form;

    // 액션을 "/ss/share/1810" 서블릿으로 보낸다
    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
    lo_form1.target = "_self";
    lo_form1.action = "/ss/share/1810";
    lo_form1.submit();

}

// page 이동
function page_move(curr_page_no) {
    var lo_form1 = document.jobrec_form;

    if(!curr_page_no) {
        lo_form1.curr_page_no.value = '1';
    } else {
        lo_form1.curr_page_no.value = curr_page_no;
    }
    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    list_init();
}

// 일일업무일지 검색 리스트
function list_search(){
    var lo_form1 = document.jobrec_form;

    // 부서(팀) 또는 검색조건을 "/ss/share/1801" 서블릿으로 보낸다
    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
    lo_form1.action = "/ss/share/1801";
    lo_form1.target = "_self";
    lo_form1.submit();

}

// 일일업무일지 초기 리스트
function list_init(){
    var lo_form1 = document.jobrec_form;

    lo_form1.action = "/ss/share/1800";
    lo_form1.target = "_self";
    lo_form1.submit();

}


// 일일업무일지 상세
function jobrec_view(makedt,makepersid,brwscnt) {
    var lo_form1 = document.jobrec_form;

    // 시퀀스값을 "/ss/share/1820" 서블릿으로 보낸다
    lo_form1.makedt.value = makedt;
    lo_form1.makepersid.value = makepersid;
    lo_form1.brwscnt.value = brwscnt;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
    lo_form1.target = "_self";
    lo_form1.action = "/ss/share/1820";
    lo_form1.submit();
}

//일일업무일지 다운로드
function jobrec_dwload(makedt,makepersid,dwloadcnt) {
    var lo_form1 = document.jobrec_form;

    // 시퀀스값을 "/ss/share/1850" 서블릿으로 보낸다
    lo_form1.makedt.value = makedt;
    lo_form1.makepersid.value = makepersid;
    lo_form1.dwloadcnt.value = dwloadcnt;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
    lo_form1.target = "ifrm";
    lo_form1.action = "/ss/share/1850";
    lo_form1.submit();
}

-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1" onload="jsInit()">

<form name="jobrec_form" method="post" action="">
	<input type="hidden" name="makedt" value="">   <!--일일업무일지 pk값-->
	<input type="hidden" name="makepersid" value=""> <!--일일업무일지 pk값-->
	<input type="hidden" name="brwscnt" value="">
	<input type="hidden" name="dwloadcnt" value="">  <!--다운로드수-->
    <input type="hidden" name="curr_page_no" value ="<%=curr_page_no%>">
    <input type="hidden" name="records_per_page" value ="<%=records_per_page%>">
    <input type="hidden" name="js_fn_nm" value ="<%=js_fn_nm%>">
    <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->

<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >정보공유
      &gt; </b> 일지및보고서 > 일일업무일지</td>
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
    <td bgcolor="#EBE9DC" class="title" width="100">
      <select name="srchdeptcd" class="sel_all">
<%
	  writeDeptOpt(session, out, ds.buseolistOptHtml(""), true);
%>
      </select>
    </td>
    <td bgcolor="#EBE9DC" class="title" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">작성일자
    </td>
    <td bgcolor="#EBE9DC" class="title" width="180">
      <input name="makedt1" type="text" value="<%= Util.getDate2()%>" size="10" class="text_box" caption="작성일자" dataType="date">
      -
      <input name="makedt2" type="text" value="<%= Util.getDate2()%>" size="10" class="text_box" caption="작성일자" dataType="date">
	</td>
	<td bgcolor="#EBE9DC" class="title" width="180">
      <select name="search_word_kind" class="sel_all">
        <option value='makepersnm'>작성자</option>
        <option value='cont'>내용</option>
      </select>
      <input name="search_word" style="ime-mode:active;"  type="text" size="12" class="text_box">
	</td>
	<td bgcolor="#EBE9DC" class="title" align="right">
      <input type="image" id="search_id" border="0" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" class="sel_all"  onclick="javascript:list_search();window.event.returnValue=false;">
    </td>
  </tr>
  <tr>
    <td height="3" colspan="4">
      <!--여백-->
    </td>
  </tr>
</table>
<!--타이틀 -->
<table width="830" border="0"  cellpadding="1" cellspacing="0" align="center">
  <tr>
    <td  height="27" bgcolor="#EBE9DC" class="title">일일업무일지 목록</td>
    <td  height="27" bgcolor="#EBE9DC" class="title" width="40" align="right">
    	<input type="image" id="insert_id" border="0" src="/html/comm_img/bu_write.gif" width="36" height="19" align="absmiddle" border="0" onclick="javascript:job_write();window.event.returnValue=false;">
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
    <td width="250" class="gray" align="center"> 작성일자 </td>
    <td width="100" class="gray" align="center"> 소속</td>
    <td width="100" class="gray" align="center"> 작성자 </td>
    <td class="gray"  width="370" align="center"> 첨부파일 </td>
    <td width="80" class="gray" align="center"> 조회수 </td>
    <td width="80" class="gray" align="center"> 다운로드수 </td>
  </tr>

    <%--정보공유 리스트 가져 오는 부분--%>
	<%
    for(int i=0 ; i< ds.jobreclist.size(); i++) {
        SS_L_JOBREC_INITJOBRECLISTRecord rec = (SS_L_JOBREC_INITJOBRECLISTRecord)ds.jobreclist.get(i);
    %>
  <tr>
    <td class="gray" align="center" width="250">
    	<a onClick="jobrec_view('<%=Util.checkString(rec.makedt)%>','<%= Util.checkString(rec.makepersid)%>','<%=rec.brwscnt%>');" style="cursor:hand;">
    	<font color="blue">&nbsp;<%= Util.convertS(rec.makedt)%> </font>
    	</a>
    </td>
    <td width="100" class="gray" >&nbsp;<%=Util.checkString(rec.deptnm)%></td>
    <td width="100" class="gray" >&nbsp;<%=Util.checkString(rec.makepersnm)%></td>
    <td class="gray" width="370">&nbsp;
    	<a onClick="jobrec_dwload('<%=Util.checkString(rec.makedt)%>','<%= Util.checkString(rec.makepersid)%>','<%=rec.dwloadcnt%>');" style="cursor:hand;">
    	<font color="blue">&nbsp;<%= Util.checkString(rec.filenm)%> </font>
    	</a>
    </td>
    <td align="right" width="80" class="gray" align="right">&nbsp;<%=rec.brwscnt%>&nbsp;</td>
    <td align="right" width="80" class="gray" align="right">&nbsp;<%=rec.dwloadcnt%>&nbsp;</td>
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
	    <jsp:include page="/jsp/ss/comm_jsp/page_navigator2.jsp">
	    <jsp:param name = "curr_page_no" 		value="<%=curr_page_no%>"/>
	    <jsp:param name = "total_records" 		value="<%=ds.getTotalcnt()%>"/>
	    <jsp:param name = "js_fn_nm" 			value="<%=js_fn_nm%>"/>
	    <jsp:param name = "records_per_page" 	value="10"/>
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
