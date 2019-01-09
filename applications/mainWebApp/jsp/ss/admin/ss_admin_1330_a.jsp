<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1330_a.jsp
* 기능 : 관리자-마일리지-마감-초기화면
* 작성일자 : 2003-12-17
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	int migclosListCount = 10;
%>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">

<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
	setInputBackgroundColor();
	document.migclos_search_form.frdt.focus();
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
function migclos_list_search(){
    var lo_form1 = document.migclos_search_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 화면페이지 번호를 초기화한다.
    lo_form1.pageno.value = '1';
    
    // 조회조건을 "/ss/admin/1335" 서블릿으로 보낸다
    lo_form1.action = "/ss/admin/1335";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 상세보기
function migclos_detail_view(basidt){

    var lo_form1 = document.migclos_list_form;
    // 확장지원번호를 "/ss/admin/1340" 서블릿으로 보낸다
    lo_form1.basidt.value = basidt;
    lo_form1.action = "/ss/admin/1340";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 추가
function migclos_add()
{
    var lo_form1 = document.migclos_detail_form;	                // 상세정보 폼
	var lo_table1 = document.all.migclos_detail_title_id;		    // 상세정보 타이틀 테이블
	var lo_table2 = document.all.migclos_detail_id;		        	// 상세정보 대회정보 테이블

	// 화면제어
	lo_table1.rows[0].cells[0].innerText = '마일리지마감 등록';		// 상세화면 제목 변경
	lo_table2.rows[4].cells[1].innerText = 'N';						// 마감여부 변경
	lo_form1.basidt.readOnly=false;									// 기준일자 입력항목 활성화
	document.all.cancel_id.disabled=true;							// 취소버튼 비활성화
	setInputBackgroundColor();										// readOnly 배경색 활성화

	// 마감 항목을 제외하고 화면 정리
    var c_form2_elements = lo_form1.elements;
    for( var i =0; i< c_form2_elements.length; i++){
		if(c_form2_elements(i) != lo_form1.closyn){
            c_form2_elements(i).value = "";
		}
    }
    setEventHandler();
    
    lo_form1.accflag.value = 'I';									// 작업구분을 입력으로 설정
}

// 저장
function migclos_save(){
   	var lo_form1 = document.migclos_detail_form;					// 상세정보 폼

	if(lo_form1.accflag.value == 'D'){								// 삭제시 예외발생하면 'U'로 변경한다.
		lo_form1.accflag.value = 'U';
	}


    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
    
	// 시작일자 < 종료일자 체크
	if(lo_form1.frdt.value >= lo_form1.todt.value){
		alert("종료일자가 시작일자보다 작거나 같습니다.");
    	setEventHandler();
		return;
	}
	
	// 등록종료일자 < 종료일자 체크
	if(lo_form1.todt.value > lo_form1.closdt.value){
		alert("등록종료일자가 종료일자보다 작습니다.");
    	setEventHandler();
		return;
	}
	lo_form1.basidt.disabled=false;									// 기준일자 입력항목 활성화

    if(lo_form1.accflag.value == 'I') {	        					// 신규입력일 때
        lo_form1.action = "/ss/admin/1345";
    } else if(lo_form1.accflag.value == 'U') {						// 수정저장일 때
        lo_form1.action = "/ss/admin/1350";
    } else {
      return;
    }
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 삭제
function migclos_del(){
    var lo_form1 = document.migclos_detail_form;					// 상세정보 폼

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    if(lo_form1.basidt.value == '') {								// 기준일자 존재여부를 확인한다.
        alert("해당목록을 클릭 후 삭제하세요.");
        return;
    }

	var yesno = confirm("삭제하시겠습니까?");
	if(yesno){
		lo_form1.basidt.disabled=false;									// 기준일자 입력항목 활성화
	
	    lo_form1.accflag.value = 'D';									// 작업구분을 삭제('D')로 세팅
	    lo_form1.target = "ifrm";
	    lo_form1.action = "/ss/admin/1355";
	    lo_form1.submit();
	}	    
}

// 취소
function migclos_cancel(){

    var lo_form1 = document.migclos_detail_form;	       			// 상세정보 폼
	var lo_table1 = document.all.migclos_detail_title_id;		   	// 상세정보 타이틀 테이블
	var lo_table2 = document.all.migclos_detail_id;		        	// 상세정보 대회정보 테이블

//	lo_table1.rows[0].cells[0].innerText = '마일리지마감 상세';		// 상세화면 제목 변경
	lo_form1.reset();												// 상세정보 폼의 값 재설정
	setEventHandler();												// 폼 재설정 후 이벤트핸들러 호출
    setEnterKeyEventHandler();                                      // 폼 재설정 후 이벤트핸들러 호출
}

// 마감
function migclos_close(){
    var lo_form1 = document.migclos_detail_form;					// 상세정보 폼

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    if(lo_form1.basidt.value == '') {								// 기준일자 존재여부를 확인한다.
        alert("해당목록을 클릭 후 마감하세요.");
        return;
    }

	lo_form1.basidt.disabled=false;									// 기준일자 입력항목 활성화
    lo_form1.accflag.value = 'Y';									// 작업구분을 마감으로 설정
    lo_form1.target = "ifrm";
    lo_form1.action = "/ss/admin/1360";
    lo_form1.submit();
}

// 마감 취소
function migclos_colsecancel(){
    var lo_form1 = document.migclos_detail_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    if(lo_form1.basidt.value == '') {								// 기준일자 존재여부를 확인한다.
        alert("해당목록을 클릭 후 마감하세요.");
        return;
    }
	lo_form1.basidt.disabled=false;									// 기준일자 입력항목 활성화
    lo_form1.accflag.value = 'N';									// 작업구분을 마감취소로 설정
    lo_form1.target = "ifrm";
    lo_form1.action = "/ss/admin/1365";
    lo_form1.submit();
}

// 페이지 이동
function page_move(pageno) {

    var lo_form1 = document.migclos_search_form;

    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }
    // 확장대회목록 조회조건을 "/ss/admin/1335" 서블릿으로 보낸다
    lo_form1.action = "/ss/admin/1335";
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

    var lo_form1 = document.migclos_search_form;
		
	if(flag == '1'){			// 부서,지역,지국 초기화
	}else if(flag == '2'){		// 기간 초기화
		lo_form1.frdt.value = "";
		lo_form1.todt.value = "";
		lo_form1.frdt.focus();
	}else if(flag == '3'){		// 기타 초기화
	}		
}

-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" margin class="scroll1"  onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >관리자 >
        </b>마일리지 &gt; 마감 </td>
    </tr>
    <tr>
        <td height="10">
        <!--내용을 위한 여백-->
        </td>
    </tr>
</table>

<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<tr>
    <td width="490" valign="top">

    <!-- 마일리지마감 검색 시작 --------------------------------------------------------------------------------------------------->
    <table width="489" border="0"  cellpadding="1" cellspacing="0">
    <form name="migclos_search_form" method="post" action="" >
        <input name="pageno" type="hidden" value ="1">
        <input name="pagesize" type="hidden" value ="10">
        <input name="js_fn_nm" type="hidden" value ="page_move">
        <tr>
            <td height="25" bgcolor="#EBE9DC"  class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">기간
	            <input name="frdt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="시작일자" dataType="date">
	            -
	            <input name="todt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="종료일자" dataType="date">
	            <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('2');window.event.returnValue=false;"> <!--기간 초기화-->
	        </td>
	        <td height="25" bgcolor="#EBE9DC"  class="title" align="right">
	            <input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="javascript:migclos_list_search();window.event.returnValue=false;">
        	</td>
        </tr>
        <tr>
            <td height="3">
            <!--여백-->
            </td>
        </tr>
    </form>
    </table>
    <!-- 마일리지마감 검색 끝 --------------------------------------------------------------------------------------------------->

    <!-- 마일리지마감 목록 시작 --------------------------------------------------------------------------------------------------->
    <table width="490"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="migclos_list_id">
    <form name="migclos_list_form" method="post" action="">
        <input name="basidt" type="hidden" value ="">
        <tr bgcolor="#DDDDDD" height="25">
            <td class="gray" align="center">기준일자(년월)</td>
            <td class="gray" align="center" width="90">시작일자</td>
            <td class="gray" align="center" width="90">종료일자</td>
            <td class="gray" align="center" width="90">등록종료일자</td>
        </tr>
        <%-- 초기화면 목록 반복 시작 --%>
        <%for(int i=0; i<migclosListCount; i++){%>
        <tr height="25">
            <td class="gray" align="center">&nbsp;</td>
            <td class="gray" align="center" width="90">&nbsp;</td>
            <td class="gray" align="center" width="90">&nbsp;</td>
            <td class="gray" align="center" width="90">&nbsp;</td>
        </tr>
        <%}%>
        <%-- 초기화면 목록 반복 끝 --%>
        <tr bgcolor="#DDDDDD" align="right">
            <td height="25" class="gray" colspan="4">
                <img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 건 </b>
            </td>
        </tr>
    </form>
    </table>

    <!-- 페이지 이동 -->
    <table width="490" border="0" cellspacing="0" cellpadding="2" class="title2" id="page_move">
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
                    <jsp:param name = "pagesize" 	value="<%= migclosListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
                <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- 페이지 이동 -->
    <!-- 마일리지마감 목록 끝 --------------------------------------------------------------------------------------------------->
</td>
<td width="340" valign="top">

	<!-- 마일리지마감 등록/상세 시작 --------------------------------------------------------------------------------------------------->
    <table id="migclos_detail_title_id" width="100%" border="0" cellspacing="0" cellpadding="2">
        <tr>
            <td height="25" bgcolor="#EBE9DC" class="title">마일리지마감 등록</td>
        </tr>
        <tr>
            <td height="3">
            <!--여백-->
            </td>
        </tr>
    </table>
    <table id="migclos_detail_id" width="340" border="0" cellspacing="0" cellpadding="2" bgcolor="#ffffff" class="gray">
    <form name="migclos_detail_form" method="post" action="">
        <input type="hidden" name="accflag" value="I">          <!-- 입력(I),수정(U),삭제(D) 구분필드 초기값(I) -->
        <input type="hidden" name="closyn" value="">            <!-- 마일리지마감 마감여부 -->
        <tr>
            <td bgcolor="#dddddd"  width="90" class="gray" height="25">기준일자(년월)<font color="#FF0000">*</font></td>
            <td colspan="3" class="gray" height="25">
                <input name="basidt" type="text" size="7" class="text_box" value="" caption="기준일자(년월)" dataType="month" notEmpty>
            </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" width="90" class="gray" height="25">시작일자<font color="#FF0000">*</font></td>
            <td colspan="3" class="gray" height="25">
                <input name="frdt" type="text" size="10" class="text_box" value=""  caption="시작일자" dataType="date" notEmpty>
            </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" width="90" class="gray" height="25">종료일자<font color="#FF0000">*</font></td>
            <td colspan="3" class="gray" height="25">
                <input name="todt" type="text" size="10" class="text_box" value="" caption="종료일자" dataType="date" notEmpty>
            </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" width="90" class="gray" height="25">등록종료일자<font color="#FF0000">*</font></td>
            <td colspan="3" class="gray" height="25">
                <input name="closdt" type="text" size="10" class="text_box" value="" caption="등록종료일자" dataType="date" notEmpty>
            </td>
        </tr>
        <tr>
            <td  bgcolor="#dddddd" width="90" class="gray" height="25">마감여부</td>
            <td colspan="3" class="gray" height="25"> N </td>
        </tr>
    </form>
    </table>

    <!---button-->
    <table width="340" border="0" cellspacing="0" cellpadding="0" class="title2" id="migclos_button_id">
        <tr>
            <td align="center" height="2">
            <!--여백-->
            </td>
        </tr>
        <tr>
            <td align="center" height="24" bgcolor="#E8E8E8">
                <input type="image" id="add_id" src="/html/comm_img/bu_new.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:migclos_add();">
                <input type="image" id="save_id" src="/html/comm_img/bu_save.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:migclos_save();">
                <input type="image" id="del_id" src="/html/comm_img/bu_del.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:migclos_del();">
                <!-- 취소 버튼 -->
                <input type="image" id="cancel_id" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" onclick="javascript:migclos_cancel();">
                <input type="image" id="close_id" src="/html/comm_img/bu_ma.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:migclos_close();">
                <input type="image" id="closecancel_id" src="/html/comm_img/bu_cancel01.gif" width="64" height="19" align="absmiddle" onclick="javascript:migclos_colsecancel();">
            </td>
        </tr>
    </table>
    <!-- 마일리지마감 등록/상세 끝 --------------------------------------------------------------------------------------------------->
    </td>
  </tr>
  <tr>
    <td colspan="2" height="5">
      <!--여백-->
    </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->

</body>
</html>
