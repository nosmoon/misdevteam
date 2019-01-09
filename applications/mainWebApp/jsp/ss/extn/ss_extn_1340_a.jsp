<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1340_a.jsp
* 기능 : 확장현황-사원확장-송금관리-초기화면
* 작성일자 : 2003-12-15
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_EMPCAMPNODataSet ds = (SS_L_EMPCAMPNODataSet)request.getAttribute("ds");
	int rmttListCount	= 10;		// 한 화면당 리스트 항목 수
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
	document.rmtt_search_form.frdt.focus();
}

// 폼 유효성 체크
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// 목록보기
function list_search()
{
    var lo_form1 = document.rmtt_search_form;

	lo_form1.pageno.value = '1';									// 페이지번호 초기화

    // 화면제어와 성능을 위해 사원확장대회 또는 기간을 필수로 선택한 후 검색하게 한다.
    if( (lo_form1.rdr_extncampno.value == '') && ((lo_form1.frdt.value == '') || (lo_form1.frdt.value == '')) ){
		alert("확장대회 또는 기간을 선택하세요");
		return;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 확장신청목록 조회조건을 "/ss/extn/1350" 서블릿으로 보낸다
    lo_form1.action = "/ss/extn/1350";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 송금 목록 프린트
function print_list(){
    var lo_form1 = document.rmtt_search_form;

    // 화면제어와 성능을 위해 사원확장대회 또는 기간을 필수로 선택한 후 검색하게 한다.
    if( (lo_form1.rdr_extncampno.value == '') && ((lo_form1.frdt.value == '') || (lo_form1.frdt.value == '')) ){
		alert("확장대회 또는 기간을 선택하세요");
		return;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

	// 새창에 프린트를 위한 window를 띄운다.
    opt = ",toolbar=no,menubar=yes,location=no,scrollbars=yes,status=no,resizable=yes";
    var lw_print_window = window.open("about:blank", "print_target", "left=" + 0 + ",top=" +  0 + ",width=" + 800 + ",height=" + 600  + opt );
    lo_form1.action = "/ss/extn/1360";
    lo_form1.target = "print_target";
    lo_form1.submit();
    lw_print_window.focus();
}

// 페이지 이동
function page_move(pageno) {
    var lo_form1 = document.rmtt_search_form;

    // 화면제어와 성능을 위해 사원확장대회 또는 기간을 필수로 선택한 후 검색하게 한다.
    if( (lo_form1.rdr_extncampno.value == '') && ((lo_form1.frdt.value == '') || (lo_form1.frdt.value == '')) ){
		alert("확장대회 또는 기간을 선택하세요");
		return;
    }

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 확장신청목록 조회조건을 "/ss/extn/1350" 서블릿으로 보낸다
    lo_form1.action = "/ss/extn/1350";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" margin class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >확장현황
       </b>사원확장 &gt; 송금 </td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td>

    <!--사원확장 수당 검색 시작 ---------------------------------------------------------------------------->
	<table width="830" border="0" cellspacing="0" cellpadding="2" bgcolor="#EBE9DC" id="rmtt_search_id">
		<form name="rmtt_search_form" method="post" action="" >
        <input name="pageno" type="hidden" value ="1">			                <!-- 현재 페이지 번호 -->
        <input name="pagesize" type="hidden" value ="<%= rmttListCount%>">	    <!-- 한 화면당 리스트 항목 수 -->
        <input name="js_fn_nm" type="hidden" value ="page_move">
		<tr>
			<td class="title"  bgcolor="#EBE9DC" width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">확장대회</td>
			<td class="title"  width="120">
				<select name="rdr_extncampno" class="sel_all">
					<option value='' selected>선택</option>
					<%= ds.curcommlistOptHtml("") %><!-- 사원확장대회번호, 사원확장대회명 목록 -->
				</select>
			</td>
			<td class="title"  bgcolor="#EBE9DC" width="50"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">기간</td>
			<td class="title"  width="200">
	            <input name="frdt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="시작일자" dataType="date">
	            -
	            <input name="todt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="종료일자" dataType="date">
			</td>
			<td class="title"  bgcolor="#EBE9DC" width="50"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">정렬</td>
			<td class="title"  width="80">
				<select name="sortflag" class="sel_all">
					<option value="" selected>선택</option>
					<option value="1">대회</option>
					<option value="2">회사</option>
					<option value="3">은행</option>
				</select>
			</td>
			<td class="title"  align="right">
		        <input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="javascript:list_search();window.event.returnValue=false;">
			</td>
		</tr>

		</form>
	</table>
    <!--사원확장 수당 검색 끝 ---------------------------------------------------------------------------->

    </td>
  </tr>
  <tr>
    <td height="3">
      <!------여백--- -->
    </td>
  </tr>
  <tr>
    <td height="10">

	<!--타이틀박스-->
	<table width="830" border="0"  cellpadding="1" cellspacing="0">
		<tr>
			<td  height="27" bgcolor="#EBE9DC" class="title">사원확장대회 송금목록</td>
			<td  height="27" bgcolor="#EBE9DC" class="title" align="right" width="50">
				<input type="image" src="/html/comm_img/bu_print.gif" width="39" height="19" onclick="jsInit();javascript:print_list();window.event.returnValue=false;">
			</td>
		</tr>
		<tr>
			<td height="3" colspan="2">
			<!--여백-->
			</td>
		</tr>
	</table>

    <!--사원확장 수당 목록 시작 ---------------------------------------------------------------------------->
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="rmtt_list_id">
    <form name="rmtt_list_form" method="post" action="" >
        <input name="print" type="hidden" value ="">
		<tr bgcolor="#DDDDDD" height="23">
			<td width="100" class="gray" align="center">대회명</td>
			<td width="90"  class="gray" align="center">이름</td>
			<td width="100" class="gray" align="center">회사</td>
			<td width="90"  class="gray" align="center">부서</td>
			<td width="100" class="gray" align="center">예금주</td>
			<td width="100" class="gray" align="center">은행</td>
			<td width="150" class="gray" align="center">계좌번호</td>
			<td class="gray" align="center">금액</td>
		</tr>
        <%-- 초기화면 목록 반복 시작 --%>
        <%for(int i=0; i<rmttListCount; i++){%>
        <tr>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="90"  class="gray" align="center">&nbsp;</td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="90"  class="gray" align="center">&nbsp;</td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="150" class="gray" align="center">&nbsp;</td>
			<td class="gray" align="center">&nbsp;</td>
        </tr>
        <%}%>
        <%-- 초기화면 목록 반복 끝 --%>
		<tr bgcolor="#dddddd">
			<td colspan="8" class="gray" align="right" height="23">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총금액 원 </b>&nbsp;&nbsp;&nbsp;
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 건 </b>
			</td>
		</tr>
        
    </form>
    </table>

    <!-- 페이지 이동 -->
    <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move">
        <tr>
            <td align="center" height="2">
            <!--여백-->
            </td>
        </tr>
        <tr>
            <td align="center" height="24" bgcolor="#E8E8E8">
            <!--JSP PAGE START---------------------------------------------------------------------------------->
            <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
                    <jsp:param name = "pageno" 		value="0"/>
                    <jsp:param name = "totalcnt" 	value="0"/>
                    <jsp:param name = "js_fn_nm" 	value="page_move"/>
                    <jsp:param name = "pagesize" 	value="<%= rmttListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- 페이지 이동 -->

    <!--사원확장 수당 목록 끝 ---------------------------------------------------------------------------->
	</td>
  </tr>
  <tr>
    <td height="10">
      <!------여백--- -->
    </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="830" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->

</body>
</html>
