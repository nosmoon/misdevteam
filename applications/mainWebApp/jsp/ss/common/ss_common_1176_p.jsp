<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ss_common_1176_a.jsp
* 기능     : 독자 검색 팝업
* 작성일자 : 2003-04-13
* 작성자   : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    int listCount = 10;	// 한 화면당 리스트 항목 수
%>

<html>
<head>
<title>::: 독자검색::::</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<meta http-equiv="expired" content="0">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">

<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
// 이벤트 변수
window.returnValue	 = "";

// 이벤트 핸들러 초기화
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
    init();
    check_enter_search();
    document.rdr_search_form.rdr_no.focus();
}

// 폼 유효성 체크
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// 전달 매개변수 처리
function init(){
    var lo_form = document.rdr_search_form;

    if(window.dialogArguments){
        lo_form.rdrnm.value = window.dialogArguments;
    }
}

// 엔터키에 의한 검색 결과로 독자명을 가진 경우 독자명으로 검색을 수행한다.
function check_enter_search(){
    var lo_form1 = document.rdr_search_form;

	if(lo_form1.rdrnm.value != ''){
		lo_form1.addr3.value = '';
	    lo_form1.action = "/ss/common/1178";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	}
}

// 목록보기
function list_search(){
    var lo_form1 = document.rdr_search_form;

    // 독자번호, 이름 중 하나는 검색항목으로 입력되어야 한다.
    if(    (lo_form1.rdr_no.value 		== '')
    	&& (lo_form1.rdrnm.value 		== '')){
    	alert("독자번호, 이름 중 적어도 하나는 입력해야 합니다.");
		return;
    }

	// 독자번호항목 9자리 검사
	if( (lo_form1.rdr_no.value != '') && (lo_form1.rdr_no.value.length != 9)){
		alert("독자번호는 9자리입니다.");
		return;
	}

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 화면페이지 번호를 초기화한다.
    lo_form1.pageno.value = '1';

	// 검색 항목 정보를 /ss/common/1180 서블릿으로 보낸다.
    lo_form1.action = "/ss/common/1180";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 페이지 이동
function page_move(pageno) {
    var lo_form1 = document.rdr_search_form;

    // 독자번호, 이름 중 하나는 검색항목으로 입력되어야 한다.
    if(    (lo_form1.rdr_no.value 		== '')
    	&& (lo_form1.rdrnm.value 		== '')){
    	alert("독자번호, 이름 중 적어도 하나는 입력해야 합니다.");
		return;
    }

	// 독자번호항목 9자리 검사
	if( (lo_form1.rdr_no.value != '') && (lo_form1.rdr_no.value.length != 9)){
		alert("독자번호는 9자리입니다.");
		return;
	}

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    // 독자검색 조회조건을 "/ss/common/1180" 서블릿으로 보낸다
    lo_form1.action = "/ss/common/1180";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 부모 윈도우에 값을 리턴
function set_reader_info( 	 s_rdr_no         //독자번호
                            ,s_rdrnm          //독자명
                            ,s_onlmembid      //온라인회원아이디
                            ,s_dlvzip         //배달지 우편번호
                            ,s_dlvaddr        //배달지 주소
                            ,s_dlvdtlsaddr    //배달지 상세주소
                            ,s_rdrtel_no1     //전화번호1
                            ,s_rdrtel_no2     //전화번호2
                            ,s_rdrtel_no3     //전화번호3
                            ,s_rdrptph_no1    //휴대폰번호1
                            ,s_rdrptph_no2    //휴대폰번호2
                            ,s_rdrptph_no3    //휴대폰번호3
                            ,s_email          //독자이메일
                            ,s_prn            //주민등록번호
                            ,s_onlmembseq     //온라인회원일련번호

						){
    window.returnValue =         s_rdr_no         //독자번호           
                        + "\n" + s_rdrnm          //독자명             
                        + "\n" + s_onlmembid      //온라인회원아이디   
                        + "\n" + s_dlvzip         //배달지 우편번호    
                        + "\n" + s_dlvaddr        //배달지 주소        
                        + "\n" + s_dlvdtlsaddr    //배달지 상세주소    
                        + "\n" + s_rdrtel_no1     //전화번호1          
                        + "\n" + s_rdrtel_no2     //전화번호2          
                        + "\n" + s_rdrtel_no3     //전화번호3          
                        + "\n" + s_rdrptph_no1    //휴대폰번호1        
                        + "\n" + s_rdrptph_no2    //휴대폰번호2        
                        + "\n" + s_rdrptph_no3    //휴대폰번호3        
                        + "\n" + s_email          //독자이메일         
                        + "\n" + s_prn            //주민등록번호       
                        + "\n" + s_onlmembseq;    //온라인회원일련번호
    window.close();
}


// 팝업 종료
function close_modal(){
    window.close();
}

-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsInit();list_search();">
<!--title-->
<table width="670" border="0" cellspacing="0" cellpadding="0" height="100%">
  <tr>
    <td  height="7">
      <!-----상위여백-- -->
    </td>
  </tr>
  <tr>
    <td align="center" height="33" class="pup">
      <!--title-->
      <table width=670 border=0 cellpadding=0 cellspacing=0>
        <tr>
          <td width=2> <img src="/html/comm_img/car_01.gif" width=2 height=3 ></td>
          <td background="/html/comm_img/car`	_02.gif"></td>
          <td> <img src="/html/comm_img/car_03.gif" width=2 height=3 ></td>
        </tr>
        <tr>
          <td width=2> <img src="/html/comm_img/car_04.gif" width=2 height=23 ></td>
          <td background="/html/comm_img/car_05.gif" align="center" class="pup"> <img src="/html/comm_img/ic_pup.gif" width="19" height="8" align="absmiddle">
              <!--title 자리-->
      독자 검색 <img src="/html/comm_img/ic_pup.gif" width="19" height="8" align="absmiddle"></td>
          <td width=2><img src="/html/comm_img/car_06.gif" width=2 height=23 ></td>
        </tr>
        <tr>
          <td width=2><img src="/html/comm_img/car_07.gif" width=2 height=7 ></td>
          <td background="/html/comm_img/car_08.gif"></td>
          <td width=2> <img src="/html/comm_img/car_09.gif" width=2 height=7 ></td>
        </tr>
      </table>
      <!--title end-->
    </td>
  </tr>
  <tr>
    <td  height="7">
      <!-----리스트사이여백-- -->
    </td>
  </tr>
  <tr>
    <td align="center" class="pup" valign="top">
       <table width="670" border="0" cellspacing="0" cellpadding="2" bgcolor="#EBE9DC" height="30">
<!----------------------- 독자검색 폼 시작 --------------------------->
        <form name="rdr_search_form" method="post">
			<input name="pageno" type="hidden" value ="1">			                	<!-- 현재 페이지 번호 -->
			<input name="pagesize" type="hidden" value ="<%= listCount%>">	    <!-- 한 화면당 리스트 항목 수 -->
			<input name="js_fn_nm" type="hidden" value ="page_move">
			<tr>
				<td bgcolor="#EBE9DC" width="60" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">독자번호</td>
				<td bgcolor="#EBE9DC" class="title">
					<input type="text" name="rdr_no" size="9" class="text_box">
				</td>
				<td bgcolor="#EBE9DC" width="50" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">이름</td>
				<td bgcolor="#EBE9DC" class="title">
					<input type="text" name="rdrnm" size="10" class="text_box">
				</td>
				<td bgcolor="#EBE9DC" class="title"title width="200">
					<img src="/html/comm_img/ic_title.gif" width="12" height="7">읍/면/동
					<input type="text" name="addr3" size="12" class="text_box">
				</td>
				<td bgcolor="#EBE9DC" class="title" align="right">
					<input type="image" src="/html/comm_img/bu_search.gif" width="36" height="19" border="0" align="absmiddle" onclick="javascript:list_search();window.event.returnValue=false;">
				</td>
			</tr>         
        </form>
<!----------------------- 독자검색 폼 끝 --------------------------->
      </table>
<!----------------------- 독자목록 시작 --------------------------->
      <table width="670"  cellpadding="2" cellspacing="0" class="gray" id="reader_list_id">
        <tr bgcolor="#DDDDDD">
		  <td width="59" align="center" class="gray"> 독자번호 </td>
          <td width="59" height="22" align="center" class="gray" >독자명</td>
		  <td width="59" align="center" class="gray"> 독자ID </td>
          <td width="194" height="22" align="center" class="gray">주소</td>
          <td width="88" height="22" align="center" class="gray">전화번호</td>
          <td width="88" height="22" align="center" class="gray">휴대폰번호</td>                    		            		          
          <td width="100" height="22" align="center" class="gray">Email</td>
        </tr>
<%--독자목록 공백--%>
<%

		for(int j=0; j<listCount; j++){
%>
        <tr bgcolor="#FFFFFF">
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>          
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
        </tr>
<%
		}
%>
      </table>
      <table width="670" border="0" cellspacing="0" cellpadding="0"  class="title2" align="center" id="page_move">
        <tr>
          <td align="center" height="25" bgcolor="#E8E8E8">
            <!--JSP PAGE START---------------------------------------------------------------------------------->
            <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
                    <jsp:param name = "pageno" 		value="0"/>
                    <jsp:param name = "totalcnt" 	value="0"/>
                    <jsp:param name = "js_fn_nm" 	value="page_move"/>
                    <jsp:param name = "pagesize" 	value="<%= listCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
          </td>
        </tr>
      </table>
<!----------------------- 독자목록 끝 --------------------------->
    </td>
  </tr>
  <tr>
    <td align="center" height="7">
      <!--하단여백-->
    </td>
  </tr>
  <tr>
    <td align="center" height="27"  bgcolor="#959595"><input type="image" src="/html/comm_img/bu_close.gif" onclick="close_modal();window.event.returnValue=false;"></a></td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>