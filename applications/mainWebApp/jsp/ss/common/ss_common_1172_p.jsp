<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명     : ss_common_1172_p.jsp
* 기능       : 독자검색팝업(기본형)(초기화면)
* 작성일자   : 2004-01-15
* 작성자     : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	// request
    long curr_page_no = ((String)request.getParameter("pageno") == null)? 1 : Long.parseLong(request.getParameter("pageno"));
	long records_per_page = ((String)request.getParameter("pagesize") == null)? 10 : Long.parseLong(request.getParameter("pagesize"));
%>
<html>
<head>
<title>::::독자검색::::</title>
<meta http-equiv="Content-Type" content="text/html; charset=KSC5601">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
    window.returnValue	 = "";
    // 폼 visual initializing
    function init(){
    	setEventHandler();
		//setEnterKeyEventHandler();
        //set_background_color();

		var lo_form = document.reader_search_form;

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
        ga_args = ls_args.split(":");

        var	ls_bocd				=	ga_args[0];        	//지국지사코드
        var	ls_rdr_extndt		=	ga_args[1];    		//확장일자(외부확장확인시 중복독자 체크용)
        var	ls_rdr_extnno		=	ga_args[2];     	//확장번호(외부확장확인시 중복독자 체크용)
        var	ls_search_order		=	ga_args[3];        	//정렬조건('DSNO','NO','NM','TEL','ADDR','AMT') '' 이면 DEFAULT로 'DSNO'
        var	ls_search_ad		=	ga_args[4];    		//"ASC" or "DESC"(확장 고려)
        var	ls_search_cond		=	ga_args[5];        	//검색조건('ALL', 'DSTC', 'DSNO', 'NO', 'NM', 'ADDRS', 'TEL') '' 이면 'ALL'
        var	ls_search_word		=	ga_args[6];        	//검색어
        var	ls_search_stop 		=	ga_args[7];   		//중지독자포함 조회 여부(확장 고려)

        //지국지사코드가 '12345'이고 독자번호가 '030000001' 인 독자를 독자번호로 검색 하고자 할 경우의 예 : 지국지사코드(12345) 검색조건(NO) 독자번호(030000001)

		if((ls_rdr_extndt != "" && ls_rdr_extnno != "") || (ls_bocd != "" && ls_search_word != "" )){
			lo_form.bocd.value        	=	ls_bocd			;
            lo_form.rdr_extndt.value  	= 	ls_rdr_extndt	;
            lo_form.rdr_extnno.value  	= 	ls_rdr_extnno	;
            lo_form.search_order.value	= 	ls_search_order	;
            lo_form.search_ad.value   	=	ls_search_ad	;
            lo_form.search_cond.value 	= 	ls_search_cond	;
            lo_form.search_word.value 	= 	ls_search_word	;
            lo_form.search_stop.value 	= 	ls_search_stop 	;
            lo_form.pageno.value     	=   "1"				;
            lo_form.pagesize.value     	=   "10"			;
            lo_form.action = "/ss/common/1120"			;
            lo_form.target = "ifrm"							;
            lo_form.submit()								;
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

    // 부모 윈도우에 값을 리턴
	function set_reader_info( 	 s_rdr_no         //독자번호
                                ,s_paty_clsfcd    //단체구분코드
                                ,s_natnclsfcd     //국가구분코드
                                ,s_onlmembid      //온라인회원아이디
                                ,s_rdrnm          //독자명
                                ,s_prn            //주민등록번호
                                ,s_ernno          //사업자등록번호
                                ,s_email          //독자이메일
                                ,s_dlvzip         //배달지 우편번호
                                ,s_dlvcd          //배달지 코드(주소코드)
                                ,s_dlvaddr        //배달지 주소
                                ,s_dlvdtlsaddr    //배달지 상세주소
                                ,s_dlvdong        //배달지 동
                                ,s_dlvser_no      //배달지 호
                                ,s_dlvbnji        //배달지 번지
                                ,s_dlvteamcd      //배달지 조코드
                                ,s_dlvdstccd      //배달지 구역코드
                                ,s_dlvno          //배달번호
                                ,s_dlvintvno      //배달사이번호
                                ,s_dlvmthdcd      //배달방법코드
                                ,s_dlvqty         //총구독부수
                                ,s_rdrtel_no1     //전화번호1
                                ,s_rdrtel_no2     //전화번호2
                                ,s_rdrtel_no3     //전화번호3
                                ,s_rdrptph_no1    //휴대폰번호1
                                ,s_rdrptph_no2    //휴대폰번호2
                                ,s_rdrptph_no3    //휴대폰번호3
                                ,s_realsubsamt    //총실구독액
                                ,s_subsamt        //총구독액
                                ,s_dscnamt        //총할인액
                                ,s_rptvsubsdt     //최초구독일자
                                ,s_rptvrdr_extndt //최초확장일자
                                ,s_addrnm         //배달지코드명(주소코드명)
                                ,s_mil            //마일리지
							){
        window.returnValue =         s_rdr_no         //독자번호
                            + "\n" + s_paty_clsfcd    //단체구분코드
                            + "\n" + s_natnclsfcd     //국가구분코드
                            + "\n" + s_onlmembid      //온라인회원아이디
                            + "\n" + s_rdrnm          //독자명
                            + "\n" + s_prn            //주민등록번호
                            + "\n" + s_ernno          //사업자등록번호
                            + "\n" + s_email          //독자이메일
                            + "\n" + s_dlvzip         //배달지 우편번호
                            + "\n" + s_dlvcd          //배달지 코드(주소코드)
                            + "\n" + s_dlvaddr        //배달지 주소
                            + "\n" + s_dlvdtlsaddr    //배달지 상세주소
                            + "\n" + s_dlvdong        //배달지 동
                            + "\n" + s_dlvser_no      //배달지 호
                            + "\n" + s_dlvbnji        //배달지 번지
                            + "\n" + s_dlvteamcd      //배달지 조코드
                            + "\n" + s_dlvdstccd      //배달지 구역코드
                            + "\n" + s_dlvno          //배달번호
                            + "\n" + s_dlvintvno      //배달사이번호
                            + "\n" + s_dlvmthdcd      //배달방법코드
                            + "\n" + s_dlvqty         //총구독부수
                            + "\n" + s_rdrtel_no1     //전화번호1
                            + "\n" + s_rdrtel_no2     //전화번호2
                            + "\n" + s_rdrtel_no3     //전화번호3
                            + "\n" + s_rdrptph_no1    //휴대폰번호1
                            + "\n" + s_rdrptph_no2    //휴대폰번호2
                            + "\n" + s_rdrptph_no3    //휴대폰번호3
                            + "\n" + s_realsubsamt    //총실구독액
                            + "\n" + s_subsamt        //총구독액
                            + "\n" + s_dscnamt        //총할인액
                            + "\n" + s_rptvsubsdt     //최초구독일자
                            + "\n" + s_rptvrdr_extndt //최초확장일자
                            + "\n" + s_addrnm         //배달지코드명(주소코드명)
                            + "\n" + s_mil;           //마일리지
        window.close();
    }


	// 독자 목록 검색(목록조회)
	function reader_list_search(i_pageno){
        var lo_form = document.reader_search_form;
        if(!validate_reader_search_word()){
        	window.event.returnValue =false;
            return;
        }

        lo_form.bocd.value = "<%=Util.checkString(request.getParameter("bocd"))%>";
        lo_form.pageno.value = i_pageno;
        lo_form.pagesize.value = "10";

		if(!check_all(lo_form, "/ss/common/1120")) return;
		return;
	}

    // 독자 목록 검색의 검색조건 필터
    function validate_reader_search_word(){
        var lo_form = document.reader_search_form;
        var ls_cond = lo_form.search_cond.value;
        var ls_word = lo_form.search_word.value;

       	if(ls_cond == "DSTC"){  		// 구역일 경우
           	if(!isValidFormat(ls_word, /^([\w\d]{3})$/)){
            	alert("유효하지 않은 구역입니다.");
                lo_form.search_word.select();
                return false;
            }
       	}else if(ls_cond == "DSNO") {	// 구역+배달번호
        	if(!isValidFormat(ls_word, /^(\d{3})-(\d{3})(-{0,1})(\d{0,2})$/)){
               	alert("유효하지 않은 구역+배달번호 입니다.\n 예) 101-101 또는 101-101-01");
                lo_form.search_word.select();
                return false;
            }
        }else if(ls_cond == "NO") {		// 독자번호
        	if(!isValidFormat(ls_word, /^(\d{9})$/)){
               	alert("유효하지 않은 독자번호 입니다.\n 예)031234567");
                lo_form.search_word.select();
                return false;
            }
        }else if(ls_cond == "TEL") {	// 전화번호
        	if(!isValidFormat(ls_word, /^(\d{3,4})-(\d{4})$/)){
               	alert("유효하지 않은 전화번호 입니다.\n 예)지역번호 없이 234-1234");
                lo_form.search_word.select();
                return false;
            }
        }
        return true;
    }

    //form elements 중 input 요소들의 background color 설정
    function set_background_color(){
        var forms = document.forms;
        var elements;
        for(var i=0; i<forms.length; i++){
        	elements = forms(i).elements;
        	for(var j=0; j<elements.length; j++){
                if(elements(j).tagName != "INPUT") continue;
            	if(elements(j).readOnly || elements(j).disabled ){
                	elements(j).style.backgroundColor = "#E6E6E6";
                	elements(j).style.color = "#6B6B6B";
            	}else{
                	elements(j).style.backgroundColor = "#FFFFFF";
                    elements(j).style.color = "#000000";
            	}
            }
        }
    }

    //특정 폼의 elements 중 input 요소들의 background color 설정
    function set_background_color_form(o_form){
        var elements = o_form.elements;
        for(var j=0; j<elements.length; j++){
            if(elements(j).tagName != "INPUT") continue;
            if(elements(j).readOnly || elements(j).disabled ){
                elements(j).style.backgroundColor = "#E6E6E6";
                elements(j).style.color = "#000000";
            }else{
                elements(j).style.backgroundColor = "#FFFFFF";
                elements(j).style.color = "#000000";
            }

        }
    }

    //창닫기
	function close_modal(){
		window.close();
	}
-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="5" topmargin="5" marginwidth="5" marginheight="5" class="scroll1" onload="init()">
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
        <form name="reader_search_form" method="post">
            <input type=hidden name=bocd			 value="">		 <!--	지국지사코드                                                           -->
            <input type=hidden name=rdr_extndt	     value="">       <!--	확장일자(외부확장확인시 중복독자 체크용)                               -->
            <input type=hidden name=rdr_extnno	     value="">       <!--	확장번호(외부확장확인시 중복독자 체크용)                               -->
            <input type=hidden name=search_ad	     value="">       <!--	"ASC" or "DESC"(확장 고려)                                             -->
            <input type=hidden name=search_stop      value="">       <!--	중지독자포함 조회 여부(확장 고려)                                      -->
            <input type=hidden name=pageno			 value="">       <!--   현재페이지             -->
            <input type=hidden name=pagesize	     value="">       <!--페이지당 보여줄 건수     -->
          <tr>
            <td width="163" height="30" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">정렬
                <select name="search_order" class="sel_all" caption="정렬조건">
                  <option value="DSNO">구역+배달</option>
                  <option value="NO">독자번호</option>
                  <option value="NM">독자명</option>
                  <option value="TEL">전화번호</option>
                  <!--option value="MIL">마일리지</option-->
                  <option value="ADDR">주소</option>
                  <option value="AMT">총구독액</option>
                </select></td>
            <td width="499" class="title" height="30"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">조건
                <select name="search_cond" class="sel_all" caption="검색조건">
                  <option value="ALL">전체</option>
                  <option value="DSTC">구역</option>
                  <option value="DSNO">구역+배달</option>
                  <option value="NO">독자번호</option>
                  <option value="NM">독자명</option>
                  <option value="ADDR">상세주소</option>
                  <option value="ADDRS">주소전체</option>
                  <option value="TEL">전화번호</option>
                  <option value="EMAIL">이메일</option>
                </select>
                <input name="search_word" type="text" size="10" class="text_box" onkeydown='if(window.event.keyCode == "13"){reader_list_search(1);window.event.returnValue=false;}'>
                <input name="image4" type="image" id="reader_list_search_btn" onclick="reader_list_search(1);window.event.returnValue=false;" src="/html/comm_img/bu_search.gif" align="absmiddle" width="36" height="19" border="0"></td>
          </tr>
        </form>
<!----------------------- 독자검색 폼 끝 --------------------------->
      </table>
<!----------------------- 독자목록 시작 --------------------------->
      <table width="670"  cellpadding="2" cellspacing="0" class="gray" id="reader_list_id">
        <tr bgcolor="#DDDDDD">
          <td width="64" height="22" align="center" class="gray">구역+배달</td>
          <td width="59" align="center" class="gray"> 독자번호 </td>
          <td width="87" height="22" align="center" class="gray" >독자명</td>
          <td width="88" height="22" align="center" class="gray">전화번호</td>
          <td width="86" height="22" align="center" class="gray">마일리지</td>
          <td width="194" height="22" align="center" class="gray">주소</td>
          <td width="62" height="22" align="center" class="gray"><span title="독자가 구독중인 매체의 실구독액(유료부수X매체단가-할인액)을 모두 합한 금액">총구독액</span></td>
        </tr>
<%--독자목록 공백--%>
<%

		for(int j=0; j<records_per_page; j++){
%>
        <tr bgcolor="#FFFFFF">
          <td height="17" class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td align="right" class="gray">&nbsp;</td>
        </tr>
<%
		}
%>
      </table>
      <table width="670" border="0" cellspacing="0" cellpadding="0"  class="title2" align="center" id="page_navigator_id">
        <tr>
          <td align="center" height="25" bgcolor="#E8E8E8">
            <!--JSP PAGE START---------------------------------------------------------------------------------->
                <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
                <jsp:param name = "curr_page_no" 		value="1"/>
                <jsp:param name = "total_records" 		value="0"/>
                <jsp:param name = "js_fn_nm" 			value="reader_list_search"/>
                <jsp:param name = "records_per_page" 	value="10"/>
                <jsp:param name = "page_set_gubun" 		value="0"/>
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