<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_account_1160_p.jsp
* 기능 		 : 직원검색 팝업 (검색 버튼에 의한 팝업 화면)
* 작성일자 	 : 2004-01-27
* 작성자 	 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<html>
<head>
<title>::::직원 검색::::</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sal.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
	window.returnValue	 = "";

	// 폼 visual initializing
    function init(){
    	setEventHandler();

	    var lo_form = document.boemp_no_search_form;
		if(dialogArguments) { //직원명을 argument 로 받았을 경우 검색을 실행한다.
           lo_form.boemp_no.value = dialogArguments;
           boemp_no_search(1);
        }
    }

	// 폼 유효성 체크 & 전송
    function check_all(form, s_uri){
		if(!validate(form)){
			return false;
		}
		else{
			makeValue(form); // "/" 및 "," 제거

			form.action = s_uri;
			form.target = "ifrm";
			form.submit();
		}
	}

	//직원코드 목록조회
    function boemp_no_search(i_pageno){

        boemp_no_search_form.pageno.value = i_pageno;
        boemp_no_search_form.pagesize.value = "10";

// 		if(!check_all(boemp_no_search_form, "/ss/account/1168")) return;
 		if(!check_all(boemp_no_search_form, "/ss/brmgr/1868?bocd=" + boemp_no_search_form.bocd.value )) return;
    }

	//직원코드 셋팅 ( 부모 창에 직원을 셋팅 정보를 리턴)
    function set_boemp_no(s_boemp_no, s_boemp_nm){
    	window.returnValue = s_boemp_no + "\n" + s_boemp_nm;
        window.close();
    }

	function close_modal(){
		window.close();
	}
//-->
</script>
</head>
<body onload="init();boemp_no_search(1);" bgcolor="#F8F7F7" text="#000000" leftmargin="5" topmargin="5" marginwidth="5" marginheight="5" class="scroll1">
<!--title-->
<table width="400" border="0" cellspacing="0" cellpadding="0" height="100%">
  <tr>
    <td  height="7">
      <!-----상위여백-- -->
    </td>
  </tr>
  <tr>
    <td align="center" height="33" class="pup">
      <!--title-->
      <table width=400 border=0 cellpadding=0 cellspacing=0>
        <tr>
          <td width=2> <img src="/html/comm_img/car_01.gif" width=2 height=3 ></td>
          <td background="/html/comm_img/car_02.gif"></td>
          <td> <img src="/html/comm_img/car_03.gif" width=2 height=3 ></td>
        </tr>
        <tr>
          <td width=2> <img src="/html/comm_img/car_04.gif" width=2 height=23 ></td>
          <td background="/html/comm_img/car_05.gif" align="center" class="pup"> <img src="/html/comm_img/ic_pup.gif" width="19" height="8" align="absmiddle">
            <!--title 자리-->
            직원 검색 <img src="/html/comm_img/ic_pup.gif" width="19" height="8" align="absmiddle"></td>
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
      <!--검색 시작-->
      <table width="400" border="0" cellspacing="0" cellpadding="2" >
	<form name="boemp_no_search_form" method="post" onsubmit="boemp_no_search(1);">
        <input type="hidden" name="bocd" value="<%=request.getParameter("bocd")%>">
		<input type="hidden" name="pageno" value="">
   		<input type="hidden" name="pagesize" value="">
        <input type="hidden" name="job_flg" value="P"><!-- action 이 Popup 창에서 일어났음을 의미한다. -->
        <tr>
          <td bgcolor="#EBE9DC" width="42" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">코드</td>
          <td bgcolor="#EBE9DC" width="76" class="title">
            <input name="boemp_no" type="text" size="8" class="text_box">
          </td>
          <td bgcolor="#EBE9DC" class="title"title width="63"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">직원명</td>
          <td width="203" bgcolor="#EBE9DC" class="title">
            <input name="boemp_nm" type="text" size="8" class="text_box">
            <input type="image" src="/html/comm_img/bu_search.gif" width="36" height="19" border="0" align="absmiddle">
          </td>
        </tr>
        <tr>
          <td height="3" colspan="4">
            <!--여백-->
          </td>
        </tr>
	</form>
      </table>
      <!--리스트 시작 -->
      <table id="boemp_no_list_id" width="400" border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td>
          <table width="400" border="0" cellpadding="1" cellspacing="0" bgcolor="#FFFFFF" class="gray" >
            <tr align="center" bgcolor="#dddddd">
              <td width="50" class="gray">코드</td>
              <td width="100" class="gray">직원명</td>
              <td width="80" class="gray">직책</td>
              <td width="80" class="gray">전화번호</td>
              <td width="80" class="gray">입사일자</td>
            </tr>
            <tr>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
            </tr>
            <tr>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
            </tr>
            <tr>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
            </tr>
            <tr>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
            </tr>
            <tr>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
            </tr>
            <tr>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
            </tr>
            <tr>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
            </tr>
            <tr>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
            </tr>
            <tr>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
            </tr>
            <tr>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
            </tr>
          </table>
          <!--버튼-->
          <table id="boemp_no_list_nav_id" width="400" border="0" cellspacing="0" cellpadding="0"  class="title2" align="center">
            <tr>
              <td align="center" height="25" valign="center" bgcolor="#E8E8E8">
                <!--JSP PAGE START---------------------------------------------------------------------------------->
                      <jsp:include page="/jsp/ss/comm_jsp/page_navigator2.jsp">
                      <jsp:param name = "curr_page_no" 		value="1"/>
                      <jsp:param name = "total_records" 	value="0"/>
                      <jsp:param name = "js_fn_nm" 			value="boemp_no_search"/>
                      <jsp:param name = "records_per_page" 	value="10"/>
                      <jsp:param name = "page_set_gubun" 	value="0"/>
                      </jsp:include>
                <!--JSP PAGE END------------------------------------------------------------------------------------>
              </td>
            </tr>
          </table>
          </td>
        </tr>
      </table>
      <!--리스트 끝 -->
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
<iframe name="ifrm" width="00" height="00"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
