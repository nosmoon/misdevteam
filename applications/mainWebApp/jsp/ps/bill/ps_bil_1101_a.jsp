<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_bil_1101_a.jsp
* 기능 : 개별 입금 초기화면
* 작성일자 : 2004-03-30
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%

// dataset 인스턴스 선언 부분
PS_S_BILL_SEPRDataSet ds=(PS_S_BILL_SEPRDataSet)request.getAttribute("ds"); //request dataset
%>


<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">

	function jsinit(){
		setEventHandler();
		//setEnterKeyEventHandler();
	}

	// form 내의 모든 올바른 값인지 체크
	function check_all(form){
		if(!validate(form)) return false;
		else{
			makeValue(form);
			//form.submit();
			return true;
		}
	}

	// 개별 입금 입력 후 리스트 페이지 호출
	function seprrcpm_save() {
		var lo_form2 = document.seprrcpm_form;
		if(!check_all(lo_form2)) return false;

		if(lo_form2.rcpmseq.value!='input') {
			alert("수정 버튼을 눌러 주세요");
			return false;
		}
		lo_form2.clsfval.value="I";
		makeValue(lo_form2);
		lo_form2.action = "/ps/bill/1111";
		lo_form2.target = "ifrm";
		lo_form2.submit();
	}

	// 개별 입금 입력 후 리스트 페이지 호출
	function seprrcpm_edit() {
		var lo_form2 = document.seprrcpm_form;
		if(!check_all(lo_form2)) return false;
		if(lo_form2.rcpmseq.value=='input') {
			alert("입력 버튼을 눌러 주세요");
			return false;
		}
		lo_form2.clsfval.value="U";
		makeValue(lo_form2);
		lo_form2.action = "/ps/bill/1116";
		lo_form2.target = "ifrm";
		lo_form2.submit();
	}

	// 상세 목록에서 선택 삭제
	function seprrcpm_del() {
		var lo_form4 = document.seprrcpm_list_form;
		if(lo_form4.total_records.value=="0") {
			alert("삭제할 목록이 없습니다");
			return false;
		}
		var rdr_no="";
		var medicd="";
		var termsubsno="";
		var rcpmseq="";
        var bocd="";

		//if(!check_all(form2)) return false;

		for(var i = 0; i < lo_form4.chk.length; i++){
			if(lo_form4.chk[i].checked){
				var temp=lo_form4.chk[i].value;
				var ss = temp.split("##");
				if(ss.length!=5) {
					alert("선택시 문제가 발생했습니다.");
				return false;
				} else {
					rdr_no += "##"+ss[0];
					medicd += "##"+ss[1];
					termsubsno += "##" +ss[2];
					rcpmseq += "##"+ss[3];
                    bocd += "##"+ss[4];
				}
			}
		}
		if(rdr_no != ""){
			rdr_no = rdr_no.substr(2);
			medicd = medicd.substr(2);
			termsubsno = termsubsno.substr(2);
			rcpmseq = rcpmseq.substr(2);
            bocd = bocd.substr(2);
		} else {
			alert("삭제할 목록을 체크하십시요");
			return false;
		}
		lo_form4.rdr_no.value=rdr_no;
		lo_form4.medicd.value=medicd;
		lo_form4.termsubsno.value=termsubsno;
		lo_form4.rcpmseq.value=rcpmseq;
        lo_form4.bocd.value=bocd;
		lo_form4.clsfval.value="D";
		lo_form4.action = "/ps/bill/1121";
		lo_form4.target = "ifrm";
		lo_form4.submit();
	}

	// 입금일자와 입금 방법으로 개별 입금 사항 조회
	function seprrcpm_list(startpage) {
		var lo_form1 = document.seprrcpm_list_form;

		if(lo_form1.proc_dd_1.value=="") {
			alert("입금 시작일자를 입력하세요");
			return false;
		} else if(lo_form1.proc_dd_2.value=="") {
			alert("종료 입금일자를 시작일자와 똑같이");
			lo_form1.proc_dd_2.value=lo_form1.proc_dd_1.value;
		}

        if(window.event) window.event.returnValue = false;
		if(!validate(lo_form1)) return false;

		makeValue(lo_form1);
		// 시작일과 종료일을 비교
		if(!isValidDateBW(lo_form1,lo_form1.proc_dd_1,lo_form1.proc_dd_2)) {
			return false;
		}

		lo_form1.curr_page_no.value = startpage;
		lo_form1.action = "/ps/bill/1106";
		lo_form1.target = "ifrm";
		lo_form1.submit();
	}

	// 시작일과 종료일을 비교
	function isValidDateBW(form,from,to) {

		if(from.value > to.value) {
			alert("시작일자가 종료일자보다 작아야 합니다.");
			from.value=<%=Util.getDate()%>;
			from.focus();
			return false;
		}
		if(to.value > <%=Util.getDate()%>) {
			alert("종료일자는 오늘 날짜 보다 커서는 안 됩니다.");
			to.value=<%=Util.getDate()%>;
			to.focus();
			return false;
		}
		return true;
	}

	// 수정을 위해서 목록에서 클릭시 상세 부분에 표시위한 js
	function seprrcpm_detl(procdt,rdr_no,medicd,termsubsno,rcpmseq,rdrnm,medinm,recpmthd,recpdt,rcpmamt,bocd,bonm,curr_page_no,js_fn_nm)
	{
		//alert("detail");
		//var lo_form3 = document.seprrcpm_list_form;
		var lo_form3 = document.seprrcpm_form;
		lo_form3.procdt.value=procdt;
		lo_form3.recpmthd.value=recpmthd;
        lo_form3.bocd.value=bocd;
        lo_form3.bonm.value=bonm;

		lo_form3.rdr_no.value=rdr_no;
		lo_form3.rdr_no.readOnly=true;
		lo_form3.medicd.value=medicd;
		lo_form3.medicd.readOnly=true;
		lo_form3.termsubsno.value=termsubsno;
		lo_form3.termsubsno.readOnly=true;
		lo_form3.rcpmseq.value=rcpmseq;

		lo_form3.rdr_no.className='readonly_box';
		lo_form3.medicd.className='readonly_box';
		lo_form3.termsubsno.className='readonly_box';

		lo_form3.recpdt.value=recpdt;
		lo_form3.rcpmamt.value=rcpmamt;

		lo_form3.rdrnm.value=rdrnm;
		lo_form3.medinm.value=medinm;

		lo_form3.curr_page_no.value=curr_page_no;
		//lo_form3.total_records.value=total_records;
		lo_form3.js_fn_nm.value=js_fn_nm;
		setEventHandler();
	}

	// 독자명,매체명 찾기
	function search_rdrnm_medinm() {
		var lo_form2 = document.seprrcpm_form;
		lo_form2.setFunction.value = "setReader";

		//	if(lo_form2.termsubsno.value.length>=4) {
		lo_form2.action="/ps/common/1701";
		lo_form2.target="ifrm";
		lo_form2.submit();
		lo_form2.rdr_no.value= "";
		lo_form2.medicd.value= "";
		lo_form2.termsubsno.value= "";
		lo_form2.rdrnm.value= "";
		lo_form2.medinm.value= "";
        lo_form2.bocd.value="";
        lo_form2.bonm.value="";
		lo_form2.rdr_no.focus();
		//	} else return false;
		}

	// 독자번호로 독자정보 set
	function setReader(rdr_no,medicd,termsubsno,rdrnm,medinm,bocd,bonm)
	{
		var lo_form1 = document.seprrcpm_form;
        var lo_form2 = document.seprrcpm_list_form;

		lo_form1.rdr_no.value= rdr_no;
		lo_form1.medicd.value= medicd;
		lo_form1.termsubsno.value= termsubsno;
		lo_form1.rdrnm.value= rdrnm;
		lo_form1.medinm.value= medinm;
        lo_form1.bocd.value= bocd;
        lo_form1.bonm.value= bonm;

        lo_form2.slt_bocd.value= bocd;
		setEventHandler();
	}

	// 페이지 이동
	function page_move(curr_page_no) {
		var lo_form3 = document.seprrcpm_list_form;
		//alert("curr_page_no=="+curr_page_no);

		if(!curr_page_no) {
			lo_form3.curr_page_no.value = '1';
		} else {
			lo_form3.curr_page_no.value = curr_page_no;
		}

		seprrcpm_list(curr_page_no);
	}


	// 체크박스를 클릭해서 모든 체크박스를 선택 또는 선택해제한다.
	function select_all(bool) {
		var lo_form1;
		lo_form1 = document.seprrcpm_list_form;

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
		var len  = document.seprrcpm_list_form.chk.length;
		var check = true;
		for (var i=0; i<len; i++){
			if((!seprrcpm_list_form.chk[i].checked) && (!seprrcpm_list_form.chk[i].disabled)) {
				check = false;
			}
		}
		//alert("check===== "+check);
		document.seprrcpm_list_form.chkhead.checked = check;
		window.event.cancelBubble=true;
	}

    //화면 초기화
    function seprrcpm_form_reset() {
    	lo_form1 = document.seprrcpm_form;

	    lo_form1.reset();
		lo_form1.rdr_no.readOnly=false;
		lo_form1.medicd.readOnly=false;
		lo_form1.termsubsno.readOnly=false;

		lo_form1.rdr_no.className='text_box';
		lo_form1.medicd.className='text_box';
		lo_form1.termsubsno.className='text_box';

		lo_form1.rcpmseq.value = 'input'; // 입력으로 변경
	    return;
    }

    //OZ PRINT 설정
    function print_list(){
	    var lo_form1    = document.seprrcpm_list_form;

		if(lo_form1.proc_dd_1.value=="") {
			alert("입금일자를 입력하세요");
			return false;
		} else if(lo_form1.proc_dd_2.value=="") {
			alert("종료 입금일자를 시작일자와 똑같이");
			lo_form1.proc_dd_2.value=lo_form1.proc_dd_1.value;
		}

		if(!validate(lo_form1)) return false;

		makeValue(lo_form1);

		// 시작일과 종료일을 비교
    	if(!isValidDateBW(lo_form1,lo_form1.proc_dd_1,lo_form1.proc_dd_2)) {
	    	return false;
    	}

		lo_form1.action = "/ps/bill/1126";
	    lo_form1.target = "ifrm";
    	lo_form1.submit();
    }

</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsinit();seprrcpm_form.procdt.focus();">

<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
        <td  bgcolor="#797777" height="25" class="home"><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle"><b>수금
        &gt; </b>개별입금</td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>

<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
    <form name="seprrcpm_form" method="post" action="">
        <input type="hidden" name="rcpmclsfcd" value="NOR">
        <input type="hidden" name="clsfval" value="">
        <input type="hidden" name="rcpmseq" value="input">
        <input type="hidden" name="curr_page_no" value="1">
        <input type="hidden" name="records_per_page" value ="15">
        <input type="hidden" name="js_fn_nm" value="page_move">
        <input type="hidden" name="setKubun" value="0">
        <input type="hidden" name="setFunction" >
            <tr>
               <td valign="top" align="center">

  			<table width="830" border="0" cellspacing="0" cellpadding="2">
				<tr>
					<td bgcolor="#EBE9DC" class="title"><B>개별입금</B></td>
					<td bgcolor="#EBE9DC" class="title" align="right" width="170">
                    <img src="/html/comm_img/bu1_reset.gif" width="73" height="19" align="absmiddle" border="0" onClick="seprrcpm_form_reset()" style="cursor:hand">
					<img src="/html/comm_img/bu_input.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:seprrcpm_save()" style="cursor:hand;">
					<img src="/html/comm_img/bu_edit.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:seprrcpm_edit()" style="cursor:hand;">
					</td>
				</tr>
				<tr>
					<td height="3" colspan="2">
					<!--여백-->
					</td>
				</tr>
			</table>
					<table  cellspacing="0" width="830" cellpadding="2" border="0" class="gray" bgcolor="#FFFFFF" id="seprrcpm">
						<tr>
							<td width="90" bgcolor="#dddddd" class="gray" > 입금일자 <font color="red">*</font></td>
							<td class="gray"  width="120">
							<input type="text" name="procdt" size="10" class="text_box" value="<%=Util.getDate()%>" caption="입금일자" datatype="date" notEmpty tabIndex="1">
							</td>

							<td width="90" bgcolor="#dddddd" class="gray" > 독자번호 <font color="red">*</font></td>
							<td  class="gray">
							<input type="text" name="rdr_no" size="9" maxlength="9" class="text_box" caption="독자번호" len="9" notEmpty tabIndex="2"  >
							<input type="text" name="medicd" size="3" maxlength="3" class="text_box" caption="매체코드" notEmpty tabIndex="3"  >
							<input type="text" name="termsubsno" size="4"  maxlength="4" class="text_box" caption="정기구독번호" len="4" notEmpty tabIndex="4" onChange="search_rdrnm_medinm();window.event.returnValue=false;">
							<input type="text" name="rdrnm" size="10" value="성명"  class="readonly_box" caption="성명" notEmpty ReadOnly>
							<input type="text" name="medinm" size="10" value="구독매체"  class="readonly_box" caption="구독매체" notEmpty ReadOnly>
							</td>
							<td width="90" bgcolor="#dddddd" class="gray" >소속지사 <font color="red">*</font></td>
							<td class="gray" width="120">
                                <input type="text" name="bonm" size="10" class="readonly_box" caption="소속지사" style='text-align:right;' readonly notEmpty>
                                <input type="hidden" name="bocd" value="">
							</td>
						</tr>
						<tr>
							<td width="90" bgcolor="#dddddd" class="gray" > 수납일자 <font color="red">*</font></td>
							<td class="gray" >
							<input type="text" name="recpdt" size="10" class="text_box" value="<%=Util.getDate()%>" caption="수납일자" datatype="date" notEmpty tabIndex="5">
							</td>

							<td bgcolor="#dddddd" class="gray" width="90" >입금방법 <font color="red">*</font></td>
							<td class="gray"  >
							<select name="recpmthd" size="1" class="sel_all" caption="입금방법" notEmpty tabIndex="6">
							<option value="">선택</option>
							   <%=ds.rcpmmthdcurOptHtml("") %>
							</select>
                            </td>

							<td width="90" bgcolor="#dddddd" class="gray" >금액</td>
							<td class="gray" width="120">
							<input type="text" name="rcpmamt" size="10" class="text_box" caption="금액"  comma style='text-align:right;' dataType="number" notEmpty tabIndex="7">
							</td>
						</tr>
                   </table>
       </td>
       </tr>
   </form>
        <tr>
            <td height="10" colspan="2">
            <!--여백-->
            </td>
        </tr>

			<form name=seprrcpm_list_form method="post" action="" onsubmit="seprrcpm_list(1)">
			<input type="hidden" name="clsfval" value="">
			<input type="hidden" name="rcpmclsfcd" value="NOR">
			<input type="hidden" name="rdr_no" value="">
			<input type="hidden" name="medicd" value="">
			<input type="hidden" name="termsubsno" value="">
			<input type="hidden" name="rcpmseq" value="">
            <input type="hidden" name="bocd" value="">
			<input name="curr_page_no" type="hidden" value ="1">
			<input name="records_per_page" type="hidden" value ="15">
			<!--			<input name="total_records" type="hidden" value="0"> -->
			<input name="js_fn_nm" type="hidden" value ="page_move">
           <tr><td>
						<table width="830" border="0" cellspacing="0" cellpadding="2">
							<tr bgcolor="#EBE9DC">
								<td  class="title" width="80"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">입금일자 <font color="red">*</font></td>
								<td  class="title" width="200">
								<input type="text" name="proc_dd_1" size="11" class="text_box" value="<%=Util.getDate()%>" datatype="date" caption="입금일자" notEmpty>
								-
								<input type="text" name="proc_dd_2" size="11" class="text_box" value="<%=Util.getDate()%>" datatype="date" caption="입금일자" notEmpty>
								</td>
								<td  class="title" width="80"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">소속지사
								</td>
								<td  class="title" width="120" bgcolor="#EBE9DC">
								<select name="slt_bocd" size="1" class="sel_all">
								<option value="ALL">전체</option>
								<%=ds.intgbocdcurOptHtml("") %>
								</select>
								</td>
								<td  class="title" width="80"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">입금방법
								</td>
								<td  class="title" width="120" bgcolor="#EBE9DC">
								<select name="rcpm_mthd" size="1" class="sel_all">
								<option value="ALL">전체</option>
								<%=ds.rcpmmthdcurOptHtml("") %>
								</select>
								</td>
								<td class="title" bgcolor="#EBE9DC" width="80"> &nbsp;</td>
								<td class="title" align="right"> <input type="image" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle" border="0" onclick="javascript:seprrcpm_list(1)" style="cursor:hand;" > </td>
								</td>
							</tr>
							<tr>
								<td height="3" colspan="6">
								<!--여백-->
								</td>
							</tr>
						</table>
					<!--리스트 -->
					<!--검색 -->
					<table  width="830" cellspacing="0" cellpadding="0" border="0" id="seprrcpm_list">
					<!-- <table  width="830" cellspacing="0" cellpadding="1" border="0" class="gray" bgcolor="#FFFFFF" id="seprrcpm_list"> -->
						<tr><td>
							<table width="830" border="0" cellspacing="0" cellpadding="2">
								<tr>
									<td bgcolor="#EBE9DC" class="title"><B>상세목록</B></td>
									<td bgcolor="#EBE9DC" class="title" width="100" align="right"> <img src="/html/comm_img/bu_print.gif" width="39" height="19" border="0" align="absmiddle" style="cursor:hand;">
									<img src="/html/comm_img/bu_del01.gif" width="36" height="19" align="absmiddle" style="cursor:hand;"></td>
								</tr>
								<tr>
									<td height="3" colspan="2">
									<!--여백-->
									</td>
								</tr>
							</table>

							<table  width="830" cellspacing="0" cellpadding="1" border="0" class="gray" bgcolor="#FFFFFF">
								<tr bgcolor="#dddddd">
									<td width="30" class="gray" align="center" >
									<input type="checkbox" name="formcheckbox1">
									</td>
                                    <td width="100" class="gray" align="center" > 소속지사 </td>
									<td width="100" class="gray" align="center" > 입금일자 </td>
									<td width="150" class="gray" align="center" > 독자번호 </td>
									<td width="100" class="gray" align="center" > 성명 </td>
									<td width="110" class="gray" align="center" > 구독매체 </td>
									<td width="100" class="gray" align="center" > 입금방법 </td>
									<td width="100" class="gray" align="center" > 수납일자 </td>
									<td width="100" class="gray" align="center" > 금액 </td>
								</tr>
								<tr>
									<td  class="gray" align="center" >
									<input type="checkbox" name="formcheckbox12">
									</td>
									<td  class="gray" align="center" > &nbsp; </td>
                                    <td  class="gray" align="center" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" align="right" > &nbsp;</td>
								</tr>
								<tr>
									<td  class="gray" align="center" >
									<input type="checkbox" name="formcheckbox12">
									</td>
									<td  class="gray" align="center" > &nbsp; </td>
                                    <td  class="gray" align="center" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" align="right" > &nbsp;</td>
								</tr>
								<tr>
									<td  class="gray" align="center" >
									<input type="checkbox" name="formcheckbox12">
									</td>
									<td  class="gray" align="center" > &nbsp; </td>
                                    <td  class="gray" align="center" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" align="right" > &nbsp;</td>
								</tr>
								<tr>
									<td  class="gray" align="center" >
									<input type="checkbox" name="formcheckbox12">
									</td>
									<td  class="gray" align="center" > &nbsp; </td>
                                    <td  class="gray" align="center" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" align="right" > &nbsp;</td>
								</tr>
								<tr>
									<td  class="gray" align="center" >
									<input type="checkbox" name="formcheckbox12">
									</td>
									<td  class="gray" align="center" > &nbsp; </td>
                                    <td  class="gray" align="center" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" align="right" > &nbsp;</td>
								</tr>
								<tr>
									<td  class="gray" align="center" >
									<input type="checkbox" name="formcheckbox12">
									</td>
									<td  class="gray" align="center" > &nbsp; </td>
                                    <td  class="gray" align="center" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" align="right" > &nbsp;</td>
								</tr>
								<tr>
									<td  class="gray" align="center" >
									<input type="checkbox" name="formcheckbox12">
									</td>
									<td  class="gray" align="center" > &nbsp; </td>
                                    <td  class="gray" align="center" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" align="right" > &nbsp;</td>
								</tr>
								<tr>
									<td  class="gray" align="center" >
									<input type="checkbox" name="formcheckbox12">
									</td>
									<td  class="gray" align="center" > &nbsp; </td>
                                    <td  class="gray" align="center" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" align="right" > &nbsp;</td>
								</tr>
								<tr>
									<td  class="gray" align="center" >
									<input type="checkbox" name="formcheckbox12">
									</td>
									<td  class="gray" align="center" > &nbsp; </td>
                                    <td  class="gray" align="center" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" align="right" > &nbsp;</td>
								</tr>
								<tr>
									<td  class="gray" align="center" >
									<input type="checkbox" name="formcheckbox12">
									</td>
									<td  class="gray" align="center" > &nbsp; </td>
                                    <td  class="gray" align="center" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" align="right" > &nbsp;</td>
								</tr>
								<tr>
									<td  class="gray" align="center" >
									<input type="checkbox" name="formcheckbox12">
									</td>
									<td  class="gray" align="center" > &nbsp; </td>
                                    <td  class="gray" align="center" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" align="right" > &nbsp;</td>
								</tr>
								<tr>
									<td  class="gray" align="center" >
									<input type="checkbox" name="formcheckbox12">
									</td>
									<td  class="gray" align="center" > &nbsp; </td>
                                    <td  class="gray" align="center" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" align="right" > &nbsp;</td>
								</tr>
								<tr>
									<td  class="gray" align="center" >
									<input type="checkbox" name="formcheckbox12">
									</td>
									<td  class="gray" align="center" > &nbsp; </td>
                                    <td  class="gray" align="center" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" align="right" > &nbsp;</td>
								</tr>
								<tr>
									<td  class="gray" align="center" >
									<input type="checkbox" name="formcheckbox12">
									</td>
									<td  class="gray" align="center" > &nbsp; </td>
                                    <td  class="gray" align="center" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" align="right" > &nbsp;</td>
								</tr>
								<tr>
									<td  class="gray" align="center" >
									<input type="checkbox" name="formcheckbox12">
									</td>
									<td  class="gray" align="center" > &nbsp; </td>
                                    <td  class="gray" align="center" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" > &nbsp; </td>
									<td  class="gray" align="center" > &nbsp;</td>
									<td  class="gray" align="right" > &nbsp;</td>
								</tr>
							</table>
						</td></tr>
						<tr><td>
						<!---button-->
						<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2">
							<tr>
								<td align="center" height="2">
								<!--여백-->
								</td>
							</tr>
							<tr>
								<td align="center" height="24" bgcolor="#E8E8E8">
								<!--JSP PAGE START---------------------------------------------------------------------------------->
								<jsp:include page="/jsp/ps/comm_jsp/page_navigator.jsp">
								<jsp:param name = "curr_page_no" 		value="0"/>
								<jsp:param name = "total_records" 	value="0"/>
								<jsp:param name = "js_fn_nm" 			value="page_move"/>
								<jsp:param name = "records_per_page" 	value="15"/>
								<jsp:param name = "page_set_gubun" 	value="0"/>
								</jsp:include>

								<!--JSP PAGE END------------------------------------------------------------------------------------>
								</td>
							</tr>
						</table>
                       </td></tr>
                   </table>
				</table>
	 </form>
	    </td></tr>

</table>


<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width=830 height=0></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->

<!--JSP FOOTER START-------------------------------------------------------------------------------->
<!--%@ include file=="/common/footer.jsp" %-->
<!--JSP FOOTER END---------------------------------------------------------------------------------->

</body>
</html>
