<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1200_a.jsp
* 기능 : 확장현황-사원확장-대회관리-초기화면
* 작성일자 : 2003-12-10
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_XTN_EMPCAMP_INITDataSet ds = (SS_L_RDR_XTN_EMPCAMP_INITDataSet)request.getAttribute("ds");
	int campListCount = 14;
    int mediListCount = 8;
	String paramGbn = "##";
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
	document.camp_search_form.frdt.focus();
}

// 폼 유효성 체크
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// 대회 목록보기
function camp_list_search(){
    var lo_form1 = document.camp_search_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 화면페이지 번호를 초기화한다.
    lo_form1.pageno.value = '1';
    // 확장대회목록 조회조건을 "/ss/extn/1205" 서블릿으로 보낸다
    lo_form1.action = "/ss/extn/1205";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 대회 상세보기
function camp_detail_view(rdr_extncampno){
    var lo_form1 = document.camp_list_form;
    // 사원확장대회번호를 "/ss/extn/1210" 서블릿으로 보낸다
    lo_form1.rdr_extncampno.value = rdr_extncampno;
    lo_form1.action = "/ss/extn/1210";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 추가
function camp_add()
{
    var lo_form1 = document.camp_detail_form;	                    // 상세정보 폼
	var lo_table1 = document.all.camp_detail_title_id;		        // 상세정보 타이틀 테이블
	var lo_table2 = document.all.camp_detail_id;		        	// 상세정보 대회정보 테이블
	lo_table1.rows[0].cells[0].innerText = '사원확장대회 등록';
	lo_table2.rows[4].cells[1].innerText = 'N';

	document.all.cancel_id.disabled=true;							// 취소버튼 비활성화

	// 마감 항목을 제외하고 화면 정리
    var c_form2_elements = lo_form1.elements;
    for( var i =0; i< c_form2_elements.length; i++){
		if(c_form2_elements(i) != lo_form1.closyn){
            c_form2_elements(i).value = "";
		}
    }

    lo_form1.accflag.value = 'I';									// 작업구분을 입력으로 설정
}

// 저장
// 함수 외부 지정 변수 mediListCount : 화면에 출력할 매체정보 목록의 길이
// 함수 외부 지정 변수 paramGbn : 항목별 문자열을 만들 때 구분자
function camp_save(){
   var lo_form1 = document.camp_detail_form;
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
    
	var li_count = <%= mediListCount %>;   							// 매체정보 목록 입력항목 갯수

	var ls_temp = '';
	
	// 동일매체 선택 체크
    for( var i = 1; i<= li_count; i++) {
		ls_temp =  document.all("medicd"+i).value;
		if(ls_temp != ''){
			for( var j = 1; j<= li_count && i != j; j++){
				if(ls_temp == document.all("medicd"+j).value){
					alert("동일 매체는 중복 선택될 수 없습니다.");
					return;
				}
			}
		}   	
	}	

    // 매체정보를 문자열 집합으로 만든다.
	var ls_medicdary = "";
	var ls_alonamtary = "";
	var ls_qtyaplydtary = "";
	var ls_basivalqtyary = "";

    // 화면에 출력된 매체정보 목록 입력항목을 검사혀여 값이 있는 항목에 대해 항목별로 문자열로 만든다.
    for( var i = 1; i<= li_count; i++) {
    
    	// 매체가 존재하지 않은 경우는 무시한다.
    	if(document.all("medicd"+i).value == null || document.all("medicd"+i).value == ""){
    		// 매체가 존재하지 않은 경우 수당,부수적용일자,기준부수가 존재하면 경고
    		if(document.all("alonamt"+i).value != ''){
    			alert("매체를 선택한 후 수당을 입력하세요");
    			setEventHandler();
    			return;
    		}
    		if(document.all("qtyaplydt"+i).value != ''){
    			alert("매체를 선택한 후 부수적용일자를 입력하세요");
    			setEventHandler();
    			return;
    		}
    		if(document.all("basivalqty"+i).value != ''){
    			alert("매체를 선택한 후 기준부수를 입력하세요");
    			setEventHandler();
    			return;
    		}
    		continue;
    	}
    	// 매체가 존재할 경우, 수당, 부수적용일자, 기준부수 여부 체크
    	if(document.all("medicd"+i).value != null && document.all("medicd"+i).value != ""){
    		if(document.all("alonamt"+i).value == null || document.all("alonamt"+i).value == ""){
    			alert("선택된 매체의 수당을 입력하세요");
    			setEventHandler();
    			return;
    		}
    		if(document.all("qtyaplydt"+i).value == null || document.all("qtyaplydt"+i).value == ""){
    			alert("선택된 매체의 부수적용일자를 입력하세요");
    			setEventHandler();
    			return;
    		}
    		if(document.all("basivalqty"+i).value == null || document.all("basivalqty"+i).value == ""){
    			alert("선택된 매체의 기준부수를 입력하세요");
    			setEventHandler();
    			return;
    		}
    	}
    	
        if(document.all("medicd"+i).value != null && document.all("medicd"+i).value != ""){
            ls_medicdary = ls_medicdary + document.all("medicd"+i).value + "<%= paramGbn%>";
        }
        if(document.all("alonamt"+i).value != null && document.all("alonamt"+i).value != ""){
            ls_alonamtary = ls_alonamtary + document.all("alonamt"+i).value + "<%= paramGbn%>";
        }
        if(document.all("qtyaplydt"+i).value != null && document.all("qtyaplydt"+i).value != ""){
            ls_qtyaplydtary = ls_qtyaplydtary + document.all("qtyaplydt"+i).value + "<%= paramGbn%>";
        }
        if(document.all("basivalqty"+i).value != null && document.all("basivalqty"+i).value != ""){
            ls_basivalqtyary = ls_basivalqtyary + document.all("basivalqty"+i).value + "<%= paramGbn%>";
        }
    }

	lo_form1.medicdary.value = ls_medicdary.substring(0, ls_medicdary.length-2);
	lo_form1.alonamtary.value = ls_alonamtary.substring(0, ls_alonamtary.length-2);
	lo_form1.qtyaplydtary.value = ls_qtyaplydtary.substring(0, ls_qtyaplydtary.length-2);
	lo_form1.basivalqtyary.value = ls_basivalqtyary.substring(0, ls_basivalqtyary.length-2);

    if(lo_form1.accflag.value == 'I') {	        					// 신규입력일 때
        lo_form1.action = "/ss/extn/1215";
    } else if(lo_form1.accflag.value == 'U') {						// 수정저장일 때
        lo_form1.action = "/ss/extn/1220";
    } else {
      return;
    }
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 삭제
function camp_del(){
    var lo_form1 = document.camp_detail_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    if(lo_form1.rdr_extncampno.value == '') {						// 확장대회번호 존재여부를 확인한다.
        alert("해당목록을 클릭 후 삭제하세요.");
        return;
    }

	var yesno = confirm("삭제하시겠습니까?");
	if(yesno){
	    lo_form1.accflag.value = 'D';									// 작업구분을 삭제('D')로 세팅
	    lo_form1.target = "ifrm";
	    lo_form1.action = "/ss/extn/1225";
	    lo_form1.submit();
	}	    
}

// 취소
function camp_cancel(){

    // 상세정보 폼의 값을 reset 해준다.
    var lo_form1 = document.camp_detail_form;	                    // 상세정보 폼
	var lo_table1 = document.all.camp_detail_title_id;		        // 상세정보 타이틀 테이블
	var lo_table2 = document.all.camp_detail_id;		        	// 상세정보 대회정보 테이블

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

//	lo_table1.rows[0].cells[0].innerText = '사원확장대회 상세';
//	lo_table2.rows[4].cells[1].innerText = 'Y';

	lo_form1.reset();

	setEventHandler();												// 폼 재설정 후 이벤트핸들러 호출
    setEnterKeyEventHandler();                                      // 폼 재설정 후 이벤트핸들러 호출
}

// 매체코드 선택시 관련 입력항목 제어
function medicd_change(sel_num, medicd, alonamt, qtyaplydt, basivalqty){
	if(medicd.selectedIndex == 0){
		alonamt.value="";
		qtyaplydt.value="";
		basivalqty.value="";
	}
}

// 마감
function camp_close(){
    var lo_form1 = document.camp_detail_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    if(lo_form1.rdr_extncampno.value == '') {						// 확장대회번호 존재여부를 확인한다.
        alert("해당목록을 클릭 후 마감하세요.");
        return;
    }
    lo_form1.accflag.value = 'Y';									// 작업구분을 마감으로 설정
    lo_form1.target = "ifrm";
    lo_form1.action = "/ss/extn/1230";
    lo_form1.submit();
}

// 마감 취소
function camp_colsecancel(){
    var lo_form1 = document.camp_detail_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    if(lo_form1.rdr_extncampno.value == '') {						// 확장대회번호 존재여부를 확인한다.
        alert("해당목록을 클릭 후 마감하세요.");
        return;
    }
    lo_form1.accflag.value = 'N';									// 작업구분을 마감취소로 설정
    lo_form1.target = "ifrm";
    lo_form1.action = "/ss/extn/1235";
    lo_form1.submit();
}

// 페이지 이동
function page_move(pageno) {
    var lo_form1 = document.camp_search_form;

    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }
    // 확장대회목록 조회조건을 "/ss/extn/1205" 서블릿으로 보낸다
    lo_form1.action = "/ss/extn/1205";
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

// 검색 조건 초기화
function set_default(flag){

    var lo_form1 = document.camp_search_form;
		
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
        <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >확장현황 >
        </b>사원확장 &gt; 대회 </td>
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

    <!-- 사원확장대회 검색 시작 --------------------------------------------------------------------------------------------------->
    <table width="489" border="0"  cellpadding="1" cellspacing="0">
    <form name="camp_search_form" method="post" action="" >
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
	            <input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="javascript:camp_list_search();window.event.returnValue=false;">
        	</td>
        </tr>
        <tr>
            <td height="3">
            <!--여백-->
            </td>
        </tr>
    </form>
    </table>
    <!-- 사원확장대회 검색 끝 --------------------------------------------------------------------------------------------------->

    <!-- 사원확장대회 목록 시작 --------------------------------------------------------------------------------------------------->
    <table width="490"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="camp_list_id">
    <form name="camp_list_form" method="post" action="">
        <input name="rdr_extncampno" type="hidden" value ="">
        <tr height="25">
            <td class="gray" align="center" bgcolor="#DDDDDD"> 대회명</td>
            <td class="gray" align="center" width="90" bgcolor="#DDDDDD">시작일자</td>
            <td class="gray" align="center" width="90" bgcolor="#DDDDDD">종료일자</td>
            <td class="gray" align="center" width="90" bgcolor="#DDDDDD">등록종료일자</td>
        </tr>
        <%-- 초기화면 목록 반복 시작 --%>
        <%for(int i=0; i<campListCount; i++){%>
        <tr height="25">
            <td class="gray" align="center">&nbsp;</td>
            <td class="gray" align="center" width="90">&nbsp;</td>
            <td class="gray" align="center" width="90">&nbsp;</td>
            <td class="gray" align="center" width="90">&nbsp;</td>
        </tr>
        <%}%>
        <%-- 초기화면 목록 반복 끝 --%>
        <tr bgcolor="#E8E8E8" align="right">
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
                    <jsp:param name = "pagesize" 	value="<%= campListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
                <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- 페이지 이동 -->
    <!-- 사원확장대회 목록 끝 --------------------------------------------------------------------------------------------------->
</td>
<td width="340" valign="top">

	<!-- 사원확장대회 등록/상세 시작 --------------------------------------------------------------------------------------------------->
    <table id="camp_detail_title_id" width="100%" border="0" cellspacing="0" cellpadding="2">
        <tr>
            <td height="25" bgcolor="#EBE9DC" class="title">사원확장대회 등록</td>
        </tr>
        <tr>
            <td height="3">
            <!--여백-->
            </td>
        </tr>
    </table>
    <table id="camp_detail_id" width="340" border="0" cellspacing="0" cellpadding="2" bgcolor="#ffffff" class="gray">
    <form name="camp_detail_form" method="post" action="">
        <input type="hidden" name="accflag" value="I">          <!-- 입력(I),수정(U),삭제(D) 구분필드 초기값(I) -->
        <input type="hidden" name="rdr_extncampno" value="">    <!-- 사원확장대회번호 -->
        <input type="hidden" name="closyn" value="">            <!-- 사원확장대회 마감여부 -->
        <input type="hidden" name="medicdary" value="">         <!-- 매체정보 문자열 집합 -->
        <input type="hidden" name="alonamtary" value="">        <!-- 수당금액 문자열 집합 -->
        <input type="hidden" name="qtyaplydtary" value="">      <!-- 부수적용일자 문자열 집합 -->
        <input type="hidden" name="basivalqtyary" value="">     <!-- 기준부수 문자열 집합 -->
        <tr>
            <td bgcolor="#dddddd"  class="gray" height="25">대회명<font color="#FF0000">*</td>
            <td colspan="3" class="gray" height="25">
                <input name="campnm" type="text" size="20" class="text_box" value="" caption="대회명" notEmpty>
            </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" class="gray" height="25">시작일자<font color="#FF0000">*</td>
            <td colspan="3" class="gray" height="25">
                <input name="frdt" type="text" size="10" class="text_box" value=""  caption="시작일자" dataType="date" notEmpty>
            </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" class="gray" height="25">종료일자<font color="#FF0000">*</td>
            <td colspan="3" class="gray" height="25">
                <input name="todt" type="text" size="10" class="text_box" value="" caption="종료일자" dataType="date" notEmpty>
            </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" class="gray" height="25">등록종료일자<font color="#FF0000">*</td>
            <td colspan="3" class="gray" height="25">
                <input name="closdt" type="text" size="10" class="text_box" value="" caption="등록종료일자" dataType="date" notEmpty>
            </td>
        </tr>
        <tr>
            <td  bgcolor="#dddddd" class="gray" height="25">마감여부</td>
            <td colspan="3" class="gray" height="25"> N </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" class="gray" height="25">수당지급일자<font color="#FF0000">*</td>
            <td colspan="3" class="gray" height="25">
                <input name="alonpayplandt" type="text" size="10" class="text_box" value="" caption="수당지급일자" dataType="date" notEmpty>
            </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" class="gray" height="25">비고</td>
            <td colspan="3" class="gray" height="25">
                <input name="remk" type="text" style="ime-mode:active;" size="35" class="text_box" value="">
            </td>
        </tr>
        <tr align="center" bgcolor="#EBE9DC">
            <td width="110" class="gray" height="25">매체</td>
            <td width="75" class="gray" height="25">수당</td>
            <td width="80" class="gray" height="25">부수적용일자</td>
            <td width="75" class="gray" height="25">기준부수</td>
        </tr>
    <%-- 매체 목록 반복 시작 --%>
    <%for(int i=0; i<mediListCount; i++){%>
        <tr>
            <td class="gray" height="25" align="center">
        <%-- 하나의 매체는 필수 입력항목 --%>
        <%if( i== 0 ){%>
                <select name="medicd<%= i+1 %>" id="medicd<%= i+1 %>" class="sel_all" caption="매체설정" notEmpty onchange="javascript:medicd_change(<%= i+1 %>, medicd<%= i+1 %>, alonamt<%= i+1 %>,  qtyaplydt<%= i+1 %>, basivalqty<%= i+1 %>);">
        <%}else{%>
                <select name="medicd<%= i+1 %>" id="medicd<%= i+1 %>" class="sel_all" caption="매체설정" onchange="javascript:medicd_change(<%= i+1 %>, medicd<%= i+1 %>, alonamt<%= i+1 %>,  qtyaplydt<%= i+1 %>, basivalqty<%= i+1 %>);">
        <%}%>
<!-- 매체코드, 코드명 목록 -->
<%
					writeMediOpt(session, out, ds.curmedicdOptHtml(""), false);
%> 
                </select>
            </td>
            <td class="gray" height="25" align="center">
                <input name="alonamt<%= i+1 %>" id="alonamt<%= i+1 %>" type="text" style="text-align:right" value="" size="8" class="text_box" caption="수당" dataType="integer" comma>
            </td>
            <td class="gray" height="25" align="center">
                <input name="qtyaplydt<%= i+1 %>" id="qtyaplydt<%= i+1 %>" type="text" value="" size="10" class="text_box" caption="부수적용일자" dataType="date">
            </td>
            <td class="gray" height="25" align="center">
                <input name="basivalqty<%= i+1 %>" id="basivalqty<%= i+1 %>" type="text"  style="text-align:right" value="" size="8" class="text_box" caption="기준부수" dataType="integer">
            </td>
        </tr>
    <%}%>
    <%-- 매체 목록 반복 끝 --%>
    </form>
    </table>

    <!---button-->
    <table width="340" border="0" cellspacing="0" cellpadding="0" class="title2" id="camp_button_id">
        <tr>
            <td align="center" height="2">
            <!--여백-->
            </td>
        </tr>
        <tr>
            <td align="center" height="24" bgcolor="#E8E8E8">
                <input type="image" id="add_id" src="/html/comm_img/bu_new.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:camp_add();">
                <input type="image" id="save_id" src="/html/comm_img/bu_save.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:camp_save();">
                <input type="image" id="del_id" src="/html/comm_img/bu_del.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:camp_del();">
                <!-- 취소 버튼 -->
                <input type="image" id="cancel_id" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" onclick="javascript:camp_cancel();">
                <input type="image" id="close_id" src="/html/comm_img/bu_ma.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:camp_close();">
                <input type="image" id="closecancel_id" src="/html/comm_img/bu_cancel01.gif" width="64" height="19" align="absmiddle" onclick="javascript:camp_colsecancel();">
            </td>
        </tr>
    </table>
    <!-- 사원확장대회 등록/상세 끝 --------------------------------------------------------------------------------------------------->
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
