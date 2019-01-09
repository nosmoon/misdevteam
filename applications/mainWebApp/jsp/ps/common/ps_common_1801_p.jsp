<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_common_1801_p.jsp
* 기능     : 공통 우편번호 검색 (검색 버튼에 의한 팝업 화면)
* 작성일자 : 2004-01-30
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<html>
<head>
<title>::::우편번호찾기::::</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
	window.returnValue	 = "";

	// 폼 유효성 체크 & 전송
    function check_all(form, s_uri){

		if(!validate(form)){
			return false;
		}
		else{
			makeValue(form); // "/" 및 "," 제거
			form.action = s_uri;
			form.target = "zipifrm";
			form.submit();
		}
	}


	// 폼 visual initializing
    function init(){
    	setEventHandler();

		var lo_form = document.zip_search_form;

    	//event check.
    	if(window.event) window.event.returnValue = false;

		var ls_args = ":"; // dialog argument
		// dialog에 argument로 던져진 문자열을 ":" 로 split
        if(window.dialogArguments){
           if(window.dialogArguments.indexOf(":") == -1){
               alert("유효하지 않은 arguments 입니다.");
               window.returnValue = "";
               window.close();
            }
           ls_args = window.dialogArguments;
        }

        ga_args = ls_args.split(":");  //ga_args[0] 검색어, ga_args[1] job_flg("A" 전체 검색, "S" 지국내 검색)

		if(ga_args[0] != ""){ //우편번호 검색시 우편번호를 argument 로 받았을 경우 검색을 실행한다.
            // 검색어의 패턴을 검색하여서 우편번호 패턴이 아니라면, 읍/면/동명인 것으로 무조건 간주함.
            if(validate_zip(ga_args[0])){
            	lo_form.zip.value           = deleteHyphen(trim(ga_args[0]));
            }else{
            	lo_form.addr3.value         = ga_args[0];
            }

            if(ga_args[1] == "A"){ // 특정 지국 코드를 입력하지 않으면 전체 우편번호내에서 검색
            	lo_form.bocd.value     		= "";
            }else{
            	lo_form.bocd.value     		= "";

            }

			lo_form.search_word.value	= ga_args[0];
            lo_form.pageno.value     	= "1";
            lo_form.pagesize.value     	= "10000";
            lo_form.action = "/ps/common/1106";
            lo_form.target = "zipifrm";
            lo_form.submit();
        }
    }

	// 우편번호 유효성 검증
    function validate_zip(s_zip){
		if(trim(s_zip) == "") return false;
        var format = /^(\d{3})(-{0,1})(\d{3})$/;
        return isValidFormat(s_zip, format);
    }

    // 부모 윈도우에 값을 리턴
	function set_addr( 	 s_zip		    //우편번호
						,s_addr		    //주소
						,s_bgnn		    //시작번지
						,s_endn		    //끝번지
						,s_bocd		    //해당지국지사코드
						,s_bonm		    //해당지국명
						,s_telno1	    //해당지국전화번호1
						,s_telno2	    //해당지국전화번호2
						,s_telno3       //해당지국전화번호3
                        ,s_sendyn ){    //지국발송 가능여부
        window.returnValue =         s_zip
							+ "\n" + s_addr
							+ "\n" + s_bgnn
							+ "\n" + s_endn
							+ "\n" + s_bocd
							+ "\n" + s_bonm
							+ "\n" + s_telno1
							+ "\n" + s_telno2
							+ "\n" + s_telno3
                            + "\n" + s_sendyn;
        window.close();
    }


	// 우편번호 목록조회
    function zip_search(i_pageno){

		/*
        if(zip_search_form.addr3.value == null || zip_search_form.addr3.value.replace(/ /gi, "") == "" ){
			window.event.returnValue = false;
           	return false;
        }
		*/
		var lo_form = document.zip_search_form;

        if(ga_args[1] == "A"){ 			   // 전체 우편번호내에서 검색하도록 함 ( "S" 특정지국 )
            lo_form.bocd.value     	= "";
        }else{
        	lo_form.bocd.value     	= "";

        }

        if(validate_zip(lo_form.search_word.value)){
            lo_form.zip.value           = deleteHyphen(trim(lo_form.search_word.value));
        }else{
            lo_form.addr3.value         = lo_form.search_word.value;
        }
        lo_form.pageno.value     	= i_pageno;
        lo_form.pagesize.value     	= "10000";

		if(!check_all(lo_form,"/ps/common/1106")) return;
        return;
    }

	// 창닫기
	function close_modal(){
		window.close();
	}
-->
</script>

</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="5" topmargin="5" marginwidth="5" marginheight="5" class="scroll1" onload="init()">
<!--팝업 사이즈 450*270-->
<table width="100%" border="0" cellspacing="0" cellpadding="0" height="100%">
  <tr>
    <td height="76">
      <!--top img -->
      <table width=100% border=0 cellpadding=0 cellspacing=0>
        <tr>
          <td width="16"> <img src="/html/comm_img/zip_find_01.gif" width=16 height=76 ></td>
          <td width=72> <img src="/html/comm_img/zip_find_02.gif" width=72 height=76 ></td>
          <td width=133> <img src="/html/comm_img/zip_find_03.gif" width=133 height=76 ></td>
          <td background="/html/comm_img/zip_find_04.gif" >&nbsp;</td>
        </tr>
      </table>
      <!--top img end -->
    </td>
  </tr>
  <tr>
    <td align="center" class="pup" valign="top">
      <!--우편번호 검색-->
      <table width="400" border="0" cellspacing="0" cellpadding="1">
        <form name="zip_search_form" method="post" action="" onsubmit="zip_search(1);window.event.returnValue=false;">
	    <input type="hidden" name="bocd"     value="">	    <!--지국지사코드-->
        <input type="hidden" name="zip"      value="">		<!--우편번호-->
       	<input type="hidden" name="addr3"    value="">		<!--읍/면/동-->
        <input type="hidden" name="pageno"   value="">		<!--현재페이지번호-->
    	<input type="hidden" name="pagesize" value="">		<!--페이지당 레코드수-->
        <input type="hidden" name="job_flg"  value="P">		<!-- action 이 Popup 창에서 일어났음을 의미한다. -->
        <tr>
          <td width="7"><img src="/html/comm_img/ic_arr02.gif" width="7" height="11"></td>
          <td>&quot;읍/면/동&quot; 을 제외하고 입력 (<font  color="#0066cc">예) 명륜동 → 명륜</font>
            ) 후 검색버튼을 클릭</td>
        </tr>
        <tr>
          <td width="7">&nbsp;</td>
          <td>&nbsp;읍/면/동
            <input size="16" name="search_word" class="text_box" caption="우편번호 혹은 읍/면/동명" notEmpty >
            <input type="image" src="/html/comm_img/bu_search.gif" style="cursor:hand" align="absmiddle" onclick="zip_search(1);window.event.returnValue=false;" >
          </td>
        </tr>
        <tr>
          <td colspan="2" height="15">
            <!--주소가 나오는 곳과의 여백을 위한공간 -->
          </td>
        </tr>
        </form>
      </table>
      <table width="410" cellspacing="0" cellpadding="1" border="1" bordercolor="#FFFFFF" style="display:none" id="zip_list">
        <tr align="center" bgcolor="#979596">
          <td width="60"><font color="#ffffff">우편번호</font></td>
          <td><font color="#ffffff">주소</font></td>
        </tr>
        <tr bgcolor="#F2F2F2">
          <td width="60" align="center">&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr bgcolor="#dddddd">
          <td width="60" align="center">&nbsp;</td>
          <td >&nbsp;</td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td align="center" height="7">
      <!--하단여백-->
    </td>
  </tr>
  <tr>
    <td align="center" height="27"  bgcolor="#959595">
      <input type="image" src="/html/comm_img/bu_close.gif" style="cursor:hand" onclick="close_modal();window.event.returnValue=false;">
    </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="zipifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
