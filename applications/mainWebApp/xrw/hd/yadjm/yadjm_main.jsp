<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>2017�� ��������</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.style1 {font-size: 14px}
.style2 {
	color: #34518e;
	font-weight: bold;
}

.style3 {color: #ff0000;font-weight: bold;}
-->
</style>
</head>
<script type="text/javascript">
	
	openWindow = function(PathName,Width,Height,seq) {
        var winWidth = Width;  // ��â �ʺ�
        var winHeight = Height; // ��â ����
        var winPosLeft = (screen.width - winWidth)/2   // ��â Y ��ǥ
        var winPosTop = (screen.height - winHeight)/2 // ��â X ��ǥ
        var winOpt = "width="+winWidth+",height="+winHeight+",top="+winPosTop+",left="+winPosLeft;
        win = window.open(PathName ,seq ,winOpt + ",location=no,directories=no,resizable=yes,status=yes,toolbar=no,menubar=no,scrollbars=yes");
  }
  
  openWindow2 = function(PathName,Width,Height,seq) {
        var winWidth = Width;  // ��â �ʺ�
        var winHeight = Height; // ��â ����
        var winPosLeft = (screen.width - winWidth)/2    // ��â Y ��ǥ
        var winPosTop = (screen.height - winHeight)/2 // ��â X ��ǥ
        var winOpt = "width="+winWidth+",height="+winHeight+",top="+winPosTop+",left="+winPosLeft; //+ "location=no,directories=no,resizable=yes,status=yes,toolbar=no,menubar=no,scrollbars=yes";
	window.open("about:blank" ,"Yeonmal" ,winOpt + ",location=no,directories=no,resizable=yes,status=yes,toolbar=no,menubar=no,scrollbars=yes");

   
  document.formESS.target = "Yeonmal";
	document.formESS.action = "http://ess.chosun.com/common/jsp/ep.jsp";	
	document.formESS.url.value = PathName;
	//document.formESS.userId.value = UserID;
	//document.formESS.userPass.value = UserPW;	
	document.formESS.submit();        
	}
	
	openWindow3 = function(PathName,Width,Height,seq) {
        var winWidth = Width;  // ��â �ʺ�
        var winHeight = Height; // ��â ����
        var winPosLeft = (screen.width - winWidth)/2  // ��â Y ��ǥ
        var winPosTop = (screen.height - winHeight)/2 // ��â X ��ǥ
        
        
        var winOpt = "width="+winWidth+",height="+winHeight+",top="+winPosTop+",left="+winPosLeft; //+ "location=no,directories=no,resizable=yes,status=yes,toolbar=no,menubar=no,scrollbars=yes";
	window.open("http://ess.chosun.com/common/jsp/ep.jsp?url="+PathName ,"Yeonmal" ,winOpt + ",location=no,directories=no,resizable=yes,status=yes,toolbar=no,menubar=no,scrollbars=yes");

   
       
	}
	
	  
    function downloadFile(file_name, file_location) {
    	TaskFrame.location.href = "./downloadFile.jsp?file_name=" + file_name + "&file_location=" + file_location ;
 	}

</script>
<body >
<table width="740" height="640" border="0" cellpadding="0"
	cellspacing="0">
<tr>
		<td colspan="2"><img src="img/2018yeta_01.gif" width="740"
			height="112" /></td>
	</tr>
	<tr>
		<td height="63"><img src="img/2010yeta_02.gif" width="740" height="63"
			border="0" alt="�ҵ�������� �Է� �� �Ű� ���� �ȳ�" /></td>
  </tr>
	<tr>
		<td height="166"><img src="img/2010yeta_03_1.gif" width="740" height="166"
			border="0"  usemap="#Map" /></td>
  </tr> 
	<tr>
		<td height="30"> </td>
  </tr>
  
  <tr>
		<td height="145" border="0" style="padding-left:40px; line-height:25px;"><span class="style1"><strong>�����������</strong> :  <span class="style2">
		   �����Ϻ�, TV����, �̵� - 1.21(��) </span> </br>
			<strong>����μ�</strong> :  <span class="style2">�����Ϻ�-ȸ����, TV����-�繫��, �̵�-�濵������</span><br/>
            <strong>�Է±�����</strong> : �����Ϻ�, TV����, �̵� -<span class="style3"> 1.21(��)</span> <br/>
           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class="style3"> ��12�úη� �Է��� �� ������ ���� �ٶ�</span> <br/>
            <strong>���ǻ���/�г���û</strong> : �����Ϻ�-ȸ���� ������(5915), TV����-�繫�� ���̽�,������(1935,1937)<br/>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�̵�-�濵��å�� ���¹�(1404)<br/>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�ý��۹��� ������ �̰���(5975) / ����ȭ(5977)<br/></span>
			�� �Է±��� �� ������ ���Ͻô� ��� ���纰 ����ڿ��� ���� �ٶ��ϴ�.</td>
  </tr>  
	<tr>
		<td><img src="img/2018yeta_06.gif" width="740"
			height="102" border="0" usemap="#Map4" /></td>
  </tr>
</table>
 <map name="Map" id="Map">
<!--
<area shape="rect" coords="57,135,117,157" href="javascript:openWindow('http://ess.chosun.com/common/jsp/ep_adjm.jsp?url=/xrw/hd/yadjm/HD_16YADJM_1000.xrw',970,765,'yadjm1')"
		alt="�ڷ� �Է��ϱ�" onFocus="this.blur();">
	<area shape="rect" coords="245,134,306,157" href="javascript:openWindow('http://ess.chosun.com/common/jsp/ep.jsp?url=/xrw/hd/yadjm/HD_16YADJM_5301.xrw',970,765,'yadjm1')"
		alt="���� Ȯ���ϱ�" onFocus="this.blur();">
<area shape="rect" coords="437,133,497,156" href="javascript:openWindow('http://ess.chosun.com/common/jsp/ep_adjm.jsp?url=/xrw/hd/yadjm/HD_YADJM_5700.xrw',1000,800,'yadjm0')"
		alt="�Ű� ����ϱ�" onFocus="this.blur();"></map>
-->

<area shape="rect" coords="12,131,170,156" href="javascript:openWindow2('/xrw/hd/yadjm/HD_18YADJM_1000.xrw',970,800,'yadjm1')"
		alt="�Է�.����.�׸񺰱ݾ�Ȯ���ϱ�" onFocus="this.blur();">
	<area shape="rect" coords="228,132,324,158" href="javascript:openWindow2('/xrw/hd/yadjm/HD_18YADJM_5301.xrw',970,765,'yadjm1')"
		alt="���� Ȯ���ϱ�" onFocus="this.blur();">
<area shape="rect" coords="424,128,518,159" href="javascript:openWindow2('/xrw/hd/yadjm/HD_YADJM_5700.xrw',1000,800,'yadjm0')"
		alt="�Ű� ����ϱ�"  onFocus="this.blur();"></map>

<map name="Map4" id="Map4">
<area shape="rect" coords="30,33,249,71"
		href="javascript:openWindow('./detail3.html',1100,765,'yadjm3')"
		alt="2018�� �ͼ� �ٷμҵ� �������� �ȳ�" onFocus="this.blur();">
	<area shape="rect" coords="266,32,472,70"
		href="javascript:openWindow('./detail2.html',1010,765,'yadjm4')"
		alt="���⼭�� �� ���ǻ���" onFocus="this.blur();">
	<area shape="rect" coords="496,33,706,70"
		href="http://www.nts.go.kr/tax/tax_03.asp?cinfo_key=MINF7820100716140953&flag=03&menu_a=300&menu_b=100"
		target="nts" alt="����û �������� �ȳ� �ٷΰ���" onFocus="this.blur();">
</map>
<form name="fileForm" method="post" action="./downloadFile.jsp"><input
	type="hidden" name="FILENAME"></form>
<iframe name=TaskFrame id=TaskFrame style="display: none"></iframe>


<div class="divhidden">
<form name="formESS" method="post">
	<input type="hidden" name="url"> 
	<input type="hidden" name="userId">
	<input type="hidden" name="userPass">
</form>
</div>

</body>
</html>