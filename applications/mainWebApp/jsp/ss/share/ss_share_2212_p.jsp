<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_2212_p.jsp
* ��� : �Ǹű�����-�޷�-�Ϻ�����
* �ۼ����� : 2004-04-27
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    SS_L_DAY_SCHEDataSet ds = (SS_L_DAY_SCHEDataSet)request.getAttribute("ds");    // request dataset
    String select_day = request.getParameter("yyyymmdd");
%>
<html>
<head>
<title>����</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">

// �̺�Ʈ �ڵ鷯 �ʱ�ȭ
function jsInit(){
    setEventHandler();
}
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginheight="0" class="scroll1" onload="jsInit()">
<table width="580" height="100%"  cellspacing="2" cellpadding="2" align="center">
<tr> 
	<td valign="top">
	
		<table width="100%" border="0"  cellpadding="1" cellspacing="0" align="center">
			<tr> 
			  <td height="3"> 
			    <!--����-->
			  </td>
			</tr>
			<tr> 
			  <td  height="25" bgcolor="#EBE9DC" class="title"><%=Util.convertS(select_day)%>���� ���� ����</td>
			</tr>			  
			<tr> 
			  <td height="3"> 
			    <!--����-->
			  </td>
			</tr>
		</table>
		
		<%--���� ����� ������ ���--%>
		<%if(ds.dayschecur.size()>0){%>
	      
			<table width="100%" class="gray" cellpadding="2" cellspacing="0" >
				<tr>
					<td class="gray" width="70" align="center" bgcolor="#dddddd"> ���� </td>
					<td class="gray" width="70" align="center" bgcolor="#dddddd"> �׸� </td>
					<td class="gray" width="70" align="center" bgcolor="#dddddd"> ������ </td>
					<td class="gray" width="70" align="center" bgcolor="#dddddd"> ������ </td>
					<td class="gray" bgcolor="#dddddd" align="center" > ���� </td>
				</tr>
				<%for(int i=0 ; i< ds.dayschecur.size(); i++){
					SS_L_DAY_SCHEDAYSCHECURRecord rec = (SS_L_DAY_SCHEDAYSCHECURRecord)ds.dayschecur.get(i);%>
				<tr> 
					<td class="gray" width="70" align="center"><%=rec.schemangunitcd_nm%>&nbsp;</td>
					<td class="gray" width="70" align="center"><%=rec.schemangitemcd_nm%>&nbsp;</td>
					<td class="gray" width="70" align="center"><%=Util.convertS(rec.frdt)%>&nbsp;</td>
					<td class="gray" width="70" align="center"><%=Util.convertS(rec.todt)%>&nbsp;</td>
					<td class="gray" align="left" ><%=rec.remk%>&nbsp;</td>
				</tr>
				<%}%>
			</table>

		<%--���� ����� �������� ���� ���--%>
		<%}else{%>
			<table width ="100%" height="200" >
				<tr> 
					<td align="center"><b><font color="#FF6600">��ϵ� ������ �����ϴ�</font></b></td>
				</tr>
			</table>
		<%}%> 
	</td>	
	     
</tr>
<tr>
	<td align="center" height="25" bgcolor="#dddddd"><a href="javascript:self.close();"><img src="/html/comm_img/bu_close.gif" width="49" height="19" border="0"></a></td>
</tr>
</table>
</body>
</html>