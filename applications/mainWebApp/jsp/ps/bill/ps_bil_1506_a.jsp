<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 :  ps_bil_1506_a.jsp
* ��� 	 	 : �ڵ���ü���Խ�û(ī��)
* �ۼ����� 	 : 2006-04-19
* �ۼ��� 	 : ����ǥ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    //	datacct �ν��Ͻ� ����κ�
    PS_L_SHFTAPLC_INITDataSet ds = (PS_L_SHFTAPLC_INITDataSet)request.getAttribute("ds");  // request datacct
%>

<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
	//�������ʱ�ȭ�� ��ư������ EventHandlerȣ��
	function jsInit(){

		setEventHandler();
		setEnterKeyEventHandler();

		var lo_form = document.shftaplc_detail_form;
		lo_form.rdrnm.focus();

	}

	// �ڵ���ü���Խ�û ���,������ clear(���)
	function shftaplc_cancel()
	{
		var lo_form = document.shftaplc_detail_form;	// ������ ��
		for( var i =0; i< lo_form.length; i++){
			lo_form(i).value = "";
		}
		lo_form.accflag.value = 'N';		// �۾�����(�ű�)
		lo_form.shftclsf.value = '130';		// ��ü����(ī��)
	}

    //�˻���ư�� ���� �����ȣ �˻�(�˾�)
    function zip_search() {
        var lo_form1  = document.shftaplc_detail_form;
        var ls_name   = "";

        //������ �����ȣ �Է½�
        lo_form1.dlvaddr.value         = "";
        lo_form1.dlvaddrdtls.value     = "";
        ls_name   = trim(lo_form1.dlvzip1.value)+trim(lo_form1.dlvzip2.value);

        var ls_uri    = "/ps/common/1101";
        var ls_return = jsNewModalWinNoS(ls_uri, ls_name, "430", "410");

        var la_str;
        var la_zip;

        if(ls_return.indexOf("\n") != -1) {
          la_str = ls_return.split("\n");
          la_zip = la_str[0].split("-");

          lo_form1.dlvzip1.value  = la_zip[0];
          lo_form1.dlvzip2.value  = la_zip[1];
          lo_form1.dlvaddr.value  = la_str[1];

          lo_form1.dlvaddrdtls.value  = "";
          lo_form1.dlvaddrdtls.focus();
        }

        return;
    }

	// �ڵ���ü���Խ�û ���
	function exec_append(){

		var lo_form = document.shftaplc_detail_form;

		lo_form.accflag.value = 'N';		// �۾�����(�ű�)
		lo_form.shftclsf.value = '130';		// ��ü����(ī��)

		lo_form.action = "/ps/bill/1516";
		lo_form.target = "ifrm";
		lo_form.method = "post";
		check_all(lo_form);
	}

	//����Ű�� ���� �����ȣ �˻�
    function zip_enter_search(zipseq){
        var e = window.event;
        if(!e || e.keyCode != "13") return;

        var lo_form1  = document.shftaplc_detail_form;
        var ls_zip    = "";

        lo_form1.dlvaddr.value         = "";
        lo_form1.dlvaddrdtls.value     = "";
        ls_zip = lo_form1.dlvzip1.value + lo_form1.dlvzip2.value;

		//�����ȣ ������ �ƴ϶�� zip_search �Լ��� call �Ѵ�.
        if(!validate_zip(ls_zip)){
            zip_search(zipseq);
            return;
        }

        var lo_form2 = document.zip_search_form;

        lo_form2.zip.value    = ls_zip;
        lo_form2.zipseq.value = zipseq;

        lo_form2.action = "/ps/common/1111";
        lo_form2.target = "ifrm";
        lo_form2.method = "post";
        lo_form2.submit();
    }

	// �����ȣ ��ȿ�� ����
    function validate_zip(s_zip){
		if(trim(s_zip) == "") return false;
        var format = /^(\d{3})(-{0,1})(\d{3})$/;
        return isValidFormat(s_zip, format);
    }

    //����Ű�� ���� �����ȣ �˻� �� �˻� ����� �Ѱ��϶�, ����� �ʵ忡 ����
    function set_zip_search_result() {
        var lo_form1        = document.shftaplc_detail_form;          // ���� ȭ�鳻 ���ڻ���
        var lo_form2        = hmifrm.document.zip_detail_form; // ifrm �� ��ȸ�� ��� form

        lo_form1.dlvzip1.value  = lo_form2.zip1.value;
        lo_form1.dlvzip2.value  = lo_form2.zip2.value;
        lo_form1.dlvaddr.value  = lo_form2.addr.value;

        lo_form1.dlvaddrdtls.value  = "";
        lo_form1.dlvaddrdtls.focus();
    }

	// submit�� ȣ��
	function check_all(form){
        if(!validate(form)) return false;
        else{
            makeValue(form);
            form.submit();
        }
    }

    // ���� �˻�
    function rdr_search() {
        var lo_form1 = document.shftaplc_detail_form;
        var rdrnm =  lo_form1.rdrnm.value ;
        var rdrtel = lo_form1.rdrtel1.value ;
        var rdrte2 = lo_form1.rdrtel2.value ;
        var rdrte3 = lo_form1.rdrtel3.value ;

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
	    makeValue(lo_form1);

//        var ls_win = "scrollbars=yes,toolbar=no,location=no,directories=no,width=700, height=300 resizable=no,mebar=no,left=200,top=100";
//        window.open("about:blank" , "acq_dtls", ls_win);
        lo_form1.action = "/ps/bill/1521";
        lo_form1.target = "ifrm";
        lo_form1.submit();
	}

	// üũ�ڽ��� Ŭ���ؼ� ��� üũ�ڽ��� ���� �Ǵ� ���������Ѵ�.
	function select_all(bool) {
		var lo_form1;
		lo_form1 = document.shftaplc_detail_form;

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


	// üũ�ڽ� ���ý� chkhead �� üũ ����
	function checkOne()
	{
		var len  = document.shftaplc_detail_form.chk.length;
		var check = true;
		for (var i=0; i<len; i++){
			if((!shftaplc_detail_form.chk[i].checked) && (!shftaplc_detail_form.chk[i].disabled)) {
				check = false;
			}
		}
		//alert("check===== "+check);
		document.shftaplc_detail_form.chkhead.checked = check;
		window.event.cancelBubble=true;
	}

	// �ڵ���ü���Խ�û ���
	function shftaplc_append()
	{
		var lo_form = document.shftaplc_detail_form;
        var lo_form2 = document.card_validation_form;

		if(lo_form.total_records.value=="0") {
			alert("������ ����� �����ϴ�");
			return false;
		}

	    if(lo_form.vdtyprd_y.value < "<%=Util.getYear()%>"){
	    	alert("��ȿ�Ⱓ�� �ùٸ��� �ʽ��ϴ�.");
	    	return;
	    }

	    if(lo_form.vdtyprd_m.value <= "<%=Util.getMonth()%>" && lo_form.vdtyprd_y.value == "<%=Util.getYear()%>"){
	    	alert("��ȿ�Ⱓ�� �ùٸ��� �ʽ��ϴ�.");
	    	return;
	    }

		lo_form.cardno.value = lo_form.cardno1.value + lo_form.cardno2.value + lo_form.cardno3.value + lo_form.cardno4.value;
		lo_form.vdtyprd.value = lo_form.vdtyprd_y.value + lo_form.vdtyprd_m.value;
        lo_form2.cardno.value = lo_form.cardno.value;
        lo_form2.cardcmpycd.value = lo_form.cardcmpycd.value;  //2007.01.22 ī������� ���� �߰�

        // �ֹι�ȣ�� �� 7�ڸ�, ����ڹ�ȣ�� ���� ��.
        if(lo_form.prn.value.length > 10) {	// �ֹι�ȣ
            lo_form2.jumin.value = lo_form.prn.value.substr(7);	// �� 7�ڸ�
        } else {	// ����ڹ�ȣ
            lo_form2.jumin.value = lo_form.prn.value;
        }

        lo_form2.expiry.value = lo_form.vdtyprd_y.value.substr(2) + lo_form.vdtyprd_m.value;
        lo_form2.accflag.value = "N";

		var bocd="";
		var dlvzip="";
		var dlvaddr="";
		var dlvaddrdtls="";
        var rdrprn="";

        var rdr_no="";
        var medicd="";
        var termsubsno="";
        var pymtno_2="";

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

	    if(!validate(lo_form)) return false;
	    if(!validate(lo_form2)) return false;

		var check = "";
		check = confirm("�ڵ���ü�� ����Ͻðڽ��ϱ�?");

		if (!check) {
			return false;
		}

		makeValue(lo_form2);

        lo_form2.method = "post";
        lo_form2.target = "ifrm";
        lo_form2.action = "/ps/bill/1511";

        lo_form2.submit();
	}
-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsInit()">

<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >����
      &gt; </b>ī���ڵ���ü &gt; ��û</td>
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

<!--������ ����-->
<table width="830" border="0"  cellpadding="1" cellspacing="0" align="center">
<tr>
	<td height="10">
	<!--����-->
	</td>
</tr>
	<td  height="25" bgcolor="#EBE9DC" class="title" width="500">������ ����( <font color="red">�� �ݵ�� ���ڰ˻��� ���� ����ϼ���.</font> )</td>
	<td align="right"  bgcolor="#EBE9DC" height="25" class="title">
		<input type="image" src="/html/comm_img/bu_default.gif" width="50" height="19" align="absmiddle" border="0" onclick="shftaplc_cancel()" border="0">
		<input type="image" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" onclick="shftaplc_append()" border="0">
	</td>
<tr>
	<td height="3">
	<!--����-->
	</td>
</tr>
</table>

<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF">
<form name="shftaplc_detail_form" method="post" action="" >
	<input type="hidden" name="accflag"     value="N">		<!--�۾�����(�ű�)-->
	<input type="hidden" name="shftclsf"    value="130">	<!--��ü����(ī��)-->
	<input type="hidden" name="bocd"        value="">			<!--���������ڵ�-->
    <input type="hidden" name="dlvzip"      value="" >      <!--���������� ����� �����ȣ-->
    <input type="hidden" name="dlvaddr"     value="" >      <!--���������� ����� �ּ�-->
    <input type="hidden" name="dlvaddrdtls" value="" >      <!--���������� ����� ���ּ�-->
    <input type="hidden" name="rdrprn"      value="" ><!--���������� ����� �ֹι�ȣ �Է�-->

    <input type="hidden" name="cardno"      value="">		<!--ī���ȣ-->
    <input type="hidden" name="vdtyprd"     value="">		<!--��ȿ�Ⱓ-->

    <input type="hidden" name="rdr_no"      value="" >      <!--���������� ����� ���ڹ�ȣ-->
    <input type="hidden" name="medicd"      value="" >      <!--���������� ����� ��ü�ڵ�-->
    <input type="hidden" name="termsubsno"  value="" >      <!--���������� ����� ���ⱸ����ȣ-->
    <input type="hidden" name="pymtno_2"    value="" >      <!--���������� ����� �����ڹ�ȣ-->

	<tr >
		<td height="25" width="100" bgcolor="#EBE9DC" class="gray">������(ȸ��)��<font color="red">*</font></td>
		<td class="gray" width="200" >
			<input type="text" name="rdrnm" size="15" class="text_box" caption="������(ȸ��)��" notEmpty style="ime-mode:active;" onblur="this.form.pymtnm.value=this.value">
		</td>
        <td height="25" width="80" bgcolor="#EBE9DC" class="gray">��ȭ��ȣ<font color="blue">*</font></td>
        <td class="gray"  width="150">
		<input type="text" name="rdrtel1" size="4" maxlength="4" class="text_box" caption="��ȭ��ȣ" dataType=integer notEmpty onblur="this.form.pymttel1.value=this.value">
		-
		<input type="text" name="rdrtel2" size="4" maxlength="4" class="text_box" caption="��ȭ��ȣ" dataType=integer notEmpty onblur="this.form.pymttel2.value=this.value">
		-
		<input type="text" name="rdrtel3" size="4" maxlength="4" class="text_box" caption="��ȭ��ȣ" dataType=integer notEmpty onblur="this.form.pymttel3.value=this.value">
	</td>
        <td width="80" bgcolor="#EBE9DC" class="gray"> �޴�����ȣ<font color="blue">*</font></td>
        <td class="gray" width="220">
            <input name="rdrptph_no1" type="text" value="" size="4" class="text_box"> -
            <input name="rdrptph_no2" type="text" value="" size="4" class="text_box"> -
            <input name="rdrptph_no3" type="text" value="" size="4" class="text_box">
			<input type="image" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle" style="cursor:hand;" onclick="rdr_search();window.event.returnValue=false;">
        </td>
	</tr>
<!--
	<tr>
          <td width="90" bgcolor="#EBE9DC" class="gray" >�Ҽ�����<font color="red">*</font></td>
          <td class="gray"  width="200">
          <input type="text" name="bocdnm" value="" size="20" class="readonly_box" style="text-align:center" readonly caption="�Ҽ�����" notEmpty>
          </td>

          <td width="80" bgcolor="#EBE9DC" class="gray" >������ü<font color="red">*</font></td>
          <td class="gray"  width="150">
          <input type="text" name="medinm" value="" class="readonly_box" style="text-align:center" readonly caption="������ü" notEmpty>
          </td>

          <td width="80" bgcolor="#EBE9DC" class="gray" >���ڹ�ȣ<font color="red">*</font></td>
          <td class="gray"  width="250">
          <input type="text" name="rdr_no" value="" size="9" class="readonly_box" style="text-align:center" readonly notEmpty> -
          <input type="text" name="medicd" value="" size="3" class="readonly_box" style="text-align:center" readonly notEmpty> -
          <input type="text" name="termsubsno" value="" size="4" class="readonly_box" style="text-align:center" readonly notEmpty>
		</td>
	</tr>
	<tr >
      <td width="80" bgcolor="#EBE9DC" class="gray" >�����Ⱓ<font color="red">*</font></td>
      <td class="gray"  width="200">
      <input type="text" name="subsfrser_no" size="10" value="" class="readonly_box" style="text-align:center" readonly caption="�����Ⱓ" notEmpty> -
      <input type="text" name="substoser_no" size="10" value="" class="readonly_box" style="text-align:center" readonly caption="�����Ⱓ" notEmpty>
		</td>

      <td width="90" bgcolor="#EBE9DC" class="gray" >�ּ�<font color="red">*</font></td>
      <td class="gray" colspan="3">
      <input type="text" size="70" name="addr_all" value="" class="readonly_box" style="text-align:left" readonly caption="�ּ�" notEmpty>
		</td>
	</tr>
	<tr id="pymt_num_id1">
		<td height="25" width="150" bgcolor="#EBE9DC" class="gray">�����ڹ�ȣ<font color="blue">*</font></td>
		<td class="gray" >
			<input type="text" name="pymtno_2" size="17" maxlength="17" class="text_box" caption="�����ڹ�ȣ" dataType=integer len="17" >
		</td>
	</tr>
-->
</table>

<table id="pymt_num_id2" width="830" border="0" cellspacing="0" cellpadding="2">
	<tr>
		<td> �� �����ڹ�ȣ�� ���ο������� �ִ� 17�ڸ� ��ȣ�Դϴ�</td>
	</tr>
</table>
<!--������ ������-->


<!--ī������ -->
<table width="830" border="0"  cellpadding="1" cellspacing="0" align="center">
<tr>
	<td height="10">
	<!--����-->
	</td>
</tr>
<tr>
	<td  height="25" bgcolor="#EBE9DC" class="title">ī�� ����</td>
	</td>
</tr>
<tr>
	<td height="3">
	<!--����-->
	</td>
</tr>
</table>

<table border="0" cellspacing="0" cellpadding="2"  width="830" class="gray">
	<tr >
		<td height="25"   width="150" bgcolor="#EBE9DC" class="gray">�����ڸ�<font color="red">*</font></td>
		<td class="gray" >
			<input type="text" name="pymtnm" size="15" class="text_box" style="ime-mode:active;" caption="�����ڸ�" notEmpty>
		</td>
		<td class="gray" bgcolor="#EBE9DC" width="120" >������ ��ȭ��ȣ<font color="red">*</font></td>
		<td class="gray" >
			<input type="text" name="pymttel1" size="4" maxlength="4" class="text_box" caption="��������ȭ��ȣ" dataType=integer notEmpty>
			-
			<input type="text" name="pymttel2" size="4" maxlength="4" class="text_box" caption="��������ȭ��ȣ" dataType=integer notEmpty>
			-
			<input type="text" name="pymttel3" size="4" maxlength="4" class="text_box" caption="��������ȭ��ȣ" dataType=integer notEmpty>
		</td>
	</tr>
	<tr >
		<td height="25" width="150" bgcolor="#EBE9DC" class="gray">ī������<font color="red">*</font></td>
		<td class="gray" colspan="3" >
			<select name="cardcmpycd" class="sel_all">
				<%= ds.curcardcdOptHtml("--")%>
			</select>
		</td>
	</tr>
	<tr >
		<td height="25" width="150" bgcolor="#EBE9DC" class="gray">ī���ȣ<font color="red">*</font></td>
		<td class="gray" colspan="3" >
			<input type="text" name="cardno1" size="4" maxlength="4" class="text_box" caption="ī���ȣ" dataType=integer notEmpty>
			-
			<input type="text" name="cardno2" size="4" maxlength="4" class="text_box" caption="ī���ȣ" dataType=integer notEmpty>
			-
			<input type="text" name="cardno3" size="4" maxlength="4" class="text_box" caption="ī���ȣ" dataType=integer notEmpty>
			-
			<input type="text" name="cardno4" size="4" maxlength="4" class="text_box" caption="ī���ȣ" dataType=integer notEmpty>
		</td>
	</tr>
	<tr >
		<td height="25" width="150" bgcolor="#EBE9DC" class="gray">��ȿ�Ⱓ<font color="red">*</font></td>
		<td class="gray" colspan="3" >
			<input type="text" name="vdtyprd_y" size="4" maxlength="4" class="text_box" caption="��ȿ�Ⱓ" dataType=integer notEmpty>
			��
			<input type="text" name="vdtyprd_m" size="2" maxlength="2" class="text_box" caption="��ȿ�Ⱓ" dataType=integer notEmpty>
			��
		</td>
	</tr>
	<tr >
		<td height="25" width="150" bgcolor="#EBE9DC" class="gray">�ֹε��(�����)��ȣ<font color="red">*</font></td>
		<td class="gray" colspan="3" >
			<input type="text" name="prn" size="30" maxlength="14" class="text_box" value="" caption="�ֹε��(�����)��ȣ" dataType="juffice" notEmpty>
		</td>
	</tr>
	<tr >
		<td height="25" width="150" bgcolor="#EBE9DC" class="gray">��ü���ۿ�<font color="red">*</font></td>
		<td class="gray" colspan="3" >
		<!--��û������-->
		<%
		    Calendar calendar = new GregorianCalendar(Locale.KOREA);
		    calendar.add(Calendar.MONTH, 1);
		%>
		    <select name="aplyyymm" class="sel_all" id="aplyyymm_id" style="width:90" notEmpty caption="��ü���ۿ�" align="absmiddle">
		        <option value="" selected>����</option>
		        <%
		            String tempStr = "";
		            //calendar.add(Calendar.MONTH, -1);

                    int today = Integer.parseInt(Util.getDate());
                    int basiday = Integer.parseInt(Util.getYyyyMm()+"11");

                    if(today < basiday ) {
                      calendar.add(Calendar.MONTH, -1);
                    }

		            for(int i=0; i<12; i++) {
		                if(calendar.get(Calendar.MONTH)+1 < 10) {
		                    tempStr = "0" + String.valueOf(calendar.get(Calendar.MONTH)+1);
		                } else {
		                    tempStr = String.valueOf(calendar.get(Calendar.MONTH)+1);
		                }
		        %>
		        <option value="<%=String.valueOf(calendar.get(Calendar.YEAR))+tempStr%>"><%=calendar.get(Calendar.YEAR)%>�� <%=calendar.get(Calendar.MONTH)+1%>��</option>
		        <%
		                calendar.add(Calendar.MONTH, 1);
		            }
		        %>
		    </select>
			<font color="red">�� �������� �ſ� 28�� �Դϴ�.</font>
		</td>
	</tr>
	<tr >
		<td height="25" width="150" bgcolor="#EBE9DC" class="gray">�̸���</td>
		<td class="gray" colspan="3" >
			<input type="text" name="email" size="30" class="text_box" caption="�̸���" dataType=email>
		</td>
	</tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="2">
    <tr>
        <td bgcolor="#EBE9DC" class="title">�� ���ڸ���Ʈ</td>
    </tr>
</table>
<table  width="830" cellspacing="0" cellpadding="0" border="0" id="pbrdr_list">
    <tr bgcolor="#DDDDDD" >
        <td width="30" align="center" class="gray">
        <input type="checkbox" name="formcheckbox1">
        </td>
        <td width="100" align="center" class="gray"> �Ҽ����� </td>
        <td width="100" align="center" class="gray"> ������ü </td>
        <td width="150" align="center" class="gray"> ���ڹ�ȣ </td>
        <td width="130" align="center" class="gray"> �����Ⱓ </td>
        <td width="80"  align="center" class="gray"> �ּ� </td>
        <td width="80"  align="center" class="gray"> �����ڹ�ȣ </td>
    </tr>
    <tr>
        <td width="30" class="gray" align="center" >
        <input type="checkbox" name="formcheckbox12">
        </td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
        <td  class="gray" align="center" > &nbsp;</td>
    </tr>
</table>
</form>
</td>
</tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width=00 height=00></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
<form name="card_validation_form" style="display:none">
    <input type="hidden" name="cardcmpycd" value=""><!--ī������(ī���) 2007.01.22 ī������� ���� �߰� -->
    <input type="hidden" name="accflag" value=""><!--����-->
    <input type="hidden" name="cardno" value=""><!--ī���ȣ-->
    <input type="hidden" name="expiry" value=""><!--��ȿ�Ⱓ(YYMM)-->
    <input type="hidden" name="jumin" value=""><!--�ֹε�Ϲ�ȣ-->
</form>
