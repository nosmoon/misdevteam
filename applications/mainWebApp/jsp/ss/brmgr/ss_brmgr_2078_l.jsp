<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ page import="somo.framework.util.*,chosun.ciis.ss.sls.brmgr.ds.*,chosun.ciis.ss.sls.brmgr.dm.*,chosun.ciis.ss.sls.brmgr.rec.*,chosun.ciis.ss.sls.brmgr.servlet.*"%>
<html>
<head>
<title>ABC ���� �μ�</title>
<link rel="stylesheet" href="/css/style_sheet.css" type="text/css">
<script language="javascript">
	<!--
	function checkForm() {
		var searchForm = document.searchForm;
		if (searchForm.basi_yy.value == '' && searchForm.basi_dt.value == '') {
				alert("�����(4�ڸ�) OR ���س��(6�ڸ�)�� �Է��ϼ���.");
				searchForm.basi_dt.focus();
				return;
		}
		if (searchForm.bocd.value == '') {
				alert("�����ڵ�(5�ڸ�)�� �Է��ϼ���.");
				searchForm.bocd.focus();
				return;
		}

		if(mainbody.style.cursor == "wait") {
			alert("��ȸ ���Դϴ�.");
			return;
		} else {
			mainbody.style.cursor="wait";
			idwaiting.style.display= "block";
		}
		
		searchForm.target = "_abc_frame";
		//searchForm.target = "_blank";
		searchForm.action = "/ss/brmgr/2078";
		searchForm.submit();		
	}
	
	document.onkeypress = enterKey;
	
	function enterKey()
	{
	    var key = event.keyCode;
	  
	    if( key == "13" ){ 
	    	 if (document.searchForm.basi_dt.value =="" || document.searchForm.rdr_no.value== "")
	    	 		listForm();
	    	 else
		        checkForm();     // �ش� �޼ҵ� ȣ��
	    }
	}	

	function listForm() {
		var searchForm = document.searchForm;
		if (searchForm.bocd.value == '') {
				alert("�����ڵ�(5�ڸ�)�� �Է��ϼ���.");
				searchForm.bocd.focus();
				return;
		}
		if(mainbody.style.cursor == "wait") {
			alert("��ȸ ���Դϴ�.");
			return;
		} else {
			mainbody.style.cursor="wait";
			idwaiting.style.display= "block";
		}
		searchForm.target = "_abclist_frame";
		searchForm.action = "/ss/brmgr/2080";
		searchForm.submit();
	}

	function excelForm01() {
		
		var searchForm = document.searchForm;
		if (searchForm.basi_yy.value == '' && searchForm.basi_dt.value == '') {
				alert("�����(4�ڸ�) OR ���س��(6�ڸ�)�� �Է��ϼ���.");
				searchForm.basi_dt.focus();
				return;
		}
		if (searchForm.bocd.value == '') {
				alert("�����ڵ�(5�ڸ�)�� �Է��ϼ���.");
				searchForm.bocd.focus();
				return;
		}

		if(mainbody.style.cursor == "wait") {
			alert("��ȸ ���Դϴ�.");
			return;
		}
		
		//searchForm.target = "_abc_frame";
		searchForm.paramTitle.value = "ABC ���� ���";
		searchForm.paramHeader.value = "���س��|������|�������|1�ļ�|2�ļ�|3�ļ�|4�ļ�|5�ļ�|6�ļ�|�Ұ�|7�ļ��̻�|�̼�|����������|�Ұ�|�Ѻμ�|ABC ����������";
		
		searchForm.ptype.value = "0";
		searchForm.target = "_blank";
		searchForm.action = "/ss/brmgr/2082";
		searchForm.submit();		
	}
	
	function excelForm02() {
		var searchForm = document.searchForm;
		if (searchForm.bocd.value == '') {
				alert("�����ڵ�(5�ڸ�)�� �Է��ϼ���.");
				searchForm.bocd.focus();
				return;
		}
		if(mainbody.style.cursor == "wait") {
			alert("��ȸ ���Դϴ�.");
			return;
		}

		if(mainbody.style.cursor == "wait") {
			alert("��ȸ ���Դϴ�.");
			return;
		}
		
		searchForm.paramTitle.value = "ABC ���� ���� ����Ʈ";
		searchForm.paramHeader.value = "����|������|���ڹ�ȣ|���ڸ�|������|�۾���ȣ|�۾��ڵ�|���������̷�|��������̷�|�������|��ǥȮ������|��ȭ��ȣ|�޴���|�Ǳ����ݾ�|���αݾ�";

		//searchForm.target = "_abc_frame";
		searchForm.ptype.value = "1";
		searchForm.target = "_blank";
		searchForm.action = "/ss/brmgr/2083";
		searchForm.submit();		
	}

	function dtlListForm(category) {
		var searchForm = document.searchForm;
		if (searchForm.basi_dt.value == '') {
				alert("���س��(6�ڸ�)�� �Է��ϼ���.");
				searchForm.basi_dt.focus();
				return;
		}
		if (searchForm.bocd.value == '') {
				alert("�����ڵ�(5�ڸ�)�� �Է��ϼ���.");
				searchForm.bocd.focus();
				return;
		}

		searchForm.abcclsf.value = category;
		
		if(mainbody.style.cursor == "wait") {
			alert("��ȸ ���Դϴ�.");
			return;
		} else {
			mainbody.style.cursor="wait";
			idwaiting.style.display= "block";
		}
		
		searchForm.target = "_abclist_frame";
		searchForm.action = "/ss/brmgr/2081";
		searchForm.submit();	
	}
		
	function openWin(category, winname) {
		if (category == '7')
			url = "/ss/brmgr/2081?bocd="+document.searchForm.bocd.value+"&basi_dt="+document.searchForm.basi_dt.value+"&abcclsf=7";
		else
			url = "/ss/brmgr/2081?bocd="+document.searchForm.bocd.value+"&basi_dt="+document.searchForm.basi_dt.value+"&abcclsf=99";
			
		windows.open(url, winname, "");
	}
	-->
</script>
</head>

<body id = "mainbody" leftmargin="0" topmargin="10" marginwidth="0" marginheight="0" onLoad="document.searchForm.basi_yy.focus();">
	<form name="searchForm" method="post" action="">
		<input type="hidden" name="ptype" value="">
		<table  border="0" cellspacing="2" cellpadding="2">
			<tr>
				<td width="5" rowspan="2">&nbsp;</td>
				<td height="30" width="50" align="center">���⵵</td>
				<td width="100">
					<input name="basi_yy" type="text"   class="input"  style="ime-mode:disabled;background-color:#EBE9DC" size="10" maxlength="4" tabIndex="1" caption="���⵵" >
				</td>
				<td height="30" width="50" align="center">���س��</td>
				<td width="100">
					<input name="basi_dt" type="text"   class="input"  style="ime-mode:disabled;background-color:#EBE9DC" size="10" maxlength="6" tabIndex="2" caption="���س��" >
				</td>
				<td height="30" width="50" align="center">�����ڵ�</td>
				<td width="100">
					<input name="bocd"    type="text"   class="input"  style="ime-mode:disabled;background-color:#EBE9DC" size="10" maxlength="5" tabIndex="3" caption="�����ڵ�" >
				</td>
			  <!--td>&nbsp;</td>
			  <td>&nbsp;</td-->
			  
				<td width="300" align="left"><input type="button"  class="btn08" onclick="checkForm();window.event.returnValue=false;" style="ime-mode:disabled;background-color:silver;cursor:hand" tabIndex="7" readonly value="  ��  ȸ  ">
							&nbsp;<input type="button" class="btn08" onclick="excelForm01();window.event.returnValue=false;" style="ime-mode:disabled;background-color:silver;cursor:hand;" tabIndex="8" readonly value=" �� �� ">
							&nbsp;<input type="button" class="btn08" onclick="dtlListForm('7');window.event.returnValue=false;" style="ime-mode:disabled;background-color:silver;cursor:hand;" tabIndex="9" readonly value="7�ļ��̻�">
							&nbsp;<input type="button" class="btn08" onclick="dtlListForm('99');window.event.returnValue=false;" style="ime-mode:disabled;background-color:silver;cursor:hand;" tabIndex="10" readonly value="�̼�">
				</td>
			</tr>
			<tr>
				<td height="30" align="center">������</td>
				<td width="100">
					<input name="subsmappli"    type="text"   class="input"  style="ime-mode:disabled;background-color:#EBE9DC" size="10" maxlength="6" tabIndex="4" caption="������"-->
				</td>
				<td height="30" align="center">�۾��ڵ�</td>
				<td width="100">
					<input name="wrkcode"    type="text"   class="input"  style="ime-mode:disabled;background-color:#EBE9DC" size="10" maxlength="3" tabIndex="5" caption="�۾��ڵ�" >
				</td>
				<td height="30" align="center">���ڹ�ȣ</td>
				<td width="100">
					<input name="rdr_no"    type="text"   class="input"  style="ime-mode:disabled;background-color:#EBE9DC" size="10" maxlength="9" tabIndex="6" caption="���ڹ�ȣ" >
				</td>
				<td align="left">
					<input type="button" class="btn08" onclick="listForm();window.event.returnValue=false;" style="ime-mode:disabled;background-color:silver;cursor:hand;" tabIndex="11" readonly value="���� ���� ����Ʈ">
					&nbsp;<input type="button" class="btn08" onclick="excelForm02();window.event.returnValue=false;" style="ime-mode:disabled;background-color:silver;cursor:hand;" tabIndex="12" readonly value=" �� �� ">
				</td>
			</tr>
		</table>	
		<input type="hidden" name="abcclsf">
		<input type="hidden" name="paramTitle" value="">			
		<input type="hidden" name="paramHeader" value="">
		
	</form>
	
<iframe id="_abc_frame" name="_abc_frame" width="1000" height="300" frameborder="1" src="/jsp/ss/brmgr/ss_brmgr_2079_l.jsp"></iframe>	
  
<p>
<iframe id="_abclist_frame" name="_abclist_frame" scrolling="auto" width="1240" height="435" frameborder="1" src="/jsp/ss/brmgr/ss_brmgr_2080_l.jsp"></iframe>	

<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name='hframe' width='0' height='0' frameborder='0' scrolling='no'></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
<div id="idwaiting" style='position:absolute;overflow:auto;display:none;border:0px;left:0;top:0;width=214;height=200'>
	<img src="/images/loadingBar.gif" width="214" height="200">
</div>

</body>
</html>		
		
