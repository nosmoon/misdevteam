<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ page import="somo.framework.util.*,somo.framework.lib.*,chosun.ciis.ss.sls.brmgr.ds.*,chosun.ciis.ss.sls.brmgr.dm.*,chosun.ciis.ss.sls.brmgr.rec.*,chosun.ciis.ss.sls.brmgr.servlet.*"%>
<html>
<link rel="stylesheet" href="/css/style_sheet.css" type="text/css">
<head>

	<script language="javascript">
		<!--
		parent.mainbody.style.cursor = "DEFAULT";
		parent.idwaiting.style.display = "none";
		//-->
	</script>		

	<script language="javascript">
		<!--	
			function openReaderDetailView01(i) {
				 var detailForm = eval("document.detailForm"+i);
			   var arr = new Array();
			   arr[0] = eval("document.detailForm"+i+".bocd"+i).value;
			   arr[1] = eval("document.detailForm"+i+".rdr_no"+i).value;
			   arr[2] = "";
			   var date = new Date();
			   var popid = "RDRDETAILPOP" + date.getTime();	//id �ߺ��� ���ϱ� ���� timestamp
			   
			   var prop = "left:140px; top:50px; width:935px; height:570px;";
			   var url = "/xrw/ss/reader/sl_reader_1100_a.xrw";
			   //window.load(url, "modeless", popid, prop);
			   window.load(url, "modeless", popid, prop);
			   
			   window.children(popid).window.javaScript.setPostParameter(arr);
			}			
		//-->
	</script>
		

</head>
<%
	ABC_L_AUTHRATIODTLDataSet ds = (ABC_L_AUTHRATIODTLDataSet)request.getAttribute("ds");
	String bocd = Util.Uni2Ksc(Util.checkString((String)request.getAttribute("bocd")));
%>
<body>
	<table width="490" border="1" cellspacing="0" cellpadding="0">
		<tr bgcolor="#EBE9DC">
			<td align="center" width="50">����</td>
			<td align="center" width="50">���س��</td>
			<td align="center" width="70">������</td>
			<td align="center" width="50">�ļ�</td>
			<td align="center" width="70">���ڹ�ȣ</td>
			<td align="center" width="50">������</td>
			<td align="center" width="150">�����̷�</td>
		</tr>
<% 	if (ds != null) {
			for(int i=0; i<ds.curauthratiodtl.size(); i++){
				ABC_L_AUTHRATIODTLCURAUTHRATIODTLRecord curauthratiodtlRec = (ABC_L_AUTHRATIODTLCURAUTHRATIODTLRecord)ds.curauthratiodtl.get(i);
%>
		<tr>
			<form name="detailForm<%=i%>" method="post">
				<td align="center" width="50"><%= (i+1)%></td>
				<td align="center" width="50"><%= curauthratiodtlRec.subsmappli%></td>
				<td align="center" width="70"><%= curauthratiodtlRec.bocd%></td>
				<td align="center" width="50"><%= curauthratiodtlRec.abc%></td>
				<td align="center" width="70"><%= curauthratiodtlRec.rdr_no%></td>
				<td align="center" width="50"><%= curauthratiodtlRec.valmm%></td>
				<td align="center" width="150"><%= curauthratiodtlRec.clamlist%></td>
			</form>
		</tr>
<%
	}
} else {
%>

		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
	  </tr>			
<% }
%>	
  </table>
</body>
</html>