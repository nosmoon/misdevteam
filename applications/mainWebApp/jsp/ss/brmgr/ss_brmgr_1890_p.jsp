<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_reader_1420_p.jsp
* 기능 		 : 독자정보관리(독자메모팝업-초기화면)
* 작성일자 	 : 2003-12-29
* 작성자 	 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
  SS_A_ACTMEMODataSet ds = (SS_A_ACTMEMODataSet)request.getAttribute("ds");  // request dataset
%>
<html>
<head>
<title>::::독자메모::::</title>
<meta http-equiv="Content-Type" content="text/html;charset=KSC5601">
<link rel="stylesheet" href="/html/comm_css/sal.css" type="text/css">
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
            form.target = "ifrm";
            form.submit();
        }
    }

    // 폼 visual initializing
    function jsInit(){
        setEventHandler();
        setEnterKeyEventHandler();
        setInputBackgroundColor();
    }
/*
    //페이지 로딩시 기본값으로 검색
    function default_search(){
        var lo_form = document.rdrmemo_detail_form;

        if(window.dialogArguments){
           if(window.dialogArguments.indexOf(":") == -1){
               alert("유효하지 않은 arguments 입니다.");
               window.returnValue = "";
               window.close();
           }
           ls_args = window.dialogArguments;
           // dialog에 argument로 던져진 문자열을 ":" 로 split
           ga_args = ls_args.split(":");  //(ga_args[0] : 독자번호), (ga_args[1] : 처리 FLAG(R:조회, U:수정, D:초기화) )

           if(ga_args[0] == "" || ga_args[1] == ""){
               alert("독자번호나 처리FLAG가 셋팅되지 않았습니다.");
               window.returnValue = "";
               window.close();
           }

            window.returnValue = ga_args[0];

            lo_form.rdr_no.value = ga_args[0];
            lo_form.accflag.value = ga_args[1];

            lo_form.action = "/ss/reader/1430";
            lo_form.target = "ifrm";
            lo_form.submit();
        }
    }
*/
    // 독자메모(초기화, 등록, 수정)
    function access_ActMemo(s_accflag){
           if(window.event)window.event.returnValue = false;
        //초기화 버튼 클릭시에는 독자의 confirm 수행함
        if(s_accflag == "D" && !(confirm("독자에 대한 모든 메모를 잃게 됩니다. 정말 수행 하시겠습니까?"))) return;
        var lo_search_form = document.rdrmemo_detail_form;

        lo_search_form.accflag.value = s_accflag;

        if(!check_all(lo_search_form, "/ss/brmgr/1895")) return;
        return;
    }


    //창 닫기
    function close_modal(){
        window.close();
    }

-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="5" topmargin="5" marginwidth="5" marginheight="5" class="scroll1" onload="jsInit();">
<!--title-->
<table width="100%" border="0" cellspacing="0" cellpadding="0" height="100%" id="rdrmemo_detail_id">
  <tr>
    <td height="76">
      <!--title-->
      <table width=100% border=0 cellpadding=0 cellspacing=0>
        <tr>
          <td style width="16"><img src="/html/comm_img/memo_01.gif" width=16 height=76 ></td>
          <td width="72"><img src="/html/comm_img/memo_02.gif" width=72 height=76 ></td>
          <td width="133"><img src="/html/comm_img/memo_03.gif" width=133 height=76 ></td>
          <td background="/html/comm_img/memo_04.gif">&nbsp;</td>
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
    <td align="center" class="scroll1" valign="top">
      <!--리스트 시작-->
      <table border="0" cellspacing="0" cellpadding="5"  style="border: #AEACAE 1px solid;" >
<form name="rdrmemo_detail_form" method="post">
    <input type=hidden name=accflag	    >  <!--처리 FLAG(R:조회, U:수정, D:초기화) -->
    <input type=hidden name=invsgdt value="<%=request.getParameter("invsgdt")%>">
    <input type=hidden name=invsgno value="<%=request.getParameter("invsgno")%>">
    <input type=hidden name=addrcd value="<%=request.getParameter("addrcd")%>">
    <input type=hidden name=dongno value="<%=request.getParameter("dongno")%>">
    <input type=hidden name=incmgpers   >  <!--입력자(수정자)아이디                -->
<%--    <input type=hidden name=rdr_no	    >  <!--독자번호                            --%>
        <tr>
          <td bgcolor="#dddddd" valign="top">
            <textarea name="actmemo" cols="40" rows="20"><%=ds.cont%></textarea>          </td>
          </tr>
</form>
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
      <input name="image2" type="image" id="image" onclick="access_ActMemo('U');window.event.returnValue=false;" src="/html/comm_img/bu_save.gif" align="absmiddle">
      <input type="image" src="/html/comm_img/bu_close.gif" onclick="close_modal();window.event.returnValue=false;" align="absmiddle">
      <input name="image" type="image" id="default_btn" onclick="access_ActMemo('D');window.event.returnValue=false;" src="/html/comm_img/bu_default.gif" align="absmiddle" width="50" height="19"></td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="100%" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
