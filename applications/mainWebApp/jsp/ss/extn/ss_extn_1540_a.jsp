<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1540_a.jsp
* 기능 : 확장현황-확장용역비용-(확장담당)-초기화면
* 작성일자 : 2003-12-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_EXTN_SERVCLOS_INITDataSet ds = (SS_L_RDR_EXTN_SERVCLOS_INITDataSet)request.getAttribute("ds");
	int servListCount = 20;
    int mediListCount = 13;
	String paramGbn = "##";
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
	document.serv_search_form.frdt.focus();
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
function serv_list_search(){
    var lo_form1 = document.serv_search_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 화면페이지 번호를 초기화한다.
    lo_form1.pageno.value = '1';
    // 확장용역비용마감 목록 조회조건을 "/ss/extn/1545" 서블릿으로 보낸다
    lo_form1.action = "/ss/extn/1545";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 상세보기
function serv_detail_view(basidt){
    var lo_form1 = document.serv_list_form;
    // 확장용역비용마감 기준일자를 "/ss/extn/1550" 서블릿으로 보낸다
    lo_form1.basidt.value = basidt;
    lo_form1.action = "/ss/extn/1550";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 마감
function serv_close(){
    var lo_form1 = document.serv_detail_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    if(lo_form1.basidt.value == '') {								// 기준일자 존재여부를 확인한다.
        alert("해당목록을 클릭 후 마감하세요.");
        return;
    }

	lo_form1.basidt.disabled=false;									// 기준일자 입력항목 활성화

    lo_form1.accflag.value = 'SY';									// 작업구분을 지원담당 마감으로 설정
    lo_form1.target = "ifrm";
    lo_form1.action = "/ss/extn/1555";
    lo_form1.submit();
}

// 마감 취소
function serv_colsecancel(){
    var lo_form1 = document.serv_detail_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    if(lo_form1.basidt.value == '') {								// 기준일자 존재여부를 확인한다.
        alert("해당목록을 클릭 후 마감하세요.");
        return;
    }

	lo_form1.basidt.disabled=false;									// 기준일자 입력항목 활성화

    lo_form1.accflag.value = 'SN';									// 작업구분을 지원담당 마감취소로 설정
    lo_form1.target = "ifrm";
    lo_form1.action = "/ss/extn/1560";
    lo_form1.submit();
}

// 페이지 이동
function page_move(pageno) {
    var lo_form1 = document.serv_search_form;

    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }
    // 확장용역비용마감 목록 조회조건을 "/ss/extn/1545" 서블릿으로 보낸다
    lo_form1.action = "/ss/extn/1545";
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

    var lo_form1 = document.serv_search_form;
		
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
        </b>조선IS확장 &gt; 마감 </td>
    </tr>
    <tr>
        <td height="10">
        <!--내용을 위한 여백-->
        </td>
    </tr>
</table>

<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<tr>
    <td width="400" valign="top">

    <!-- 확장용역비용마감 검색 시작 --------------------------------------------------------------------------------------------------->
    <table width="400" border="0"  cellpadding="1" cellspacing="0">
    <form name="serv_search_form" method="post" action="" >
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
	            <input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="javascript:serv_list_search();window.event.returnValue=false;">
        	</td>
        </td>
        </tr>
        <tr>
            <td height="3">
            <!--여백-->
            </td>
        </tr>
    </form>
    </table>
    <!-- 확장용역비용마감 검색 끝 --------------------------------------------------------------------------------------------------->

    <!-- 확장용역비용마감 목록 시작 --------------------------------------------------------------------------------------------------->
    <table width="400"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="serv_list_id">
    <form name="serv_list_form" method="post" action="">
        <input name="basidt" type="hidden" value ="">
        <tr>
            <td height="25" class="gray"  align="center" bgcolor="#DDDDDD"> 기준일자(년월)</td>
            <td height="25" class="gray"  align="center" width="90" bgcolor="#DDDDDD">
              시작일자</td>
            <td height="25" class="gray"  align="center" width="90" bgcolor="#DDDDDD">
              종료일자</td>
            <td height="25" class="gray"  align="center" width="90" bgcolor="#DDDDDD">
              마감일자</td>
        </tr>
        <%-- 초기화면 목록 반복 시작 --%>
        <%for(int i=0; i<servListCount; i++){%>
        <tr>
            <td height="25" class="gray" align="center">&nbsp;</td>
            <td class="gray" align="center" height="25" width="90">&nbsp;</td>
            <td class="gray" align="center" height="25" width="90">&nbsp;</td>
            <td class="gray" align="center" height="25" width="90">&nbsp;</td>
        </tr>
        <%}%>
        <%-- 초기화면 목록 반복 끝 --%>
        <tr bgcolor="#E8E8E8" align="right">
            <td  height="25" class="gray" colspan="4">
                <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">총건수 <b> 건</b>
            </td>
        </tr>
    </form>
    </table>

    <!-- 페이지 이동 -->
    <table width="400" border="0" cellspacing="0" cellpadding="2" class="title2" id="page_move">
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
                    <jsp:param name = "pagesize" 	value="<%= servListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
                <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- 페이지 이동 -->
    <!-- 확장용역비용마감 목록 끝 --------------------------------------------------------------------------------------------------->
</td>
<td width="430" valign="top">

	<!-- 확장용역비용마감 등록/상세 시작 --------------------------------------------------------------------------------------------------->
    <table id="serv_detail_title_id" width="100%" border="0" cellspacing="0" cellpadding="2">
        <tr>
            <td height="25" bgcolor="#EBE9DC" class="title">조선IS확장마감 상세</td>
        </tr>
        <tr>
            <td height="3">
            <!--여백-->
            </td>
        </tr>
    </table>
    <table id="serv_detail_id" width="430" border="0" cellspacing="0" cellpadding="2" bgcolor="#ffffff" class="gray">
    <form name="serv_detail_form" method="post" action="">
        <input type="hidden" name="accflag" value="">          	<!-- 마감,마감취소 구분필드 -->
        <input type="hidden" name="splychrgclosyn" value="">    <!-- 확장용역비용마감 지원담당 마감여부 -->
        <tr>
            <td bgcolor="#dddddd"  class="gray" height="25">기준일자</td>
            <td colspan="4" class="gray" height="25">
                <input name="basidt" type="text" size="20" class="text_box" value="" caption="기준일자"  dataType="month" notEmpty>
            </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" class="gray" height="25">시작일자</td>
            <td colspan="4" class="gray" height="25">
                <input name="frdt" type="text" size="10" class="text_box" value=""  caption="시작일자" dataType="date" notEmpty>
            </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" class="gray" height="25">종료일자</td>
            <td colspan="4" class="gray" height="25">
                <input name="todt" type="text" size="10" class="text_box" value="" caption="종료일자" dataType="date" notEmpty>
            </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" class="gray" height="25">마감일자</td>
            <td colspan="4" class="gray" height="25">
                <input name="closdt" type="text" size="10" class="text_box" value="" caption="마감일자" dataType="date" notEmpty>
            </td>
        </tr>
        <tr>
            <td  bgcolor="#dddddd" class="gray" height="25">조선IS 마감여부</td>
            <td colspan="4" class="gray" height="25"> N </td>
        </tr>
        <tr>
            <td  bgcolor="#dddddd" class="gray" height="25">지원부 마감여부</td>
            <td colspan="4" class="gray" height="25"> N </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" class="gray" height="25">청구일자</td>
            <td colspan="4" class="gray" height="25">
                <input name="clamdt" type="text" size="10" class="text_box" value="" caption="청구일자" dataType="date" notEmpty>
            </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" class="gray" height="25">비고</td>
            <td colspan="4" class="gray" height="25">
                <input name="remk" type="text" size="35" class="text_box" value="">
            </td>
        </tr>
        <tr align="center" bgcolor="#EBE9DC">
            <td width="100" class="gray" height="25" align="center">매체</td>
            <td width="100" class="gray" height="25" align="center">부서</td>
            <td width="75" class="gray" height="25" align="center">아파트</td>
            <td width="75" class="gray" height="25" align="center">주택</td>
            <td class="gray" height="25" align="center">상가</td>
        </tr>
    <%-- 매체 목록 반복 시작 --%>
    <%for(int i=0; i<mediListCount; i++){%>
        <tr>
            <td class="gray" height="25" align="center">&nbsp;</td>
            <td class="gray" height="25" align="center">&nbsp;</td>
            <td class="gray" height="25" align="center">&nbsp;</td>
            <td class="gray" height="25" align="center">&nbsp;</td>
            <td class="gray" height="25" align="center">&nbsp;</td>
        </tr>
    <%}%>
    <%-- 매체 목록 반복 끝 --%>
    </form>
    </table>

    <!---button-->
    <table width="430" border="0" cellspacing="0" cellpadding="0" class="title2" id="serv_button_id">
        <tr>
            <td align="center" height="2">
            <!--여백-->
            </td>
        </tr>
        <tr>
            <td align="center" height="24" bgcolor="#E8E8E8">
                <input type="image" id="close_id" src="/html/comm_img/bu_ma.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:serv_close();">
                <input type="image" id="closecancel_id" src="/html/comm_img/bu_cancel01.gif" width="64" height="19" align="absmiddle" onclick="javascript:serv_colsecancel();">
            </td>
        </tr>
    </table>
    <!-- 확장용역비용마감 등록/상세 끝 --------------------------------------------------------------------------------------------------->
    </td>
  </tr>
  <tr>
    <td colspan="2" height="5">
      <!--여백-->
    </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="400" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->

</body>
</html>
