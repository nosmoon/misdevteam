<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_share_1601_a.jsp
* ��� : �������� �޷� �ʱ� ȭ��
* �ۼ����� : 2004-03-08
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    PS_L_DAY_SCHEDataSet ds = (PS_L_DAY_SCHEDataSet)request.getAttribute("ds");    // request dataset
    int moveListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
    String select_day = request.getParameter("select_day");
%>
<html>
<head>
<title>����</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">

// �̺�Ʈ �ڵ鷯 �ʱ�ȭ
function jsInit(){
    setEventHandler();
}
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsInit()">
<table width="100%" height="100%" cellspacing="0" cellpadding="0" align="center">
  <tr> 
    <td valign="top"> 
      <!--Ÿ��Ʋ���̺� ����-->
      <table width="100%"  height="50" cellpadding="0" cellspacing="0" >
        <tr> 
    <td  height="7">
      <!-----��������-- -->
    </td>
  </tr>
    <tr>
      <td width="100%" height="33" colspan="3" align="center">

    <!----Ÿ��Ʋ�� ������ ���̺�--- -->
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
              <!--title �ڸ�-->
              <%=Util.convertS(select_day)%> �� ����<img src="/html/comm_img/ic_pup.gif" width="19" height="8" align="absmiddle"></td>
            <td width=2><img src="/html/comm_img/car_06.gif" width=2 height=23 ></td>
          </tr>
          <tr>
            <td width=2><img src="/html/comm_img/car_07.gif" width=2 height=7 ></td>
            <td background="/html/comm_img/car_08.gif"></td>
            <td width=2> <img src="/html/comm_img/car_09.gif" width=2 height=7 ></td>
          </tr>
        </table>
        <!----Ÿ��Ʋ�� ������ ���̺� ��----->
      </td>
    </tr>
    <tr>
    <td  height="7">
      <!-----��������-- -->
    </td>
        </tr>
      </table>
      <!--Ÿ��Ʋ���̺� ��-->
      <%
    if(ds.dayschecur.size()>0) {
%>
      <!--���� ���̺�-->
      <table width="95%" class="gray" cellpadding="2" cellspacing="0" align="center">
       <tr>
          <td class="gray" width="70" align="center" bgcolor="#dddddd" > �� �� �� </td>
          <td class="gray" width="70" align="center" bgcolor="#dddddd" > �� �� �� </td>
          <td class="gray" align="center" > �� �� </td>
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
      <!--���� ���̺� ��-->
      <%
    } else {
%>
      <!--����Ÿ�� ������� ���̺�-->
      <table width ="100%" height="200" >
        <tr> 
          <td align="center"><b><font color="#FF6600">��ϵ� ������ �����ϴ�</font></b></td>
        </tr>
      </table>
      <!--����Ÿ�� ������� ���̺� ��-->
      <%
    }
%>      
  </tr>
  <tr>
<!--���� % ���߱� ���� ū���̺� ��ħ-->
    <td align="center" height="25" bgcolor="#959595"><a href="javascript:self.close();"><img src="/html/comm_img/bu_close.gif" width="49" height="19" border="0"></a></td>
  </tr>
</table>
</body>
</html>