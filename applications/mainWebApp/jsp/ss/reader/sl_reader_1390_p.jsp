<%@ page contentType="text/html;charset=euc-kr"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�	: sl_reader_1390_p.jsp
* ���		: ����-������������-�ڵ���ü�űԽ�û �˾�
* �ۼ�����	: 2003-12-27
* �ۼ���	: ���

* ��������	:
* ������	:
* �������� 	:
* ������ϸ�:
---------------------------------------------------------------------------------------------------%>
<%
    String concatDelimiter = "##";
%>
<html>
<head>
<title>��ü��û</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sal.css" type="text/css">
<script language="javascript" src="/html/comm_js/common.js"></script>
<script language="javascript">
<!--
    // ������Ʈ�� ���� ����
    function change_bgColor(obj, color_name) {
        obj.bgColor = color_name;
    }

    // �󼼺���-������û���
    function detail(medicd) {
        var lo_form1 = document.aplc_detail_form;

        lo_form1.rdr_no.value = window.dialogArguments; // ���ڹ�ȣ
        lo_form1.medicd.value = medicd; // ��ü�ڵ�

        lo_form1.target = "ifrm";
        lo_form1.action = "1408";
        lo_form1.method = "post";
        lo_form1.submit();
    }

    // �󼼺���-��ü�����ȯ
    function detail2(medicd) {
        var lo_form1 = document.aplc_detail_form;

        lo_form1.rdr_no.value = window.dialogArguments; // ���ڹ�ȣ
        lo_form1.medicd.value = medicd; // ��ü�ڵ�

        lo_form1.target = "ifrm";
        lo_form1.action = "1415";
        lo_form1.method = "post";
        lo_form1.submit();
    }

    // üũ�ڽ��� Ŭ���ؼ� ��� üũ�ڽ��� ���� �Ǵ� ���������Ѵ�.
    function select_all(bool) {
        var lo_form1;
        lo_form1 = ifrm_list.document.aplc_new_form;

        if(lo_form1.idx==null) {					// ���õ� ���� ���� ���
            return;
        } else if(lo_form1.idx.type=="checkbox") {	// �Ѱ��� ���
            lo_form1.idx.checked = bool;
        } else {									// �������� ���
            for(var i=0; i<lo_form1.idx.length; i++) {
                lo_form1.idx[i].checked = bool;
            }
        }
    } // select_all

    // �۾�����(�ű�/����/����) �� ��ü����� ���� �б�
    function aplc_save() {

		lo_form = document.pymt_info_form;
        lo_form2 = document.card_validation_form;

        if(lo_form.accflag.value=="N") { // �űԽ�û�� ��
            if(lo_form.shftclsf.value=="110") {	// �����ڵ���ü
                aplc_save2();
            } else if(lo_form.shftclsf.value=="130") {	// �Ϲ�ī����ü
                if(!validate(lo_form)) return false;

                lo_form2.cardno.value = lo_form.cardno.value;

                // �ֹι�ȣ�� �� 7�ڸ�, ����ڹ�ȣ�� ���� ��.
                if(lo_form.prn.value.length > 10) {	// �ֹι�ȣ
                    lo_form2.jumin.value = lo_form.prn.value.substr(7);	// �� 7�ڸ�
                } else {	// ����ڹ�ȣ
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
        } else if(lo_form.accflag.value=="E") { // ������û�� ��
             aplc_save2();
        } else if(lo_form.accflag.value=="C") { // ��ü��������� ��
            if(lo_form.shftclsf.value=="110") {	// �����ڵ���ü
                aplc_save3();
            } else if(lo_form.shftclsf.value=="130") {	// �Ϲ�ī����ü
                if(!validate(lo_form)) return false;

                lo_form2.cardno.value = lo_form.cardno.value;

                // �ֹι�ȣ�� �� 7�ڸ�, ����ڹ�ȣ�� ���� ��.
                if(lo_form.prn.value.length > 10) {	// �ֹι�ȣ
                    lo_form2.jumin.value = lo_form.prn.value.substr(7);	// �� 7�ڸ�
                } else {	// ����ڹ�ȣ
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

    // �����û
    function aplc_save3() {
        lo_form = document.pymt_info_form;

        if(lo_form.shftclsf.value=="") {
            alert("����� Ŭ���Ͻ� �� ��û�ϼ���.");
            return;
        }
        lo_form.method = "post";
        lo_form.target = "ifrm";
        lo_form.action = "1418";

        check_all(lo_form);
    }

    // �ű�/������û
    function aplc_save2() {
        var lo_form1;

        lo_form1 = ifrm_list.document.aplc_new_form;
        lo_form2 = document.pymt_info_form;

        if(lo_form1.idx==null) { // ��� �Ѱǵ� ���� ��
            return;
        } else if(lo_form1.idx.type=="checkbox") { // ��� �ѰǸ� ���� ��
            if(!lo_form1.idx.checked) return; // üũ�� ���� ���� ��

            lo_form2.medicd.value = lo_form1.medicd.value;
        } else { // �Ա�ó����� �������϶�
            var j = 0;
            for(var i=0; i<lo_form1.idx.length; i++) { // üũ�� �Ǽ��� �ջ�
                if(lo_form1.idx[i].checked) j++;
            }
            if(j==0) { // üũ�� ���� ���� ��
                //alert('debug...�Ѱǵ� ����');
                return;
            }

            var ls_concat_str = "<%=concatDelimiter%>";

            lo_form2.medicd.value = concatenate_with_delimiter(lo_form1.medicd, ls_concat_str, lo_form1.idx);			// ��ü�ڵ�
        }

        lo_form2.method = "post";
        lo_form2.target = "ifrm";
        lo_form2.action = "1400";

        if(lo_form2.accflag.value=="N") { // �űԽ�û�� ��
            check_all(lo_form2);
        } else if(lo_form2.accflag.value=="E") { // ������û�� ��
            lo_form2.submit();
        }
    }

    // �ش� �ε����� key_obj�� üũ�Ǿ��ִ����� ���� concat_str�� ����� ���ڿ��� �����Ѵ�.
    // array_obj�� collection type�̴�.
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

    // �� ��ȿ�� üũ �� ����
    function check_all(form){
        if(!validate(form)) return false;
        else{
            makeValue(form);
            form.submit();
        }
    }

    // �ű�/���� ���̵�
    function jsSubmit(s) {
        var lo_form1 = document.aplc_new_search_form;
        var lo_form2 = document.pymt_info_form;

        lo_form1.accflag.value = s;
        lo_form2.accflag.value = s;

        if(s=="C") {	// ��ü�����ȯ
            lo_form1.action = "1413";
        } else if(s=="E") { // ������û
            lo_form1.action = "1405";
        } else { // �űԽ�û
            lo_form1.action = "1395";
        }
        lo_form1.target = "ifrm";
        lo_form1.submit();
    }

    // �� visual initializing
    function jsInit(){
        setEventHandler();
        setEnterKeyEventHandler();
        setInputBackgroundColor();
    }

    // ��ü���� ���濡 ���� ��������, ī������ �Է��� (��)Ȱ��ȭ
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
        <td  height="7"> <!-----��������-- --> </td>
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
                        <!--title �ڸ�-->
                        ��ü��û ���� <img src="/html/slcomm_img/ic_pup.gif" width="19" height="8" align="absmiddle"></td>
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
        <td  height="7"> <!-----����Ʈ���̿���-- --> </td>
    </tr>
    <tr>
        <td align="center" class="pup" valign="top"> <!--��ü����-->
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
                                            <td background="/html/slcomm_img/tb1_05.gif" height="17" align="center">�űԽ�û</td>
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
                                            <td background="/html/slcomm_img/tb_05.gif" height="17" align="center">������û</td>
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
                                            <td background="/html/slcomm_img/tb_05.gif" height="17" align="center">��ü�����ȯ</td>
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
                                <td width="139" bgcolor="#dddddd" class="gray">��ü��</td>
                                <td width="77" bgcolor="#dddddd" class="gray">�����μ�</td>
                                <td width="77" bgcolor="#dddddd" class="gray">�������μ�</td>
                                <td width="77" bgcolor="#dddddd" class="gray">����μ�</td>
                                <td width="134" bgcolor="#dddddd" class="gray">�Ǳ����ݾ�</td>
                                <td width="146" bgcolor="#dddddd" class="gray">���ݹ��</td>
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
                    <td colspan="6" bgcolor="#dddddd" class="gray"> ��ü ���� </td>
                </tr>
                <!--tr>
                    <td colspan="4" nowrap bgcolor="#dddddd" class="gray">���� �������� </td>
                    <td colspan="3" class="gray">
                        <select name="pre_pymt_info" id="pre_pymt_info_id" class="sel_all">
                            <option selected>����</option>
                        </select>
                        (���� ������ ������ ������ ��� �����ϼ���.)
                    </td>
                </tr-->
                <tr>
                    <td nowrap bgcolor="#dddddd" class="gray">��ü����<font id="bankcd_font_id" color=red>*</font></td>
                    <td class="gray" width="151" colspan="6">
                        <span id="shftclsf_id">
                        <input type="radio" name="temp" value="110" checked onclick="change_shftclsf(this.value)">�����ڵ�
                        <input type="radio" name="temp" value="130" onclick="change_shftclsf(this.value)">ī��
                        </span>
                        <span id="shftclsf_text_id" style="display:none;"></span>&nbsp;
                    </td>
                    <!--td width="92" bgcolor="#dddddd" class="gray">��ü�����ȯ<font color=red>*</font></td>
                    <td colspan="3" class="gray">
                        <select>
                        </select>
                    </td-->
                </tr>
                <tr>
                    <td width="127" nowrap bgcolor="#dddddd" class="gray">�����ָ�<font color=red>*</font></td>
                    <td colspan="6" class="gray"> <input name="pymtnm" type="text" class="text_box" id="pymtnm" tabIndex="1" size="16" style="ime-mode:active" notEmpty caption="�����ָ�"> </td>
                </tr>
                <tr>
                    <td nowrap bgcolor="#dddddd" class="gray">������ ��ȭ��ȣ<font color=red>*</font></td>
                    <td colspan="6" class="gray">
                        <input name="pymttel1" type="text"  class="text_box" id="pymttel1" size="4" maxlength="4" tabIndex="2" style="ime-mode:disabled" dataType=integer notEmpty caption="��ȭ��ȣ">
                        -
                        <input name="pymttel2" type="text" class="text_box" id="pymttel2" size="4" maxlength="4" tabIndex="3" style="ime-mode:disabled" dataType=integer notEmpty caption="��ȭ��ȣ">
                        -
                        <input name="pymttel3" type="text" class="text_box" id="pymttel3" size="4" maxlength="4" tabIndex="4" style="ime-mode:disabled" dataType=integer notEmpty caption="��ȭ��ȣ"> </td>
                </tr>
                <tr>
                    <td nowrap bgcolor="#dddddd" class="gray">��ü����<font color=red>*</font></td>
                    <td class="gray" width="151"> <select name="recpinstt" id="bankcd_id" tabIndex="5" style="ime-mode:active;width:145" class="sel_all" caption="��ü����">
                            <option selected>����</option>
                        </select>
                        <span id="bankcd_text_id" style="display:none;"></span>
                    </td>
                    <td width="92" bgcolor="#dddddd" class="gray">���¹�ȣ<font color=red>*</font></td>
                    <td class="gray" colspan="3">
                        <input name="acctno" type="text" class="text_box" id="acctno_id" size="16" tabIndex="6" style="ime-mode:disabled" dataType=integer caption="���¹�ȣ">
                        <span id="acctno_text_id" style="display:none;"></span>
                        ('-' ���� �Է��ϼ���.)
                    </td>
                </tr>
                <tr>
                    <td nowrap bgcolor="#dddddd" class="gray">ī����<font color=red>*</font></td>
                    <td class="gray" width="151">
                        <select name="cardcmpycd" id="cardcmpycd_id" tabIndex="7" style="ime-mode:active;width:145" class="sel_all" caption="ī���">
                            <option selected>����</option>
                        </select>
                        <span id="cardcmpycd_text_id" style="display:none;"></span>
                    </td>
                    <td bgcolor="#dddddd" class="gray">ī���ȣ<font color=red>*</font></td>
                    <td width="109" class="gray">
                        <input name="cardno" type="text" class="text_box" id="cardno_id" size="16" maxlength="16" tabIndex="8" style="ime-mode:disabled" dataType=integer notEmpty caption="ī���ȣ">
                        <span id="cardno_text_id" style="display:none;"></span>
                    </td>
                    <td width="61" bgcolor="#dddddd" class="gray">��ȿ�Ⱓ<font color=red>*</font></td>
                    <td width="106" class="gray">
                        <select name="vdtymm" id="vdtymm_id" notEmpty caption="��ȿ��" class="sel_all" tabIndex="9">
                            <option value="">��</option>
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
                        <select name="vdtyyy" id="vdtyyy_id" notEmpty caption="��ȿ�⵵" class="sel_all" tabIndex="10">
                            <option value="">�⵵</option>
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
                    <td nowrap bgcolor="#dddddd" class="gray">�ֹ�(�����)��Ϲ�ȣ<font color=red>*</font></td>
                    <td colspan="6" class="gray"> <input name="prn" type="text" class="text_box" id="prn" value="" size="13" tabIndex="11" maxlength="13" style="ime-mode:disabled" notEmpty dataType=jumin caption="�ֹε�Ϲ�ȣ">
                        '-' ���� �Է��ϼ���.</td>
                </tr>
                <tr>
                    <td nowrap  bgcolor="#dddddd" class="gray">��ü��û��<font color=red>*</font></td>
                    <td class="gray"><input name="aplcdt" type="text" class="text_box" id="aplcdt" size="10" maxlength="10" readOnly="true" dataType="date" caption="��ü��û��"> </td>
                    <td bgcolor="#dddddd" class="gray" width="92">��ü���ۿ�<font id="aplyyymm_font_id" color=red>*</font></td>
                    <td colspan="3" class="gray">
                        <select name="aplyyymm" class="sel_all" id="aplyyymm_id" style="width:90" tabIndex="12" notEmpty caption="��ü���ۿ�">
                            <option value="">����</option>
                        </select>
                        <span id="aplyyymm_text_id" style="display:none;"></span>
                        (�������� �ſ� 28�� �Դϴ�)
                    </td>
                </tr>
                <tr>
                    <td nowrap bgcolor="#dddddd" class="gray">E-mail</td>
                    <td colspan="6" class="gray"> <input name="email" type="text" class="text_box" id="email" size="30" tabIndex="13" dataType="email" caption="�̸���"> </td>
                </tr>
                </form>
            </table>
       </td>
    </tr>
    <tr>
        <td align="center" height="7"> <!--�ϴܿ���--> </td>
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
    <input type="hidden" name="accflag" value=""><!--����-->
    <input type="hidden" name="cardno" value=""><!--ī���ȣ-->
    <input type="hidden" name="expiry" value=""><!--��ȿ�Ⱓ(YYMM)-->
    <input type="hidden" name="jumin" value=""><!--�ֹε�Ϲ�ȣ-->
</form>
<iframe name="ifrm" width="100%" height="0"></iframe>
<script language="JavaScript">
<!--
/*  2004-07-01 iframe loading�� 1395 response�� ���� �� �ִ� Ȯ���� �־�.. function default_list_search() ȭ �ϰ� ifrm_list onload �� ȣ���ϵ��� ������(feelhouse)
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
