<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_alon_1701_a.jsp
* ���     : ķ���μ��� ����
* �ۼ����� : 2004-03-13
* �ۼ���   : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    //ȭ�鿡 ������ ���ڵ� �� ����
    int   showRecCnt  =  15;
    // dataset �ν��Ͻ� ���� �κ�
    PS_S_EMP_ALON_BASEDataSet ds=(PS_S_EMP_ALON_BASEDataSet)request.getAttribute("ds"); //request dataset
%>

<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">

<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
    //�̺�Ʈ�ʱ�ȭ
    function jsInit() {
        setEventHandler();
        //setEnterKeyEventHandler();
    }


    //ķ���� ����
    function camp_save() {
        var lo_form1    = document.campin_form;

        //�Է��׸� ��ü üũ
        if(!validate(lo_form1)) return;
        var ls_check = confirm("���� �Ͻðڽ��ϱ�?");
        if(!ls_check) return ;
        makeValue(lo_form1);
        lo_form1.action = "/ps/allow/1706";
        lo_form1.target = "campifrm1";
        lo_form1.method = "post";
        lo_form1.submit();
    }

    //�ʱ�ȭ(reset)
    function jsReset() {
        var lo_form1    = document.campin_form;
        lo_form1.reset();
        lo_form1.asinbocd.focus();
        return;
    }

    //�˻���ư
    function sear_button(pageno) {
        var lo_form1 = document.search_form;

    	//event check.
    	if(window.event) window.event.returnValue = false;

        lo_form1.hd_bgncampdt.value = lo_form1.sh_bgncampdt.value;
        lo_form1.hd_endcampdt.value = lo_form1.sh_endcampdt.value;
        lo_form1.hd_campnm.value    = lo_form1.sh_campnm.value;

        if (!chk_search(pageno)) return;
    }


    //PAGE��ư
    function list_search(pageno) {
        var lo_form1 = document.search_form;

        //���� �˻����ǰ� ���濩�� üũ
        lo_form1.sh_bgncampdt.value = lo_form1.hd_bgncampdt.value;
        lo_form1.sh_endcampdt.value = lo_form1.hd_endcampdt.value;
        lo_form1.sh_campnm.value    = lo_form1.hd_campnm.value;

        if (!chk_search(pageno)) return;
    }


    //ķ���� ��ȸ
    function chk_search(pageno) {
        var lo_form1 = document.search_form;

        lo_form1.pageno.value   =   pageno;

        makeValue(lo_form1);
        lo_form1.method = "post";
        lo_form1.action = "/ps/allow/1711";
        lo_form1.target = "campifrm1";
        lo_form1.submit();
    }


    //ķ���� ����
    function camp_delete() {
        var lo_form1 = document.search_form;

        lb_delconfirm  =  confirm('���� ���� �Ͻðڽ��ϱ�?');

        if (lb_delconfirm) {
            var li_len    =  new Number(lo_form1.checkcnt.value);

            if (li_len < 1) {
                alert("���õ� ����Ÿ�� �����ϴ�.");
                lo_form1.sh_bgncampdt.focus();
                return;
            }

            //���õ� ����Ÿ ���� üũ
            var ls_name   =  "camp_check";
            var li_cnt    =  0;

            for(var i=0; i<li_len; i++) {
                if (document.all(ls_name + new String(i)).checked)  li_cnt++;
            }

            if (li_cnt == 0) {
                alert("���õ� ����Ÿ�� �����ϴ�.");
                lo_form1.sh_bgncampdt.focus();
                return;
            }

            lo_form1.action = "/ps/allow/1716";
            lo_form1.target = "campifrm1";
            lo_form1.method = "post";
            lo_form1.submit();
        }

        return;
    }


    //���� üũ�ڽ� ��ü üũ �Ǵ� ����
    function checkAll() {
        //filtering
        if (!window.event) return;

        var lo_form1  =  document.search_form;
        var li_len    =  new Number(lo_form1.checkcnt.value);

        if (li_len < 1) return;

        var lo_src    =  window.event.srcElement;
        var ls_name   =  window.event.srcElement.name;

        for(var i=0; i<li_len; i++) {
            if (lo_src.checked)  document.all(ls_name + new String(i)).checked = true;
            else                 document.all(ls_name + new String(i)).checked = false;
        }
    }


    //����� ķ���μ��� ���� popup
    function pop_emp_camp(bocd,campseq) {
        var lo_form1    = document.empcamp_form;

		lo_form1.campseq.value  =  campseq;
        lo_form1.bocd.value  =  bocd;

        var ls_win      = "scrollbars=no,toolbar=no,location=no,directories=no,width=870, height=545 resizable=no,mebar=no,left=80,top=80";
        window.open("about:blank" , "emp_camp", ls_win);
        lo_form1.target = "emp_camp";
        lo_form1.action = "/ps/allow/1721";
        lo_form1.submit();
    }
-->
</script>

</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsInit();campin_form.campnm.focus();">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle">����
      &gt; </b>ķ���ΰ���</td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���� ����-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
  <form name="campin_form" method="post" action="" >
    <tr>
      <td>
        <!--print title -->
        <table width="830" border="0" cellspacing="0" cellpadding="2">
          <tr>
            <td height="27" class="title" bgcolor="#EBE9DC"><b>ķ���ε��</b></td>
            <td height="27" class="title" width="50"  bgcolor="#EBE9DC" align="right">
              <img src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="camp_save();window.event.returnValue=false;">
            </td>
          </tr>
          <tr>
            <td height="3" colspan="2">
              <!--����-->
            </td>
          </tr>
        </table>
        <!--list -->
        <table  cellspacing="0" width="830" cellpadding="2" border="0" bgcolor="#FFFFFF" class="gray" id="campin_zone">


          <tr>
            <td width="100" bgcolor="#dddddd" class="gray" >����<font color="red">*</font></td>
            <td class="gray" width="150">
            <select name="asinbocd" class="sel_all"  caption="����" notEmpty >
              <option value="" >����</option>
              <%=ds.asinbocdcurOptHtml("")%>
            </select>
            </td>
            <td width="100" bgcolor="#dddddd" class="gray" >ķ���αⰣ<font color="red">*</font></td>
            <td class="gray">
              <input type="text" name="bgncampdt" value="" size="10"  maxlength="10" class="text_box" caption="ķ���αⰣ" dataType="date" notEmpty >
              -
              <input type="text" name="endcampdt" value="" size="10"  maxlength="10" class="text_box" caption="ķ���αⰣ" dataType="date" notEmpty >
            </td>
          </tr>
          <tr>
            <td width="100" bgcolor="#dddddd" class="gray" >ķ���θ�<font color="red">*</font></td>
            <td class="gray" colspan="3" >
              <input type="text" name="campnm"    value="" size="50"  maxlength="50" class="text_box" caption="ķ���θ�"   notEmpty >
            </td>
          </tr>
          <tr>
            <td width="100" bgcolor="#dddddd" class="gray" >����</td>
            <td class="gray" colspan="3" >
              <input type="text" name="cont"      value="" size="100" maxlength="50" class="text_box" >
            </td>
          </tr>
        </table>
      </td>
    </tr>
    <tr>
      <td height="10">
        <!------����--- -->
      </td>
    </tr>
  </form>
  <form name="search_form" method="post" action="" onsubmit="sear_button(1);">
    <input type="hidden" name="pageno"     value="1" >               <%--����������--%>
    <input type="hidden" name="pagesize"   value="<%=showRecCnt%>">  <%--���������� ���ڵ��--%>
    <input type="hidden" name="js_fn_nm"   value="list_search">      <%--�������̵��� ȣ��Ǵ� �ڹٽ�ũ��Ʈ �̸�--%>
    <input type="hidden" name="checkcnt"   value="0">                <%--���õ� ķ���� ����(������ �ʿ�)--%>

    <%--������ �̵��� ���� �˻����ǰ� ������ �����ϱ� ���� Hidden Type--%>
    <input type="hidden" name="hd_bgncampdt" value="">
    <input type="hidden" name="hd_endcampdt" value="">
    <input type="hidden" name="hd_campnm"    value="">

    <tr>
      <td>
        <!--search-->
        <table width="830" border="0" cellspacing="0" cellpadding="2" class="title1" bgcolor="#EBE9DC">
          <tr>
            <td width="50"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
            <td width="100">
            <select name="slt_asinbocd" class="sel_all"  caption="����" notEmpty >
              <option value="" >��ü</option>
              <%=ds.asinbocdcurOptHtml("")%>
            </select>
            </td>
            <td width="80"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">ķ���αⰣ</td>
            <td width="200">
              <input type="text" name="sh_bgncampdt" value="" size="10" maxlength="10" class="text_box" caption="ķ���αⰣ" dataType="date" >
              -
              <input type="text" name="sh_endcampdt" value="" size="10" maxlength="10" class="text_box" caption="ķ���αⰣ" dataType="date" >
            </td>
            <td width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">ķ���θ�</td>
            <td>
              <input type="text" name="sh_campnm"    value="" size="20" maxlength="50" class="text_box" > &nbsp;&nbsp;
              <input type="image" src="/html/comm_img/bu_search.gif" width="39" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="sear_button(1);window.event.returnValue=false;">
            </td>
          </tr>
        </table>
      </td>
    </tr>
    <tr>
      <td height="3">
        <!--���� -->
      </td>
    </tr>
    <tr>
      <td width="80">
        <!--Ÿ��Ʋ -->
        <table width="830" border="0" cellspacing="0" cellpadding="2">
          <tr>
            <td height="27" class="title" bgcolor="#EBE9DC"><b>ķ���θ��</b></td>
            <td height="27" class="title" bgcolor="#EBE9DC" width="50" align="right">
              <img src="/html/comm_img/bu_del01.gif" width="36" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="camp_delete();window.event.returnValue=false;">
            </td>
          </tr>
          <tr>
            <td height="3" colspan="2">
              <!--����-->
            </td>
          </tr>
        </table>
        <!--����Ʈ -->
        <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="list_zone">
          <tr align="center" bgcolor="#dddddd">
            <td class="gray" width="30">
              <input type="checkbox" name="camp_check" onClick="checkAll();">
            </td>
            <td class="gray" width="180">ķ���θ�</td>
            <td class="gray" width="150">ķ���αⰣ</td>
            <td class="gray" width="70">�Ҽ�����</td>
            <td class="gray" width="*">����</td>
          </tr>
<%--ȭ�鿡 ������ �⺻ ���ڵ���� ���� ���信 �°� Display--%>
<%
    for(int i=0; i < showRecCnt ; i++) {
%>
          <tr>
            <td class="gray"  align="center">&nbsp;&nbsp;</td>
            <td class="gray"  align="left"  >&nbsp;&nbsp;</td>
            <td class="gray"  align="center">&nbsp;&nbsp;</td>
            <td class="gray"  align="center">&nbsp;&nbsp;</td>
            <td class="gray"  align="left"  >&nbsp;&nbsp;</td>
          </tr>
<%
    }
%>
        </table>
      <!---button-->
      <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="page_zone" >
        <tr>
          <td align="center" height="2">
            <!--����-->
          </td>
        </tr>
        <tr>
          <td align="center" height="24" bgcolor="#E8E8E8">
                            <div align="center">
                            <!--JSP PAGE START---------------------------------------------------------------------------------->
                            <jsp:include page="/jsp/ps/comm_jsp/page_navigator.jsp">
                            <jsp:param name = "curr_page_no" 		value="0"/>
                            <jsp:param name = "total_records" 		value="0"/>
                            <jsp:param name = "js_fn_nm" 	        value="js_page_navigator"/>
                            <jsp:param name = "records_per_page" 	value="15"/>
                            <jsp:param name = "page_set_gubun" 		value="0"/>
                            </jsp:include>
                            <!--JSP PAGE END------------------------------------------------------------------------------------>
        		    </div>
          </td>
        </tr>
      </table>
      </td>
    </tr>
  </form>
</table>
</body>
<iframe name="campifrm1" width=0 height=0></iframe>

<%--����� ķ���μ��� ������ ���� form--%>
<form name="empcamp_form" method="post" action="" >
  <input type="hidden" name="campseq" value="">
  <input type="hidden" name="bocd" value="">
</form>

</html>

