<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_1250_a.jsp
* 기능 : 정보공유 실시간판매국공지-초기화면
* 작성일자 : 2003-12-18
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet)request.getAttribute("ds");  // request dataset
    applySession = true;	// 세션 적용 여부

    // 세션으로부터 등록자정보를 얻는다.
	String deptnm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "selldeptnm", false)); //부서(팀)명
	String posinm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "posinm", false)); //직책명
	String emp_nm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "emp_nm", false)); //성명

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
	document.anncsls_insert_form.anncbgntm_date.focus();
}

// form 단위로 유효성을 검증한 예제
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// 실시간 판매국 공지사항 등록
function annc_insert(){
    var lo_form1 = document.anncsls_insert_form;

	if(lo_form1.anncbgntm_date.value==''){
        alert("게시시작일자를 입력하세요.");
        lo_form1.anncbgntm_date.focus();
        return;
	}
	if(lo_form1.anncbgntm_time.value==''){
        alert("게시시작시간을 입력하세요.");
        lo_form1.anncbgntm_time.focus();
        return;
	}

	if(lo_form1.anncendtm_date.value==''){
        alert("게시종료일자를 입력하세요.");
        lo_form1.anncendtm_date.focus();
        return;
	}

	if(lo_form1.anncendtm_time.value==''){
        alert("게시종료시간을 입력하세요.");
        lo_form1.anncendtm_time.focus();
        return;
	}

	if(lo_form1.annctitl.value==''){
        alert("제목을 입력하세요.");
        lo_form1.annctitl.focus();
        return;
	}

/*
	if(lo_form1.annccont.value==''){
        alert("내용을 입력하세요.");
        lo_form1.annccont.focus();
        return;
	}
*/

    lo_form1.annccont.value = lo_form1.jw.AllHtml;
    lo_form1.annccont.value = lo_form1.annccont.value.replace(/"/g, "_#_");

    if(lo_form1.annccont.value=='')
	{
        alert("내용을 입력해주세요.");
        lo_form1.jw.focus();
        return;
	}


    if(!check_all(lo_form1)) return;					// 폼 유호성 체크

    // 일자 및 시간을 조합한다.
    lo_form1.anncbgntm.value = lo_form1.anncbgntm_date.value + lo_form1.anncbgntm_time.value;
    lo_form1.anncendtm.value = lo_form1.anncendtm_date.value + lo_form1.anncendtm_time.value;
    // 부서(팀) 선택에 따라 수신부서(팀)코드, 수신부서(팀)명을 구한다.
    // 수신부서(팀)코드
	lo_form1.rmsgdept.value = lo_form1.deptcd.value;
	// 수신부서(팀)명
	var li_sel_index = lo_form1.deptcd.selectedIndex;	// 선택된 인덱스
	if(li_sel_index == 0){									// 전체 선택시
		lo_form1.rmsgdeptnm.value = "";
	}else{													// 부서(팀) 선택시
		lo_form1.rmsgdeptnm.value = lo_form1.deptcd.childNodes[li_sel_index+1].innerText;
	}

	// 부서(팀)코드,지역코드에 따라 수신구분코드를 설정한다.
	if(lo_form1.rmsgdept.value == ''){			// 부서(팀)코드가 존재하지 않을 경우 판매국전체(10)
		lo_form1.rmsgclsf.value = '10';
	}else if(lo_form1.rmsgdept.value != ''){	// 부서(팀)코드가 존재할 경우 판매국부서(팀)(20)
		lo_form1.rmsgclsf.value = '20';
	}

    // 액션을 "/ss/share/1251" 서블릿으로 보낸다
    lo_form1.action = "/ss/share/1251";
    lo_form1.submit();
}

// 실시간 판매국 공지사항 입력 취소
function annc_cancel(){
    // 공지사항 등록 폼의 값을 reset 해준다.
    var lo_form1 = document.anncsls_insert_form;

	lo_form1.anncbgntm.value = '';
	lo_form1.anncendtm.value = '';
	lo_form1.annctitl.value = '';
	lo_form1.annccont.value = '';

    lo_form1.jw.AllHtml = '';
}

//-->
</script>
<script language="JavaScript" For="jw" Event="OnjwDoccomplete()">
    document.all.jw.BodyHTML = document.getElementById("dis_content").innerHTML;
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1" onload="jsInit()">

<form name="anncsls_insert_form" method="post" action="">
	<input type="hidden" name="common_deptcd" value ="">
	<input type="hidden" name="rmsgclsf" value =""> 		<!--수신구분코드(10:판매국전체,20:판매국부서(팀))-->
	<input type="hidden" name="rmsgdept" value ="">			<!-- 수신부서(팀)코드 -->
	<input type="hidden" name="rmsgdeptnm" value ="">		<!-- 수신부서(팀)명 -->

	<input type="hidden" name="anncbgntm" value ="">		<!--공지시작일시-->
	<input type="hidden" name="anncendtm" value ="">		<!--공지종료일시-->
	<input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->

<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >정보공유
      &gt; </b> 실시간공지 &gt; 판매국공지</td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>
<!--타이틀 -->
<table width="829" border="0"  cellpadding="1" cellspacing="0" align="center">
  <tr>
    <td  height="25" bgcolor="#EBE9DC" class="title">실시간 판매국공지 등록</td>
  </tr>
  <tr>
    <td height="3">
      <!--여백-->
    </td>
  </tr>
</table>

<table width="830" border="0" cellspacing="0" align="center" bgcolor="#FFFFFF" class="gray" cellpadding="2" style="table-layout:fixed">
	<tr>
		<td bgcolor="#dddddd" width="100" class="gray">팀&nbsp;</td>
		<td width="315" class="gray" >&nbsp;<%= deptnm%></td>
		<td bgcolor="#dddddd" width="100" class="gray">직책</td>
		<td width="*" class="gray">&nbsp;<%= posinm%></td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="100" class="gray">등록자</td>
		<td width="*" class="gray"colspan="3">&nbsp;<%= emp_nm%></td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="100" class="gray">공지시작일시 <font color="red">*</font></td>
		<td width="315" class="gray">
			<input name="anncbgntm_date" type="text" value="<%= Util.getDate2()%>" maxlength="10" size="10" class="text_box" caption="공지시작일자" dataType="date">
			&nbsp;
			<input name="anncbgntm_time" type="text" value="<%= Util.getTime()%>" maxlength="5" size="5" class="text_box" caption="공지시작시간" dataType="24hr">

		</td>
		<td bgcolor="#dddddd" width="100" class="gray">공지종료일시 <font color="red">*</font></td>
		<td width="*" class="gray">
			<input name="anncendtm_date" type="text" value="<%= Util.getDate2()%>" maxlength="10" size="10" class="text_box" caption="공지종료일자" dataType="date">
			&nbsp;
			<input name="anncendtm_time" type="text" value="<%= Util.getTime()%>" maxlength="5" size="5" class="text_box" caption="공지시작시간" dataType="24hr">
		</td>
	</tr>
  <tr>
    <td bgcolor="#dddddd" width="100" class="gray">수신 팀</td>
    <td width="*" class="gray" colspan="3">
	 <select name="deptcd" class="sel_all">	<!--이벤트 없음-->
<%
		writeDeptOpt(session, out, ds.curcommlistOptHtml(""), true);
%>
	 </select>
    </td>

  </tr>
  <tr>
    <td bgcolor="#dddddd" width="100" class="gray">제목 <font color="red">*</font></td>
    <td width="*" class="gray" colspan="3">
      <input name="annctitl" type="text" size="90" class="text_box">
    </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" width="100" class="gray">내용 <font color="red">*</font></td>
    <td width="*" height="360" class="gray" colspan="3">
      <%--<textarea name="annccont" cols="52" rows="12" class="scroll1"></textarea>--%>
       <textarea name="annccont" class="scroll1" cols="100" rows="16" style="display:none"></textarea>
       <table style="display:none"><tr><td id=dis_content></td></tr></table>
       <div id="editorLocation">
         <script id="webeditorid" src="/html/comm_js/webEditorControl.js"></script>
       </div>
    </td>
  </tr>
</table>
<!--버튼 -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
  <tr>
    <td align="center" height="2">
      <!--여백-->
    </td>
  </tr>
  <tr>
    <td align="center" height="24" bgcolor="#E8E8E8">
	<input type="image" id="insert_id" border="0" src="/html/comm_img/bu_write.gif" width="36" height="19" align="absmiddle" border="0" onclick="javascript:annc_insert();window.event.returnValue=false;">
	<input type="image" id="cancel_id" border="0" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:annc_cancel();window.event.returnValue=false;">
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
