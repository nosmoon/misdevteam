<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1030_a.jsp
* ��� : ������-�����ȣ-�ʱ�ȭ��
* �ۼ����� : 2004-03-09
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� : �ش������� ���� ��� ���尡���ϵ���
* ������ : ��뼷
* �������� : 2005-05-09
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet)request.getAttribute("ds");
	String paramGbn = "##";	// ���ڿ� ���� ������
    int zipListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��(�ʱ�ȭ��)
%>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">

<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
// �̺�Ʈ �ڵ鷯 �ʱ�ȭ
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
	setInputBackgroundColor();
	document.zip_search_form.zip.focus();
}

// �� ��ȿ�� üũ
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// ���� �˻�
function area_search(){
    var lo_form1 = document.zip_search_form;
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

// ��Ϻ���
function list_search(){
    var lo_form1 = document.zip_search_form;

/*
	// �����ȣ üũ
	if(lo_form1.deptcd.value == '' && lo_form1.areacd.value == '' && lo_form1.bocd.value == '' && lo_form1.zip.value == '' && lo_form1.addr3.value == ''){
		alert("�μ�,����,����,�����ȣ,��/��/�� �� ��� �ϳ��� �Է��ϼ���");
		return;
	}
*/
	// �����ȣ üũ
	if(lo_form1.zip.value == '' && lo_form1.addr3.value == ''){
		alert("�����ȣ �Ǵ� ��/��/���� �Է��ϼ���");
		return;
	}
	
    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
	lo_form1.pageno.value = '1';									// ��������ȣ �ʱ�ȭ

	if(lo_form1.zip.value != ''){
		lo_form1.zip1.value = lo_form1.zip.value.substring(0,3);			// �����ȣ ����
		lo_form1.zip2.value = lo_form1.zip.value.substring(3,6);
	}

	// �����ȣ ��� ��ȸ������ �ش� �������� ������.
    lo_form1.action = "/ss/admin/1035";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ������ �̵�
function page_move(pageno) {
    var lo_form1 = document.zip_search_form;

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

	// �����ȣ üũ
	if(lo_form1.zip.value == '' && lo_form1.addr3.value == ''){
		alert("�����ȣ �Ǵ� ��/��/���� �Է��ϼ���");
		return;
	}

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // ��� ��ȸ������ "/ss/admin/1035" �������� ������
    lo_form1.action = "/ss/admin/1035";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �󼼺���
function detail_view(zip1, zip2, zip3, addr1, addr2, addr3, largedlvplac){
    var lo_form1 = document.zip_list_form;

    // �����ȣ1, �����ȣ2, �����ȣ3 "/ss/admin/1040" �������� ������
    lo_form1.zip1.value = zip1;
    lo_form1.zip2.value = zip2;
    lo_form1.zip3.value = zip3;
    lo_form1.addr1.value = addr1;
    lo_form1.addr2.value = addr2;
    lo_form1.addr3.value = addr3;
    lo_form1.largedlvplac.value = largedlvplac;
    lo_form1.action = "/ss/admin/1040";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}


// ��ǥ����ã�� �˾�(��)
function bo_search_detail_rep(){
    var lo_form1 = document.zip_detail_form;
    var	deptcd = "";
    var areacd = "";

	var ls_return = jsNewModalWinNoS("/ss/common/1110", deptcd+":"+areacd+":", "725","480");
    var la_str;

    if(ls_return.indexOf("\n") != -1){
        la_str = ls_return.split("\n");
        bocd = la_str[0];
        bonm = la_str[1];

		// ��� ������, �����ڵ� ����
		if(!lo_form1.bocd.length){			// �Ѱ�
            lo_form1.bocd.value = bocd;
            lo_form1.bonm.value = bocd;
		}else{								// ������
	        for(var i=0; i<lo_form1.bocd.length; i++) {
	            lo_form1.bocd[i].value = bocd;
	            lo_form1.bonm[i].value = bonm;
			}
        }
    }
    
    //üũ�ڽ� ��ü����
    check_all_chk(true);
}

// ����ã�� �˾�(��)
function bo_search_detail(bocd_obj, bonm_obj){
    var lo_form1 = document.zip_detail_form;
    var	deptcd = "";
    var areacd = "";

	var bonm = bonm_obj.value;

	var ls_return = jsNewModalWinNoS("/ss/common/1110", deptcd+":"+areacd+":"+bonm, "725","480");
    var la_str;

    if(ls_return.indexOf("\n") != -1){
        la_str = ls_return.split("\n");
        bocd = la_str[0];
        bonm = la_str[1];

		// ������, �����ڵ� ����
		bonm_obj.value = bonm;
		bocd_obj.value = bocd;
    }

}

// ����ã�� �˾�(�˻�)
// ���������ڵ�, ����������� �˾����κ��� �Ѿ�´�. �� ���� �����ڴ� "\n"
function bo_search(){
    var lo_form1 = document.zip_search_form;

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
	return;
}


// �˻�/�� �� �˻� ���� ��������
var gs_no;

// �������� ���� ��������
var go_bonm_obj;
// �����ڵ带 ���� ��������
var go_bocd_obj;

// ����Ű�� ���� ����ã��(��)
function bo_enter_search_detail(bocd_obj, bonm_obj){
    var e = window.event;
    if(!e || e.keyCode != "13") return;
    window.event.returnValue=false;

	// ���������� �˻�/�� ���а� ����
	gs_no = '2';

	// �������� �������� ������ �˾��� ����.
	if(bonm_obj.value == ''){
		bo_search_detail(bocd_obj, bonm_obj);
		return;
	}

	//���������� �˻��� ������ ������, �����ڵ� ��ü������ �����Ѵ�.
	go_bonm_obj = bonm_obj;
	go_bocd_obj = bocd_obj;

	// ���������� �����ȸ ���� ����
	gs_request = 'N';

    var lo_form1 = document.bo_search_form;
    lo_form1.bonm.value = bonm_obj.value;

    // ��������  "/ss/common/1113" �������� ������
    lo_form1.action = "/ss/common/1113";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ����Ű�� ���� ����ã��
function bo_enter_search(){
    var e = window.event;
    if(!e || e.keyCode != "13") return;
    window.event.returnValue=false;

    var lo_form1 = document.zip_search_form;

    //�������� �������� ������ �����˻��˾��� ����.
	if(lo_form1.bonm.value == ''){
		bo_search();
		return;
	}

	// ���������� �˻�/�� ���а� ����
	gs_no = '1';

    // �μ��ڵ�,�����ڵ�,��������  "/ss/common/1113" �������� ������
    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
    lo_form1.action = "/ss/common/1113";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ����Ű�� ���� ����ã�� ���ó��
function bo_enter_search_result(no){
	// �˻������ �Ѱ��̹Ƿ� �˻�â�� ������� �����Ѵ�.
	if(no == '1'){
		// �˻� ��
		if(gs_no == '1'){
			var lo_form1 = ifrm.document.bo_detail_form;
			var lo_form2 = document.zip_search_form;
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

		// �� ��
		}else if(gs_no == '2'){
			var lo_form1 = ifrm.document.bo_detail_form;

			// ���������� ����� ������, �����ڵ� ��ü������ �˻��� ���� �����Ѵ�.
			go_bonm_obj.value = lo_form1.bonm.value;
			go_bocd_obj.value = lo_form1.bocd.value;
		}
	// �˻������ ���ų� �������̹Ƿ� ����ã�� �˾��� ����.
	}else if(no == '2'){
		// �˻� ��
		if(gs_no == '1'){
			bo_search();
		// �� ��
		}else if(gs_no == '2'){
			bo_search_detail( go_bocd_obj,go_bonm_obj);
		}
	}
}

// ��ü����, ���
function check_all_chk(bool){
    var lo_form1 = document.zip_detail_form;

    if(lo_form1.checkyn==null) {								// ���õ� ���� ���� ���
        return;
    } else if(lo_form1.checkyn.type=="checkbox") {				// �Ѱ��� ���
        lo_form1.checkyn.checked = bool;
    } else {													// �������� ���
        for(var i=0; i<lo_form1.checkyn.length; i++) {
            lo_form1.checkyn[i].checked = bool;
        }
    }
}

// �� �߰�
function row_add(){
	var lo_form1 = document.zip_detail_form;
	var lo_table = document.all.zip_detail_list_id;


	var lo_last_row;		// ������ �ο�
	var lo_row;				// �߰� �ο�
	var lo_cell_idx;		// �� �ε���

    if(lo_form1.checkyn==null) {								// ���õ� ���� ���� ���
		return;
    }else{														// �������� ���
        lo_last_row = lo_table.rows(lo_table.rows.length-2);	// �ѰǼ� �ο� ����
        lo_row = lo_table.insertRow(lo_table.rows.length-1);	// �ѰǼ� �ο� ����


        // ����üũ�ڽ��� �� �׸��� ����Ѵ�.
		lo_row.insertCell(0);
		lo_row.cells[0].innerHTML = '<input name="checkyn" type="checkbox" value="" checked>';
		lo_row.cells[0].align = "center"
		lo_row.cells[0].className = "gray";

        // �ּ�1,�ּ�2,�ּ�3,�뷮���ó ������ ������ �ο�κ��� �߰��� �ο�� �����Ѵ�.
		for (lo_cell_idx = 1; lo_cell_idx < 5; lo_cell_idx++){
			lo_row.insertCell(lo_cell_idx);
			lo_row.cells[lo_cell_idx].innerHTML = lo_last_row.cells[lo_cell_idx].innerHTML;
			lo_row.cells[lo_cell_idx].align = lo_last_row.cells[lo_cell_idx].align;
			lo_row.cells[lo_cell_idx].className = lo_last_row.cells[lo_cell_idx].className;
		}
        // ���۹���,������,�������� �Է��׸��� �� �׸��� ����Ѵ�.

        // ���۹���
		lo_row.insertCell(5);

		lo_row.cells[5].innerHTML = '<input name="bgnn" type="text" value="" size="6" class="text_box">';
		lo_row.cells[5].align = "center"
		lo_row.cells[5].className = "gray";
        // ������
		lo_row.insertCell(6);
		lo_row.cells[6].innerHTML = '<input name="endn" type="text" value="" size="6" class="text_box">';
		lo_row.cells[6].align = "center"
		lo_row.cells[6].className = "gray";
        // ��������
		lo_row.insertCell(7);
		lo_row.cells[7].innerHTML =
				'<input name="bocd" type="hidden" value="">' +
				'<input name="bonm" type="text" value=""  style="ime-mode:active;" size="12" class="text_box" onkeydown="bo_enter_search_detail(this.parentElement.children(0), this.parentElement.children(1));"> ' +
				'<input type="image" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:bo_search_detail(this.parentElement.children(0), this.parentElement.children(1));window.event.returnValue=false;">';
		lo_row.cells[7].align = "center"
		lo_row.cells[7].className = "gray";
    }
}

// �� ����
function row_del(){
    var lo_form1;
    var lo_table;
    var li_checkyn_len;

    lo_form1 = document.zip_detail_form;
    lo_table = document.all.zip_detail_list_id;	  				// parent frame�� ���̺� ��ü�� ������ �Ҵ�.

    if(lo_form1.checkyn==null) {								// ���õ� ���� ���� ���
        return;
    } else if(lo_form1.checkyn.type=="checkbox") {				// �Ѱ��� ���
    	if(lo_form1.checkyn.checked){
        	lo_table.deleteRow(1);
        }
    } else {	                                     			// �������� ���

        li_checkyn_len = lo_form1.checkyn.length;				// checkbox�� ����
        for(var i=li_checkyn_len-1; i>=0; i--) {				// �����׸� �� ��������
            if(lo_form1.checkyn[i].checked) {
                lo_table.deleteRow(i+1);						// ���� �޴� �׸� ����
            }
        }
    }
}

// 20050509 ��뼷 ����
// ����
function save(){
	var lo_form1 = document.zip_detail_form;

    if(!check_all(lo_form1)) return;							// �� ��ȿ�� üũ


	if(lo_form1.checkyn == null){								// üũ�ڽ��� ���� ��
	}else if(lo_form1.checkyn.type == "checkbox"){				// üũ�ڽ��� �Ѱ� �϶�
		if(lo_form1.checkyn.checked){
			lo_form1.addr1ary.value = lo_form1.addr1.value
			lo_form1.addr2ary.value = lo_form1.addr2.value
			lo_form1.addr3ary.value = lo_form1.addr3.value
			lo_form1.largedlvplacary.value = lo_form1.largedlvplac.value
			lo_form1.bgnnary.value = lo_form1.bgnn.value
			lo_form1.endnary.value = lo_form1.endn.value

			// ���������ڵ� üũ
			if(lo_form1.bocd.value == ''){
		        alert("���������ڵ尡 �������� �ʽ��ϴ�.");
				return;
			}
			lo_form1.bocdary.value = lo_form1.bocd.value
        }else{
        	alert("�����׸��� �������� �ʽ��ϴ�.");
        	return;
        }
	}else{														// üũ�ڽ��� ���� ���϶�

	    var li_count = 0;		// �����׸� ����

	    // �����ȣ ���� ������ ���ڿ� �������� �����.
		var ls_addr1ary = '';
		var ls_addr2ary = '';
		var ls_addr3ary = '';
		var ls_largedlvplacary = '';
		var ls_bgnnary = '';
		var ls_endnary = '';
		var ls_bocdary = '';

		// �����׸� ���� ���
	    for(var i=0; i<lo_form1.checkyn.length; i++) {
	        if(lo_form1.checkyn[i].checked){
	        	li_count++;
	        }
	    }

		if(li_count == 0){										// �����׸��� �������� ������
	        alert("�����׸��� �������� �ʽ��ϴ�.");
			return;
		}else{													// �����׸��� �����ϸ�

		    for(var i=0; i<lo_form1.checkyn.length; i++) {
		        if(lo_form1.checkyn[i].checked){
					ls_addr1ary = ls_addr1ary + lo_form1.addr1[i].value + "<%= paramGbn%>";
					ls_addr2ary = ls_addr2ary + lo_form1.addr2[i].value + "<%= paramGbn%>";
					ls_addr3ary = ls_addr3ary + lo_form1.addr3[i].value + "<%= paramGbn%>";
					ls_largedlvplacary = ls_largedlvplacary + lo_form1.largedlvplac[i].value + "<%= paramGbn%>";
					ls_bgnnary = ls_bgnnary + lo_form1.bgnn[i].value + "<%= paramGbn%>";
					ls_endnary = ls_endnary + lo_form1.endn[i].value + "<%= paramGbn%>";

					// ���������ڵ� üũ
					if(lo_form1.bocd[i].value == ''){
				        alert("���������ڵ尡 �������� �ʽ��ϴ�.");
						return;
					}

					ls_bocdary = ls_bocdary + lo_form1.bocd[i].value + "<%= paramGbn%>";
				}
		    }

			lo_form1.addr1ary.value = ls_addr1ary.substring(0, ls_addr1ary.length-2);
			lo_form1.addr2ary.value = ls_addr2ary.substring(0, ls_addr2ary.length-2);
			lo_form1.addr3ary.value = ls_addr3ary.substring(0, ls_addr3ary.length-2);
			lo_form1.largedlvplacary.value = ls_largedlvplacary.substring(0, ls_largedlvplacary.length-2);
			lo_form1.bgnnary.value = ls_bgnnary.substring(0, ls_bgnnary.length-2);
			lo_form1.endnary.value = ls_endnary.substring(0, ls_endnary.length-2);
			lo_form1.bocdary.value = ls_bocdary.substring(0, ls_bocdary.length-2);
		}
    }
    
	lo_form1.action = "/ss/admin/1045";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}
		
/* 20050509 ���
		// ����
		function save(){
			var lo_form1 = document.zip_detail_form;
		
		    if(!check_all(lo_form1)) return;							// �� ��ȿ�� üũ
		
		
			if(lo_form1.checkyn == null){								// üũ�ڽ��� ���� ��
		        alert("�����׸��� �������� �ʽ��ϴ�.");
				return;
			}else if(lo_form1.checkyn.type == "checkbox"){				// üũ�ڽ��� �Ѱ� �϶�
				if(lo_form1.checkyn.checked){
					lo_form1.addr1ary.value = lo_form1.addr1.value
					lo_form1.addr2ary.value = lo_form1.addr2.value
					lo_form1.addr3ary.value = lo_form1.addr3.value
					lo_form1.largedlvplacary.value = lo_form1.largedlvplac.value
					lo_form1.bgnnary.value = lo_form1.bgnn.value
					lo_form1.endnary.value = lo_form1.endn.value
		
					// ���������ڵ� üũ
					if(lo_form1.bocd.value == ''){
				        alert("���������ڵ尡 �������� �ʽ��ϴ�.");
						return;
					}
					lo_form1.bocdary.value = lo_form1.bocd.value
		        }else{
		        	alert("�����׸��� �������� �ʽ��ϴ�.");
		        	return;
		        }
			}else{														// üũ�ڽ��� ���� ���϶�
		
			    var li_count = 0;		// �����׸� ����
		
			    // �����ȣ ���� ������ ���ڿ� �������� �����.
				var ls_addr1ary = '';
				var ls_addr2ary = '';
				var ls_addr3ary = '';
				var ls_largedlvplacary = '';
				var ls_bgnnary = '';
				var ls_endnary = '';
				var ls_bocdary = '';
		
				// �����׸� ���� ���
			    for(var i=0; i<lo_form1.checkyn.length; i++) {
			        if(lo_form1.checkyn[i].checked){
			        	li_count++;
			        }
			    }
		
				if(li_count == 0){										// �����׸��� �������� ������
			        alert("�����׸��� �������� �ʽ��ϴ�.");
					return;
				}else{													// �����׸��� �����ϸ�
		
				    for(var i=0; i<lo_form1.checkyn.length; i++) {
				        if(lo_form1.checkyn[i].checked){
							ls_addr1ary = ls_addr1ary + lo_form1.addr1[i].value + "<%= paramGbn%>";
							ls_addr2ary = ls_addr2ary + lo_form1.addr2[i].value + "<%= paramGbn%>";
							ls_addr3ary = ls_addr3ary + lo_form1.addr3[i].value + "<%= paramGbn%>";
							ls_largedlvplacary = ls_largedlvplacary + lo_form1.largedlvplac[i].value + "<%= paramGbn%>";
							ls_bgnnary = ls_bgnnary + lo_form1.bgnn[i].value + "<%= paramGbn%>";
							ls_endnary = ls_endnary + lo_form1.endn[i].value + "<%= paramGbn%>";
		
							// ���������ڵ� üũ
							if(lo_form1.bocd[i].value == ''){
						        alert("���������ڵ尡 �������� �ʽ��ϴ�.");
								return;
							}
		
							ls_bocdary = ls_bocdary + lo_form1.bocd[i].value + "<%= paramGbn%>";
						}
				    }
		
					lo_form1.addr1ary.value = ls_addr1ary.substring(0, ls_addr1ary.length-2);
					lo_form1.addr2ary.value = ls_addr2ary.substring(0, ls_addr2ary.length-2);
					lo_form1.addr3ary.value = ls_addr3ary.substring(0, ls_addr3ary.length-2);
					lo_form1.largedlvplacary.value = ls_largedlvplacary.substring(0, ls_largedlvplacary.length-2);
					lo_form1.bgnnary.value = ls_bgnnary.substring(0, ls_bgnnary.length-2);
					lo_form1.endnary.value = ls_endnary.substring(0, ls_endnary.length-2);
					lo_form1.bocdary.value = ls_bocdary.substring(0, ls_bocdary.length-2);
				}
		    }
		    
			lo_form1.action = "/ss/admin/1045";
		    lo_form1.target = "ifrm";
		    lo_form1.submit();
		}
*/

// ���
function cancel(){
	var lo_form1 = document.zip_detail_form;
	lo_form1.reset();                                               // �� �缳��

	setEventHandler();												// �� �缳�� �� �̺�Ʈ�ڵ鷯 ȣ��
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

// ��� ��ȸ�� �������� ������ ��� �����˻� �� ��� ��ȸ�� �����Ѵ�.
// �̰�� �ܼ� �����˻��� �����˻� �� ��� ��ȸ�� �����ؾ� �ϴ°� �����ؾ� �ϰ� �����ȸ�� �����ؾ� �ϴ� ���� gs_request �������� L �� �����Ѵ�.
var gs_request = 'N';	// N : ��û����, L : ��ȸ��û

// ��û �÷��� ����
function set_request(flag){
	gs_request = flag;
}

// �����˻��� ���� ��� ��ȸ
function bo_list_search(){
    var lo_form1 = document.zip_search_form;

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

// �˻� ���� �ʱ�ȭ
function set_default(flag){

    var lo_form1 = document.zip_search_form;
		
	if(flag == '1'){			// �μ�,����,���� �ʱ�ȭ
		// �μ� �ʱ�ȭ
		lo_form1.deptcd.outerHTML =  '<select name="deptcd" onChange="area_search();" class="sel_all">'
									+'<% writeDeptOpt(session, out, ds.curcommlistOptHtml(""), true); %>'
									+'</select>';
		// ���� �ʱ�ȭ								
		lo_form1.areacd.outerHTML =  '<select name="areacd" size="1" id="areacd_id" class="sel_all">'
									+'<% writeAreaOpt(session, out, true); %>'
									+'</select>';
		// �����ڵ�,������ �ʱ�ȭ, ��Ŀ���̵�
		lo_form1.bocd.value = "";
		lo_form1.bonm.value = "";
		lo_form1.bonm.focus();
	}else if(flag == '2'){		// �Ⱓ �ʱ�ȭ
	}else if(flag == '3'){		// ��Ÿ �ʱ�ȭ
	}		
}

//����Ű �����ȸ
function enter_key(){
    var e = window.event;
    if(!e || e.keyCode != "13") return;
    window.event.returnValue=false;
    
    list_search();
}
-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" class="title1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >������
      &gt; </b> �����ȣ</td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���� ����-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td valign="top">

	<!--�����ȣ �˻� ���� -->
	<table width="830" border="0" cellspacing="0" cellpadding="2">
    <form name="zip_search_form" method="post" action="" >
        <input name="pageno" type="hidden" value ="1">			                	<!-- ���� ������ ��ȣ -->
        <input name="pagesize" type="hidden" value ="<%= zipListCount%>">	<!-- �� ȭ��� ����Ʈ �׸� �� -->
        <input name="js_fn_nm" type="hidden" value ="page_move">
		<input name="common_deptcd" type="hidden" value ="">                    	<!-- ���� �μ��ڵ� -->
		<input name="bocd" type="hidden" value ="">                    				<!-- �����ڵ� -->
        <input name="applySession" type="hidden" value ="<%= applySession%>">   	<!-- ���� ���� ���� -->
	    <input name="zip1" type="hidden" value ="">			<!--�����ȣ1-->
	    <input name="zip2" type="hidden" value ="">     	<!--�����ȣ2-->
	    <input name="flag" type="hidden" value ="A">     	<!--�˻�����-->

		<tr>
<%--		
			<td class="title" bgcolor="#EBE9DC" width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�μ�</td>
			<td class="title" width="80">
	            <select name="deptcd" onChange="area_search();" class="sel_all"><!-- �μ��ڵ�, �ڵ�� ��� -->
<%
					writeDeptOpt(session, out, ds.curcommlistOptHtml(""), true);
%>
	            </select>
			</td>
			<td class="title" width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
			<td class="title" width="80">
	            <select name="areacd" size="1" id="areacd_id" class="sel_all"><!--�����ڵ�, ������ ���-->
<%
					writeAreaOpt(session, out, true);
%>
	            </select>
			</td>
			<td class="title" width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
			<td class="title" width="165" >
				<input name="bonm" type="text" size="10" class="text_box" style="ime-mode:active;" onkeydown="bo_enter_search();">
            	<input type="image" id="bo_search_id" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;"><!--�����˻��˾�-->
            	<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--�μ�,����,���� �ʱ�ȭ-->
			</td>
--%>			
			<td class="title" bgcolor="#EBE9DC" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�����ȣ</td>
			<td class="title" bgcolor="#EBE9DC" width="70">
				<input name="zip" type="text" size="7" class="text_box" dataType="zip" onkeydown="enter_key()">
			</td>
			<td class="title" bgcolor="#EBE9DC" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��/��/��</td>
			<td class="title" bgcolor="#EBE9DC" width="90">
				<input name="addr3" type="text" size="10" class="text_box" style="ime-mode:active;" onkeydown="enter_key()">
			</td>
			<td class="title" bgcolor="#EBE9DC" align="right">
<%--			
				<input type="image" src="/html/comm_img/bu_search03.gif" width="39" height="19" border="0" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;" border="0" >
--%>				
				<input type="image" src="/html/comm_img/bu_search03.gif" width="39" height="19" border="0" align="absmiddle" onclick="list_search();window.event.returnValue=false;" border="0" >
			</td>
		</tr>
		<tr>
			<td height="3" colspan="2">
				<!--����-->
			</td>
		</tr>
	</form>
	</table>
	<!--�����ȣ �˻� �� -->

	<table width="830" border="0"  cellpadding="1" cellspacing="0" align="center">
		<tr>
			<td  height="25" bgcolor="#EBE9DC" class="title">MIS �����ȣ</td>
		</tr>
		<tr>
			<td height="3">
			<!--����-->
			</td>
		</tr>
	</table>

	<!--MIS �����ȣ ��� ���� -->
	<table width="830" border="0" cellspacing="0" cellpadding="1" bgcolor="#FFFFFF" class="gray" id="zip_list_id">
    <form name="zip_list_form" method="post" action="">
	    <input name="zip1" type="hidden" value ="">			<!--�����ȣ1-->
	    <input name="zip2" type="hidden" value ="">     	<!--�����ȣ2-->
	    <input name="zip3" type="hidden" value ="">     	<!--�����ȣ3-->
	    <input name="addr1" type="hidden" value ="">		<!--�ּ�1-->
	    <input name="addr2" type="hidden" value ="">     	<!--���2-->
	    <input name="addr3" type="hidden" value ="">     	<!--�ּ�3-->
	    <input name="largedlvplac" type="hidden" value ="">	<!--���ּ�-->

		<tr bgcolor="#dddddd" align="center" height="23">
			<td width="65" class="gray">�����ȣ1</td>
			<td width="65" class="gray">�����ȣ2</td>
			<td width="65" class="gray">�����ȣ3</td>
			<td width="70" class="gray">��/��</td>
			<td width="70" class="gray">��/��</td>
			<td width="140" class="gray">��/��/��</td>
			<td class="gray">���ּ�</td>
			<td width="60" class="gray">���۹���</td>
			<td width="60" class="gray">������</td>
		</tr>

        <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
        <%for(int i=0; i<zipListCount; i++){%>
		<tr align="center"">
			<td width="65" class="gray">&nbsp;</td>
			<td width="65" class="gray">&nbsp;</td>
			<td width="65" class="gray">&nbsp;</td>
			<td width="70" class="gray">&nbsp;</td>
			<td width="70" class="gray">&nbsp;</td>
			<td width="140" class="gray">&nbsp;</td>
			<td class="gray">&nbsp;</td>
			<td width="60" class="gray">&nbsp;</td>
			<td width="60" class="gray">&nbsp;</td>
		</tr>
        <%}%>
        <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
		<tr bgcolor="#dddddd" height="23">
			<td colspan="9" class="gray" align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� �� </b>
			</td>
		</tr>
	</form>
	</table>
	<!--MIS �����ȣ ��� �� -->

    <!-- ������ �̵� -->
    <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move">
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
                    <jsp:param name = "pagesize" 	value="<%= zipListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- ������ �̵� -->

    </td>
  </tr>
  <tr>
    <td height="10">
      <!--����-->
    </td>
  </tr>
  <tr>
    <td>

	<!--�Ǹű� �����ȣ ��� ���� -->
    <table border="0" cellspacing="0" cellpadding="0" id="zip_detail_id">
	</table>
	<!--�Ǹű� �����ȣ ��� �� -->


    </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
<!--�� �����ȣ���� ����ã�⸦ ���� FORM-->
<form name="bo_search_form" method="post" style="display:none">
	<input name="bonm" type="hidden" value ="">				<!-- ������ �̸� -->
</form>
</body>
</html>
