<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1000_a.jsp
* 기능 : 지국지원-신문지원물품-등록-초기화면
* 작성일자 : 2004-01-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_NWSPITEM_CDLSTDataSet ds = (SS_L_NWSPITEM_CDLSTDataSet)request.getAttribute("ds");
    int nwspitemListCount = 10;	// 한 화면당 리스트 항목 수
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
	document.nwspitem_search_form.itemclsf.focus();
}

// 폼 유효성 체크
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// 물품목록 검색
// form_name : select 포함하는 폼이름, type : 전체포함여부, select : select element
// hidden form 을 이용한다.
function item_list_search(form_name, type, select){
    var lo_form1 = document.item_list_form;

	// 상세폼의 상세화면일 경우는 처리하지 않는다.
	if(form_name == document.nwspitem_detail_form.name && document.nwspitem_detail_form.accflag.value == 'U'){
		return;
	}
	
    // 폼 이름, 타입, 선택된 물품구분코드를 "/ss/brsup/1005" 서블릿으로 보낸다
    lo_form1.form_name.value = form_name;
    lo_form1.type.value = type;
    lo_form1.itemclsf.value = select.value;
    lo_form1.action = "/ss/brsup/1005";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 목록보기
function list_search()
{
    var lo_form1 = document.nwspitem_search_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
    // 화면페이지 번호를 초기화한다.
    lo_form1.pageno.value = '1';

	// 신문지원물품 목록 조회조건을 "/ss/brsup/1010" 서블릿으로 보낸다.
    lo_form1.action = "/ss/brsup/1010";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 상세보기
function detail_view(itemcd){
    var lo_form1 = document.nwspitem_list_form;

    // 물품코드를 "/ss/brsup/1015" 서블릿으로 보낸다
    lo_form1.itemcd.value = itemcd;
    lo_form1.action = "/ss/brsup/1015";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 저장
function update(){
	var lo_form1 = document.nwspitem_detail_form;

    if(!check_all(lo_form1)) return;
    lo_form1.action = "/ss/brsup/1020";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 추가
function add(){

	var lo_form1 = document.nwspitem_detail_form;
	lo_form1.itemclsf.outerHTML 		= 	default_form.itemclsf.outerHTML;			// 물품구분
	lo_form1.itemcd.outerHTML 			= 	default_form.itemcd.outerHTML;				// 물품명
	lo_form1.sendclsf.outerHTML 		= 	default_form.sendclsf.outerHTML;			// 발송구분
	lo_form1.costclsf.outerHTML 		= 	default_form.costclsf.outerHTML;			// 비용청구구분
	lo_form1.rcpmchrgpersclsf.outerHTML = 	default_form.rcpmchrgpersclsf.outerHTML;	// 입금담당자
	lo_form1.clamchrgpersclsf.outerHTML = 	default_form.clamchrgpersclsf.outerHTML;	// 청구담당자
	lo_form1.remk.value 				= 	'';											// 설명
	lo_form1.uprc.value 				= 	'';											// 단가
	lo_form1.qunt.value 				= 	'';											// 수량
	lo_form1.aplcfrdt.value 			= 	'';											// 신청시작일자
	lo_form1.aplctodt.value 			= 	'';											// 신청종료일자
	lo_form1.aplcclostm.value 			= 	'';											// 신청마감시간
	
	// accflag 변경
	lo_form1.accflag.value = 'A';
}


// 페이지 이동
function page_move(pageno) {
    var lo_form1 = document.nwspitem_search_form;

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 신문지원물품 목록 조회조건을 "/ss/brsup/1010" 서블릿으로 보낸다
    lo_form1.action = "/ss/brsup/1010";
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

function popupimg(){
	var lo_form1 = document.nwspitem_detail_form;
//	var url = "/ss/brsup/1016?itemcd=" + lo_form1.item.value;
//	alert(lo_form1.item);	
	window.open("/ss/brsup/1017?itemcd=" + lo_form1.item.value, "팝업이미지","menubar=no, toolbar=no, location=no, scrollbars=no, width=510, height=570");	
}

//-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >지국지원
		> </b>신문지원물품 &gt; 등록</td>
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

	<!-- 신문지원물품 검색 시작 -->
	<table width="830" border="0" cellspacing="0" cellpadding="2"  bgcolor="#EBE9DC">
    <form name="nwspitem_search_form" method="post" action="" >
        <input name="pageno" type="hidden" value ="1">			                	<!-- 현재 페이지 번호 -->
        <input name="pagesize" type="hidden" value ="<%= nwspitemListCount%>">	    <!-- 한 화면당 리스트 항목 수 -->
        <input name="js_fn_nm" type="hidden" value ="page_move">

		<tr>
			<td bgcolor="#EBE9DC" width="70" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">물품구분</td>
			<td width="130" class="title">
				<select name="itemclsf" class="sel_all" onChange="item_list_search(this.form.name, 'Y', this)">
					<option value="" selected>전체</option>
					<%= ds.curitemclsfcdOptHtml("") %>                              <!-- 물품구분코드, 코드명 목록 -->
				</select>
			</td>
			<td bgcolor="#EBE9DC" width="70" class="title"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">물품명</td>
			<td width="103" class="title">
				<select name="itemcd" class="sel_all">
					<option value="" selected>전체</option>
				</select>
			</td>
			<td width="100" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">비용청구구분</td>
			<td width="120" class="title">
				<select name="costclsf" class="sel_all">
					<option value="" selected>전체</option>
					<%= ds.curcostclsfcdOptHtml("") %>                              <!-- 비용청구구분코드, 코드명 목록 -->
				</select>
			</td>
			<td width="70" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">발송구분</td>
			<td class="title">
				<select name="sendclsf" class="sel_all">
					<option value="" selected>전체</option>
					<%= ds.cursendclsfcdOptHtml("") %>                              <!-- 발송구분코드, 코드명 목록 -->
				</select>
			</td>
			<td align="right" class="title">
				<input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="javascript:list_search();window.event.returnValue=false;" border="0" >
			</td>
		</tr>
	</form>
	</table>
	<!-- 신문지원물품 검색 끝 -->

</td>
</tr>
<tr>
<td height="3">
<!--여백-->
</td>
</tr>
<tr>
<td>

	<!-- 신문지원물품 목록 시작 -->
	<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" bgcolor="#ffffff" id="nwspitem_list_id">
    <form name="nwspitem_list_form" method="post" action="" >
        <input name="itemcd" type="hidden" value ="">					<!-- 물품코드 -->

		<tr bgcolor="#dddddd" height="23">
			<td class="gray" align="center">물품명</td>
			<td width="100" class="gray" align="center">물품코드</td>
			<td width="150" class="gray" align="center">물품구분</td>
			<td width="100" class="gray" align="center">발송구분</td>
			<td width="100" class="gray" align="center">비용청구구분</td>
			<td width="100" class="gray" align="center">단가</td>
			<td width="100" class="gray" align="center">재고수량</td>
		</tr>
        <%-- 초기화면 목록 반복 시작 --%>
        <%for(int i=0; i<nwspitemListCount; i++){%>
		<tr>
			<td class="gray"> &nbsp; </td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="150" class="gray">&nbsp;</td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="100" class="gray" align="right">&nbsp;</td>
			<td width="100" class="gray" align="right">&nbsp;</td>
		</tr>
        <%}%>
        <%-- 초기화면 목록 반복 끝 --%>

		<tr bgcolor="#dddddd" height="23">
			<td colspan="8" class="gray" align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 건</b>
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
                    <jsp:param name = "pagesize" 	value="<%= nwspitemListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- 페이지 이동 -->
	<!-- 신문지원물품 목록 끝 -->

    </td>
  </tr>
  <tr>
    <td height="10">
      <!------여백--- -->
    </td>
  </tr>
  <tr>
    <td height="10">
	  <!--타이틀박스-->
	  <table width="830" border="0"  cellpadding="1" cellspacing="0">
	    <tr>
	      <td  height="27" bgcolor="#EBE9DC" class="title">물품등록</td>
	    </tr>
	    <tr>
	      <td height="3">
	        <!--여백-->
	      </td>
	    </tr>
	  </table>

	<!-- 신문지원물품 상세 시작 -->
	<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" bgcolor="#ffffff" id="nwspitem_detail_id">
	<form name="nwspitem_detail_form" method="post" action="" enctype="multipart/form-data">
        <input name="accflag" type="hidden" value ="A">					<!-- accflag(상세:D, 기타:A) -->
        <input name="item" type="hidden" value ="0">					<!-- 물품코드 -->
        
		<tr>
			<td width="120" height = "166" class="gray" rowspan="6"><img name = "thumbnailimg" src="/html/img/No_Image.GIF" onclick="popupimg()" width="120" height="166" align="absmiddle"></td>
			<td width="110" class="gray" bgcolor="#dddddd">물품구분<font color="#FF0000">*</font></td>
			<td width="240" class="gray">
				<select name="itemclsf" class="sel_all" onChange="item_list_search(this.form.name, 'N', this)" caption="물품구분" notEmpty>
					<%= ds.curitemclsfcdOptHtml("") %>                              <!-- 물품구분코드, 코드명 목록 -->
				</select>
			</td>
			<td width="110" bgcolor="#dddddd" class="gray" width="89">물품명<font color="#FF0000">*</font></td>
			<td width="250" class="gray">
				<select name="itemcd" class="sel_all" caption="물품명" notEmpty>
					<option value="" selected>물품구분 선택</option>
				</select>
			</td>
		</tr>
		
		<tr>
			<td width="110" bgcolor="#dddddd" width="89" class="gray">발송구분<font color="#FF0000">*</font></td>
			<td width="240" class="gray" caption="발송구분" notEmpty>
				<select name="sendclsf" class="sel_all">
					<option value="" selected>선택</option>
					<%= ds.cursendclsfcdOptHtml("") %>                              <!-- 발송구분코드, 코드명 목록 -->
				</select>
			</td>
			<td width="110" bgcolor="#dddddd" class="gray">입금담당자<font color="#FF0000">*</font><br>
			</td>
			<td width="250" class="gray">
				<select name="rcpmchrgpersclsf" class="sel_all" caption="입금담당자" notEmpty>
					<option value="" selected>선택</option>
					<%= ds.curchrgpersclsfcdOptHtml("") %>                        	<!-- 담당자구분코드, 코드명 목록 -->
				</select>
			</td>
			
		</tr>
		
		<tr>
			<td width="110" class="gray"  bgcolor="#dddddd">비용청구구분<font color="#FF0000">*</font></td>
			<td width="240" class="gray" >
				<select name="costclsf" class="sel_all" caption="비용청구구분" notEmpty>
					<option value="" selected>선택</option>
					<%= ds.curcostclsfcdOptHtml("") %>                              <!-- 비용청구구분코드, 코드명 목록 -->
				</select>
			</td>
			<td width="110" class="gray" bgcolor="#dddddd">청구담당자<font color="#FF0000">*</font></td>
			<td width="250" class="gray">
				<select name="clamchrgpersclsf" class="sel_all" caption="청구담당자" notEmpty>
					<option value="" selected>선택</option>
					<%= ds.curchrgpersclsfcdOptHtml("") %>                        	<!-- 담당자구분코드, 코드명 목록 -->
				</select>
			</td>
		</tr>
		
		<tr>
			<td bgcolor="#dddddd" class="gray" width="110">단가<font color="#FF0000">*</font></td>
			<td width="240" class="gray">
				<input name="uprc" type="text" size="10" class="text_box" value="" style="text-align:right" dataType="integer" comma caption="단가" notEmpty>
			</td>
			<td class="gray"  bgcolor="#dddddd" width="110"> 수량<font color="#FF0000">*</font></td>
			<td class="gray" width="250">
				<input name="qunt" type="text" size="10" class="text_box" value="" style="text-align:right" dataType="integer" comma caption="수량" notEmpty>
			</td>
		</tr>
		<tr>
			
			<td bgcolor="#dddddd" class="gray" width="110">신청마감시간<font color="#FF0000">*</font></td>
			<td class="gray" width="240">
				<input name="aplcclostm" type="text" size="10" class="text_box" style="text-align:right" dataType="24hr" caption="신청마감시간" notEmpty>
			</td>
			<td class="gray" width="110" bgcolor="#dddddd">신청기간<font color="#FF0000">*</font></td>
			<td class="gray" width="250">
				<input name="aplcfrdt" type="text" size="10" class="text_box" dataType="date" caption="신청기간" notEmpty>
				-
				<input name="aplctodt" type="text" size="10" class="text_box" dataType="date" caption="신청기간" notEmpty>
			</td>
		</tr>
		<tr>
			<td bgcolor="#dddddd" class="gray" width="110">썸네일 이미지</td>
			<td class="gray" width="240"><input type="file" name="thumbnail"></td>
			<td class="gray" width="110" bgcolor="#dddddd">팝업 이미지</td>
			<td class="gray" width="250"><input type="file" name="popup"></td>
		</tr>
		<tr>
			<td bgcolor="#dddddd" class="gray" width="120">설명<br></td>
			<td colspan="4" class="gray" width="*">
				<textarea style="ime-mode:active;" name="remk" cols="93" rows="3" class="scroll1"></textarea>
			</td>
		</tr>
	</form>
	</table>
	<!-- 신문지원물품 상세 끝 -->
	<!--button-->
	<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2">
		<tr>
			<td align="center"  bgcolor="#E8E8E8" height="25">
				<input type="image" src="/html/comm_img/bu_new.gif" width="39" height="19" align="absmiddle" border="0" onclick="add()" border="0">
				<input type="image" src="/html/comm_img/bu_save.gif" width="39" height="19" border="0" align="absmiddle" onclick="update()" border="0">
			</td>
		</tr>
	</table>

    </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="830" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
<!-- 물품구분 select 선택시 물품목록 select를 변경시키기 위한 폼-->
<!-- document내에 동일한 물품구분 select, 물품목록 select 항목들이 존재하므로 form 이름, 타입(전체포함여부)를 request에 포함한다.-->
<form name="item_list_form" method="post" action="" style="display:none">
	<input name="form_name" type="hidden" value ="">				<!-- form 이름 -->
	<input name="type" type="hidden" value ="">			           	<!-- 전체포함여부 (Y:포함, N:미포함)-->
	<input name="itemclsf" type="hidden" value ="">			   		<!-- 물품구분코드-->
</form>
<!-- 화면 초기화를 위한 품-->
<form name="default_form" method="post" action="" style="display:none">
	<select name="itemclsf" class="sel_all" onChange="item_list_search(this.form.name, 'N', this)">
		<%= ds.curitemclsfcdOptHtml("") %>                              <!-- 물품구분코드, 코드명 목록 -->
	</select>
	<select name="itemcd" class="sel_all">
		<option value="" selected>물품구분을 선택하세요.</option>
	</select>
	<select name="sendclsf" class="sel_all">
		<option value="" selected>선택</option>
		<%= ds.cursendclsfcdOptHtml("") %>                              <!-- 발송구분코드, 코드명 목록 -->
	</select>
	<select name="costclsf" class="sel_all">
		<option value="" selected>선택</option>
		<%= ds.curcostclsfcdOptHtml("") %>                              <!-- 비용청구구분코드, 코드명 목록 -->
	</select>
	<select name="rcpmchrgpersclsf" class="sel_all">
		<option value="" selected>선택</option>
		<%= ds.curchrgpersclsfcdOptHtml("") %>                        	<!-- 담당자구분코드, 코드명 목록 -->
	</select>
	<select name="clamchrgpersclsf" class="sel_all">
		<option value="" selected>선택</option>
		<%= ds.curchrgpersclsfcdOptHtml("") %>                        	<!-- 담당자구분코드, 코드명 목록 -->
	</select>
</form>
</body>
</html>
