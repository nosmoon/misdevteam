<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1600_a.jsp
* 기능 : 확장현황-사이버확장-요원관리-초기화면
* 작성일자 : 2004-03-29
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_PROMSTAF_INIT_CYEXTNDataSet ds = (SS_L_PROMSTAF_INIT_CYEXTNDataSet)request.getAttribute("ds");
    int promstafListCount = 10;	// 한 화면당 리스트 항목 수
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
	document.promstaf_search_form.stafnm.focus();
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
function list_search(){
    var lo_form1 = document.promstaf_search_form;


    // 화면페이지 번호를 초기화한다.
    lo_form1.pageno.value = '1';

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

	// 요원 목록 조회조건을 해당 서블릿으로 보낸다.
    lo_form1.action = "/ss/extn/1605";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 상세보기
function detail_view(stafclsfcd, stafno){
    var lo_form1 = document.promstaf_list_form;

    // 요원구분코드, 요원번호를 "/ss/extn/1610" 서블릿으로 보낸다
    lo_form1.stafclsfcd.value = stafclsfcd;
    lo_form1.stafno.value = stafno;
    lo_form1.action = "/ss/extn/1610";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 페이지 이동
function page_move(pageno) {
    var lo_form1 = document.promstaf_search_form;

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;

    // 요원 목록 조회조건을 "/ss/extn/1605" 서블릿으로 보낸다
    lo_form1.action = "/ss/extn/1605";
    lo_form1.target = "ifrm";

    lo_form1.submit();
    return;
}

// 사이버요원 목록 프린트
function print_list(){
    var lo_form1 = document.promstaf_search_form;


    if(!check_all(lo_form1)) return;				// form 유효성 체크

	// 새창에 프린트를 위한 window를 띄운다.
	var opt = ",toolbar=no,menubar=yes,location=no,scrollbars=yes,status=yes,resizable=yes";
    var lw_print_window = window.open("about:blank", "print_target", "left=" + 0 + ",top=" +  0 + ",width=" + 800 + ",height=" + 600  + opt );
	lw_print_window.resizeTo(screen.availWidth, screen.availHeight);
    lo_form1.action = "/ss/extn/1615";
    lo_form1.target = "print_target";
    lo_form1.submit();
    lw_print_window.focus();
}

// 목록에서 선택된 로우 전역변수
var go_sel_row;

// 선택된 로우 색깔 바꾸기
function change_sel_row(obj){
	go_sel_row = obj;
	obj.style.backgroundColor='#BFD2DD';
	lo_table = obj.parentNode;
	for(i=1; i<lo_table.rows.length-1; i++){
		if(lo_table.rows[i] != go_sel_row){
			lo_table.rows[i].style.backgroundColor='#FFFFFF';
		}
	}
}

// 목록에서 마우스 IN
function mouse_in(obj){
	if(obj != go_sel_row){
		obj.style.backgroundColor='#CCCCBB';
	}
}

// 목록에서 마우스 OUT
function mouse_out(obj){
	if(obj != go_sel_row){
		obj.style.backgroundColor='#FFFFFF';
	}
}

// 검색 조건 초기화
function set_default(flag){
    if(window.event) window.event.returnValue = false;
    var lo_form1 = document.promstaf_search_form;

	if(flag == '1'){			// 부서,지역,지국 초기화
	}else if(flag == '2'){		// 기간 초기화
		lo_form1.frdt.value = "";
		lo_form1.todt.value = "";
		lo_form1.frdt.focus();
	}else if(flag == '3'){		// 기타 초기화
	}
}

//-->
</script>

</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle">
      확장현황 &gt; </b> 사이버확장 > 요원관리</td>
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
	<!--검색 시작-->
	<table width="830" border="0" cellspacing="0" cellpadding="2" id="code_search">
	<form name="promstaf_search_form" method="post" >
		<input name="pageno" type="hidden" value ="1">			                	<!-- 현재 페이지 번호 -->
		<input name="pagesize" type="hidden" value ="<%= promstafListCount%>">	    <!-- 한 화면당 리스트 항목 수 -->
		<input name="js_fn_nm" type="hidden" value ="page_move">
		<input name="applySession" type="hidden" value ="">   	<!-- 세션 적용 여부 -->
		<tr>
			<td bgcolor="#EBE9DC" class="title" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">요원구분
			</td>
			<td bgcolor="#EBE9DC" class="title">
				<select name="stafclsfcd" class="sel_all">
					<%= ds.curstafclsfcdOptHtml("40") %>	<!-- 사이버확장	-->
				</select>
			</td>
			<td bgcolor="#EBE9DC" class="title" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">계약상태
			</td>
			<td bgcolor="#EBE9DC" class="title">
				<select name="cntrstatcd" class="sel_all">
					<option value="" selected>전체</option>
					<%= ds.curcntrstatcdOptHtml("10") %>
				</select>
			</td>

            <td height="25" bgcolor="#EBE9DC"  class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">기간
	            <input name="frdt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="시작일자" dataType="date">
	            -
	            <input name="todt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="종료일자" dataType="date">
	            <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('2');window.event.returnValue=false;"> <!--기간 초기화-->
        	</td>
			<td bgcolor="#EBE9DC" class="title" width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">요원명</td>
			<td bgcolor="#EBE9DC" class="title" width="60">
				<input name="stafnm" type="text" style="ime-mode:active;" size="8" class="text_box">
			</td>
			<td bgcolor="#EBE9DC" class="title" width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">권유자명</td>
			<td bgcolor="#EBE9DC" class="title" width="60">
				<input name="cnvsstafnm" type="text" style="ime-mode:active;" size="8" class="text_box">
			</td>
			<td bgcolor="#EBE9DC" class="title" align="right">
				<input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="javascript:list_search();window.event.returnValue=false;"><!--목록 조회-->
			</td>
		</tr>
		<tr>
			<td height="3" colspan="6">
				<!--여백-->
			</td>
		</tr>
	</form>
	</table>
	<!--사이버요원 검색 끝-->

	<table width="830" border="0"  cellpadding="1" cellspacing="0">
		<tr>
			<td  height="27" bgcolor="#EBE9DC" class="title">사이버요원 목록 </td>
			<td  height="27" bgcolor="#EBE9DC" class="title" align="right" width="50">
				<input type="image" id="print_id" src="/html/comm_img/bu_print.gif" width="39" height="19" align="absmiddle" onclick="javascript:print_list();jsInit();window.event.returnValue=false;">
			</td>
		</tr>
		<tr>
			<td height="3" colspan="2">
			<!--여백-->
			</td>
		</tr>
	</table>


	<!--사이버요원 목록 시작-->
	<table width="830" border="0"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#FFFFFF" id="promstaf_list_id">
	<form name="promstaf_list_form" method="post" action="" >
		<input name="stafclsfcd" type="hidden" value="">
		<input name="stafno" type="hidden" value="">

		<tr align="center" height="23">
			<td width="150" bgcolor="#dddddd" class="gray">요원명</td>
			<td width="150" bgcolor="#dddddd" class="gray">권유자명</td>
			<td width="150" bgcolor="#dddddd" class="gray">등록일자</td>
			<td width="150" bgcolor="#dddddd" class="gray">휴대폰번호</td>
			<td bgcolor="#dddddd" class="gray">이메일</td>
		</tr>

        <%-- 초기화면 목록 반복 시작 --%>
        <%for(int i=0; i<promstafListCount; i++){%>
		<tr>
			<td width="150" class="gray">&nbsp;</td>
			<td width="150" class="gray">&nbsp;</td>
			<td width="150" class="gray">&nbsp;</td>
			<td width="150" class="gray">&nbsp;</td>
			<td class="gray">&nbsp;</td>
		</tr>
        <%}%>
        <%-- 초기화면 목록 반복 끝 --%>

		<tr bgcolor="#dddddd">
			<td  height="23" class="gray" colspan="11" align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 건 </b>
			</td>
		</tr>

	</form>
	</table>
    <!-- 페이지 이동 -->
    <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move_id">
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
                    <jsp:param name = "pagesize" 	value="<%= promstafListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- 페이지 이동 -->
	<!--사이버요원 목록 끝-->

    </td>
  </tr>
  <tr>
    <td height="10">
      <!--여백 -->
    </td>
  </tr>
  <td>

    <table width="829" border="0"  cellpadding="1" cellspacing="0" align="center">
      <tr>
        <td  height="25" bgcolor="#EBE9DC" class="title">상세내역</td>
      </tr>
      <tr>
        <td height="3">
          <!--여백-->
        </td>
      </tr>
    </table>

    <!--사이버요원 상세 시작-->
	<table width="830" border="0"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#FFFFFF" id="promstaf_detail_id">
		<tr>
			<td rowspan="4" width="80" bgcolor="#EBE9DC" class="gray">요원정보</td>
			<td width="100" bgcolor="#dddddd" class="gray">성명</td>
			<td width="120" class="gray">&nbsp;</td>
			<td width="120" bgcolor="#dddddd" class="gray">등록일자</td>
			<td width="120" class="gray">&nbsp;</td>
			<td width="100" bgcolor="#dddddd" class="gray">주민등록번호</td>
			<td class="gray">&nbsp;</td>
		</tr>
        <tr>
			<td width="100" bgcolor="#dddddd" class="gray">전화번호</td>
			<td width="120" class="gray">&nbsp;</td>
			<td width="120" bgcolor="#dddddd" class="gray">휴대폰번호</td>
			<td width="120" class="gray">&nbsp;</td>
			<td width="100" bgcolor="#dddddd" class="gray">이메일<font color="red">&nbsp;</font></td>
			<td class="gray">&nbsp;</td>
        </tr>
        <tr>
			<td width="100" bgcolor="#dddddd" class="gray">주소</td>
			<td colspan="5"  class="gray">&nbsp;</td>
        </tr>
        <tr >
			<td width="100" bgcolor="#dddddd" class="gray">은행명</td>
			<td width="120" class="gray">&nbsp;</td>
			<td width="120" bgcolor="#dddddd" class="gray">예금주</td>
			<td width="120" class="gray">&nbsp;</td>
			<td width="100" bgcolor="#dddddd" class="gray">계좌번호</td>
			<td class="gray">&nbsp;</td>
        </tr>
		<tr>
			<td rowspan="2" width="80" bgcolor="#EBE9DC" class="gray">권유자정보</td>
			<td width="100" bgcolor="#dddddd" class="gray">성명</td>
			<td width="120" class="gray">&nbsp;</td>
			<td width="120" bgcolor="#dddddd" class="gray">등록일자</td>
			<td width="120" class="gray">&nbsp;</td>
			<td width="100" bgcolor="#dddddd" class="gray">주민등록번호</td>
			<td class="gray">&nbsp;</td>
		</tr>
        <tr>
			<td width="100" bgcolor="#dddddd" class="gray">전화번호</td>
			<td width="120" class="gray">&nbsp;</td>
			<td width="120" bgcolor="#dddddd" class="gray">휴대폰번호</td>
			<td width="120" class="gray">&nbsp;</td>
			<td width="100" bgcolor="#dddddd" class="gray">이메일<font color="red">&nbsp;</font></td>
			<td class="gray">&nbsp;</td>
        </tr>
	</table>
	<!--사이버요원 상세 끝-->

    </td>
  </tr>
</table>
<br>
<br>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="100%" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
