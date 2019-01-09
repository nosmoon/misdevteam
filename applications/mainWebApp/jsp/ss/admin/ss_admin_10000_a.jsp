<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1000_a.jsp
* 기능 : 관리자-공통코드-초기화면
* 작성일자 : 2004-03-09
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%! 
private String getTime() {

java.util.Calendar systime = java.util.Calendar.getInstance();
                StringBuffer sb = new StringBuffer();
                sb.append(systime.get(java.util.Calendar.YEAR));
                sb.append("-");
                sb.append(systime.get(java.util.Calendar.MONTH));
                sb.append("-");
                sb.append(systime.get(java.util.Calendar.DAY_OF_MONTH));
                sb.append(" ");
                sb.append(systime.get(java.util.Calendar.HOUR_OF_DAY));
                sb.append(":");
                sb.append(systime.get(java.util.Calendar.MINUTE));
                sb.append(":");
                sb.append(systime.get(java.util.Calendar.SECOND));
                sb.append(".");
                sb.append(systime.get(java.util.Calendar.MILLISECOND));
                
                return sb.toString();
                }
%>  
<%
	CO_L_CDV_INITDataSet ds = (CO_L_CDV_INITDataSet)request.getAttribute("ds");
    int cdvListCount = 13;	// 한 화면당 리스트 항목 수
    applySession = true;	// 세션 적용 여부
    
    String time1 = (String)request.getAttribute("SVR Entry");
	String time11 = (String)request.getAttribute("SVR Done");	

	String time2 = "\nJSP Entry \t : "+ getTime();
	
	System.out.println("=====JSP ENTRY TIME======: " + time1);
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
	document.cdv_search_form.cicodeval.focus();
}

// 폼 유효성 체크
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// 코드구분 목록보기
function cicdgb_list_search(){
    var lo_form1 = document.cdv_search_form;
    
	// 업무구분코드를 해당 서블릿으로 보낸다.
    lo_form1.action = "/ss/admin/1003";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 목록보기
function list_search(){
    var lo_form1 = document.cdv_search_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
	lo_form1.pageno.value = '1';									// 페이지번호 초기화

	// 공통코드 목록 조회조건을 해당 서블릿으로 보낸다.
    lo_form1.action = "/ss/admin/1005";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 상세보기
function detail_view(ciymgbcd, cicdgb, cicodeval){
    var lo_form1 = document.cdv_list_form;

    // 업무구분코드, 코드구분, 코드를 "/ss/admin/1010" 서블릿으로 보낸다
    lo_form1.ciymgbcd.value = ciymgbcd;
    lo_form1.cicdgb.value = cicdgb;
    lo_form1.cicodeval.value = cicodeval;
    lo_form1.action = "/ss/admin/1010";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 추가
function add(){
	var lo_form1 = document.cdv_detail_form;
	// 화면 초기화
	lo_form1.ciymgbcd.value="";
	lo_form1.cicdgb.value=""; 
	lo_form1.cicodeval.value=""; 
	lo_form1.cicdnm.value=""; 
	lo_form1.cicdynm.value=""; 
	lo_form1.cimgtcd1.value=""; 
	lo_form1.cimgtcd2.value="";
	lo_form1.cimgtcd3.value="";
	lo_form1.cimgtcd4.value="";
	lo_form1.cimgtcd5.value="";
	lo_form1.cimgtcd6.value="";
	lo_form1.cimgtcd7.value="";
	document.all.ciremarks_id.outerHTML = '<textarea name="ciremarks" style="ime-mode:active;" cols="27" rows="5" class="scroll1" id="ciremarks_id"></textarea>';
	
	// 업무구분코드, 코드구분 활성화
	lo_form1.ciymgbcd.readOnly = false;
	lo_form1.cicdgb.readOnly = false; 
	lo_form1.cicodeval.readOnly = false;
	
	// 배경색 처리
	setInputBackgroundColor();
	
	// 취소버튼 비활성화
	document.all.cancel_id.disabled = true;
		
    lo_form1.accflag.value = 'I';			// 작업구분을 입력으로 설정
}

// 저장
function save(){
	var lo_form1 = document.cdv_detail_form;
	
    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    if(lo_form1.accflag.value == 'I') {	        					// 신규입력일 때
        lo_form1.action = "/ss/admin/1015";
    } else if(lo_form1.accflag.value == 'U') {						// 수정저장일 때
        lo_form1.action = "/ss/admin/1020";
    } else {
      return;
    }
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 삭제
function del(){
	var lo_form1 = document.cdv_detail_form;

	// 업무구분코드, 코드구분, 코드값의  존재여부를 확인한다.
    if(lo_form1.ciymgbcd.value == '' || lo_form1.cicdgb.value == '' || lo_form1.cicodeval.value == '') {
        alert("해당목록을 클릭 후 삭제하세요.");
        return;
    }

	var yesno = confirm("삭제하시겠습니까?");
	if(yesno){
	    if(!check_all(lo_form1)) return;
	    lo_form1.accflag.value = 'D';									// 작업구분을 삭제('D')로 세팅
	    lo_form1.action = "/ss/admin/1025";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	}
}

// 취소
function cancel(){
	var lo_form1 = document.cdv_detail_form;
	lo_form1.reset();                                               // 폼 재설정

	setEventHandler();												// 폼 재설정 후 이벤트핸들러 호출
}

// 페이지 이동
function page_move(pageno) {
    var lo_form1 = document.cdv_search_form;

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 공통코드 목록 조회조건을 "/ss/admin/1005" 서블릿으로 보낸다
    lo_form1.action = "/ss/admin/1005";
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

-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="title1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr> 
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >관리자 
      &gt; </b> 공통코드</td>
  </tr>
  <tr> 
    <td height="10"> 
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
  <tr> 
    <td width="500" valign="top"> 
    
	<!--공통코드 검색 시작 -->
	<table width="500" border="0"  cellpadding="2" cellspacing="0">
    <form name="cdv_search_form" method="post" action="" >
        <input name="pageno" type="hidden" value ="1">			                <!-- 현재 페이지 번호 -->
        <input name="pagesize" type="hidden" value ="<%= cdvListCount%>">	    <!-- 한 화면당 리스트 항목 수 -->
        <input name="js_fn_nm" type="hidden" value ="page_move">
        <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->
        
		<tr> 
			<td bgcolor="#EBE9DC" width="65" class="sea_top" ><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">업무구분</td>
			<td bgcolor="#EBE9DC" class="sea_top"> 
				<select name="ciymgbcd" class="sel_all" onChange="cicdgb_list_search()">
					<option value="" selected>전체</option>
					<%= ds.curcommlistOptHtml("") %>
				</select>
			</td>
			<td bgcolor="#EBE9DC" width="70" class="sea_top"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle"> 
			코드구분</td>
			<td bgcolor="#EBE9DC" class="sea_top"> 
			<select name="cicdgb" class="sel_all" id="cicdgb_id">
				<option value="" selected>전체</option>
			</select>
			</td>
			<td bgcolor="#EBE9DC" rowspan="2" align="right" width="40" class="sea_top">
				<input type="image" src="/html/comm_img/bu_search01.gif" width="39" height="35" border="0" align="absmiddle" onclick="javascript:list_search();window.event.returnValue=false;"><!--목록 조회-->
			</td>
		</tr>
		<tr> 
			<td bgcolor="#EBE9DC" width="65"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">코드값</td>
			<td bgcolor="#EBE9DC"> 
				<input type="text" name="cicodeval" size="4" class="text_box">
			</td>
			<td bgcolor="#EBE9DC" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">코드명</td>
			<td bgcolor="#EBE9DC"> 
				<input type="text" name="cicdnm" size="14" class="text_box" style="ime-mode:active;">
			</td>
		</tr>
		<tr bgcolor="#927F5B"> 
			<td colspan="5" style height"1"> 
			<!--line -->
			</td>
		</tr>
		<tr> 
			<td colspan="5" height="3"> 
			<!--여백 -->
			</td>
		</tr>
	</form>
	</table>
	<!--공통코드 검색 끝 -->
      
	<!--공통코드 목록 시작 -->
	<table width="500" border="0"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#FFFFFF" id="cdv_list_id">
    <form name="cdv_list_form" method="post" action="" >
        <input name="ciymgbcd" type="hidden" value ="">		<!--업무구분-->
        <input name="cicdgb" type="hidden" value ="">		<!--코드구분-->
        <input name="cicodeval" type="hidden" value ="">	<!--코드값-->
        
		<tr align="center" bgcolor="#dddddd" height="23"> 
			<td class="gray">코드값</td>
			<td width="190" class="gray">코드명</td>
			<td width="100" class="gray">약어</td>
			<td width="70"  class="gray">항목1</td>
			<td width="70"  class="gray">항목2</td>
		</tr>
		
        <%-- 초기화면 목록 반복 시작 --%>
        <%for(int i=0; i<cdvListCount; i++){%>		
		<tr height="23"> 
			<td class="gray">&nbsp;</td>
			<td class="gray" width="190">&nbsp;</td>
			<td class="gray" width="100">&nbsp;</td>
			<td class="gray" width="70" align="right">&nbsp;</td>
			<td class="gray" width="70" align="right">&nbsp;</td>
		</tr>
        <%}%>
        <%-- 초기화면 목록 반복 끝 --%>
		<tr bgcolor="#dddddd" > 
			<td height="23" colspan="5" align="right" class="gray">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 건 </b>
			</td>
		</tr>
	</form>		
	</table>
    <!-- 페이지 이동 -->
    <table width="500" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="page_move">
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
                    <jsp:param name = "pagesize" 	value="<%= cdvListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- 페이지 이동 -->
	<!--공통코드 목록 끝 -->
    
    </td>
    <td width="540" valign="top"> 
      <!--상세내역 title -->
	<table width="100%" border="0"  cellpadding="1" cellspacing="0" align="center">
		<tr> 
		  <td  height="25" bgcolor="#EBE9DC" class="title">공통코드 상세내역</td>
		  <td  height="25" bgcolor="#EBE9DC" class="title" width="70" align="right">(<font color="red">*</font> 
		    필수항목)</td>
		</tr>
		<tr> 
		  <td height="3" colspan="2"> 
		    <!--여백-->
		  </td>
		</tr>
	</table>
      
	<!--공통코드 상세 시작-->
	<table width="100%" border="0" cellpadding="1" cellspacing="0" class="gray" bgcolor="#FFFFFF" id="cdv_detail_id">
    <form name="cdv_detail_form" method="post" action="" >
        <input name="accflag" type="hidden" value ="I">		<!--등록,수정,삭제 구분 -->
		<tr height="23"> 
			<td width="60" bgcolor="#dddddd" class="gray" > 업무구분<font color="red">*</font></td>
			<td class="gray"><strong> 
			<input name="ciymgbcd" type="text" size="8" class="text_box" notEmpty>
			</strong></td>
		</tr>
		<tr> 
			<td bgcolor="#dddddd" class="gray"> 비고</td>
			<td class="gray"  height="95"> 
<%
	time2 += "\nXRW OUT \t : "+ getTime();
	//rxw.add(initData, "defaultDate", time1 + ds.timeCheck + time11 + time2); // 시간체크
	System.out.println("=====XRW OUT TIME======: " + time2);
%>
				<textarea name="ciremarks" style="ime-mode:active;" cols="60" rows="20" class="scroll1" id="ciremarks_id"><%=time1 + ds.timeCheck + time11 + time2%></textarea>
			</td>
		</tr>
	</form>		
	</table>
	<!--공통코드 상세 끝-->
	
	<table width="100%" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
	<tr> 
	  	<td align="center" height="2"> 
	    <!--여백-->
	  	</td>
	</tr>
	<tr> 
	  	<td align="center" height="24" bgcolor="#E8E8E8"> 
			<input type="image" src="/html/comm_img/bu_new.gif" width="39" height="19" align="absmiddle" border="0" onclick="add()" border="0">
			<input type="image" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" onclick="save()" border="0">
			<input type="image" src="/html/comm_img/bu_del.gif" width="39" height="19" align="absmiddle" border="0" onclick="del()" border="0">
			<input id="cancel_id" type="image" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" border="0" onclick="cancel()" border="0">
		</td>
	</tr>
	</table>
    </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>


