<%@ page contentType="text/html; charset=ksc5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_bil_1701_a.jsp
* ��� : ����-�ڵ���ü ��û���-�˻��ʱ�ȭ��
* �ۼ����� : 2006-04-14
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

	String sysDate = Util.getDate().substring(0,6);	// ������

    String concatDelimiter = "##";	// �Ա�ó�� �� �� �׸��� concatenate�� �� ���Ǵ� delimiter
%>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
<script language="javascript" src="/html/comm_js/common.js"></script>
<script language="javascript" src="/html/comm_js/progress.js"></script>
<script language="javascript">
<!--

    // ������ �ٲ��ֱ�
    function change_bgColor(obj, color_name) {
        obj.bgColor = color_name;
        if(obj.name=="first_tr") {
            obj.nextSibling.bgColor = color_name;
        } else if(obj.name=="second_tr") {
            obj.previousSibling.bgColor = color_name;
        }
    }

    // ����Ű ��Ƴ���
    function f_aplc_search() {
        if(event.keyCode == 13) list_search();
    }

	// �ڵ���ü���Խ�û ���,������ clear(���)
	function shftaplc_cancel()
	{
		var lo_form = document.aplc_list_form;	// ������ ��
		for( var i =0; i< lo_form.length; i++){
			lo_form(i).value = "";
		}
	}

    // ��û��� �˻�
    function list_search(curr_page_no) {
        aplc_list_form.searchflag.value = "N";
        if(curr_page_no!=null) {
            aplc_search_form.curr_page_no.value = curr_page_no;
        }

        aplc_search_form.method = "post";
        aplc_search_form.action = "1706";
        aplc_search_form.target = "ifrm";

        check_all(aplc_search_form);
    }

    // ��ûȮ��
    function aplc_cnfm() {
        aplc_list_form2.aplcyn.value = 'A';
        aplc_save();
    }

    // ��û���
    function aplc_canc() {
        aplc_list_form2.aplcyn.value = 'C';
        aplc_save();
    }

    // ����, ���������������� ����
    function isBankAplc(val) {
        if(val=="01"||val=="03"||val=="04"||val=="05"||val=="07") {
            return true;
        }
    }

    // ��ûȮ��/���
    function aplc_save() {
        var lo_form1;

        lo_form1 = document.aplc_list_form;
        lo_form2 = document.aplc_list_form2;

        if(lo_form1.idx==null) { // ��� �Ѱǵ� ���� ��
            return;
        } else if(!lo_form1.idx.length) { // ��� �ѰǸ� ���� ��
            if(!lo_form1.idx.checked) return; // üũ�� ���� ���� ��
            if(lo_form1.closyn.value=="Y") { // ���ۿ��� üũ
                alert("�����Ȱǿ� ���ؼ��� ó�����¸� �����Ͻ� �� �����ϴ�.");
                return;
            }
            /*
            // �����ϵ��� ���. 20040724 ���
            if(isBankAplc(lo_form1.shftaplcclsf.value)) { // ��ü��û����(����,��������)�� ���ؼ� üũ
                alert("����, ���������ǿ� ���ؼ��� ó�����¸� �����Ͻ� �� �����ϴ�.");
                return;
            }
            */
            if(lo_form2.aplcyn.value=="A" && lo_form1.aplcprocstat.value=="30") { // '���ο���'�ǿ� ���� ��ûȮ���� ��
                alert("���ο����ǿ� ���ؼ��� ��ûȮ���Ͻ� �� �����ϴ�.");
                return;
            }
            if(lo_form1.idx.checked) {
                lo_form2.aplcno.value = lo_form1.aplcno.value;
	            lo_form2.shftclsf.value = lo_form1.shftclsf.value;
	            lo_form2.aplcdt.value = lo_form1.aplcdt.value;

	            lo_form2.method = "post";
	            lo_form2.action = "1711";
	            lo_form2.target = "ifrm";

	            lo_form2.submit();
            }
        } else { // ��� �������϶�
            var j = 0;
            for(var i=0; i<lo_form1.idx.length; i++) {
                if(lo_form1.idx[i].checked) {
                    if(lo_form1.closyn[i].value=="Y") {
                        alert("�����Ȱǿ� ���ؼ��� ó�����¸� �����Ͻ� �� �����ϴ�.");
                        return;
                    }
                    /*
            		// �����ϵ��� ���. 20040724 ���
                    if(isBankAplc(lo_form1.shftaplcclsf[i].value)) {
                        alert("����, ���������ǿ� ���ؼ��� ó�����¸� �����Ͻ� �� �����ϴ�.");
                        return;
                    }
                    */
                    if(lo_form2.aplcyn.value=="A" && lo_form1.aplcprocstat[i].value=="30") { // '���ο���'�ǿ� ���� ��ûȮ���� ��
                        alert("���ο����ǿ� ���ؼ��� ��ûȮ���Ͻ� �� �����ϴ�.");
                        return;
                    }
                    j++; // üũ�� �Ǽ��� �ջ�
                }
            }
            if(j==0) { // üũ�� ���� ���� ��
                //alert('debug...�Ѱǵ� ����');
                return;
            }

            var ls_concat_str = "<%=concatDelimiter%>";

            lo_form2.aplcno.value = concatenate_with_delimiter(lo_form1.aplcno, ls_concat_str, lo_form1.idx);
            lo_form2.shftclsf.value = concatenate_with_delimiter(lo_form1.shftclsf, ls_concat_str, lo_form1.idx);
            lo_form2.aplcdt.value = concatenate_with_delimiter(lo_form1.aplcdt, ls_concat_str, lo_form1.idx);

            lo_form2.method = "post";
            lo_form2.action = "1711";
            lo_form2.target = "ifrm";

            lo_form2.submit();
        }

        jsShowProgress();
    }

    // �ش� �ε����� key_obj�� üũ�Ǿ��ִ����� ���� concat_str�� ����� ���ڿ��� �����Ѵ�.
    // array_obj�� collection type�̴�.
    function concatenate_with_delimiter(array_obj, concat_str, key_obj) {
        var ls_ret_str = "";
        var ls_obj_val;

        if(!array_obj.length) {
	    	if(key_obj.checked) {
	    		return array_obj.value;
	    	} else {
	    		return "";
    	}
	    }

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

    // �󼼺���
    function detail(aplcno, shftclsf, aplcdt, pymttel, trsmyn, pymtinforflyn) {
        lo_form1 = document.aplc_list_form2;

        lo_form1.aplcno.value = aplcno;
        lo_form1.shftclsf.value = shftclsf;
        lo_form1.aplcdt.value = aplcdt;
        lo_form1.pymttel.value = pymttel;
        lo_form1.trsmyn.value = trsmyn;
        lo_form1.pymtinforflyn.value = pymtinforflyn;

        lo_form1.method = "post";
        lo_form1.target = "ifrm";
        lo_form1.action = "1716";
        lo_form1.submit();
    }

    // ���� �˻�
    function reader_detail_search() {
        var lo_form1 = document.aplc_list_form;
        lo_form1.searchflag.value = "Y";
        var rdrnm =  lo_form1.rdrnm.value ;
        var rdrtel_no1 = lo_form1.rdrtel_no1.value ;
        var rdrtel_no2 = lo_form1.rdrtel_no2.value ;
        var rdrtel_no3 = lo_form1.rdrtel_no3.value ;

        var rdrptph1 = lo_form1.rdrptph_no1.value;
        var rdrptph2 = lo_form1.rdrptph_no2.value;
        var rdrptph3 = lo_form1.rdrptph_no3.value;

        var lo_chk = "";
        lo_chk = ""
        if (rdrnm == "") {
            alert("���ڸ��� �Է��ϼ���!");
            lo_form1.rdrnm.focus();
            return;
        }

        lo_form1.action = "/ps/bill/1521";
        lo_form1.target = "ifrm";
        lo_form1.submit();
    }

    // �Ǳ����ݾ�, �μ� ȭ�鼼��
    function set_medi(obj) {
        if(obj.value=="") {
            document.all.realsubsamt_id.innerText = "  ";
            document.all.dlvqty_id.innerText = "       ";
        } else {
            document.all.realsubsamt_id.innerText = addCommaStr(obj.options(obj.selectedIndex).realsubsamt);
            document.all.dlvqty_id.innerText = obj.options(obj.selectedIndex).dlvqty;
        }
    }

    // ������ ����
    function aplc_detail_save() {
        lo_form1 = document.aplc_list_form;

        /* 2005-01-31 �̺�Ʈ ����
        // �츮�̿��̺�Ʈ �߰�
        if(lo_form1.remk.checked == true){
           lo_form1.remk.value = "E1";
        }else{
           lo_form1.remk.value = "";
        }
        */
        //alert(lo_form1.searchflag.value);
        if(lo_form1.searchflag.value == "N") {
          makeValue(lo_form1);

          lo_form1.method = "post";
          lo_form1.action = "1726";
          lo_form1.target = "ifrm";

          check_all(lo_form1);
        }else {
            var lo_form = document.aplc_list_form;

            if(lo_form.total_records.value=="0") {
                alert("������ ����� �����ϴ�");
                return false;
            }
            var bocd="";
            var dlvzip="";
            var dlvaddr="";
            var dlvaddrdtls="";
            var rdrprn="";

            var rdr_no="";
            var medicd="";
            var termsubsno="";
            var pymtno_2="";

            //if(!check_all(form2)) return false;

            for(var i = 0; i < lo_form.chk.length; i++){
                if(lo_form.chk[i].checked){
                    if(!validateObj(lo_form, lo_form.pymtno_2[i])) return false;

                    makeValueObj(lo_form, lo_form.pymtno_2[i]);

                    var temp=lo_form.chk[i].value;
                    var ss = temp.split("##");
                    if(ss.length!=8) {
                        alert("���ý� ������ �߻��߽��ϴ�.");
                        return false;
                    } else {
                        bocd += "##"+ss[0];
                        dlvzip += "##"+ss[1];
                        dlvaddr += "##" +ss[2];
                        dlvaddrdtls += "##"+ss[3];
                        rdrprn += "##"+ss[4];
                        rdr_no += "##"+ss[5];
                        medicd += "##"+ss[6];
                        termsubsno += "##"+ss[7];
                        pymtno_2 += "##" + lo_form.pymtno_2[i].value;
                    }
                }
            }
            if(rdr_no != ""){
                bocd = bocd.substr(2);
                dlvzip = dlvzip.substr(2);
                dlvaddr = dlvaddr.substr(2);
                dlvaddrdtls = dlvaddrdtls.substr(2);
                rdrprn = rdrprn.substr(2);

                rdr_no = rdr_no.substr(2);
                medicd = medicd.substr(2);
                termsubsno = termsubsno.substr(2);
                pymtno_2 = pymtno_2.substr(2);
            } else {
                alert("��û�� ����� üũ�Ͻʽÿ�");
                return false;
            }

            lo_form.bocd.value=bocd;
            lo_form.dlvzip.value=dlvzip;
            lo_form.dlvaddr.value=dlvaddr;
            lo_form.dlvaddrdtls.value=dlvaddrdtls;
            lo_form.rdrprn.value=rdrprn;
            lo_form.rdr_no.value=rdr_no;
            lo_form.medicd.value=medicd;
            lo_form.termsubsno.value=termsubsno;
            lo_form.pymtno_2.value=pymtno_2;

            //if(!validate(lo_form)) return false;

            var check = "";
            check = confirm("�ڵ���ü�� ����Ͻðڽ��ϱ�?");

            if (!check) {
                return false;
            }

            lo_form.accflag.value = 'N';		// �۾�����(�ű�)
            lo_form.shftclsf.value = '110';		// ��ü����(����)

            makeValue(lo_form);

            lo_form.action = "/ps/bill/1516";
            lo_form.target = "ifrm";
            lo_form.method = "post";
            lo_form.submit();
        }
    }

    // �� ������� �ʱ�ȭ
    function jsInit(){
        setEventHandler();
    	setEnterKeyEventHandler();
    	setInputBackgroundColor();
        aplc_search_form.sechcont.focus();
    } // jsInit

    // �� ��ȿ�� �˻� �� ����
    function check_all(form){
        if(!validate(form)) return false;
        else{
            makeValue(form);
            form.submit();
        }
    }

/*
	// üũ�ڽ��� Ŭ���ؼ� ��� üũ�ڽ��� ���� �Ǵ� ���������Ѵ�.
	function select_all(bool) {
		var lo_form1;
		lo_form1 = document.aplc_list_form;

		if(lo_form1.chk==null) {					// ���õ� ���� ���� ���
			return;
		} else if(lo_form1.chk.type=="checkbox") {	// �Ѱ��� ���
			if(lo_form1.chk.disabled==false) {
			lo_form1.chk.checked = bool;
			}
		} else {									// �������� ���
			for(var i=0; i<lo_form1.chk.length; i++) {
				if(lo_form1.chk[i].disabled==false) {
					lo_form1.chk[i].checked = bool;
				}
			}
		}
	} // select_all

    // üũ�ڽ��� Ŭ���ؼ� ��� üũ�ڽ��� ���� �Ǵ� ���������Ѵ�.
    function select_all(bool) {
        var lo_form1;
        lo_form1 = document.aplc_list_form;

        if(lo_form1.idx==null) {					// ���õ� ���� ���� ���
            return;
        } else if(!lo_form1.idx.length) {	// �Ѱ��� ���
            lo_form1.idx.checked = bool;
        } else {									// �������� ���
            for(var i=0; i<lo_form1.idx.length; i++) {
                lo_form1.idx[i].checked = bool;
            }
        }
    } // select_all

*/
    //�ش� üũ�ڽ� ��ü üũ �Ǵ� ����
    function select_all(hchk,dchk) {
        var size = hchk.checked;
        var len  = "";

        if (!dchk){
            return;
        }else{
            len = dchk.length ;
        }

        if(dchk == null) {                        // ���õ� ���� ���� ���
            return;
        } else if (dchk.type == "checkbox") {     // �Ѱ��� ���
            dchk.checked = size;
        } else {
            for(var i=0; i<len; i++) {            // �������� ���
                dchk[i].checked = size;
            }
        }
    }

	// üũ�ڽ� ���ý� chkhead �� üũ ����
	function checkOne()
	{
		var len  = document.aplc_list_form.chk.length;
		var check = true;
		for (var i=0; i<len; i++){
			if((!aplc_list_form.chk[i].checked) && (!aplc_list_form.chk[i].disabled)) {
				check = false;
			}
		}
		//alert("check===== "+check);
		document.aplc_list_form.chkhead.checked = check;
		window.event.cancelBubble=true;
	}
-->
</script>
</head>
<body onload="jsInit()" bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle"></b>�ڵ���ü��û����</td>
    </tr>
    <tr>
        <td height="10"> <!--������ ���� ����--> </td>
    </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
    <tr>
        <form name="aplc_search_form">
        <td> <!--�˻�-->
            <table width="830" border="0" cellspacing="0" cellpadding="2" class="title1" bgcolor="#EBE9DC">
                <input type="hidden" name="curr_page_no" value="1"><%--����������--%>
                <input type="hidden" name="records_per_page" value="5"><%--���������� ���ڵ��--%>
                <input type="hidden" name="js_fn_nm" value="list_search"><%--�������̵� �� ȣ��Ǵ� �ڹٽ�ũ��Ʈ �̸�--%>
                <tr>
                    <td bgcolor="#EBE9DC" width="60" > <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��ü����</td>
                    <td width="85"> <select name="shftclsf" class="sel_all" style="width:85;">
                            <option value="">��ü</option>
                            <%=ds.shftclsfOptHtml("")%>
                        </select> </td>
                    <td bgcolor="#EBE9DC" width="60" ><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��û����</td>
                    <td > <select name="aplcclsf" class="sel_all">
                            <option value="">��ü</option>
                            <%=ds.aplcclsfOptHtml("")%>
                        </select> </td>
                    <td ><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">ó������</td>
                    <td ><select name="aplcprocstat" class="sel_all">
                    		<option value="">��ü</option>
                            <%=ds.aplcprocstatOptHtml("10")%>
                    </select></td>
                    <td width="60" ><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�˻�����</td>

                    <td > <select name="sechcond" class="sel_all">
                            <option value="">��ü</option>
                            <option value="10">�����ڸ�</option>
                            <option value="20">�����ڸ�</option>
                            <option value="30">�����ּ�</option>
                            <option value="40">���ڹ�ȣ</option>
                        </select>
                        <input name="sechcont" type="text" size="13" class="text_box" onKeyDown="f_aplc_search()">
                    </td>
                    <td bgcolor="#EBE9DC" width="50" ><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">������</td>
                    <td bgcolor="#EBE9DC" width="50" >
                        <input name="aplcdt" type="text" value="<%=sysDate%>" size="6" maxLength="7" class="text_box" dataType=month caption="������">
                    </td>
                    <td rowspan="2">
                        <%---------------------------------------------------------------------------------------------------
                        * �������� :	��ȸ ���ǿ��� ������(���) ���÷��� ����
                        * ������ :	�����
                        * �������� :	2004-08-16
                        * ������ϸ� : �ּ�ó��
                        ---------------------------------------------------------------------------------------------------%>
	                    <%--<input name="aplcdt" type="text" value="<%=Util.convertMonthS(Util.getYyyyMm())%>" size="6" maxLength="7" class="text_box" dataType=month caption="������">--%>
                    	<input type="image" onclick="list_search(1);window.event.returnValue=false;" src="/html/comm_img/bu_search03.gif" align="absmiddle">
                    </td>
                </tr>
                <!-- -->
                <tr>
                    <td bgcolor="#EBE9DC" colspan="10">
                    <table border="0" cellspacing="0" cellpadding="0" bgcolor="#EBE9DC">
                    <tr>
                        <td width="64" bgcolor="#EBE9DC"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��������</td>
                        <td bgcolor="#EBE9DC" width="89">
                            <select name="sortcond" class="sel_all" style="width:85;">
                                <option value="">��ü</option>
                                <option value="10">��ü���ۿ�</option>
                                <option value="20">��������</option>
                                <option value="30">���ڹ�ȣ</option>
                                <option value="40">���ڸ�</option>
                                <option value="50">�����ڹ�ȣ</option>
                                <option value="60">�����ڸ�</option>
                            </select>
                        </td>
                        <td width="64" bgcolor="#EBE9DC"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���ı���</td>
                        <td width="*" bgcolor="#EBE9DC">
                            <select name="sortorder" class="sel_all">
                                <option value="">��ü</option>
                                <option value="10">��������</option>
                                <option value="20">��������</option>
                            </select>
                        </td>

                    </tr>
                    </table>
                </td>
                </tr>
                </form>
            </table>
            <!--�˻� ��--> </td>
    </tr>
    <tr>
        <td height="10"> <!------����--- --> </td>
    </tr>
    <form name="aplc_list_form" method="post" action="" >
    <input type="hidden" name="searchflag" value="N">
    <tr>
        <td>
            <table width="830" border="0"  cellpadding="1" cellspacing="0" id="aplc_header_id">
                <tr>
                    <td  height="27" bgcolor="#EBE9DC" class="title" width="627">�ڵ���ü ��û(����) ��û�� ��� </td>
                    <td  height="27" bgcolor="#EBE9DC" class="title" width="145" align="right">
                      <input type="image" onclick="aplc_cnfm();window.event.returnValue=false;" src="/html/comm_img/bu_sin01.gif" width="65" height="19" border="0" align="absmiddle">
                      <input type="image" onclick="aplc_canc();window.event.returnValue=false;" src="/html/comm_img/bu_sin02.gif" width="65" height="19" border="0" align="absmiddle">
                    </td>
                </tr>
                <tr>
                    <td height="3" colspan="2"> <!--����--> </td>
                </tr>
            </table>
            <table width="830" height="290" border="0" cellpadding="2" cellspacing="0" bgcolor="#ffffff" class="gray" id="aplc_body_id">
                <tr align="left" bgcolor="#CCCCCC" >
                    <td width="24" rowspan="2" class="gray"> <input type="checkbox" name="formcheckbox1"> </td>
                    <td width="102" rowspan="2" class="gray"> ���ڸ�<br>
                        (�����ڹ�ȣ) </td>
                    <td height="16" class="gray"> �����ڸ�(��ȭ��ȣ) </td>
                    <td width="80" class="gray" align="center"> ��ü���� </td>
                    <td width="56" class="gray" align="center"> ��û���� </td>
                    <td width="52" class="gray" align="center"> ó������ </td>
                    <td width="52" class="gray" align="center"> �������� </td>
                    <td width="86" class="gray" align="center"> ��ü </td>
                    <td width="61" class="gray" align="center"> �������� </td>
                    <td width="61" class="gray" align="center"> ��ü���ۿ� </td>
                    <td width="61" class="gray" align="center"> ���ʽ�û�� </td>

                </tr>
                <tr align="left" >
                    <td height="13" bgcolor="#CCCCCC" class="gray"> ���ڹ�ȣ </td>
                    <td height="13" colspan="8" bgcolor="#CCCCCC" class="gray" align="center"> �����ּ� </td>
                </tr>

                <% for (int i=0; i<5 ; i++) { %>
                  <tr align="left" >
                    <td rowspan="2" class="gray">&nbsp;</td>
                    <td rowspan="2" class="gray">&nbsp;<br>&nbsp;</td>
                      <td height="17" class="gray">&nbsp;</td>
                      <td class="gray">&nbsp;</td>
                      <td class="gray">&nbsp;</td>
                      <td class="gray">&nbsp;</td>
                      <td class="gray">&nbsp;</td>
                      <td class="gray">&nbsp;</td>
                      <td class="gray" align="center">&nbsp;</td>
                      <td class="gray" align="center">&nbsp;</td>
                      <td class="gray" align="center">&nbsp;</td>
                  </tr>
                  <tr align="left" >
                    <td height="17" class="gray">&nbsp;</td>
                    <td height="17" colspan="9" class="gray" align="center">&nbsp;</td>
                  </tr>
                <% } %>

                <tr align="right" bgcolor="#dddddd" >
                    <td colspan="10" class="gray" align="left" style="border-right-width:0"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">��Ȯ�� <b><font color="red">0��</font></b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">Ȯ�� <b>0��</b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">��� <b>0��</b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">���ο��� <b>0�� </b></td><td class="gray"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�� <b>0��</b></td>
                </tr>
            </table>
            <!---button-->
            <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="pbrdr_list">
                <tr>
                    <td align="center" height="2"> <!--����--> </td>
                </tr>
            </table>
            <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="aplc_footer_id">
                <tr>
                    <td align="center" height="2"> <!--����--> </td>
                </tr>
                <tr>
                   <td align="center" height="24" bgcolor="#E8E8E8"> <img src="/html/comm_img/bu_first01.gif" alt="ó�� ��������" border="0" ><img src="/html/comm_img/bu_prev01.gif" alt="���� ��������"><img src="/html/comm_img/bu_next01.gif" alt="���� ��������" border="0" ><img src="/html/comm_img/bu_end01.gif" border="0" alt="������ ��������"></td>
                </tr>
            </table>
        </td>
    </tr>
    </form>
</table>
<br>
<br>
<form name="aplc_list_form2">
    <input type="hidden" name="aplcyn" value=""><%--�۾����� : ��ûȮ��('A'), ��û���('C')--%>
    <input type="hidden" name="aplcno" value=""><%--��û��ȣ--%>
    <input type="hidden" name="shftclsf" value=""><%--��ü����--%>
    <input type="hidden" name="aplcdt" value=""><%--��û����--%>
    <input type="hidden" name="pymttel" value=""><%--��������ȭ��ȣ--%>
    <input type="hidden" name="trsmyn" value=""><%--���ۿ���--%>
    <input type="hidden" name="pymtinforflyn" value=""><%--���������ݿ�����--%>
</form>
<iframe name="ifrm" width="100%" height="0"></iframe>
</body>
</html>
