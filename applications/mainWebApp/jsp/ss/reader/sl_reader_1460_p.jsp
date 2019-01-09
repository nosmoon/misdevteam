<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : sl_reader_1460_p.jsp
* 기능       : 독자정보관리(기존독자목록팝업-초기화면)
* 작성일자   : 2004-04-06
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
<link rel="stylesheet" href="/html/comm_css/sal.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
    window.returnValue	 = "";
    // 폼 visual initializing
    function init(){
    	setEventHandler();
        setEnterKeyEventHandler();
        setInputBackgroundColor();

		var lo_form = document.dup_check_form;

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

        //넘겨준 arguments가 수정되면 순서에 유념하면서 수정해줘야 함.
        ga_args = ls_args.split(":");
        var ls_rdrnm            =   ga_args[0];         //독자명
        var ls_rdrtel_no1       =   ga_args[1];         //전화번호1
        var ls_rdrtel_no2       =   ga_args[2];         //전화번호2
        var ls_rdrtel_no3       =   ga_args[3];         //전화번호3
        var ls_rdrptph_no1      =   ga_args[4];         //휴대폰번호1
        var ls_rdrptph_no2      =   ga_args[5];         //휴대폰번호2
        var ls_rdrptph_no3      =   ga_args[6];         //휴대폰번호3
        var ls_dlvzip           =   ga_args[7];         //우편번호
        var ls_dlvaddr          =   ga_args[8];         //주소
        var ls_dlvdtlsaddr      =   ga_args[9];         //상세주소
        var ls_dlvdong          =   ga_args[10];        //동
        var ls_dlvser_no        =   ga_args[11];        //호수
        var ls_dlvbnji          =   ga_args[12];        //번지
        var ls_prn              =   ga_args[13];        //주민등록번호
        var ls_email            =   ga_args[14];        //이메일


		lo_form.rdrnm.value      	= 	ls_rdrnm       ;
        lo_form.rdrtel_no1.value 	= 	ls_rdrtel_no1  ;
        lo_form.rdrtel_no2.value 	= 	ls_rdrtel_no2  ;
        lo_form.rdrtel_no3.value 	= 	ls_rdrtel_no3  ;
        lo_form.rdrptph_no1.value	= 	ls_rdrptph_no1 ;
        lo_form.rdrptph_no2.value	= 	ls_rdrptph_no2 ;
        lo_form.rdrptph_no3.value	= 	ls_rdrptph_no3 ;
        lo_form.prn.value        	= 	ls_prn         ;
        lo_form.dlvzip.value     	= 	ls_dlvzip      ;
        lo_form.dlvaddr.value    	= 	ls_dlvaddr     ;
        lo_form.dlvdtlsaddr.value  	= 	ls_dlvdtlsaddr ;
        lo_form.dlvdong.value    	= 	ls_dlvdong     ;
        lo_form.dlvser_no.value  	= 	ls_dlvser_no   ;
        lo_form.dlvbnji.value    	= 	ls_dlvbnji     ;
        lo_form.email.value      	= 	ls_email       ;

        //lo_form.action = "/ss/slreader/1465";
        lo_form.action = "/jsp/ss/util/reqToInst.jsp";
        //lo_form.target = "ifrm";
        lo_form.submit();
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
	function set_reader_info( s_rdr_no ){
        window.returnValue = s_rdr_no;         //독자번호
        close_modal();
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
<table width="890" border="0" cellspacing="0" cellpadding="0" height="100%">
  <tr>
    <td  height="7">
      <!-----상위여백-- -->
    </td>
  </tr>
  <tr>
    <td align="center" height="33" class="pup">
      <!--title-->
      <table width="890" border=0 cellpadding=0 cellspacing=0>
        <tr>
          <td width=2> <img src="/html/slcomm_img/car_01.gif" width=2 height=3 ></td>
          <td background="/html/slcomm_img/car_02.gif"></td>
          <td> <img src="/html/slcomm_img/car_03.gif" width=2 height=3 ></td>
        </tr>
        <tr>
          <td width=2> <img src="/html/slcomm_img/car_04.gif" width=2 height=23 ></td>
          <td background="/html/slcomm_img/car_05.gif" align="center" class="pup"> <img src="/html/slcomm_img/ic_pup.gif" width="19" height="8" align="absmiddle">
          <!--title 자리--> 기존독자 목록 <img src="/html/slcomm_img/ic_pup.gif" width="19" height="8" align="absmiddle"></td>
          <td width=2><img src="/html/slcomm_img/car_06.gif" width=2 height=23 ></td>
        </tr>
        <tr>
          <td width=2><img src="/html/slcomm_img/car_07.gif" width=2 height=7 ></td>
          <td background="/html/slcomm_img/car_08.gif"></td>
          <td width=2> <img src="/html/slcomm_img/car_09.gif" width=2 height=7 ></td>
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
    <td>
      <font color="red">*</font>아래 목록에서 특정독자를 선택할 경우 해당독자의 상세정보 조회 및 구독추가변경 팝업이 자동으로 실행됩니다.
      만일, 현재 입력중인 독자와 중복되는 독자가 목록에 존재하지 않는다면 "닫기"버튼을 클릭하여 창을 닫으시고 독자추가 업무를 계속 진행하시면 됩니다.
    </td>
  </tr>
  <tr>
    <td align="center" class="pup" valign="top">
<!----------------------- 독자목록 시작 --------------------------->
      <table width="890"  cellpadding="2" cellspacing="0" class="gray" id="reader_list_id">
        <tr bgcolor="#DDDDDD" align="center" >
          <td width="61" class="gray"> 독자번호</td>
          <td width="98" class="gray">독자명</td>
          <td width="89" class="gray">주민등록번호</td>
          <td width="120" class="gray">이메일</td>
          <td width="312" class="gray">주소</td>
          <td width="90" class="gray">전화번호</td>
          <td width="90" class="gray">휴대폰번호</td>
        </tr>
<%--기존독자목록 공백--%>
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
          <td class="gray">&nbsp;</td>
        </tr>
<%
		}
%>
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
    <td align="center" height="27"  bgcolor="#959595"><input type="image" src="/html/slcomm_img/bu_close.gif" onclick="close_modal();window.event.returnValue=false;"></a></td>
  </tr>
</table>
<form name="dup_check_form" method="post" style="display:none"><!-- 기존독자목록 카운트시 활용 -->
    <input type=hidden name=accflag      value="20"><!--처리 FLAG ('10' : 기존독자 카운트, '20' : 기족독자목록조회 ) -->
    <input type=hidden name=rdrnm        value="">  <!--구독자명          -->
    <input type=hidden name=rdrtel_no1   value="">  <!--구독자전화번호1   -->
    <input type=hidden name=rdrtel_no2   value="">  <!--구독자전화번호2   -->
    <input type=hidden name=rdrtel_no3   value="">  <!--구독자전화번호3   -->
    <input type=hidden name=rdrptph_no1  value="">  <!--구독자휴대폰1     -->
    <input type=hidden name=rdrptph_no2  value="">  <!--구독자휴대폰2     -->
    <input type=hidden name=rdrptph_no3  value="">  <!--구독자휴대폰3     -->
    <input type=hidden name=prn          value="">  <!--주민번호          -->
    <input type=hidden name=dlvzip       value="">  <!--우편번호          -->
    <input type=hidden name=dlvaddr      value="">  <!--주소              -->
    <input type=hidden name=dlvdtlsaddr  value="">  <!--상세주소          -->
    <input type=hidden name=dlvdong      value="">  <!--동                -->
    <input type=hidden name=dlvser_no    value="">  <!--호수              -->
    <input type=hidden name=dlvbnji      value="">  <!--번지              -->
    <input type=hidden name=email        value="">  <!--이메일            -->
</form>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="100%" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>