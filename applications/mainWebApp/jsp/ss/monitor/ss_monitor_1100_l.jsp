<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ss_monitor_1100_l.jsp
* 기능     : 모니터링-판매지국
* 작성일자 : 2005-08-02
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
	// request
    String disclsf = Util.checkString(request.getParameter("disclsf"));       //화면구분

    if (disclsf.equals(""))  disclsf = "B";

	//
	sls.monitor.wb.JDBCAttributeMonitor jdbcMonitor  =  new chosun.ciis.ss.sls.monitor.wb.JDBCAttributeMonitor();
	ArrayList            aList        =  null;
	aList                             =  jdbcMonitor.monitor("SAL",disclsf);

	// 검색 리스트 카운트
	int recCount  =  aList.size();
%>

<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
    // 화면구분처리
    function select_display(disclsf){
        var lo_form1 = document.dis_sel;

        lo_form1.disclsf.value  =  disclsf;

        lo_form1.action = "/ss/monitor/1100";
        lo_form1.target = "_self";
        lo_form1.submit();
    }
//-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle">모니터링
      &gt; </b> 판매지국</td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td>
      <!--타이틀 -->
      <table width="830" border="0" cellpadding="2" cellspacing="0">
        <tr>
          <td width="400" height="27" bgcolor="#EBE9DC" class="title">판매지국 CONNECTION POOL</td>
          <td width="*"   height="27" bgcolor="#EBE9DC" class="title" align="right">
            <input type="image" src="/html/comm_img/bu_display1.gif" width="44" height="19" align="absmiddle" onclick="javascript:select_display('A');window.event.returnValue=false;">
            <input type="image" src="/html/comm_img/bu_display2.gif" width="44" height="19" align="absmiddle" onclick="javascript:select_display('B');window.event.returnValue=false;">
          </td>
        </tr>
        <tr>
          <td height="3" colspan="2">
            <!--여백-->
          </td>
        </tr>
      </table>
      <!--리스트 -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" bgcolor="#FFFFFF" class="gray">
        <tr align="center" bgcolor="#dddddd">
<%
    if (disclsf.equals("A")) {
%>
          <td width="83"  height="23" class="gray" >Connections Pool</td>
          <td width="83"  height="23" class="gray" >Server</td>
<%
    } else {
%>
          <td width="83"  height="23" class="gray" >Server</td>
          <td width="83"  height="23" class="gray" >Connections Pool</td>
<%
    }
%>
          <td width="83"  height="23" class="gray" >Connections</td>
          <td width="83"  height="23" class="gray" >Connections High</td>
          <td width="83"  height="23" class="gray" >Connections Total</td>
          <td width="83"  height="23" class="gray" >Max Capacity</td>
          <td width="83"  height="23" class="gray" >Wait Seconds High</td>
          <td width="83"  height="23" class="gray" >Waiters</td>
          <td width="83"  height="23" class="gray" >Waiters High</td>
          <td width="*"   height="23" class="gray" >State</td>
        </tr>
<%-- 반복 시작 --%>
<%
    for(int i=0 ; i<recCount ; i++) {

        chosun.ciis.ss.sls.monitor.rec.JDBCAttributeMonitorRec rec = (chosun.ciis.ss.sls.monitor.rec.JDBCAttributeMonitorRec)aList.get(i);
%>
        <tr>
<%
    if (disclsf.equals("A")) {
%>
          <td width="83"  height="23" align="center" class="gray"><%= rec.getPoolname()%></td>
          <td width="83"  height="23" align="center" class="gray"><%= rec.getSvrname()%></td>
<%
    } else {
%>
          <td width="83"  height="23" align="center" class="gray"><%= rec.getSvrname()%></td>
          <td width="83"  height="23" align="center" class="gray"><%= rec.getPoolname()%></td>
<%
    }
%>
          <td width="83"  height="23" align="right"  class="gray"><%= Util.comma(rec.getConncurcnt())%>&nbsp;</td>
          <td width="83"  height="23" align="right"  class="gray"><%= Util.comma(rec.getConnhighcnt())%>&nbsp;</td>
          <td width="83"  height="23" align="right"  class="gray"><%= Util.comma(rec.getConntotcnt())%>&nbsp;</td>
          <td width="83"  height="23" align="right"  class="gray"><%= Util.comma(rec.getMaxcapa())%>&nbsp;</td>
          <td width="83"  height="23" align="right"  class="gray"><%= Util.comma(rec.getWaitsechigh())%>&nbsp;</td>
          <td width="83"  height="23" align="right"  class="gray"><%= Util.comma(rec.getWaitforconncur())%>&nbsp;</td>
          <td width="83"  height="23" align="right"  class="gray"><%= Util.comma(rec.getWaitforconnhigh())%>&nbsp;</td>
          <td width="*"   height="23" align="center" class="gray"><%= rec.getState()%></td>
        </tr>
<%-- 반복 끝 --%>
<%
    }
%>
      </table>
    </td>
  </tr>
</table>
<br>
<br>
<form name="dis_sel" method="post" action="">
  <input type="hidden" name="disclsf" value="">  <!--화면구분-->
</form>
</body>
</html>
