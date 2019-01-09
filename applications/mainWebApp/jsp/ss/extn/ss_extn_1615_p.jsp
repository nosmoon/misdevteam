<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1615_p.jsp
* 기능 : 확장현황-사이버확장-목록 프린트
* 작성일자 : 2004-08-28
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_PROMSTAF_CYEXTN_PRINTDataSet ds = (SS_L_PROMSTAF_CYEXTN_PRINTDataSet)request.getAttribute("ds");
%>
<html>

<head>
<style>
<!--table
	{mso-displayed-decimal-separator:"\.";
	mso-displayed-thousand-separator:"\,";}
@page
	{margin:1.0in .75in 1.0in .75in;
	mso-header-margin:.5in;
	mso-footer-margin:.5in;}
tr
	{mso-height-source:auto;
	mso-ruby-visibility:none;}
col
	{mso-width-source:auto;
	mso-ruby-visibility:none;}
br
	{mso-data-placement:same-cell;}
.style0
	{mso-number-format:General;
	text-align:general;
	vertical-align:bottom;
	white-space:nowrap;
	mso-rotate:0;
	mso-background-source:auto;
	mso-pattern:auto;
	color:windowtext;
	font-size:11.0pt;
	font-weight:400;
	font-style:normal;
	text-decoration:none;
	font-family:돋움;
	mso-generic-font-family:auto;
	mso-font-charset:129;
	border:none;
	mso-protection:locked visible;
	mso-style-name:표준;
	mso-style-id:0;}
td
	{mso-style-parent:style0;
	padding-top:1px;
	padding-right:1px;
	padding-left:1px;
	mso-ignore:padding;
	color:windowtext;
	font-size:11.0pt;
	font-weight:400;
	font-style:normal;
	text-decoration:none;
	font-family:돋움;
	mso-generic-font-family:auto;
	mso-font-charset:129;
	mso-number-format:General;
	text-align:general;
	vertical-align:bottom;
	border:none;
	mso-background-source:auto;
	mso-pattern:auto;
	mso-protection:locked visible;
	white-space:nowrap;
	mso-rotate:0;}
.xl24
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\@";
	text-align:center;
	vertical-align:middle;
	border:.5pt solid windowtext;
	background:#CCFFCC;
	mso-pattern:auto none;}
.xl25
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\@";
	border:.5pt solid windowtext;
	background:#CCFFCC;
	mso-pattern:auto none;}
.xl26
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\@";
	text-align:center;
	vertical-align:middle;
	border:.5pt solid windowtext;}
.xl27
	{mso-style-parent:style0;
	font-size:16.0pt;
	font-weight:700;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\@";
	text-align:center;
	vertical-align:middle;}
.xl28
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\@";
	text-align:left;
	vertical-align:middle;
	border:.5pt solid windowtext;}
.xl29
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\@";
	text-align:left;
	border:.5pt solid windowtext;}
.xl30
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\@";
	text-align:left;
	border:.5pt solid windowtext;}
.xl31
	{mso-style-parent:style0;
	text-align:left;
	mso-number-format:"\@";
	border:.5pt solid windowtext;}
ruby
	{ruby-align:left;}
rt
	{color:windowtext;
	font-size:8.0pt;
	font-weight:400;
	font-style:normal;
	text-decoration:none;
	font-family:돋움, monospace;
	mso-font-charset:129;
	mso-char-type:none;
	display:none;}
-->
</style>

</head>

<body link=blue vlink=purple>

<table x:str border=0 cellpadding=0 cellspacing=0 width=1846 style='border-collapse:
 collapse;table-layout:fixed;width:1388pt'>
 <col width=88 style='mso-width-source:userset;mso-width-alt:2503;width:66pt'>
 <col width=114 span=2 style='mso-width-source:userset;mso-width-alt:3242;width:86pt'>
 <col width=94 style='mso-width-source:userset;mso-width-alt:2673;width:71pt'>
 <col width=80 style='width:60pt'>
 <col width=322 style='mso-width-source:userset;mso-width-alt:9159;width:242pt'>
 <col width=104 span=2 style='mso-width-source:userset;mso-width-alt:2958;width:78pt'>
 <col width=138 style='mso-width-source:userset;mso-width-alt:3925;width:104pt'>
 <col width=96 style='mso-width-source:userset;mso-width-alt:2730;width:72pt'>
 <col width=148 style='mso-width-source:userset;mso-width-alt:4209;width:111pt'>
 <col width=102 style='mso-width-source:userset;mso-width-alt:2901;width:77pt'>
 <col width=74 style='mso-width-source:userset;mso-width-alt:2104;width:56pt'>
 <col width=88 span=2 style='mso-width-source:userset;mso-width-alt:2503;width:66pt'>
 <col width=92 style='mso-width-source:userset;mso-width-alt:2616;width:69pt'>
<%--
 <tr height=27 style='height:20.25pt'>
  <td colspan=10 height=27 class=xl27 width=1254 style='height:20.25pt;
  width:943pt'>사이버요원 명단</td>
  <td class=xl27 width=148 style='width:111pt'></td>
  <td class=xl27 width=102 style='width:77pt'></td>
  <td class=xl27 width=74 style='width:56pt'></td>
  <td width=88 style='width:66pt'></td>
  <td width=88 style='width:66pt'></td>
  <td width=92 style='width:69pt'></td>
 </tr>
 <tr height=18 style='height:13.5pt'>
  <td height=18 class=xl24 style='height:13.5pt'>요원구분코드</td>
  <td height=18 class=xl24 style='height:13.5pt'>요원구분명</td>
  <td height=18 class=xl24 style='height:13.5pt'>요원번호</td>
  <td class=xl24 style='border-left:none'>주민번호</td>
  <td class=xl24 style='border-left:none'>사업자번호</td>
  <td class=xl24 style='border-left:none'>요원명</td>
  <td class=xl24 style='border-left:none'>우편번호</td>
  <td class=xl24 style='border-left:none'>주소</td>
  <td class=xl24 style='border-left:none'>전화번호</td>
  <td class=xl25 style='border-left:none'>휴대폰번호</td>
  <td class=xl25 style='border-left:none'>이메일</td>
  <td class=xl24 style='border-left:none'>계좌은행</td>
  <td class=xl24 style='border-left:none'>계좌번호</td>
  <td class=xl24 style='border-left:none'>예금주</td>
  <td class=xl24 style='border-left:none'>계약상태</td>
  <td class=xl24 style='border-left:none'>권유요원번호</td>
  <td class=xl24 style='border-left:none'>권유요원</td>
 </tr>
--%>
<%for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_PROMSTAF_CYEXTN_PRINTCURCOMMLISTRecord curcommlistRec = (SS_L_PROMSTAF_CYEXTN_PRINTCURCOMMLISTRecord)ds.curcommlist.get(i);%>

 <tr height=18 style='height:13.5pt'>
  <td height=18 class=xl28 style='height:13.5pt;border-top:none'><%= curcommlistRec.stafclsfcd%></td>
  <td height=18 class=xl28 style='height:13.5pt;border-top:none'><%= curcommlistRec.stafclsfnm%></td>
  <td height=18 class=xl28 style='height:13.5pt;border-top:none'><%= curcommlistRec.stafno%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= Util.FormatJumin(curcommlistRec.prn)%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= Util.FormatBiz(curcommlistRec.ernno)%></td>
  <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.stafnm%></td>
  <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.blngteamnm%></td>
  <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.stafclsfcd%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= Util.FormatZip(curcommlistRec.zip)%></td>
  <td class=xl29 style='border-top:none;border-left:none'><%= curcommlistRec.addr%></td>
  <td class=xl29 style='border-top:none;border-left:none'><%= curcommlistRec.dtlsaddr%></td>
  <td class=xl29 style='border-top:none;border-left:none'><%= Util.getChainStr(curcommlistRec.tel_no1, curcommlistRec.tel_no2, curcommlistRec.tel_no3, "-")%></td>
  <td class=xl29 style='border-top:none;border-left:none'><%= Util.getChainStr(curcommlistRec.ptph_no1, curcommlistRec.ptph_no2, curcommlistRec.ptph_no3, "-")%></td>
  <td class=xl29 style='border-top:none;border-left:none'><%= curcommlistRec.email%></td>
  <td class=xl30 style='border-top:none;border-left:none'><%= curcommlistRec.acctbank%></td>
  <td class=xl30 style='border-top:none;border-left:none'><%= curcommlistRec.acctno%></td>
  <td class=xl30 style='border-top:none;border-left:none'><%= curcommlistRec.acctdeps_pers%></td>
  <td class=xl30 style='border-top:none;border-left:none'><%= curcommlistRec.in_cmpydt%></td>
  <td class=xl31 style='border-top:none;border-left:none'><%= curcommlistRec.cnvsstafno%></td>
  <td class=xl31 style='border-top:none;border-left:none'><%= curcommlistRec.cnvsstafnm%></td>
 </tr>
<%}%>

</table>

</body>

</html>
