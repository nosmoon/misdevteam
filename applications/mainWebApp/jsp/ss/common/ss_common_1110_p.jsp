<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_common_1110_a.jsp
* ��� : ���� �˻� �˾�
* �ۼ����� : 2003-12-08
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<html>
<head>
<title>::: ����ã��::::</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">

<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
// �̺�Ʈ ����
window.returnValue	 = "";

// �̺�Ʈ �ڵ鷯 �ʱ�ȭ
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
    init();
    check_enter_search();
    document.bo_search_form.srch_word.focus();
}

// ���� �Ű����� ó��
function init(){
    var lo_form = document.bo_search_form;

    var ls_args = ":"; // dialog argument
    // dialog�� argument�� ������ ���ڿ��� ":" �� split
    if(window.dialogArguments){
       if(window.dialogArguments.indexOf(":") == -1){
           alert("��ȿ���� ���� arguments �Դϴ�.");
           window.returnValue = "";
           window.close();
        }
       ls_args = window.dialogArguments;
    }
    ga_args = ls_args.split(":");  	//ga_args[0] �μ��ڵ�, ga_args[1] �����ڵ�

    if(ga_args[0] != ""){ 			//�μ��ڵ�
		lo_form.deptcd.value = ga_args[0];
    }
    if(ga_args[1] != ""){ 			//�����ڵ�
		lo_form.areacd.value = ga_args[1];
    }
    if(ga_args[2] != ""){ 			//���������
		lo_form.bonm.value   = ga_args[2];
    }

}

// ����Ű�� ���� �˻� ����� �������� ���� ��� ���������� �˻��� �����Ѵ�.
function check_enter_search(){
    var lo_form1 = document.bo_search_form;

	if(lo_form1.bonm.value != ''){
		lo_form1.addr3.value = '';
	    lo_form1.action = "/ss/common/1115";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	}	 
}

// �� ��ȿ�� üũ
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// ����,�μ�,�������� ����
function popup_select(bocd, bonm, deptcd, deptnm, areacd, areanm){
    window.returnValue = bocd+"\n"+bonm+"\n"+deptcd+"\n"+deptnm+"\n"+areacd+"\n"+areanm;
    window.close();
}

//�� ���� �˻�
function list_search(){
    var lo_form1 = document.bo_search_form;


	if(isEmpty(lo_form1.srch_word)){
		alert("�˻���� �ʼ��Է��׸� �Դϴ�.");
        lo_form1.srch_word.focus();
        lo_form1.srch_word.select();
		return
	}
	if(jsGetCheckedValue(lo_form1,"flag") == "0"){ //���������� �˻��� ���
		lo_form1.addr3.value = "";
		lo_form1.bonm.value = lo_form1.srch_word.value;
    }else{ //�������� �˻��� ���
		lo_form1.addr3.value = lo_form1.srch_word.value;
		lo_form1.bonm.value = "";
    }

    lo_form1.action = "/ss/common/1115";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}


/*
// �� ���� �˻�
function list_search_addr3(){
    var lo_form1 = document.bo_search_form;

    // ��/��/�� �Է���  "/ss/common/1115" �������� ������
	if(lo_form1.addr3.value == ''){
		alert("��/��/���� �Է��ϼ���");
		return
	}

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

	lo_form1.bonm.value = '';
    lo_form1.action = "/ss/common/1115";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ������ ���� �˻�
function list_search_bonm(){
    var lo_form1 = document.bo_search_form;

    // ������ �Է��� "/ss/common/1115" �������� ������
	if(lo_form1.bonm.value == ''){
		alert("�����̸��� �Է��ϼ���");
		return
	}

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

	lo_form1.addr3.value = '';
    lo_form1.action = "/ss/common/1115";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}
*/


// �˾� ����
function close_modal(){
    window.close();
}

// rowspan �Ǿ� �ִ� 2���� �ο쿡�� ���콺 OUT �� ���� ���� /
function change_row_color_out(obj){
	// ����� �����ϴ� ���̺�
	lo_table = obj.parentNode;
    for (i=0; i < lo_table.rows.length; i++) {
    	if(lo_table.rows(i) == obj){
            lo_table.rows(i).style.backgroundColor = "#F2F2F2";
			if( (i%2) == 0 && lo_table.rows(i-1) != null){	    // ¦���̸� �ڽź��� 1 �� ���� Ȧ�� �ο���� ����
                lo_table.rows(i-1).style.backgroundColor = "#F2F2F2";
			}else if( (i%2) == 1 && lo_table.rows(i+1) != null){	// Ȧ���̸� �ڽź��� 1 �� ū ¦�� �ο���� ����
                lo_table.rows(i+1).style.backgroundColor = "#F2F2F2";
			}
        }
    }
}

// rowspan �Ǿ� �ִ� 2���� �ο쿡�� ���콺 IN �� ���� ����
function change_row_color_in(obj){
	// ����� �����ϴ� ���̺�
	lo_table = obj.parentNode;
    for (i=0; i < lo_table.rows.length; i++) {
    	if(lo_table.rows(i) == obj){
            lo_table.rows(i).style.backgroundColor = "#CCCCBB";
			if( (i%2) == 0 && lo_table.rows(i-1) != null){	    // ¦���̸� �ڽź��� 1 �� ���� Ȧ�� �ο���� ����
                lo_table.rows(i-1).style.backgroundColor = "#CCCCBB";
			}else if( (i%2) == 1 && lo_table.rows(i+1) != null){	// Ȧ���̸� �ڽź��� 1 �� ū ¦�� �ο���� ����
                lo_table.rows(i+1).style.backgroundColor = "#CCCCBB";
			}
        }
    }
}

// Enter Key ó��
function check_enter(flag) { 
	if(event.keyCode == 13){
		if(flag == '1'){
			list_search_addr3();
		}else if(flag =='2'){
			list_search_bonm();
		}  
	} 
}

-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsInit()">
<!--�˾� ������ 450*270-->
<table width="700" border="0" cellspacing="0" cellpadding="0" height="450">
	<tr>
		<td height="76">
			<!--top img -->
			<table width=100% border=0 cellpadding=0 cellspacing=0>
				<tr>
					<td width="16"> <img src="/html/comm_img/bo_find_01.gif" width=16 height=76 ></td>
					<td width=72> <img src="/html/comm_img/bo_find_02.gif" width=72 height=76 ></td>
					<td width=133> <img src="/html/comm_img/bo_find_03.gif" width=133 height=76 ></td>
					<td background="/html/comm_img/zip_find_04.gif" >&nbsp;</td>
				</tr>
			</table>
		<!--top img end -->
		</td>
	</tr>
  	<tr>
    	<td align="center" class="pup" valign="top">
			<!--���� �˻� �Է� �κ� ����-->
			<table width="680" border="0" cellspacing="0" cellpadding="1">
<form name="bo_search_form" method="post" action="" >
	<input name="deptcd" type="hidden" value ="">		<!-- �μ��ڵ� -->
	<input name="areacd" type="hidden" value ="">	    <!-- �����ڵ� -->
	<input type="hidden" name="addr3" value="">
	<input type="hidden" name="bonm" value="">
                <tr>
					<td><img src="/html/comm_img/ic_arr02.gif" width="7" height="11"></td>
					<td>'�������� Ȥ�� ��/��/��'�Է��� �����Ͻ� ��, �˻�� �Է��Ͻð� '<font color="#0066cc">����ã��</font>'�� Ŭ���� �ּ���.( * �� ������� )</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;<input type="radio" name="flag" value="0" checked>������
                        <input type="radio" name="flag" value="1">��/��/��&nbsp;&nbsp;
						<input size="16" id="srch_word" name="srch_word" class="text_box" onkeydown="if(window.event.keyCode=='13'){list_search();window.event.returnValue=false;}" title="��/��/�� �Է½ÿ��� ��/��/�� ���ڴ� �����ϰ� �Է��ϼ���.">
						<input type="image" src="/html/comm_img/bu_findgi.gif" board="0" border="0" align="absmiddle" width="64" height="19"  onclick='list_search();window.event.returnValue=false;' style="cursor:hand">
					</td>
				</tr>
<!--	
				<tr>
					<td width="7"><img src="/html/comm_img/ic_arr02.gif" width="7" height="11"></td>
					<td>'��/��/��'�ڸ� �����ϰ� �Է��Ͻ���, '<font color="#0066cc">����ã��</font>'�� Ŭ���� �ּ���</td>
				</tr>
				<tr>
					<td width="7">&nbsp;</td>
					<td>&nbsp;��/��/��
						<input size="16" id="addr3" name="addr3" class="text_box" style="ime-mode:active;" onKeyDown="check_enter('1');">
						<img src="/html/comm_img/bu_findgi.gif" board="0" border="0" align="absmiddle" width="64" height="19"  onclick='list_search_addr3()' style="cursor:hand">
					</td>
				</tr>
				<tr>
					<td width="7"><img src="/html/comm_img/ic_arr02.gif" width="7" height="11"></td>
					<td>�����̸��� �Է��Ͻ���, '<font color="#0066cc">����ã��</font>'�� Ŭ���� �ּ���</td>
				</tr>
				<tr>
					<td width="7">&nbsp;</td>
					<td>&nbsp;�����̸�
					<input size="16" id="bonm" name="bonm" class="text_box" style="ime-mode:active;" onKeyDown="check_enter('2');">
					<img src="/html/comm_img/bu_findgi.gif" board="0" border="0" align="absmiddle" width="64" height="19" onclick='list_search_bonm()' style="cursor:hand"></td>
				</tr>
-->				
				<tr>
					<td colspan="2" height="15">
					<!--�ּҰ� ������ ������ ������ ���Ѱ��� -->
					</td>
				</tr>
</form>
			</table>
			<!--���� �˻� �Է� �κ� ��-->

            <!--���� �˻� ����� ���� ��� ��� ����-->
			<table width="680" border="0" cellspacing="0" cellpadding="3" id="bo_notfound_id">
			</table>
            <!--���� �˻� ����� ���� ��� ��� ��-->
			<br>
            <!--���� �˻� ����� ���� ��� ��� ����-->
			<table width="680" border="1" cellspacing="0" align="center" class="gray" cellpadding="1" bgcolor="#FFFFFF" bordercolor="#FFFFFF" id="bo_list_id">
			</table>
            <!--���� �˻� ����� ���� ��� ��� ��-->
		</td>
	</tr>
	<tr>
		<td align="center" height="7">
		<!--�ϴܿ���-->
		</td>
	</tr>
	<tr>
		<td align="center" height="27"  bgcolor="#959595"><input type="image" src="/html/comm_img/bu_close.gif" onclick="close_modal();window.event.returnValue=true;"></td>
	</tr>
</table>

<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="680" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->

</body>
</html>
