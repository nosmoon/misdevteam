<%@ page contentType="text/html;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp"%>
<!--JSP COMMENT START------------------------------------------------------------------------------->
<%---------------------------------------------------------------------------------------------------
* ���ϸ�	: sl_reader_1403_p.jsp
* ���		: ����-������������-�ڵ���ü������û �˾�
* �ۼ�����	: 2003-12-29
* �ۼ���	: ���

* ��������	:
* ������	:
* �������� 	:
* ������ϸ�:
---------------------------------------------------------------------------------------------------%>
<!--JSP COMMENT END--------------------------------------------------------------------------------->
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
    // üũ�ڽ��� Ŭ���ؼ� ��� üũ�ڽ��� ���� �Ǵ� ���������Ѵ�.
    function select_all(bool) {
        var lo_form1;
        lo_form1 = ifrm_list.document.aplc_expy_form;

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

	// �Ա�ó��
    function aplc_save() {
        var lo_form1;

        lo_form1 = ifrm_list.document.aplc_expy_form;
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

        alert(lo_form2.medicd.value);

        lo_form2.method = "post";
        lo_form2.target = "ifrm";
        lo_form2.action = "1400";

        check_all(lo_form2);
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

	// �� ��ȿ���˻� �� ����
    function check_all(form){
        if(!validate(form)) return false;
        else{
            makeValue(form);
            form.submit();
        }
    }
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1">
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
                                <td> <table border=0 cellpadding=0 cellspacing=0 width="100%">
                                        <tr>
                                            <td height=3 ><img src="/html/slcomm_img/tb_01.gif" width=5 height=3 ></td>
                                            <td  background="/html/slcomm_img/tb_02.gif" height=3 ></td>
                                            <td height=3 ><img src="/html/slcomm_img/tb_03.gif" width=5 height=3 ></td>
                                        </tr>
                                        <tr>
                                            <td background="/html/slcomm_img/tb_04.gif" height="17" style width="5"></td>
                                            <td height="17" align="center" background="/html/slcomm_img/tb_05.gif">�űԽ�û</td>
                                            <td background="/html/slcomm_img/tb_06.gif" height="17" style width="5"></td>
                                        </tr>
                                    </table></td>
                                <td> <table border=0 cellpadding=0 cellspacing=0 width="100%">
                                        <tr>
                                            <td height=3 ><img src="/html/slcomm_img/tb1_01.gif" width=5 height=3 ></td>
                                            <td  background="/html/slcomm_img/tb1_02.gif" height=3 ></td>
                                            <td height=3 ><img src="/html/slcomm_img/tb1_03.gif" width=5 height=3 ></td>
                                        </tr>
                                        <tr>
                                            <td background="/html/slcomm_img/tb1_04.gif" height="17" width="5"></td>
                                            <td background="/html/slcomm_img/tb1_05.gif" height="17" align="center">������û</td>
                                            <td background="/html/slcomm_img/tb1_06.gif" height="17" width="5"></td>
                                        </tr>
                                    </table></td>
                            </tr>
                        </table>
                        <!--tab table end--> </td>
                </tr>
            </table>
            <table width="670" border="0" cellpadding="2" cellspacing="0" style="font-size:12px" class="gray" bgcolor="#FFFFFF">
                <form name="pymt_info_form">
                <input type="hidden" name="medicd">
                <input type="hidden" name="rdr_no">
                <tr>
                    <td colspan="7" style="padding:0"> <table style="border-top-width:0;border-left-width:0" class="gray" border="0" cellspacing="0" cellpadding="2" width="100%">
                            <tr align="center">
                                <td width="20" bgcolor="#dddddd" class="gray"><input type="checkbox" onclick="select_all(this.checked)"></td>
                                <td width="139" bgcolor="#dddddd" class="gray">��ü��</td>
                                <td width="77" bgcolor="#dddddd" class="gray">�����μ�</td>
                                <td width="77" bgcolor="#dddddd" class="gray">�������μ�</td>
                                <td width="77" bgcolor="#dddddd" class="gray">����μ�</td>
                                <td width="134" bgcolor="#dddddd" class="gray">�Ǳ����ݾ�</td>
                                <td width="146" bgcolor="#dddddd" class="gray">���ݹ��</td>
                            </tr>
                        </table></td>
                </tr>
                <tr>
                    <td colspan="7" class="gray" style="padding:0"> <iframe name="ifrm_list" src="/html/reader/sl_reader_1391_p.htm" width="100%" marginwidth="0" height="130" marginheight="0" scrolling="yes" frameborder="0"></iframe></td>
                </tr>
                <tr align="center">
                    <td colspan="7" bgcolor="#dddddd" class="gray"> ��ü ���� ���� </td>
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
                    <td colspan="4" nowrap bgcolor="#dddddd" class="gray">�����ָ�</td>
                    <td colspan="3" class="gray"> <input name="pymtflnm" type="text" class="text_box" id="pymtflnm" size="16"> </td>
                </tr>
                <tr>
                    <td colspan="4" nowrap bgcolor="#dddddd" class="gray">������ ��ȭ��ȣ</td>
                    <td colspan="3" class="gray"> <input name="pymttel1" type="text"  class="text_box" id="pymttel1" size="4">
                        -
                        <input name="pymttel2" type="text" class="text_box" id="pymttel2" size="4">
                        -
                        <input name="pymttel3" type="text" class="text_box" id="pymttel3" size="4"> </td>
                </tr>
                <tr>
                    <td colspan="4" nowrap bgcolor="#dddddd" class="gray">��ü����</td>
                    <td class="gray" width="157"> <select name="recpinstt" id="bankcd_id" class="sel_all">
                            <option selected>����</option>
                        </select> </td>
                    <td width="98" bgcolor="#dddddd" class="gray">���¹�ȣ</td>
                    <td class="gray" width="309"> <input name="acctno" type="text" class="text_box" id="acctno" size="16">
                        '-' ���� �Է��ϼ���.</td>
                </tr>
                <tr>
                    <td colspan="4" nowrap bgcolor="#dddddd" class="gray">�ֹ�(�����)��Ϲ�ȣ</td>
                    <td colspan="3" class="gray"> <input name="prn" type="text" class="text_box" id="prn" value="" size="13" maxlength="13">
                        '-' ���� �Է��ϼ���.</td>
                </tr>
                <tr>
                    <td colspan="4" nowrap  bgcolor="#dddddd" class="gray">��ü��û��</td>
                    <td class="gray"> <input name="aplcdt" type="text" class="text_box" id="aplcdt" value="<%=Util.getDate2()%>" size="10" readOnly="true"> </td>
                    <td bgcolor="#dddddd" class="gray" width="98">��ü���ۿ�</td>
                    <td class="gray">
                    <!--��ü��û ������ ����Ʈ-->
                    <%
                        Calendar calendar = new GregorianCalendar(Locale.KOREA);
                        calendar.add(Calendar.MONTH, 1);
                    %>
                        <select name="aplyyymm" class="sel_all" id="aplyyymm">
                            <option value="" selected>����</option>
                            <%
                                String tempStr = null;
                                for(int i=0; i<12; i++) {
                                    tempStr = Util.trimDate(Util.Date2Str(calendar.getTime())).substring(0,6) + "01"; // ex:20031201
                            %>
                            <option value="<%=tempStr%>"><%=calendar.get(Calendar.YEAR)%>�� <%=calendar.get(Calendar.MONTH)+1%>��</option>
                            <%
                                    calendar.add(Calendar.MONTH, 1);
                                }
                            %>
                        </select>
                        (�������� �ſ� 28�� �Դϴ�)
                    </td>
                </tr>
                <tr>
                    <td colspan="4" nowrap bgcolor="#dddddd" class="gray">E-mail</td>
                    <td colspan="3" class="gray"> <input name="email" type="text" class="text_box" id="email" size="30"> </td>
                </tr>
                </form>
            </table>
            <!--��ư-->
            <table width="670" border="0" cellspacing="0" cellpadding="0"  class="title2" align="center">
                <tr>
                    <td align="center" height="25" bgcolor="#E8E8E8"> <img onclick="aplc_save()" style="cursor:hand;" src="/html/slcomm_img/bu_sin.gif" width="39" height="19" align="absmiddle"> <img src="/html/slcomm_img/bu_cencle.gif" width="39" height="19" align="absmiddle" border="0"> </td>
                </tr>
            </table></td>
    </tr>
    <tr>
        <td align="center" height="7"> <!--�ϴܿ���--> </td>
    </tr>
    <tr>
        <td align="center" height="27"  bgcolor="#959595"> <img src="/html/slcomm_img/bu_close.gif" width="49" height="19" border="0" onClick="window.close()" style="cursor:hand;"></td>
    </tr>
</table>
<form name="aplc_expy_search_form">
    <input type="hidden" name="rdr_no" value="">
</form>
<iframe name="ifrm" width="100%" height="600"></iframe>
<script language="JavaScript">
<!--
    var go_form1 = document.aplc_expy_search_form;

    go_form1.rdr_no.value = window.dialogArguments;
    pymt_info_form.rdr_no.value = window.dialogArguments;

    go_form1.action = "1405";
    go_form1.target = "ifrm";
    go_form1.method = "post";
    go_form1.submit();
-->
</script>
</body>
</html>
