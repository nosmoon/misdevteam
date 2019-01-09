<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/sl_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_commun_2680_p.jsp
* 기능 	 	 : 판매지국-통신실 아파트투입 현황조사 매체약어표보기팝업
* 작성일자 	 : 2004-03-02
* 작성자 	 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    // dataset 인스턴스 선언부분
    SL_L_COMM_MEDIYNMDataSet ds = (SL_L_COMM_MEDIYNMDataSet)request.getAttribute("ds");  // request dataset

%>

<html>
<head>
<title>::::매체 약어표::::</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sal.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
	//window.returnValue	 = "";

	function close_modal(){
		window.close();
	}
//-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="5" topmargin="5" marginwidth="5" marginheight="5" class="scroll1">
<!--title-->
<table width="370" border="0" cellspacing="0" cellpadding="0" height="100%">
  <tr>
    <td  height="7">
      <!-----상위여백-- -->
    </td>
  </tr>
  <tr>
    <td align="center" height="33" class="pup">
      <!--title-->
      <table width=370 border=0 cellpadding=0 cellspacing=0>
        <tr>
          <td width=2> <img src="/html/comm_img/car_01.gif" width=2 height=3 ></td>
          <td background="/html/comm_img/car_02.gif"></td>
          <td> <img src="/html/comm_img/car_03.gif" width=2 height=3 ></td>
        </tr>
        <tr>
          <td width=2> <img src="/html/comm_img/car_04.gif" width=2 height=23 ></td>
          <td background="/html/comm_img/car_05.gif" align="center" class="pup"> <img src="/html/comm_img/ic_pup.gif" width="19" height="8" align="absmiddle">
            <!--title 자리-->
            매체 약어표 <img src="/html/comm_img/ic_pup.gif" width="19" height="8" align="absmiddle"></td>
          <td width=2><img src="/html/comm_img/car_06.gif" width=2 height=23 ></td>
        </tr>
        <tr>
          <td width=2><img src="/html/comm_img/car_07.gif" width=2 height=7 ></td>
          <td background="/html/comm_img/car_08.gif"></td>
          <td width=2> <img src="/html/comm_img/car_09.gif" width=2 height=7 ></td>
        </tr>
      </table>
      <!--title end-->
    </td>
  </tr>
  <tr>
    <td  height="7">
    </td>
  </tr>
  <tr>
    <td align="center" class="pup" valign="top">
      <!--리스트 시작 -->
      <table id="acctcd_list_id" width="370" border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td>
          <table width="370" border="0" cellpadding="1" cellspacing="0" bgcolor="#FFFFFF" class="gray" >
            <tr align="center" bgcolor="#dddddd">
              <td width="50" class="gray" align="center">순번</td>
              <td width="120" class="gray" align="center">매체명</td>
              <td width="120" class="gray" align="center">약어</td>
            </tr>
        <%
            for(int i=0; i<ds.curmedilist.size(); i++){
                SL_L_COMM_MEDIYNMCURMEDILISTRecord rsltcurRec = (SL_L_COMM_MEDIYNMCURMEDILISTRecord)ds.curmedilist.get(i);
		%>
            <tr>
              <td class="gray" align="center"><%=i+1%></td>
              <td class="gray">&nbsp;<%=rsltcurRec.cicdnm%></td>
              <td class="gray" align="center"><%=rsltcurRec.cimgtcd2%></td>
            </tr>
        <%
			}
        %>		
          </table>
          </td>
        </tr>
      </table>
      <!--리스트 끝 -->
    </td>
  </tr>
  <tr>
    <td align="center" height="7">
      <!--하단여백-->
    </td>
  </tr>
  <tr>
    <td align="center" height="27"  bgcolor="#959595"><input type="image" src="/html/comm_img/bu_close.gif" onclick="close_modal();"></a></td>
  </tr>
</table>
</body>
</html>