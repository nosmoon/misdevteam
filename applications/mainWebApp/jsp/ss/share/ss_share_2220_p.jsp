<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_2220_p.jsp
* ��� : �Ǹű�����-��������-��(�˾�)
* �ۼ����� : 2004-04-27
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%-- dataset �ν��Ͻ� ����κ�--%>
<%
	SS_S_ANNCDataSet ds = (SS_S_ANNCDataSet)request.getAttribute("ds");
%>


<html>
<head>
<title>��������</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
// �̺�Ʈ �ڵ鷯 �ʱ�ȭ
function jsInit(){
    setEventHandler();
    show_cont();
}

function show_cont() {
  //iframe�� ������ ��Ÿ�� readonly
//  alert(document.getElementById("dis_content").innerHTML);
  ifrm_cont.document.all.share_init_id.outerHTML = document.getElementById("dis_content").innerHTML;
}
-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginheight="0" class="scroll1" onload="jsInit()">
<table border="0" width="800" height="100%"  cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td valign="top">
        <div style="margin-top:0; margin-left:3;">
		<table width="100%" border="0"  cellpadding="1" cellspacing="0" align="center">
			<tr>
			  <td height="3">
			    <!--����-->
			  </td>
			</tr>
			<tr>
			  <td  height="25" bgcolor="#EBE9DC" class="title" align="center">:: �������� ::</td>
			</tr>
			<tr>
			  <td height="3">
			    <!--����-->
			  </td>
			</tr>
		</table>
		<!--�������� ���̺�-->
		<table border="0" width="795" class="gray" cellpadding="2" cellspacing="0" >
			<tr>
				<td class="gray" width="35" align="center" bgcolor="#dddddd" >��ȣ</td>
				<td class="gray" width="50" align="center" ><%= ds.getSeq()%></td>
				<td class="gray" width="60" align="center" bgcolor="#dddddd" >����</td>
				<td class="gray" width="380" align="center" ><%= Util.checkString(ds.getTitl())%></td>
				<td class="gray" align="center" width="60" bgcolor="#dddddd" >�ۼ���</td>
				<td class="gray" align="center" width="80" ><%= Util.checkString(ds.getMakepersnm())%></td>
				<td class="gray" align="center" width="60" bgcolor="#dddddd" >�������</td>
				<td class="gray" align="center" width="70" ><%= Util.convertS(ds.getRegdt())%></td>
			</tr>
			<%
			String cont = ds.getCont1() + ds.getCont2() + ds.getCont3() + ds.getCont4() + ds.getCont5();
            cont = Util.replace(cont, "_#_", "\"");
            cont = Util.replace(cont, "&lt;", "<" );
            cont = Util.replace(cont, "&gt;", ">" );
			%>
			<tr>
				<td class="gray" valign="top" width="795" height="468" align="left" colspan="8">
                  <div id="dis_content" style="display:none"><%=cont%></div>
                  <div id="ifrm_cont_div" style="margin-top:0;margin-bottom:0;">
                    <iframe class="gray" src="/html/share/ss_share_init.html" name="ifrm_cont" width="790" height="464" frameborder="0" marginheight="0" marginwidth="0" scrolling="auto" readonly></iframe>
                  </div>
				</td>
			</tr>
		</table>
		<!--�������� ���̺� ��-->
        </div>
  </tr>
  <tr>
    <td align="center" height="25" bgcolor="#dddddd"><a href="javascript:self.close();"><img src="/html/comm_img/bu_close.gif" width="49" height="19" border="0"></a></td>
  </tr>
</table>
</body>
</html>
