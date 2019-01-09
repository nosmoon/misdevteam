<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : sl_reader_1500_a
* 기능 :
* 작성일자 :
* 작성자 :
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
	SS_L_READER_BOINFO_INITDataSet ds = (SS_L_READER_BOINFO_INITDataSet)request.getAttribute("ds");
%>
<%
    applySession = true;	// 세션 적용 여부
	//		String jobcd = Util.getSessionParameterValue(request, "jobcd", false);	// 업무구분코드(판매국장,지원부장,영업부장은 목록 조회 옵션을 보여준다.)
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
//	document.boemp_search_form.bonm.focus();
}



// 지역 검색
function area_search(){
    var lo_form1 = document.boemp_search_form;

    if(lo_form1.deptcd.value == '') {

        // 지역목록 초기화
        var str = "<select id=areacd_id name=\"areacd\" onChange=\"bolist_search();\" class=\"sel_all\">" +
                      "<option value='' selected>전체</option>" +
                  "</select>"
        document.all.areacd_id.outerHTML = str;

        // 지국목록 초기화
        var str_bolist = "<select id=bolist_id name=\"bolist\" onChange=\"detail_view();\" class=\"sel_all\">" +
                             "<option value='' selected>전체</option>" +
                         "</select>"
        document.all.bolist_id.outerHTML = str_bolist;
        return;
    }

    // 부서코드값을 "/ss/common/1100" 서블릿으로 보낸다
    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
    lo_form1.action = "/ss/common/1190";
    lo_form1.target = "ifrm1";
    lo_form1.submit();
}


// 지국목록
function bolist_search(){

    var lo_form1 = document.boemp_search_form;
    var lo_form2 = document.rdrsrch_list_form;

    if(lo_form1.areacd.value == '') {
        var str = "<select id=bolist_id name=\"bolist\" onChange=\"detail_view();\" class=\"sel_all\">" +
                      "<option value='' selected>전체</option>" +
                  "</select>"
        document.all.bolist_id.outerHTML = str;

        lo_form2.action = "/ss/reader/1701";
        lo_form2.target = "ifrm2";
        lo_form2.submit();

        return;
    }

    // 부서/지역값을 "/ss/common/1116" 서블릿으로 보낸다
    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
    lo_form1.common_areacd.value = lo_form1.areacd.value;
    lo_form1.action = "/ss/common/1116";
    lo_form1.target = "ifrm1";
    lo_form1.submit();

    lo_form2.action = "/ss/reader/1701";
    lo_form2.target = "ifrm2";
    lo_form2.submit();

}

// 지국목록
function bolist_init(){

    var lo_form1 = document.boemp_search_form;
    var lo_form2 = document.rdrsrch_list_form;

    var str = "<select id=bolist_id name=\"bolist\" onChange=\"detail_view();\" class=\"sel_all\">" +
                  "<option value='' selected>전체</option>" +
              "</select>"
    document.all.bolist_id.outerHTML = str;

    lo_form2.action = "/ss/reader/1701";
    lo_form2.target = "ifrm2";
    lo_form2.submit();

    return;

}


// 판매지국 독자화면으로 이동
function detail_view(){
    var lo_form1 = document.rdrsrch_list_form;
    var lo_form2 = document.boemp_search_form;

    if( lo_form2.bolist.value == "" ) {
      lo_form1.action = "/ss/reader/1701";
      lo_form1.target = "ifrm2";
      lo_form1.submit();
      return;
    }

    lo_form1.bocd.value = lo_form2.bolist.value;
    lo_form1.rdr_no.value = "";
    lo_form1.find_type.value = "Y";

    // 판매지국 독자화면으로 새창을 띄운다.
    lo_form1.action = "/ss/slreader/1100";
    lo_form1.target = "ifrm2";
    lo_form1.submit();

    /*
    if( ifrm2.gs_rdr_no != null && ifrm2.gs_rdr_no != "" && ifrm2.gs_rdr_no != "undefined" ) {
      if( ifrm2.gs_rdr_no.closed == false ) {
        ifrm2.gs_rdr_no.close();
      }
    }
    */
}



//-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25"  align="absmiddle" >독자현황
      &gt; </b>독자정보조회</td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>

<!--검색시작-->

<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<form name="boemp_search_form" method="post" action="" >
<!--	<input type="hidden" name="pageno" value ="1">-->				<!-- 현재 페이지 번호 -->
<!--	<input type="hidden" name="pagesize" value ="0">-->	<!-- 한 화면당 리스트 항목 수 -->
<!--	<input type="hidden" name="js_fn_nm" value ="page_move">-->
	<input type="hidden" name="common_deptcd" value ="">                    <!-- 공통 부서코드 -->
    <input type="hidden" name="common_areacd" value ="">                    <!-- 공통 지역코드 -->
<!--	<input type="hidden" name="bocd" value ="">  -->                       	<!-- 지국지사코드 -->
	<input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->
	<tr>
		<td bgcolor="#EBE9DC" width="38" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">부서</td>
	    <td bgcolor="#EBE9DC" class="title" width="100">
		<select name="deptcd" onChange="area_search();" class="sel_all">
<%
            //부서목록 표시
			writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true);
%>
	    </select>
        </td>
        <td bgcolor="#EBE9DC" width="38" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지역</td>
        <td bgcolor="#EBE9DC" class="title" width="80">
        <select name="areacd" size="1" onChange="bolist_search();" id="areacd_id" class="sel_all">  <!--지역코드, 지역명 목록-->
          <option value="">전체</option>
<%
			writeAreaOpt(session, out, true);
%>
        </select>
    </td>
    <td bgcolor="#EBE9DC" class="title" width="38""><img src="/html/comm_img/ic_title.gif" width="12" height="7">지국</td>
    <td bgcolor="#EBE9DC" class="title" width="150">
        <select name="bolist" size="1" id="bolist_id" onChange="detail_view();" class="sel_all">  <!--지국코드, 지국명 목록-->
          <option value="">전체</option>
<%
//			writeBolistOpt(session, out, true);
%>
        </select>
    </td>

<%--판매국장,지원부장은 부서,지역,지국별 선택가능--%>
<%--if("110".equals(jobcd) || "120".equals(jobcd)){--%>
<%--
    <td bgcolor="#EBE9DC" class="title" width="200">
		<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">조회구분
		&nbsp;
		<select name="viewflag" size="1" class="sel_all">
			<option value="1" selected>부서별</option>
			<option value="2">지역별</option>
			<option value="3">지국별</option>
		</select>
	</td>
--%>
<%--영업부장은 지역,지국별 선택가능--%>
<%--}else if("310".equals(jobcd)){--%>
<%--
    <td bgcolor="#EBE9DC" class="title" width="200">
		<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">조회구분
		&nbsp;
		<select name="viewflag" size="1" class="sel_all">
			<option value="2" selected>지역별</option>
			<option value="3">지국별</option>
		</select>
	</td>
--%>
<%--}--%>

    <td bgcolor="#EBE9DC" class="title" align="right">&nbsp;
      <!--<input type="image" id="search_id" border="0" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="right" onclick="window.event.returnValue=false;">-->
    </td>
  </tr>
  <tr>
    <td height="3" colspan="6">
      <!--여백-->
    </td>
  </tr>
 </form>
</table>
<!--검색끝-->
<!--list start-->
<!--list end-->
<!--HTML IFRAME START------------------------------------------------------------------------------->
<center>
<iframe name="ifrm2" src="/ss/reader/1701" width="860" height="550" frameborder="0" scrolling="no"></iframe>
</center>
<iframe name="ifrm1" width="0" height="0"></iframe>
<form name="rdrsrch_list_form" method="post" action="" >
<input type="hidden" name="bocd" value="">
<input type="hidden" name="rdr_no" value="">
<input type="hidden" name="find_type" value="">
</form>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
