<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : sls_top.jsp
* ��� : ���� ����
* �ۼ����� : 2004-01-01
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� : sls_top.jsp���� ����ڸ� �ѱ۱����� �κ� ������ ���� ��Ű�� �̿�
* ������ : ��뼷
* �������� : 2004-11-28
* ������ϸ� : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : main.jsp���� cookie�� ���� ���� ����ڸ��� sls_top.jsp���� ��⸦ �̿��Ͽ� session�� ����
* ������ : ��뼷
* �������� : 2004-12-23
* ������ϸ� : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : �ѱ۱������� �ذ�� ���� cookie -> header�� ��ȯ
* ������ : ��뼷
* �������� : 2005-03-05
* ������ϸ� : ����
---------------------------------------------------------------------------------------------------%>
<%
// 20041128 ��뼷 ���� sls_top.jsp���� ����ڸ� �ѱ۱����� �κ� ������ ���� ��Ű�� �̿�
// String emp_nm = (String)session.getAttribute("emp_nm");

// 20041223 ��뼷 ���� main.jsp���� cookie�� ���� ���� ����ڸ��� sls_top.jsp���� ��⸦ �̿��Ͽ� session�� ����
//	String emp_nm		= getCookieParameterValue(request, "EMP_NM", false);
//	session.setAttribute("emp_nm"		,emp_nm    	);      // ����

//20050309 ��뼷 ����		
	String emp_nm = (String)session.getAttribute("emp_nm");
	
	
%>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
//popup �ǽð����� �󼼺���
function annc_detail_view(url, seq) {
    var lo_form1    = document.annc_form;

    var ls_win      = "scrollbars=yes,toolbar=no,location=no,directories=no,width=500, height=300 resizable=no,mebar=no,left=140,top=50";
    window.open("about:blank" , "annc_pop", ls_win);

    lo_form1.seq.value = seq;
    lo_form1.target = "annc_pop";
    lo_form1.action = url;
    lo_form1.submit();
}

function fnChangeCMPY(chgval)
{
  if( chgval == "100" ) {
    document.all.annc_form.seljobcd.disabled = false;
    return;
  } else {
    document.all.annc_form.seljobcd.disabled = true;
  }

  top.conFrame.location.href = "sessionchg.jsp?chgcmpycd=" + chgval + "&chgjobcd=" + "100";
}

function fnChangeJOBCD(chgval)
{
//   var chgcmpycd = document.all.annc_form.selcmpycd.value;
//   top.conFrame.location.href = "sessionchg.jsp?chgcmpycd=" + chgcmpycd + "&chgjobcd=" + chgval;
   top.conFrame.location.href = "sessionchg.jsp?chgjobcd=" + chgval;
}

-->
</script>
</head>

<body bgcolor="#FFFFFF" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" onload="">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr> 
    <td width="1000">
     
	<table width=1000 border=0 cellpadding=0 cellspacing=0>
	<form name="annc_form"><!--�ǽð����� �󼼸� ���� ��-->
		<input type="hidden" name="seq" value="">
		<tr> 
			<td> <a href="/ss/share/2200" target="conFrame" onclick="top.leftFrame.document.location.reload();"><img src="/html/comm_img/sls_top1_01.gif" width=160 height=55 alt=""></a></td>
			<td> <img src="/html/comm_img/sls_top1_02.gif" width=143 height=55 alt=""></td>
			<td> <img src="/html/comm_img/sls_top1_03.gif" width=106 height=55 alt=""></td>
			<td> <img src="/html/comm_img/sls_top1_04.gif" width=116 height=55 alt=""></td>
			<td> <img src="/html/comm_img/sls_top1_05.gif" width=261 height=55 alt=""></td>
			<td width="214" background="/html/comm_img/sls_top1_06.gif" align="right" valign="bottom">
<%--20050109 ��뼷 �߰�(���Ȯ�� ��ũ)--%>
			<a href="http://morningplus.chosun.com/ss/service/extn/1150" target="_blank"><font color="#66CCFF"><b>���Ȯ����</b></font></a>&nbsp;<font color="#66CCFF">|</font>			
			<a href="http://mail.chosun.com/" target="_blank"><font color="#66CCFF"><b>��������</b></font></a>
			<br>
			<font color="#D8E8C0"><b><%= emp_nm%></b></font><font color="#FFFF00"> �����</font>&nbsp;&nbsp;<font color="#FFFF00">|</font>
			<a href="/logout.jsp"><font color="#FFFF00">�α׾ƿ�</font></a>&nbsp;&nbsp;<font color="#FFFF00">|</font>
			<a href="/html/help/salesdept.htm" target="_blank"><font color="#FFFF00">����</font></a>
<%
    if( session.getAttribute("uid").equals("i0212") ) {
%>
            <br><font color="#FFFF00"><b>�� ����:</b></font>
            <select name="seljobcd" style="width:78;" onchange="fnChangeJOBCD(this.value);">
               <option value="999"><%=session.getAttribute("uid")%></option>
               <option value="110">�Ǹű���</option>
               <option value="120">��������</option>
               <option value="310">��������</option>
               <option value="320">�������</option>
			</select>
<%  }   %>			
			</td>
		</tr>
	</form>
	</table>
		
<!--"CONVERTED_APPLET"-->
<!-- HTML CONVERTER -->
<OBJECT 
    classid = "clsid:8AD9C840-044E-11D1-B3E9-00805F499D93"
    codebase = "http://java.sun.com/products/plugin/autodl/jinstall-1_4-windows-i586.cab#Version=1,4,0,0"
    WIDTH = "100%" HEIGHT = "20" >
    <PARAM NAME = CODE VALUE = "TickerApplet.class" >
    <PARAM NAME = CODEBASE VALUE = "/html" >
    <PARAM NAME = "type" VALUE = "application/x-java-applet;version=1.4">
    <PARAM NAME = "scriptable" VALUE = "false">
    <PARAM NAME = "jobcd" VALUE="<%=session.getAttribute("jobcd")%>">
    <PARAM NAME = "cmpycd" VALUE="<%=session.getAttribute("cmpycd")%>">
    <PARAM NAME = "uid" VALUE="<%=session.getAttribute("uid")%>">
    <PARAM NAME = "areacd" VALUE="<%=session.getAttribute("areacd")%>">
    <PARAM NAME = "dealdeptcd" VALUE="<%=session.getAttribute("dealdeptcd")%>">
    <PARAM NAME = "deptcd" VALUE="<%=session.getAttribute("deptcd")%>">
    <PARAM NAME = "selldeptcd" VALUE="<%=session.getAttribute("selldeptcd")%>">

    <COMMENT>
	<EMBED 
            type = "application/x-java-applet;version=1.4" 
            CODE = "TickerApplet.class"
            JAVA_CODEBASE = "/html"
            WIDTH = "100%"
            HEIGHT = "20" 
            jobcd ="<%=session.getAttribute("jobcd")%>"
            cmpycd ="<%=session.getAttribute("cmpycd")%>"
            uid ="<%=session.getAttribute("uid")%>"
            areacd ="<%=session.getAttribute("areacd")%>"
            dealdeptcd ="<%=session.getAttribute("dealdeptcd")%>"
            deptcd ="<%=session.getAttribute("deptcd")%>"
            selldeptcd ="<%=session.getAttribute("selldeptcd")%>" 
	    scriptable = false 
	    pluginspage = "http://java.sun.com/products/plugin/index.html#download">
	    <NOEMBED>
            
            </NOEMBED>
	</EMBED>
    </COMMENT>
</OBJECT>

<!--
<APPLET CODE = "TickerApplet.class" JAVA_CODEBASE = "/html" WIDTH = "100%" HEIGHT = "20">
<PARAM NAME = "jobcd" VALUE="<%=session.getAttribute("jobcd")%>">
<PARAM NAME = "cmpycd" VALUE="<%=session.getAttribute("cmpycd")%>">
<PARAM NAME = "uid" VALUE="<%=session.getAttribute("uid")%>">
<PARAM NAME = "areacd" VALUE="<%=session.getAttribute("areacd")%>">
<PARAM NAME = "dealdeptcd" VALUE="<%=session.getAttribute("dealdeptcd")%>">
<PARAM NAME = "deptcd" VALUE="<%=session.getAttribute("deptcd")%>">
<PARAM NAME = "selldeptcd" VALUE="<%=session.getAttribute("selldeptcd")%>">


</APPLET>
-->


<!--"END_CONVERTED_APPLET"-->
		
    </td>
    <td bgcolor="#0060A0">&nbsp;</td>
  </tr>
</table>
</body>
</html>
