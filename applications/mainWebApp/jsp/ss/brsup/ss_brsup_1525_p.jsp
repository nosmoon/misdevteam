<%@ page contentType="application/msword; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1525_p.jsp
* ��� : ��������-���غ���-���-�μ�
* �ۼ����� : 2004-04-10
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
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
	{font-family:����;
	panose-1:2 3 6 0 0 1 1 1 1 1;
	mso-font-alt:Batang;
	mso-font-charset:129;
	mso-generic-font-family:roman;
	mso-font-pitch:variable;
	mso-font-signature:-1342176593 1775729915 48 0 524447 0;}
@font-face
	{font-family:������;
	panose-1:2 11 6 0 0 1 1 1 1 1;
	mso-font-charset:129;
	mso-generic-font-family:modern;
	mso-font-pitch:variable;
	mso-font-signature:-1342176593 1775729915 48 0 524288 0;}
@font-face
	{font-family:"\@������";
	panose-1:2 11 6 0 0 1 1 1 1 1;
	mso-font-charset:129;
	mso-generic-font-family:modern;
	mso-font-pitch:variable;
	mso-font-signature:-1342176593 1775729915 48 0 524288 0;}
@font-face
	{font-family:"\@����";
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
	font-family:����;
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
<%--���� (�������ڸ� ����Ѵ�.)--%>
<p class=MsoNormal style='tab-stops:348.0pt'>
<span style='font-size:14.0pt;mso-bidi-font-size:12.0pt;font-family:������'>��<span lang=EN-US><span style="mso-spacerun: yes">&nbsp; </span>�� : LGȭ�纸�� �� ���ػ�������
<span style='mso-tab-count:1'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <%= Util.convertDate(Util.getDate(),".")%></span>
</p>

<p class=MsoNormal>
<span style='font-size:14.0pt;mso-bidi-font-size:12.0pt;font-family:������'>��<span lang=EN-US><span style="mso-spacerun: yes">&nbsp; </span>�� : �����Ϻ��� �Ǹ�������<o:p></o:p></span></span></p>

<p class=MsoNormal>
<span style='font-size:14.0pt;mso-bidi-font-size:12.0pt;font-family:������'>��<span lang=EN-US><span style="mso-spacerun: yes">&nbsp; </span>�� : ������ �뺸<o:p></o:p></span></span></p>

<p class=MsoNormal>
<span lang=EN-US style='font-size:14.0pt;mso-bidi-font-size:12.0pt;font-family:������'><![if !supportEmptyParas]>&nbsp;<![endif]><o:p></o:p></span></p>

<p class=MsoNormal>
<span lang=EN-US style='font-size:14.0pt;mso-bidi-font-size:12.0pt;font-family:������'><span style="mso-spacerun:yes">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span></span>
<span style='font-size:12.0pt;font-family:������'>�ͻ��� ������ ������ �ǽ��� ���ϴ�<span lang=EN-US>. �Ʒ��� ���� ���� �Ǹ�<o:p></o:p></span></span></p>

<p class=MsoNormal>
<span style='font-size:12.0pt;font-family:������'>������ �������� �뺸�Ͽ��������Ͻð� ��ó �ٶ��ϴ�<span lang=EN-US>.<o:p></o:p></span></span></p>

<p class=MsoNormal style='text-indent:36.0pt'>
<span lang=EN-US style='font-size:12.0pt;font-family:������'><![if !supportEmptyParas]>&nbsp;<![endif]><o:p></o:p></span></p>

<p class=MsoNormal style='text-indent:36.0pt'>
<span lang=EN-US style='font-size:12.0pt;font-family:������'>
<span style="mso-spacerun:yes">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span>___��<span style="mso-spacerun: yes">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>��___<o:p></o:p></span></p>

<p class=MsoNormal>
<%-- ������� --%>
<span lang=EN-US style='font-size:12.0pt;font-family:������'>1.��<span style="mso-spacerun: yes">&nbsp;&nbsp; </span>��: <%= ds.getFlnm()%><o:p></o:p></span></p>

<p class=MsoNormal style='text-indent:18.0pt'>
<span lang=EN-US style='font-size:12.0pt;font-family:������'><![if !supportEmptyParas]>&nbsp;<![endif]><o:p></o:p></span></p>

<p class=MsoNormal>
<%-- �ֹε�Ϲ�ȣ --%>
<span lang=EN-US style='font-size:12.0pt;font-family:������'>2.�ֹε�Ϲ�ȣ: <%= Util.FormatJumin(ds.getPrn())%><o:p></o:p></span></p>

<p class=MsoNormal style='text-indent:18.0pt'>
<span lang=EN-US style='font-size:12.0pt;font-family:������'><![if !supportEmptyParas]>&nbsp;<![endif]><o:p></o:p></span></p>

<p class=MsoNormal>
<%-- ������ --%>
<span lang=EN-US style='font-size:12.0pt;font-family:������'>3.�Ҽ�����: <%= ds.getBonm()%><o:p></o:p></span></p>

<p class=MsoNormal style='text-indent:18.0pt'>
<span lang=EN-US style='font-size:12.0pt;font-family:������'><![if !supportEmptyParas]>&nbsp;<![endif]><o:p></o:p></span></p>

<p class=MsoNormal style='margin-left:.25gd;text-indent:-84.0pt;mso-char-indent-count:-7.0;mso-char-indent-size:12.0pt'>
<%-- ������ --%>
<span lang=EN-US style='font-size:12.0pt;font-family:������'>4. ��� ����: <%= ds.getCont()%><o:p></o:p></span></p>


<p class=MsoNormal><span lang=EN-US style='font-size:12.0pt;font-family:������'>
<span style="mso-spacerun:yes">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span><o:p></o:p></span></p>

<p class=MsoNormal><span lang=EN-US style='font-size:12.0pt;font-family:������'><![if !supportEmptyParas]>&nbsp;<![endif]><o:p></o:p></span></p>

<p class=MsoNormal style='text-indent:324.0pt;mso-char-indent-count:27.0;mso-char-indent-size:12.0pt'>
<span lang=EN-US style='font-size:12.0pt;font-family:������'>---��<span style="mso-spacerun: yes">&nbsp;&nbsp;&nbsp; </span>��---<o:p></o:p></span></p>

<p class=MsoNormal style='text-indent:36.0pt'>
<span lang=EN-US style='font-size:12.0pt;font-family:������'>
<span style="mso-spacerun:yes">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span><o:p></o:p></span></p>

<p class=MsoNormal style='text-indent:36.0pt;tab-stops:216.0pt'>
<span lang=EN-US style='font-size:16.0pt;mso-bidi-font-size:12.0pt;font-family:������'>
<span style="mso-spacerun:yes">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span><b><span style='font-size:18.0pt;mso-bidi-font-size:12.0pt;font-family:������'>�� �� �� �� ��<span lang=EN-US><o:p></o:p></span></span></b></p>

<p class=MsoNormal style='margin-right:-.68gd;text-indent:36.0pt;tab-stops:0cm 216.0pt'><b>
<span lang=EN-US style='font-size:18.0pt;mso-bidi-font-size:12.0pt;font-family:������'>
<span style="mso-spacerun:yes">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span>��
<span style="mso-spacerun: yes">&nbsp; </span>��
<span style="mso-spacerun: yes">&nbsp; </span>��
<span style="mso-spacerun: yes">&nbsp; </span>�� </span></b><b>
<span lang=EN-US style='font-size:14.0pt;mso-bidi-font-size:12.0pt;font-family:������'><o:p></o:p></span></b></p>

</div>

</body>
</html>