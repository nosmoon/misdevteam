<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_share_1806_s.jsp
* 기능 : 정보공유 게시판 공지사항 상세보기
* 작성일자 : 2004-04-24
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%-- dataset 인스턴스 선언부분--%>
<%
    PS_S_INFOEXGDataSet ds_detail = (PS_S_INFOEXGDataSet)request.getAttribute("ds_detail");  // request dataset
    PS_S_SEPBKDataSet ds = (PS_S_SEPBKDataSet)request.getAttribute("ds");    // request dataset
%>

<html>
<head>
<title>공지사항</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
// 이벤트 핸들러 초기화
function jsInit(){
    setEventHandler();
	setInputBackgroundColor();
}

// form 단위로 유효성을 검증한 예제
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

//게시판 공지사항 다운로드
function infoexg_dwload(seq,dwloadcnt) {
    var lo_form1 = document.infoexg_view_form;

    // 시퀀스값을 "/ps/share/1360" 서블릿으로 보낸다
    lo_form1.seq.value = seq;
    lo_form1.dwloadcnt.value = dwloadcnt;
    lo_form1.target = "ifrm";
    lo_form1.action = "/ps/share/1811";
    lo_form1.submit();
}
-->
</script>
<SCRIPT language="javascript" For="jw" Event="OnjwDoccomplete()">
    document.all.jw.BodyHTML = document.getElementById("dis_content").innerHTML;
</SCRIPT>
</head>
<body bgcolor="#F8F7F7" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1" onload="jsInit()">
<!---%를 위한 큰테이블 start-->
<table width="100%" border="0" cellspacing="0" cellpadding="0" height="100%">
  <tr>
    <td height="50">
<!---title table-->
      <table width="100%"  height="50" cellpadding="0" cellspacing="0" >
        <tr>
          <td  height="7">
            <!-----상위여백-- -->
          </td>
        </tr>
        <tr>
          <td width="100%" height="33" colspan="3" align="center">
            <!----타이틀이 나오는 테이블--- -->
            <table width=780 border=0 cellpadding=0 cellspacing=0>
              <tr>
                <td width=2> <img src="/html/comm_img/car_01.gif" width=2 height=3 ></td>
                <td background="/html/comm_img/car_02.gif"></td>
                <td> <img src="/html/comm_img/car_03.gif" width=2 height=3 ></td>
              </tr>
              <tr>
                <td width=2> <img src="/html/comm_img/car_04.gif" width=2 height=23 ></td>
                <td background="/html/comm_img/car_05.gif" align="center" class="pup">
                  <img src="/html/comm_img/ic_pup.gif" width="19" height="8" align="absmiddle">
                  <!--title 자리-->
                  공지사항 게시판 상세내역 <img src="/html/comm_img/ic_pup.gif" width="19" height="8" align="absmiddle"></td>
                <td width=2><img src="/html/comm_img/car_06.gif" width=2 height=23 ></td>
              </tr>
              <tr>
                <td width=2><img src="/html/comm_img/car_07.gif" width=2 height=7 ></td>
                <td background="/html/comm_img/car_08.gif"></td>
                <td width=2> <img src="/html/comm_img/car_09.gif" width=2 height=7 ></td>
              </tr>
            </table>
            <!----타이틀이 나오는 테이블 끝----->
          </td>
        </tr>
        <tr>
          <td  height="7">
            <!-----하위여백-- -->
          </td>
        </tr>
      </table>
<!---title table end-->
    </td>
  </tr>
  <tr>
    <td align="center" valign="top">
      <!--INFOEXG_VIEW_FORM START--------------------------------------------------------------------------------->
      <form name="infoexg_view_form"  method="post" action="">
	<input type="hidden" name="seq" value ="<%=ds_detail.getSeq()%>">
	<input type="hidden" name="clsf" value ="101">
	<input type="hidden" name="brwscnt" value="<%= ds_detail.getBrwscnt()%>">
	<input type="hidden" name="recomcnt" value="<%= ds_detail.getRecomcnt()%>"> <!--추천수-->
	<input type="hidden" name="dwloadcnt" value="">  <!--다운로드수-->
</form>
<table width="780" border="0" cellspacing="0" align="center" bgcolor="#FFFFFF" class="gray" cellpadding="2"  style="table-layout:fixed">
  <tr>
	  <td width="70" bgcolor="#dddddd" class="gray">등록자 </td>
	  <td class="gray" width="150">&nbsp;<%= Util.checkString(ds_detail.getIncmgpersnm())%></td>
        <td bgcolor="#dddddd" width="70" class="gray">수신범위</td>
        <td width="150" class="gray">
            <select name="rmsgexttcd" class="sel_all">
            <%=ds.rmsgexttcdcurOptHtml(ds_detail.getRmsgexttcd())%>
            </select>
        </td>
	  <td bgcolor="#dddddd" class="gray" width="60"> 등록일자 </td>
	  <td  class="gray" width="70" align="left">&nbsp;<%= Util.convertS(ds_detail.getIncmgdt())%> </td>
	  <td  class="gray" width="125" colspan="2">&nbsp;</td>
  </tr>
<!--
  <tr>
	  <td width="130" bgcolor="#dddddd" class="gray">게시시작일자 </td>
	  <td  class="gray" width="210">  Util.convertS(ds_detail.getNotifrdt()) </td>
	  <td bgcolor="#dddddd" class="gray" width="105"> 게시종료일자 </td>
	  <td  class="gray" width="210">  Util.convertS(ds_detail.getNotitodt()) </td>
-->
  <tr>
	  <td width="70" bgcolor="#dddddd" class="gray">이메일 </td>
	  <td  class="gray" width="150"> <%= Util.checkString(Util.convertNull(ds_detail.getEmail(),"&nbsp;"))%> </td>
	  <td bgcolor="#dddddd" class="gray" width="70"> 홈페이지 </td>
	  <td  class="gray" width="150"> <%= Util.checkString(Util.convertNull(ds_detail.getHmpg(),"&nbsp;"))%>  </td>
	  <td bgcolor="#dddddd" class="gray" width="60"> 추천수 </td>
	  <td  class="gray" width="65">&nbsp;<%= ds_detail.getRecomcnt()%></td>
	  <td bgcolor="#dddddd" class="gray" width="60"> 조회수 </td>
	  <td  class="gray" width="65">&nbsp;<%= ds_detail.getBrwscnt()%></td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" width="70" class="gray">제목 </td>
    <td class="gray" width="650" colspan="7"> <%= Util.checkString(ds_detail.getTitl())%> </td>
  </tr>
	<%
	String cont = ds_detail.getCont1() + ds_detail.getCont2() + ds_detail.getCont3() + ds_detail.getCont4() + ds_detail.getCont5();
	//cont = Util.replace(cont, "\n", "<br>");
	%>

  <tr height="342">
    <td bgcolor="#dddddd" width="70" class="gray">내용 </td>
    <td  class="gray" width="650" colspan="7">
<!--    <textarea name="cont" cols="90" rows="16" class="scroll1">< %=cont%></textarea> -->
        <textarea name="cont" class="input" cols="64" rows="18" style="display:none"></textarea>
        <table style="display:none"><tr><td id=dis_content><%=cont%></td></tr></table>
        <div id="editorLocation">
            <script id="webeditorid" src="/html/comm_js/webEditorControl.js"></script>
        </div>
    </td>
   </tr>
  <tr>
    <td bgcolor="#dddddd" width="70" class="gray">첨부화일명</td>
    <td class="gray" colspan="7">&nbsp;
    	<a onClick="infoexg_dwload('<%=ds_detail.getSeq()%>','<%=ds_detail.dwloadcnt%>');" style="cursor:hand;">
    	<font color="blue">&nbsp;<%= Util.checkString(ds_detail.filenm)%> </font>
    	</a>
    </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width=0 height=0></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
<br><br>
</td>
  </tr>
  <tr>
    <td bgcolor="#959595" height="25" align="center"><a href="javascript:self.close();"><img src="/html/comm_img/bu_close.gif" width="49" height="19" border="0"></a></td>
  </tr>
</table>
<!---%를 위한 큰테이블 end-->
</body>
</html>
