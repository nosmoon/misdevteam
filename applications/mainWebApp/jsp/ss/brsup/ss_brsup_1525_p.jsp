<%@ page contentType="application/msword; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1525_p.jsp
* 기능 : 지국지원-상해보험-사고-인쇄
* 작성일자 : 2004-04-10
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_INSRACCDDataSet ds = (SS_S_INSRACCDDataSet)request.getAttribute("ds");
%>
<html>
<head>
<style>
<!--
 /* Font Definitions */
@font-face
	{font-family:바탕;
	panose-1:2 3 6 0 0 1 1 1 1 1;
	mso-font-alt:Batang;
	mso-font-charset:129;
	mso-generic-font-family:roman;
	mso-font-pitch:variable;
	mso-font-signature:-1342176593 1775729915 48 0 524447 0;}
@font-face
	{font-family:새굴림;
	panose-1:2 11 6 0 0 1 1 1 1 1;
	mso-font-charset:129;
	mso-generic-font-family:modern;
	mso-font-pitch:variable;
	mso-font-signature:-1342176593 1775729915 48 0 524288 0;}
@font-face
	{font-family:"\@새굴림";
	panose-1:2 11 6 0 0 1 1 1 1 1;
	mso-font-charset:129;
	mso-generic-font-family:modern;
	mso-font-pitch:variable;
	mso-font-signature:-1342176593 1775729915 48 0 524288 0;}
@font-face
	{font-family:"\@바탕";
	panose-1:2 3 6 0 0 1 1 1 1 1;
	mso-font-charset:129;
	mso-generic-font-family:roman;
	mso-font-pitch:variable;
	mso-font-signature:-1342176593 1775729915 48 0 524447 0;}
 /* Style Definitions */
p.MsoNormal, li.MsoNormal, div.MsoNormal
	{mso-style-parent:"";
	margin:0cm;
	margin-bottom:.0001pt;
	text-align:justify;
	text-justify:inter-ideograph;
	mso-pagination:none;
	text-autospace:none;
	word-break:break-hangul;
	font-size:10.0pt;
	mso-bidi-font-size:12.0pt;
	font-family:바탕;
	mso-hansi-font-family:"Times New Roman";
	mso-bidi-font-family:"Times New Roman";
	mso-font-kerning:1.0pt;}
 /* Page Definitions */
@page
	{mso-page-border-surround-header:no;
	mso-page-border-surround-footer:no;}
@page Section1
	{size:595.3pt 841.9pt;
	margin:107.85pt 3.0cm 107.85pt 3.0cm;
	mso-header-margin:42.55pt;
	mso-footer-margin:49.6pt;
	mso-paper-source:0;
	layout-grid:18.0pt;}
div.Section1
	{page:Section1;}
-->
</style>
</head>

<body lang=KO style='tab-interval:40.0pt'>

<div class=Section1 style='layout-grid:18.0pt'>
<%--일자 (현재일자를 사용한다.)--%>
<p class=MsoNormal style='tab-stops:348.0pt'>
<span style='font-size:14.0pt;mso-bidi-font-size:12.0pt;font-family:새굴림'>수<span lang=EN-US><span style="mso-spacerun: yes">&nbsp; </span>신 : LG화재보험 ㈜ 손해사정부장
<span style='mso-tab-count:1'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <%= Util.convertDate(Util.getDate(),".")%></span>
</p>

<p class=MsoNormal>
<span style='font-size:14.0pt;mso-bidi-font-size:12.0pt;font-family:새굴림'>송<span lang=EN-US><span style="mso-spacerun: yes">&nbsp; </span>신 : 조선일보사 판매지원부<o:p></o:p></span></span></p>

<p class=MsoNormal>
<span style='font-size:14.0pt;mso-bidi-font-size:12.0pt;font-family:새굴림'>제<span lang=EN-US><span style="mso-spacerun: yes">&nbsp; </span>목 : 사고경위 통보<o:p></o:p></span></span></p>

<p class=MsoNormal>
<span lang=EN-US style='font-size:14.0pt;mso-bidi-font-size:12.0pt;font-family:새굴림'><![if !supportEmptyParas]>&nbsp;<![endif]><o:p></o:p></span></p>

<p class=MsoNormal>
<span lang=EN-US style='font-size:14.0pt;mso-bidi-font-size:12.0pt;font-family:새굴림'><span style="mso-spacerun:yes">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span></span>
<span style='font-size:12.0pt;font-family:새굴림'>귀사의 무궁한 발전과 건승을 빕니다<span lang=EN-US>. 아래와 같이 본보 판매<o:p></o:p></span></span></p>

<p class=MsoNormal>
<span style='font-size:12.0pt;font-family:새굴림'>가족의 사고경위를 통보하오니참조하시고 조처 바랍니다<span lang=EN-US>.<o:p></o:p></span></span></p>

<p class=MsoNormal style='text-indent:36.0pt'>
<span lang=EN-US style='font-size:12.0pt;font-family:새굴림'><![if !supportEmptyParas]>&nbsp;<![endif]><o:p></o:p></span></p>

<p class=MsoNormal style='text-indent:36.0pt'>
<span lang=EN-US style='font-size:12.0pt;font-family:새굴림'>
<span style="mso-spacerun:yes">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span>___아<span style="mso-spacerun: yes">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>래___<o:p></o:p></span></p>

<p class=MsoNormal>
<%-- 종사원명 --%>
<span lang=EN-US style='font-size:12.0pt;font-family:새굴림'>1.성<span style="mso-spacerun: yes">&nbsp;&nbsp; </span>명: <%= ds.getFlnm()%><o:p></o:p></span></p>

<p class=MsoNormal style='text-indent:18.0pt'>
<span lang=EN-US style='font-size:12.0pt;font-family:새굴림'><![if !supportEmptyParas]>&nbsp;<![endif]><o:p></o:p></span></p>

<p class=MsoNormal>
<%-- 주민등록번호 --%>
<span lang=EN-US style='font-size:12.0pt;font-family:새굴림'>2.주민등록번호: <%= Util.FormatJumin(ds.getPrn())%><o:p></o:p></span></p>

<p class=MsoNormal style='text-indent:18.0pt'>
<span lang=EN-US style='font-size:12.0pt;font-family:새굴림'><![if !supportEmptyParas]>&nbsp;<![endif]><o:p></o:p></span></p>

<p class=MsoNormal>
<%-- 지국명 --%>
<span lang=EN-US style='font-size:12.0pt;font-family:새굴림'>3.소속지국: <%= ds.getBonm()%><o:p></o:p></span></p>

<p class=MsoNormal style='text-indent:18.0pt'>
<span lang=EN-US style='font-size:12.0pt;font-family:새굴림'><![if !supportEmptyParas]>&nbsp;<![endif]><o:p></o:p></span></p>

<p class=MsoNormal style='margin-left:.25gd;text-indent:-84.0pt;mso-char-indent-count:-7.0;mso-char-indent-size:12.0pt'>
<%-- 사고경위 --%>
<span lang=EN-US style='font-size:12.0pt;font-family:새굴림'>4. 사고 경위: <%= ds.getCont()%><o:p></o:p></span></p>


<p class=MsoNormal><span lang=EN-US style='font-size:12.0pt;font-family:새굴림'>
<span style="mso-spacerun:yes">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span><o:p></o:p></span></p>

<p class=MsoNormal><span lang=EN-US style='font-size:12.0pt;font-family:새굴림'><![if !supportEmptyParas]>&nbsp;<![endif]><o:p></o:p></span></p>

<p class=MsoNormal style='text-indent:324.0pt;mso-char-indent-count:27.0;mso-char-indent-size:12.0pt'>
<span lang=EN-US style='font-size:12.0pt;font-family:새굴림'>---이<span style="mso-spacerun: yes">&nbsp;&nbsp;&nbsp; </span>상---<o:p></o:p></span></p>

<p class=MsoNormal style='text-indent:36.0pt'>
<span lang=EN-US style='font-size:12.0pt;font-family:새굴림'>
<span style="mso-spacerun:yes">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span><o:p></o:p></span></p>

<p class=MsoNormal style='text-indent:36.0pt;tab-stops:216.0pt'>
<span lang=EN-US style='font-size:16.0pt;mso-bidi-font-size:12.0pt;font-family:새굴림'>
<span style="mso-spacerun:yes">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span><b><span style='font-size:18.0pt;mso-bidi-font-size:12.0pt;font-family:새굴림'>조 선 일 보 사<span lang=EN-US><o:p></o:p></span></span></b></p>

<p class=MsoNormal style='margin-right:-.68gd;text-indent:36.0pt;tab-stops:0cm 216.0pt'><b>
<span lang=EN-US style='font-size:18.0pt;mso-bidi-font-size:12.0pt;font-family:새굴림'>
<span style="mso-spacerun:yes">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span>판
<span style="mso-spacerun: yes">&nbsp; </span>매
<span style="mso-spacerun: yes">&nbsp; </span>국
<span style="mso-spacerun: yes">&nbsp; </span>장 </span></b><b>
<span lang=EN-US style='font-size:14.0pt;mso-bidi-font-size:12.0pt;font-family:새굴림'><o:p></o:p></span></b></p>

</div>

</body>
</html>