<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>2017년 연말정산</title>
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
        var winWidth = Width;  // 새창 너비
        var winHeight = Height; // 새창 높이
        var winPosLeft = (screen.width - winWidth)/2   // 새창 Y 좌표
        var winPosTop = (screen.height - winHeight)/2 // 새창 X 좌표
        var winOpt = "width="+winWidth+",height="+winHeight+",top="+winPosTop+",left="+winPosLeft;
        win = window.open(PathName ,seq ,winOpt + ",location=no,directories=no,resizable=yes,status=yes,toolbar=no,menubar=no,scrollbars=yes");
  }
  
  openWindow2 = function(PathName,Width,Height,seq) {
        var winWidth = Width;  // 새창 너비
        var winHeight = Height; // 새창 높이
        var winPosLeft = (screen.width - winWidth)/2    // 새창 Y 좌표
        var winPosTop = (screen.height - winHeight)/2 // 새창 X 좌표
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
        var winWidth = Width;  // 새창 너비
        var winHeight = Height; // 새창 높이
        var winPosLeft = (screen.width - winWidth)/2  // 새창 Y 좌표
        var winPosTop = (screen.height - winHeight)/2 // 새창 X 좌표
        
        
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
			border="0" alt="소득공제사항 입력 및 신고서 제출 안내" /></td>
  </tr>
	<tr>
		<td height="166"><img src="img/2010yeta_03_1.gif" width="740" height="166"
			border="0"  usemap="#Map" /></td>
  </tr> 
	<tr>
		<td height="30"> </td>
  </tr>
  
  <tr>
		<td height="145" border="0" style="padding-left:40px; line-height:25px;"><span class="style1"><strong>서류제출기한</strong> :  <span class="style2">
		   조선일보, TV조선, 미디어렙 - 1.21(월) </span> </br>
			<strong>제출부서</strong> :  <span class="style2">조선일보-회계팀, TV조선-재무팀, 미디어렙-경영지원팀</span><br/>
            <strong>입력기한일</strong> : 조선일보, TV조선, 미디어렙 -<span class="style3"> 1.21(월)</span> <br/>
           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class="style3"> 밤12시부로 입력할 수 없으니 주의 바람</span> <br/>
            <strong>문의사항/분납신청</strong> : 조선일보-회계팀 조병연(5915), TV조선-재무팀 최이슬,정문영(1935,1937)<br/>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;미디어렙-경영정책팀 진승범(1404)<br/>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;시스템문의 전산팀 이가연(5975) / 전상화(5977)<br/></span>
			※ 입력기한 후 수정을 원하시는 경우 각사별 담당자에게 연락 바랍니다.</td>
  </tr>  
	<tr>
		<td><img src="img/2018yeta_06.gif" width="740"
			height="102" border="0" usemap="#Map4" /></td>
  </tr>
</table>
 <map name="Map" id="Map">
<!--
<area shape="rect" coords="57,135,117,157" href="javascript:openWindow('http://ess.chosun.com/common/jsp/ep_adjm.jsp?url=/xrw/hd/yadjm/HD_16YADJM_1000.xrw',970,765,'yadjm1')"
		alt="자료 입력하기" onFocus="this.blur();">
	<area shape="rect" coords="245,134,306,157" href="javascript:openWindow('http://ess.chosun.com/common/jsp/ep.jsp?url=/xrw/hd/yadjm/HD_16YADJM_5301.xrw',970,765,'yadjm1')"
		alt="세액 확인하기" onFocus="this.blur();">
<area shape="rect" coords="437,133,497,156" href="javascript:openWindow('http://ess.chosun.com/common/jsp/ep_adjm.jsp?url=/xrw/hd/yadjm/HD_YADJM_5700.xrw',1000,800,'yadjm0')"
		alt="신고서 출력하기" onFocus="this.blur();"></map>
-->

<area shape="rect" coords="12,131,170,156" href="javascript:openWindow2('/xrw/hd/yadjm/HD_18YADJM_1000.xrw',970,800,'yadjm1')"
		alt="입력.수정.항목별금액확인하기" onFocus="this.blur();">
	<area shape="rect" coords="228,132,324,158" href="javascript:openWindow2('/xrw/hd/yadjm/HD_18YADJM_5301.xrw',970,765,'yadjm1')"
		alt="세액 확인하기" onFocus="this.blur();">
<area shape="rect" coords="424,128,518,159" href="javascript:openWindow2('/xrw/hd/yadjm/HD_YADJM_5700.xrw',1000,800,'yadjm0')"
		alt="신고서 출력하기"  onFocus="this.blur();"></map>

<map name="Map4" id="Map4">
<area shape="rect" coords="30,33,249,71"
		href="javascript:openWindow('./detail3.html',1100,765,'yadjm3')"
		alt="2018년 귀속 근로소득 연말정산 안내" onFocus="this.blur();">
	<area shape="rect" coords="266,32,472,70"
		href="javascript:openWindow('./detail2.html',1010,765,'yadjm4')"
		alt="제출서류 및 유의사항" onFocus="this.blur();">
	<area shape="rect" coords="496,33,706,70"
		href="http://www.nts.go.kr/tax/tax_03.asp?cinfo_key=MINF7820100716140953&flag=03&menu_a=300&menu_b=100"
		target="nts" alt="국세청 연말정산 안내 바로가기" onFocus="this.blur();">
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