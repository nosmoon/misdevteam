<%@ page contentType="text/html; charset=ksc5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_bil_1801_a.jsp
* ��� : ����-�ڵ���üû��������� �ʱ�ȭ��
* �ۼ����� : 2006-04-17
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
// dataset �ν��Ͻ� ���� �κ�
PS_S_BILL_SEPRDataSet ds=(PS_S_BILL_SEPRDataSet)request.getAttribute("ds"); //request dataset
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

    // ��û��� �˻�
    function list_search(curr_page_no) {
        if(curr_page_no!=null) {
            plan_search_form.curr_page_no.value = curr_page_no;
        }

        plan_search_form.method = "post";
        plan_search_form.action = "1806";
        plan_search_form.target = "ifrm";

        check_all(plan_search_form);
    }

    // ��û��� �μ�
    function list_print(curr_page_no) {
        if(curr_page_no!=null) {
            plan_search_form.curr_page_no.value = curr_page_no;
        }

        plan_search_form.method = "post";
        plan_search_form.action = "1811";
        plan_search_form.target = "ifrm";

        check_all(plan_search_form);
    }

    // �� ������� �ʱ�ȭ
    function jsInit(){
        setEventHandler();
    	setEnterKeyEventHandler();
    	setInputBackgroundColor();
    } // jsInit

    // �������������������� �� ����
/*
    function detail(rdr_no) {
    	var lo_form = document.rdr_detail_form;

		window.parent.leftFrame.location.replace("/ps/reader/1001");
		lo_form.rdr_no.value = rdr_no;
    	lo_form.target = "_self";
    	lo_form.action = "/ps/reader/1006";
    	lo_form.method = "post";
    	lo_form.submit();
    }
*/
    // �� ��ȿ�� �˻� �� ����
    function check_all(form){
        if(!validate(form)) return false;
        else{
            makeValue(form);
            form.submit();
        }
    }

// ��ü û������ ���(������������ ������)
function auto_cancel(rdr_no,medicd,termsubsno,agrmntseqarr) {
	var ls_check = confirm("����Ͻðڽ��ϱ�?");
	if (!ls_check) {
		return false;
	}

	var lo_form1 =document.plan_search_form;
	lo_form1.action="/ps/reader/1146?rdr_no="+rdr_no+"&medicd="+medicd+"&termsubsno="+termsubsno+"&agrmntseqarr="+agrmntseqarr;
	lo_form1.target= "ifrm";
	lo_form1.submit();

    list_search(lo_form1.curr_page_no.value);
}

-->
</script>
</head>
<body onload="jsInit()" bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle"></b>�ڵ���üû��Ȯ��</td>
    </tr>
    <tr>
        <td height="10"> <!--������ ���� ����--> </td>
    </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
    <tr>
        <td> <!--�˻�-->
            <table width="830" border="0" cellspacing="0" cellpadding="2" class="title1" bgcolor="#EBE9DC">
            <form name="plan_search_form">
            <input type="hidden" name="curr_page_no"        value="1"><%--����������--%>
            <input type="hidden" name="records_per_page"    value="20"><%--���������� ���ڵ��--%>
            <input type="hidden" name="js_fn_nm"            value="list_search"><%--�������̵� �� ȣ��Ǵ� �ڹٽ�ũ��Ʈ �̸�--%>
                <tr>
                    <td bgcolor="#EBE9DC"  width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
                    </td>
                    <td bgcolor="#EBE9DC"  width="120">
                        <select name="bocd" size="1" class="sel_all" notEmpty caption="����">
                            <option value="">����</option>
                            <%=ds.intgbocdcurOptHtml("") %>
                        </select>
                    </td>

                    <td bgcolor="#EBE9DC" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��ü����</td>
                    <td width="100"> <select name="rcpmmthd" class="sel_all">
                            <option value="">��ü</option>
                            <option value="110">�����ڵ���ü</option>
<!--                            <option value="120">����D.Oī����ü</option> -->
                            <option value="130">�Ϲ�ī����ü</option>
                        </select> </td>
                    <td width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">û�����</td>
                    <td width="50">
                    	<select name="clammthd" class="sel_all">
                    		<option value="">��ü</option>
                    		<option value="040">û��</option><!--�̼�-->
<!--
                            <option value="020">���</option>
                            <option value="030">�繫</option>
-->
                    	</select>
                    </td>
                    <td width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�˻�����</td>
                    <td> <select name="sechcond" class="sel_all">
                            <option value="">��ü</option>
                            <option value="10">�����ڸ�</option>
                            <option value="20">�����ڸ�</option>
                            <option value="30">�����ּ�</option>
                            <option value="40">���ڹ�ȣ</option>
                        </select>
                        <input name="sechcont" type="text" size="13" class="text_box">
                        <input type="image" onclick="list_search('1');window.event.returnValue=false" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle"> </td>
                </tr>
            </form>
            </table>
            <!--�˻� ��--> </td>
    </tr>
    <tr>
        <td height="10"> <!------����-----> </td>
    </tr>
    <tr>
        <td height="10"> <table width="830" border="0"  cellpadding="1" cellspacing="0">
                <tr>
                    <td  height="27" bgcolor="#EBE9DC" class="title" width="681"><%=Util.getYear()%>�� <%=Util.getMonth()%>�� �ڵ���ü û�� ���� ���</td>
                    <td  height="27" bgcolor="#EBE9DC" class="title" width="145" align="right"><input type="image" onclick="list_print(1);window.event.returnValue=false;" src="/html/comm_img/bu_print.gif" width="39" height="19" border="0"></td>
                </tr>
                <tr>
                    <td height="3" colspan="2"> <!--����--> </td>
                </tr>
            </table>
            <!--list -->
            <table width="830" height="215" border="0" cellpadding="1" cellspacing="0" bgcolor="#ffffff" class="gray" id="plan_list_id">
                <tr align="center">
                    <td bgcolor="#dddddd" class="gray" width="130"> ���ڹ�ȣ </td>
                    <td bgcolor="#dddddd" class="gray" width="100"> ������ </td>
                    <td bgcolor="#dddddd" class="gray" width="100"> ��ü </td>
                    <td bgcolor="#dddddd" class="gray" width="80"> û����(��) </td>
                    <td bgcolor="#dddddd" class="gray" width="100"> ��ü���� </td>
                    <td bgcolor="#dddddd" class="gray" width="80"> û������ </td>
                    <td bgcolor="#dddddd" class="gray" width="100"> �������� </td>
                    <td bgcolor="#dddddd" class="gray" width="100"> �������� </td>
<!--                    <td bgcolor="#dddddd" class="gray" width="40"> ��� </td> -->
                </tr>
            <% for(int i=0;i<20;i++) { %>
              <tr>
                <td class="gray">&nbsp;</td>
                <td class="gray">&nbsp;</td>
                <td class="gray">&nbsp;</td>
                <td class="gray">&nbsp;</td>
                <td class="gray">&nbsp;</td>
                <td class="gray">&nbsp;</td>
                <td class="gray">&nbsp;</td>
                <td class="gray">&nbsp;</td>
<!--                <td class="gray">&nbsp;</td> -->
              </tr>
            <% } %>
                <tr align="right" bgcolor="#dddddd">
                    <td colspan="9" height="23" class="gray"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�� �Ǽ� <b>0��</b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�� û���� <b>0��</b></td>
                </tr>
            </table>
            <!---button-->
            <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="plan_nav_id">
                <tr>
                    <td align="center" height="2"> <!--����--> </td>
                </tr>
                <tr>
                    <td align="center" height="24" bgcolor="#E8E8E8"> <img src="/html/comm_img/bu_first01.gif" alt="10������ ������" border="0"> <img src="/html/comm_img/bu_prev01.gif"> <img src="/html/comm_img/bu_next01.gif" alt="����������" border="0"> <img src="/html/comm_img/bu_end01.gif" border="0" alt="10������ �ڷ�"></td>
                </tr>
            </table></td>
    </tr>
</table>
<br>
<br>
<form name="rdr_detail_form">
	<input type="hidden" name="rdr_no">
</form>
<iframe name="ifrm" width="100%" height="0"></iframe>
</body>
</html>
