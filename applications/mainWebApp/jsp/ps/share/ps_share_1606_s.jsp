<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_share_1601_a.jsp
* 기능 : 정보공유 달력 초기 화면
* 작성일자 : 2004-03-08
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    PS_L_DAY_SCHEDataSet ds = (PS_L_DAY_SCHEDataSet)request.getAttribute("ds");    // request dataset
    int moveListCount = 10;	// 한 화면당 리스트 항목 수
    String select_day = request.getParameter("select_day");
%>
<html>
<head>
<title>일정</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">

// 이벤트 핸들러 초기화
function jsInit(){
    setEventHandler();
}
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsInit()">
<table width="100%" height="100%" cellspacing="0" cellpadding="0" align="center">
  <tr> 
    <td valign="top"> 
      <!--타이틀테이블 시작-->
      <table width="100%"  height="50" cellpadding="0" cellspacing="0" >
        <tr> 
    <td  height="7">
      <!-----상위여백-- -->
    </td>
  </tr>
    <tr>
      <td width="100%" height="33" colspan="3" align="center">

    <!----타이틀이 나오는 테이블--- -->
        <table border=0 cellpadding=0 cellspacing=0 width="95%">
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
              <%=Util.convertS(select_day)%> 의 일정<img src="/html/comm_img/ic_pup.gif" width="19" height="8" align="absmiddle"></td>
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
      <!--타이틀테이블 끝-->
      <%
    if(ds.dayschecur.size()>0) {
%>
      <!--일정 테이블-->
      <table width="95%" class="gray" cellpadding="2" cellspacing="0" align="center">
       <tr>
          <td class="gray" width="70" align="center" bgcolor="#dddddd" > 시 작 일 </td>
          <td class="gray" width="70" align="center" bgcolor="#dddddd" > 종 료 일 </td>
          <td class="gray" align="center" > 내 용 </td>
        </tr>

        <%
    for(int i=0 ; i< ds.dayschecur.size(); i++) {
        PS_L_DAY_SCHEDAYSCHECURRecord rec = (PS_L_DAY_SCHEDAYSCHECURRecord)ds.dayschecur.get(i);
    %>
        <tr onmouseover="this.style.backgroundColor='#EDFFF1'" onmouseout="this.style.backgroundColor=''"> 
          <td class="gray" width="70" align="center" bgcolor="#dddddd" ><%=Util.convertS(Util.checkString(rec.getFrdt()))%></td>
          <td class="gray" width="70" align="center" bgcolor="#dddddd" ><%=Util.convertS(Util.checkString(rec.getTodt()))%></td>
          <td class="gray" align="align" ><%=Util.convertS(Util.checkString(rec.getRemk()))%></td>
        </tr>
        <%
    }
%>
      </table>
      <!--일정 테이블 끝-->
      <%
    } else {
%>
      <!--데이타가 없을경우 테이블-->
      <table width ="100%" height="200" >
        <tr> 
          <td align="center"><b><font color="#FF6600">등록된 일정이 없습니다</font></b></td>
        </tr>
      </table>
      <!--데이타가 없을경우 테이블 끝-->
      <%
    }
%>      
  </tr>
  <tr>
<!--닫힘 % 맞추기 위해 큰테이블에 안침-->
    <td align="center" height="25" bgcolor="#959595"><a href="javascript:self.close();"><img src="/html/comm_img/bu_close.gif" width="49" height="19" border="0"></a></td>
  </tr>
</table>
</body>
</html>