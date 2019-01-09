<%@ page contentType="text/html;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_reader_1280_p.jsp
* 기능 		 : 독자정보관리(마일리지지급내역팝업-초기화면)
* 작성일자 	 : 2003-12-13
* 작성자 	 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SL_L_MILGPAY_INITDataSet ds = (SL_L_MILGPAY_INITDataSet)request.getAttribute("ds");

	long records_per_page = ((String)request.getParameter("pagesize") == null)? 10 : Long.parseLong(request.getParameter("pagesize"));
%>
<html>
<head>
<title>마일리지 지급내역</title>
<meta http-equiv="Content-Type" content="text/html; charset=KSC5601">
<link rel="stylesheet" href="/html/comm_css/sal.css" type="text/css">
<script language="javascript" src="/html/comm_js/common.js"></script>
<script language="javascript">
<!--

	var ga_args; // popup 창에 전달된 인수를 담을 전역변수
	window.returnValue	 = "";

    //초기 화면 로딩시 독자추가화면의 HTML 소스들을 전역 변수에 셋팅
    var gs_html_milg_detail_id = "";     //마일리지지급 상세부분의 html 소스

    function set_default_html(){
		gs_html_milg_detail_id = document.all.milg_detail_id.outerHTML;
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

	// 폼 visual initializing
    function jsInit(){
    	setEventHandler();
		setEnterKeyEventHandler();
        setInputBackgroundColor();
    }

	// 페이지 로딩시 기본값으로 검색
    function default_search(){
   		var lo_form = document.milg_list_search_form;

		var ls_args = ":"; // dialog argument
		// dialog에 argument로 던져진 문자열을 ":" 로 split

        if(window.dialogArguments){
           if(window.dialogArguments.indexOf(":") == -1){
               alert("유효하지 않은 arguments 입니다.");
               window.returnValue = "";
               window.close();
           }
           ls_args = window.dialogArguments;
           ga_args = ls_args.split(":");  //(ga_args[0]:독자번호, ga_args[1]:매체코드)

           if(ga_args[0] == "" ){
               alert("독자번호가 셋팅되지 않았습니다.");
               window.returnValue = "";
               window.close();
           }else if(ga_args[1] == ""){
		       alert("매체코드가 셋팅되지 않았습니다.");
               window.returnValue = "";
               window.close();
		   }

           document.milg_detail_form.medicd.value = ga_args[1];

           window.returnValue = ga_args[0] + "\n" + ga_args[1]; // 독자번호 + "\n" + 매체코드 리턴값 셋팅

		   lo_form.rdr_no.value = ga_args[0];
           lo_form.pageno.value = "1";
           lo_form.pagesize.value = "10";
           lo_form.pid.value = "1290"; // 마일리지지급내역 목록조회
           page_move(1);
        }

    }

	//마일리지지급 (초기화)
	function milg_default(){
        document.all.milg_detail_id.outerHTML = gs_html_milg_detail_id;
        jsInit();
		return;
	}

	// 마일리지지급 (등록)
	// accflg = "I" (등록 )
	function milg_insert(){
        //추가적인 검증사항(hidden에 확장자 성명이 셋팅되어야만 유효한 확장자 셋팅임
        if(!ga_args[0]){
        	alert("독자번호가 셋팅되지 않았습니다.");
        }

        //마일리지기준 정보 셋팅
        set_basi_info();

		var lo_form = document.milg_detail_form;

        lo_form.accflag.value = "I";	   //처리구분(I:입력, U:수정, D:삭제)
        lo_form.rdr_no.value = ga_args[0]; //독자번호

        if(!check_all(lo_form, "/ss/slreader/1285")) return;

        return;
	}


    // 페이지 네비게이션 및 목록조회
    function page_move(i_pageno){
		var lo_search_form = document.milg_list_search_form;
		lo_search_form.pageno.value = i_pageno;
        if(!check_all(lo_search_form, "/ss/slreader/" + lo_search_form.pid.value)) return;
		return;
    }

    // 마일리지지급 (상세)
    function milg_detail(s_rdr_no, s_paydt, s_payno){
    	var lo_form = document.milg_detail_view_form;

        lo_form.rdr_no.value = s_rdr_no;	    //독자번호
		lo_form.milgpaydt.value = s_paydt;	    //지급일자
        lo_form.milgpayno.value = s_payno;	    //지급번호
        lo_form.target = "ifrm";
        lo_form.action = "/ss/slreader/1293";
        lo_form.submit();
        return;
    }

	// 마일리지지급 (수정)
    // accflg = "U" (수정)
    function milg_update(){

    	var lo_form = document.milg_detail_form;
        lo_form.accflag.value = "U";	//처리구분(I:입력, U:수정, D:삭제)
        if(!check_all(lo_form, "/ss/slreader/1294")) return;
        return;
    }

    // 마일리지지급 (삭제)
    // accflg = "D" (삭제)
    function milg_delete(){

    	var lo_form = document.milg_detail_form;
        lo_form.accflag.value = "D";	//처리구분(I:입력, U:수정, D:삭제)
        if(!check_all(lo_form, "/ss/slreader/1295")) return;
        return;
    }

	//창 닫기
	function close_modal(){
		window.close();
	}

	//
	function set_basi_info(){
		var lo_form = document.milg_detail_form;
		var lo_paybasi = lo_form.paybasicd;
        var i = lo_paybasi.selectedIndex;

		lo_form.cmpycd.value = lo_paybasi.options[i].cmpycd;
		lo_form.medicd.value = lo_paybasi.options[i].medicd;
		lo_form.payclsfcd.value = lo_paybasi.options[i].payclsfcd;
	}
-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="5" topmargin="5" marginwidth="5" marginheight="5" class="scroll1" onload="jsInit();set_default_html();default_search();">
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
          <td width=2> <img src="/html/slcomm_img/car_01.gif" width=2 height=3 ></td>
          <td background="/html/slcomm_img/car_02.gif"></td>
          <td> <img src="/html/slcomm_img/car_03.gif" width=2 height=3 ></td>
        </tr>
        <tr>
          <td width=2> <img src="/html/slcomm_img/car_04.gif" width=2 height=23 ></td>
          <td background="/html/slcomm_img/car_05.gif" align="center" class="pup"> <img src="/html/slcomm_img/ic_pup.gif" width="19" height="8" align="absmiddle">
            <!--title 자리-->
            마일리지 지급내역 <img src="/html/slcomm_img/ic_pup.gif" width="19" height="8" align="absmiddle"></td>
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
    <td align="center" class="pup" valign="top">
      <!--검색 시작-->
      <table width="670" border="0" cellspacing="0" cellpadding="2">
        <form name="milg_list_search_form" method="post">
            <input type=hidden name=pid >
            <input type=hidden name=rdr_no >
            <input type=hidden name=pageno >
            <input type=hidden name=pagesize >
        <tr>
          <td bgcolor="#EBE9DC" class="title" width="66"><img src="/html/slcomm_img/ic_title.gif" width="11" height="7" align="absmiddle">지급기준</td>
          <td bgcolor="#EBE9DC" class="title" width="202">
            <select name="paybasicd" class="sel_all" style="width:200px">
              <option value="">전체</option>
              <%--지급기준--%>
              <%
                StringBuffer sb = new StringBuffer("");
                SL_L_MILGPAY_INITBASICURRecord basicurRec  = null;
                for(int i=0; i<ds.basicur.size(); i++){
                    basicurRec = (SL_L_MILGPAY_INITBASICURRecord)ds.basicur.get(i);
                    String code = basicurRec.medicd + basicurRec.paybasicd;
                    String name = basicurRec.medinm + ":" + basicurRec.paybasinm;

                    sb.append("<option");
                    sb.append(" value=");
                    sb.append(code);
                    if(code.equals("")){
                        sb.append(" selected ");
                    }
                    sb.append(">");
                    sb.append(name);
                    sb.append("</option>");
                }
              %>
              <%=sb.toString()%>
            </select>
          </td>
          <td bgcolor="#EBE9DC" class="title" width="68"><img src="/html/slcomm_img/ic_title.gif" width="11" height="7" align="absmiddle">지급일자</td>
          <td width="150" bgcolor="#EBE9DC" class="title">
            <input name="frpaydt" type="text" size="9" class="text_box" dataType="date" notEmpty value="<%=Util.addDays(Util.getDate(), -730, "yyyyMMdd", "yyyyMMdd" )%>" caption="시작일자">
            ~
            <input name="topaydt" type="text" size="9" class="text_box" dataType="date" notEmpty value="<%=Util.addDays(Util.getDate(), 365, "yyyyMMdd", "yyyyMMdd" )%>" caption="종료일자">
          </td>
          <td bgcolor="#EBE9DC" class="title">
            <input name="image" type="image" id="his_search_btn" onClick="page_move(1);" src="/html/slcomm_img/bu_search.gif" align="absmiddle" width="36" height="19" border="0"></td>
        </tr>
        <tr>
          <td height="3" colspan="6">
            <!--여백-->
          </td>
        </tr>
        </form>
      </table>
      <!--리스트시작-->
      <table width="670" border="0" cellpadding="1" cellspacing="0"  bgcolor="#FFFFFF" class="gray" id="his_list_id">
        <tr align="center" bgcolor="#dddddd">
          <td width="64" class="gray">지급일자</td>
          <td width="52" class="gray">지급번호</td>
          <td class="gray" width="81">매체명</td>
          <td width="93" class="gray">지급기준</td>
          <td width="71" class="gray">포인트</td>
          <td width="71" class="gray">본사분담금</td>
          <td width="70" class="gray">지국분담금</td>
          <td width="96" class="gray">지급지국명</td>
          <td class="gray">마감</td>
        </tr>
<%--공백 루프 시작--%>
<%
for(int j=0; j<records_per_page; j++){
%>
        <tr>
          <td class="gray" width="64" align="center">&nbsp;</td>
          <td class="gray" width="52" align="center">&nbsp;</td>
          <td class="gray" width="81">&nbsp;</td>
          <td class="gray" width="93" >&nbsp;</td>
          <td class="gray" width="71" align="right">&nbsp;</td>
          <td class="gray" width="71" align="right">&nbsp; </td>
          <td class="gray" align="right">&nbsp; </td>
          <td class="gray">&nbsp; </td>
          <td class="gray" align="center">&nbsp; </td>
        </tr>
<%
}
%>
<%--공백 루프 끝--%>
      </table>
      <!--버튼-->
      <table width="670" border="0" cellspacing="0" cellpadding="0"  class="title2" align="center" id="navigator_id">
        <tr>
          <td align="center" height="25" bgcolor="#E8E8E8">
            <!--JSP PAGE START---------------------------------------------------------------------------------->
                  <jsp:include page="/jsp/ss/slcomm_jsp/page_navigator.jsp">
                  <jsp:param name = "curr_page_no" 		value="1"/>
                  <jsp:param name = "total_records" 	value="0"/>
                  <jsp:param name = "js_fn_nm" 			value="page_move"/>
                  <jsp:param name = "records_per_page" 	value="10"/>
                  <jsp:param name = "page_set_gubun" 	value="0"/>
                  </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
          </td>
        </tr>
      </table>
	  <table width="670" border="0" cellspacing="0" cellpadding="0"  align="center">
        <tr>
          <td align="center" height="5">
           <!--여백-->
          </td>
        </tr>
      </table>
	  <table width="670" border="0" cellpadding="1" cellspacing="0" bgcolor="#FFFFFF" class="gray" id="milg_detail_id">
        <form name="milg_detail_form" method="post">
          <input type=hidden name=accflag         > <!--	처리구분(I:입력, U:수정, D:삭제)  -->
          <input type=hidden name=rdr_no          > <!--	독자번호                    -->
        <tr height="23">
          <td width="73" bgcolor="#dddddd" class="gray">지급일자<font color="red">*</font></td>
          <td width="68" class="gray"><input name="milgpaydt" class="text_box" size="9"  tabindex="1" style="ime-mode:disabled" dataType="date" caption="지급일자" value="<%=Util.getDate2()%>" readonly>
          </td>
          <td width="73" bgcolor="#dddddd" class="gray">지급번호</td>
          <td width="93" class="gray"><input name="milgpayno" type="text" class="text_box" id="payno" tabIndex="2" size="3" maxlength="3" style="ime-mode:disabled;" dataType="number" caption="지급번호" readonly></td>
          <td width="71" bgcolor="#dddddd" class="gray">지급기준<font color="red">*</font></td>
          <td colspan="3" class="gray"><input type="hidden" name="medicd">
		    <input type="hidden" name="cmpycd">
			<input type="hidden" name="payclsfcd">
			<select name="paybasicd" class="sel_all" style="width:200px" onchange="set_basi_info()">
              <%--지급기준--%>
                <%
                    sb.delete(0, sb.length());
                    SL_L_MILGPAY_INITPAYBASICURRecord paybasicurRec  = null;
                    for(int i=0; i<ds.paybasicur.size(); i++){
                        paybasicurRec = (SL_L_MILGPAY_INITPAYBASICURRecord)ds.paybasicur.get(i);
                        String code = paybasicurRec.paybasicd;
                        String name = paybasicurRec.medinm + ":" + paybasicurRec.paybasinm;

                        sb.append("<option");
                        sb.append(" cmpycd=\""+paybasicurRec.cmpycd +"\"");
                        sb.append(" cmpynm=\""+paybasicurRec.cmpynm +"\"");
                        sb.append(" medicd=\""+paybasicurRec.medicd +"\"");
                        sb.append(" medinm=\""+paybasicurRec.medinm +"\"");
                        sb.append(" payclsfcd=\""+paybasicurRec.payclsfcd +"\"");
                        sb.append(" payclsfnm=\""+paybasicurRec.payclsfnm +"\"");
                        sb.append(" paybasicd=\""+paybasicurRec.paybasicd +"\"");
                        sb.append(" paybasinm=\""+paybasicurRec.paybasinm +"\"");
                        sb.append(" value=");
                        sb.append(code);
                        sb.append(">");
                        sb.append(name);
                        sb.append("</option>");
                    }
                  %>
                  <%=sb.toString()%>
			  </select>
			</td>
          </tr>
        <tr height="23">
          <td bgcolor="#dddddd" class="gray">포인트<font color="red">*</font></td>
          <td class="gray"><input name="pont" class="text_box" size="9"  tabindex="5" style="ime-mode:disabled;text-align:right" dataType="number" caption="포인트" comma notEmpty minValue="100"></td>
          <td bgcolor="#dddddd" class="gray">본사분담금</td>
          <td class="gray"><input name="hdqtallmamt" type="text" class="text_box" tabIndex="6" size="10" maxlength="10" style="ime-mode:disabled;text-align:right" dataType="number" comma caption="본사분담금" readonly>
            원</td>
          <td bgcolor="#dddddd" class="gray">지국분담금</td>
          <td class="gray">
            <input name="boallmamt" type="text" class="text_box" tabIndex="7" size="10" maxlength="10" style="ime-mode:disabled;text-align:right" dataType="number" comma caption="지국분담금" readonly>
            원 </td>
          <td bgcolor="#dddddd" class="gray">지급지국명</td>
          <td class="gray"><input type="hidden" name="bocd" ><input name="bonm" type="text" class="text_box" tabIndex="8" size="15" style="ime-mode:active" caption="지급지국명" notEmpty readonly value="<%=Util.getSessionParameterValue(request, "bonm", true)%>"></td>
        </tr>
        <tr height="23">
          <td bgcolor="#dddddd" class="gray">마감여부</td>
          <td colspan="7" class="gray">N</td>
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
    <td align="center" height="27"  bgcolor="#959595"><input name="image2" type="image" id="insert_btn" onclick="milg_insert();window.event.returnValue=false" src="/html/slcomm_img/bu_new01.gif" align="absmiddle" width="39" height="19">
      <input name="image2" type="image" id="update_btn" onclick="milg_update();window.event.returnValue=false" src="/html/slcomm_img/bu_edit01.gif" align="absmiddle" width="39" height="19" >
      <input name="image2" type="image" id="delete_btn" onclick="milg_delete();window.event.returnValue=false" src="/html/slcomm_img/bu_del.gif" align="absmiddle" width="39" height="19" >
      <input name="image2" type="image" id="close_btn" onclick="close_modal();window.event.returnValue=false;" src="/html/slcomm_img/bu_close.gif" align="absmiddle">
      <input name="image2" type="image" id="default_btn" onclick="milg_default();window.event.returnValue=false" src="/html/slcomm_img/bu_default.gif" align="absmiddle" width="50" height="19"></td>
  </tr>
</table>
<form name="milg_detail_view_form" method="post" style="display:none">
	<input type="hidden" name="rdr_no"      value="">  <!--독자번호               -->
	<input type="hidden" name="milgpaydt"   value="">  <!--마일리지지급일자       -->
    <input type-"hidden" name="milgpayno"   value="">  <!--마일리지지급번호       -->
</form>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="100%" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>