<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<!--JSP COMMENT START-->
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_rdr_1801_s.jsp
* 기능 : 독자-독자조회
* 작성일자 : 2004-02-21
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    // 페이지당 보여줄 라인수
    String records_per_page = "15";
    int li_per = Integer.parseInt(records_per_page) ;
    //	dataset 인스턴스 선언부분
	PS_S_PUBL_RDRDataSet ds = (PS_S_PUBL_RDRDataSet)request.getAttribute("ds");

	String aplcdtfr = Util.Uni2Ksc(Util.checkString(request.getParameter("aplcdtfr"))); //신청기간(from)
	String aplcdtto = Util.Uni2Ksc(Util.checkString(request.getParameter("aplcdtto"))); //신청기간(to)


	//신청기간(from) 초기화 체크
	if (aplcdtfr.equals("")) {
		aplcdtfr  =  Util.addDate(Util.getDate(),-10);   //현재일자로부터 10일전
	}

	//신청기간(to) 초기화 체크
	if (aplcdtto.equals("")) {
		aplcdtto  =  Util.getDate();                     //현재일자
	}

%>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
</head>
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">

// 화면 open시 event설정
function init(){
    setEventHandler();
    //setEnterKeyEventHandler();
	setInputBackgroundColor();
}

// 독자 내역 조회처리
function list_search(curr_page_no){
    var lo_form1 = list_form;
    var rdrtel_type ="";
    var rdrtel_no1           =   trim(lo_form1.rdrtel_no1.value);        //전화번호(DDD)
    var rdrtel_no2           =   trim(lo_form1.rdrtel_no2.value);        //전화번호(국번)
    var rdrtel_no3           =   trim(lo_form1.rdrtel_no3.value);        //전화번호(번호)
    var ls_prn1              =   trim(lo_form1.prn1.value);              //주민번호1
    var ls_prn2              =   trim(lo_form1.prn2.value);              //주민번호2


    if(trim(lo_form1.rdrnm.value)      =='' && trim(lo_form1.prn1.value)      =='' && trim(lo_form1.prn2.value)         =='' &&
       trim(lo_form1.email.value)      =='' && trim(lo_form1.addr.value)      =='' && trim(lo_form1.rdr_no.value)       =='' &&
       trim(lo_form1.rdrtel_no1.value) =='' && trim(lo_form1.rdrtel_no2.value) =='' && trim(lo_form1.rdrtel_no3.value)  =='' ) {
         alert('아무 조건없이 조회할 수 없습니다.');
         lo_form1.rdrnm.focus();
         return false;
    }

    //밸류값을 check한다.
    lo_form1.curr_page_no.value = curr_page_no ;
    if(window.event) window.event.returnValue = false;
    if(!validate(lo_form1)){
    	return false;
    }

    //주민번호 체크
    if(ls_prn1.length > 0 || ls_prn2.length > 0) {
        if(!isValidJumin(ls_prn1+ls_prn2)) {
            alert('유효하지 않은 주민등록번호 입니다.');
            lo_form1.prn1.focus();
            lo_form1.prn1.select();
            return false;
        }
    }

    //전화번호 cehck
    if (lo_form1.tel_kubun.value == "RDRPTPH"){ //휴대폰 check
        rdrtel_type = "pcs1";
    }else{
        rdrtel_type = "phone1";
    }

    //청구인 전화번호,휴대폰번호 체크
    if((rdrtel_no1+rdrtel_no2+rdrtel_no3).length > 0) {
        if(rdrtel_type != "pcs1") {
            if(!isValidPhone(rdrtel_no1+'-'+rdrtel_no2+'-'+rdrtel_no3)) {
                alert('유효한 전화번호가 아닙니다.');
                lo_form1.rdrtel_no1.focus();
                lo_form1.rdrtel_no1.select();
                return false;
            }
        } else if(!isValidPcs(rdrtel_no1+'-'+rdrtel_no2+'-'+rdrtel_no3)) {
                alert('유효한 휴대폰번호가 아닙니다.');
                lo_form1.rdrtel_no1.focus();
                lo_form1.rdrtel_no1.select();
                return false;
        }
    }

    makeValue(list_form)
    lo_form1.action = "/ps/reader/1806";
    lo_form1.target = "iframe";
    lo_form1.submit();
	setEventHandler();
}

// navigator선택시 페이지 move처리
function page_move(curr_page_no) {
    var lo_form = list_form;

    if(!curr_page_no) {
        lo_form.curr_page_no.value = '1';
    } else {
        lo_form.curr_page_no.value = curr_page_no;
    }

    list_search(curr_page_no);
}

//구독자 상세내역을 조회
function jsRdrDtls(rdr_no,medicd,termsubsno) {
    var lo_form1    = document.list_form;

    lo_form1.srch_rdr_no.value      =  rdr_no;
    lo_form1.srch_medicd.value      =  medicd;
    lo_form1.srch_termsubsno.value  =  termsubsno;

    var ls_win      = "scrollbars=yes,toolbar=no,location=no,directories=no,width=870, height=600 resizable=no,mebar=no,left=140,top=50";
    window.open("about:blank" , "rdr_detail", ls_win);
    lo_form1.target = "rdr_detail";
    lo_form1.action = "/ps/reader/1416";
//    lo_form1.target = "_blank";
    lo_form1.method = "post";
    lo_form1.submit();
}

//화면출력
function print_list(){
    var lo_form1    = list_form;

    if(trim(lo_form1.rdrnm.value)      =='' && trim(lo_form1.prn1.value)      =='' && trim(lo_form1.prn2.value)         =='' &&
       trim(lo_form1.email.value)      =='' && trim(lo_form1.addr.value)      =='' && trim(lo_form1.rdr_no.value)       =='' &&
       trim(lo_form1.rdrtel_no1.value) =='' && trim(lo_form1.rdrtel_no2.value) =='' && trim(lo_form1.rdrtel_no3.value)  =='' ) {
         alert('아무 조건없이 조회할 수 없습니다.');
         lo_form1.rdrnm.focus();
         return false;
    }
    lo_form1.action = "/ps/reader/1811";
    lo_form1.target = "iframe";
    makeValue(lo_form1);
    lo_form1.submit();
}
</script>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="gray" onload="init()">
<form name="list_form" method="post" action="" onsubmit="list_search(1)"  >
<input name="curr_page_no" type="hidden" value ="1"><!--//현재페이지-->
<input name="records_per_page" type="hidden" value ="<%=records_per_page%>"> <!--//화면에 보여줄  ROW수-->
<input name="js_fn_nm" type="hidden" value ="page_move">
<input name="srch_rdr_no" type="hidden">
<input name="srch_medicd" type="hidden">
<input name="srch_termsubsno" type="hidden">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >독자
      &gt; </b> 독자조회</td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>
<!--검색시작-->
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
         <tr>
          <td width="80" class="sea_top" bgcolor="#EBE9DC" > <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">신청일자<font color="red">*</font>
          </td>
          <td class="sea_top" width="170" bgcolor="#EBE9DC">
            <input type="text" name="aplcdtfr" value="<%=Util.addMonth(Util.getDate(),-6)%>" size="10"  dataType="date" class="text_box" caption="신청일자(From)"  tabIndex="1" notEmpty >
            -
            <input type="text" name="aplcdtto" value="<%=Util.getDate()%>" size="10"  dataType="date" class="text_box" caption="신청일자(To)" tabIndex="2" notEmpty >
          </td>
          <td class="sea_top" width="60" bgcolor="#EBE9DC"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">신청매체
          </td>
          <td class="sea_top" width="170" bgcolor="#EBE9DC">
          <select name="medicd" class="sel_all"  tabIndex="3" >
                <option value="" >전체</option>
                <%=ds.medicdcurOptHtml("")%>
            </select>
          </td>
          <td class="sea_top" width="60" bgcolor="#EBE9DC"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">배정지사</td>
          <td class="sea_top" bgcolor="#EBE9DC">
              <select name="asinbocd" class="sel_all">
                <option value="" >전체</option>
                <%=ds.asinbocdcurOptHtml("")%>
              </select>
          </td>
          <td class="sea_top" bgcolor="#EBE9DC" rowspan="3" width="50" align="center">
          <input type="image" src="/html/comm_img/bu_search03.gif" width="39" height="35" border="0" align="absmiddle" style="cursor:hand" onclick="list_search(1);window.event.returnValue=false;" ></td>
        </tr>
        <tr>
          <td width="80" bgcolor="#EBE9DC" > <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">
           <select name="flnm_yn" size="1" style="width:60;" class="sel_all" >
<!--              <option value="" selected >선택</option>		-->
              <option value="Q" selected>수취인명</option>
              <option value="N" >독자명</option>
              <option value="A" >신청자명</option>
              <option value="S" >청구지명</option>
              <option value="C" >직장명</option>
            </select>
          </td>
          <td class="" bgcolor="#EBE9DC">
            <input type="text" name="rdrnm" size="10" class="text_box"  tabIndex="4">
          </td>
          <td width="70" bgcolor="#EBE9DC" >
          <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">주민번호
          </td>
          <td bgcolor="#EBE9DC">
              <input type="text" name="prn1" size="6" maxlength="6" class="text_box" dataType="number" caption="주민번호1">
              -
              <input type="text" name="prn2" size="7" maxlength="7" class="text_box" dataType="number" caption="주민번호2">
            </td>
          <td width="60" bgcolor="#EBE9DC" > <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">이메일
          </td>
          <td class="" bgcolor="#EBE9DC">
            <input type="text" name="email" size="25" class="text_box"  tabIndex="4" dataType="email">
          </td>

        </tr>
        <tr>
          <td width="80" bgcolor="#EBE9DC" >
          <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">전화번호
          </td>
          <td bgcolor="#EBE9DC">
              <select name="tel_kubun" class="sel_all">
                <option value="RDRTEL">자택</option>
                <option value="RDROFFITEL">직장</option>
                <option value="RDRPTPH">휴대폰</option>
              </select>
              <input type="text" name="rdrtel_no1" size="4" maxlength="4" class="text_box" dataType="number">
              -
              <input type="text" name="rdrtel_no2" size="4" maxlength="4" class="text_box" dataType="number">
              -
              <input type="text" name="rdrtel_no3" size="4" maxlength="4" class="text_box" dataType="number">
            </td>
          <td width="60" bgcolor="#EBE9DC" > <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">주소
          </td>
          <td class="" bgcolor="#EBE9DC">
            <input type="text" name="addr" size="17" class="text_box"  tabIndex="4">
          </td>
          <td width="60" bgcolor="#EBE9DC" > <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">독자번호
          </td>
          <td class="" bgcolor="#EBE9DC">
            <input type="text" name="rdr_no" size="9" maxlength="9" class="text_box"  tabIndex="5" dataType="number">
          </td>
        </tr>
        <tr bgcolor="#927F5B">
          <td colspan="7" height="1" >
            <!--line -->
          </td>
        </tr>
        <tr>
          <td colspan="7" height="3" >
            <!--여백 -->
          </td>
        </tr>
</table>
<!--검색끝-->
<table width="829" border="0" cellspacing="0" cellpadding="2" align="center">
  <tr>
    <td bgcolor="#EBE9DC" class="title" width="742" height="27"><B>독자목록</b></td>
    <td bgcolor="#EBE9DC" width="50" class="title" align="right" height="27">
      <img src="/html/comm_img/bu_print.gif" width="39" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="print_list();window.event.returnValue=false;">
    </td>
  </tr>
  <tr>
    <td height="3" colspan="2">
      <!--여백-->
    </td>
  </tr>
</table>
<!--list -->
<table width="830" border="0" align="center" cellpadding="1" cellspacing="0" class="gray" bgcolor="#FFFFFF" id="list_info">
     <tr align="center" bgcolor="#dddddd">
        <td class="gray"  width="100">독자명/수취명</td>
        <td class="gray"  width="90">전화번호</td>
        <td class="gray"  width="320">주소</td>
        <td class="gray"  width="80">구독매체</td>
        <td class="gray"  width="90">구독기간</td>
        <td class="gray"  width="100">지사</td>
	    <td class="gray" width="60">신규/연결</td>
<!--        <td class="gray" width="90">이메일</td> -->
      </tr>
<%
	for ( int i= 0 ; i < li_per ; i++ ) {
%>
  <tr>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray" align="center">&nbsp;</td>
    <td class="gray" align="center">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
<%
	}
%>

</table>
<!---button-->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="navi">
  <tr>
    <td align="center" height="2">
      <!--여백-->
    </td>
  </tr>
  <tr>
    <td colspan=5 align="center" bgcolor="#E8E8E8">
          <jsp:include page="/jsp/ps/comm_jsp/page_navigator.jsp">
          <jsp:param name = "curr_page_no" 		    value="0"/>
          <jsp:param name = "total_records" 		value="0"/>
          <jsp:param name = "js_fn_nm" 			    value=""/>
          <jsp:param name = "records_per_page" 	    value="15"/>
          <jsp:param name = "page_set_gubun" 		value="0"/>
          </jsp:include>
          <!--JSP PAGE END-->
     </td>
  </tr>
</table>
<br>
<br>
</form>
<!--HTML IFRAME START-->
<iframe name="iframe" width=100 height=0></iframe>
<!--HTML IFRAME END-->
</body>
</html>
