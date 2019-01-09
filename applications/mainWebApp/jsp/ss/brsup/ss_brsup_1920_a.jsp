<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1900_a.jsp
* 기능 : 지국지원-빌링-파일업로드-지로EDI
* 작성일자 : 2008-05-14
* 작성자 : 노상현
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    int wrkListCount = 5;		// 한 화면당 리스트 항목 수
    int wrkdtlListCount = 10;	// 한 화면당 리스트 항목 수(내역)
    applySession = true;		// 세션 적용 여부

%>
<%--
	SS_L_WRKHIST_INITDataSet ds = (SS_L_WRKHIST_INITDataSet)request.getAttribute("ds");
--%>
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
	document.wrk_search_form.id.focus();
}

// 폼 유효성 체크
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// 작업이력 목록보기
function list_search(){
    var lo_form1 = document.wrk_search_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
	lo_form1.pageno.value = '1';									// 페이지번호 초기화

	lo_form1.action = "/ss/admin/1440";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 작업내력 목록보기
function detail_search(id, execno){
    var lo_form1 = document.wrk_list_form;
    lo_form1.id.value = id;
    lo_form1.execno.value = execno;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
	lo_form1.pageno.value = '1';									// 페이지번호 초기화
	lo_form1.action = "/ss/admin/1445";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 페이지 이동(작업이력)
function page_move_hsty(pageno) {
    var lo_form1 = document.wrk_search_form;

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }
    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
    // 작업이력목록 조회조건을 "/ss/admin/1440" 서블릿으로 보낸다
	lo_form1.action = "/ss/admin/1440";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 페이지 이동(작업내력)
function page_move_ptcr(pageno) {
    var lo_form1 = document.wrk_list_form;

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }
    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 작업내역목록 조회조건을 "/ss/admin/1445" 서블릿으로 보낸다
	lo_form1.action = "/ss/admin/1445";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 목록에서 선택된 로우 전역변수
var go_sel_row;

// 선택된 로우 색깔 바꾸기
function change_sel_row(obj){
	go_sel_row = obj;
	obj.style.backgroundColor='#BFD2DD';
	lo_table = obj.parentNode;
	for(i=1; i<lo_table.rows.length; i++){
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

function deleteFiles(){
	var lo_form1 = document.wrk_search_form;
 
  lo_form1.action = "/jsp/ss/upload/delete.jsp";
  lo_form1.target = "ifrm";
  lo_form1.submit();
}

function ediUpload(){
	var lo_form1 = document.wrk_search_form;
   lo_form1.action = "/ss/brsup/1901";
  lo_form1.target = "ifrm";
  lo_form1.submit();
}

-->
</script>

</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" class="title1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td class="gray" height="10">&nbsp;</td>
  </tr>
</table>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >지국지원
      &gt; </b> 빌링 &gt; 파일송수신 &gt; 지로EDI </td>
  </tr>
  <tr>
    <td class="gray" height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>




<table width="830" border="0" align="center" cellpadding="2" cellspacing="0">
	<tr>
		<td bgcolor="#EBE9DC" class="title">EDI파일 전송</td>
	</tr>
	<tr>
		<td class="gray" height="3" colspan="5">
		<!--여백-->
		</td>
	</tr>
</table>

<table width="830" border="0" cellspacing="0" cellpadding="1" align="center" bgcolor="#ffffff" class="gray" height="180">
	<tr bgcolor="#dddddd" align="center" height="23">
		<td width="400" class="gray">전송할 파일 선택</td>
		<td width="430" class="gray">전송 완료된 파일</td>
	</tr>	
	<tr bgcolor="#dddddd">
		<td><iframe src="/html/brsup/upload.html" name="ifrm_upload"  width="400" height="200" frameborder="0" cellspacing="0" cellpadding="0" scrolling="no"></iframe></td>
		<td width="430">
			<table cellpadding="0" cellspacing="0" class="gray" bgcolor="#ffffff" align="left" id="file_list_id">
				<tr>
					<td colspan="2">
							<iframe src="/jsp/ss/upload/Filelist.jsp" name="ifrm_filelist"  width="430" height="127" frameborder="0" cellspacing="0" cellpadding="0" scrolling="auto"></iframe>
			 		</td>
			 	</tr>
				<tr>
					<td class="gray" height="14">
					<!--여백-->
					</td>
				</tr>
				<tr height = "25">
						<td bgcolor="#ebe9dc" align="left">
							&nbsp;<input type="image" id="send_button1" src="/html/comm_img/bu_del.gif" width="36" height="19" align="absmiddle" onclick="deleteFiles();" border="0" >&nbsp;
						</td>	
						<td bgcolor="#ebe9dc" align="right">
							<input type="image" id="send_button2" src="/html/comm_img/bu_save02.gif" width="36" height="19" align="absmiddle" onclick="ediUpload();" border="0" >&nbsp;
						</td>							
				</tr>			 	
				<tr>
					<td class="gray" height="34">
					<!--여백-->
					</td>
				</tr>				
			</table>
		</td>
	</tr>
</table>
<br>

<!--작업이력 검색 시작 -->
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<form name="wrk_search_form" method="post" action="" style="display:none;">
    <input name="pageno" type="hidden" value ="1">			                	<!-- 현재 페이지 번호 -->
    <input name="pagesize" type="hidden" value ="<%= wrkListCount%>">	    	<!-- 한 화면당 리스트 항목 수 -->
    <input name="js_fn_nm" type="hidden" value ="page_move_hsty">
    <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->
    <input name="wrkListCount" type="hidden" value ="<%= wrkListCount%>">   <!-- 세션 적용 여부 -->
    <input name="wrkdtlListCount" type="hidden" value ="<%= wrkdtlListCount%>">   <!-- 세션 적용 여부 -->
	<tr>
		<td bgcolor="#EBE9DC" width="60" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">아이디</td>
		<td bgcolor="#EBE9DC" class="title" width="200" align="left">
		<input name="id" type="text" size="15" class="text_box">
<%--
            <select id="id" name="id" class="sel_all">
               <option selected value="">전체</option>
               <%=ds.wrklistOptHtml("")%>
            </select>
--%>            

		</td>
		<td bgcolor="#EBE9DC" class="title" width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">실행일자</td>
		<td width="*" bgcolor="#EBE9DC" class="title">
            <input name="frdt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="실행시작일자" dataType="date">
            -
            <input name="todt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="실행종료일자" dataType="date">
		</td>
		<td width="152"  bgcolor="#EBE9DC" class="title" align="right">
			<input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="javascript:list_search();window.event.returnValue=false;" border="0" >
		</td>
	</tr>
	<tr>
		<td class="gray" height="3" colspan="5">
		<!--여백-->
		</td>
	</tr>
</form>
</table>
<!--작업이력 검색 끝 -->

<!--작업이력 목록 시작 -->
<table width="830"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" align="center" id="wrk_list_id">
<form name="wrk_list_form" method="post" action="">
    <input name="pageno" type="hidden" value ="1">			                <!-- 현재 페이지 번호 -->
    <input name="pagesize" type="hidden" value ="<%= wrkListCount%>">	    <!-- 한 화면당 리스트 항목 수 -->
    <input name="js_fn_nm" type="hidden" value ="page_move_ptcr">
		<input name="wrkdtlListCount" type="hidden" value ="<%= wrkdtlListCount%>">   <!-- 세션 적용 여부 -->    	
	<input name="id" type="hidden" value ="">                    			<!-- 아이디 -->
	<input name="execno" type="hidden" value ="">                    		<!-- 작업번호 -->

	<tr bgcolor="#dddddd" align="center" height="23">
		<td width="35" class="gray">ID</td>
		<td width="200" class="gray">설명</td>
		<td width="120" class="gray">시작일시</td>
		<td width="120" class="gray">종료일시</td>
		<td width="60" class="gray">실행결과</td>
		<td class="gray">작업비고</td>
	</tr>

    <%-- 초기화면 목록 반복 시작 --%>
    <%for(int i=0; i<wrkListCount; i++){%>
    <tr>
		<td width="35" class="gray">&nbsp;</td>
		<td width="200" class="gray">&nbsp;</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="60" class="gray">&nbsp;</td>
		<td class="gray">&nbsp;</td>
    </tr>
    <%}%>
    <%-- 초기화면 목록 반복 끝 --%>
	<tr bgcolor="#dddddd" align="right">
		<td colspan="6" height="23" class="gray">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 건 </b>
		</td>
	</tr>
</form>
</table>
<!--작업이력 목록 끝 -->

<!-- 페이지 이동 -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="page_move_hsty">
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
                <jsp:param name = "js_fn_nm" 	value="page_move_hsty"/>
                <jsp:param name = "pagesize" 	value="<%= wrkdtlListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
        </jsp:include>
        <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- 페이지 이동 -->

<br>
<table width="830" border="0" align="center" cellpadding="2" cellspacing="0">
	<tr>
		<td bgcolor="#EBE9DC" class="title">작업 내역</td>
	</tr>
	<tr>
		<td class="gray" height="3" colspan="5">
		<!--여백-->
		</td>
	</tr>
</table>

<!-- 작업 내역 목록 시작 -->
<table width="830"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" align="center" id="wrk_detail_id">
	<tr bgcolor="#dddddd" align="center" height="23">
		<td width="100" class="gray">작업내역</td>
		<td width="120" class="gray">시각(시작/종료)</td>
		<td width="140" class="gray">테이블(소스/타깃)</td>
		<td width="110" class="gray">데이터(추출/전환)</td>
		<td class="gray">에러(코드/메세지)</td>
	</tr>
    <%-- 초기화면 목록 반복 시작 --%>
    <%for(int i=0; i<wrkdtlListCount; i++){%>
	<tr align="center">
		<td width="100" rowspan="2" class="gray">&nbsp;</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="140" class="gray">&nbsp;</td>
		<td width="110" class="gray">&nbsp;</td>
		<td rowspan="2" class="gray">&nbsp;</td>
	</tr>
	<tr align="center">
		<td width="120" class="gray">&nbsp;</td>
		<td width="140" class="gray">&nbsp;</td>
		<td width="110" class="gray">&nbsp;</td>
	</tr>
    <%}%>
    <%-- 초기화면 목록 반복 끝 --%>
	<tr bgcolor="#dddddd" height="23">
		<td colspan="5" class="gray" align="right">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 건 </b>
		</td>
	</tr>
</table>
<!-- 작업 내역 목록 끝 -->

<!-- 페이지 이동 -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2"  align="center" id="page_move_ptcr">
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
                <jsp:param name = "js_fn_nm" 	value="page_move_ptcr"/>
                <jsp:param name = "pagesize" 	value="<%= wrkdtlListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
        </jsp:include>
        <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- 페이지 이동 -->

<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
