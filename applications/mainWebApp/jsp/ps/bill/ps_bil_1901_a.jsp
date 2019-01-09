<%@ page contentType="text/html; charset=euc-kr" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_bil_1901_a.jsp
* ��� : ����-�ڵ���üû����� �ʱ�ȭ��
* �ۼ����� : 2006-04-19
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    PS_L_AUTO_SHIFT_APLC_INITDataSet ds = (PS_L_AUTO_SHIFT_APLC_INITDataSet)request.getAttribute("ds");

	String monthOptionsHtml = null; // ��� ����Ʈ�� ������ options�� write�ϱ� ���� �ӽ� ����

	StringBuffer sb = new StringBuffer("");
	Calendar calendar = new GregorianCalendar(Locale.KOREA);
//    calendar.add(Calendar.YEAR, -1);

	String tempMonth = null;
	for(int i=0; i<13; i++){
		tempMonth = String.valueOf(calendar.get(Calendar.MONTH)+1);
		if(tempMonth.length()==1) {
    		tempMonth = "0" + tempMonth;
    	}
		sb.append("<option value=\"");
		sb.append(String.valueOf(calendar.get(Calendar.YEAR))+tempMonth);
		sb.append("\"");
		sb.append(">");
		sb.append(calendar.get(Calendar.YEAR) + "�� " + tempMonth + "��");
		sb.append("</option>");

		calendar.add(Calendar.MONTH, -1);
	}
	monthOptionsHtml = sb.toString();
%>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
<script language="javascript" src="/html/comm_js/common.js"></script>
<script language="javascript">
<!--
    // ����Ű ��Ƴ���
    function f_list_search() {
        if(event.keyCode == 13) list_search();
    }

    // û����� �˻�
    function ocom_list_search(curr_page_no) {
        if(curr_page_no!=null) {
            clam_ocom_search_form.curr_page_no.value = curr_page_no;
        }

        clam_ocom_search_form.method = "post";
        clam_ocom_search_form.action = "/ps/bill/1911";
        clam_ocom_search_form.target = "ifrm";

        clam_ocom_search_form.submit();

        //check_all(clam_ocom_search_form);
    }

    // �ڵ���ü����,û������ �� ��� ��ȸ
    function ocom_detl_list(startpage,shftclsfcd,bocd) {
    	var lo_form1 = document.clam_ssum_form;
        var lo_form2 = document.clam_ocom_search_form;

        lo_form2.basidt.value = lo_form1.basidt.value;
        lo_form2.shftclsfcd.value = shftclsfcd;
        lo_form2.bocd.value = bocd;

        lo_form2.curr_page_no.value = startpage;
        lo_form2.action = "/ps/bill/1911";
        lo_form2.target = "ifrm";
        lo_form2.submit();
    }

    // û����� �μ�
    function ocom_list_print() {
        clam_ocom_search_form.method = "post";
        clam_ocom_search_form.action = "/ps/bill/1916";
        clam_ocom_search_form.target = "ifrm";

        clam_ocom_search_form.submit();

        //check_all(clam_ocom_search_form);
    }

    // �� ������� �ʱ�ȭ
    function jsInit(){
        setEventHandler();
    	setEnterKeyEventHandler();
    	setInputBackgroundColor();
    } // jsInit

    // �� ��ȿ�� �˻� �� ����
    function check_all(form){
        if(!validate(form)) return false;
        else{
            makeValue(form);
            form.submit();
        }
    }

	// û�������� ��ȸ
    function list_search() {
    	var lo_form = document.clam_ssum_form;
    	if(lo_form.basidt.value=="") {
    		alert("û������ �ʼ��Է»����Դϴ�.");
    		return;
    	}

    	lo_form.action="/ps/bill/1906";
    	lo_form.target="ifrm";
    	lo_form.method="post";
    	lo_form.submit();
    }
-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle"></b>�ڵ���üû�����</td>
    </tr>
    <tr>
        <td height="10"> <!--������ ���� ����--> </td>
    </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
    <tr>
        <td> <!--�˻�-->
            <table width="830" border="0" cellspacing="0" cellpadding="2">
            	<form name="clam_ssum_form">
                <tr>
                    <td bgcolor="#EBE9DC"  width="70" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
                    </td>
                    <td bgcolor="#EBE9DC"  width="120" class="title">
                        <select name="bocd" size="1" class="sel_all" notEmpty caption="����">
                            <option value="">��ü</option>
                            <%=ds.intgbocdcurOptHtml("") %>
                        </select>
                    </td>

                    <td bgcolor="#EBE9DC" width="70"  class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">û����</td>
                    <td bgcolor="#EBE9DC" class="title"> <select name="basidt" class="sel_all">
                            <%=monthOptionsHtml%>
                        </select>
                        <input type="image" onclick="list_search();window.event.returnValue=false;" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle"> </td>
                </tr>
                <tr>
                    <td height="3" colspan="2"> <!--����--> </td>
                </tr>
                </form>
            </table>
            <!--�˻� ��-->
            <!--list -->
            <table width="830" border="0" cellpadding="1" cellspacing="0" class="gray" id="clam_ssum_id">
                <tr align="center" bgcolor="#dddddd">
                    <td width="100" class="gray">���籸��</td>
                    <td width="100" class="gray">��ü����</td>
                    <td width="100" class="gray">û���Ǽ�</td>
                    <td width="100" class="gray">û���ݾ�</td>
                    <td width="100" class="gray">�����Ǽ�</td>
                    <td width="100" class="gray">�����ݾ�</td>
                    <td width="100" class="gray">������</td>
                    <td width="100" class="gray">����۱ݾ�</td>
                </tr>
                <tr  bgcolor="#FFFFFF">
                    <td height="17" class="gray">&nbsp;</td>
                    <td height="17" class="gray">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                </tr>
                <tr  bgcolor="#FFFFFF">
                    <td height="17" class="gray">&nbsp;</td>
                    <td height="17" class="gray">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                </tr>
                <tr  bgcolor="#FFFFFF">
                    <td height="17" class="gray">&nbsp;</td>
                    <td height="17" class="gray">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                    <td class="gray" bgcolor="#FFFFFF" align="right">&nbsp;</td>
                </tr>
            </table></td>
    </tr>
    <tr>
        <td height="10"> <!------����--- --> </td>
    </tr>
    <tr>
        <td> <!--�˻� -->
            <table width="830" border="0" cellspacing="0" cellpadding="2">
            	<form name="clam_ocom_search_form" method="post" action="" >
                <input type="hidden" name="curr_page_no" value="1"><%--����������--%>
	            <input type="hidden" name="records_per_page" value="15"><%--���������� ���ڵ��--%>
	            <input type="hidden" name="js_fn_nm" value="ocom_list_search"><%--�������̵� �� ȣ��Ǵ� �ڹٽ�ũ��Ʈ �̸�--%>
                <tr>
                    <td bgcolor="#EBE9DC"  width="60" class="sea_top"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
                    </td>
                    <td bgcolor="#EBE9DC"  width="100" class="sea_top">
                        <select name="bocd" size="1" class="sel_all" notEmpty caption="����">
                            <option value="">��ü</option>
                            <%=ds.intgbocdcurOptHtml("") %>
                        </select>
                    </td>
                    <td bgcolor="#EBE9DC" width="60" class="sea_top"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">û����</td>
                    <td bgcolor="#EBE9DC" width="180" class="sea_top"> <select name="basidt" class="sel_all" id="basidt">
                            <%=monthOptionsHtml%>
                        </select> </td>
                    <td bgcolor="#EBE9DC" width="186" class="sea_top" colspan="2"> &nbsp;</td>
                    <input type="hidden" name="subsmappli" value="">
<!--                    <td bgcolor="#EBE9DC" width="86" class="sea_top"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��������</td>
                    <td bgcolor="#EBE9DC" width="100" class="sea_top"> <select name="subsmappli" class="sel_all" id="subsmappli">
                            <option value="" selected>����</option>
                            < %=monthOptionsHtml%>
                        </select> </td> -->
                    <td bgcolor="#EBE9DC" rowspan="2" align="right" width="48" class="sea_top"><input type="image" onclick="ocom_list_search(1);window.event.returnValue=false;" src="/html/comm_img/bu_search03.gif" width="39" height="35" border="0"></td>
                </tr>
                <tr>
                    <td bgcolor="#EBE9DC" width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">û�����</td>
                    <td bgcolor="#EBE9DC" width="100"> <select name="erryn" class="sel_all" id="erryn">
                            <option value="" selected>��ü</option>
                            <option value="N">����</option>
                            <option value="Y">����</option>
                        </select> </td>
                    <td bgcolor="#EBE9DC" width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�˻�����</td>
                    <td bgcolor="#EBE9DC" width="180"> <select name="sechcond" class="sel_all">
                            <option value="" selected>��ü</option>
                            <option value="20">������</option>
                            <option value="30">���ڹ�ȣ</option>
                        </select>
                        <input name="sechcont" type="text" size="13" class="text_box"> </td>
                    <td bgcolor="#EBE9DC" width="86"  ><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��ü����</td>
                    <td bgcolor="#EBE9DC" width="100"  > <select name="shftclsfcd" class="sel_all">
                            <option value="">��ü</option>
                            <%=ds.shftclsfOptHtml("")%>
                        </select> </td>
                </tr>
                <tr>
                    <td height="1" colspan="7" bgcolor="#927F5B"> <!--line--> </td>
                </tr>
                <tr>
                    <td height="3" colspan="7"> <!--����--> </td>
                </tr>
                </form>
            </table>
            <!--�˻� ��-->
            <!--title -->
            <table width="830" border="0" cellspacing="0" cellpadding="2">
                <tr>
                    <td bgcolor="#EBE9DC" class="title">�ڵ���ü û�� ��� ���</td>
                    <td bgcolor="#EBE9DC" width="80" class="title" align="right"><input type="image" onclick="ocom_list_print();window.event.returnValue=false;" src="/html/comm_img/bu_print.gif" width="39" height="19" border="0" align="absmiddle"></td>
                </tr>
                <tr>
                    <td height="3" colspan="2" align="right"> <!--����--> </td>
                </tr>
            </table>
            <!--list -->
            <table width="829" border="0" cellpadding="1" cellspacing="0" bgcolor="#ffffff" class="gray" id="clam_ocom_id">
                <tr>
                    <td width="60" bgcolor="#dddddd" class="gray" align="center"> û����</td>
                    <td width="60" bgcolor="#dddddd" class="gray" align="center"> ��������</td>
                    <td width="140" bgcolor="#dddddd" class="gray" align="center"> ���ڹ�ȣ </td>
                    <td height="16" bgcolor="#dddddd" width="110" class="gray" align="center"> ���ڸ�</td>
                    <td bgcolor="#dddddd" width="80" class="gray" align="center"> ��ü</td>
                    <td bgcolor="#dddddd" width="50" class="gray" align="center"> �μ�</td>
                    <td bgcolor="#dddddd" width="60" class="gray" align="center"> û���ݾ�</td>
                    <td bgcolor="#dddddd" width="80" class="gray" align="center"> ����</td>
                    <td bgcolor="#dddddd" width="50" class="gray" align="center"> ���</td>
                    <td bgcolor="#dddddd" width="70" class="gray" align="center"> �Աݿ��� </td>
                    <td bgcolor="#dddddd" width="220" class="gray" align="center"> ��������</td>
               </tr>
            <% for(int i=0; i<15; i++) { %>
              <tr>
                <td width="60" class="gray">&nbsp;</td>
                <td width="60" class="gray">&nbsp;</td>
                <td width="140" class="gray">&nbsp;</td>
                <td width="110" class="gray"height="16" >&nbsp;</td>
                <td width="80" class="gray">&nbsp;</td>
                <td width="50" align="right" class="gray">&nbsp;</td>
                <td width="60" align="right" class="gray">&nbsp;</td>
                <td width="80" align="center" class="gray">&nbsp;</td>
                <td width="50" align="center" class="gray">&nbsp;</td>
                <td width="70" align="center" class="gray">&nbsp;</td>
                <td width="220" class="gray">&nbsp;</td>
              </tr>
            <% } %>
                <tr bgcolor="#dddddd">
                    <td colspan="3" height="20" class="gray" style="border-right:0;"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�� <b>0�� </b><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">���� <b>0��</b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">���� <b><font color="red">0��</font></b></td>
                    <td colspan="8" height="20" class="gray" align="right" bgcolor="#dddddd"> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�� û���ݾ� <b>0��</b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">����ݾ� <b>0��</b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�����ݾ�<b> <font color="red">0��</font></b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">������<b> 0��</b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�����۱ݾ�<b> 0��</b></td>
                </tr>
            </table>
            <!---button-->
            <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="clam_ocom_nav_id">
                <tr>
                    <td align="center" height="2"> <!--����--> </td>
                </tr>
                <tr>
                    <td align="center" height="24" bgcolor="#E8E8E8"> <img src="/html/comm_img/bu_first01.gif" alt="10������ ������" width="17" height="15" border="0"> <img src="/html/comm_img/bu_prev01.gif" width="22" height="15"> <img src="/html/comm_img/bu_next01.gif" alt="����������" width="22" height="15" border="0"> <img src="/html/comm_img/bu_end01.gif" alt="10������ �ڷ�" width="17" height="15" border="0"></td>
                </tr>
            </table></td>
    </tr>
</table>
<br>
<br>
<iframe name="ifrm" width="100%" height="0"></iframe>
</body>
</html>
