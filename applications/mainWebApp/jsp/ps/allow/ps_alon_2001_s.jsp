<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_alon_2001_s.jsp
* ��� : ��� �����ޱ� �ʱ�ȭ��
* �ۼ����� : 2004-03-09
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    // ȭ��� ������ Row��
    String records_per_page = "15";
    int li_per = Integer.parseInt(records_per_page) ;
    // dataset �ν��Ͻ� ���� �κ�
    PS_S_EMP_ALON_BASEDataSet ds=(PS_S_EMP_ALON_BASEDataSet)request.getAttribute("ds"); //request dataset
%>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
// �ʱ�ȭ
function jsInit(){
    setEventHandler();
    //setEnterKeyEventHandler();
}
// �����ȣ�� ����Ʈ ��ȸ
function list_search(curr_page_no)
{
    var lo_form1 = document.code_search_form;
    var ls_boemp_no_from = trim(lo_form1.boemp_no_from.value); //�����ȣ from
    var ls_boemp_no_to = trim(lo_form1.boemp_no_to.value);   //�����ȣ to

    lo_form1.yymm.value = lo_form1.chk_yymm.value;
    //������� check�Ѵ�.
    if(window.event) window.event.returnValue = false;
    if(!validate(lo_form1)){
    	return;
    }

    //�����ȣ1 5�ڸ� ����
    if (ls_boemp_no_from.length > 0) {
        ls_boemp_no_from = lpad(ls_boemp_no_from,5,'0');
        lo_form1.boemp_no_from.value = ls_boemp_no_from;
    }

    //�����ȣ2 5�ڸ� ����
    if (ls_boemp_no_to.length > 0) {
        ls_boemp_no_to = lpad(ls_boemp_no_to,5,'0');
        lo_form1.boemp_no_to.value = ls_boemp_no_to;
    }

    //��ϳ�� üũ
    if(!isDate(lo_form1.chk_yymm.value+'01')) {
        alert('��ϳ���� ���Ŀ� ���� �ʽ��ϴ�.');
        lo_form1.chk_yymm.focus();
        lo_form1.chk_yymm.select();
        return;
    }


    makeValue(lo_form1);
    lo_form1.curr_page_no.value = curr_page_no ;
    lo_form1.aloncd.value= "09" ; // �����ޱ�
    lo_form1.action = "/ps/allow/2006";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}
//�μ��ڵ带 ��ȸ�Ѵ�
function search_dept(){
    var lo_form1 = document.code_search_form;
        lo_form1.action = "/ps/common/1301";
        lo_form1.target = "ifrm";
        lo_form1.method = "post";
        lo_form1.submit();
}
// ������ �̵�
function page_move(curr_page_no) {
    var o_form3 = document.code_search_form;

    if(!curr_page_no) {
        o_form3.curr_page_no.value = '1';
    } else {
        o_form3.curr_page_no.value = curr_page_no;
    }
    list_search(curr_page_no);
}

// ���� �󼼺���
function boemp_view(emp_code) {
	var lo_form1 = document.code_search_form;
    var lo_form2 = document.emp_detail_form;

    lo_form2.bocd.value = lo_form1.bocd.value;
	lo_form2.emp_code.value = lpad(emp_code,5,'0');
    lo_form2.supp_yymm.value = lo_form1.chk_yymm.value;

	lo_form2.action = "/ps/allow/2016";
	lo_form2.target = "ifrm";
	lo_form2.submit();
}


// ���õ� ��������� �����Ѵ�
function ins_alon(){
    var lo_form = document.code_search_form;

    if(!validate(lo_form)){
        return;
    }

    makeValue(lo_form);

    var ls_yymm          = ""; // ��ϳ��
    var ls_boemp_no      = ""; // ���õ� �����ȣ�� ��´�
    var ls_realprsntdds  = ""; // ����ϼ�
    var ls_ddprsntalon   = ""; // ������ټ���
    var ls_amt           = 0;  // �ݾ�
    var len              = 0;
    var count            = 0;

        if(lo_form.insChk){
            len = lo_form.insChk.length;
        }else{
            alert ("�ش� ����� �����ϼ���!");
            return ;
        }

    makeValue(lo_form);

    //��ϳ�� üũ
    if(!isDate(lo_form.yymm.value+'01')) {
        alert('��ϳ���� ���Ŀ� ���� �ʽ��ϴ�.');
        lo_form.yymm.focus();
        lo_form.yymm.select();
        return;
    }

/*
    //�������� üũ
    if(!isDate(lo_form.paydate.value)) {
        alert('�������ڰ� ���Ŀ� ���� �ʽ��ϴ�.');
        lo_form.paydate.focus();
        lo_form.paydate.select();
        return;
    }
*/

    if (lo_form.insChk.length==null) { // �ϳ��� check�ڽ��� ���õȰ��
            if(lo_form.insChk.checked) { // check�Ȱǿ� ���Ͽ� ����Ÿ �Է�
                ls_boemp_no = ls_boemp_no + lo_form.boemp_no.value ;
                ls_yymm = ls_yymm + lo_form.yymm.value ;
                ls_realprsntdds =  ls_realprsntdds + "";
                ls_ddprsntalon =  ls_ddprsntalon + "";
                ls_amt = eval(ls_amt) + eval(lo_form.amt[0].value) ;
                count++;
            }
   } else{  // �������� check �ڽ��� ���õȰ��
        for (var i=0; i<len; i++){
            if(lo_form.insChk[i].checked) { // check�Ȱǿ� ���Ͽ� ����Ÿ �Է�
                if (lo_form.yymm.value == ""){
                    alert("��ϳ���� �Է��ϼ���!");
                    return;
                }
                if(ls_boemp_no == "" ) {  // �����Է½� ������ �����Ѵ�
                    ls_boemp_no = ls_boemp_no + lo_form.boemp_no[i].value ;
                    ls_yymm = ls_yymm + lo_form.yymm.value;
                    ls_realprsntdds =  ls_realprsntdds + "";
                    ls_ddprsntalon =  ls_ddprsntalon + "";
                    ls_amt = ls_amt + lo_form.amt[i].value ;
                    count++;
                } else {  // �ι�° ���ĺ��� ���а��� �ִ´�
                    ls_boemp_no = ls_boemp_no + '##' + lo_form.boemp_no[i].value ;
                    ls_yymm = ls_yymm + '##' + lo_form.yymm.value;
                    ls_realprsntdds = ls_realprsntdds + '##' + "";
                    ls_ddprsntalon = ls_ddprsntalon + '##' + "";
                    ls_amt = ls_amt + '##' + lo_form.amt[i].value ;
                    count++;
                }
            }
        }
   }

    if(count ==0) { // delete ó����� �Ѱǵ� ���� ��
        alert("���� ������ �����ϼ���.");
        return;
    }

    var ls_check = confirm("���� �Ͻðڽ��ϱ�?");
    if (!ls_check)  return;

    lo_form.ls_boemp_no.value = ls_boemp_no ;
    lo_form.ls_yymm.value = ls_yymm ;
    lo_form.ls_realprsntdds.value = ls_realprsntdds ;
    lo_form.ls_ddprsntalon.value = ls_ddprsntalon ;
    lo_form.ls_amt.value = ls_amt ;

    lo_form.action = "/ps/allow/2011";
    lo_form.target = "ifrm";

    lo_form.submit();
}
// üũ�ڽ��ϰ� ó��
function chkboxAll(){

    var lo_form = document.code_search_form;

    var ls_len  = "" ; // ��üüũ����ұ���

    if(!lo_form.insChk){
        return ;
    }

    if (!lo_form.insChk.length) { // �ϳ��� check�ڽ��� ���õȰ��
        ls_len = 1 ;
    }else{
        ls_len = lo_form.insChk.length ;
    }

    var ls_chk = "" ;
    if ( ls_len == 1 ){
        if (lo_form.checkall.checked){ // ��ü����
            lo_form.insChk.checked = true ;
        }else{
            lo_form.insChk.checked = false ;
        }
    }else{
        if (lo_form.checkall.checked){ // ��ü����
    	    for (var i=0; i<ls_len; i++){
       		lo_form.insChk[i].checked = true ;
    	    }
        }else{ // ��ü���
    	    for (var i=0; i<ls_len; i++){
       		lo_form.insChk[i].checked = false ;
    	    }
        }
    }
}

// �����ޱݻ� ����
function boemp_edit()
{
    var lo_form = document.emp_detail_form;

    if(lo_form.boemp_no.value.length != 5) {
        alert("�����ڵ�� �ݵ�� 5�ڸ��̾�� �մϴ�");
        lo_form.boemp_no.focus();
        return false;
    }

    if(lo_form.remk.value.length >500) { alert("���ѱ��ڼ��� �ʰ��Ͽ����ϴ�."); return false;}
    if(!validate(lo_form)) { return false; }
    else{
        makeValue(lo_form);
    }

    lo_form.action = "/ps/allow/2021";
    lo_form.target = "ifrm";
    lo_form.method = "post";
	lo_form.submit();
}

function fssubs_sum() {
    var lo_form = document.emp_detail_form;	// ������ ��
    var lo_tel_charge,lo_resp_subs,lo_subs_susp,lo_pay_adv,lo_mutu_aid,lo_loan,lo_loan_interest,lo_subs_num,lo_etc1,lo_etc2,lo_etc3;
    lo_subs_num = 0;
    lo_tel_charge  = parseInt(deleteCommaStr(lo_form.tel_charge.value));
    lo_resp_subs   = parseInt(deleteCommaStr(lo_form.resp_subs.value));
    lo_subs_susp   = parseInt(deleteCommaStr(lo_form.subs_susp.value));
    lo_pay_adv     = parseInt(deleteCommaStr(lo_form.pay_adv.value));
    lo_mutu_aid    = parseInt(deleteCommaStr(lo_form.mutu_aid.value));
    lo_loan        = parseInt(deleteCommaStr(lo_form.loan.value));
    lo_loan_interest  = parseInt(deleteCommaStr(lo_form.loan_interest.value));
    lo_etc1        = parseInt(deleteCommaStr(lo_form.etc1.value));
    lo_etc2        = parseInt(deleteCommaStr(lo_form.etc2.value));
    lo_etc3        = parseInt(deleteCommaStr(lo_form.etc3.value));
    lo_etc4        = parseInt(deleteCommaStr(lo_form.etc4.value));

    if(!isNumber(lo_tel_charge) || !isNumber(lo_resp_subs) ||
       !isNumber(lo_subs_susp)  || !isNumber(lo_pay_adv)   ||
       !isNumber(lo_mutu_aid)   || !isNumber(lo_loan)      || !isNumber(lo_loan_interest) ||
       !isNumber(lo_etc1)       || !isNumber(lo_etc2)      || !isNumber(lo_etc3)          || !isNumber(lo_etc4)) {
        alert("���ڸ� �Է��ϼ���");
        return false;
    } else {
        lo_subs_num = lo_tel_charge+lo_resp_subs+lo_subs_susp+lo_pay_adv+lo_mutu_aid+lo_loan+lo_loan_interest+lo_etc1+lo_etc2+lo_etc3+lo_etc4;
    }
    lo_form.subs_sum.value = lo_subs_num;
    setEventHandler();
    return;
}

function isNumber(num) {
    re = /^[0-9]*[0-9]$/;

    if (re.test(num)) {
        return	true;
    }

    return	false;
}

// �����ȣ�� ����Ʈ ��ȸ
function list_print()
{
	var lo_form1 = document.code_search_form;
	var ls_boemp_no_from = trim(lo_form1.boemp_no_from.value); //�����ȣ from
	var ls_boemp_no_to = trim(lo_form1.boemp_no_to.value);   //�����ȣ to

    lo_form1.yymm.value = lo_form1.chk_yymm.value;
	//������� check�Ѵ�.
	if(window.event) window.event.returnValue = false;
	if(!validate(lo_form1)){
		return;
	}
	//�����ȣ1 5�ڸ� ����
	if (ls_boemp_no_from.length > 0) {
		ls_boemp_no_from = lpad(ls_boemp_no_from,5,'0');
		lo_form1.boemp_no_from.value = ls_boemp_no_from;
	}

	//�����ȣ2 5�ڸ� ����
	if (ls_boemp_no_to.length > 0) {
		ls_boemp_no_to = lpad(ls_boemp_no_to,5,'0');
		lo_form1.boemp_no_to.value = ls_boemp_no_to;
	}
	makeValue(lo_form1);

	lo_form1.aloncd.value= "09" ; // �����ޱ�
	lo_form1.action = "/ps/allow/2026";
	lo_form1.target = "ifrm";
	lo_form1.submit();
}

//-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsInit();"  >
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle">����
      &gt; </b>�����ޱ�</td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���� ����-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
  <tr>
	<td valign="top">
	<!--�˻����� ������ -->
	<table width="500" border="0" cellspacing="0" cellpadding="2">

		<!--<table width="830" border="0" cellspacing="0" cellpadding="0" align="center"> -->
<form name="code_search_form" method="post" action="" onsubmit="list_search(1)">
    <input name="curr_page_no" type="hidden" value ="1">
		<input name="records_per_page"  type="hidden" value="<%=records_per_page%>"> <!--//ȭ�鿡 ������  ROW��-->
    <input name="js_fn_nm" type="hidden" value ="page_move">
    <input name="aloncd" type="hidden" value ="09"><!--//�����ޱݱ��� ��-->
    <input name="ls_boemp_no" type="hidden" value =""><!--//�����ȣ ��-->
    <input name="ls_yymm" type="hidden" value =""><!--//��� ��-->
    <input name="ls_realprsntdds" type="hidden" value =""><!--//������ϼ� ��(Ư�������� �������)-->
    <input name="ls_ddprsntalon" type="hidden" value =""><!--//������ټ��� ��(Ư�������� �������)-->
    <input name="ls_amt" type="hidden" value =""><!--/�ݾ� ��-->
		<tr>
<td>
      <!--search-->
			<table width="500" border="0" cellspacing="0" cellpadding="2" class="title1" bgcolor="#EBE9DC">
        <tr>
          <td bgcolor="#EBE9DC" width="700"  >
          <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����<font color="red">*</font>
            <select name="bocd" class="sel_all" onchange="search_dept()" caption="����" notEmpty >
              <option value="" >����</option>
              <%=ds.asinbocdcurOptHtml("")%>
            </select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�μ�
            <select id="bodept_sel" name="deptcd" class="sel_all">
              <option value="" >��ü</option>
            </select>&nbsp;&nbsp;&nbsp;&nbsp;<BR>
            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�����ȣ
            <input name="boemp_no_from" type="text" size="5" class="text_box" value="" maxlength="5" dataType="number" caption="�����ȣ">
            -
            <input name="boemp_no_to" type="text" size="5" class="text_box" value="" maxlength="5" dataType="number" caption="�����ȣ"> &nbsp;&nbsp;&nbsp;&nbsp;
            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���<font color="red">*</font>
            <input name="chk_yymm" type="text" size="8" class="text_box" value=""  notEmpty caption="���" >
            </td>
           <td bgcolor="#EBE9DC" width="100" align="right" >
           <input type="image" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="list_search(1);window.event.returnValue=false;" tabIndex="4">
           </td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td height="3">
      <!--���� -->
    </td>
  </tr>
  <tr>
    <td valign="top">
      <!--Ÿ��Ʋ -->
			<table width="500" border="0" cellspacing="0" cellpadding="2">
        <tr>
          <td height="27" class="title" bgcolor="#EBE9DC"><b>�����ޱݸ��</b></td>
				<td width="*"    height="27" class="title" bgcolor="#EBE9DC" align="left">
					��ϳ��<font color="red">*</font>
					<input name="yymm" type="text" size="6" maxlength="6" class="text_box" dataType="number" caption="��ϳ��" value="">&nbsp;&nbsp;&nbsp;&nbsp;
				</td>
				<td width="100"   height="27" class="title" bgcolor="#EBE9DC" align="right">
					<img src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="ins_alon();window.event.returnValue=false;">&nbsp;
					<img src="/html/comm_img/bu_print.gif" width="39" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="list_print();window.event.returnValue=false;">
          </td>
        </tr>
        <tr>
          <td height="3" colspan="2">
            <!--����-->
          </td>
        </tr>
      </table>
      <!--����Ʈ -->
			<table width="500"  cellspacing="0" cellpadding="1" border="0" bgcolor="#FFFFFF" class="gray" id="code_list" >
        <tr align="center">
          <td width="30" align="center" bgcolor="#dddddd" class="gray">
            <input type="checkbox" name="checkbox2" value="checkbox">
          </td>
          <td width="100" bgcolor="#dddddd" class="gray" align="center" > �Ҽ����� </td>
          <td width="100" bgcolor="#dddddd" class="gray" align="center" > �����ȣ </td>
          <td width="100" bgcolor="#dddddd" class="gray" align="center" > ����� </td>
          <td width="100" bgcolor="#dddddd" class="gray" align="center" > �μ��� </td>
          <td width="100" bgcolor="#dddddd" class="gray" align="center" > �ݾ� </td>
        </tr>
<%
	for ( int i= 0 ; i < li_per ; i++ ) {
%>
        <tr>
          <td width="30"  class="gray" align="center" >&nbsp;</td>
          <td width="100" class="gray">&nbsp;</td>
          <td width="100" class="gray">&nbsp;</td>
          <td width="100" class="gray">&nbsp;</td>
          <td width="100" class="gray">&nbsp;</td>
          <td width="100" class="gray" align="center"  >
          &nbsp;
          </td>
        </tr>
<%
	}
%>
      </table>
      <!---button-->
			<table width="500" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="list_page" >
        <tr>
          <td align="center" height="2">
            <!--����-->
          </td>
        </tr>
        <tr>
          <td align="center" height="24" bgcolor="#E8E8E8">
                <div align="center">
                <!--JSP PAGE START---------------------------------------------------------------------------------->
                <jsp:include page="/jsp/ps/comm_jsp/page_navigator.jsp">
                <jsp:param name = "curr_page_no" 		value="0"/>
                <jsp:param name = "total_records" 		value="0"/>
                <jsp:param name = "js_fn_nm" 	        value="js_page_navigator"/>
                <jsp:param name = "records_per_page" 	value="15"/>
                <jsp:param name = "page_set_gubun" 		value="0"/>
                </jsp:include>
                <!--JSP PAGE END------------------------------------------------------------------------------------>
                </div>
          </td>
        </tr>
      </table>
    </td>
  </tr>
		</form>
	</table>
	</td>

	<td valign="top">
		<table width="330" border="0"  cellpadding="1" cellspacing="0">
			<tr>
				<td  height="27" bgcolor="#EBE9DC" class="title"><b>�����ޱ� ������</b></td>
				<td  height="27" bgcolor="#EBE9DC" class="title"  align="right">(<font color="red">*</font>
					�ʼ��׸�)</td>
				</tr>
				<tr>
				<td height="3" colspan="2">
				<!--����-->
				</td>
			</tr>
		</table>
		<!-- �������� ���� -->
		<table id="emp_detail_id" width="330" border="0"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#FFFFFF">
			<form name="emp_detail_form" method="post" action="" >
                <input name="bocd"      type="hidden" value="">
				<input name="emp_code"  type="hidden" value="">
                <input name="supp_yymm" type="hidden" value="">
				<tr >
				<td width="120" class="gray" bgcolor="#dddddd"> �����ڵ�<font color="red">*</font></td>
				<td class="gray">
					<input name="boemp_no" type="text" size="5" class="readonly_box" tabIndex="1" caption="�����ڵ�" dataType="integer" minValue="00001" maxValue="99999" notEmpty  maxlength="5" readonly>
				</td>
				</tr>
				<tr >
				<td width="120" class="gray" bgcolor="#dddddd"> ������<font color="red">*</font></td>
				<td class="gray">
					<input name="flnm" type="text" size="12" tabIndex="2" class="readonly_box" caption="������" notEmpty readonly>
				</td>
				</tr>

				<tr >
					<td width="120" class="gray" bgcolor="#dddddd"> ��ȭ��ȣ </td>
					<td class="gray">
						<input name="tel1" type="text" size="4" tabIndex="3" class="readonly_box" dataType="integer" readonly>
						<input name="tel2" type="text" size="4" tabIndex="4" class="readonly_box" dataType="integer" readonly>
						<input name="tel3" type="text" size="4" tabIndex="5" class="readonly_box" dataType="integer" readonly>
					</td>
				</tr>

				<tr  >
					<td bgcolor="#dddddd" width="120" class="gray"> ��ȭ��� </td>
					<td class="gray">
					<input name="tel_charge" type="text" size="12"  maxlength="12" class="text_box" caption="��ȭ���" tabIndex="6" dataType="integer">
					</td>
				</tr>
				<tr  >
					<td bgcolor="#dddddd" width="120" class="gray"> å�Ӱ� ���� </td>
					<td class="gray">
					<input name="resp_subs type="text" size="12"  maxlength="12"  class="text_box" caption="å�Ӱ� ����" tabIndex="7" dataType="integer">
					</td>
				</tr>

				<tr >
					<td width="120" class="gray" bgcolor="#dddddd"> �������� </td>
					<td class="gray">
					<input name="subs_susp" type="text" size="12" tabIndex="8" class="text_box" caption="��������" dataType="integer">
					</td>
				</tr>
				<tr>
					<td width="120" class="gray" bgcolor="#dddddd"> ���ұ� </td>
					<td class="gray">
					<input name="pay_adv" type="text" size="12" tabIndex="9" class="text_box" caption="���ұ�" dataType="integer">
					</td>
				</tr>
				<tr>
					<td width="120" class="gray" bgcolor="#dddddd"> ����ȸ�� </td>
					<td class="gray">
					<input name="mutu_aid" type="text" size="12" tabIndex="10" class="text_box" caption="����ȸ��" dataType="integer">
					</td>
				</tr>
				<tr>
					<td width="120" class="gray" bgcolor="#dddddd"> �뿩�� </td>
					<td class="gray">
					<input name="loan" type="text" size="12" tabIndex="11" class="text_box" caption="�뿩��" dataType="integer">
					</td>
				</tr>
				<tr>
					<td width="120" class="gray" bgcolor="#dddddd"> �뿩������ </td>
					<td class="gray">
					<input name="loan_interest" type="text" size="12" tabIndex="12" class="text_box" caption="�뿩������" dataType="integer">
					</td>
				</tr>
				<tr>
					<td width="120" class="gray" bgcolor="#dddddd"> DC�ݾ�  </td>
					<td class="gray">
					<input name="etc2" type="text" size="12" tabIndex="13" class="text_box" caption="DC�ݾ�" dataType="integer">
					</td>
				</tr>
				<tr>
					<td width="120" class="gray" bgcolor="#dddddd"> ���ʽ����߰��߼�  </td>
					<td class="gray">
					<input name="etc3" type="text" size="12" tabIndex="14" class="text_box" caption="���ʽ����߰��߼�" dataType="integer">
					</td>
				</tr>
				<tr>
					<td width="120" class="gray" bgcolor="#dddddd"> �ݼۺ�  </td>
					<td class="gray">
					<input name="etc4" type="text" size="12" tabIndex="15" class="text_box" caption="�ݼۺ�" dataType="integer">
					</td>
				</tr>
				<tr>
					<td width="120" class="gray" bgcolor="#dddddd"> ��Ÿ  </td>
					<td class="gray">
					<input name="etc1" type="text" size="12" tabIndex="16" class="text_box" caption="��Ÿ" dataType="integer">
					</td>
				</tr>
				<tr>
					<td width="120" class="gray" bgcolor="#dddddd"> �������հ� </td>
					<td class="gray">
					<input name="subs_sum" type="text" size="12" tabIndex="17" class="text_box" caption="�������հ�" dataType="integer">
					</td>
				</tr>
				<tr >
					<td width="120" class="gray" bgcolor="#dddddd" height="105"> ��� </td>
					<td class="gray" height="105">
					<textarea name="remk" class="Input_textarea" cols="30" rows="7" tabIndex="18"></textarea>
					</td>
				</tr>
			</form>
		</table>
		<!-- ������ �� �� -->
		<table width="330" border="0" cellspacing="0" cellpadding="0" class="title2">
			<tr>
				<td align="center" height="2">
				<!--����-->
				</td>
			</tr>
			<tr>
				<td align="center" height="24" bgcolor="#E8E8E8">
				<img src="/html/comm_img/bu_edit.gif" onClick="boemp_edit();"
				style="cursor:hand;" width="39" height="19" align="absmiddle" border="0">
				</td>
			</tr>
		</table>
	</td>
</tr>
</table>
<br>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width=100 height=0></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
