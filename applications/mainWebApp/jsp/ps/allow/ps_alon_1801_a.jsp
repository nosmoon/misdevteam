<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_alon_1801_a.jsp
* 기능     : 수당 월마감
* 작성일자 : 2004-03-12
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    // dataset 인스턴스 선언부분
	PS_L_DEPTEMP_ALON_PTCRDataSet ds = (PS_L_DEPTEMP_ALON_PTCRDataSet)request.getAttribute("ds");

    String searclosmm = Util.Uni2Ksc(Util.checkString(request.getParameter("closmm")));   //검색 마감년월
    String searbocd   = Util.Uni2Ksc(Util.checkString(request.getParameter("bocd")));     //검색 지국지사코드
    String seardeptcd = Util.Uni2Ksc(Util.checkString(request.getParameter("deptcd")));   //검색 부서코드
%>

<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">

<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
    //이벤트초기화
    function jsInit() {
        setEventHandler();
        //setEnterKeyEventHandler();
    }


    //마감작업 처리
    function alon_clos() {
        var lo_form1 = document.clos_form;

		//마감년월 체크
		if(!isDate(lo_form1.closmm.value+'01')) {
			alert('마감년월이 형식에 맞지 않거나 입력되지 않았습니다.\n마감년월은 필수입력 항목입니다.');
			lo_form1.closmm.focus();
			lo_form1.closmm.select();
			return;
		}

        //입력항목 전체 체크
		if(!validate(lo_form1)) return false;
		else{
			makeValue(lo_form1);
		}

        lo_form1.action = "/ps/allow/1806";
        lo_form1.target = "alonifrm";
        lo_form1.method = "post";
        lo_form1.submit();
    }


    //마감작업 취소처리
    function clos_cancel() {
        var lo_form1 = document.clos_form;

		//마감년월 체크
		if(!isDate(lo_form1.closmm.value+'01')) {
			alert('마감년월이 형식에 맞지 않거나 입력되지 않았습니다.\n마감년월은 필수입력 항목입니다.');
			lo_form1.closmm.focus();
			lo_form1.closmm.select();
			return;
		}

		if(!validate(lo_form1)) return false;
		else{
			makeValue(lo_form1);
		}

        lo_form1.action = "/ps/allow/1811";
        lo_form1.target = "alonifrm";
        lo_form1.method = "post";
        lo_form1.submit();
    }


    //마감내역 조회
    function clos_search() {
        var lo_form1 = document.search_form;

    	//event check.
    	if(window.event) window.event.returnValue = false;

		//마감년월 체크
		if(!isDate(lo_form1.closmm.value+'01')) {
			alert('마감년월이 형식에 맞지 않거나 입력되지 않았습니다.\n마감년월은 필수입력 항목입니다.');
			lo_form1.closmm.focus();
			lo_form1.closmm.select();
			return;
		}

        //입력항목 전체 체크
		if(!validate(lo_form1)) return false;
		else{
			makeValue(lo_form1);
		}

        lo_form1.action = "/ps/allow/1816";
        lo_form1.target = "_self";
        lo_form1.method = "post";
        lo_form1.submit();
    }


    //지사별 부서검색
    function bodept_search() {
        var lo_form1    = document.search_form;

        lo_form1.action = "/ps/common/1301";
        lo_form1.target = "alonifrm";
        lo_form1.method = "post";
        lo_form1.submit();
    }


    //마감내역 출력
    function clos_print() {
        var lo_form1 = document.search_form;

		//마감년월 체크
		if(!isDate(lo_form1.closmm.value+'01')) {
			alert('마감년월이 형식에 맞지 않거나 입력되지 않았습니다.\n마감년월은 필수입력 항목입니다.');
			lo_form1.closmm.focus();
			lo_form1.closmm.select();
			return;
		}
        //입력항목 전체 체크
		if(!validate(lo_form1)) return false;
		else{
			makeValue(lo_form1);
		}

        lo_form1.action = "/ps/allow/1821";
        lo_form1.target = "alonifrm";
        lo_form1.method = "post";
        lo_form1.submit();
    }


	// rowspan 되어 있는 2개의 로우에서 마우스 OUT 시 색깔 변경 /
	function change_row_color_out(obj){
	    for (i=0; i < document.all.list_zone.rows.length; i++) {
	    	if(document.all.list_zone.rows(i) == obj){
	            document.all.list_zone.rows(i).style.backgroundColor = "";
                //document.all.list_zone.rows(i).className = "out";
				if( (i%2) == 1 && document.all.list_zone.rows(i-1) != null){	    // 짝수이면 자신보다 1 더 작은 홀수 로우까지 변경
	                document.all.list_zone.rows(i-1).style.backgroundColor = "";
                    //document.all.list_zone.rows(i-1).className = "out";
				}else if( (i%2) == 0 && document.all.list_zone.rows(i+1) != null){	// 홀수이면 자신보다 1 더 큰 짝수 로우까지 변경
	                document.all.list_zone.rows(i+1).style.backgroundColor = "";
                    //document.all.list_zone.rows(i+1).className = "out";
				}
	        }
	    }
	}


	// rowspan 되어 있는 2개의 로우에서 마우스 IN 시 색깔 변경
	function change_row_color_in(obj){
	    for (i=0; i < document.all.list_zone.rows.length; i++) {
	    	if(document.all.list_zone.rows(i) == obj){
	            document.all.list_zone.rows(i).style.backgroundColor = "#EDFFF1";
                //document.all.list_zone.rows(i).className = "over";
				if( (i%2) == 1 && document.all.list_zone.rows(i-1) != null){	    // 짝수이면 자신보다 1 더 작은 홀수 로우까지 변경
	                document.all.list_zone.rows(i-1).style.backgroundColor = "#EDFFF1";
                    //document.all.list_zone.rows(i-1).className = "over";
				}else if( (i%2) == 0 && document.all.list_zone.rows(i+1) != null){	// 홀수이면 자신보다 1 더 큰 짝수 로우까지 변경
	                document.all.list_zone.rows(i+1).style.backgroundColor = "#EDFFF1";
                    //document.all.list_zone.rows(i+1).className = "over";
				}
	        }
	    }
	}
-->
</script>

</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsInit();clos_form.closmm.focus();">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle">수당
      &gt; </b>수당월마감</td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>
  <table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
    <tr>
      <td>
        <!--print title -->
        <table width="830" border="0" cellspacing="0" cellpadding="2">
          <tr>
            <td height="27" class="title" bgcolor="#EBE9DC"><b>수당월마감</b></td>
            <td height="27" class="title" width="130"  bgcolor="#EBE9DC" align="right">
              <img src="/html/comm_img/bu_day03.gif"    width="63" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="alon_clos();window.event.returnValue=false;">
              <img src="/html/comm_img/bu_cencle01.gif" width="63" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="clos_cancel();window.event.returnValue=false;">
            </td>
          </tr>
          <tr>
            <td height="3" colspan="2">
              <!--여백-->
            </td>
          </tr>
        </table>
        <!--list -->
        <table  cellspacing="0" width="830" cellpadding="2" border="0" bgcolor="#FFFFFF" class="gray">
          <form name="clos_form" method="post" action="" >
          <tr>
            <td width="80" bgcolor="#dddddd" class="gray" >마감년월  <font color="red"> *</font></td>
            <td class="gray" >
              <input type="text" name="closmm" size="6" maxlength="6"  class="text_box" caption="마감년월" dataType="number" notEmpty >
            </td>
            <td width="80" bgcolor="#dddddd" class="gray" >지사 <font color="red"> *</font></td>
            <td class="gray" >
              <select name="bocd" size="1" class="sel_all" caption="지사" notEmpty >
                <option value="" selected >선택</option>
<%
	for(int i=0; i<ds.intgbocdcur.size(); i++){
		PS_L_DEPTEMP_ALON_PTCRINTGBOCDCURRecord intgbocdcurRec = (PS_L_DEPTEMP_ALON_PTCRINTGBOCDCURRecord)ds.intgbocdcur.get(i);
%>
                <option value="<%= intgbocdcurRec.bocd%>" ><%= intgbocdcurRec.bonm%></option>
<%
	}
%>
              </select>
            </td>
            <td width="80" bgcolor="#dddddd" class="gray" >지급일자 <font color="red"> *</font></td>
            <td class="gray" >
              <input type="text" name="paydt" size="10" maxlength="10" class="text_box" caption="지급일자" dataType="date" notEmpty >
            </td>
          </tr>
          </form>
        </table>
      </td>
    </tr>
    <tr>
      <td height="10">
        <!------여백--- -->
      </td>
    </tr>
    <tr>
      <td>
        <!--타이틀 -->
        <table width="830" border="0" cellspacing="0" cellpadding="2">
          <tr>
            <td height="27" class="title" bgcolor="#EBE9DC"><b>월마감목록</b></td>
            <td height="27" class="title" width="50"  bgcolor="#EBE9DC" align="right">
              <img src="/html/comm_img/bu_print.gif" width="39" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="clos_print();window.event.returnValue=false;">
            </td>
          </tr>
        </table>
      </td>
    </tr>
    <tr>
      <td height="3">
        <!--여백 -->
      </td>
    </tr>
    <tr>
      <td width="80">
        <!--search-->
        <table width="830" border="0" cellspacing="0" cellpadding="2" class="title1" bgcolor="#EBE9DC">
          <form name="search_form" method="post" action="" onsubmit="clos_search();">
          <tr>
            <td width="80"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle"> 마감년월 <font color="red"> *</font> </td>
            <td width="120">
              <input type="text" name="closmm" size="6" maxlength="6" value="<%= searclosmm%>" class="text_box" caption="마감년월" dataType="number" notEmpty >
            </td>
            <td width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지사 <font color="red"> *</font></td>
            <td width="120">
              <select name="bocd" size="1" class="sel_all" caption="지사" notEmpty onchange="bodept_search();">
                <option value="" <% if(searbocd.equals("")) out.print("selected"); %>>선택</option>
<%
	for(int i=0; i<ds.intgbocdcur.size(); i++){
		PS_L_DEPTEMP_ALON_PTCRINTGBOCDCURRecord intgbocdcurRec = (PS_L_DEPTEMP_ALON_PTCRINTGBOCDCURRecord)ds.intgbocdcur.get(i);
%>
                <option value="<%= intgbocdcurRec.bocd%>" <% if(searbocd.equals(intgbocdcurRec.bocd)) out.print("selected"); %>><%= intgbocdcurRec.bonm%></option>
<%
	}
%>
              </select>
            </td>
            <td width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">부서</td>
            <td>
              <select name="deptcd" size="1" class="sel_all" style="width:80;" caption="부서" notEmpty id="bodept_sel" >
                <option value="%" <% if(seardeptcd.equals("%") || seardeptcd.equals("")) out.print("selected"); %>>전체</option>
<%--부서 콤보박스--%>
<%
	for(int i=0; i<ds.deptlistcur.size(); i++){
		PS_L_DEPTEMP_ALON_PTCRDEPTLISTCURRecord deptlistcurRec = (PS_L_DEPTEMP_ALON_PTCRDEPTLISTCURRecord)ds.deptlistcur.get(i);
%>
                <option value="<%= deptlistcurRec.deptcd%>" <% if(seardeptcd.equals(deptlistcurRec.deptcd)) out.print("selected"); %>><%= deptlistcurRec.deptnm%></option>
<%
	}
%>
              </select>
              <input type="image" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="clos_search();window.event.returnValue=false;">
            </td>
          </tr>
          </form>
        </table>
        <!--리스트 -->
        <table cellspacing="0" width="830" cellpadding="1" border="0" class="gray" bgcolor="#FFFFFF" id="list_zone">
          <tr>
            <td rowspan="2" class="gray" bgcolor="#dddddd" align="center" >부서명</td>
            <td width="80"  class="gray" bgcolor="#dddddd" align="center" >사원번호</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >지급금액</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >공제금액</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >실지급건수</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >지급신규</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >지급연결</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >공제신규</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >공제연결</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >가지급금</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >실적수당</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >반품수당</td>
          </tr>
          <tr>
            <td width="80"  class="gray" bgcolor="#dddddd" align="center" >사원명</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >직수금액</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >직수수당</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >성과수당</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >특별수당</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >직책수당</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >출근수당</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >캠페인수당</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >현금수당</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >전화수당</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >상품공제</td>
          </tr>
<%--마감내역--%>
<%
    //TOTAL 합 변수선언
    int  tot_paytot_amt          = 0;   //지급금액합
    int  tot_dductot_amt         = 0;   //공제금액합
    int  tot_payrealnoit         = 0;   //실지급건수합
    int  tot_paynewnoit          = 0;   //지급신규합
    int  tot_paylinknoit         = 0;   //지급연결합
    int  tot_dducnewnoit         = 0;   //공제신규합
    int  tot_dduclinknoit        = 0;   //공제연결합
    int  tot_advnalon_amt        = 0;   //가지급금합
    int  tot_dcl_amtamt          = 0;   //직수금액합
    int  tot_dcl_amtalontot_amt  = 0;   //직수수당합
    int  tot_rsltalontot_amt     = 0;   //성과수당합
    int  tot_spcalontot_amt      = 0;   //특별수당합
    int  tot_posialontot_amt     = 0;   //직책수당합
    int  tot_prsntalontot_amt    = 0;   //출근수당합
    int  tot_campalontot_amt     = 0;   //캠페인수당합
    int  tot_cashalon_amt        = 0;   //현금수당합
    int  tot_busnshow_amt        = 0;   //실적수당합
    int  tot_telfee_amt          = 0;   //전화수당합
    int  tot_retnalon_amt        = 0;   //반품수당합
    int  tot_gdsdducalon_amt     = 0;   //반품수당합

	for(int i=0; i<ds.empaloncur.size(); i++){
		PS_L_DEPTEMP_ALON_PTCREMPALONCURRecord empaloncurRec = (PS_L_DEPTEMP_ALON_PTCREMPALONCURRecord)ds.empaloncur.get(i);
%>
          <tr onmouseover="change_row_color_in(this);" onmouseout="change_row_color_out(this);" >
            <td rowspan="2" class="gray" align="center">&nbsp;<%= empaloncurRec.deptnm%>&nbsp;</td>
            <td width="80"  class="gray" align="center">&nbsp;<%= empaloncurRec.boemp_no%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.paytot_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.dductot_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.paynewnoit+empaloncurRec.paylinknoit-empaloncurRec.dducnewnoit-empaloncurRec.dduclinknoit)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.paynewnoit)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.paylinknoit)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.dducnewnoit)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.dduclinknoit)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.advnalon_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.busnshow_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.retnalonamt)%>&nbsp;</td>
          </tr>
          <tr onmouseover="change_row_color_in(this);" onmouseout="change_row_color_out(this);" >
            <td width="80"  class="gray" align="center">&nbsp;<%= empaloncurRec.flnm%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.dcl_amtamt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.dcl_amtalontot_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.rsltalontot_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.spcalontot_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.posialontot_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.prsntalontot_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.campalontot_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.cashalon_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.telfee_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.gdsdducalonamt)%>&nbsp;</td>
          </tr>
<%
        //TOTAL
        tot_paytot_amt          = tot_paytot_amt         + empaloncurRec.paytot_amt        ;   //지급금액합
        tot_dductot_amt         = tot_dductot_amt        + empaloncurRec.dductot_amt       ;   //공제금액합
        tot_paynewnoit          = tot_paynewnoit         + empaloncurRec.paynewnoit        ;   //지급신규합
        tot_paylinknoit         = tot_paylinknoit        + empaloncurRec.paylinknoit       ;   //지급연결합
        tot_dducnewnoit         = tot_dducnewnoit        + empaloncurRec.dducnewnoit       ;   //공제신규합
        tot_dduclinknoit        = tot_dduclinknoit       + empaloncurRec.dduclinknoit      ;   //공제연결합
        tot_advnalon_amt        = tot_advnalon_amt       + empaloncurRec.advnalon_amt      ;   //가지급금합
        tot_dcl_amtamt          = tot_dcl_amtamt         + empaloncurRec.dcl_amtamt        ;   //직수금액합
        tot_dcl_amtalontot_amt  = tot_dcl_amtalontot_amt + empaloncurRec.dcl_amtalontot_amt;   //직수수당합
        tot_rsltalontot_amt     = tot_rsltalontot_amt    + empaloncurRec.rsltalontot_amt   ;   //성과수당합
        tot_spcalontot_amt      = tot_spcalontot_amt     + empaloncurRec.spcalontot_amt    ;   //특별수당합
        tot_posialontot_amt     = tot_posialontot_amt    + empaloncurRec.posialontot_amt   ;   //직책수당합
        tot_prsntalontot_amt    = tot_prsntalontot_amt   + empaloncurRec.prsntalontot_amt  ;   //출근수당합
        tot_campalontot_amt     = tot_campalontot_amt    + empaloncurRec.campalontot_amt   ;   //캠페인수당합
        tot_cashalon_amt        = tot_cashalon_amt       + empaloncurRec.cashalon_amt      ;   //현금수당합
        tot_busnshow_amt        = tot_busnshow_amt       + empaloncurRec.busnshow_amt      ;   //실적수당합
        tot_telfee_amt          = tot_telfee_amt         + empaloncurRec.telfee_amt        ;   //전화수당합
        tot_retnalon_amt        = tot_retnalon_amt       + empaloncurRec.retnalonamt       ;   //반품수당합
        tot_gdsdducalon_amt     = tot_gdsdducalon_amt    + empaloncurRec.gdsdducalonamt    ;   //반품수당합
	}

    //실지급건수합
    tot_payrealnoit  = tot_paynewnoit + tot_paylinknoit - tot_dducnewnoit - tot_dduclinknoit;  //실지급건수합
%>

<%---------------------
	for(int i=0; i<showreccnt-ds.empaloncur.size(); i++){
%>
          <tr>
            <td rowspan="2" class="gray" align="center">&nbsp;</td>
            <td width="70"  class="gray" align="center">&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
          </tr>
          <tr>
            <td width="70"  class="gray" align="center">&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
          </tr>
<%
	}
--------------------------------------------------------------------------%>
          <tr onmouseover="change_row_color_in(this);" onmouseout="change_row_color_out(this);" >
            <td rowspan="2" colspan="2" class="gray" align="center"><font color="red">총 계</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_paytot_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_dductot_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_payrealnoit)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_paynewnoit)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_paylinknoit)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_dducnewnoit)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_dduclinknoit)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_advnalon_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_busnshow_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_retnalon_amt)%>&nbsp;</font></td>
          </tr>
          <tr onmouseover="change_row_color_in(this);" onmouseout="change_row_color_out(this);" >
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_dcl_amtamt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_dcl_amtalontot_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_rsltalontot_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_spcalontot_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_posialontot_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_prsntalontot_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_campalontot_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_cashalon_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_retnalon_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_gdsdducalon_amt)%>&nbsp;</font></td>
          </tr>
        </table>
      </td>
    </tr>
  </table>
</body>
<iframe name="alonifrm" width=100 height=0></iframe>
</html>
