<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1000_a.jsp
* ��� : ������-�����ڵ�-�ʱ�ȭ��
* �ۼ����� : 2004-03-09
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%! 
private String getTime() {

java.util.Calendar systime = java.util.Calendar.getInstance();
                StringBuffer sb = new StringBuffer();
                sb.append(systime.get(java.util.Calendar.YEAR));
                sb.append("-");
                sb.append(systime.get(java.util.Calendar.MONTH));
                sb.append("-");
                sb.append(systime.get(java.util.Calendar.DAY_OF_MONTH));
                sb.append(" ");
                sb.append(systime.get(java.util.Calendar.HOUR_OF_DAY));
                sb.append(":");
                sb.append(systime.get(java.util.Calendar.MINUTE));
                sb.append(":");
                sb.append(systime.get(java.util.Calendar.SECOND));
                sb.append(".");
                sb.append(systime.get(java.util.Calendar.MILLISECOND));
                
                return sb.toString();
                }
%>  
<%
	CO_L_CDV_INITDataSet ds = (CO_L_CDV_INITDataSet)request.getAttribute("ds");
    int cdvListCount = 13;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;	// ���� ���� ����
    
    String time1 = (String)request.getAttribute("SVR Entry");
	String time11 = (String)request.getAttribute("SVR Done");	

	String time2 = "\nJSP Entry \t : "+ getTime();
	
	System.out.println("=====JSP ENTRY TIME======: " + time1);
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
	document.cdv_search_form.cicodeval.focus();
}

// �� ��ȿ�� üũ
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// �ڵ屸�� ��Ϻ���
function cicdgb_list_search(){
    var lo_form1 = document.cdv_search_form;
    
	// ���������ڵ带 �ش� �������� ������.
    lo_form1.action = "/ss/admin/1003";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ��Ϻ���
function list_search(){
    var lo_form1 = document.cdv_search_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
	lo_form1.pageno.value = '1';									// ��������ȣ �ʱ�ȭ

	// �����ڵ� ��� ��ȸ������ �ش� �������� ������.
    lo_form1.action = "/ss/admin/1005";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �󼼺���
function detail_view(ciymgbcd, cicdgb, cicodeval){
    var lo_form1 = document.cdv_list_form;

    // ���������ڵ�, �ڵ屸��, �ڵ带 "/ss/admin/1010" �������� ������
    lo_form1.ciymgbcd.value = ciymgbcd;
    lo_form1.cicdgb.value = cicdgb;
    lo_form1.cicodeval.value = cicodeval;
    lo_form1.action = "/ss/admin/1010";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �߰�
function add(){
	var lo_form1 = document.cdv_detail_form;
	// ȭ�� �ʱ�ȭ
	lo_form1.ciymgbcd.value="";
	lo_form1.cicdgb.value=""; 
	lo_form1.cicodeval.value=""; 
	lo_form1.cicdnm.value=""; 
	lo_form1.cicdynm.value=""; 
	lo_form1.cimgtcd1.value=""; 
	lo_form1.cimgtcd2.value="";
	lo_form1.cimgtcd3.value="";
	lo_form1.cimgtcd4.value="";
	lo_form1.cimgtcd5.value="";
	lo_form1.cimgtcd6.value="";
	lo_form1.cimgtcd7.value="";
	document.all.ciremarks_id.outerHTML = '<textarea name="ciremarks" style="ime-mode:active;" cols="27" rows="5" class="scroll1" id="ciremarks_id"></textarea>';
	
	// ���������ڵ�, �ڵ屸�� Ȱ��ȭ
	lo_form1.ciymgbcd.readOnly = false;
	lo_form1.cicdgb.readOnly = false; 
	lo_form1.cicodeval.readOnly = false;
	
	// ���� ó��
	setInputBackgroundColor();
	
	// ��ҹ�ư ��Ȱ��ȭ
	document.all.cancel_id.disabled = true;
		
    lo_form1.accflag.value = 'I';			// �۾������� �Է����� ����
}

// ����
function save(){
	var lo_form1 = document.cdv_detail_form;
	
    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    if(lo_form1.accflag.value == 'I') {	        					// �ű��Է��� ��
        lo_form1.action = "/ss/admin/1015";
    } else if(lo_form1.accflag.value == 'U') {						// ���������� ��
        lo_form1.action = "/ss/admin/1020";
    } else {
      return;
    }
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ����
function del(){
	var lo_form1 = document.cdv_detail_form;

	// ���������ڵ�, �ڵ屸��, �ڵ尪��  ���翩�θ� Ȯ���Ѵ�.
    if(lo_form1.ciymgbcd.value == '' || lo_form1.cicdgb.value == '' || lo_form1.cicodeval.value == '') {
        alert("�ش����� Ŭ�� �� �����ϼ���.");
        return;
    }

	var yesno = confirm("�����Ͻðڽ��ϱ�?");
	if(yesno){
	    if(!check_all(lo_form1)) return;
	    lo_form1.accflag.value = 'D';									// �۾������� ����('D')�� ����
	    lo_form1.action = "/ss/admin/1025";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	}
}

// ���
function cancel(){
	var lo_form1 = document.cdv_detail_form;
	lo_form1.reset();                                               // �� �缳��

	setEventHandler();												// �� �缳�� �� �̺�Ʈ�ڵ鷯 ȣ��
}

// ������ �̵�
function page_move(pageno) {
    var lo_form1 = document.cdv_search_form;

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // �����ڵ� ��� ��ȸ������ "/ss/admin/1005" �������� ������
    lo_form1.action = "/ss/admin/1005";
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

-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="title1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr> 
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >������ 
      &gt; </b> �����ڵ�</td>
  </tr>
  <tr> 
    <td height="10"> 
      <!--������ ���� ����-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
  <tr> 
    <td width="500" valign="top"> 
    
	<!--�����ڵ� �˻� ���� -->
	<table width="500" border="0"  cellpadding="2" cellspacing="0">
    <form name="cdv_search_form" method="post" action="" >
        <input name="pageno" type="hidden" value ="1">			                <!-- ���� ������ ��ȣ -->
        <input name="pagesize" type="hidden" value ="<%= cdvListCount%>">	    <!-- �� ȭ��� ����Ʈ �׸� �� -->
        <input name="js_fn_nm" type="hidden" value ="page_move">
        <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� -->
        
		<tr> 
			<td bgcolor="#EBE9DC" width="65" class="sea_top" ><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��������</td>
			<td bgcolor="#EBE9DC" class="sea_top"> 
				<select name="ciymgbcd" class="sel_all" onChange="cicdgb_list_search()">
					<option value="" selected>��ü</option>
					<%= ds.curcommlistOptHtml("") %>
				</select>
			</td>
			<td bgcolor="#EBE9DC" width="70" class="sea_top"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle"> 
			�ڵ屸��</td>
			<td bgcolor="#EBE9DC" class="sea_top"> 
			<select name="cicdgb" class="sel_all" id="cicdgb_id">
				<option value="" selected>��ü</option>
			</select>
			</td>
			<td bgcolor="#EBE9DC" rowspan="2" align="right" width="40" class="sea_top">
				<input type="image" src="/html/comm_img/bu_search01.gif" width="39" height="35" border="0" align="absmiddle" onclick="javascript:list_search();window.event.returnValue=false;"><!--��� ��ȸ-->
			</td>
		</tr>
		<tr> 
			<td bgcolor="#EBE9DC" width="65"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�ڵ尪</td>
			<td bgcolor="#EBE9DC"> 
				<input type="text" name="cicodeval" size="4" class="text_box">
			</td>
			<td bgcolor="#EBE9DC" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�ڵ��</td>
			<td bgcolor="#EBE9DC"> 
				<input type="text" name="cicdnm" size="14" class="text_box" style="ime-mode:active;">
			</td>
		</tr>
		<tr bgcolor="#927F5B"> 
			<td colspan="5" style height"1"> 
			<!--line -->
			</td>
		</tr>
		<tr> 
			<td colspan="5" height="3"> 
			<!--���� -->
			</td>
		</tr>
	</form>
	</table>
	<!--�����ڵ� �˻� �� -->
      
	<!--�����ڵ� ��� ���� -->
	<table width="500" border="0"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#FFFFFF" id="cdv_list_id">
    <form name="cdv_list_form" method="post" action="" >
        <input name="ciymgbcd" type="hidden" value ="">		<!--��������-->
        <input name="cicdgb" type="hidden" value ="">		<!--�ڵ屸��-->
        <input name="cicodeval" type="hidden" value ="">	<!--�ڵ尪-->
        
		<tr align="center" bgcolor="#dddddd" height="23"> 
			<td class="gray">�ڵ尪</td>
			<td width="190" class="gray">�ڵ��</td>
			<td width="100" class="gray">���</td>
			<td width="70"  class="gray">�׸�1</td>
			<td width="70"  class="gray">�׸�2</td>
		</tr>
		
        <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
        <%for(int i=0; i<cdvListCount; i++){%>		
		<tr height="23"> 
			<td class="gray">&nbsp;</td>
			<td class="gray" width="190">&nbsp;</td>
			<td class="gray" width="100">&nbsp;</td>
			<td class="gray" width="70" align="right">&nbsp;</td>
			<td class="gray" width="70" align="right">&nbsp;</td>
		</tr>
        <%}%>
        <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
		<tr bgcolor="#dddddd" > 
			<td height="23" colspan="5" align="right" class="gray">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� �� </b>
			</td>
		</tr>
	</form>		
	</table>
    <!-- ������ �̵� -->
    <table width="500" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="page_move">
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
                    <jsp:param name = "pagesize" 	value="<%= cdvListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- ������ �̵� -->
	<!--�����ڵ� ��� �� -->
    
    </td>
    <td width="540" valign="top"> 
      <!--�󼼳��� title -->
	<table width="100%" border="0"  cellpadding="1" cellspacing="0" align="center">
		<tr> 
		  <td  height="25" bgcolor="#EBE9DC" class="title">�����ڵ� �󼼳���</td>
		  <td  height="25" bgcolor="#EBE9DC" class="title" width="70" align="right">(<font color="red">*</font> 
		    �ʼ��׸�)</td>
		</tr>
		<tr> 
		  <td height="3" colspan="2"> 
		    <!--����-->
		  </td>
		</tr>
	</table>
      
	<!--�����ڵ� �� ����-->
	<table width="100%" border="0" cellpadding="1" cellspacing="0" class="gray" bgcolor="#FFFFFF" id="cdv_detail_id">
    <form name="cdv_detail_form" method="post" action="" >
        <input name="accflag" type="hidden" value ="I">		<!--���,����,���� ���� -->
		<tr height="23"> 
			<td width="60" bgcolor="#dddddd" class="gray" > ��������<font color="red">*</font></td>
			<td class="gray"><strong> 
			<input name="ciymgbcd" type="text" size="8" class="text_box" notEmpty>
			</strong></td>
		</tr>
		<tr> 
			<td bgcolor="#dddddd" class="gray"> ���</td>
			<td class="gray"  height="95"> 
<%
	time2 += "\nXRW OUT \t : "+ getTime();
	//rxw.add(initData, "defaultDate", time1 + ds.timeCheck + time11 + time2); // �ð�üũ
	System.out.println("=====XRW OUT TIME======: " + time2);
%>
				<textarea name="ciremarks" style="ime-mode:active;" cols="60" rows="20" class="scroll1" id="ciremarks_id"><%=time1 + ds.timeCheck + time11 + time2%></textarea>
			</td>
		</tr>
	</form>		
	</table>
	<!--�����ڵ� �� ��-->
	
	<table width="100%" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
	<tr> 
	  	<td align="center" height="2"> 
	    <!--����-->
	  	</td>
	</tr>
	<tr> 
	  	<td align="center" height="24" bgcolor="#E8E8E8"> 
			<input type="image" src="/html/comm_img/bu_new.gif" width="39" height="19" align="absmiddle" border="0" onclick="add()" border="0">
			<input type="image" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" onclick="save()" border="0">
			<input type="image" src="/html/comm_img/bu_del.gif" width="39" height="19" align="absmiddle" border="0" onclick="del()" border="0">
			<input id="cancel_id" type="image" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" border="0" onclick="cancel()" border="0">
		</td>
	</tr>
	</table>
    </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>


