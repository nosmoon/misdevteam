<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_commun_2600_a.jsp
* 기능 	 	 : 판매지국-통신실 아파트투입 현황조사 및 등록 초기화면
* 작성일자 	 : 2004-02-24
* 작성자 	 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ########## 개선 ###########
* 파일명 	 : sl_commun_2600_a.jsp
* 기능 	 	 : 판매국-지국경영-아파트투입율-아파트투입 현황조사 및 등록 초기화면
* 작성일자 	 : 2006-03-14
* 작성자 	 : 이혁
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_READER_BOINFO_INITDataSet ds = (SS_L_READER_BOINFO_INITDataSet)request.getAttribute("ds");
%>
<%
    boolean applySession = true;	// 세션 적용 여부
	//String jobcd = Util.getSessionParameterValue(request, "jobcd", false);	// 업무구분코드(판매국장,지원부장,영업부장은 목록 조회 옵션을 보여준다.)
%>

<html>
<head>

<script language="javascript">

    function jsInit(){
            setEventHandler();
            setEnterKeyEventHandler();
            setInputBackgroundColor();
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
    lo_form1.qsearch.value = "";
    lo_form1.action = "/ss/common/1190";
    lo_form1.target = "ifrm1";
    lo_form1.submit();
}



// 지국목록
function bolist_search(){

    var lo_form1 = document.boemp_search_form;
    var lo_form2 = document.apt_info_form;

    if(lo_form1.areacd.value == '') {
        var str = "<select id=bolist_id name=\"bolist\" onChange=\"detail_view();\" class=\"sel_all\">" +
                      "<option value='' selected>전체</option>" +
                  "</select>"
        document.all.bolist_id.outerHTML = str;

/*
        lo_form2.action = "/ss/brmgr/1815";
        lo_form2.target = "ifrm2";
        lo_form2.submit();
*/
        return;
    }

    // 부서/지역값을 "/ss/common/1116" 서블릿으로 보낸다
    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
    lo_form1.common_areacd.value = lo_form1.areacd.value;
    lo_form1.qsearch.value = "";
    lo_form1.action = "/ss/common/1116";
    lo_form1.target = "ifrm1";
    lo_form1.submit();

/*
    lo_form2.action = "/ss/brmgr/1815";
    lo_form2.target = "ifrm2";
    lo_form2.submit();
*/

}


// 판매지국 독자화면으로 이동
function detail_view(){
    var lo_form1 = document.apt_info_form;
    var lo_form2 = document.boemp_search_form;

    lo_form1.bocd.value = lo_form2.bolist.value;
    lo_form2.qsearch.value = "";

    aptlist_search();
/*
    if( lo_form2.bolist.value == "" ) {
      return;
    }

    lo_form1.bocd.value = lo_form2.bolist.value;
    lo_form1.rdr_no.value = "";
    lo_form1.find_type.value = "Y";

    lo_form2.qsearch.value = "";

    lo_form1.action = "/ss/brmgr/1815";
    lo_form1.target = "ifrm2";
    lo_form1.submit();
*/

}

// 지국목록
function bolist_init(){

    var lo_form1 = document.boemp_search_form;
    var lo_form2 = document.apt_info_form;

    var str = "<select id=bolist_id name=\"bolist\" onChange=\"detail_view();\" class=\"sel_all\">" +
                  "<option value='' selected>전체</option>" +
              "</select>"
    document.all.bolist_id.outerHTML = str;
/*
    lo_form2.action = "/ss/brmgr/1815";
    lo_form2.target = "ifrm2";
    lo_form2.submit();
*/
    return;
}


// 해당아파트의 동 목록을 불러온다
function dong_search() {
  var lo_form1 = document.boemp_search_form;
  var lo_form2 = document.apt_info_form;

  // 업무구분코드가 NULL일 경우
  if(lo_form1.aptlist.value == "") {
    var str = "<select id=dong_id name=\"dongno\" tabIndex=\"3\" class=\"sel_all\" onChange=\"apt_search()\">" +
              "<option value='' selected></option>" +
              "</select>"
    document.all.dong_id.outerHTML = str;
    return;
  }

  lo_form1.qsearch.value = "";
  lo_form2.bocd.value = lo_form1.bolist.value;
  lo_form2.addrcd.value = lo_form1.aptlist.value;
  lo_form2.action = "/ss/brmgr/1820";
  lo_form2.target = "ifrm1";
  lo_form2.submit();

}


function aptlist_search() {

  var lo_form1 = document.all.apt_info_form;
  var lo_form2 = document.all.boemp_search_form;

  lo_form2.qsearch.value = "";
  lo_form1.action = "/ss/brmgr/1853";
  lo_form1.target = "ifrm1";
  lo_form1.submit();

}


function apt_search() {

  var lo_form1 = document.all.boemp_search_form;
  var lo_form2 = document.all.apt_thrw_temp_form;

  lo_form2.bocd.value = lo_form1.bolist.value;
  lo_form2.addrcd.value = lo_form1.aptlist.value;
  lo_form2.dongno.value = lo_form1.dongno.value;
  lo_form2.invsgdt.value = "";
  lo_form2.invsgno.value = "";
  lo_form2.medicd.value = "";

  lo_form1.qsearch.value = lo_form2.bocd.value + lo_form2.addrcd.value + lo_form2.dongno.value;
  set_qsearch_value('1');

/*
  lo_form2.qsearch.value = "";
  lo_form1.action = "/ss/brmgr/1853";
  lo_form1.target = "ifrm1";
  lo_form1.submit();
*/

}


//조회
function list_search() {
  var lo_form1 = document.all.boemp_search_form;
  var lo_form2 = document.all.apt_thrw_temp_form;

  if( lo_form1.qsearch.value != "" ) {
    alert("quick search");
    return;
  }

  if( lo_form1.qsearch.value == "" ) {
    if( lo_form1.dongno.value == "" || lo_form1.aptlist.value == "" ) {
      alert( "인쇄할 아파트/동 또는 바로가기코드를 입력해주세요" );
      return;
    } else {
      alert("apt search");
      return;
    }
  }

  return;
}


// quick search 설정
function set_qsearch_value( stype ){
  var lo_form1 = document.all.boemp_search_form;
  var str_tmp = lo_form1.qsearch.value;
  var str_result = "";

  str_tmp = str_tmp.replace(/-/g,"");

  if( stype == 1 ) {
    str_result = str_tmp.substring(0,5) + "-" + str_tmp.substring(5,8) + "-" + str_tmp.substring(8);
  } else {
    str_result = str_tmp.replace(/-/g,"");
  }

  lo_form1.qsearch.value = str_result;

}


//바로가기 실행
function quick_search() {

  var lo_form1 = document.ifrm2;
  var lo_form2 = document.all.boemp_search_form;
  var str_tmp = lo_form2.qsearch.value;

  lo_form2.qsearch.value = str_tmp.replace(/-/g,"");

  alert( lo_form2.qsearch.value );

//  lo_form1.quick_search();


  return;
}


// 인쇄
function sal_print() {
    var delimiter = '##';

    var lo_form1 = document.apt_thrw_temp_form;
//    var lo_form1 = document.thrw_head_form;

        if(lo_form1.invsgdt.value=="") {
            alert("검색후 인쇄대상을 먼저 선택하세요.");
            return;
        }

        if(lo_form1.dongno.value=="") {
            alert("동을 선택하세요.");
            return;
        }

//    if(!check_all(lo_form1)) return;

//    lo_form1.action = jsGetCheckedValue(lo_form1,"2690");
    lo_form1.action = "1852";
    lo_form1.target = "ifrm1";
//    lo_form1.target = "ifrm_prt";
    lo_form1.submit();
}


</script>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=KSC5601">
<link rel="stylesheet" href="/html/comm_css/sal.css" type="text/css">
<script language="javascript" src="/html/comm_js/common.js"></script>
</head>

<body onload="jsInit();" bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25"  align="absmiddle" >투입율조사
      &gt; </b>투입율 조사지 인쇄</td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>


<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<form name="boemp_search_form" method="post" action="" >
	<input type="hidden" name="common_deptcd" value ="">                    <!-- 공통 부서코드 -->
    <input type="hidden" name="common_areacd" value ="">                    <!-- 공통 지역코드 -->
	<input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->
	<tr>
		<td bgcolor="#EBE9DC" height="32" width="50" class="sea_top"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">부서</td>
	    <td bgcolor="#EBE9DC" class="sea_top" width="100">
		<select name="deptcd" onChange="area_search();" class="sel_all">
<%
            //부서목록 표시
			writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true);
%>
	    </select>
        </td>
        <td bgcolor="#EBE9DC" width="38" class="sea_top"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지역</td>
        <td bgcolor="#EBE9DC" class="sea_top" width="80">
        <select name="areacd" size="1" onChange="bolist_search();" id="areacd_id" class="sel_all">  <!--지역코드, 지역명 목록-->
          <option value="">전체</option>
<%
			writeAreaOpt(session, out, true);
%>
        </select>
    </td>
    <td bgcolor="#EBE9DC" class="sea_top" width="38"><img src="/html/comm_img/ic_title.gif" width="12" height="7">지국</td>
    <td bgcolor="#EBE9DC" class="sea_top" width="110">
        <select name="bolist" size="1" id="bolist_id" onChange="detail_view();" class="sel_all">  <!--지국코드, 지국명 목록-->
          <option value="">전체</option>
        </select>
    </td>
    <td bgcolor="#EBE9DC" class="sea_top" width="63"><img src="/html/comm_img/ic_title.gif" width="12" height="7">바로가기</td>
    <td bgcolor="#EBE9DC" class="sea_top" width="*">
        <input name="qsearch" type="text" size="15" class="text_box" value="" onfocus="set_qsearch_value('0');this.select();" onblur="set_qsearch_value('1');">
    </td>
    <td bgcolor="#EBE9DC" class="sea_top" width="42" rowspan="2"><img src="/html/comm_img/bu_search01.gif" style="cursor:hand;" onclick="list_search();"></td>
    <td bgcolor="#EBE9DC" class="sea_top" width="40" rowspan="2"><img src="/html/slcomm_img/bu_print01.gif" style="cursor:hand;" onclick="sal_print();window.event.returnValue=false;"></td>
<%--    <td bgcolor="#EBE9DC" class="sea_top" width="*"><img src="/html/comm_img/bu_move01.gif" style="cursor:hand;" onclick="quick_search();"></td>--%>
  </tr>
  <tr>
  <td bgcolor="#EBE9DC" height="27"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">아파트</td>
  <td bgcolor="#EBE9DC" width="100" colspan="3">
    <select id="aptlist_id" name="aptlist" onChange="dong_search();" class="sel_all" style="width:197;">
          <option value="">전체</option>
    </select>
  </td>
  <td bgcolor="#EBE9DC"><img src="/html/comm_img/ic_title.gif" width="12" height="7">동</td>
  <td bgcolor="#EBE9DC">
    <select id="dong_id" name="dongno" class="sel_all" tabIndex="3" onChange="apt_search();">
      <option value="">전체</option>
    </select>
  </td>
  <td bgcolor="#EBE9DC" colspan="2"></td>
  </tr>
  <tr bgcolor="#927F5B">
    <td colspan="10" height="1">
			<!--line -->
    </td>
  </tr>
  <tr>
    <td height="3" colspan="10">
      <!--여백-->
    </td>
  </tr>
 </form>
</table>

<center>
<iframe name="ifrm2" src="#" width="830" height="540" frameborder="0" scrolling="auto"></iframe>
</center>

<iframe name="ifrm1" width="0" height="0"></iframe>
<!-- OZ parameter -->
<form name="apt_thrw_temp_form" method="post" style="display:none">
    <input type=hidden name=bocd     	 	value="01100">
    <input type=hidden name=addrcd 		 	value="058">
    <input type=hidden name=dongno		 	value="101">
    <input type=hidden name=invsgdt 		value="20060518">
    <input type=hidden name=invsgno		 	value="00001">
    <input type=hidden name=medicd	 		value="110##501##502##504##506##507">
</form>
<form name="apt_info_form" method="post" action="" >
<input type="hidden" name="bocd" value="">
<input type="hidden" name="addrcd" value="">
</form>
</body>

</html>
