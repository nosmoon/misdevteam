<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : sls_top.jsp
* 기능 : 메인 상위
* 작성일자 : 2004-01-01
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 : sls_top.jsp에서 사용자명 한글깨지는 부분 수정을 위해 쿠키를 이용
* 수정자 : 김대섭
* 수정일자 : 2004-11-28
* 백업파일명 : 없음
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : main.jsp에서 cookie를 얻지 못해 사용자명을 sls_top.jsp에서 쿠기를 이용하여 session에 저장
* 수정자 : 김대섭
* 수정일자 : 2004-12-23
* 백업파일명 : 없음
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 한글깨짐현상 해결로 인한 cookie -> header로 전환
* 수정자 : 김대섭
* 수정일자 : 2005-03-05
* 백업파일명 : 없음
---------------------------------------------------------------------------------------------------%>
<%
// 20041128 김대섭 수정 sls_top.jsp에서 사용자명 한글깨지는 부분 수정을 위해 쿠키를 이용
// String emp_nm = (String)session.getAttribute("emp_nm");

// 20041223 김대섭 수정 main.jsp에서 cookie를 얻지 못해 사용자명을 sls_top.jsp에서 쿠기를 이용하여 session에 저장
//	String emp_nm		= getCookieParameterValue(request, "EMP_NM", false);
//	session.setAttribute("emp_nm"		,emp_nm    	);      // 성명

//20050309 김대섭 수정		
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
//popup 실시간공지 상세보기
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
	<form name="annc_form"><!--실시간공지 상세를 위한 폼-->
		<input type="hidden" name="seq" value="">
		<tr> 
			<td> <a href="/ss/share/2200" target="conFrame" onclick="top.leftFrame.document.location.reload();"><img src="/html/comm_img/sls_top1_01.gif" width=160 height=55 alt=""></a></td>
			<td> <img src="/html/comm_img/sls_top1_02.gif" width=143 height=55 alt=""></td>
			<td> <img src="/html/comm_img/sls_top1_03.gif" width=106 height=55 alt=""></td>
			<td> <img src="/html/comm_img/sls_top1_04.gif" width=116 height=55 alt=""></td>
			<td> <img src="/html/comm_img/sls_top1_05.gif" width=261 height=55 alt=""></td>
			<td width="214" background="/html/comm_img/sls_top1_06.gif" align="right" valign="bottom">
<%--20050109 김대섭 추가(사원확장 링크)--%>
			<a href="http://morningplus.chosun.com/ss/service/extn/1150" target="_blank"><font color="#66CCFF"><b>사원확장등록</b></font></a>&nbsp;<font color="#66CCFF">|</font>			
			<a href="http://mail.chosun.com/" target="_blank"><font color="#66CCFF"><b>편지마을</b></font></a>
			<br>
			<font color="#D8E8C0"><b><%= emp_nm%></b></font><font color="#FFFF00"> 사용중</font>&nbsp;&nbsp;<font color="#FFFF00">|</font>
			<a href="/logout.jsp"><font color="#FFFF00">로그아웃</font></a>&nbsp;&nbsp;<font color="#FFFF00">|</font>
			<a href="/html/help/salesdept.htm" target="_blank"><font color="#FFFF00">도움말</font></a>
<%
    if( session.getAttribute("uid").equals("i0212") ) {
%>
            <br><font color="#FFFF00"><b>※ 업무:</b></font>
            <select name="seljobcd" style="width:78;" onchange="fnChangeJOBCD(this.value);">
               <option value="999"><%=session.getAttribute("uid")%></option>
               <option value="110">판매국장</option>
               <option value="120">지원부장</option>
               <option value="310">영업부장</option>
               <option value="320">영업담당</option>
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
