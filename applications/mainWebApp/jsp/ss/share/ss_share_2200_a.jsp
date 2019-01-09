<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_2200_l.jsp
* 기능 : 판매국메인-초기화면
* 작성일자 : 2004-07-08
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_MAIN_INITDataSet ds = (SS_L_MAIN_INITDataSet)request.getAttribute("ds");
	int listCount = 5;	// 한 화면당 리스트 항목 수
	String jobcd = Util.getSessionParameterValue(request, "jobcd", false);	// 업무구분코드(판매국장,지원부장,영업부서장,영업담당만 확장및 불편 목록을 보여준다.)
%>

<html>
<head>
<title>판매국업무지원 시스템</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<style type="text/css">
<!--
.te {
	font-family: "굴림";
	font-size: 9pt;
	color: #6E6E6E;
}
-->
</style>
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
// 이벤트 핸들러 초기화
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
	setInputBackgroundColor();
	show_extnmove();
	show_dsct();
}

// 폼 유효성 체크
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

//popup 공지사항 상세보기
function infoexg_detail_view(seq,brwscnt) {
    var lo_form1    = document.main_form;

    var ls_win      = "scrollbars=no,toolbar=no,location=no,directories=no,width=800, height=550 resizable=no,mebar=no,left=150,top=200";
    window.open("about:blank" , "annc_pop", ls_win);

    lo_form1.seq.value = seq;
    lo_form1.brwscnt.value = brwscnt;
    lo_form1.target = "annc_pop";
    lo_form1.action = "/ss/share/2220";
    lo_form1.submit();
}

/*
//popup 실시간공지 상세보기
function annc_detail_view(seq) {
    var lo_form1    = document.main_form;

    var ls_win      = "scrollbars=yes,toolbar=no,location=no,directories=no,width=500, height=300 resizable=no,mebar=no,left=140,top=50";
    window.open("about:blank" , "annc_pop", ls_win);

    lo_form1.seq.value = seq;

    lo_form1.target = "annc_pop";
    lo_form1.action = "/ss/share/2230";
    lo_form1.submit();
}
*/

//공지사항 다운로드
function infoexg_dwload(seq,dwloadcnt) {
    var lo_form1 = document.main_form;

    // 시퀀스값을 "/ss/share/2222" 서블릿으로 보낸다
    lo_form1.seq.value = seq;
    lo_form1.dwloadcnt.value = dwloadcnt;

    lo_form1.target = "_self";

    lo_form1.action = "/ss/share/2222";
    lo_form1.submit();
}

/*
//확장이사 및 불편 통계 보이기
function show_extnmove_dsct(){

	//확장이사통계 보이기
	ifrm_extnmove.document.all.extnmove_id.outerHTML = document.all.extnmove_id.outerHTML;
	ifrm_extnmove.document.all.extnmove_id.style.display = 'inline';

	//불편 보이기
	ifrm_dsct.document.all.dsct_id.outerHTML = document.all.dsct_id.outerHTML;
	ifrm_dsct.document.all.dsct_id.style.display = 'inline';
}
*/

<%--판매국장,지원부장,영업부서장,영업담당만 보여준다.--%>
<%--if("110".equals(jobcd) || "120".equals(jobcd) || "310".equals(jobcd) || "320".equals(jobcd)){--%>
<% if( jobcd.indexOf("110") != -1 || jobcd.indexOf("120") != -1 || jobcd.indexOf("310") != -1 || jobcd.indexOf("320") != -1 ){%>
function show_extnmove(){

	//확장이사통계 보이기
	ifrm_extnmove.document.all.extnmove_id.outerHTML = document.all.extnmove_id.outerHTML;
	ifrm_extnmove.document.all.extnmove_id.style.display = 'inline';
}
function show_dsct(){

	//불편 보이기
	ifrm_dsct.document.all.dsct_id.outerHTML = document.all.dsct_id.outerHTML;
	ifrm_dsct.document.all.dsct_id.style.display = 'inline';
}
<%}else{%>
function show_extnmove(){
}
function show_dsct(){
}
<%}%>



-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsInit();">
<table width="100%" border="0" cellspacing="0" cellpadding="0" height="100%">
<tr>
<td valign="top" align="center" width="660"><br>

<%--기본이미지 출력 시작--%>
<% if( jobcd.indexOf("110") == -1 && jobcd.indexOf("120") == -1 && jobcd.indexOf("310") == -1 && jobcd.indexOf("320") == -1 ){%>

<table width="600" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td align="center"><img src="/html/comm_img/notice_img.jpg" width="600" height="210"></td>
  </tr>
</table>
<%}%>
<%--기본이미지 출력 끝--%>
<br>


	<table width="600" border="0" cellspacing="0" cellpadding="0">
	  <tr>
	    <td><p><img src="/html/comm_img/t01.gif" width="600" height="26"></p></td>
	  </tr>
	  <tr>
	    <td><table width="600" border="0" cellspacing="0" cellpadding="0">

			<form name="main_form" method="post" action="">
				<input type="hidden" name="seq" value="">
				<input type="hidden" name="brwscnt" value="">
				<input type="hidden" name="dwloadcnt" value="">  <!--다운로드수-->

			<%-- 공지사항 리스트 가져 오는 부분--%>
			<%
			for(int i=0; i<ds.mainlist.size(); i++){
				SS_L_MAIN_INITMAINLISTRecord rec = (SS_L_MAIN_INITMAINLISTRecord)ds.mainlist.get(i);%>
			<tr height="23">
				<td width="40" align="center"><font color="#FF6600">[<%=rec.getSeq()%>]</font></td>
				<td width="267">
					<a onClick="infoexg_detail_view('<%=rec.getSeq()%>','<%=rec.brwscnt%>');" style="cursor:hand;">
						<font color="blue">&nbsp;<%= Util.checkString(rec.titl)%> </font>
					</a>
				</td>

				<td width="150"><%= Util.checkString(rec.makepersnm)%>/<%= Util.checkString(rec.deptnm)%></td>
				<td width="80" align="center"><%= Util.Timestamp2Str(rec.regdt)%></td>
				<%if(!"".equals(rec.filenm)){%>
				<td width="50" align="center">
					<a onClick="infoexg_dwload('<%=rec.getSeq()%>','<%=rec.dwloadcnt%>');" style="cursor:hand;"><img src="/html/comm_img/bu_down.gif" width="40" height="14"></a>
				</td>
				<%}else{%>
				<td width="50" align="center">&nbsp;</td>
				<%}%>
			</tr>
	        <tr>
	          <td colspan="6" height="1" bgcolor="#CCCCCC"></td>
	        </tr>
			<%}%>

			<%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
			<%for(int i=0; i<(listCount-ds.mainlist.size()); i++){%>
			<tr height="23">
				<td width="40" align="center">&nbsp;</td>
				<td width="267">&nbsp;</td>
				<td width="150">&nbsp;</td>
				<td width="80" align="center">&nbsp;</td>
				<td width="50" align="center">&nbsp;</td>
			</tr>
	        <tr>
	          <td colspan="6" height="1" bgcolor="#CCCCCC"></td>
	        </tr>
			<%}%>
			</form>
	      	</table></td>
	  </tr>
	</table>

<br>
<%--확장이사통계목록 시작--%>
<%--판매국장,지원부장,영업부서장,영업담당만 보여준다.--%>
<% if( jobcd.indexOf("110") != -1 || jobcd.indexOf("120") != -1 || jobcd.indexOf("310") != -1 || jobcd.indexOf("320") != -1 ){%>
<table width="600" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td colspan="2"><p><img src="/html/comm_img/t02.gif" width="600" height="26"></p></td>
  </tr>
  <tr>
    <td width="448" align="left" height="26"><%= Util.convertS(Util.addDate(Util.getDate(), -1))%></td>
    <td width="152" height="26" align="center" class="te">* 신청부수(미확인)</td>
  </tr>
  <tr>
    <td colspan="2">
	<table width="100%" border="0" cellpadding="3" cellspacing="1" bgcolor="#CCCCCC">
		<tr align="center" bgcolor="#CBEEF3" class="te" height="25">
			<td width="69">&nbsp;</td>
			<td	width="49"><strong>자체</strong></td>
			<td	width="49"><strong>자진</strong></td>
			<td	width="48"><strong>이사</strong></td>
			<td	width="49"><strong>사원</strong></td>
			<td	width="48"><strong>품앗이</strong></td>
			<td	width="48"><strong>사이버</strong></td>
			<td	width="48"><strong>센터장</strong></td>
			<td	width="49"><strong>캠페인</strong></td>
			<td	width="*"><strong>합계</strong></td>
<%--
			<td width="70">&nbsp;</td>
			<td	width="100"><strong>지국</strong></td>
			<td	width="60"><strong>품앗이</strong></td>
			<td	width="78"><strong>사원</strong></td>
			<td	width="78"><strong>사이버</strong></td>
			<td	width="78"><strong>자진</strong></td>
			<td><strong>이사</strong></td>
--%>
		</tr>
	</table>
    	<iframe src="/html/share/ss_share_2200_extnmove.html" name="ifrm_extnmove" width="100%" height="128" frameborder="0" marginheight="0" marginwidth="0" scrolling="yes"></iframe>
    </td>
  </tr>
</table>
<br>
<%}%>
<%--확장이사통계목록 끝--%>

<%--불편목록 시작--%>
<%--판매국장,지원부장,영업부서장,영업담당만 보여준다.--%>
<% if( jobcd.indexOf("110") != -1 || jobcd.indexOf("120") != -1 || jobcd.indexOf("310") != -1 || jobcd.indexOf("320") != -1 ){%>
<table width="600" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td colspan="2"><p><img src="/html/comm_img/t03.gif" width="600" height="26"></p></td>
  </tr>
  <tr>
    <td width="448" align="left" height="26"><%= Util.convertS(Util.addDate(Util.getDate(), -1))%></td>
    <td width="152" height="26" align="center" class="te">* 접수건수(미확인)</td>
  </tr>
  <tr valign="top">
    <td colspan="2">
    <table width="100%" border="0" cellpadding="3" cellspacing="1" bgcolor="#CCCCCC">
        <tr align="center" bgcolor="#CBEEF3" class="te" height="25">
          <td width="75">&nbsp;</td>
          <td width="70"><strong>전체</strong></td>
          <td width="70"><strong>불착</strong></td>
          <td width="70"><strong>중지요청</strong></td>
          <td width="90"><strong>투입지거절</strong></td>
          <td width="70"><strong>항의</strong></td>
          <td><strong>기타</strong></td>
        </tr>
	</table>
    	<iframe src="/html/share/ss_share_2200_dsct.html" name="ifrm_dsct" width="100%" height="128" frameborder="0" vspace="0" marginheight="0" marginwidth="0" scrolling="yes"></iframe>
	</td>
  </tr>
</table>
<br>
<%}%>
<%--불편목록 끝--%>

</td>
<td valign="top" align="center" width="200" bgcolor="#DEDEDE"> <br>

<!--카렌다 시작-->
<iframe src="/ss/share/2210"  style="filter: Alpha(Opacity=100);" framespacing=0 scrolling=no frameborder=0 HEIGHT="180" WIDTH="190" BORDER="0" cellpadding=0 cellspacing=0>
이 메세지가 보이면 iframe을 지원하지 않는것입니다.
</iframe>
<!--카렌다 끝-->
<br>


<br>
    <td valign="top" align="center" bgcolor="#DEDEDE">&nbsp;</td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width=800 height=0></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
<!--확장이사통계를 위한 hidden 테이블-->
<table width="100%" border="0" cellpadding="3" cellspacing="1" bgcolor="#CCCCCC" id="extnmove_id" style="display:none;">
<%	int sum1 = 0;
	int sum2 = 0;
	int sum3 = 0;
	int sum4 = 0;
	int sum5 = 0;
	int sum6 = 0;
	int sum7 = 0;
	int sum8 = 0;
	int sumcnfm1 = 0;
	int sumcnfm2 = 0;
	int sumcnfm3 = 0;
	int sumcnfm4 = 0;
	int sumcnfm5 = 0;
	int sumcnfm6 = 0;
	int sumcnfm7 = 0;
	int sumcnfm8 = 0;
    int sumhorz = 0;
    int sumhorzcnfm = 0;
    int totsum = 0;
    int totsumcnfm = 0;

	for(int i=0; i<ds.extnmovmlist.size(); i++){
		SS_L_MAIN_INITEXTNMOVMLISTRecord extnmovmlistRec = (SS_L_MAIN_INITEXTNMOVMLISTRecord)ds.extnmovmlist.get(i);
		sum1 += extnmovmlistRec.ycnt10;
		sum2 += extnmovmlistRec.ycnt20;
		sum3 += extnmovmlistRec.ycnt30;
		sum4 += extnmovmlistRec.ycnt40;
		sum5 += extnmovmlistRec.ycnt50;
		sum6 += extnmovmlistRec.ycnt60;
		sum7 += extnmovmlistRec.ycnt70;
		sum8 += extnmovmlistRec.ycnt80;
		sumcnfm1 += extnmovmlistRec.ncnt10;
		sumcnfm2 += extnmovmlistRec.ncnt20;
		sumcnfm3 += extnmovmlistRec.ncnt30;
		sumcnfm4 += extnmovmlistRec.ncnt40;
		sumcnfm5 += extnmovmlistRec.ncnt50;
		sumcnfm6 += extnmovmlistRec.ncnt60;
		sumcnfm7 += extnmovmlistRec.ncnt70;
		sumcnfm8 += extnmovmlistRec.ncnt80;

        sumhorz = 0;
        sumhorzcnfm = 0;

        sumhorz = extnmovmlistRec.ycnt10 + extnmovmlistRec.ycnt20 + extnmovmlistRec.ycnt30 + extnmovmlistRec.ycnt40 + extnmovmlistRec.ycnt50 + extnmovmlistRec.ycnt60 + extnmovmlistRec.ycnt70 + extnmovmlistRec.ycnt80;
        sumhorzcnfm = extnmovmlistRec.ncnt10 + extnmovmlistRec.ncnt20 + extnmovmlistRec.ncnt30 + extnmovmlistRec.ncnt40 + extnmovmlistRec.ncnt50 + extnmovmlistRec.ncnt60 + extnmovmlistRec.ncnt70 + extnmovmlistRec.ncnt80;

        totsum += sumhorz;
        totsumcnfm += sumhorzcnfm;
%>
	<tr bgcolor="#FFFFFF">
		<td width="69" align="left" bgcolor="#F3F3F3" class="te"><font face="Arial Narrow,Arial" style="font-size:8;"><%= extnmovmlistRec.nm%></font></td>
<!--		<td width="75" align="left" bgcolor="#F3F3F3" class="te">&nbsp;<= extnmovmlistRec.nm></td>-->
		<td width="49" align="right" class="te"><font face="Arial" style="font-size:11;"><%= Util.comma(extnmovmlistRec.ycnt30)%>&nbsp;(<%= Util.comma(extnmovmlistRec.ncnt30)%>)</font></td><!--자체-->
		<td width="49" align="right" class="te"><font face="Arial" style="font-size:11;"><%= Util.comma(extnmovmlistRec.ycnt40)%>&nbsp;(<%= Util.comma(extnmovmlistRec.ncnt40)%>)</font></td><!--자진-->
		<td width="48" align="right" class="te"><font face="Arial" style="font-size:11;"><%= Util.comma(extnmovmlistRec.ycnt60)%>&nbsp;(<%= Util.comma(extnmovmlistRec.ncnt60)%>)</font></td><!--이사연결-->
		<td width="49" align="right" class="te"><font face="Arial" style="font-size:11;"><%= Util.comma(extnmovmlistRec.ycnt10)%>&nbsp;(<%= Util.comma(extnmovmlistRec.ncnt10)%>)</font></td><!--사원-->
		<td width="48" align="right" class="te"><font face="Arial" style="font-size:11;"><%= Util.comma(extnmovmlistRec.ycnt20)%>&nbsp;(<%= Util.comma(extnmovmlistRec.ncnt20)%>)</font></td><!--품앗이-->
		<td width="48" align="right" class="te"><font face="Arial" style="font-size:11;"><%= Util.comma(extnmovmlistRec.ycnt50)%>&nbsp;(<%= Util.comma(extnmovmlistRec.ncnt50)%>)</font></td><!--사이버확장-->
		<td width="48" align="right" class="te"><font face="Arial" style="font-size:11;"><%= Util.comma(extnmovmlistRec.ycnt70)%>&nbsp;(<%= Util.comma(extnmovmlistRec.ncnt70)%>)</font></td><!--사이버센터장-->
		<td width="49" align="right" class="te"><font face="Arial" style="font-size:11;"><%= Util.comma(extnmovmlistRec.ycnt80)%>&nbsp;(<%= Util.comma(extnmovmlistRec.ncnt80)%>)</font></td><!--사이버센터장-->
		<td width="*" bgcolor="#F3F3F3" align="right" class="te"><font face="Arial" style="font-size:11;"><%=sumhorz%>&nbsp;(<%=sumhorzcnfm%>)</font></td><!--켐페인-->
	</tr>
<%}%>
<%if(ds.extnmovmlist.size() == 0){%>
	<tr bgcolor="#FFFFFF" align="center"><td class="te">&nbsp;</td></tr>
	<tr bgcolor="#FFFFFF" align="center"><td class="te">&nbsp;</td></tr>
	<tr bgcolor="#FFFFFF" align="center"><td class="te">조회된 건이 없습니다.</td></tr>
	<tr bgcolor="#FFFFFF" align="center"><td class="te">&nbsp;</td></tr>
	<tr bgcolor="#FFFFFF" align="center"><td class="te">&nbsp;</td></tr>
<%}else{%>
	<tr bgcolor="#F3F3F3">
		<td align="left" bgcolor="#F3F3F3" class="te">&nbsp;계</td>
		<td align="right" class="te"><font face="Arial" style="font-size:11;"><%= Util.comma(sum3)%>&nbsp;(<%= Util.comma(sumcnfm3)%>)</font></td><!--자체-->
		<td align="right" class="te"><font face="Arial" style="font-size:11;"><%= Util.comma(sum4)%>&nbsp;(<%= Util.comma(sumcnfm4)%>)</font></td><!--자진-->
		<td align="right" class="te"><font face="Arial" style="font-size:11;"><%= Util.comma(sum6)%>&nbsp;(<%= Util.comma(sumcnfm6)%>)</font></td><!--이사연결-->
		<td align="right" class="te"><font face="Arial" style="font-size:11;"><%= Util.comma(sum1)%>&nbsp;(<%= Util.comma(sumcnfm1)%>)</font></td><!--사원-->
		<td align="right" class="te"><font face="Arial" style="font-size:11;"><%= Util.comma(sum2)%>&nbsp;(<%= Util.comma(sumcnfm2)%>)</font></td><!--품앗이-->
		<td align="right" class="te"><font face="Arial" style="font-size:11;"><%= Util.comma(sum5)%>&nbsp;(<%= Util.comma(sumcnfm5)%>)</font></td><!--사이버확장-->
		<td align="right" class="te"><font face="Arial" style="font-size:11;"><%= Util.comma(sum7)%>&nbsp;(<%= Util.comma(sumcnfm7)%>)</font></td><!--사이버센터-->
		<td align="right" class="te"><font face="Arial" style="font-size:11;"><%= Util.comma(sum8)%>&nbsp;(<%= Util.comma(sumcnfm8)%>)</font></td><!--캠페인-->
		<td align="right" class="te"><font face="Arial" style="font-size:11;"><%= Util.comma(totsum)%>(<%= Util.comma(totsumcnfm)%>)</font></td><!--합계-->
	</tr>
<%}%>
</table>

<!--불편을 위한 hidden 테이블-->
<table width="100%" border="0" cellpadding="3" cellspacing="1" bgcolor="#CCCCCC" id="dsct_id" style="display:none;">
<%	int tot1 = 0;
	int tot2 = 0;
	int tot3 = 0;
	int tot4 = 0;
	int tot5 = 0;
	int tot6 = 0;
	int totcnfm1 = 0;
	int totcnfm2 = 0;
	int totcnfm3 = 0;
	int totcnfm4 = 0;
	int totcnfm5 = 0;
	int totcnfm6 = 0;
	for(int i=0; i<ds.dsctlist.size(); i++){
		SS_L_MAIN_INITDSCTLISTRecord dsctlistRec = (SS_L_MAIN_INITDSCTLISTRecord)ds.dsctlist.get(i);
		tot1 += dsctlistRec.reg;
		tot2 += dsctlistRec.dscttypecd10;
		tot3 += dsctlistRec.dscttypecd20;
		tot4 += dsctlistRec.dscttypecd30;
		tot5 += dsctlistRec.dscttypecd40;
		tot6 += dsctlistRec.dscttypecd45;
		totcnfm1 += dsctlistRec.cnfm;
		totcnfm2 += dsctlistRec.dscttypecd10cnfm;
		totcnfm3 += dsctlistRec.dscttypecd20cnfm;
		totcnfm4 += dsctlistRec.dscttypecd30cnfm;
		totcnfm5 += dsctlistRec.dscttypecd40cnfm;
		totcnfm6 += dsctlistRec.dscttypecd45cnfm;
%>
	<tr bgcolor="#FFFFFF">
		<td width="75" align="left" bgcolor="#F3F3F3" class="te"><font face="Arial Narrow,Arial" style="font-size:9;"><%= dsctlistRec.nm%></font></td>
<!--		<td width="75" align="left" bgcolor="#F3F3F3" class="te">&nbsp;<= dsctlistRec.nm></td>-->
		<td width="70" align="right" class="te"><%= Util.comma(dsctlistRec.reg)%>&nbsp;(<%= Util.comma(dsctlistRec.cnfm)%>)&nbsp;</td>
		<td width="70" align="right" class="te"><%= Util.comma(dsctlistRec.dscttypecd10)%>&nbsp;(<%= Util.comma(dsctlistRec.dscttypecd10cnfm)%>)</td>
		<td width="70" align="right" class="te"><%= Util.comma(dsctlistRec.dscttypecd20)%>&nbsp;(<%= Util.comma(dsctlistRec.dscttypecd20cnfm)%>)</td>
		<td width="90" align="right" class="te"><%= Util.comma(dsctlistRec.dscttypecd30)%>&nbsp;(<%= Util.comma(dsctlistRec.dscttypecd30cnfm)%>)</td>
		<td width="70" align="right" class="te"><%= Util.comma(dsctlistRec.dscttypecd40)%>&nbsp;(<%= Util.comma(dsctlistRec.dscttypecd40cnfm)%>)</td>
		<td align="right" class="te"><%= Util.comma(dsctlistRec.dscttypecd45)%>&nbsp;(<%= Util.comma(dsctlistRec.dscttypecd45cnfm)%>)</td>
	</tr>
<%}%>
<%if(ds.dsctlist.size() == 0){%>
	<tr bgcolor="#FFFFFF" align="center"><td class="te">&nbsp;</td></tr>
	<tr bgcolor="#FFFFFF" align="center"><td class="te">&nbsp;</td></tr>
	<tr bgcolor="#FFFFFF" align="center"><td class="te">조회된 건이 없습니다.</td></tr>
	<tr bgcolor="#FFFFFF" align="center"><td class="te">&nbsp;</td></tr>
	<tr bgcolor="#FFFFFF" align="center"><td class="te">&nbsp;</td></tr>
<%}else{%>
	<tr bgcolor="#FFFFFF">
		<td width="75" align="left" bgcolor="#F3F3F3" class="te">&nbsp;계</td>
		<td width="70" align="right" class="te"><%= Util.comma(tot1)%>&nbsp;(<%= Util.comma(totcnfm1)%>)</td>
		<td width="70" align="right" class="te"><%= Util.comma(tot2)%>&nbsp;(<%= Util.comma(totcnfm2)%>)</td>
		<td width="70" align="right" class="te"><%= Util.comma(tot3)%>&nbsp;(<%= Util.comma(totcnfm3)%>)</td>
		<td width="90" align="right" class="te"><%= Util.comma(tot4)%>&nbsp;(<%= Util.comma(totcnfm4)%>)</td>
		<td width="70" align="right" class="te"><%= Util.comma(tot5)%>&nbsp;(<%= Util.comma(totcnfm5)%>)</td>
		<td align="right" class="te"><%= Util.comma(tot6)%>&nbsp;(<%= Util.comma(totcnfm6)%>)&nbsp;</td>
	</tr>
<%}%>
</table>
