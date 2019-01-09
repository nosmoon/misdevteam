<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_1000_a.jsp
* 기능 : 정보공유 일정 초기화면
* 작성일자 : 2003-11-20
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    CO_L_SCHE_INITDataSet ds = (CO_L_SCHE_INITDataSet)request.getAttribute("ds");  // request dataset
    int moveListCount = 10;	// 한 화면당 리스트 항목 수
    applySession = true;	// 세션 적용 여부

    // 세션으로부터 등록자정보를 얻는다.
	String deptnm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "selldeptnm", true)); //판매부서명
	String emp_nm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "emp_nm", true)); //성명
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
	document.sche_search_form.frdt.focus();
}

// form 단위로 유효성을 검증한 예제 
// 폼 유효성 체크
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

//리스트 조회
function list_search(){
    var lo_form1 = document.sche_search_form;
/*
    if(lo_form1.deptcd.value == '') {
        alert("부서를 선택해주세요.");
        lo_form1.deptcd.focus();
        return;
    } else if(lo_form1.schemangunitcd.value == '') {
        alert("단위를 선택해주세요.");
        lo_form1.schemangunitcd.focus();
        return;
    }
*/

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
	lo_form1.pageno.value = '1';									// 페이지번호 초기화

    // 부서와 단위값을 "/ss/share/1010" 서블릿으로 보낸다
    lo_form1.action = "/ss/share/1010";
    lo_form1.target = "ifrm";
    lo_form1.submit();
        
}

// 일정 추가
function add(){
	var lo_form1 = document.sche_detail_form;

	lo_form1.seq.value = "";
	lo_form1.frdt.value = "";
	lo_form1.todt.value = "";
	lo_form1.remk.value = "";
	lo_form1.schemangitemcd.value = "";
	lo_form1.schemangunitcd.value = "";	
		
	lo_form1.accflag.value = 'I';	// 작업구분을 신규입력('I')으로 세팅
}

//일정 저장
function save(){
	var lo_form1 = document.sche_detail_form;

	if(lo_form1.schemangitemcd.value==''){
        alert("일정항목을 선택해주세요.");
        lo_form1.schemangitemcd.focus();
        return;		
	}
	if(lo_form1.schemangunitcd.value==''){
        alert("일정구분을 선택해주세요.");
        lo_form1.schemangitemcd.focus();
        return;		
	}
	else if(lo_form1.frdt.value==''){
        alert("시작일자를 입력해주세요.");
        lo_form1.frdt.focus();
        return;		
	}
	else if(lo_form1.todt.value==''){
        alert("종료일자를 입력해주세요.");
        lo_form1.todt.focus();
        return;		
	}

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
		
	
	if(lo_form1.accflag.value == 'I'){				// 일정 등록
	    lo_form1.action = "/ss/share/1030";
	}else if(lo_form1.accflag.value == 'U'){		// 일정 수정
	    lo_form1.action = "/ss/share/1040";
	}
	
    lo_form1.target = "ifrm";
    lo_form1.submit();    
}

// 페이지 이동
function page_move(pageno) {
    var lo_form1 = document.sche_search_form;

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 일정 목록 조회조건을 "/ss/share/1010" 서블릿으로 보낸다
    lo_form1.action = "/ss/share/1010";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 일정 상세보기
function detail_view(seq) {
	var lo_form1 = document.sche_list_form;

    // 시퀀스값을 "/ss/share/1020" 서블릿으로 보낸다
    lo_form1.seq.value = seq;
    lo_form1.action = "/ss/share/1020";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 일정 삭제
function del(){
    var lo_form1 = document.sche_detail_form;

    if(lo_form1.seq.value == '') {	
        alert("해당목록을 클릭 후 삭제하세요.");
        return;
    }

	var yesno = confirm("삭제하시겠습니까?");
	if(yesno){
	    lo_form1.accflag.value = 'D';	// 작업구분을 삭제('D')로 세팅
	    lo_form1.target = "ifrm";
	    lo_form1.action = "/ss/share/1050";
	    lo_form1.submit();
	}	    
}

// 일정 입력 취소
function cancel(){
    // 상세정보 폼의 값을 reset 해준다.
    var lo_form1 = document.sche_detail_form;	// 상세정보 폼
	lo_form1.reset();                                               // 폼 재설정

	setEventHandler();												// 폼 재설정 후 이벤트핸들러 호출
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

-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >정보공유
      &gt; </b> 일정</td>
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

<!--일정 검색 시작-->
<table width="830" border="0" cellspacing="0" cellpadding="2">
<form name="sche_search_form" method="post" action="" >
	<input name="pageno" type="hidden" value ="1">
	<input name="pagesize" type="hidden" value ="<%= moveListCount%>">
    <input name="js_fn_nm" type="hidden" value ="page_move">
	<input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 --> 
	     
	<tr>
		<td bgcolor="#EBE9DC" class="title" width="50""><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">구분</td>
		<td bgcolor="#EBE9DC" class="title" width="100"">
			<select name="schemangunitcd" class="sel_all">
				<option value="">전체</option>
				<%=ds.curcommlist2OptHtml("")%>
			</select>
		</td>
		<td bgcolor="#EBE9DC" class="title" width="70""><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">시작일자</td>
		<td bgcolor="#EBE9DC" class="title" width="160">
			<input name="frdt" type="text" value="<%= Util.getDate2()%>" maxlength="10" size="10" class="text_box" caption="시작일자" dataType="date">
			-
			<input name="todt" type="text" value="<%= Util.convertS(Util.addDate(Util.getDate(), 15))%>" maxlength="10" size="10" class="text_box" caption="시작일자" dataType="date">
		</td>
		<td bgcolor="#EBE9DC" class="title" align="right">
			<input type="image" id="search_id" border="0" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" class="sel_all" onclick="javascript:list_search();window.event.returnValue=false;">
		</td>
	</tr>
	<tr>
		<td height="3" colspan="7">
			<!--여백-->
		</td>
	</tr>
</form>        
</table>
<!--일정 검색 끝-->

<!--일정 목록 시작-->
<table border="0" cellspacing="0" cellpadding="0" >
<tr><td>

<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="sche_list_id">
<form name="sche_list_form" method="post" action="">
	<input type="hidden" name="seq">
	    
	<tr bgcolor="#dddddd" align="center">
		<td class="gray" width="80">구분</td>
		<td class="gray" width="80">부서</td>
		<td class="gray" width="80">등록자</td>
		<td class="gray" width="100">일정명</td>
		<td class="gray" width="90">시작일자</td>
		<td class="gray" width="90">종료일자</td>
		<td class="gray">설명</td>
	</tr>
	
	<%-- 초기화면 목록 반복 시작 --%>
	<%for(int i=0; i<moveListCount; i++){%>		  
	<tr>
		<td class="gray" width="80">&nbsp;</td>
		<td class="gray" width="80">&nbsp;</td>
		<td class="gray" width="80">&nbsp;</td>
		<td class="gray" width="100">&nbsp;</td>
		<td class="gray" width="90" align="center">&nbsp;</td>
		<td class="gray" width="90" align="center">&nbsp;</td>
		<td class="gray">&nbsp;</td>
	</tr>
	<%}%>
	<%-- 초기화면 목록 반복 끝 --%>        
	<tr bgcolor="#dddddd" align="right">
		<td colspan="7" height="23" class="gray">
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
                <jsp:param name = "pagesize" 	value="<%= moveListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
        </jsp:include>
        <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- 페이지 이동 -->

</td></tr>
</table>
<!--일정 목록 끝-->

    </td>
  </tr>
  <tr>
    <td height="10">
      <!--여백 -->
    </td>
  </tr>
  <td>
  
  
<!--상세내역 -->
<table width="829" border="0"  cellpadding="1" cellspacing="0" align="center">
  <tr>
    <td  height="25" bgcolor="#EBE9DC" class="title">일정 상세내역</td>
  </tr>
  <tr>
    <td height="3">
      <!--여백-->
    </td>
  </tr>
</table>

<!--일정 상세 시작 -->	    
<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" bgcolor="#FFFFFF" id="sche_detail_id">
<form name="sche_detail_form" method="post" action="">
	<input type="hidden" name="seq" value="">
	<input type="hidden" name="accflag" value="I"> 		<!--작업구분(I:등록, U:수정, D:삭제)-->     

	<tr>
		<td width="100" height="24" bgcolor="#dddddd" class="gray">부서 <font color="red">*</font></td>
		<td  class="gray" width="315">&nbsp;<%= deptnm%></td>
		<td width="100" height="24" bgcolor="#dddddd" class="gray">등록자 <font color="red">*</font></td>
		<td  class="gray" width="315">&nbsp;<%= emp_nm%></td>
	</tr>      
	<tr>
		<td height="26" bgcolor="#dddddd" class="gray" width="100">일정항목 <font color="red">*</font><br></td>
		<td class="gray">
			<select name="schemangitemcd" class="sel_all">
				<option value="">선택</option>
				<%=ds.curcommlist3OptHtml("")%>
			</select>
		</td>        
		<td bgcolor="#dddddd" class="gray" width="100"> 일정구분 <font color="red">*</font></td>
		<td class="gray" width="315">
			<select name="schemangunitcd" class="sel_all">
				<option value="">선택</option>
				<%=ds.curcommlist2OptHtml("")%>
			</select>
		</td>
	</tr>
	<tr>
		<td height="26" bgcolor="#dddddd" class="gray" width="100">시작일자 <font color="red">*</font><br></td>
		<td class="gray" width="315">
			<input name="frdt" type="text" value="" maxlength="10" size="10" class="text_box" dataType=date> 예) 20040101
		</td>
		<td width="100" bgcolor="#dddddd" class="gray">종료일자 <font color="red">*</font></td>
		<td  class="gray" width="315">
			<input name="todt" type="text" value="" maxlength="10" size="10" class="text_box" dataType=date> 예) 20040201
		</td>
	</tr>
	<tr>
		<td height="26" bgcolor="#dddddd" class="gray" width="100">설명 </td>
		<td colspan="3" class="gray">
			<input name="remk" type="text" value="" style="ime-mode:active;" maxlength="100" size="100" class="text_box"> 
		</td>
	</tr>
</form>
</table>
<!--일정 상세 끝 -->	    

<!--button -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2">
	<tr>
		<td align="center" height="2">
		<!--여백-->
		</td>
	</tr>
	<tr>
		<td align="center" height="24" bgcolor="#E8E8E8"> 
			<input type="image" id="add_id" border="0" src="/html/comm_img/bu_new.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:add();window.event.returnValue=false;">
			<input type="image" id="save_id" border="0" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:save();window.event.returnValue=false;">
			<input type="image" id="del_id" border="0" src="/html/comm_img/bu_del.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:del();window.event.returnValue=false;">
			<input type="image" id="cancel_id" border="0" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:cancel();window.event.returnValue=false;">
		</td>
	</tr>
</table>

</td>
</tr>
</table>
<br>
<br>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
