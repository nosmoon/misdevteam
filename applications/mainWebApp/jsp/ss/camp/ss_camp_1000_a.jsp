<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_camp_1000_a.jsp
* ��� : ķ����Ȯ��-��û���-�ʱ�ȭ��
* �ۼ����� : 2005-05-26
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_CAMP_EXTN_INITDataSet ds = (SS_L_CAMP_EXTN_INITDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
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
function area_search(flag){
    var lo_form1 = document.extn_search_form;
    if(flag == '1'){        // �Ϲ� ���� ���� �˻�
        if(lo_form1.deptcd.value == '') {
            var str = "<select id=areacd_id name=\"areacd\" class=\"sel_all\">" +
                          "<option value='' selected>��ü</option>" +
                      "</select>"
            document.all.areacd_id.outerHTML = str;
            return;
        }

        // �μ��ڵ尪�� "/ss/common/1100" �������� ������
        lo_form1.action = "/ss/common/1100";
	    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
        lo_form1.target = "ifrm";
        lo_form1.submit();
    }else if(flag == '2'){  // Ȯ��(����) ���� ���� �˻�
         if(lo_form1.extn_deptcd.value == '') {
            var str = "<select id=extn_areacd_id name=\"extn_areacd\" class=\"sel_all\">" +
                          "<option value='' selected>��ü</option>" +
                      "</select>"
            document.all.extn_areacd_id.outerHTML = str;
            return;
        }

        // �μ��ڵ尪�� "/ss/common/1105" �������� ������
        lo_form1.action = "/ss/common/1105";
	    lo_form1.common_deptcd.value = lo_form1.extn_deptcd.value;
        lo_form1.target = "ifrm";
        lo_form1.submit();
   }
}

// Ȯ���� �Ҽ� �˻�
function extnblng_search(){
    var lo_form1 = document.extn_search_form;
    if( (lo_form1.rdr_extntypecd.value == '') || (lo_form1.rdr_extntypecd.value == '40') || (lo_form1.rdr_extntypecd.value == '50')) {
       var str = "<select id=extnblngcd_id name=\"extnblngcd\" class=\"sel_all\">" +
                      "<option value='' selected>��ü</option>" +
                  "</select>"
        document.all.extnblngcd_id.outerHTML = str;
        return;
    }
    // Ȯ�������ڵ尪�� "/ss/extn/1010" �������� ������
    lo_form1.action = "/ss/extn/1010";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ����ã�� �˾�
// Ȯ����Ȳ�� ����ã�Ⱑ 2���̹Ƿ� �Ű������� ���� ������ ó���Ѵ�.
// ���������ڵ�, ����������� �˾����κ��� �Ѿ�´�. �� ���� �����ڴ� "\n"
function bo_search(no){
    var lo_form1 = document.extn_search_form;
    if(no == '1'){				// �ش���������(�ΰ�����)
        var	deptcd = lo_form1.deptcd.value;
        var areacd = lo_form1.areacd.value;
	    var bonm   = lo_form1.corrbonm.value;

		var ls_return = jsNewModalWinNoS("/ss/common/1110", deptcd+":"+areacd+":"+bonm, "725","480");
        var la_str;

        if(ls_return.indexOf("\n") != -1){
            la_str = ls_return.split("\n");
            lo_form1.corrbocd.value = la_str[0];
            lo_form1.corrbonm.value = la_str[1];
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
        	if(gs_request == 'L'){			// �����˻��� �ϳ��� ��� �˻��� ���
        		gs_request = 'N';
        		list_search();
        	}else if(gs_request == 'LC'){	// �� �����˻� �� �ش����� �˻��� ���
        		gs_request = 'N'
        		list_search();
        	}else if(gs_request == 'LE'){	// �� �����˻� �� Ȯ������ �˻��� ���
        		gs_request = 'N'
        		list_search();
        	}else if(gs_request == 'LCE'){	// �����˻��� �ΰ��� ��� �� ���� �˻��� ó������ ���� ���(�ش� ���� ó������)
        		gs_request = 'LE'
        		bo_list_search();
        	}
		}
    }else if(no == '2'){	// Ȯ����������(Ȯ��(����)����)
        var	deptcd = lo_form1.extn_deptcd.value;
        var areacd = lo_form1.extn_areacd.value;
	    var bonm   = lo_form1.rdr_extnbonm.value;

		var ls_return = jsNewModalWinNoS("/ss/common/1110", deptcd+":"+areacd+":"+bonm, "725","480");
        var la_str;

        if(ls_return.indexOf("\n") != -1){
            la_str = ls_return.split("\n");
            lo_form1.rdr_extnbocd.value = la_str[0];
            lo_form1.rdr_extnbonm.value = la_str[1];
/*
            lo_form1.extn_deptcd.value = la_str[2];
            lo_form1.extn_areacd.outerHTML =
            		'<select name="extn_areacd" size="1" id="areacd_id" class="sel_all">' +
            		'<option value="' +
            		la_str[4] +
            		'" selected>' +
            		la_str[5] +
            		'</option>';
*/
        	if(gs_request == 'L'){			// �����˻��� �ϳ��� ��� �˻��� ���
        		gs_request = 'N';
        		list_search();
        	}else if(gs_request == 'LC'){	// �� �����˻� �� �ش����� �˻��� ���
        		gs_request = 'N'
        		list_search();
        	}else if(gs_request == 'LE'){	// �� �����˻� �� Ȯ������ �˻��� ���
        		gs_request = 'N'
        		list_search();
        	}else if(gs_request == 'LCE'){	// �����˻��� �ΰ��� ��� �� ���� �˻��� ó������ ���� ���(�ش� ���� ó������)
        		gs_request = 'LE'
        		bo_list_search();
        	}
		}
    }
	return;
}

// �ش�����,Ȯ��(����)���� ������ ���� ��������
var gs_no;

// ����Ű�� ���� ����ã��
function bo_enter_search(no){
    var e = window.event;
    if(!e || e.keyCode != "13") return;
    window.event.returnValue=false;

	// ����Ű �˻��� ���� ������ ���� �̿��Ѵ�.
    var lo_form1 = document.bo_enter_search_form;
    var lo_form2 = document.extn_search_form;

	// �ش���������
	if(no == '1'){
	    lo_form1.deptcd.value = lo_form2.deptcd.value;
	    lo_form1.areacd.value = lo_form2.areacd.value;
	    lo_form1.bonm.value = lo_form2.corrbonm.value;

	    //�������� �������� ������ �����˻��˾��� ����.
		if(lo_form1.bonm.value == ''){
			bo_search('1');
			return;
		}

	// Ȯ��(����)��������
	}else if(no == '2'){
	    lo_form1.deptcd.value = lo_form2.extn_deptcd.value;
	    lo_form1.areacd.value = lo_form2.extn_areacd.value;
	    lo_form1.bonm.value = lo_form2.rdr_extnbonm.value;

	    //�������� �������� ������ �����˻��˾��� ����.
		if(lo_form1.bonm.value == ''){
			bo_search('2');
			return;
		}
	}

	// �ش�����,Ȯ��(����)���� ������ ���� �������� ����
	gs_no = no;

	// �μ��ڵ�,�����ڵ�,��������  "/ss/common/1113" �������� ������
    lo_form1.action = "/ss/common/1113";
    lo_form1.target = "ifrm";
    lo_form1.submit();

}

// ����Ű�� ���� ����ã�� ���ó��
function bo_enter_search_result(no){
	// �˻������ �Ѱ��̹Ƿ� �˻�â�� ������� �����Ѵ�.
	if(no == '1'){

		var lo_form1 = ifrm.document.bo_detail_form;

		// �ش���������
		if(gs_no == '1'){
			var lo_form2 = document.extn_search_form;
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
			lo_form2.corrbocd.value = lo_form1.bocd.value;
			lo_form2.corrbonm.value = lo_form1.bonm.value;

		// Ȯ��(����)��������
		}else if(gs_no == '2'){
			var lo_form2 = document.extn_search_form;
/*
			lo_form2.extn_deptcd.value = lo_form1.deptcd.value;
	        lo_form2.extn_areacd.outerHTML =
	        		'<select name="extn_areacd" size="1" id="extn_areacd_id" class="sel_all">' +
	        		'<option value="' +
	        		lo_form1.areacd.value +
	        		'" selected>' +
	        		lo_form1.areanm.value +
	        		'</option>';
*/
			lo_form2.rdr_extnbocd.value = lo_form1.bocd.value;
			lo_form2.rdr_extnbonm.value = lo_form1.bonm.value;

		}
	// �˻������ ���ų� �������̹Ƿ� ����ã�� �˾��� ����.
	}else if(no == '2'){

		bo_search(gs_no);
	}
}

// ��Ϻ���
function list_search()
{
    var lo_form1 = document.extn_search_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // ȭ�������� ��ȣ�� �ʱ�ȭ�Ѵ�.
    lo_form1.pageno.value = '1';

	// Ȯ�� �������� ������ URL�� �����Ͽ� �ش� �������� ������.
    if(lo_form1.rdr_extntypecd.value == ''){		// ��ü
        lo_form1.action = "/ss/cns/1020";
    }else if(lo_form1.rdr_extntypecd.value == '10'){	// ���
        lo_form1.action = "/ss/cns/1040";
    }else if(lo_form1.rdr_extntypecd.value == '20'){	// ǰ����
        lo_form1.action = "/ss/cns/1050";
    }else if(lo_form1.rdr_extntypecd.value == '30'){	// ������ü
        lo_form1.action = "/ss/cns/1060";
    }else if(lo_form1.rdr_extntypecd.value == '40'){	// ������û
        lo_form1.action = "/ss/cns/1030";
    }else if(lo_form1.rdr_extntypecd.value == '50'){	// ���ڱ���
        lo_form1.action = "/ss/cns/1030";
    }

    lo_form1.target = "ifrm";
    lo_form1.submit();
}


// �󼼺���
function detail_view(rdr_extntypecd, aplcpathcd, rdr_extndt, rdr_extnno, rdr_no, medicd, cntrno, mangno){

    var lo_form1 = document.extn_list_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // Ȯ������, Ȯ���ȣ�� "/ss/extn/1090" �������� ������
    lo_form1.rdr_extntypecd.value = rdr_extntypecd;
    lo_form1.aplcpathcd.value = aplcpathcd;
    lo_form1.rdr_extndt.value = rdr_extndt;
    lo_form1.rdr_extnno.value = rdr_extnno;
    lo_form1.rdr_no.value = rdr_no;
    lo_form1.medicd.value = medicd;
    lo_form1.cntrno.value = cntrno;
    lo_form1.mangno.value = mangno;
    lo_form1.action = "/ss/cns/1070";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ������ �̵�
function page_move(pageno) {
    var lo_form1 = document.extn_search_form;

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

	// Ȯ�� �������� ������ URL�� �����Ͽ� �ش� �������� ������.
    if(lo_form1.rdr_extntypecd.value == ''){		// ��ü
        lo_form1.action = "/ss/cns/1020";
    }else if(lo_form1.rdr_extntypecd.value == '10'){	// ���
        lo_form1.action = "/ss/cns/1040";
    }else if(lo_form1.rdr_extntypecd.value == '20'){	// ǰ����
        lo_form1.action = "/ss/cns/1050";
    }else if(lo_form1.rdr_extntypecd.value == '30'){	// ������ü
        lo_form1.action = "/ss/cns/1060";
    }else if(lo_form1.rdr_extntypecd.value == '40'){	// ������û
        lo_form1.action = "/ss/cns/1030";
    }else if(lo_form1.rdr_extntypecd.value == '50'){	// ���ڱ���
        lo_form1.action = "/ss/cns/1030";
    }

    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �˻����� ����
function changeSearchHTML(){
	var lv_rdr_extntypecd = document.extn_search_form.rdr_extntypecd.value;	// Ȯ������
	var lv_select1 = document.all.extnblngcd.value;				// Ȯ���� �Ҽ� select
    var lo_table2 = document.all.extn_search_info_bo_id       	// ���� �˻� ���̺�


	var ls_nm = '';                                         	// �̸� �˻�

	if(lv_rdr_extntypecd == '10'){				// ���Ȯ��
		ls_nm =
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�����'+
                    '&nbsp;<input name="extnflnm" type="text" size="8" class="text_box">'+
//                  '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">������'+
//                  '&nbsp;<input name="aplcpersnm" type="text" size="8" class="text_box">'+
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">������'+
                    '&nbsp;<input name="rdrnm" type="text" size="8" class="text_box">'+
//                  '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">������'+
//                  '&nbsp;<input name="pymtflnm" type="text" size="8" class="text_box">'+
					'';
		lo_table2.rows[0].cells[1].innerHTML = ls_nm;

	}else if(lv_rdr_extntypecd == '20'){		// ǰ����Ȯ��
		ls_nm =
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">Ȯ����'+
                    '&nbsp;<input name="extnflnm" type="text" size="8" class="text_box">'+
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">������'+
                    '&nbsp;<input name="rdrnm" type="text" size="8" class="text_box">'+
//                  '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">������'+
//                  '&nbsp;<input name="pymtflnm" type="text" size="8" class="text_box">'+
					'';
		lo_table2.rows[0].cells[1].innerHTML = ls_nm;

	}else if(lv_rdr_extntypecd == '30'){		// ������üȮ��
		    if(lv_select1 == '10' || lv_select1 == '20'){   // ����IS���, �缳��� Ȯ��
				ls_nm =
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�����'+
                    '&nbsp;<input name="extnflnm" type="text" size="8" class="text_box">';
		    }else if(lv_select1 == '30'){		// ��������� Ȯ��
		        ls_nm =
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�����'+
                    '&nbsp;<input name="extnflnm" type="text" size="8" class="text_box">';
		    }else{
		        ls_nm =
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">Ȯ����'+
                    '&nbsp;<input name="extnflnm" type="text" size="8" class="text_box">';
		    }
                ls_nm = ls_nm +
//                  '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��û��'+
//                  '&nbsp;<input name="aplcpersnm" type="text" size="8" class="text_box">'+
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">������'+
                    '&nbsp;<input name="rdrnm" type="text" size="8" class="text_box">'+
//                  '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">������'+
//                  '&nbsp;<input name="pymtflnm" type="text" size="8" class="text_box">'+
					'';
		lo_table2.rows[0].cells[1].innerHTML = ls_nm;

	}else if(lv_rdr_extntypecd == '40'){		// ������û
		ls_nm =
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��û��'+
                    '&nbsp;<input name="aplcpersnm" type="text" size="8" class="text_box">'+
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">������'+
                    '&nbsp;<input name="rdrnm" type="text" size="8" class="text_box">'+
//                  '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">������'+
//                  '&nbsp;<input name="pymtflnm" type="text" size="8" class="text_box">'+
					'';
		lo_table2.rows[0].cells[1].innerHTML = ls_nm;

	}else if(lv_rdr_extntypecd == '50'){		// ���̹�
		ls_nm =
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">Ȯ����'+
                    '&nbsp;<input name="extnflnm" type="text" size="8" class="text_box">'+
//                  '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��û��'+
//                  '&nbsp;<input name="aplcpersnm" type="text" size="8" class="text_box">'+
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">������'+
                    '&nbsp;<input name="rdrnm" type="text" size="8" class="text_box">'+
//                  '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">������'+
//                  '&nbsp;<input name="pymtflnm" type="text" size="8" class="text_box">'
					'';
		lo_table2.rows[0].cells[1].innerHTML = ls_nm;
	}
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

    var lo_form1 = document.extn_search_form;	// �˻� ��

	if(flag == '1'){			// Ȯ������ �μ�,����,���� �ʱ�ȭ
		// �μ� �ʱ�ȭ
		lo_form1.deptcd.outerHTML =  '<select name="deptcd" onChange="area_search(\'1\');" class="sel_all">'
									+'<%// writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true); %>'
									+'</select>';
		// ���� �ʱ�ȭ
		lo_form1.areacd.outerHTML =  '<select name="areacd" size="1" id="areacd_id" class="sel_all">'
									+'<% //writeAreaOpt(session, out, true); %>'
									+'</select>';
		// �����ڵ�,������ �ʱ�ȭ, ��Ŀ���̵�
		lo_form1.corrbocd.value = "";
		lo_form1.corrbonm.value = "";
		lo_form1.corrbonm.focus();
	}else if(flag == '2'){		// �������� �μ�,����,���� �ʱ�ȭ
		// �μ� �ʱ�ȭ
		lo_form1.extn_deptcd.outerHTML =  '<select name="extn_deptcd" onChange="area_search(\'2\');" class="sel_all">'
										 +'<% //writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true); %>'
									     +'</select>';
		// ���� �ʱ�ȭ
		lo_form1.extn_areacd.outerHTML =  '<select name="extn_areacd" size="1" id="extn_areacd_id" class="sel_all">'
										 +'<% //writeAreaOpt(session, out, true); %>'
										 +'</select>';
		// �����ڵ�,������ �ʱ�ȭ, ��Ŀ���̵�
		lo_form1.rdr_extnbocd.value = "";
		lo_form1.rdr_extnbonm.value = "";
		lo_form1.rdr_extnbonm.focus();
	}else if(flag == '4'){		// �Ⱓ �ʱ�ȭ
	}else if(flag == '5'){		// ��Ÿ �ʱ�ȭ
	}
}

// ��� ��ȸ�� �������� ������ ��� �����˻� �� ��� ��ȸ�� �����Ѵ�.
// �̰�� �ܼ� �����˻��� �����˻� �� ��� ��ȸ�� �����ؾ� �ϴ°� �����ؾ� �ϰ� �����ȸ�� �����ؾ� �ϴ� ���� gs_request �������� L �� �����Ѵ�.
var gs_request = 'N';	// N : ��û����, L : ��ȸ��û, LC : �� �����˻� �� �ش����� ��ȸ, LE : �� �����˻� �� Ȯ������ ��ȸ, LCE : �� �����˻� ��� ��ȸ.

// ��û �÷��� ����
function set_request(){
    var lo_form1 = document.extn_search_form;	// �˻� ��
	if(lo_form1.corrbonm.value == '' && lo_form1.rdr_extnbonm.value == ''){
		lo_form1.corrbocd.value = '';
		lo_form1.rdr_extnbocd.value = '';
		gs_request = 'L';
	}else if(lo_form1.corrbonm.value == ''){
		lo_form1.corrbocd.value = '';
		gs_request = 'LE';
	}else if(lo_form1.rdr_extnbonm.value == ''){

		lo_form1.rdr_extnbocd.value = '';
		gs_request = 'LC';
	}else{
		gs_request = 'LCE';
	}
}

// �����˻��� ���� ��� ��ȸ
function bo_list_search(){
    var lo_form1 = document.bo_enter_search_form;
    var lo_form2 = document.extn_search_form;

	if(gs_request == 'L'){
		list_search();
	}else if(gs_request == 'LC' || gs_request == 'LCE'){
	    lo_form1.deptcd.value = lo_form2.deptcd.value;
	    lo_form1.areacd.value = lo_form2.areacd.value;
	    lo_form1.bonm.value = lo_form2.corrbonm.value;

		gs_no = '1';

		// �μ��ڵ�,�����ڵ�,��������  "/ss/common/1113" �������� ������
	    lo_form1.action = "/ss/common/1113";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	}else if(gs_request == 'LE'){
	    lo_form1.deptcd.value = lo_form2.extn_deptcd.value;
	    lo_form1.areacd.value = lo_form2.extn_areacd.value;
	    lo_form1.bonm.value = lo_form2.rdr_extnbonm.value;

		gs_no = '2';

		// �μ��ڵ�,�����ڵ�,��������  "/ss/common/1113" �������� ������
	    lo_form1.action = "/ss/common/1113";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	}
}

//ķ���� Ȯ�������� ���� �̺�Ʈ��� �˻�
function event_list_search( camp_type ) {

   	var lo_form1 = document.event_list_search_form;

	if( camp_type == "" ) {
		return;
	}

//	if( camp_type == "E" ) {
    lo_form1.camp_event_id.value = camp_type;
//	} else { return; }

	lo_form1.action = "/ss/camp/1101";
    lo_form1.target = "ifrm";
	lo_form1.submit();
}


var gs_no;


//����Ű�� ���� �����ȣ �˻�(��û��)
function zip_enter_search(i_pageno){
	gs_no = '1';

    var e = window.event;
    if(!e || e.keyCode != "13") return;

	//�����ȣ ������ �ƴ϶�� zip_search �Լ��� call �Ѵ�.
	if(!validate_zip(extn_detail_form.aplcperszip.value)){
        zip_search(i_pageno);
		window.event.returnValue = false;
        return;
    }

	var lo_form = document.zip_search_form;
    lo_form.zip.value = extn_detail_form.aplcperszip.value;
    lo_form.pageno.value = i_pageno;   // ��������ȣ
    lo_form.pagesize.value = "10000";  // ������������( �� �������� �ִ� ���ڵ� ��)

    if(!check_all(zip_search_form, "/ss/common/1152")) return;
}

//����Ű�� ���� �����ȣ �˻� �� �˻� ����� �Ѱ��϶�, ����� �ʵ忡 ����
function set_zip_search_result(){

	var zip_form 		= ifrm.document.zip_detail_form; 		// ifrm �� ��ȸ�� ��� form
	var lo_form 	    = document.extn_detail_form;	 	// ���� ȭ�鳻 ���ڻ���

	if(gs_no == '1'){
		lo_form.aplcperszip.value 	= zip_form.zip.value;
		lo_form.aplcpersaddr.value 	= zip_form.addr.value;
        lo_form.tempbocd.value = zip_form.bocd.value;
		lo_form.tempbonm.value = zip_form.bonm.value;
		lo_form.temptelno1.value = zip_form.telno1.value;
		lo_form.temptelno2.value = zip_form.telno2.value;
		lo_form.temptelno3.value = zip_form.telno3.value;

	}else{
		lo_form.dlvzip.value 	= zip_form.zip.value;
		lo_form.dlvaddr.value 	= zip_form.addr.value;
        lo_form.bocd.value = zip_form.bocd.value;
		lo_form.bonm.value = zip_form.bonm.value;
		lo_form.telno1.value = zip_form.telno1.value;
		lo_form.telno2.value = zip_form.telno2.value;
		lo_form.telno3.value = zip_form.telno3.value;

	}

	gs_no = '';
}

// �����ȣ ��ȿ�� ����
function validate_zip(s_zip){
	if(trim(s_zip) == "") return false;
    var format = /^(\d{3})(-{0,1})(\d{3})$/;
    return isValidFormat(s_zip, format);
}

//�˻���ư�� ���� �����ȣ �˻�(�˾�)(��û��)
function zip_search(i_pageno){

	if(gs_no == '2'){
		zip_search2(i_pageno);
		return;
	}
	gs_no = '1';

    var job_flg = "A"; //��ü �˻� "A" , ������ �˻� "S"
    var ls_name = deleteHyphen(trim(extn_detail_form.aplcperszip.value) + ":" + job_flg);
	var lo_form = document.extn_detail_form;
	var ls_uri = "/ss/common/1150";
    var ls_return = jsNewModalWinNoS(ls_uri, ls_name, "430", "410");

	var la_str;
	if(ls_return.indexOf("\n") != -1){
    	la_str = ls_return.split("\n");
        lo_form.aplcperszip.value = la_str[0];
		lo_form.aplcpersaddr.value = la_str[1];
		lo_form.tempbocd.value = la_str[4];
		lo_form.tempbonm.value = la_str[5];
		lo_form.temptelno1.value = la_str[6];
		lo_form.temptelno2.value = la_str[7];
		lo_form.temptelno3.value = la_str[8];
	}
	return;
}

//����Ű�� ���� �����ȣ �˻�2(������)
function zip_enter_search2(i_pageno){
	gs_no = '2';

    var e = window.event;
    if(!e || e.keyCode != "13") return;

	//�����ȣ ������ �ƴ϶�� zip_search �Լ��� call �Ѵ�.
	if(!validate_zip(extn_detail_form.dlvzip.value)){
        zip_search2(i_pageno);
		window.event.returnValue = false;
        return;
    }else{

		var lo_form = document.zip_search_form;
	    lo_form.zip.value = extn_detail_form.dlvzip.value;
	    lo_form.pageno.value = i_pageno;   // ��������ȣ
	    lo_form.pagesize.value = "10000";  // ������������( �� �������� �ִ� ���ڵ� ��)

	    if(!check_all(zip_search_form, "/ss/common/1152")) return;

    }

}

//�˻���ư�� ���� �����ȣ �˻�(�˾�)2(������)
function zip_search2(i_pageno){
	gs_no = '2';

    var job_flg = "A"; //��ü �˻� "A" , ������ �˻� "S"
    var ls_name = deleteHyphen(trim(extn_detail_form.dlvzip.value) + ":" + job_flg);
	var lo_form = document.extn_detail_form;
	var ls_uri = "/ss/common/1150";
    var ls_return = jsNewModalWinNoS(ls_uri, ls_name, "430", "410");

	var la_str;
	if(ls_return.indexOf("\n") != -1){
    	la_str = ls_return.split("\n");
        lo_form.dlvzip.value = la_str[0];
		lo_form.dlvaddr.value = la_str[1];
        lo_form.bocd.value = la_str[4];
		lo_form.bonm.value = la_str[5];
		lo_form.telno1.value = la_str[6];
		lo_form.telno2.value = la_str[7];
		lo_form.telno3.value = la_str[8];
	}
	return;
}


// �߰�
function add(){
    var lo_form1 = document.extn_detail_form;	                // ������ ��

	// ���� �׸��� �����ϰ� ȭ�� ����
    var c_form2_elements = lo_form1.elements;
    for( var i =0; i< c_form2_elements.length; i++){
		c_form2_elements(i).value = "";
    }

	document.all.type_id.innerHTML = '&nbsp;������û';
	document.all.path_id.innerHTML = '&nbsp;TM';
	document.all.bocnfm_id.innerHTML = '&nbsp;';
	document.all.bocmfmtm_id.innerHTML = '&nbsp;';
	document.all.cns_empnm_id.innerHTML = '<%//= Util.getSessionParameterValue(request, "emp_nm", false)%>&nbsp;';
	document.all.cnscnfmtm_id.innerHTML = '&nbsp;';
	lo_form1.medicd.value='110'	//�����Ϻ� �⺻

    lo_form1.jobflag.value = 'E';									// �۾������� Ȯ������ ����
    lo_form1.accflag.value = 'I';									// ó�������� �Է����� ����
}

// ����
function save(){
   var lo_form1 = document.extn_detail_form;

    lo_form1.jobflag.value = 'E';									// �۾������� Ȯ������ ����

//	if(lo_form1.accflag.value == 'D'){								// ������ ���ܹ߻��ϸ� 'U'�� �����Ѵ�.
//		lo_form1.accflag.value = 'U';
//	}

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    if(lo_form1.type_id.value == '') {
		alert("ķ���������� �����ϼ���");
		return;
    }

    if(lo_form1.camp_id.value == '') {
		alert("�̺�Ʈ������ �����ϼ���");
		return;
    }

//   alert( lo_form1.type_id.value );
//   alert( lo_form1.camp_id.value );


    //��üüũ
	if(lo_form1.medicd.value == ''){
		alert("��ü�� �����ϼ���");
		return;
	}

    //������ �ּ� üũ
	if(lo_form1.dlvzip.value == '' || lo_form1.dlvaddr.value == '' || lo_form1.dlvdtlsaddr.value == ''){
		alert("������ �ּҸ� �Է��ϼ���");
		return;
	}

	//����������üũ
	if(lo_form1.dlvhopedt.value == ''){
		alert("���������ڸ� �Է��ϼ���");
		return;
	}

    //�ְ����� üũ
	if(lo_form1.resitypecd.value == ''){
		alert("�ְ����¸� �Է��ϼ���");
		return;
	}

	//������ �̸� üũ
	if(lo_form1.rdrnm.value == ''){
		alert("������ ������ �Է��ϼ���");
		return;
	}

	//����Ȯ�ο���
    //�������úκ��� �����߱� ������ �⺻ N�� ����
    lo_form1.cnscnfmyn.value = 'N';

//    lo_form1.camptypecd.value = lo_form.type_id.value;
//    lo_form1.camp_event_id.value = '';

    //�űԵ��
    lo_form1.action = "/ss/camp/1100";

    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ����
function del(){
    var lo_form1 = document.extn_detail_form;

    lo_form1.jobflag.value = 'E';									// �۾������� Ȯ������ ����

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

	// ����, ��ȣ ���翩�θ� Ȯ���Ѵ�
    if(lo_form1.dt.value == '' || lo_form1.no.value == '') {
        alert("�ش����� Ŭ�� �� �����ϼ���.");
        return;
    }

	var yesno = confirm("�����Ͻðڽ��ϱ�?");
	if(yesno){
	    lo_form1.accflag.value = 'D';								// �۾������� ����('D')�� ����
	    lo_form1.target = "ifrm";
	    lo_form1.action = "/ss/cns/1570";
	    lo_form1.submit();
	}
}


// ��û�ڿ� ������ ��� ���������� ����
function set_rdr_info(){
    var lo_form1 = document.extn_detail_form;

	lo_form1.rdrnm.value =       	        	lo_form1.aplcpersnm.value;
	lo_form1.rdrtel_no1.value =  				lo_form1.aplcperstel_no1.value;
	lo_form1.rdrtel_no2.value =  				lo_form1.aplcperstel_no2.value;
	lo_form1.rdrtel_no3.value =  				lo_form1.aplcperstel_no3.value;
	lo_form1.rdrptph_no1.value = 	        	lo_form1.aplcpersptph_no1.value;
	lo_form1.rdrptph_no2.value = 				lo_form1.aplcpersptph_no2.value;
	lo_form1.rdrptph_no3.value = 				lo_form1.aplcpersptph_no3.value;
	lo_form1.rdremail.value =    	        	lo_form1.aplcpersemail.value;
	lo_form1.dlvzip.value =      				lo_form1.aplcperszip.value;
	lo_form1.dlvaddr.value =     				lo_form1.aplcpersaddr.value;
	lo_form1.dlvdtlsaddr.value = 				lo_form1.aplcpersdtlsaddr.value;
	lo_form1.bocd.value =        				lo_form1.tempbocd.value;
	lo_form1.bonm.value =        				lo_form1.tempbonm.value;
	lo_form1.telno1.value =      				lo_form1.temptelno1.value;
	lo_form1.telno2.value =      				lo_form1.temptelno2.value;
	lo_form1.telno3.value =      				lo_form1.temptelno3.value;
}

//enter key ó��
function check_enter(){
    var e = window.event;
    if(!e || e.keyCode != "13") return;
    window.event.returnValue=false;

    set_request();bo_list_search();window.event.returnValue=false;
}
-->
</script>
</head>


<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" margin class="scroll1"  onload="jsInit()" onkeydown="check_enter();">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >ķ����
        &gt; </b>ķ����Ȯ��</td>
    </tr>
    <tr>
        <td height="10">
        <!--������ ���� ����-->
        </td>
    </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
    <tr>
        <td>

    <!--Ȯ�� �˻� ����-------------------------------------------------------------------------->
    <table width="830" border="0" cellspacing="0" cellpadding="2" id="extn_search_id">
    <form name="extn_search_form" method="post" action="" >
        <input name="pageno" type="hidden" value ="1">			                <!-- ���� ������ ��ȣ -->
        <input name="pagesize" type="hidden" value ="<%= extnListCount%>">	    <!-- �� ȭ��� ����Ʈ �׸� �� -->
        <input name="js_fn_nm" type="hidden" value ="page_move">
        <input name="common_deptcd" type="hidden" value ="">                    <!-- ���� �μ��ڵ� -->
        <input name="corrbocd" type="hidden" value ="">                         <!-- �ش����������ڵ� -->
        <input name="rdr_extnbocd" type="hidden" value ="">                     <!-- Ȯ�����������ڵ� -->
   </form>
<tr>
    <td valign="top">
	<table width="829" border="0"  cellpadding="1" cellspacing="0" align="center">
		<tr>
			<td  height="25" bgcolor="#EBE9DC" class="title" width="100">Ȯ���û ��</td>
			<td align="right"  bgcolor="#EBE9DC" height="25" class="title">
				<input type="image" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" onclick="save()" border="0">&nbsp;
			</td>
		</tr>
		<tr>
			<td height="3">
			<!--����-->
			</td>
		</tr>
	</table>

    <!--Ȯ�� �� ���� -------------------------------------------------------------------------->
	<table width="830" border="0" cellspacing="1" cellpadding="2" class="gray" bgcolor="#FFFFFF" id="extn_detail_id">
	<form name="extn_detail_form" method="post" action="" >
		<input name="jobflag" type="hidden" value ="E">	<!--Ȯ�����-->
		<input name="accflag" type="hidden" value ="I">
		<input name="bocd" type="hidden" value ="">
		<input name="dt" type="hidden" value ="">		<!--�������-->
		<input name="no" type="hidden" value ="">		<!--��Ϲ�ȣ-->
		<input name="cnscnfmyn" type="hidden" value =""><!--����Ȯ�ο���-->

		<input name="tempbocd" type="hidden" value ="">
		<input name="tempbonm" type="hidden" value ="">
		<input name="temptelno1" type="hidden" value ="">
		<input name="temptelno2" type="hidden" value ="">
		<input name="temptelno3" type="hidden" value ="">

		<input name="pageno" type="hidden" value =""><!--�˻����� ��������ȣ-->

        <input name="camptypecd" type="hidden" value ="">
        <input name="camp_event_id" type="hidden" value ="">

	    <!--�Ϲ����� ����-->
	    <tr>
	        <td rowspan="2" class="gray" bgcolor="#EBE9DC"> Ȯ���Ϲ�</td>
	        <td width="80" class="gray" bgcolor="#dddddd">Ȯ������</td>
	        <td width="150" class="gray">ķ����Ȯ��</td>
            <input type="hidden" name="rdr_extntypecd" value="80">
	        <td width="80" class="gray" bgcolor="#dddddd">ķ��������</td>
	        <td width="150" class="gray">
				<select name="type_id" id="type_id" class="sel_all" onchange="event_list_search(this.value);">
                  <option value="">����</option>
                  <%= ds.curcampcdOptHtml("") %>
				</select>
	        </td>
	        <td width="80" class="gray" bgcolor="#dddddd">�̺�Ʈ����</td>
	        <td width="150" class="gray">
				<select name="camp_id" id="camp_id" class="sel_all">
                  <option value="">����</option>
                  <%//= ds.curcampeventcdOptHtml("") %>
				</select>
            </td>
	    </tr>
	    <tr>
	        <td width="80" class="gray" bgcolor="#dddddd"> ��ü<font color="red">*</font></td>
	        <td width="150" class="gray">
				<select name="medicd" class="sel_all">
                  <option value="">����</option>
                  <%= ds.curmedicdOptHtml("") %>
				</select>
			</td>
	        <td width="80" class="gray" bgcolor="#dddddd">�μ�<font color="red">*</font></td>
	        <td colspan="3" class="gray" align="left">
	        	<input name="qty" type="text" size="4" style="text-align:right;" dataType="number" class="text_box" value="1" notEmpty caption="�μ�">&nbsp;
	        </td>
	    </tr>
	    <!--�Ϲ����� ��-->

	    <!--��û�� ����-->
	    <tr>
	        <td rowspan="3" class="gray" bgcolor="#EBE9DC"> ��û��</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> ����<font color="red">*</font></td>
	        <td width="150" class="gray">
	        	<input name="aplcpersnm" type="text" size="10" style="ime-mode:active;" class="text_box"  notEmpty caption="��û�ڼ���">&nbsp;
	        </td>
	        <td width="80" class="gray" bgcolor="#dddddd"> ��ȭ��ȣ</td>
	        <td width="150" class="gray">
				<input name="aplcperstel_no1" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="aplcperstel_no2" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="aplcperstel_no3" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">
	        </td>
	        <td width="80" class="gray" bgcolor="#dddddd"> �޴�����ȣ</td>
	        <td width="150" class="gray">
	        	<input name="aplcpersptph_no1" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="aplcpersptph_no2" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="aplcpersptph_no3" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">
			</td>
	    </tr>
        <tr>
            <td width="80" class="gray" bgcolor="#dddddd"> �̸���</td>
            <td colspan="3" class="gray">
	        	<input name="aplcpersemail" type="text" size="50" style="ime-mode:active;" class="text_box">&nbsp;
            </td>
            <td width="80" class="gray" bgcolor="#dddddd">���� ����<font color="red">*</font></td>
            <td width="150" class="gray">
				<select name="rshpclsfcd" class="sel_all">
					<option value="" selected>����</option>
					<option value="1">����</option>
					<option value="2">����</option>
					<option value="3">ģô</option>
					<option value="4">ģ��</option>
					<option value="5">ȸ��</option>
					<option value="6">��Ÿ</option>
					<option value="C">ģ��</option>
					<option value="D">����������</option>
				</select>
			</td>
        </tr>
        <tr>
			<td width="80" bgcolor="#dddddd" class="gray">�ּ�<font color="red">*</font></td>
			<td colspan="5"  class="gray">
				<input name="aplcperszip" type="text" size="8"  class="text_box" caption="�����ȣ onkeydown="zip_enter_search(1);">
				<input type="image" src="/html/comm_img/bu_search03.gif" width="39" height="19" align="absmiddle" style="cursor:hand;" onclick="zip_search();window.event.returnValue=false;">
				<input name="aplcpersaddr" type="text" size="40" class="text_box" readonly>
				<input name="aplcpersdtlsaddr" type="text" size="40" class="text_box" style="ime-mode:active;">
			</td>
        </tr>
	    <!--��û�� ��-->

	    <!--������ ����-->
	    <tr>
	        <td rowspan="3" class="gray" bgcolor="#EBE9DC"> ������</td>
	        <td width="80" class="gray" bgcolor="#dddddd">����<font color="red">*</font></td>
	        <td width="150" class="gray">
	        	<input name="rdrnm" type="text" size="10" style="ime-mode:active;" class="text_box" notEmpty caption="�����ڼ���">&nbsp;<input type="image" src="/html/comm_img/bu_same.gif" align="absmiddle" style="cursor:hand;" onclick="set_rdr_info();window.event.returnValue=false;">
	        </td>
	        <td width="80" class="gray" bgcolor="#dddddd"> ��ȭ��ȣ</td>
	        <td width="150" class="gray">
				<input name="rdrtel_no1" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="rdrtel_no2" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="rdrtel_no3" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">
	        </td>
	        <td width="80" class="gray" bgcolor="#dddddd"> �޴�����ȣ</td>
	        <td width="150" class="gray">
	        	<input name="rdrptph_no1" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="rdrptph_no2" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="rdrptph_no3" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">
			</td>
	    </tr>
        <tr>
            <td width="80" class="gray" bgcolor="#dddddd"> �̸���</td>
            <td colspan="5" class="gray">
	        	<input name="rdremail" type="text" size="50" style="ime-mode:active;" class="text_box">&nbsp;
            </td>
        </tr>
        <tr>
			<td width="80" bgcolor="#dddddd" class="gray">����ּ�<font color="red">*</font></td>
			<td colspan="5"  class="gray">
				<input name="dlvzip" type="text" size="8"  class="text_box" caption="�����ȣ" onkeydown="zip_enter_search2(1);">
				<input type="image" src="/html/comm_img/bu_search03.gif" width="39" height="19" align="absmiddle" style="cursor:hand;" onclick="zip_search2();window.event.returnValue=false;">
				<input name="dlvaddr" type="text" size="40" class="text_box" readonly>
				<input name="dlvdtlsaddr" type="text" size="40" class="text_box" style="ime-mode:active;">
			</td>
        </tr>
	    <!--������ ��-->

	    <!--������� ����-->
	    <tr>
	        <td rowspan="2" class="gray" bgcolor="#EBE9DC"> �������</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> ������<font color="red">*</font></td>
	        <td width="150" class="gray">
	        	<input name="bonm" type="text" size="10" style="ime-mode:active;" class="text_box" readOnly>&nbsp;
	        </td>
	        <td width="80" class="gray" bgcolor="#dddddd"> ������ȭ��ȣ</td>
	        <td colspan="3" class="gray">
				<input name="telno1" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box" readOnly>-
				<input name="telno2" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box" readOnly>-
				<input name="telno3" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box" readOnly>
	        </td>
	    </tr>
	    <tr>
	        <td width="80" class="gray" bgcolor="#dddddd"> ��������<font color="red">*</font></td>
	        <td width="150" class="gray">
	        	<input name="dlvhopedt" type="text" size="10" class="text_box" dataType="date">&nbsp;
	        </td>
	        <td width="80" class="gray" bgcolor="#dddddd">�ְ�����</td>
	        <td width="150" class="gray">
				<select name="resitypecd" class="sel_all">
					<option value="" selected>����</option>
					<option value="1">����Ʈ</option>
					<option value="2">����&����</option>
					<option value="3">����</option>
					<option value="4">�繫��</option>
					<option value="5">��</option>
					<option value="6">��Ÿ</option>
				</select>
			</td>
	        <td width="80" class="gray" bgcolor="#dddddd">�ְű���</td>
	        <td width="150" class="gray">
				<select name="resiclsfcd" class="sel_all">
					<option value="" selected>����</option>
					<option value="1">����</option>
					<option value="2">����</option>
					<option value="3">����</option>
					<option value="4">�ϼ�</option>
					<option value="5">����</option>
				</select>
			</td>
	    </tr>
	    <!--������� ��-->

	    <!--���ں�� ����-->
	    <!--���ں�� ��-->

	    <!--���� ����-->
	    <!--���� ��-->

	    <!--���� ����-->
	    <!--���� ��-->
	</form>
	</table>
    <!--Ȯ�� �� �� -------------------------------------------------------------------------->

    </td>
</tr>
</table>

<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
<!--����Ű�� ���� �����˻������� ��-->
<form name="zip_search_form" method="post" style="display:none">
    <input type=hidden name=bocd     	 value="">  <!--���������ڵ�           -->
	<input type=hidden name=zip 		 value="">  <!--�����ȣ               -->
    <input type=hidden name=pageno		 value="">  <!--����������             -->
    <input type=hidden name=pagesize	 value="">  <!--�������� ������ �Ǽ�   -->
</form>
<form name="bo_enter_search_form" method="post" action="" style="display:none";>
    <input name="deptcd" type="hidden" value ="">	<!--�μ��ڵ�-->
    <input name="areacd" type="hidden" value ="">	<!--�����ڵ�-->
    <input name="bonm" type="hidden" value ="">		<!--������-->
</form>
<form name="event_list_search_form" method="post" action="" style="display:none";>
    <input name="camp_event_id" type="hidden" value ="">
</form>
</body>
</html>
