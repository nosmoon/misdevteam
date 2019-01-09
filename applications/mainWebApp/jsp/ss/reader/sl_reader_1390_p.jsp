<%@ page contentType="text/html;charset=euc-kr"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명	: sl_reader_1390_p.jsp
* 기능		: 독자-독자정보관리-자동이체신규신청 팝업
* 작성일자	: 2003-12-27
* 작성자	: 김상열

* 수정내역	:
* 수정자	:
* 수정일자 	:
* 백업파일명:
---------------------------------------------------------------------------------------------------%>
<%
    String concatDelimiter = "##";
%>
<html>
<head>
<title>이체신청</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sal.css" type="text/css">
<script language="javascript" src="/html/comm_js/common.js"></script>
<script language="javascript">
<!--
    // 오브젝트의 배경색 변경
    function change_bgColor(obj, color_name) {
        obj.bgColor = color_name;
    }

    // 상세보기-해지신청목록
    function detail(medicd) {
        var lo_form1 = document.aplc_detail_form;

        lo_form1.rdr_no.value = window.dialogArguments; // 독자번호
        lo_form1.medicd.value = medicd; // 매체코드

        lo_form1.target = "ifrm";
        lo_form1.action = "1408";
        lo_form1.method = "post";
        lo_form1.submit();
    }

    // 상세보기-이체방법전환
    function detail2(medicd) {
        var lo_form1 = document.aplc_detail_form;

        lo_form1.rdr_no.value = window.dialogArguments; // 독자번호
        lo_form1.medicd.value = medicd; // 매체코드

        lo_form1.target = "ifrm";
        lo_form1.action = "1415";
        lo_form1.method = "post";
        lo_form1.submit();
    }

    // 체크박스를 클릭해서 모든 체크박스를 선택 또는 선택해제한다.
    function select_all(bool) {
        var lo_form1;
        lo_form1 = ifrm_list.document.aplc_new_form;

        if(lo_form1.idx==null) {					// 선택된 건이 없는 경우
            return;
        } else if(lo_form1.idx.type=="checkbox") {	// 한건인 경우
            lo_form1.idx.checked = bool;
        } else {									// 여러건인 경우
            for(var i=0; i<lo_form1.idx.length; i++) {
                lo_form1.idx[i].checked = bool;
            }
        }
    } // select_all

    // 작업구분(신규/해지/변경) 및 이체방법에 따른 분기
    function aplc_save() {

		lo_form = document.pymt_info_form;
        lo_form2 = document.card_validation_form;

        if(lo_form.accflag.value=="N") { // 신규신청일 때
            if(lo_form.shftclsf.value=="110") {	// 지로자동이체
                aplc_save2();
            } else if(lo_form.shftclsf.value=="130") {	// 일반카드이체
                if(!validate(lo_form)) return false;

                lo_form2.cardno.value = lo_form.cardno.value;

                // 주민번호는 뒤 7자리, 사업자번호는 전부 다.
                if(lo_form.prn.value.length > 10) {	// 주민번호
                    lo_form2.jumin.value = lo_form.prn.value.substr(7);	// 뒤 7자리
                } else {	// 사업자번호
                    lo_form2.jumin.value = lo_form.prn.value;
                }
                //lo_form2.jumin.value = deleteHyphen(lo_form.prn.value);
                lo_form2.expiry.value = lo_form.vdtyyy.value.substr(2) + lo_form.vdtymm.value;
                lo_form2.accflag.value = "N";

                lo_form2.method = "post";
                lo_form2.target = "ifrm";
                lo_form2.action = "1410";

                lo_form2.submit();
            }
        } else if(lo_form.accflag.value=="E") { // 해지신청일 때
             aplc_save2();
        } else if(lo_form.accflag.value=="C") { // 이체방법변경일 때
            if(lo_form.shftclsf.value=="110") {	// 지로자동이체
                aplc_save3();
            } else if(lo_form.shftclsf.value=="130") {	// 일반카드이체
                if(!validate(lo_form)) return false;

                lo_form2.cardno.value = lo_form.cardno.value;

                // 주민번호는 뒤 7자리, 사업자번호는 전부 다.
                if(lo_form.prn.value.length > 10) {	// 주민번호
                    lo_form2.jumin.value = lo_form.prn.value.substr(7);	// 뒤 7자리
                } else {	// 사업자번호
                    lo_form2.jumin.value = lo_form.prn.value;
                }
                //lo_form2.jumin.value = deleteHyphen(lo_form.prn.value);
                lo_form2.expiry.value = lo_form.vdtyyy.value.substr(2) + lo_form.vdtymm.value;
                lo_form2.accflag.value = "C";

                lo_form2.method = "post";
                lo_form2.target = "ifrm";
                lo_form2.action = "1410";

                lo_form2.submit();
            }
        }
    }

    // 변경신청
    function aplc_save3() {
        lo_form = document.pymt_info_form;

        if(lo_form.shftclsf.value=="") {
            alert("목록을 클릭하신 후 신청하세요.");
            return;
        }
        lo_form.method = "post";
        lo_form.target = "ifrm";
        lo_form.action = "1418";

        check_all(lo_form);
    }

    // 신규/해지신청
    function aplc_save2() {
        var lo_form1;

        lo_form1 = ifrm_list.document.aplc_new_form;
        lo_form2 = document.pymt_info_form;

        if(lo_form1.idx==null) { // 대상에 한건도 없을 때
            return;
        } else if(lo_form1.idx.type=="checkbox") { // 대상에 한건만 있을 때
            if(!lo_form1.idx.checked) return; // 체크된 건이 없을 때

            lo_form2.medicd.value = lo_form1.medicd.value;
        } else { // 입금처리대상에 여러건일때
            var j = 0;
            for(var i=0; i<lo_form1.idx.length; i++) { // 체크된 건수를 합산
                if(lo_form1.idx[i].checked) j++;
            }
            if(j==0) { // 체크된 건이 없을 때
                //alert('debug...한건도 없슴');
                return;
            }

            var ls_concat_str = "<%=concatDelimiter%>";

            lo_form2.medicd.value = concatenate_with_delimiter(lo_form1.medicd, ls_concat_str, lo_form1.idx);			// 매체코드
        }

        lo_form2.method = "post";
        lo_form2.target = "ifrm";
        lo_form2.action = "1400";

        if(lo_form2.accflag.value=="N") { // 신규신청일 때
            check_all(lo_form2);
        } else if(lo_form2.accflag.value=="E") { // 해지신청일 때
            lo_form2.submit();
        }
    }

    // 해당 인덱스의 key_obj가 체크되어있는지에 따라서 concat_str로 연결된 문자열을 조합한다.
    // array_obj는 collection type이다.
    function concatenate_with_delimiter(array_obj, concat_str, key_obj) {
        var ls_ret_str = "";
        var ls_obj_val;

        for(var i=0; i<array_obj.length; i++) {

            if(key_obj[i].checked) {
                ls_obj_val = array_obj[i].value;
                //if(ls_obj_val=="") ls_obj_val = null;
                ls_ret_str += (concat_str + ls_obj_val);
            }
        }

        ls_ret_str = ls_ret_str.substr(concat_str.length);

        return ls_ret_str;
    }

    // 폼 유효성 체크 및 전송
    function check_all(form){
        if(!validate(form)) return false;
        else{
            makeValue(form);
            form.submit();
        }
    }

    // 신규/해지 탭이동
    function jsSubmit(s) {
        var lo_form1 = document.aplc_new_search_form;
        var lo_form2 = document.pymt_info_form;

        lo_form1.accflag.value = s;
        lo_form2.accflag.value = s;

        if(s=="C") {	// 이체방법전환
            lo_form1.action = "1413";
        } else if(s=="E") { // 해지신청
            lo_form1.action = "1405";
        } else { // 신규신청
            lo_form1.action = "1395";
        }
        lo_form1.target = "ifrm";
        lo_form1.submit();
    }

    // 폼 visual initializing
    function jsInit(){
        setEventHandler();
        setEnterKeyEventHandler();
        setInputBackgroundColor();
    }

    // 이체구분 변경에 따른 계좌정보, 카드정보 입력폼 (비)활성화
    function change_shftclsf(shftclsf) {
        document.pymt_info_form.shftclsf.value = shftclsf;

        if(shftclsf=="110") {

            document.all.cardcmpycd_id.disabled = true;
            document.all.cardno_id.disabled = true;
            document.all.vdtymm_id.disabled = true;
            document.all.vdtyyy_id.disabled = true;

            document.all.bankcd_id.disabled = false;
            document.all.acctno_id.disabled = false;
        } else if(shftclsf=="130") {
            document.all.cardcmpycd_id.disabled = false;
            document.all.cardno_id.disabled = false;
            document.all.vdtymm_id.disabled = false;
            document.all.vdtyyy_id.disabled = false;

            document.all.bankcd_id.disabled = true;
            document.all.acctno_id.disabled = true;
        }
    }
-->
</script>

<script language="JavaScript">
<!--
    function default_list_search(){
        var lo_form1 = document.aplc_new_search_form;

        lo_form1.rdr_no.value = window.dialogArguments;
        pymt_info_form.rdr_no.value = window.dialogArguments;

        lo_form1.action = "1395";
        lo_form1.target = "ifrm";
        lo_form1.method = "post";
        lo_form1.submit();
    }
-->
</script>
</head>
<body onload="jsInit()" bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1">
<!--title-->
<table width="100%" border="0" cellspacing="0" cellpadding="0" height="100%">
    <tr>
        <td  height="7"> <!-----상위여백-- --> </td>
    </tr>
    <tr>
        <td align="center" height="33" class="pup"> <!--title-->
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
                        이체신청 내역 <img src="/html/slcomm_img/ic_pup.gif" width="19" height="8" align="absmiddle"></td>
                    <td width=2><img src="/html/slcomm_img/car_06.gif" width=2 height=23 ></td>
                </tr>
                <tr>
                    <td width=2><img src="/html/slcomm_img/car_07.gif" width=2 height=7 ></td>
                    <td background="/html/slcomm_img/car_08.gif"></td>
                    <td width=2> <img src="/html/slcomm_img/car_09.gif" width=2 height=7 ></td>
                </tr>
            </table>
            <!--title end--> </td>
    </tr>
    <tr>
        <td  height="7"> <!-----리스트사이여백-- --> </td>
    </tr>
    <tr>
        <td align="center" class="pup" valign="top"> <!--매체정보-->
            <table width="670" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td width="450">&nbsp;</td>
                    <td> <!--tab table-->
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td onclick="jsSubmit('N')" style="cursor:hand;">
                                    <table border=0 cellpadding=0 cellspacing=0 width="100%" id="aplc_new_tab_id">
                                        <tr>
                                            <td height=3 ><img src="/html/slcomm_img/tb1_01.gif" width=5 height=3 ></td>
                                            <td  background="/html/slcomm_img/tb1_02.gif" height=3 ></td>
                                            <td height=3 ><img src="/html/slcomm_img/tb1_03.gif" width=5 height=3 ></td>
                                        </tr>
                                        <tr>
                                            <td background="/html/slcomm_img/tb1_04.gif" height="17" style width="5"></td>
                                            <td background="/html/slcomm_img/tb1_05.gif" height="17" align="center">신규신청</td>
                                            <td background="/html/slcomm_img/tb1_06.gif" height="17" style width="5"></td>
                                        </tr>
                                    </table>
                                </td>
                                <td onclick="jsSubmit('E')" style="cursor:hand;">
                                    <table border=0 cellpadding=0 cellspacing=0 width="100%" id="aplc_expy_tab_id">
                                        <tr>
                                            <td height=3 ><img src="/html/slcomm_img/tb_01.gif" width=5 height=3 ></td>
                                            <td  background="/html/slcomm_img/tb_02.gif" height=3 ></td>
                                            <td height=3 ><img src="/html/slcomm_img/tb_03.gif" width=5 height=3 ></td>
                                        </tr>
                                        <tr>
                                            <td background="/html/slcomm_img/tb_04.gif" height="17" width="5"></td>
                                            <td background="/html/slcomm_img/tb_05.gif" height="17" align="center">해지신청</td>
                                            <td background="/html/slcomm_img/tb_06.gif" height="17" width="5"></td>
                                        </tr>
                                    </table>
                                </td>
                                <td onclick="jsSubmit('C')" style="cursor:hand;">
                                    <table border=0 cellpadding=0 cellspacing=0 width="100%" id="aplc_chg_tab_id">
                                        <tr>
                                            <td height=3 ><img src="/html/slcomm_img/tb_01.gif" width=5 height=3 ></td>
                                            <td  background="/html/slcomm_img/tb_02.gif" height=3 ></td>
                                            <td height=3 ><img src="/html/slcomm_img/tb_03.gif" width=5 height=3 ></td>
                                        </tr>
                                        <tr>
                                            <td background="/html/slcomm_img/tb_04.gif" height="17" width="5"></td>
                                            <td background="/html/slcomm_img/tb_05.gif" height="17" align="center">이체방법전환</td>
                                            <td background="/html/slcomm_img/tb_06.gif" height="17" width="5"></td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                        </table>
                        <!--tab table end--> </td>
                </tr>
            </table>
            <table width="670" border="0" cellpadding="2" cellspacing="0" style="font-size:12px" class="gray" bgcolor="#FFFFFF">
                <tr>
                    <td colspan="6" style="padding:0">
                        <table style="border-top-width:0;border-left-width:0" class="gray" border="0" cellspacing="0" cellpadding="2" width="100%">
                            <tr align="center">
                                <td width="20" bgcolor="#dddddd" class="gray"><input type="checkbox" onclick="select_all(this.checked)"></td>
                                <td width="139" bgcolor="#dddddd" class="gray">매체명</td>
                                <td width="77" bgcolor="#dddddd" class="gray">유가부수</td>
                                <td width="77" bgcolor="#dddddd" class="gray">준유가부수</td>
                                <td width="77" bgcolor="#dddddd" class="gray">무료부수</td>
                                <td width="134" bgcolor="#dddddd" class="gray">실구독금액</td>
                                <td width="146" bgcolor="#dddddd" class="gray">수금방법</td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td colspan="6" class="gray" style="padding:0"> <iframe name="ifrm_list" onload="default_list_search();" src="/html/reader/sl_reader_1391_p.htm" width="100%" marginwidth="0" height="115" marginheight="0" scrolling="yes" frameborder="0"></iframe></td>
                </tr>
            </table>
            <table id="shft_detail_id" width="670" border="0" cellpadding="2" cellspacing="0" style="font-size:12px" class="gray" bgcolor="#FFFFFF">
            <form name="pymt_info_form">
                <input type="hidden" name="shftclsf" value="110">
                <input type="hidden" name="medicd">
                <input type="hidden" name="rdr_no">
                <input type="hidden" name="accflag" value="N">
                <tr align="center">
                    <td colspan="6" bgcolor="#dddddd" class="gray"> 이체 정보 </td>
                </tr>
                <!--tr>
                    <td colspan="4" nowrap bgcolor="#dddddd" class="gray">기존 납부정보 </td>
                    <td colspan="3" class="gray">
                        <select name="pre_pymt_info" id="pre_pymt_info_id" class="sel_all">
                            <option selected>선택</option>
                        </select>
                        (기존 납부자 정보와 동일할 경우 선택하세요.)
                    </td>
                </tr-->
                <tr>
                    <td nowrap bgcolor="#dddddd" class="gray">이체구분<font id="bankcd_font_id" color=red>*</font></td>
                    <td class="gray" width="151" colspan="6">
                        <span id="shftclsf_id">
                        <input type="radio" name="temp" value="110" checked onclick="change_shftclsf(this.value)">지로자동
                        <input type="radio" name="temp" value="130" onclick="change_shftclsf(this.value)">카드
                        </span>
                        <span id="shftclsf_text_id" style="display:none;"></span>&nbsp;
                    </td>
                    <!--td width="92" bgcolor="#dddddd" class="gray">이체방법전환<font color=red>*</font></td>
                    <td colspan="3" class="gray">
                        <select>
                        </select>
                    </td-->
                </tr>
                <tr>
                    <td width="127" nowrap bgcolor="#dddddd" class="gray">예금주명<font color=red>*</font></td>
                    <td colspan="6" class="gray"> <input name="pymtnm" type="text" class="text_box" id="pymtnm" tabIndex="1" size="16" style="ime-mode:active" notEmpty caption="예금주명"> </td>
                </tr>
                <tr>
                    <td nowrap bgcolor="#dddddd" class="gray">예금주 전화번호<font color=red>*</font></td>
                    <td colspan="6" class="gray">
                        <input name="pymttel1" type="text"  class="text_box" id="pymttel1" size="4" maxlength="4" tabIndex="2" style="ime-mode:disabled" dataType=integer notEmpty caption="전화번호">
                        -
                        <input name="pymttel2" type="text" class="text_box" id="pymttel2" size="4" maxlength="4" tabIndex="3" style="ime-mode:disabled" dataType=integer notEmpty caption="전화번호">
                        -
                        <input name="pymttel3" type="text" class="text_box" id="pymttel3" size="4" maxlength="4" tabIndex="4" style="ime-mode:disabled" dataType=integer notEmpty caption="전화번호"> </td>
                </tr>
                <tr>
                    <td nowrap bgcolor="#dddddd" class="gray">이체은행<font color=red>*</font></td>
                    <td class="gray" width="151"> <select name="recpinstt" id="bankcd_id" tabIndex="5" style="ime-mode:active;width:145" class="sel_all" caption="이체은행">
                            <option selected>선택</option>
                        </select>
                        <span id="bankcd_text_id" style="display:none;"></span>
                    </td>
                    <td width="92" bgcolor="#dddddd" class="gray">계좌번호<font color=red>*</font></td>
                    <td class="gray" colspan="3">
                        <input name="acctno" type="text" class="text_box" id="acctno_id" size="16" tabIndex="6" style="ime-mode:disabled" dataType=integer caption="계좌번호">
                        <span id="acctno_text_id" style="display:none;"></span>
                        ('-' 없이 입력하세요.)
                    </td>
                </tr>
                <tr>
                    <td nowrap bgcolor="#dddddd" class="gray">카드사명<font color=red>*</font></td>
                    <td class="gray" width="151">
                        <select name="cardcmpycd" id="cardcmpycd_id" tabIndex="7" style="ime-mode:active;width:145" class="sel_all" caption="카드사">
                            <option selected>선택</option>
                        </select>
                        <span id="cardcmpycd_text_id" style="display:none;"></span>
                    </td>
                    <td bgcolor="#dddddd" class="gray">카드번호<font color=red>*</font></td>
                    <td width="109" class="gray">
                        <input name="cardno" type="text" class="text_box" id="cardno_id" size="16" maxlength="16" tabIndex="8" style="ime-mode:disabled" dataType=integer notEmpty caption="카드번호">
                        <span id="cardno_text_id" style="display:none;"></span>
                    </td>
                    <td width="61" bgcolor="#dddddd" class="gray">유효기간<font color=red>*</font></td>
                    <td width="106" class="gray">
                        <select name="vdtymm" id="vdtymm_id" notEmpty caption="유효월" class="sel_all" tabIndex="9">
                            <option value="">월</option>
                            <option value="01">01</option>
                            <option value="02">02</option>
                            <option value="03">03</option>
                            <option value="04">04</option>
                            <option value="05">05</option>
                            <option value="06">06</option>
                            <option value="07">07</option>
                            <option value="08">08</option>
                            <option value="09">09</option>
                            <option value="10">10</option>
                            <option value="11">11</option>
                            <option value="12">12</option>
                        </select>
                        <span id="vdtymm_text_id" style="display:none;"></span>
                        <select name="vdtyyy" id="vdtyyy_id" notEmpty caption="유효년도" class="sel_all" tabIndex="10">
                            <option value="">년도</option>
                            <option value="2004">2004</option>
                            <option value="2005">2005</option>
                            <option value="2006">2006</option>
                            <option value="2007">2007</option>
                            <option value="2008">2008</option>
                            <option value="2009">2009</option>
                            <option value="2010">2010</option>
                            <option value="2011">2011</option>
                            <option value="2012">2012</option>
                            <option value="2013">2013</option>
                            <option value="2014">2014</option>
                            <option value="2015">2015</option>
                            <option value="2016">2016</option>
                            <option value="2017">2017</option>
                            <option value="2018">2018</option>
                            <option value="2019">2019</option>
                            <option value="2020">2020</option>
                            <option value="2021">2021</option>
                            <option value="2022">2022</option>
                        </select>
                        <span id="vdtyyy_text_id" style="display:none;"></span>
                    </td>
                </tr>
                <tr>
                    <td nowrap bgcolor="#dddddd" class="gray">주민(사업자)등록번호<font color=red>*</font></td>
                    <td colspan="6" class="gray"> <input name="prn" type="text" class="text_box" id="prn" value="" size="13" tabIndex="11" maxlength="13" style="ime-mode:disabled" notEmpty dataType=jumin caption="주민등록번호">
                        '-' 없이 입력하세요.</td>
                </tr>
                <tr>
                    <td nowrap  bgcolor="#dddddd" class="gray">이체신청일<font color=red>*</font></td>
                    <td class="gray"><input name="aplcdt" type="text" class="text_box" id="aplcdt" size="10" maxlength="10" readOnly="true" dataType="date" caption="이체신청일"> </td>
                    <td bgcolor="#dddddd" class="gray" width="92">이체시작월<font id="aplyyymm_font_id" color=red>*</font></td>
                    <td colspan="3" class="gray">
                        <select name="aplyyymm" class="sel_all" id="aplyyymm_id" style="width:90" tabIndex="12" notEmpty caption="이체시작월">
                            <option value="">선택</option>
                        </select>
                        <span id="aplyyymm_text_id" style="display:none;"></span>
                        (결제일은 매월 28일 입니다)
                    </td>
                </tr>
                <tr>
                    <td nowrap bgcolor="#dddddd" class="gray">E-mail</td>
                    <td colspan="6" class="gray"> <input name="email" type="text" class="text_box" id="email" size="30" tabIndex="13" dataType="email" caption="이메일"> </td>
                </tr>
                </form>
            </table>
       </td>
    </tr>
    <tr>
        <td align="center" height="7"> <!--하단여백--> </td>
    </tr>
    <tr>
        <td valign="middle" align="center" height="27"  bgcolor="#959595">
        <input type="image"  src="/html/slcomm_img/bu_sin.gif" onclick="aplc_save();window.event.returnValue=false;" style="cursor:hand;" >
        <input type="image" src="/html/slcomm_img/bu_close.gif" onclick="window.close();window.event.returnValue=false;" style="cursor:hand;" ></td>
    </tr>
</table>
<form name="aplc_new_search_form" style="display:none">
    <input type="hidden" name="rdr_no" value="">
    <input type="hidden" name="accflag" value="N">
</form>
<form name="aplc_detail_form" style="display:none">
    <input type="hidden" name="rdr_no" value="">
    <input type="hidden" name="medicd" value="">
</form>
<form name="card_validation_form" style="display:none">
    <input type="hidden" name="accflag" value=""><!--구분-->
    <input type="hidden" name="cardno" value=""><!--카드번호-->
    <input type="hidden" name="expiry" value=""><!--유효기간(YYMM)-->
    <input type="hidden" name="jumin" value=""><!--주민등록번호-->
</form>
<iframe name="ifrm" width="100%" height="0"></iframe>
<script language="JavaScript">
<!--
/*  2004-07-01 iframe loading전 1395 response를 받을 수 있는 확률이 있어.. function default_list_search() 화 하고 ifrm_list onload 시 호출하도록 변경함(feelhouse)
    var lo_form1 = document.aplc_new_search_form;

    lo_form1.rdr_no.value = window.dialogArguments;
    pymt_info_form.rdr_no.value = window.dialogArguments;

    lo_form1.action = "1395";
    lo_form1.target = "ifrm";
    lo_form1.method = "post";
    lo_form1.submit();
*/
-->
</script>
</body>
</html>
