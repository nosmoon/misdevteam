<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1900_a.jsp
* ��� : ��������-����-���Ͼ��ε�-����EDI
* �ۼ����� : 2008-05-14
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    int wrkListCount = 5;		// �� ȭ��� ����Ʈ �׸� ��
    int wrkdtlListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��(����)
    applySession = true;		// ���� ���� ����

%>
<%--
	SS_L_WRKHIST_INITDataSet ds = (SS_L_WRKHIST_INITDataSet)request.getAttribute("ds");
--%>
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
	document.wrk_search_form.id.focus();
}

// �� ��ȿ�� üũ
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// �۾��̷� ��Ϻ���
function list_search(){
    var lo_form1 = document.wrk_search_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
	lo_form1.pageno.value = '1';									// ��������ȣ �ʱ�ȭ

	lo_form1.action = "/ss/admin/1440";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �۾����� ��Ϻ���
function detail_search(id, execno){
    var lo_form1 = document.wrk_list_form;
    lo_form1.id.value = id;
    lo_form1.execno.value = execno;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
	lo_form1.pageno.value = '1';									// ��������ȣ �ʱ�ȭ
	lo_form1.action = "/ss/admin/1445";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ������ �̵�(�۾��̷�)
function page_move_hsty(pageno) {
    var lo_form1 = document.wrk_search_form;

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }
    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
    // �۾��̷¸�� ��ȸ������ "/ss/admin/1440" �������� ������
	lo_form1.action = "/ss/admin/1440";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ������ �̵�(�۾�����)
function page_move_ptcr(pageno) {
    var lo_form1 = document.wrk_list_form;

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }
    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // �۾�������� ��ȸ������ "/ss/admin/1445" �������� ������
	lo_form1.action = "/ss/admin/1445";
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
	for(i=1; i<lo_table.rows.length; i++){
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

function deleteFiles(){
	var lo_form1 = document.wrk_search_form;
 
  lo_form1.action = "/jsp/ss/upload/delete.jsp";
  lo_form1.target = "ifrm";
  lo_form1.submit();
}

function ediUpload(){
	var lo_form1 = document.wrk_search_form;
   lo_form1.action = "/ss/brsup/1901";
  lo_form1.target = "ifrm";
  lo_form1.submit();
}

-->
</script>

</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" class="title1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td class="gray" height="10">&nbsp;</td>
  </tr>
</table>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >��������
      &gt; </b> ���� &gt; ���ϼۼ��� &gt; ����EDI </td>
  </tr>
  <tr>
    <td class="gray" height="10">
      <!--������ ���� ����-->
    </td>
  </tr>
</table>




<table width="830" border="0" align="center" cellpadding="2" cellspacing="0">
	<tr>
		<td bgcolor="#EBE9DC" class="title">EDI���� ����</td>
	</tr>
	<tr>
		<td class="gray" height="3" colspan="5">
		<!--����-->
		</td>
	</tr>
</table>

<table width="830" border="0" cellspacing="0" cellpadding="1" align="center" bgcolor="#ffffff" class="gray" height="180">
	<tr bgcolor="#dddddd" align="center" height="23">
		<td width="400" class="gray">������ ���� ����</td>
		<td width="430" class="gray">���� �Ϸ�� ����</td>
	</tr>	
	<tr bgcolor="#dddddd">
		<td><iframe src="/html/brsup/upload.html" name="ifrm_upload"  width="400" height="200" frameborder="0" cellspacing="0" cellpadding="0" scrolling="no"></iframe></td>
		<td width="430">
			<table cellpadding="0" cellspacing="0" class="gray" bgcolor="#ffffff" align="left" id="file_list_id">
				<tr>
					<td colspan="2">
							<iframe src="/jsp/ss/upload/Filelist.jsp" name="ifrm_filelist"  width="430" height="127" frameborder="0" cellspacing="0" cellpadding="0" scrolling="auto"></iframe>
			 		</td>
			 	</tr>
				<tr>
					<td class="gray" height="14">
					<!--����-->
					</td>
				</tr>
				<tr height = "25">
						<td bgcolor="#ebe9dc" align="left">
							&nbsp;<input type="image" id="send_button1" src="/html/comm_img/bu_del.gif" width="36" height="19" align="absmiddle" onclick="deleteFiles();" border="0" >&nbsp;
						</td>	
						<td bgcolor="#ebe9dc" align="right">
							<input type="image" id="send_button2" src="/html/comm_img/bu_save02.gif" width="36" height="19" align="absmiddle" onclick="ediUpload();" border="0" >&nbsp;
						</td>							
				</tr>			 	
				<tr>
					<td class="gray" height="34">
					<!--����-->
					</td>
				</tr>				
			</table>
		</td>
	</tr>
</table>
<br>

<!--�۾��̷� �˻� ���� -->
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<form name="wrk_search_form" method="post" action="" style="display:none;">
    <input name="pageno" type="hidden" value ="1">			                	<!-- ���� ������ ��ȣ -->
    <input name="pagesize" type="hidden" value ="<%= wrkListCount%>">	    	<!-- �� ȭ��� ����Ʈ �׸� �� -->
    <input name="js_fn_nm" type="hidden" value ="page_move_hsty">
    <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� -->
    <input name="wrkListCount" type="hidden" value ="<%= wrkListCount%>">   <!-- ���� ���� ���� -->
    <input name="wrkdtlListCount" type="hidden" value ="<%= wrkdtlListCount%>">   <!-- ���� ���� ���� -->
	<tr>
		<td bgcolor="#EBE9DC" width="60" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���̵�</td>
		<td bgcolor="#EBE9DC" class="title" width="200" align="left">
		<input name="id" type="text" size="15" class="text_box">
<%--
            <select id="id" name="id" class="sel_all">
               <option selected value="">��ü</option>
               <%=ds.wrklistOptHtml("")%>
            </select>
--%>            

		</td>
		<td bgcolor="#EBE9DC" class="title" width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��������</td>
		<td width="*" bgcolor="#EBE9DC" class="title">
            <input name="frdt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="�����������" dataType="date">
            -
            <input name="todt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="������������" dataType="date">
		</td>
		<td width="152"  bgcolor="#EBE9DC" class="title" align="right">
			<input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="javascript:list_search();window.event.returnValue=false;" border="0" >
		</td>
	</tr>
	<tr>
		<td class="gray" height="3" colspan="5">
		<!--����-->
		</td>
	</tr>
</form>
</table>
<!--�۾��̷� �˻� �� -->

<!--�۾��̷� ��� ���� -->
<table width="830"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" align="center" id="wrk_list_id">
<form name="wrk_list_form" method="post" action="">
    <input name="pageno" type="hidden" value ="1">			                <!-- ���� ������ ��ȣ -->
    <input name="pagesize" type="hidden" value ="<%= wrkListCount%>">	    <!-- �� ȭ��� ����Ʈ �׸� �� -->
    <input name="js_fn_nm" type="hidden" value ="page_move_ptcr">
		<input name="wrkdtlListCount" type="hidden" value ="<%= wrkdtlListCount%>">   <!-- ���� ���� ���� -->    	
	<input name="id" type="hidden" value ="">                    			<!-- ���̵� -->
	<input name="execno" type="hidden" value ="">                    		<!-- �۾���ȣ -->

	<tr bgcolor="#dddddd" align="center" height="23">
		<td width="35" class="gray">ID</td>
		<td width="200" class="gray">����</td>
		<td width="120" class="gray">�����Ͻ�</td>
		<td width="120" class="gray">�����Ͻ�</td>
		<td width="60" class="gray">������</td>
		<td class="gray">�۾����</td>
	</tr>

    <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
    <%for(int i=0; i<wrkListCount; i++){%>
    <tr>
		<td width="35" class="gray">&nbsp;</td>
		<td width="200" class="gray">&nbsp;</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="60" class="gray">&nbsp;</td>
		<td class="gray">&nbsp;</td>
    </tr>
    <%}%>
    <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
	<tr bgcolor="#dddddd" align="right">
		<td colspan="6" height="23" class="gray">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� �� </b>
		</td>
	</tr>
</form>
</table>
<!--�۾��̷� ��� �� -->

<!-- ������ �̵� -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="page_move_hsty">
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
                <jsp:param name = "js_fn_nm" 	value="page_move_hsty"/>
                <jsp:param name = "pagesize" 	value="<%= wrkdtlListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
        </jsp:include>
        <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- ������ �̵� -->

<br>
<table width="830" border="0" align="center" cellpadding="2" cellspacing="0">
	<tr>
		<td bgcolor="#EBE9DC" class="title">�۾� ����</td>
	</tr>
	<tr>
		<td class="gray" height="3" colspan="5">
		<!--����-->
		</td>
	</tr>
</table>

<!-- �۾� ���� ��� ���� -->
<table width="830"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" align="center" id="wrk_detail_id">
	<tr bgcolor="#dddddd" align="center" height="23">
		<td width="100" class="gray">�۾�����</td>
		<td width="120" class="gray">�ð�(����/����)</td>
		<td width="140" class="gray">���̺�(�ҽ�/Ÿ��)</td>
		<td width="110" class="gray">������(����/��ȯ)</td>
		<td class="gray">����(�ڵ�/�޼���)</td>
	</tr>
    <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
    <%for(int i=0; i<wrkdtlListCount; i++){%>
	<tr align="center">
		<td width="100" rowspan="2" class="gray">&nbsp;</td>
		<td width="120" class="gray">&nbsp;</td>
		<td width="140" class="gray">&nbsp;</td>
		<td width="110" class="gray">&nbsp;</td>
		<td rowspan="2" class="gray">&nbsp;</td>
	</tr>
	<tr align="center">
		<td width="120" class="gray">&nbsp;</td>
		<td width="140" class="gray">&nbsp;</td>
		<td width="110" class="gray">&nbsp;</td>
	</tr>
    <%}%>
    <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
	<tr bgcolor="#dddddd" height="23">
		<td colspan="5" class="gray" align="right">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� �� </b>
		</td>
	</tr>
</table>
<!-- �۾� ���� ��� �� -->

<!-- ������ �̵� -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2"  align="center" id="page_move_ptcr">
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
                <jsp:param name = "js_fn_nm" 	value="page_move_ptcr"/>
                <jsp:param name = "pagesize" 	value="<%= wrkdtlListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
        </jsp:include>
        <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- ������ �̵� -->

<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
