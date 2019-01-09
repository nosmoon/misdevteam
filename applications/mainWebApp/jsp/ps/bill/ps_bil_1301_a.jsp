<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_bil_1301_a.jsp
* ��� : ������ �Ա� �ʱ�ȭ��
* �ۼ����� : 2004-03-29
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    // dataset �ν��Ͻ� ���� �κ�
    PS_S_ABNOR_SEPBKDataSet ds=(PS_S_ABNOR_SEPBKDataSet)request.getAttribute("ds"); //request dataset
%>

<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">

	function jsinit(){
		setEventHandler();
		//setEnterKeyEventHandler();
	}

	// form�� ��� �� üũ
	function check_all(form){
		if(!validate(form)) return false;
		else{
			makeValue(form);
			form.submit();
		}
	}

	// ����Ű�� ġ�ų� intLen���̶� ������ dstObj�� �̵�
	function passFocus_Enter(chkObj,dstObj,intLen) {
		var str = chkObj.value;

		var e = window.event;

		if(str.length == intLen) dstObj.focus();
		else if(e.keyCode != "13" ) return;

		e.returnValue = false;
		dstObj.focus();
	}

	// ������ �Ա� ���� ����,������Ʈ
	function non_rcpm_save() {
		var lo_form2 = document.non_rcpm_form;

		if(lo_form2.total_records.value=="") {
			alert("��ȸ�� �����Ͻʽÿ�");
		return false;
		}

		var procdt="";
		var recpdt="";
		var rcpmamt="";
		var recpbrchcd="";
		var normerrclsf="";
		var rdr_no="";
		var medicd="";
		var termsubsno="";
		var custbrwsno="";
		var seq="";
		var acqdt="";
		var acqno="";
        var bocd="";

		//	if(!check_all(lo_form2)) return false;

		for(var i = 0; i < lo_form2.chk.length; i++){
			if(lo_form2.chk[i].checked ){
				if(!validateObj(lo_form2, lo_form2.rcpmrfldt[i])) return false;
				if(!validateObj(lo_form2, lo_form2.rdr_no[i])) return false;
				if(!validateObj(lo_form2, lo_form2.medicd[i])) return false;
				if(!validateObj(lo_form2, lo_form2.termsubsno[i])) return false;

				makeValueObj(lo_form2, lo_form2.rcpmrfldt[i]);
				makeValueObj(lo_form2, lo_form2.rdr_no[i]);
				makeValueObj(lo_form2, lo_form2.medicd[i]);
				makeValueObj(lo_form2, lo_form2.termsubsno[i]);

				var temp=lo_form2.chk[i].value;
				var ss = temp.split("##");

				if(ss.length!=13) {
					alert("���ý� ������ �߻��߽��ϴ�.");
					return false;
				} else {
					seq += "##"+ss[0];
					acqdt += "##"+ss[1];
					acqno += "##" +ss[2];
					procdt += "##"+ lo_form2.rcpmrfldt[i].value;
					recpdt +="##"+ss[4];
					rcpmamt +="##"+ss[5];
					recpbrchcd +="##" + ss[6];
					normerrclsf +="##" + ss[7];
					custbrwsno +="##" + ss[8];
					rdr_no += "##" + lo_form2.rdr_no[i].value;
					medicd += "##" + lo_form2.medicd[i].value;
					termsubsno += "##" + lo_form2.termsubsno[i].value;
                    bocd +="##" + ss[12];
				}
			}
		}
		if(rdr_no != ""){
			seq = seq.substr(2);
			acqdt = acqdt.substr(2);
			acqno = acqno.substr(2);
			procdt = procdt.substr(2);
			recpdt = recpdt.substr(2);
			rcpmamt = rcpmamt.substr(2);
			recpbrchcd = recpbrchcd.substr(2);
			normerrclsf = normerrclsf.substr(2);
			custbrwsno = custbrwsno.substr(2);
			rdr_no = rdr_no.substr(2);
			medicd = medicd.substr(2);
			termsubsno = termsubsno.substr(2);
            bocd = bocd.substr(2);
		} else {
			alert("������ ����� ���ų� ������ ����� �����Ͻʽÿ�");
			return false;
		}

		lo_form2.rdr_no_chk.value=rdr_no;
		lo_form2.medicd_chk.value=medicd;
		lo_form2.termsubsno_chk.value=termsubsno;
        lo_form2.bocd_chk.value=bocd;

		lo_form2.procdt.value=procdt;
		lo_form2.recpdt.value=recpdt;
		lo_form2.rcpmamt.value=rcpmamt;
		lo_form2.recpbrchcd.value=recpbrchcd;
		lo_form2.normerrclsf.value=normerrclsf;
		lo_form2.custbrwsno.value=custbrwsno;

		lo_form2.seq.value=seq;
		lo_form2.acqdt.value=acqdt;
		lo_form2.acqno.value=acqno;
		lo_form2.action = "/ps/bill/1311";
		lo_form2.target = "ifrm";
		lo_form2.submit();
	}



	// ������ �Ա� ���� ����Ʈ
	function non_rcpm_list(startpage) {
		var lo_form1 = document.non_rcpm_form;

        if(window.event) window.event.returnValue = false;
        //�������� check
        if(lo_form1.acqdt_1.value==""){
            alert("�������ڴ� �ʼ��׸��Դϴ�");
            lo_form1.acqdt_1.focus();
            return;
        }
        if(lo_form1.acqdt_2.value==""){
            alert("�������ڴ� �ʼ��׸��Դϴ�");
            lo_form1.acqdt_2.focus();
            return;
        }

		makeValue(lo_form1);

		// �����ϰ� �������� ��
		if(!isValidDateBW(lo_form1,lo_form1.acqdt_1,lo_form1.acqdt_2)) {
			return false;
		}

		lo_form1.curr_page_no.value = startpage;
		lo_form1.action = "/ps/bill/1306";
		lo_form1.target = "ifrm";
		lo_form1.submit();
	}

	// �����ϰ� �������� ��
	function isValidDateBW(form,from,to) {

		if(from.value > to.value) {
			alert("�������ڰ� �������ں��� �۾ƾ� �մϴ�.");
			from.value=<%=Util.getDate()%>;
			from.focus();
			return false;
		}
		if(to.value > <%=Util.getDate()%>) {
			alert("�������ڴ� ���� ��¥ ���� Ŀ���� �� �˴ϴ�.");
			to.value=<%=Util.getDate()%>;
			to.focus();
			return false;
		}
		return true;
		}

	// ������ �̵�
	function page_move(curr_page_no) {
		var lo_form3 = document.non_rcpm_form;
		//alert("curr_page_no=="+curr_page_no);

		if(!curr_page_no) {
			lo_form3.curr_page_no.value = '1';
		} else {
			lo_form3.curr_page_no.value = curr_page_no;
		}

		non_rcpm_list(curr_page_no);
	}

	// üũ�ڽ��� Ŭ���ؼ� ��� üũ�ڽ��� ���� �Ǵ� ���������Ѵ�.
	function select_all(bool) {
		var lo_form1;
		lo_form1 = document.non_rcpm_form;

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


	// üũ �ڽ� ���ý� chkhead üũ ����
	function checkOne()	{
		var len  = document.non_rcpm_form.chk.length;
		var check = true;
		for (var i=0; i<len; i++){
			if((!non_rcpm_form.chk[i].checked) && (!non_rcpm_form.chk[i].disabled)) {
				check = false;
			}
		}
		//alert("check===== "+check);
		document.non_rcpm_form.chkhead.checked = check;
		window.event.cancelBubble=true;
	}

	// ���ڸ�� ��ü�̸� ã��
	function search_rdrnm_medicdnm(i) {

		//var lo_form2 = document.non_rcpm_form;
        var lo_form = document.non_rcpm_form;
        var lo_form2 = document.rdr_form;
        lo_form.setFunction.value = "setReader";
        lo_form.setKubun.value=i;
        lo_form2.rdr_no.value= lo_form.rdr_no[i].value;
        lo_form2.medicd.value= lo_form.medicd[i].value;
        lo_form2.termsubsno.value= lo_form.termsubsno[i].value;
        lo_form2.action="/ps/common/1601";
        lo_form2.target="ifrm";
        lo_form2.submit();
        lo_form.rdr_no[i].value= "";
        lo_form.medicd[i].value= "";
        lo_form.termsubsno[i].value= "";
        lo_form.rdrnm[i].value= "";
        lo_form.medinm[i].value= "";
        lo_form.rdr_no[i].focus();
	}
    // ���ڹ�ȣ�� �������� set
    function setReader(rdr_no,medicd,termsubsno,rdrnm,medinm){
        var lo_form1 = document.non_rcpm_form;
        var lo_cnt = lo_form1.setKubun.value ;

        lo_form1.rdr_no[lo_cnt].value= rdr_no;
        lo_form1.medicd[lo_cnt].value= medicd;
        lo_form1.termsubsno[lo_cnt].value= termsubsno;
        lo_form1.rdrnm[lo_cnt].value= rdrnm;
        lo_form1.medinm[lo_cnt].value= medinm;
        setEventHandler();
    }
    //OZ PRINT ����
    function print_list(){
	    var lo_form1    = document.non_rcpm_form;

		if(lo_form1.acqdt_1.value=="") {
			alert("�������ڸ� �Է��ϼ���");
			return false;
		} else if(lo_form1.acqdt_2.value=="") {
			alert("���� �������ڸ� �������ڿ� �Ȱ���");
			lo_form1.acqdt_2.value=lo_form1.acqdt_1.value;
		}

		if(!validate(lo_form1)) return false;

		makeValue(lo_form1);

		// �����ϰ� �������� ��
    	if(!isValidDateBW(lo_form1,lo_form1.acqdt_1,lo_form1.acqdt_2)) {
	    	return false;
    	}

		lo_form1.action = "/ps/bill/1316";
	    lo_form1.target = "ifrm";
    	lo_form1.submit();
    }

</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onLoad="jsinit();non_rcpm_form.acqdt_1.focus();">
	<table width="100%" border="0" cellspacing="0" cellpadding="0" height="100%">
		<tr>
			<td valign="top" align="center">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td bgcolor="#797777" height="25" class="home"><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle"><b>����
						&gt; </b>�������Ա�</td>
					</tr>
					<tr>
						<td height="10">
						<!--������ ���� ����-->
						</td>
					</tr>
				</table>

				<table width="830" border="0" cellspacing="0" cellpadding="0">
					<tr><td>
						<form name="non_rcpm_form" method="post" action="" onSubmit="non_rcpm_list(1)">

						<input type="hidden" name="rdr_no_chk" >
						<input type="hidden" name="medicd_chk" >
						<input type="hidden" name="termsubsno_chk">
                        <input type="hidden" name="bocd_chk">

						<input type="hidden" name="setKubun">
                        <input type="hidden" name="setFunction">
						<!--<input type="hidden" name="rdrnm">
						<input type="hidden" name="medinm">-->


						<input type="hidden" name="procdt">
						<input type="hidden" name="recpdt">
						<input type="hidden" name="rcpmamt">
						<input type="hidden" name="recpbrchcd">
						<input type="hidden" name="normerrclsf">
						<input type="hidden" name="custbrwsno">

						<input type="hidden" name="seq">
						<input type="hidden" name="acqdt">
						<input type="hidden" name="acqno">

						<input type="hidden" name="curr_page_no" value="0">
                        <input type="hidden" name="total_records">
						<input type="hidden" name="records_per_page" value ="15">
						<input type="hidden" name="js_fn_nm" value="page_move">
						<!--		<input type="hidden" name="target_form" value="2"> -->
						<table width="830" border="0" cellspacing="0" cellpadding="2">
							<tr bgcolor="#EBE9DC">
								<td  class="title" width="80"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�������� <font color="red">*</font></td>
								<td  class="title" width="200">
									<input type="text" name="acqdt_1" size="11" class="text_box" value="<%= ds.getSysdate()%>" caption="������ ������" datatype="date" notEmpty>
									-
									<input type="text" name="acqdt_2" size="11" class="text_box" value="<%= ds.getSysdate()%>" caption="������ ������" datatype="date" notEmpty>
								</td>
								<td  class="title" width="90"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">ó������</td>
								<td  class="title" bgcolor="#EBE9DC">
									<select name="slt_bocd" size="1" class="sel_all" >
									<option value="ALL">��ü</option>
									<%=ds.asinbocdcurOptHtml("") %>
									</select>
                                </td>
								<td  class="title" width="90"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">ó������</td>
								<td  class="title" bgcolor="#EBE9DC">
									<select name="rcpmrflyn" size="1" class="sel_all" >
									<option value="ALL">��ü</option>
									<%=ds.crpmyncurOptHtml("") %>
									</select>
									<input type="image" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle" border="0" onclick="javascript:non_rcpm_list(1)"  style="cursor:hand;" >
								</td>
								</tr>
								<tr>
								<td height="3" colspan="4">
								<!--����-->
								</td>
							</tr>
						</table>
						<!--����Ʈ -->
						<table width="830" border="0" cellspacing="0" cellpadding="2">
							<tr>
								<td bgcolor="#EBE9DC" class="title"><b>�󼼸��</b></td>
								<td bgcolor="#EBE9DC" class="title" width="100" align="right"> <img src="/html/comm_img/bu_save.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:non_rcpm_save()"  style="cursor:hand;" >
								<img src="/html/comm_img/bu_print.gif" width="39" height="19" border="0" align="absmiddle"  onClick="print_list()" style="cursor:hand;" >
							</td>
							</tr>
							<tr>
								<td height="3" colspan="2">
								<!--����-->
								</td>
							</tr>
						</table>

						<table width="830" cellspacing="0" cellpadding="0" border="0" id="non_rcpm_list">
						<tr>
                            <td>
							<table width="830" cellspacing="0" cellpadding="2" border="0" class="gray" bgcolor="#FFFFFF" >
							<tr bgcolor="#dddddd" align="center">
							<td width="30" class="gray" >
							<input type="checkbox" name="formcheckbox1">
							</td>
							<td width="70" class="gray" > �Ա����� </td>
							<td width="310" class="gray" > ���ڹ�ȣ </td>
                            <td width="70" class="gray" > ó������ </td>
							<td width="70" class="gray" > �������� </td>
							<td width="70" class="gray" > �Աݱݾ� </td>
							<td width="60" class="gray" > ������ </td>
							<td width="70" class="gray" > �������� </td>
							<td width="60" class="gray" > ó������ </td>
						</tr>
						<tr>
							<td   class="gray" align="center" >
							<input type="checkbox" name="formcheckbox1">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext14" size="10" class="text_box">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext8" size="9" class="text_box">
							<input type="text" name="formtext9" size="3" class="text_box">
							<input type="text" name="formtext11" size="5" class="text_box">
							<input type="text" name="formtext12" size="10" class="text_box">
							<input type="text" name="formtext13" size="10" class="text_box">
							</td>
							<td   class="gray" > &nbsp;</td>
                            <td   class="gray" > &nbsp;</td>
							<td   class="gray" align="right" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" > &nbsp; </td>
						</tr>
						<tr>
							<td   class="gray" align="center" >
							<input type="checkbox" name="formcheckbox1">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext14" size="10" class="text_box">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext8" size="9" class="text_box">
							<input type="text" name="formtext9" size="3" class="text_box">
							<input type="text" name="formtext11" size="5" class="text_box">
							<input type="text" name="formtext12" size="10" class="text_box">
							<input type="text" name="formtext13" size="10" class="text_box">
							</td>
							<td   class="gray" > &nbsp;</td>
                            <td   class="gray" > &nbsp;</td>
							<td   class="gray" align="right" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" > &nbsp; </td>
						</tr>
						<tr>
							<td   class="gray" align="center" >
							<input type="checkbox" name="formcheckbox1">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext14" size="10" class="text_box">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext8" size="9" class="text_box">
							<input type="text" name="formtext9" size="3" class="text_box">
							<input type="text" name="formtext11" size="5" class="text_box">
							<input type="text" name="formtext12" size="10" class="text_box">
							<input type="text" name="formtext13" size="10" class="text_box">
							</td>
							<td   class="gray" > &nbsp;</td>
                            <td   class="gray" > &nbsp;</td>
							<td   class="gray" align="right" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" > &nbsp; </td>
						</tr>
						<tr>
							<td   class="gray" align="center" >
							<input type="checkbox" name="formcheckbox1">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext14" size="10" class="text_box">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext8" size="9" class="text_box">
							<input type="text" name="formtext9" size="3" class="text_box">
							<input type="text" name="formtext11" size="5" class="text_box">
							<input type="text" name="formtext12" size="10" class="text_box">
							<input type="text" name="formtext13" size="10" class="text_box">
							</td>
							<td   class="gray" > &nbsp;</td>
                            <td   class="gray" > &nbsp;</td>
							<td   class="gray" align="right" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" > &nbsp; </td>
						</tr>
						<tr>
							<td   class="gray" align="center" >
							<input type="checkbox" name="formcheckbox1">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext14" size="10" class="text_box">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext8" size="9" class="text_box">
							<input type="text" name="formtext9" size="3" class="text_box">
							<input type="text" name="formtext11" size="5" class="text_box">
							<input type="text" name="formtext12" size="10" class="text_box">
							<input type="text" name="formtext13" size="10" class="text_box">
							</td>
							<td   class="gray" > &nbsp;</td>
                            <td   class="gray" > &nbsp;</td>
							<td   class="gray" align="right" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" > &nbsp; </td>
						</tr>
						<tr>
							<td   class="gray" align="center" >
							<input type="checkbox" name="formcheckbox1">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext14" size="10" class="text_box">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext8" size="9" class="text_box">
							<input type="text" name="formtext9" size="3" class="text_box">
							<input type="text" name="formtext11" size="5" class="text_box">
							<input type="text" name="formtext12" size="10" class="text_box">
							<input type="text" name="formtext13" size="10" class="text_box">
							</td>
							<td   class="gray" > &nbsp;</td>
                            <td   class="gray" > &nbsp;</td>
							<td   class="gray" align="right" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" > &nbsp; </td>
						</tr>
						<tr>
							<td   class="gray" align="center" >
							<input type="checkbox" name="formcheckbox1">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext14" size="10" class="text_box">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext8" size="9" class="text_box">
							<input type="text" name="formtext9" size="3" class="text_box">
							<input type="text" name="formtext11" size="5" class="text_box">
							<input type="text" name="formtext12" size="10" class="text_box">
							<input type="text" name="formtext13" size="10" class="text_box">
							</td>
							<td   class="gray" > &nbsp;</td>
                            <td   class="gray" > &nbsp;</td>
							<td   class="gray" align="right" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" > &nbsp; </td>
						</tr>
						<tr>
							<td   class="gray" align="center" >
							<input type="checkbox" name="formcheckbox1">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext14" size="10" class="text_box">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext8" size="9" class="text_box">
							<input type="text" name="formtext9" size="3" class="text_box">
							<input type="text" name="formtext11" size="5" class="text_box">
							<input type="text" name="formtext12" size="10" class="text_box">
							<input type="text" name="formtext13" size="10" class="text_box">
							</td>
							<td   class="gray" > &nbsp;</td>
                            <td   class="gray" > &nbsp;</td>
							<td   class="gray" align="right" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" > &nbsp; </td>
						</tr>
						<tr>
							<td   class="gray" align="center" >
							<input type="checkbox" name="formcheckbox1">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext14" size="10" class="text_box">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext8" size="9" class="text_box">
							<input type="text" name="formtext9" size="3" class="text_box">
							<input type="text" name="formtext11" size="5" class="text_box">
							<input type="text" name="formtext12" size="10" class="text_box">
							<input type="text" name="formtext13" size="10" class="text_box">
							</td>
							<td   class="gray" > &nbsp;</td>
                            <td   class="gray" > &nbsp;</td>
							<td   class="gray" align="right" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" > &nbsp; </td>
						</tr>
						<tr>
							<td   class="gray" align="center" >
							<input type="checkbox" name="formcheckbox1">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext14" size="10" class="text_box">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext8" size="9" class="text_box">
							<input type="text" name="formtext9" size="3" class="text_box">
							<input type="text" name="formtext11" size="5" class="text_box">
							<input type="text" name="formtext12" size="10" class="text_box">
							<input type="text" name="formtext13" size="10" class="text_box">
							</td>
							<td   class="gray" > &nbsp;</td>
                            <td   class="gray" > &nbsp;</td>
							<td   class="gray" align="right" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" > &nbsp; </td>
						</tr>
						<tr>
							<td   class="gray" align="center" >
							<input type="checkbox" name="formcheckbox1">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext14" size="10" class="text_box">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext8" size="9" class="text_box">
							<input type="text" name="formtext9" size="3" class="text_box">
							<input type="text" name="formtext11" size="5" class="text_box">
							<input type="text" name="formtext12" size="10" class="text_box">
							<input type="text" name="formtext13" size="10" class="text_box">
							</td>
							<td   class="gray" > &nbsp;</td>
                            <td   class="gray" > &nbsp;</td>
							<td   class="gray" align="right" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" > &nbsp; </td>
						</tr>
						<tr>
							<td   class="gray" align="center" >
							<input type="checkbox" name="formcheckbox1">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext14" size="10" class="text_box">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext8" size="9" class="text_box">
							<input type="text" name="formtext9" size="3" class="text_box">
							<input type="text" name="formtext11" size="5" class="text_box">
							<input type="text" name="formtext12" size="10" class="text_box">
							<input type="text" name="formtext13" size="10" class="text_box">
							</td>
							<td   class="gray" > &nbsp;</td>
                            <td   class="gray" > &nbsp;</td>
							<td   class="gray" align="right" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" > &nbsp; </td>
						</tr>
						<tr>
							<td   class="gray" align="center" >
							<input type="checkbox" name="formcheckbox1">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext14" size="10" class="text_box">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext8" size="9" class="text_box">
							<input type="text" name="formtext9" size="3" class="text_box">
							<input type="text" name="formtext11" size="5" class="text_box">
							<input type="text" name="formtext12" size="10" class="text_box">
							<input type="text" name="formtext13" size="10" class="text_box">
							</td>
							<td   class="gray" > &nbsp;</td>
                            <td   class="gray" > &nbsp;</td>
							<td   class="gray" align="right" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" > &nbsp; </td>
						</tr>
						<tr>
							<td   class="gray" align="center" >
							<input type="checkbox" name="formcheckbox1">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext14" size="10" class="text_box">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext8" size="9" class="text_box">
							<input type="text" name="formtext9" size="3" class="text_box">
							<input type="text" name="formtext11" size="5" class="text_box">
							<input type="text" name="formtext12" size="10" class="text_box">
							<input type="text" name="formtext13" size="10" class="text_box">
							</td>
							<td   class="gray" > &nbsp;</td>
                            <td   class="gray" > &nbsp;</td>
							<td   class="gray" align="right" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" > &nbsp; </td>
						</tr>
						<tr>
							<td   class="gray" align="center" >
							<input type="checkbox" name="formcheckbox1">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext14" size="10" class="text_box">
							</td>
							<td   class="gray" align="center" >
							<input type="text" name="formtext8" size="9" class="text_box">
							<input type="text" name="formtext9" size="3" class="text_box">
							<input type="text" name="formtext11" size="5" class="text_box">
							<input type="text" name="formtext12" size="10" class="text_box">
							<input type="text" name="formtext13" size="10" class="text_box">
							</td>
							<td   class="gray" > &nbsp;</td>
                            <td   class="gray" > &nbsp;</td>
							<td   class="gray" align="right" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" align="center" > &nbsp;</td>
							<td   class="gray" > &nbsp; </td>
						</tr>
					</table>
					<!---button-->
					<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2">
						<tr>
							<td align="center" height="2">
							<!--����-->
							</td>
						</tr>
						<tr>
							<td align="center" height="24" bgcolor="#E8E8E8">
							<!--JSP PAGE START---------------------------------------------------------------------------------->
							<jsp:include page="/jsp/ps/comm_jsp/page_navigator.jsp">
							<jsp:param name = "curr_page_no" 		value="0"/>
							<jsp:param name = "total_records" 	value="0"/>
							<jsp:param name = "js_fn_nm" 			value="page_move"/>
							<jsp:param name = "records_per_page" 	value="15"/>
							<jsp:param name = "page_set_gubun" 	value="0"/>
							</jsp:include>

							<!--JSP PAGE END------------------------------------------------------------------------------------>
							</td>
						</tr>
					</table>
				</td></tr>
			</table>
			<!--����Ʈ �� -->
		</form>
	</td></tr>
</table>
<br>
<br>
</td>
</tr>
</table>
<form name="rdr_form" method="post" action="" >
    <input type="hidden" name="rdr_no">
    <input type="hidden" name="medicd">
    <input type="hidden" name="termsubsno">
</form>
<!-- HTML IFRAME START ------------------------------------------------>
<iframe name="ifrm" width=830 height=0></iframe>
<!-- HTML IFRAME END---------------------------------------------------->

</body>
</html>
