<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : ss_brsup_2100_a.jsp
* ��� 	 	 : ��������-��ǻ��AS
* �ۼ����� 	 : 2004-03-15
* �ۼ��� 	 : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 :
* ������ 	 :
* �������� 	 :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%--
��ȭ�鿡�� �����˻��� �ϸ� �ش������� ��ϵ� ��ǻ�� ����� �����´�.
--%>
<%
    //	dataset �ν��Ͻ� ����κ�
    SS_L_ASREQDataSet ds = (SS_L_ASREQDataSet)request.getAttribute("ds");  // request dataset
    int moveListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;	// ���� ���� ����
%>
<html>
<head>
<script language="javascript">
<!--
	
//�������ʱ�ȭ�� ��ư������ EventHandlerȣ��
function jsInit(){			
		
	setEventHandler();		
	setEnterKeyEventHandler();	
	setInputBackgroundColor();	
	document.as_search_form.bonm.focus();
}
		
// �� ��ȿ�� üũ
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// ��ǻ��AS���� ����Ʈ ��ȸ(����Ű)
function list_search_enter(){
    if(event.keyCode == 13) list_search();
} 

// ��ǻ��AS���� ����Ʈ ��ȸ
function list_search(){	
    var lo_form = document.as_search_form;

    if(lo_form.pageno.value == '') {
        lo_form.pageno.value = 1;
    }

    if(!check_all(lo_form)) return;								// �� ��ȿ�� üũ
	lo_form.pageno.value = '1';									// ��������ȣ �ʱ�ȭ

    lo_form.method = "post";
    lo_form.action = "/ss/brsup/2110";
    lo_form.target = "ifrm";
    lo_form.submit();
} 

// ��ǻ��AS���� �󼼺���
function bocomp_view(bocd,invsgdt,invsgno,eqpno){	
	var lo_form = document.comp_detail_form;
	lo_form.flag.value = 'A';
	lo_form.bocd.value = bocd;
	lo_form.regdt.value = invsgdt;
	lo_form.regno.value = invsgno;
	lo_form.eqpno.value = eqpno;
	
	check_all(lo_form);
	lo_form.action = "/ss/brsup/2120";
	lo_form.target = "ifrm";
	lo_form.submit();
		
	document.all("cancel_btn").disabled = false;
	document.all("bo_btn").disabled = true;
	lo_form.bonm.readOnly = true;
    lo_form.accflag.value = 'U';
}


// ������ ��� �󼼺���
function bocomp_search(){	
	var lo_form = document.comp_detail_form;
	
	//���õ� ��ǻ�� �׸� üũ
	if(! lo_form.computernm.value == ''){
		lo_form.flag.value = 'C';
		lo_form.eqpno.value = lo_form.computernm.value;
		
		check_all(lo_form);
		lo_form.action = "/ss/brsup/2120";
		lo_form.target = "ifrm";
	    lo_form.submit(); 
	    
		document.all("cancel_btn").disabled = false;
	}
}

// ��ǻ��AS���� ������ clear
function bocomp_cancel(){
	var lo_form = document.comp_detail_form;	// ������ ��
	
	if(lo_form.flag.value == 'A'){
		check_all(lo_form);
		lo_form.action = "/ss/brsup/2120";
		lo_form.target = "ifrm";
		lo_form.submit();
			
		document.all("cancel_btn").disabled = false;
		document.all("bo_btn").disabled = true;
		lo_form.bonm.readOnly = true;
    	lo_form.accflag.value = 'U';
	
	} else if(lo_form.flag.value == 'C') {
		lo_form.eqpno.value = lo_form.computernm.value;
		
		check_all(lo_form);
		lo_form.action = "/ss/brsup/2120";
		lo_form.target = "ifrm";
	    lo_form.submit(); 
	    
		document.all("cancel_btn").disabled = false;
	
	} else {
		lo_form.reset();	
		return;
	}

}

// ��ǻ��AS���� �߰�
function bocomp_append(){

	var lo_form = document.comp_detail_form;	// ������ ��
	for( var i =0; i< lo_form.length; i++){
		if(lo_form(i).name == "as_stat"){
			lo_form(i).outerHTML =  '<select name="as_stat" class="sel_all" tabIndex="4" onkeydown="list_search_enter();">'+
									'<%=ds.curasstatOptHtml("")%>'+
									'</select>';
		}else{						
			lo_form(i).value = "";
		}			
	}

	lo_form.bonm.readOnly = false;		
    document.all.modlcd.innerText = '';
    document.all.kndcd.innerText = '';
    document.all.makecmpy.innerText = '';
    document.all.os.innerText = '';
    document.all.memolicapa.innerText = '';
    document.all.hddcapa.innerText = '';
    document.all.monitormakecmpy.innerText = '';
    document.all.monitormodl.innerText = '';
    document.all.monitorsize.innerText = '';
    document.all.printerkind.innerText = '';
    document.all.printermakecmpy.innerText = '';
    document.all.printermodl.innerText = '';

	document.all.computer_id.outerHTML = '<select id="computer_id" name="computernm" class="sel_all" onChange="bocomp_search();">'
										+'<option value="">������ �����ϼ���.</option>'
										+'</select>';

	lo_form.computernm.focus();
	
	document.all("cancel_btn").disabled = true;
	document.all("bo_btn").disabled = false;
	lo_form.bonm.readOnly = false;
	setInputBackgroundColor();	
	
	lo_form.accflag.value = 'I';
	
}

// ��ǻ��AS���� ����
function bocomp_edit(){
	var lo_form = document.comp_detail_form;

	//�ʼ��׸� ä����üũ
	if(lo_form.computernm.value == '' || lo_form.req_rmk.value == '' ) {
		alert("�ʼ��׸�(*)�� �Է����ּ���.");
		return;
	}
	
	if(lo_form.accflag.value == 'D'){								// ������ ���ܹ߻��ϸ� 'U'�� �����Ѵ�.
		lo_form.accflag.value = 'U';
	}
	
    if(lo_form.accflag.value != 'I') {	   
    	lo_form.accflag.value = 'U';
    }
    
	check_all(lo_form);
	
	lo_form.action = "/ss/brsup/2130";
	lo_form.target = "ifrm";
	lo_form.method = "post";
	lo_form.submit();
}

// ��ǻ��AS���� ����
function bocomp_del(){
	var lo_form = document.comp_detail_form;

	if(lo_form.eqpno.value == '' || lo_form.computernm.value == '' ) {	// �ڵ尪�� üũ�ϴ� ������ ����. �����ؾ� ��.
		alert("������ AS����� ������ �������ּ���.");
		return;
	}

	var yesno = confirm("�����Ͻðڽ��ϱ�?");
	if(yesno){
	    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
		lo_form.accflag.value = 'D';
		lo_form.action = "/ss/brsup/2130";
		lo_form.target = "ifrm";
		lo_form.method = "post";
	    lo_form.submit();
	}
}

	
// ���� �˻�
function area_search(){

	lo_form1 = document.as_search_form;
	
    if(lo_form1.deptcd.value == '') {
        var str = "<select id=areacd_id name=\"areacd\" class=\"sel_all\">" +
                      "<option value='' selected>��ü</option>" +
                  "</select>"
        document.all.areacd_id.outerHTML = str;
        return;
    }

    // �μ��ڵ尪�� "/ss/common/1100" �������� ������
    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
    lo_form1.action = "/ss/common/1100";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}


// ����ã�� �˾�
function bo_search(no){

	// �˻���
	if(no == '1'){
		var lo_form1 = document.as_search_form;
	    var	deptcd = lo_form1.deptcd.value;
	    var areacd = lo_form1.areacd.value;			
	    var bonm   = lo_form1.bonm.value;
	
		var ls_return = jsNewModalWinNoS("/ss/common/1110", deptcd+":"+areacd+":"+bonm, "725","480");			
	    var la_str;
	
	    if(ls_return.indexOf("\n") != -1){
	        la_str = ls_return.split("\n");
	        lo_form1.bocd.value = la_str[0];
	        lo_form1.bonm.value = la_str[1];
/*	        
	        lo_form1.deptcd.value = la_str[2];	
	        lo_form1.areacd.outerHTML =
	        		'<select name="areacd" size="1" id="areacd_id" class="sel_all">' +
	        		'<option value="' +
	        		la_str[4] +
	        		'" selected>' +
	        		la_str[5] +
	        		'</option>';
*/
		    // ��� �˻��� ��� ó��
		    if(gs_request == 'L'){
		    	gs_request = 'N';
		    	list_search();
		    }
	        		
	    }
	// ����	
	}else if(no == '2'){
		var lo_form1 = document.comp_detail_form;
	    var	deptcd = "";
	    var areacd = "";			
	    var bonm   = lo_form1.bonm.value;
	
		var ls_return = jsNewModalWinNoS("/ss/common/1110", deptcd+":"+areacd+":"+bonm, "725","480");			
	    var la_str;
	
	    if(ls_return.indexOf("\n") != -1){
	        la_str = ls_return.split("\n");
	        lo_form1.bocd.value = la_str[0];
	        lo_form1.bonm.value = la_str[1];
	        
		    // ���� �˻��� �Ϸ�Ǹ� ��ǻ�ͱ��������� �����´�.
		    compu_info();
	    }	    
	}			
}


// �˻�/�� �� ������ ���� ��������
var gs_no;

// ����Ű�� ���� ����ã��
function bo_enter_search(no){
    var e = window.event;
    if(!e || e.keyCode != "13") return;
    window.event.returnValue=false;

	//�˻�/�� �� ������ ���� �������� ����
	gs_no = no;
	
	//�˻���
	if(no == '1'){
    	var lo_form1 = document.as_search_form;
    	
	    //�������� �������� ������ �����˻��˾��� ����.
		if(lo_form1.bonm.value == ''){
			bo_search('1');
			return; 
		}
		
	    // �μ��ڵ�,�����ڵ�,��������  "/ss/common/1113" �������� ������
	    lo_form1.action = "/ss/common/1113";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	//����
    }else if(no == '2'){
    	var lo_form1 = document.comp_detail_form;

	    //�������� �������� ������ �����˻��˾��� ����.
		if(lo_form1.bonm.value == ''){
			bo_search('2');
			return; 
		}
		
	    // ��������  "/ss/common/1113" �������� ������
	    lo_form1.action = "/ss/common/1113";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
    }
}
    

// ���ͱ⿡ ���� ����ã�� ���ó��
function bo_enter_search_result(no){
	// �˻������ �Ѱ��̹Ƿ� �˻�â�� ������� �����Ѵ�.
	if(no == '1'){
	
		//�˻���
		if(gs_no == '1'){
			var lo_form1 = ifrm.document.bo_detail_form;
			var lo_form2 = document.as_search_form;
/*			
			lo_form2.deptcd.value = lo_form1.deptcd.value;
	        lo_form2.areacd.outerHTML =
	        		'<select name="areacd" size="1" id="areacd_id" class="sel_all">' +
	        		'<option value="' +
	        		lo_form1.areacd.value +
	        		'" selected>' +
	        		lo_form1.areanm.value +
	        		'</option>';
*/	        		
			lo_form2.bocd.value = lo_form1.bocd.value;
			lo_form2.bonm.value = lo_form1.bonm.value;
		//����
		}else if(gs_no == '2'){
			var lo_form1 = ifrm.document.bo_detail_form;
			var lo_form2 = document.comp_detail_form;
			
			lo_form2.bocd.value = lo_form1.bocd.value;
			lo_form2.bonm.value = lo_form1.bonm.value;	
			
	    	// ��ǻ�ͱ��������� �����´�.
			compu_info();
		}		
		
	// �˻������ ���ų� �������̹Ƿ� ����ã�� �˾��� ����.
	}else if(no == '2'){
		bo_search(gs_no);
	}
}

// ������ ��ǻ�ͱ��������� �����´�.
function compu_info(){
	var lo_form1 = document.comp_detail_form;
	lo_form1.action = "/ss/brsup/2140";
	lo_form1.target = "ifrm";
	lo_form1.method = "post";
	check_all(lo_form1);	    
	lo_form1.submit();
}

// ������ �̵�
function page_move(pageno) {
    var lo_form1 = document.move_search_form;

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // �̻絶�� ��û��� ��ȸ������ "/ss/brsup/2110" �������� ������
    lo_form1.action = "/ss/brsup/2110";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ��Ͽ��� ���õ� �ο� ��������
var go_sel_row;

// ���õ� �ο� ���� �ٲٱ�
function change_sel_row(obj){
	go_sel_row = obj;
	obj.style.backgroundColor='#BFD2DD';
	lo_table = obj.parentNode;
	for(i=1; i<lo_table.rows.length-1; i++){
		if(lo_table.rows[i] != go_sel_row){
			lo_table.rows[i].style.backgroundColor='#FFFFFF';
		}
	}
}

// ��Ͽ��� ���콺 IN
function mouse_in(obj){	
	if(obj != go_sel_row){
		obj.style.backgroundColor='#CCCCBB';
	}
}

// ��Ͽ��� ���콺 OUT
function mouse_out(obj){	
	if(obj != go_sel_row){
		obj.style.backgroundColor='#FFFFFF';
	}
}

// �˻� ���� �ʱ�ȭ
function set_default(flag){

    var lo_form1 = document.as_search_form;			// �˻� ��
    var lo_form2 = document.comp_detail_form;		// �� ��
		
	if(flag == '1'){			// �˻� �μ�,����,���� �ʱ�ȭ
		// �μ� �ʱ�ȭ
		lo_form1.deptcd.outerHTML =  '<select name="deptcd" onChange="area_search(\'S\');" class="sel_all">'
									+'<% writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true); %>'
									+'</select>';
		// ���� �ʱ�ȭ								
		lo_form1.areacd.outerHTML =  '<select name="areacd" id="areacd_id" class="sel_all">'
									+'<% writeAreaOpt(session, out, true); %>'
									+'</select>';
		// �����ڵ�,������ �ʱ�ȭ, ��Ŀ���̵�
		lo_form1.bocd.value = "";
		lo_form1.bonm.value = "";
		lo_form1.bonm.focus();
	}else if(flag == '2'){		// �� ���� �ʱ�ȭ
		// �����ڵ�,������ �ʱ�ȭ, ��Ŀ���̵�
		lo_form2.bocd.value = "";
		lo_form2.bonm.value = "";
		lo_form2.bonm.focus();
		
		// ��ǻ�� ��� �ʱ�ȭ
		document.all.computer_id.outerHTML = '<select id="computer_id" name="computernm" class="sel_all" onChange="bocomp_search();">'
											+'<option value="">������ �����ϼ���.</option>'
											+'</select>';
		
	}else if(flag == '4'){		// �Ⱓ �ʱ�ȭ
	}else if(flag == '5'){		// ��Ÿ �ʱ�ȭ
	}		
}
		    
// ��� ��ȸ�� �������� ������ ��� �����˻� �� ��� ��ȸ�� �����Ѵ�. 
// �̰�� �ܼ� �����˻��� �����˻� �� ��� ��ȸ�� �����ؾ� �ϴ°� �����ؾ� �ϰ� �����ȸ�� �����ؾ� �ϴ� ���� gs_request �������� L �� �����Ѵ�.
var gs_request = 'N';	// N : ��û����, L : ��ȸ��û

// ��û �÷��� ����
function set_request(flag){
	gs_request = flag;
}

// �����˻��� ���� ��� ��ȸ
function bo_list_search(){
    var lo_form1 = document.as_search_form;

	if(lo_form1.bonm.value == ''){
		lo_form1.bocd.value = '';
		list_search();
	}else{
		gs_no = '1';
		
	    // �μ��ڵ�,�����ڵ�,��������  "/ss/common/1113" �������� ������
	    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
	    lo_form1.action = "/ss/common/1113";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	}	    
}

-->
</script>
<title>��Ž�</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="javascript" src="/html/comm_js/common.js"></script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr> 
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle"> �������� 
      &gt; </b>��ǻ�� A/S ����</td>
  </tr>
  <tr> 
    <td height="10"> 
      <!--������ ���� ����-->
    </td>
  </tr>
</table>

<!-- ��ǻ�� A/S ���� �˻� ����-->
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<form name="as_search_form" method="post" action="" >
    <input name="pageno" type="hidden" value ="1">			                <!-- ���� ������ ��ȣ -->
    <input name="pagesize" type="hidden" value ="<%= moveListCount%>">	    <!-- �� ȭ��� ����Ʈ �׸� �� -->
    <input name="js_fn_nm" type="hidden" value ="page_move">
    <input name="common_deptcd" type="hidden" value ="">                    <!-- ���� �μ��ڵ� -->
    <input name="bocd" type="hidden" value ="">                         	<!-- ���������ڵ� -->
    <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� -->
  
	<tr>
		<td bgcolor="#EBE9DC" class="sea_top" colspan="3">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�μ�
			&nbsp;
            <select name="deptcd" onChange="area_search('S');" class="sel_all"><!-- �μ��ڵ�, �ڵ�� ��� -->
	<%						 
				writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true);
	%>					
            </select>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
			&nbsp;
            <select name="areacd" id="areacd_id" class="sel_all">  <!--�����ڵ�, ������ ���-->
	<%
				writeAreaOpt(session, out, true);
	%>                    
            </select>
			&nbsp;&nbsp;&nbsp;
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" colspan="2">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
			&nbsp;
			<input name="bonm" type="text" style="ime-mode:active;" size="12" class="text_box" value=""  onkeydown="bo_enter_search('1');">
			&nbsp;
			<input type="image" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle" onclick="javascript:bo_search('1');window.event.returnValue=false;"> <!--�����˻��˾�-->
			<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--�μ�,����,���� �ʱ�ȭ-->
			&nbsp;&nbsp;&nbsp;&nbsp;
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" rowspan="2" align="right">
			<input type="image" onclick="set_request('L');bo_list_search();window.event.returnValue=false;" src="/html/comm_img/bu_search01.gif" width="39" height="35">
		</td>
  </tr>
  <tr> 
    <td bgcolor="#EBE9DC" width="43">
    	<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�Ⱓ</td>
    <td bgcolor="#EBE9DC"  width="80">
      <select name="dt_kind" class="sel_all" tabIndex="1">
        <option value="" selected>��ü</option>
        <option value="R">��û</option>
        <option value="A">����</option>
        <option value="N">�Ϸ�</option>
      </select>
    </td>
    <td bgcolor="#EBE9DC" width="200">
      <input name="search_dt1" type="text" size="10" tabIndex="2" class="text_box" value="<%=Util.getYear()+"0101"%>" dataType=date caption="�Ⱓ(�˻�)">
      - 
      <input name="search_dt2" type="text" size="10" tabIndex="3" class="text_box" value="<%=Util.getDate()%>" dataType=date caption="�Ⱓ(�˻�)">
    </td>
    <td bgcolor="#EBE9DC" width="150"><img src="/html/comm_img/ic_title.gif" width="12" height="7">ó������&nbsp;
      <select name="as_stat" class="sel_all" tabIndex="4" onkeydown="list_search_enter();">
        <option value="">��ü</option>
        <%=ds.curasstatOptHtml("")%>
      </select> 
    </td>
    <td bgcolor="#EBE9DC" > 
      &nbsp;
    </td>
  </tr>
  <tr> 
    <td height="4" colspan="4"> 
      <!--����-->
    </td>
  </tr>
</form>
</table>
<!-- ��ǻ�� A/S ���� �˻� ��-->

<!-- ��ǻ�� A/S ���� ��� ����-->
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr> 
    <td>
     
	<table id="as_list_id" width="830"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#ffffff" >
		<tr bgcolor="#DDDDDD" height="23"> 
			<td width="50" class="gray"align="center">����</td>
			<td class="gray" align="center"> A/S ��û����</td>
			<td width="70" class="gray" align="center">����</td>
			<td width="70" class="gray" align="center">��û����</td>
			<td width="70" class="gray" align="center">��������</td>
			<td width="70" class="gray" align="center">�Ϸ�����</td>
		</tr>
        <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
		<%for(int i=0; i < moveListCount; i++) {%>
		<tr> 
			<td width="50" class="gray"align="center">&nbsp;</td>
			<td class="gray" align="center">&nbsp;</td>
			<td width="70" class="gray" align="center">&nbsp;</td>
			<td width="70" class="gray" align="center">&nbsp;</td>
			<td width="70" class="gray" align="center">&nbsp;</td>
			<td width="70" class="gray" align="center">&nbsp;</td>
		</tr>
		<%}%>
		<tr  bgcolor="#dddddd" align="right" > 
			<td  colspan="6" class="gray" height="23">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� �� </b>
			</td>
		</tr>
		
	</table>
	<!--��ư-->
	<table id="as_list_nav_id" width="830" border="0" cellspacing="0" align="center" cellpadding="0" class="title2">
	  <tr> 
	    <td align="center" height="2"> 
	      <!--����-->
	    </td>
	  </tr>
	  <tr> 
            <td align="center" height="24" bgcolor="#E8E8E8">
            <!--JSP PAGE START---------------------------------------------------------------------------------->
            <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
                    <jsp:param name = "pageno" 		value="0"/>
                    <jsp:param name = "totalcnt" 	value="0"/>
                    <jsp:param name = "js_fn_nm" 	value="page_move"/>
                    <jsp:param name = "pagesize" 	value="<%= moveListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
	  </tr>
	</table>  
<!-- ��ǻ�� A/S ���� ��� ��-->
      
    </td>
  </tr>
  <tr>
    <td height="10"> 
      <!--���� -->
    </td>
  </tr>
  <tr> 
    <td> 
    
<!-- ��ǻ�� A/S ���� �� ����-->
    
      <table width="830" border="0" cellspacing="0" cellpadding="2">
        <tr> 
          <td bgcolor="#EBE9DC" class="title" width="747">�󼼳���</td>
          <td bgcolor="#EBE9DC" class="title" align="right" width="75"><font color="red">*</font> 
            �ʼ��׸�</td>
        </tr>
        <tr> 
          <td height="2" colspan="2"> 
            <!--����-->
          </td>
        </tr>
      </table>
      <table width="830" border="0"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#ffffff">
      <form name="comp_detail_form" method="post" action="" > 
        <input name="accflag" type="hidden"  value="">
		<input name="flag" type="hidden"  value="">  <!--�˻������� ȣ������ �󼼿����� ȣ����������-->
		<input name="regdt" type="hidden"  value="">  
		<input name="regno" type="hidden"  value="">  
		<input name="eqpno" type="hidden"  value="">  
	    <input name="common_deptcd" type="hidden" value ="">                    <!-- ���� �μ��ڵ� -->
	    <input name="bocd" type="hidden" value ="">                         	<!-- ���������ڵ� -->
	    <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� -->
		
		  <tr align="left" > 
		    <td height="25" bgcolor="#dddddd" width="75" class="gray">����<font color="red">*</font>
			</td>
		    <td class="gray" width="200" height="25" colspan="3"> 
				<input name="bonm" type="text" style="ime-mode:active;" size="12" class="text_box" value=""  onkeydown="bo_enter_search('2');">
				&nbsp;
				<input name="bo_btn" type="image" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle" onclick="javascript:bo_search('2');window.event.returnValue=false;"> <!--�����˻��˾�-->
				<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('2');window.event.returnValue=false;"> <!--�μ�,����,���� �ʱ�ȭ-->
				&nbsp;&nbsp;
		    </td>
		    <td bgcolor="#dddddd" width="72" class="gray" height="25">��ǻ�͸�</td>
		    <td class="gray" width="119" height="25" colspan="3">
		      <select id="computer_id" name="computernm" class="sel_all" onChange="bocomp_search();">
		        <option value="">������ �����ϼ���.</option>
        		<%=ds.curcomplistOptHtml("")%>
		      </select> 
		    </td>
		  </tr>
		  
		  <tr align="left" > 
		    <td height="25" bgcolor="#dddddd" class="gray">ó������<font color="red">*</font></td>
		    <td class="gray" width="100" height="25"> 
		      <select name="as_stat" class="sel_all" tabIndex="4" onkeydown="list_search_enter();">
		        <%=ds.curasstatOptHtml("")%>
		      </select> 
		    </td>
		    <td bgcolor="#dddddd" width="72" class="gray" height="25">��</td>
		    <td class="gray" width="119" height="25"> 
		    <span id="modlcd">&nbsp;</span>
		    </td>
		    <td width="100" height="25" bgcolor="#dddddd" class="gray">��ǻ�ͱ���</td>
		    <td colspan="3" class="gray" height="25" > 
		    <span id="kndcd">&nbsp;</span>
		    </td>
		  </tr>
		  <tr align="left" > 
		    <td bgcolor="#dddddd" class="gray" height="25">����ȸ��</td>
		    <td width="100" class="gray" height="25"> 
		    <span id="makecmpy">&nbsp;</span>
		    </td>
		    <td height="25" bgcolor="#dddddd" width="72" class="gray">OS ȯ��</td>
		    <td class="gray" width="119" height="25"> 
		    <span id="os">&nbsp;</span>
		    </td>
		    <td bgcolor="#dddddd" width="110" class="gray" height="25">�޸� �뷮(MB)</td>
		    <td class="gray" width="93" height="25"> 
		    <span id="memolicapa">&nbsp;</span>
		    </td>
		    <td bgcolor="#dddddd" class="gray" width="110" height="25">HDD �뷮(GB)</td>
		    <td class="gray" width="85" height="25"> 
		    <span id="hddcapa">&nbsp;</span>
		    </td>
		  </tr>
		  <tr align="left" > 
		    <td height="16" bgcolor="#dddddd" class="gray">�����</td>
		    <td colspan="7" class="gray"> 
		      <table width="100%" cellpadding="2" cellspacing="0" border="0" class="gray" >
		        <tr align="left" > 
		          <td width="72" height="16" bgcolor="#dddddd" class="gray">����ȸ��</td>
		          <td width="165" class="gray"> 
		    		<span id="monitormakecmpy">&nbsp;</span>
		          </td>
		          <td width="72" height="16" bgcolor="#dddddd" class="gray">��</td>
		          <td width="165" class="gray"> 
		    		<span id="monitormodl">&nbsp;</span>
		          </td>
		          <td width="72" bgcolor="#dddddd" class="gray">ũ��</td>
		          <td class="gray"> 
		    		<span id="monitorsize">&nbsp;</span>
		          </td>
		        </tr>
		      </table>
		    </td>
		  </tr>
		  <tr align="left" > 
		    <td height="16" bgcolor="#dddddd" class="gray">������</td>
		    <td colspan="7" class="gray"> 
		      <table width="100%" cellpadding="2" cellspacing="0" border="0" class="gray" >
		        <tr align="left" > 
		          <td width="72" height="16" bgcolor="#dddddd" class="gray">����</td>
		          <td width="165" class="gray"> 
		    		<span id="printerkind">&nbsp;</span>
		          </td>
		          <td width="72" height="16" bgcolor="#dddddd" class="gray">����ȸ��</td>
		          <td width="165" class="gray"> 
		    		<span id="printermakecmpy">&nbsp;</span>
		          </td>
		          <td width="72" bgcolor="#dddddd" class="gray">��</td>
		          <td class="gray"> 
		    		<span id="printermodl">&nbsp;</span>
		          </td>
		        </tr>
		      </table>
		    </td>
		  </tr>
		  <tr align="left" > 
		    <td height="67" bgcolor="#dddddd" class="gray">���</td>
		    <td colspan="7" class="gray"> 
		      <textarea name="remk" cols="99" rows="3" class="scroll1" readonly></textarea>
		    </td>
		  </tr>
		  <tr align="left" > 
		    <td height="16" bgcolor="#dddddd" class="gray">A/S��û����<font color="red">*</font></td>
		    <td colspan="7" class="gray"> 
		      <textarea name="req_rmk" cols="99" rows="3" class="scroll1"></textarea>
		    </td>
		  </tr>
		</form>
		</table>
<!-- ��ǻ�� A/S ���� �� ��-->
		
		<!--��ư-->
		<table width="829" border="0" cellspacing="0" cellpadding="0" class="title2">
		  <tr> 
		    <td align="center" height="2"> 
		      <!--����-->
		    </td>
		  </tr>
		  <tr> 
		    <td align="center" height="24" bgcolor="#E8E8E8">
	          	<input type="image" src="/html/comm_img/bu_new.gif" name="insert_btn" value="" align="absmiddle" 
	          		onclick="bocomp_append();window.event.returnValue=false;">
	          	<input type="image" src="/html/comm_img/bu_save.gif" name="update_btn" value="" align="absmiddle" 
	          		onclick="bocomp_edit();window.event.returnValue=false;">
	          	<input type="image" src="/html/comm_img/bu_del.gif" name="delete_btn" value="" align="absmiddle" 
	          		onclick="bocomp_del();;window.event.returnValue=false;">
	          	<input type="image" src="/html/comm_img/bu_cancel.gif" name="cancel_btn" value="" align="absmiddle" 
	          		onclick="bocomp_cancel();window.event.returnValue=false;">   
		    </td>
		  </tr>
		</table>
</td>
  </tr>
</table>
<br>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="830" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
