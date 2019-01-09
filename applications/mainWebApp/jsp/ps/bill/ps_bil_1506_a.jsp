<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 :  ps_bil_1506_a.jsp
* 기능 	 	 : 자동이체가입신청(카드)
* 작성일자 	 : 2006-04-19
* 작성자 	 : 전현표
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    //	datacct 인스턴스 선언부분
    PS_L_SHFTAPLC_INITDataSet ds = (PS_L_SHFTAPLC_INITDataSet)request.getAttribute("ds");  // request datacct
%>

<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
	//페이지초기화시 버튼설정및 EventHandler호출
	function jsInit(){

		setEventHandler();
		setEnterKeyEventHandler();

		var lo_form = document.shftaplc_detail_form;
		lo_form.rdrnm.focus();

	}

	// 자동이체가입신청 등록,수정란 clear(취소)
	function shftaplc_cancel()
	{
		var lo_form = document.shftaplc_detail_form;	// 상세정보 폼
		for( var i =0; i< lo_form.length; i++){
			lo_form(i).value = "";
		}
		lo_form.accflag.value = 'N';		// 작업구분(신규)
		lo_form.shftclsf.value = '130';		// 이체구분(카드)
	}

    //검색버튼에 의한 우편번호 검색(팝업)
    function zip_search() {
        var lo_form1  = document.shftaplc_detail_form;
        var ls_name   = "";

        //수취인 우편번호 입력시
        lo_form1.dlvaddr.value         = "";
        lo_form1.dlvaddrdtls.value     = "";
        ls_name   = trim(lo_form1.dlvzip1.value)+trim(lo_form1.dlvzip2.value);

        var ls_uri    = "/ps/common/1101";
        var ls_return = jsNewModalWinNoS(ls_uri, ls_name, "430", "410");

        var la_str;
        var la_zip;

        if(ls_return.indexOf("\n") != -1) {
          la_str = ls_return.split("\n");
          la_zip = la_str[0].split("-");

          lo_form1.dlvzip1.value  = la_zip[0];
          lo_form1.dlvzip2.value  = la_zip[1];
          lo_form1.dlvaddr.value  = la_str[1];

          lo_form1.dlvaddrdtls.value  = "";
          lo_form1.dlvaddrdtls.focus();
        }

        return;
    }

	// 자동이체가입신청 등록
	function exec_append(){

		var lo_form = document.shftaplc_detail_form;

		lo_form.accflag.value = 'N';		// 작업구분(신규)
		lo_form.shftclsf.value = '130';		// 이체구분(카드)

		lo_form.action = "/ps/bill/1516";
		lo_form.target = "ifrm";
		lo_form.method = "post";
		check_all(lo_form);
	}

	//엔터키에 의한 우편번호 검색
    function zip_enter_search(zipseq){
        var e = window.event;
        if(!e || e.keyCode != "13") return;

        var lo_form1  = document.shftaplc_detail_form;
        var ls_zip    = "";

        lo_form1.dlvaddr.value         = "";
        lo_form1.dlvaddrdtls.value     = "";
        ls_zip = lo_form1.dlvzip1.value + lo_form1.dlvzip2.value;

		//우편번호 패턴이 아니라면 zip_search 함수를 call 한다.
        if(!validate_zip(ls_zip)){
            zip_search(zipseq);
            return;
        }

        var lo_form2 = document.zip_search_form;

        lo_form2.zip.value    = ls_zip;
        lo_form2.zipseq.value = zipseq;

        lo_form2.action = "/ps/common/1111";
        lo_form2.target = "ifrm";
        lo_form2.method = "post";
        lo_form2.submit();
    }

	// 우편번호 유효성 검증
    function validate_zip(s_zip){
		if(trim(s_zip) == "") return false;
        var format = /^(\d{3})(-{0,1})(\d{3})$/;
        return isValidFormat(s_zip, format);
    }

    //엔터키에 의한 우편번호 검색 후 검색 결과가 한건일때, 결과를 필드에 셋팅
    function set_zip_search_result() {
        var lo_form1        = document.shftaplc_detail_form;          // 현재 화면내 독자상세폼
        var lo_form2        = hmifrm.document.zip_detail_form; // ifrm 내 조회된 결과 form

        lo_form1.dlvzip1.value  = lo_form2.zip1.value;
        lo_form1.dlvzip2.value  = lo_form2.zip2.value;
        lo_form1.dlvaddr.value  = lo_form2.addr.value;

        lo_form1.dlvaddrdtls.value  = "";
        lo_form1.dlvaddrdtls.focus();
    }

	// submit시 호출
	function check_all(form){
        if(!validate(form)) return false;
        else{
            makeValue(form);
            form.submit();
        }
    }

    // 독자 검색
    function rdr_search() {
        var lo_form1 = document.shftaplc_detail_form;
        var rdrnm =  lo_form1.rdrnm.value ;
        var rdrtel = lo_form1.rdrtel1.value ;
        var rdrte2 = lo_form1.rdrtel2.value ;
        var rdrte3 = lo_form1.rdrtel3.value ;

        var rdrptph1 = lo_form1.rdrptph_no1.value;
        var rdrptph2 = lo_form1.rdrptph_no2.value;
        var rdrptph3 = lo_form1.rdrptph_no3.value;

        var lo_chk = "";
        lo_chk = ""
        if (rdrnm == "") {
            alert("독자명을 입력하세요!");
            lo_form1.rdrnm.focus();
            return;
		}
	    makeValue(lo_form1);

//        var ls_win = "scrollbars=yes,toolbar=no,location=no,directories=no,width=700, height=300 resizable=no,mebar=no,left=200,top=100";
//        window.open("about:blank" , "acq_dtls", ls_win);
        lo_form1.action = "/ps/bill/1521";
        lo_form1.target = "ifrm";
        lo_form1.submit();
	}

	// 체크박스를 클릭해서 모든 체크박스를 선택 또는 선택해제한다.
	function select_all(bool) {
		var lo_form1;
		lo_form1 = document.shftaplc_detail_form;

		if(lo_form1.chk==null) {					// 선택된 건이 없는 경우
			return;
		} else if(lo_form1.chk.type=="checkbox") {	// 한건인 경우
			if(lo_form1.chk.disabled==false) {
			lo_form1.chk.checked = bool;
			}
		} else {									// 여러건인 경우
			for(var i=0; i<lo_form1.chk.length; i++) {
				if(lo_form1.chk[i].disabled==false) {
					lo_form1.chk[i].checked = bool;
				}
			}
		}
	} // select_all


	// 체크박스 선택시 chkhead 의 체크 유무
	function checkOne()
	{
		var len  = document.shftaplc_detail_form.chk.length;
		var check = true;
		for (var i=0; i<len; i++){
			if((!shftaplc_detail_form.chk[i].checked) && (!shftaplc_detail_form.chk[i].disabled)) {
				check = false;
			}
		}
		//alert("check===== "+check);
		document.shftaplc_detail_form.chkhead.checked = check;
		window.event.cancelBubble=true;
	}

	// 자동이체가입신청 등록
	function shftaplc_append()
	{
		var lo_form = document.shftaplc_detail_form;
        var lo_form2 = document.card_validation_form;

		if(lo_form.total_records.value=="0") {
			alert("저장할 목록이 없습니다");
			return false;
		}

	    if(lo_form.vdtyprd_y.value < "<%=Util.getYear()%>"){
	    	alert("유효기간이 올바르지 않습니다.");
	    	return;
	    }

	    if(lo_form.vdtyprd_m.value <= "<%=Util.getMonth()%>" && lo_form.vdtyprd_y.value == "<%=Util.getYear()%>"){
	    	alert("유효기간이 올바르지 않습니다.");
	    	return;
	    }

		lo_form.cardno.value = lo_form.cardno1.value + lo_form.cardno2.value + lo_form.cardno3.value + lo_form.cardno4.value;
		lo_form.vdtyprd.value = lo_form.vdtyprd_y.value + lo_form.vdtyprd_m.value;
        lo_form2.cardno.value = lo_form.cardno.value;
        lo_form2.cardcmpycd.value = lo_form.cardcmpycd.value;  //2007.01.22 카드사종류 이혁 추가

        // 주민번호는 뒤 7자리, 사업자번호는 전부 다.
        if(lo_form.prn.value.length > 10) {	// 주민번호
            lo_form2.jumin.value = lo_form.prn.value.substr(7);	// 뒤 7자리
        } else {	// 사업자번호
            lo_form2.jumin.value = lo_form.prn.value;
        }

        lo_form2.expiry.value = lo_form.vdtyprd_y.value.substr(2) + lo_form.vdtyprd_m.value;
        lo_form2.accflag.value = "N";

		var bocd="";
		var dlvzip="";
		var dlvaddr="";
		var dlvaddrdtls="";
        var rdrprn="";

        var rdr_no="";
        var medicd="";
        var termsubsno="";
        var pymtno_2="";

		for(var i = 0; i < lo_form.chk.length; i++){
			if(lo_form.chk[i].checked){
                if(!validateObj(lo_form, lo_form.pymtno_2[i])) return false;

                makeValueObj(lo_form, lo_form.pymtno_2[i]);

				var temp=lo_form.chk[i].value;
				var ss = temp.split("##");
				if(ss.length!=8) {
					alert("선택시 문제가 발생했습니다.");
				    return false;
				} else {
					bocd += "##"+ss[0];
					dlvzip += "##"+ss[1];
					dlvaddr += "##" +ss[2];
					dlvaddrdtls += "##"+ss[3];
                    rdrprn += "##"+ss[4];
                    rdr_no += "##"+ss[5];
                    medicd += "##"+ss[6];
                    termsubsno += "##"+ss[7];
                    pymtno_2 += "##" + lo_form.pymtno_2[i].value;
				}
			}
		}
		if(rdr_no != ""){
            bocd = bocd.substr(2);
            dlvzip = dlvzip.substr(2);
            dlvaddr = dlvaddr.substr(2);
            dlvaddrdtls = dlvaddrdtls.substr(2);
            rdrprn = rdrprn.substr(2);

			rdr_no = rdr_no.substr(2);
			medicd = medicd.substr(2);
			termsubsno = termsubsno.substr(2);
			pymtno_2 = pymtno_2.substr(2);
		} else {
			alert("신청할 목록을 체크하십시요");
			return false;
		}

        lo_form.bocd.value=bocd;
        lo_form.dlvzip.value=dlvzip;
        lo_form.dlvaddr.value=dlvaddr;
        lo_form.dlvaddrdtls.value=dlvaddrdtls;
        lo_form.rdrprn.value=rdrprn;
		lo_form.rdr_no.value=rdr_no;
		lo_form.medicd.value=medicd;
		lo_form.termsubsno.value=termsubsno;
        lo_form.pymtno_2.value=pymtno_2;

	    if(!validate(lo_form)) return false;
	    if(!validate(lo_form2)) return false;

		var check = "";
		check = confirm("자동이체를 등록하시겠습니까?");

		if (!check) {
			return false;
		}

		makeValue(lo_form2);

        lo_form2.method = "post";
        lo_form2.target = "ifrm";
        lo_form2.action = "/ps/bill/1511";

        lo_form2.submit();
	}
-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsInit()">

<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >수금
      &gt; </b>카드자동이체 &gt; 신청</td>
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

<!--구독자 정보-->
<table width="830" border="0"  cellpadding="1" cellspacing="0" align="center">
<tr>
	<td height="10">
	<!--여백-->
	</td>
</tr>
	<td  height="25" bgcolor="#EBE9DC" class="title" width="500">구독자 정보( <font color="red">◈ 반드시 독자검색을 통해 등록하세요.</font> )</td>
	<td align="right"  bgcolor="#EBE9DC" height="25" class="title">
		<input type="image" src="/html/comm_img/bu_default.gif" width="50" height="19" align="absmiddle" border="0" onclick="shftaplc_cancel()" border="0">
		<input type="image" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" onclick="shftaplc_append()" border="0">
	</td>
<tr>
	<td height="3">
	<!--여백-->
	</td>
</tr>
</table>

<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF">
<form name="shftaplc_detail_form" method="post" action="" >
	<input type="hidden" name="accflag"     value="N">		<!--작업구분(신규)-->
	<input type="hidden" name="shftclsf"    value="130">	<!--이체구분(카드)-->
	<input type="hidden" name="bocd"        value="">			<!--지국지사코드-->
    <input type="hidden" name="dlvzip"      value="" >      <!--독자정보에 저장될 우편번호-->
    <input type="hidden" name="dlvaddr"     value="" >      <!--독자정보에 저장될 주소-->
    <input type="hidden" name="dlvaddrdtls" value="" >      <!--독자정보에 저장될 상세주소-->
    <input type="hidden" name="rdrprn"      value="" ><!--독자정보에 저장될 주민번호 입력-->

    <input type="hidden" name="cardno"      value="">		<!--카드번호-->
    <input type="hidden" name="vdtyprd"     value="">		<!--유효기간-->

    <input type="hidden" name="rdr_no"      value="" >      <!--독자정보에 저장될 독자번호-->
    <input type="hidden" name="medicd"      value="" >      <!--독자정보에 저장될 매체코드-->
    <input type="hidden" name="termsubsno"  value="" >      <!--독자정보에 저장될 정기구독번호-->
    <input type="hidden" name="pymtno_2"    value="" >      <!--독자정보에 저장될 납부자번호-->

	<tr >
		<td height="25" width="100" bgcolor="#EBE9DC" class="gray">구독자(회사)명<font color="red">*</font></td>
		<td class="gray" width="200" >
			<input type="text" name="rdrnm" size="15" class="text_box" caption="구독자(회사)명" notEmpty style="ime-mode:active;" onblur="this.form.pymtnm.value=this.value">
		</td>
        <td height="25" width="80" bgcolor="#EBE9DC" class="gray">전화번호<font color="blue">*</font></td>
        <td class="gray"  width="150">
		<input type="text" name="rdrtel1" size="4" maxlength="4" class="text_box" caption="전화번호" dataType=integer notEmpty onblur="this.form.pymttel1.value=this.value">
		-
		<input type="text" name="rdrtel2" size="4" maxlength="4" class="text_box" caption="전화번호" dataType=integer notEmpty onblur="this.form.pymttel2.value=this.value">
		-
		<input type="text" name="rdrtel3" size="4" maxlength="4" class="text_box" caption="전화번호" dataType=integer notEmpty onblur="this.form.pymttel3.value=this.value">
	</td>
        <td width="80" bgcolor="#EBE9DC" class="gray"> 휴대폰번호<font color="blue">*</font></td>
        <td class="gray" width="220">
            <input name="rdrptph_no1" type="text" value="" size="4" class="text_box"> -
            <input name="rdrptph_no2" type="text" value="" size="4" class="text_box"> -
            <input name="rdrptph_no3" type="text" value="" size="4" class="text_box">
			<input type="image" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle" style="cursor:hand;" onclick="rdr_search();window.event.returnValue=false;">
        </td>
	</tr>
<!--
	<tr>
          <td width="90" bgcolor="#EBE9DC" class="gray" >소속지사<font color="red">*</font></td>
          <td class="gray"  width="200">
          <input type="text" name="bocdnm" value="" size="20" class="readonly_box" style="text-align:center" readonly caption="소속지사" notEmpty>
          </td>

          <td width="80" bgcolor="#EBE9DC" class="gray" >구독매체<font color="red">*</font></td>
          <td class="gray"  width="150">
          <input type="text" name="medinm" value="" class="readonly_box" style="text-align:center" readonly caption="구독매체" notEmpty>
          </td>

          <td width="80" bgcolor="#EBE9DC" class="gray" >독자번호<font color="red">*</font></td>
          <td class="gray"  width="250">
          <input type="text" name="rdr_no" value="" size="9" class="readonly_box" style="text-align:center" readonly notEmpty> -
          <input type="text" name="medicd" value="" size="3" class="readonly_box" style="text-align:center" readonly notEmpty> -
          <input type="text" name="termsubsno" value="" size="4" class="readonly_box" style="text-align:center" readonly notEmpty>
		</td>
	</tr>
	<tr >
      <td width="80" bgcolor="#EBE9DC" class="gray" >구독기간<font color="red">*</font></td>
      <td class="gray"  width="200">
      <input type="text" name="subsfrser_no" size="10" value="" class="readonly_box" style="text-align:center" readonly caption="구독기간" notEmpty> -
      <input type="text" name="substoser_no" size="10" value="" class="readonly_box" style="text-align:center" readonly caption="구독기간" notEmpty>
		</td>

      <td width="90" bgcolor="#EBE9DC" class="gray" >주소<font color="red">*</font></td>
      <td class="gray" colspan="3">
      <input type="text" size="70" name="addr_all" value="" class="readonly_box" style="text-align:left" readonly caption="주소" notEmpty>
		</td>
	</tr>
	<tr id="pymt_num_id1">
		<td height="25" width="150" bgcolor="#EBE9DC" class="gray">납부자번호<font color="blue">*</font></td>
		<td class="gray" >
			<input type="text" name="pymtno_2" size="17" maxlength="17" class="text_box" caption="납부자번호" dataType=integer len="17" >
		</td>
	</tr>
-->
</table>

<table id="pymt_num_id2" width="830" border="0" cellspacing="0" cellpadding="2">
	<tr>
		<td> ◈ 납부자번호는 지로영수증에 있는 17자리 번호입니다</td>
	</tr>
</table>
<!--구독자 정보끝-->


<!--카드정보 -->
<table width="830" border="0"  cellpadding="1" cellspacing="0" align="center">
<tr>
	<td height="10">
	<!--여백-->
	</td>
</tr>
<tr>
	<td  height="25" bgcolor="#EBE9DC" class="title">카드 정보</td>
	</td>
</tr>
<tr>
	<td height="3">
	<!--여백-->
	</td>
</tr>
</table>

<table border="0" cellspacing="0" cellpadding="2"  width="830" class="gray">
	<tr >
		<td height="25"   width="150" bgcolor="#EBE9DC" class="gray">가입자명<font color="red">*</font></td>
		<td class="gray" >
			<input type="text" name="pymtnm" size="15" class="text_box" style="ime-mode:active;" caption="가입자명" notEmpty>
		</td>
		<td class="gray" bgcolor="#EBE9DC" width="120" >가입자 전화번호<font color="red">*</font></td>
		<td class="gray" >
			<input type="text" name="pymttel1" size="4" maxlength="4" class="text_box" caption="가입자전화번호" dataType=integer notEmpty>
			-
			<input type="text" name="pymttel2" size="4" maxlength="4" class="text_box" caption="가입자전화번호" dataType=integer notEmpty>
			-
			<input type="text" name="pymttel3" size="4" maxlength="4" class="text_box" caption="가입자전화번호" dataType=integer notEmpty>
		</td>
	</tr>
	<tr >
		<td height="25" width="150" bgcolor="#EBE9DC" class="gray">카드종류<font color="red">*</font></td>
		<td class="gray" colspan="3" >
			<select name="cardcmpycd" class="sel_all">
				<%= ds.curcardcdOptHtml("--")%>
			</select>
		</td>
	</tr>
	<tr >
		<td height="25" width="150" bgcolor="#EBE9DC" class="gray">카드번호<font color="red">*</font></td>
		<td class="gray" colspan="3" >
			<input type="text" name="cardno1" size="4" maxlength="4" class="text_box" caption="카드번호" dataType=integer notEmpty>
			-
			<input type="text" name="cardno2" size="4" maxlength="4" class="text_box" caption="카드번호" dataType=integer notEmpty>
			-
			<input type="text" name="cardno3" size="4" maxlength="4" class="text_box" caption="카드번호" dataType=integer notEmpty>
			-
			<input type="text" name="cardno4" size="4" maxlength="4" class="text_box" caption="카드번호" dataType=integer notEmpty>
		</td>
	</tr>
	<tr >
		<td height="25" width="150" bgcolor="#EBE9DC" class="gray">유효기간<font color="red">*</font></td>
		<td class="gray" colspan="3" >
			<input type="text" name="vdtyprd_y" size="4" maxlength="4" class="text_box" caption="유효기간" dataType=integer notEmpty>
			년
			<input type="text" name="vdtyprd_m" size="2" maxlength="2" class="text_box" caption="유효기간" dataType=integer notEmpty>
			월
		</td>
	</tr>
	<tr >
		<td height="25" width="150" bgcolor="#EBE9DC" class="gray">주민등록(사업자)번호<font color="red">*</font></td>
		<td class="gray" colspan="3" >
			<input type="text" name="prn" size="30" maxlength="14" class="text_box" value="" caption="주민등록(사업자)번호" dataType="juffice" notEmpty>
		</td>
	</tr>
	<tr >
		<td height="25" width="150" bgcolor="#EBE9DC" class="gray">이체시작월<font color="red">*</font></td>
		<td class="gray" colspan="3" >
		<!--신청적용년월-->
		<%
		    Calendar calendar = new GregorianCalendar(Locale.KOREA);
		    calendar.add(Calendar.MONTH, 1);
		%>
		    <select name="aplyyymm" class="sel_all" id="aplyyymm_id" style="width:90" notEmpty caption="이체시작월" align="absmiddle">
		        <option value="" selected>선택</option>
		        <%
		            String tempStr = "";
		            //calendar.add(Calendar.MONTH, -1);

                    int today = Integer.parseInt(Util.getDate());
                    int basiday = Integer.parseInt(Util.getYyyyMm()+"11");

                    if(today < basiday ) {
                      calendar.add(Calendar.MONTH, -1);
                    }

		            for(int i=0; i<12; i++) {
		                if(calendar.get(Calendar.MONTH)+1 < 10) {
		                    tempStr = "0" + String.valueOf(calendar.get(Calendar.MONTH)+1);
		                } else {
		                    tempStr = String.valueOf(calendar.get(Calendar.MONTH)+1);
		                }
		        %>
		        <option value="<%=String.valueOf(calendar.get(Calendar.YEAR))+tempStr%>"><%=calendar.get(Calendar.YEAR)%>년 <%=calendar.get(Calendar.MONTH)+1%>월</option>
		        <%
		                calendar.add(Calendar.MONTH, 1);
		            }
		        %>
		    </select>
			<font color="red">◈ 결제일은 매월 28일 입니다.</font>
		</td>
	</tr>
	<tr >
		<td height="25" width="150" bgcolor="#EBE9DC" class="gray">이메일</td>
		<td class="gray" colspan="3" >
			<input type="text" name="email" size="30" class="text_box" caption="이메일" dataType=email>
		</td>
	</tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="2">
    <tr>
        <td bgcolor="#EBE9DC" class="title">◈ 독자리스트</td>
    </tr>
</table>
<table  width="830" cellspacing="0" cellpadding="0" border="0" id="pbrdr_list">
    <tr bgcolor="#DDDDDD" >
        <td width="30" align="center" class="gray">
        <input type="checkbox" name="formcheckbox1">
        </td>
        <td width="100" align="center" class="gray"> 소속지사 </td>
        <td width="100" align="center" class="gray"> 구독매체 </td>
        <td width="150" align="center" class="gray"> 독자번호 </td>
        <td width="130" align="center" class="gray"> 구독기간 </td>
        <td width="80"  align="center" class="gray"> 주소 </td>
        <td width="80"  align="center" class="gray"> 납부자번호 </td>
    </tr>
    <tr>
        <td width="30" class="gray" align="center" >
        <input type="checkbox" name="formcheckbox12">
        </td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
    </tr>
</table>
</form>
</td>
</tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width=00 height=00></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
<form name="card_validation_form" style="display:none">
    <input type="hidden" name="cardcmpycd" value=""><!--카드종류(카드사) 2007.01.22 카드사종류 이혁 추가 -->
    <input type="hidden" name="accflag" value=""><!--구분-->
    <input type="hidden" name="cardno" value=""><!--카드번호-->
    <input type="hidden" name="expiry" value=""><!--유효기간(YYMM)-->
    <input type="hidden" name="jumin" value=""><!--주민등록번호-->
</form>
