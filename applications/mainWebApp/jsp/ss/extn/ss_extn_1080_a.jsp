<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1000_a.jsp
* ��� : Ȯ����Ȳ-����Ȯ���û��Ȳ-�ʱ�ȭ��
* �ۼ����� : 2007-11-16
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_JM_EXTN_INITDataSet ds = (SS_L_RDR_JM_EXTN_INITDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;	// ���� ���� ����
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
	document.extn_search_form.corrbonm.focus();
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

// Ȯ���� �Ҽ� �˻�(20050418 ��뼷 ���� : ���̹�����Ȯ�� �߰�)
function extnblng_search(){
    var lo_form1 = document.extn_search_form;
    if( (lo_form1.rdr_extntypecd.value == '') || (lo_form1.rdr_extntypecd.value == '40') || (lo_form1.rdr_extntypecd.value == '50')  || (lo_form1.rdr_extntypecd.value == '70')) {
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
//	    var bonm   = lo_form1.rdr_extnbonm.value;

		var ls_return = jsNewModalWinNoS("/ss/common/1110", deptcd+":"+areacd+":"+bonm, "725","480");
        var la_str;

        if(ls_return.indexOf("\n") != -1){
            la_str = ls_return.split("\n");
            lo_form1.rdr_extnbocd.value = la_str[0];
//            lo_form1.rdr_extnbonm.value = la_str[1];

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
//	    lo_form1.bonm.value = lo_form2.rdr_extnbonm.value;

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
			lo_form2.corrbocd.value = lo_form1.bocd.value;
			lo_form2.corrbonm.value = lo_form1.bonm.value;

		// Ȯ��(����)��������
		}else if(gs_no == '2'){
			var lo_form2 = document.extn_search_form;
			lo_form2.rdr_extnbocd.value = lo_form1.bocd.value;
//			lo_form2.rdr_extnbonm.value = lo_form1.bonm.value;

		}
	// �˻������ ���ų� �������̹Ƿ� ����ã�� �˾��� ����.
	}else if(no == '2'){

		bo_search(gs_no);
	}
}

// ��Ϻ���(20050418 ��뼷 ����:���̹����� �߰�)
function list_search()
{
    var tmp_fromdt;
    var tmp_todt;
    var tmp_resultdt;
    var dt_check_user;

    var lo_form1 = document.extn_search_form;

	//�Ⱓ���� ������ �ʼ�
	if(lo_form1.fromtogb.value == ''){
		alert("�Ⱓ������ �����ϼ���");
		return;
	}

	//�Ⱓ �˻��� �ʼ�
	if(lo_form1.fromdt.value == '' || lo_form1.todt.value == ''){
		alert("�Ⱓ�� �Է��ϼ���");
		return;
	}

//    dt_check_user = "%=session.getAttribute("uid")%";

//    if( dt_check_user != "c190053" ) {

      tmp_fromdt = new Date(lo_form1.fromdt.value);
      tmp_todt   = new Date(lo_form1.todt.value);
      tmp_resultdt = ((tmp_todt.getTime() - tmp_fromdt.getTime()) / (1000 * 60 * 60 * 24) );
      tmp_resultdt = Math.floor(tmp_resultdt);
      if( tmp_resultdt > 31 ) {
        alert("��ȸ�������ڿ� ��ȸ���������� ��������\n�ý����� �����Ϸ� ���� 31���� ���� �� �����ϴ�.\nȮ���Ͻð� ����ȸ �Ͻʽÿ�!");
        return;
      } else if( tmp_resultdt < 0 ) {
        alert("��ȸ�������ڰ� ��ȸ�������� ������ �����Դϴ�.\nȮ���Ͻð� ����ȸ �Ͻʽÿ�!");
        return;
      }

//    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // ȭ�������� ��ȣ�� �ʱ�ȭ�Ѵ�.
    lo_form1.pageno.value = '1';

	// URL�� �ش� �������� ������.
    lo_form1.action = "/ss/extn/1075";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �󼼺���
function detail_view(rdr_extntypecd, aplcpathcd, rdr_extndt, rdr_extnno, rdr_no, medicd, cntrno, mangno, boheadcnfmyn){
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

    if( boheadcnfmyn == "Ȯ��" ) {
      lo_form1.boheadcnfmyn.value = "Y";
    } else {
      lo_form1.boheadcnfmyn.value = "N";
    }

    lo_form1.action = "/ss/extn/1077";
    lo_form1.target = "ifrm";

    lo_form1.submit();
}

// ������ �̵�(20050418 ��뼷 ����:���̹����� �߰�)
function page_move(pageno) {
    var lo_form1 = document.extn_search_form;

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

	//�Ⱓ���� ������ �ʼ�
	if(lo_form1.fromtogb.value == ''){
		alert("�Ⱓ������ �����ϼ���");
		return;
	}

	//�Ⱓ �˻��� �ʼ�
	if(lo_form1.fromdt.value == '' || lo_form1.todt.value == ''){
		alert("�Ⱓ�� �Է��ϼ���");
		return;
	}

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    lo_form1.action = "/ss/extn/1075";
    lo_form1.target = "ifrm";
    lo_form1.submit();
/*
	// Ȯ�� �������� ������ URL�� �����Ͽ� �ش� �������� ������.
    if(lo_form1.rdr_extntypecd.value == ''){		// ��ü
        lo_form1.action = "/ss/extn/1020";
    }else if(lo_form1.rdr_extntypecd.value == '10'){	// ���
        lo_form1.action = "/ss/extn/1040";
    }else if(lo_form1.rdr_extntypecd.value == '20'){	// ǰ����
        lo_form1.action = "/ss/extn/1050";
    }else if(lo_form1.rdr_extntypecd.value == '30'){	// ������ü
        lo_form1.action = "/ss/extn/1060";
    }else if(lo_form1.rdr_extntypecd.value == '40'){	// ������û
        lo_form1.action = "/ss/extn/1030";
    }else if(lo_form1.rdr_extntypecd.value == '50'){	// ���̹�
        lo_form1.action = "/ss/extn/1030";
    }else if(lo_form1.rdr_extntypecd.value == '70'){	// ���̹�����
        lo_form1.action = "/ss/extn/1030";
    }else if(lo_form1.rdr_extntypecd.value == '80'){	// ķ����Ȯ��(20050718 ��뼷 �߰�)
        lo_form1.action = "/ss/extn/1030";
    }

    lo_form1.target = "ifrm";
    lo_form1.submit();
*/
}

// �˻����� ����(20050418 ��뼷 ����:���̹����� �߰�)
function changeSearchHTML(){
	var lv_rdr_extntypecd = document.extn_search_form.rdr_extntypecd.value;	// Ȯ������
	var lv_select1 = document.all.extnblngcd.value;				// Ȯ���� �Ҽ� select
    var lo_table2 = document.all.extn_search_info_bo_id       	// ���� �˻� ���̺�


	var ls_nm = '';                                         	// �̸� �˻�

	if(lv_rdr_extntypecd == '10'){				// ���Ȯ��
		ls_nm =
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�����'+
                    '&nbsp;<input name="extnflnm" type="text" size="8" class="text_box">'+
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">������'+
                    '&nbsp;<input name="rdrnm" type="text" size="8" class="text_box">'+
					'';
		lo_table2.rows[0].cells[1].innerHTML = ls_nm;

	}else if(lv_rdr_extntypecd == '20'){		// ǰ����Ȯ��
		ls_nm =
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">Ȯ����'+
                    '&nbsp;<input name="extnflnm" type="text" size="8" class="text_box">'+
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">������'+
                    '&nbsp;<input name="rdrnm" type="text" size="8" class="text_box">'+
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
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">������'+
                    '&nbsp;<input name="rdrnm" type="text" size="8" class="text_box">'+
					'';
		lo_table2.rows[0].cells[1].innerHTML = ls_nm;

	}else if(lv_rdr_extntypecd == '40'){		// ������û
		ls_nm =
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��û��'+
                    '&nbsp;<input name="aplcpersnm" type="text" size="8" class="text_box">'+
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">������'+
                    '&nbsp;<input name="rdrnm" type="text" size="8" class="text_box">'+
					'';
		lo_table2.rows[0].cells[1].innerHTML = ls_nm;

	}else if(lv_rdr_extntypecd == '50' || lv_rdr_extntypecd == '70'){		// ���̹�, ���̹�����
		ls_nm =
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">Ȯ����'+
                    '&nbsp;<input name="extnflnm" type="text" size="8" class="text_box">'+
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">������'+
                    '&nbsp;<input name="rdrnm" type="text" size="8" class="text_box">'+
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
									+'<% writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true); %>'
									+'</select>';
		// ���� �ʱ�ȭ
		lo_form1.areacd.outerHTML =  '<select name="areacd" size="1" id="areacd_id" class="sel_all">'
									+'<% writeAreaOpt(session, out, true); %>'
									+'</select>';
		// �����ڵ�,������ �ʱ�ȭ, ��Ŀ���̵�
		lo_form1.corrbocd.value = "";
		lo_form1.corrbonm.value = "";
		lo_form1.corrbonm.focus();
	}else if(flag == '2'){		// �������� �μ�,����,���� �ʱ�ȭ
		// �μ� �ʱ�ȭ
		lo_form1.extn_deptcd.outerHTML =  '<select name="extn_deptcd" onChange="area_search(\'2\');" class="sel_all">'
										 +'<% writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true); %>'
									     +'</select>';
		// ���� �ʱ�ȭ
		lo_form1.extn_areacd.outerHTML =  '<select name="extn_areacd" size="1" id="extn_areacd_id" class="sel_all">'
										 +'<% writeAreaOpt(session, out, true); %>'
										 +'</select>';
		// �����ڵ�,������ �ʱ�ȭ, ��Ŀ���̵�
		lo_form1.rdr_extnbocd.value = "";
//		lo_form1.rdr_extnbonm.value = "";
//		lo_form1.rdr_extnbonm.focus();
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

//	if(lo_form1.corrbonm.value == '' && lo_form1.rdr_extnbonm.value == ''){
	if(lo_form1.corrbonm.value == ''){
		lo_form1.corrbocd.value = '';
		lo_form1.rdr_extnbocd.value = '';
		gs_request = 'L';
	}else if(lo_form1.corrbonm.value == ''){
		lo_form1.corrbocd.value = '';
		gs_request = 'LE';
/*	}else if(lo_form1.rdr_extnbonm.value == ''){
		lo_form1.rdr_extnbocd.value = '';
		gs_request = 'LC';*/
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
//	    lo_form1.bonm.value = lo_form2.rdr_extnbonm.value;

		gs_no = '2';

		// �μ��ڵ�,�����ڵ�,��������  "/ss/common/1113" �������� ������
	    lo_form1.action = "/ss/common/1113";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	}
}

//enter key ó��
function check_enter(){
    var e = window.event;
    if(!e || e.keyCode != "13") return;
    window.event.returnValue=false;

    set_request();bo_list_search();window.event.returnValue=false;
}

function fn_fromtogb_chg( obj ) {
  var lo_form1 = document.extn_search_form;

  if( obj.value == '1' ) {
    lo_form1.incmgdt.disabled = 'inline';
  } else {
    lo_form1.incmgdt.disabled = false;
  }
}
-->
</script>
</head>


<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" margin class="scroll1"  onload="jsInit()" onkeydown="check_enter();">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >Ȯ����Ȳ
        &gt; </b> ����Ȯ�� ��û��Ȳ </td>
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
        <tr bgcolor="#EBE9DC">	<!-- rows[0] -->
            <td class="sea_top" height="27">
                <table width="100%" border="0" cellspacing="0" cellpadding="1">
                    <tr>
                        <td width="200">
                            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�μ�
                            <select name="deptcd" onChange="area_search('1');" class="sel_all"><!-- �μ��ڵ�, �ڵ�� ��� -->
<%--
                                <option value='' selected>��ü</option>
                                <%= ds.curdeptcdOptHtml("") %>
--%>
<%
writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true);
%>
                            </select>
                      	</td>
                      	<td width="200">
                            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
                            <select name="areacd" size="1" id="areacd_id" class="sel_all">  <!--�����ڵ�, ������ ���-->
<%--
                                <option value='' selected>��ü</option>
--%>
<%
writeAreaOpt(session, out, true);
%>
                            </select>
						</td>
						<td>
                            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����&nbsp;&nbsp;&nbsp;
                            <input name="corrbonm" type="text" style="ime-mode:active;" size="10" class="text_box" onkeydown="bo_enter_search('1');window.event.cancelBubble=true;">
                            <input type="image" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search('1');window.event.returnValue=false;"> <!--�����˻��˾�-->
                            <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--�μ�,����,���� �ʱ�ȭ-->
                        </td>
					</tr>
<%--
					<tr>
                        <!-- �������� ����(ǰ����Ȯ���� ��� �����ش�) -->
                        <td width="200">
                            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�μ�
                            <select name="extn_deptcd" onChange="area_search('2');" class="sel_all"><!-- �μ��ڵ�, �ڵ�� ��� -->
%--
                                <option value='' selected>��ü</option>
                                <%= ds.curdeptcdOptHtml("") %>
--%
%
//writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true);
%
                            </select>
                     	</td>
                      	<td width="200">
                            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
                            <select name="extn_areacd" size="1" id="extn_areacd_id" class="sel_all">  <!--�����ڵ�, ������ ���-->
%--
                                <option value='' selected>��ü</option>
--%
%
//writeAreaOpt(session, out, true);
%
                            </select>
                      	</td>
                      	<td>
                            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
                            <input name="rdr_extnbonm" type="text" style="ime-mode:active;" size="10" class="text_box" onkeydown="bo_enter_search('2');window.event.cancelBubble=true;">
                            <input type="image" src="/html/comm_img/bu_search04.gif" width="86" height="19" align="absmiddle" onclick="javascript:bo_search('2');window.event.returnValue=false;">
                            <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('2');window.event.returnValue=false;"> <!--�μ�,����,���� �ʱ�ȭ-->
                        </td>
                        <!-- �������� �� -->
                    </tr>
                    --%>
                </table>
            </td>
            <td rowspan="2" width="43" class="sea_top" align="right">
				<input type="image" src="/html/comm_img/bu_search01.gif" width="39" height="35" border="0" align="absmiddle" onclick="set_request();bo_list_search();window.event.returnValue=false;"><!--Ȯ���� ��ȸ-->
			</td>
        </tr>

        <tr bgcolor="#EBE9DC">	<!-- rows[1] -->
            <td>
                <table width="100%" border="0" cellspacing="0" cellpadding="1" id="extn_search_info_bo_id">
            		<tr>
            			<td width="394">
			                <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�Ⱓ
			                <select name="fromtogb" class="sel_all" onchange="fn_fromtogb_chg(this);">
			                    <option value=''>����</option>
			                    <option value="1" selected>��û</option>
                                <option value="2">Ȯ��</option>
			                    <option value="3">Ȯ��</option>
			                </select>
			                <input name="fromdt" type="text" size="10" value="<%= Util.getDate2()%>" class="text_box" caption="��������" dataType="date">
			                -
			                <input name="todt" type="text" size="10" value="<%= Util.getDate2()%>" class="text_box" caption="��������" dataType="date">
                            &nbsp;�Է����� <input name="incmgdt" type="text" size="10" value="<%= Util.getDate2()%>" class="text_box" caption="�Է�����" dataType="date" disabled>
						</td>
						<td align="left">
			                &nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">Ȯ����
			                <input name="extnflnm" type="text" size="8" class="text_box" style="ime-mode:active;">
			                &nbsp;<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">������
			                <input name="rdrnm" type="text" size="8" class="text_box" style="ime-mode:active;">
						</td>
						<td align="left">&nbsp;
<%--
							<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���
							<select name="aplcpathcd" size="1" class="sel_all">
			                    <option value="" selected>��ü</option>
			                    <%= ds.curaplcpathcdOptHtml("") %>                              <!-- ��û����ڵ�, �ڵ�� ��� -->
							</select>
--%>
						</td>
					</tr>
				</table>
<!--��û��,������ ����
                <table width="100%" border="0" cellspacing="0" cellpadding="1" id="extn_search_info_bo_id">
            		<tr>
            			<td width="270">
			                <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�Ⱓ
			                <select name="fromtogb" class="sel_all">
			                    <option value='' selected>����</option>
			                    <option value="1">��û</option>
			                    <option value="3">Ȯ��</option>
			                </select>
			                <input name="fromdt" type="text" size="10" value="<%= Util.getDate2()%>" class="text_box" caption="��������" dataType="date">
			                -
			                <input name="todt" type="text" size="10" value="<%= Util.getDate2()%>" class="text_box" caption="��������" dataType="date">
						</td>
						<td align="left">
			                &nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">Ȯ����
			                <input name="extnflnm" type="text" size="8" class="text_box" style="ime-mode:active;">
			                &nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��û��
			                <input name="aplcpersnm" type="text" size="8" class="text_box" style="ime-mode:active;">
			                &nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">������
			                <input name="rdrnm" type="text" size="8" class="text_box" style="ime-mode:active;">
			                &nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">������
			                <input name="pymtflnm" type="text" size="8" class="text_box" style="ime-mode:active;">
						</td>
					</tr>
				</table>
-->

            </td>
        </tr>
        <tr bgcolor="#EBE9DC">
            <td height="27" colspan="2">
                <table width="100%" border="0" cellspacing="0" cellpadding="1">
                    <tr>
<%--
                    	<td width="402">
			            	<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
			                <select name="rdr_extntypecd" onChange="changeSearchHTML();extnblng_search();" class="sel_all">
			                    <option value='' selected>��ü</option>
			                    %= ds.curextntypecdOptHtml("") %<!-- Ȯ�������ڵ�, �ڵ�� ��� -->
			                </select>
			                &nbsp;&nbsp;<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">Ȯ���ڼҼ�
			                <select name="extnblngcd" id="extnblngcd_id" class="sel_all" onChange="changeSearchHTML();">
			                  <option value='' selected>��ü</option>
			                </select>
			         	</td>
			         	<td>
                			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��ü
	                		<select name="medicd" class="sel_all"><!-- ��ü�ڵ�, �ڵ�� ��� -->
%
							writeMediOpt(session, out, ds.curmedicdOptHtml(""), true);
%
                			</select>
--%>
                       <td>
			                <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�����ڵ�
			                <select name="subscnfmstatcd" class="sel_all">
			                    <option value='' selected>��ü</option>
			                    <%= ds.curcampcdOptHtml("")%><!-- ���޸����� �ڵ�, �ڵ�� ��� -->
			                </select>
			                &nbsp;&nbsp;<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���޻�
			                <select name="subscnfmstatcd" class="sel_all">
			                    <option value='' selected>��ü</option>
			                    <%= ds.curcampcompcdOptHtml("")%><!-- ���޻��ڵ�, �ڵ�� ��� -->
			                </select>
                       </td>
                       <td>
			                <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">Ȯ��
			                <select name="bo_headcnfmyn" class="sel_all"><!--Ȯ�α���-->
			                  <option value='' selected>��ü</option>
			                  <option value='Y'>Ȯ��</option>
			                  <option value='N'>��Ȯ��</option>
<%--20050430 ��뼷 ����(Ȯ�κ��� �߰�)--%>
			                  <option value='B'>Ȯ�κ���</option>
			                </select>
			                &nbsp;&nbsp;<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
			                <select name="subscnfmstatcd" class="sel_all">
			                    <option value='' selected>��ü</option>
			                    <%= ds.cursubscnfmstatcdOptHtml("")%><!-- �����ڵ�, �ڵ�� ��� -->
			                </select>
                       </td>
			      	</tr>
			   	</table>
            </td>
        </tr>
        <tr bgcolor="#927F5B">
          <td colspan="11" style height="1">
            <!--line -->
          </td>
        </tr>
        <tr>
          <td colspan="11" style height="3">
            <!--���� -->
          </td>
        </tr>
    </form>
    </table>
    <!--Ȯ�� �˻� �� -------------------------------------------------------------------------->

    <!--Ȯ�� ��� ���� -------------------------------------------------------------------------->
    <table width="830"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#ffffff" id="extn_list_id">
    <form name="extn_list_form" method="post" action="" >
	    <input name="rdr_extntypecd" type="hidden" value ="">
	    <input name="aplcpathcd" type="hidden" value ="">
	    <input name="rdr_extndt" type="hidden" value ="">
	    <input name="rdr_extnno" type="hidden" value ="">
	    <input name="rdr_no" type="hidden" value ="">
	    <input name="medicd" type="hidden" value ="">
	    <input name="cntrno" type="hidden" value ="">
	    <input name="mangno" type="hidden" value ="">
        <input name="boheadcnfmyn" type="hidden" value="">
        <tr bgcolor="#DDDDDD" height="23">
            <td class="gray" align="center" width="80">���ڹ�ȣ</td>
            <td class="gray" align="center" width="*">������</td>
            <td class="gray" align="center" width="90">������</td>
            <td class="gray" align="center" width="40">�μ�</td>
            <td class="gray" align="center" width="60">�ڵ���ü</td>
            <td class="gray" align="center" width="60">����</td>
            <td class="gray" align="center" width="70">����</td>
            <td class="gray" align="center" width="65">��û����</td>
            <td class="gray" align="center" width="75">Ȯ������</td>
            <td class="gray" align="center" width="65">Ȯ������</td>
            <td class="gray" align="center" width="40">Ȯ��</td>
            <td class="gray" align="center" width="40">����</td>
        </tr>
        <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
        <%for(int i=0; i<extnListCount; i++){%>
        <tr>
            <td class="gray" align="center" width="80">&nbsp;</td>
            <td class="gray" align="center" width="*">&nbsp;</td>
            <td class="gray" align="center" width="90">&nbsp;</td>
            <td class="gray" align="center" width="40">&nbsp;</td>
            <td class="gray" align="center" width="60">&nbsp;</td>
            <td class="gray" align="center" width="60">&nbsp;</td>
            <td class="gray" align="center" width="70">&nbsp;</td>
            <td class="gray" align="center" width="65">&nbsp;</td>
            <td class="gray" align="center" width="75">&nbsp;</td>
            <td class="gray" align="center" width="65">&nbsp;</td>
            <td class="gray" align="center" width="40">&nbsp;</td>
            <td class="gray" align="center" width="40">&nbsp;</td>
        </tr>
        <%}%>
        <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>

        <tr bgcolor="#DDDDDD" align="right">
            <td height="23" class="gray" colspan="12">
                <img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �������� ��</b>&nbsp;&nbsp;&nbsp;
                <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">  <b> �Ѻμ� ��</b>&nbsp;&nbsp;&nbsp;&nbsp;
                <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">  <b> �ѰǼ� ��</b>
            </td>
        </tr>
    </form>
    </table>
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
                    <jsp:param name = "pagesize" 	value="<%= extnListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- ������ �̵� -->
    <!--Ȯ�� ��� �� -------------------------------------------------------------------------->

</tr>
<tr>
    <td height="10">
        <!--����-->
    </td>
</tr>
<tr>
    <td valign="top">
	<table width="829" border="0"  cellpadding="1" cellspacing="0" align="center">
		<tr>
			<td  height="25" bgcolor="#EBE9DC" class="title">Ȯ���û �󼼳���</td>
		</tr>
		<tr>
			<td height="3">
			<!--����-->
			</td>
		</tr>
	</table>

    <!--Ȯ�� �� ���� -------------------------------------------------------------------------->
	<table width="830" border="0" cellspacing="1" cellpadding="2" class="gray" bgcolor="#FFFFFF" id="extn_detail_id">

	    <!--�Ϲ����� ����-->
	    <tr>
	        <td rowspan="2" class="gray" bgcolor="#EBE9DC"> Ȯ���Ϲ�</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> Ȯ������</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> ��û���</td>
	        <td width="150" class="gray">&nbsp;</td>
            <td width="80" class="gray" bgcolor="#dddddd"> ��û������</td>
            <td width="150" class="gray">&nbsp;</td>
	    </tr>
	    <tr>
	        <td width="80" class="gray" bgcolor="#dddddd"> ��ü</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> �μ�</td>
	        <td colspan="3" class="gray" align="right">&nbsp;</td>
	    </tr>
	    <!--�Ϲ����� ��-->

	    <!--Ȯ���� ����-->
        <%--
        <tr>
            <td class="gray" bgcolor="#EBE9DC"> Ȯ����</td>
            <td width="80" class="gray" bgcolor="#dddddd"> ����</td>
            <td width="150" class="gray">&nbsp;</td>
            <td width="80" class="gray" bgcolor="#dddddd"> ��ȭ��ȣ</td>
            <td width="150" class="gray">&nbsp;</td>
            <td width="80" class="gray" bgcolor="#dddddd"> �޴�����ȣ</td>
            <td width="150" class="gray">&nbsp;</td>
        </tr>
        --%>
	    <!--Ȯ���� ��-->

	    <!--��û�� ����-->
	    <tr>
	        <td rowspan="2" class="gray" bgcolor="#EBE9DC"> ��û��</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> ����</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> ��ȭ��ȣ</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> �޴�����ȣ</td>
	        <td width="150" class="gray">&nbsp;</td>
	    </tr>
        <tr>
            <td width="80" class="gray" bgcolor="#dddddd"> �̸���</td>
            <td width="150" class="gray">&nbsp;</td>
            <td width="80" class="gray" bgcolor="#dddddd"> ���ڿ��� ����</td>
            <td colspan="3" class="gray">&nbsp;</td>
        </tr>
	    <!--��û�� ��-->

	    <!--������ ����-->
	    <tr>
	        <td class="gray" bgcolor="#EBE9DC"> ������</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> ����</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> ��ȭ��ȣ</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> �޴�����ȣ</td>
	        <td width="150" class="gray">&nbsp;</td>
	    </tr>
	    <!--������ ��-->

	    <!--������ ����-->
        <%--
        <tr>
            <td class="gray" bgcolor="#EBE9DC"> ������</td>
            <td width="80" class="gray" bgcolor="#dddddd"> ����</td>
            <td width="150" class="gray">&nbsp;</td>
            <td width="80" class="gray" bgcolor="#dddddd"> ��ȭ��ȣ</td>
            <td width="150" class="gray">&nbsp;</td>
            <td width="80" class="gray" bgcolor="#dddddd"> �޴�����ȣ</td>
            <td width="150" class="gray">&nbsp;</td>
        </tr>
        --%>
	    <!--������ ��-->

	    <!--������� ����-->
	    <tr>
	        <td rowspan="5" class="gray" bgcolor="#EBE9DC"> �������</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> ����ּ�</td>
	        <td colspan="5" class="gray">&nbsp;</td>
	    </tr>
	    <tr>
	        <td width="80" class="gray" bgcolor="#dddddd"> ������</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> ������ȭ��ȣ</td>
	        <td colspan="3" class="gray">&nbsp;</td>
	    </tr>
	    <tr>
	        <td width="80" class="gray" bgcolor="#dddddd"> ��������</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd">�ְ�����</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd">�ְű���</td>
	        <td width="150" class="gray">&nbsp;</td>
	    </tr>
        <tr>
          <td width="80" class="gray" bgcolor="#dddddd">������</td>
          <td width="150" class="gray">&nbsp;</td>
          <td width="80" class="gray" bgcolor="#dddddd">�����Ⱓ</td>
          <td width="150" class="gray">&nbsp;</td>
          <td width="80" class="gray" bgcolor="#dddddd">��ü����</td>
          <td width="150" class="gray">&nbsp;</td>
        </tr>
        <tr>
          <td width="80" class="gray" bgcolor="#dddddd">����ǰ</td>
          <td width="*" colspan="5" class="gray">&nbsp;</td>
        </tr>
	    <!--������� ��-->

	    <!--���ں�� ����-->
	    <tr>
	        <td class="gray" bgcolor="#EBE9DC"> ���ں��</td>
	        <td colspan="6" class="gray">
	            <textarea name="aplcpersremk" style="ime-mode:active;" rows="3" cols="99" class="scroll1">&nbsp;</textarea>
	        </td>
	    </tr>
	    <!--���ں�� ��-->

	    <!--���� ����-->
	    <tr>
	        <td rowspan="2" class="gray" bgcolor="#EBE9DC"> ����</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> Ȯ�ο���</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> �Ͻ�</td>
	        <td colspan="3" class="gray">&nbsp;</td>
	    </tr>
	    <tr>
	        <td width="80" class="gray" bgcolor="#dddddd"> ���</td>
	        <td colspan="5" class="gray">
	            <textarea name="remk" style="ime-mode:active;" rows="3" cols="86" class="scroll1">&nbsp;</textarea>
	        </td>
	    </tr>
	    <!--���� ��-->

	    <!--���� ����-->
	    <tr>
	        <td rowspan="2" class="gray" bgcolor="#EBE9DC">����</td>
	        <td width="80" class="gray" bgcolor="#dddddd">�̸�</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd">Ȯ�ο���</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd">�Ͻ�</td>
	        <td width="150" class="gray">&nbsp;</td>
	    </tr>
	    <tr>
	        <td width="80" class="gray" bgcolor="#dddddd"> ���</td>
	        <td colspan="5" class="gray">
	            <textarea name="procmsg" style="ime-mode:active;" rows="3" cols="86" class="scroll1">&nbsp;</textarea>
	        </td>
	    </tr>
	    <!--���� ��-->
	</table>
    <!--Ȯ�� �� �� -------------------------------------------------------------------------->

    </td>
</tr>
</table>

<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
<!--����Ű�� ���� �����˻������� ��-->
<form name="bo_enter_search_form" method="post" action="" style="display:none";>
    <input name="deptcd" type="hidden" value ="">	<!--�μ��ڵ�-->
    <input name="areacd" type="hidden" value ="">	<!--�����ڵ�-->
    <input name="bonm" type="hidden" value ="">		<!--������-->
</form>
</body>
</html>
