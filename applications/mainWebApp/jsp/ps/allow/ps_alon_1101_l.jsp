<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_alon_1101_l.jsp
* ���     : ������������
* �ۼ����� : 2004-03-08
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    // dataset �ν��Ͻ� ����κ�
	PS_L_BOEMP_ALON_KINDDataSet ds = (PS_L_BOEMP_ALON_KINDDataSet)request.getAttribute("ds");

    String searbocd   = Util.Uni2Ksc(Util.checkString(request.getParameter("bocd")));        //�˻� ����
    String searboemp1 = Util.Uni2Ksc(Util.checkString(request.getParameter("boemp_no1")));   //�˻� �����ȣ1
    String searboemp2 = Util.Uni2Ksc(Util.checkString(request.getParameter("boemp_no2")));   //�˻� �����ȣ2
    String seardeptcd = Util.Uni2Ksc(Util.checkString(request.getParameter("deptcd")));      //�˻� �μ��ڵ�
%>

<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">

<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
    //����� ���系�� ��ȸ
    function alonkind_search() {
        var lo_form1 = document.search_form;
        var ls_boemp_no1 = trim(lo_form1.boemp_no1.value);
        var ls_boemp_no2 = trim(lo_form1.boemp_no2.value);

    	//event check.
    	if (window.event) window.event.returnValue = false;

		//�����ȣ1 5�ڸ� ����
		if (ls_boemp_no1.length > 0) {
			ls_boemp_no1 = lpad(ls_boemp_no1,5,'0');
			lo_form1.boemp_no1.value = ls_boemp_no1;
		}

		//�����ȣ2 5�ڸ� ����
		if (ls_boemp_no2.length > 0) {
			ls_boemp_no2 = lpad(ls_boemp_no2,5,'0');
			lo_form1.boemp_no2.value = ls_boemp_no2;
		}

        //�Է��׸� ��ü üũ
        if(!validate(lo_form1)) return;

        makeValue(lo_form1);
        lo_form1.action = "/ps/allow/1101";
        lo_form1.target = "_self";
        lo_form1.method = "post";
        lo_form1.submit();
    }


    //����� �������� ����
    function alonkind_save() {
        var lo_form1    = document.empalon_form;
        var li_reccnt   = lo_form1.listcnt.value;

        if (li_reccnt == 0) {
            alert("������ �ڷᰡ �����ϴ�.");
            return;
        }

        lo_form1.action = "/ps/allow/1106";
        lo_form1.target = "empalonifrm";
        lo_form1.method = "post";
        lo_form1.submit();
    }


    //���纰 �μ��˻�
    function bodept_search() {
        var lo_form1    = document.search_form;

        lo_form1.action = "/ps/common/1301";
        lo_form1.target = "empalonifrm";
        lo_form1.method = "post";
        lo_form1.submit();
    }


    //���� üũ�ڽ� ��ü üũ �Ǵ� ����
    function checkAll() {
    	//filtering
    	if (!window.event) return;

    	var lo_form1  =  document.empalon_form;
    	var li_len    =  new Number(lo_form1.listcnt.value);

    	if (li_len < 1) return;

    	var lo_src    =  window.event.srcElement;
    	var ls_name   =  window.event.srcElement.name;

    	for(var i=0; i<li_len; i++) {
    		if (lo_src.checked)  document.all(ls_name + new String(i)).checked = true;
    		else                 document.all(ls_name + new String(i)).checked = false;
    	}
    }
-->
</script>

</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle">����
      &gt; </b>������������</td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���� ����-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td>
      <!--search-->
      <table width="830" border="0" cellspacing="0" cellpadding="2" class="title1" bgcolor="#EBE9DC">
        <form name="search_form" method="post" action="" onsubmit="alonkind_search();">
        <tr>
          <td width="50"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���� <font color="red">*</font></td>
          <td width="200">
            <select name="bocd" size="1" class="sel_all" caption="����" notEmpty onchange="bodept_search();">
              <option value="" <% if(searbocd.equals("")) out.print("selected"); %>>����</option>
<%--���� �޺��ڽ�--%>
<%
	for(int i=0; i<ds.intgbocdcur.size(); i++){
		PS_L_BOEMP_ALON_KINDINTGBOCDCURRecord intgbocdcurRec = (PS_L_BOEMP_ALON_KINDINTGBOCDCURRecord)ds.intgbocdcur.get(i);
%>
              <option value="<%= intgbocdcurRec.bocd%>" <% if(searbocd.equals(intgbocdcurRec.bocd)) out.print("selected"); %>><%= intgbocdcurRec.bonm%></option>
<%
	}
%>
            </select>
          </td>
          <td width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�����ȣ</td>
          <td width="200">
            <input name="boemp_no1" type="text" size="5" maxlength="5" class="text_box" value="<%=searboemp1%>" >
            -
            <input name="boemp_no2" type="text" size="5" maxlength="5" class="text_box" value="<%=searboemp2%>" >
          </td>
          <td width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�μ�</td>
          <td>
            <select name="deptcd" size="1" class="sel_all" caption="�μ�" style="width:80;" id="bodept_sel" >
              <option value="" <% if(seardeptcd.equals("%") || seardeptcd.equals("")) out.print("selected"); %>>��ü</option>
<%--�μ� �޺��ڽ�--%>
<%
	for(int i=0; i<ds.deptlistcur.size(); i++){
		PS_L_BOEMP_ALON_KINDDEPTLISTCURRecord deptlistcurRec = (PS_L_BOEMP_ALON_KINDDEPTLISTCURRecord)ds.deptlistcur.get(i);
%>
              <option value="<%= deptlistcurRec.deptcd%>" <% if(seardeptcd.equals(deptlistcurRec.deptcd)) out.print("selected"); %>><%= deptlistcurRec.deptnm%></option>
<%
	}
%>
            </select>
          </td>
          <td align="right">
            <input type="image" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="alonkind_search();window.event.returnValue=false;">
          </td>
        </tr>
        </form>
      </table>
    </td>
  </tr>
  <tr>
    <td height="3">
      <!--���� -->
    </td>
  </tr>
  <tr>
    <td valign="top">
      <!--Ÿ��Ʋ -->
      <table width="830" border="0" cellspacing="0" cellpadding="2">
        <tr>
          <td height="27" class="title" bgcolor="#EBE9DC"><b>�����������</b></td>
          <td height="27" class="title" width="50"  bgcolor="#EBE9DC" align="right">
            <img src="/html/comm_img/bu_save02.gif" width="36" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="alonkind_save();window.event.returnValue=false;">
          </td>
        </tr>
        <tr>
          <td height="3" colspan="2">
            <!--����-->
          </td>
        </tr>
      </table>
      <!--����Ʈ -->
      <table width="830" cellspacing="0" cellpadding="1" border="0" class="gray" bgcolor="#FFFFFF">
        <form name="empalon_form" method="post" action="" >
        <input type="hidden" name="bocd"    value="<%=searbocd%>">                   <%--���������ڵ�--%>
        <input type="hidden" name="listcnt" value="<%=ds.empalonkindcur.size()%>">   <%--��ȸ���ڵ�ī��Ʈ--%>
        <tr align="center">
          <td width="50"  height="43" class="gray" bgcolor="#dddddd" rowspan="2">�����ȣ</td>
          <td width="70"  height="43" class="gray" bgcolor="#dddddd" rowspan="2">�����</td>
          <td width="90"  height="43" class="gray" bgcolor="#dddddd" rowspan="2">�μ���</td>
          <td width="60"  height="20" class="gray" bgcolor="#dddddd">��������</td>
          <td width="60"  height="20" class="gray" bgcolor="#dddddd">��������</td>
          <td width="60"  height="20" class="gray" bgcolor="#dddddd">��������</td>
          <td width="60"  height="20" class="gray" bgcolor="#dddddd">Ư������</td>
          <td width="60"  height="20" class="gray" bgcolor="#dddddd">��å����</td>
          <td width="60"  height="20" class="gray" bgcolor="#dddddd">��ټ���</td>
          <td width="60"  height="20" class="gray" bgcolor="#dddddd">ķ���μ���</td>
          <td width="60"  class="gray" bgcolor="#dddddd">���ݼ���</td>
          <td width="60"  class="gray" bgcolor="#dddddd">�����ޱ�</td>
          <td width="60"  class="gray" bgcolor="#dddddd">��������</td>
          <td width="60"  class="gray" bgcolor="#dddddd">��ȭ���</td>
        </tr>
        <tr bgcolor="#dddddd" align="center">
          <td width="60" class="gray" >
            <input type="checkbox" name="busn_check"    onClick="checkAll();">
          </td>
          <td width="60" class="gray" >
            <input type="checkbox" name="rslt_check"    onClick="checkAll();">
          </td>
          <td width="60" class="gray" >
            <input type="checkbox" name="dcl_amt_check" onClick="checkAll();">
          </td>
          <td width="60" class="gray" >
            <input type="checkbox" name="spc_check"     onClick="checkAll();">
          </td>
          <td width="60" class="gray" >
            <input type="checkbox" name="posi_check"    onClick="checkAll();">
          </td>
          <td width="60" class="gray" >
            <input type="checkbox" name="prsnt_check"   onClick="checkAll();">
          </td>
          <td width="60" class="gray" >
            <input type="checkbox" name="camp_check"    onClick="checkAll();">
          </td>
          <td width="60"  class="gray" >
            <input type="checkbox" name="cash_check"    onClick="checkAll();">
          </td>
          <td width="60"  class="gray" >
            <input type="checkbox" name="advn_check"    onClick="checkAll();">
          </td>
          <td width="60"  class="gray" >
            <input type="checkbox" name="busnshow_check" onClick="checkAll();">
          </td>
          <td width="60"  class="gray" >
            <input type="checkbox" name="telfee_check"   onClick="checkAll();">
          </td>
        </tr>
<%--��������� �������� display--%>
<%
	for(int i=0; i<ds.empalonkindcur.size(); i++){
		PS_L_BOEMP_ALON_KINDEMPALONKINDCURRecord empalonkindcurRec = (PS_L_BOEMP_ALON_KINDEMPALONKINDCURRecord)ds.empalonkindcur.get(i);
%>
        <tr align="center" onmouseover="this.style.backgroundColor='#EDFFF1'" onmouseout="this.style.backgroundColor=''">
          <td  width="50" class="gray" align="center">&nbsp;<%= empalonkindcurRec.boemp_no%>&nbsp;</td>
          <td  width="70" class="gray" align="center">&nbsp;<%= empalonkindcurRec.flnm%>&nbsp;</td>
          <td  width="90" class="gray" align="center">&nbsp;<%= empalonkindcurRec.deptnm%>&nbsp;</td>
          <td  width="60" class="gray" align="center">
            <input type="hidden"   name="empno<%=i%>"         value="<%= empalonkindcurRec.boemp_no%>">
            <input type="checkbox" name="busn_check<%=i%>"    value="01" <% if("01".equals(empalonkindcurRec.busn_alon)) out.print("checked"); %>>
          </td>
          <td  width="60" class="gray" align="center">
            <input type="checkbox" name="rslt_check<%=i%>"    value="02" <% if("02".equals(empalonkindcurRec.rslt_alon)) out.print("checked"); %>>
          </td>
          <td  width="60" class="gray" align="center">
            <input type="checkbox" name="dcl_amt_check<%=i%>" value="03" <% if("03".equals(empalonkindcurRec.dcl_amt_alon)) out.print("checked"); %>>
          </td>
          <td  width="60" class="gray" align="center">
            <input type="checkbox" name="spc_check<%=i%>"     value="04" <% if("04".equals(empalonkindcurRec.spc_alon)) out.print("checked"); %>>
          </td>
          <td  width="60" class="gray" align="center">
            <input type="checkbox" name="posi_check<%=i%>"    value="05" <% if("05".equals(empalonkindcurRec.posi_alon)) out.print("checked"); %>>
          </td>
          <td  width="60" class="gray" align="center">
            <input type="checkbox" name="prsnt_check<%=i%>"   value="06" <% if("06".equals(empalonkindcurRec.prsnt_alon)) out.print("checked"); %>>
          </td>
          <td  width="60" class="gray" align="center">
            <input type="checkbox" name="camp_check<%=i%>"    value="07" <% if("07".equals(empalonkindcurRec.camp_alon)) out.print("checked"); %>>
          </td>
          <td  width="60"  class="gray" >
            <input type="checkbox" name="cash_check<%=i%>"    value="08" <% if("08".equals(empalonkindcurRec.cash_alon)) out.print("checked"); %>>
          </td>
          <td  width="60"  class="gray" >
            <input type="checkbox" name="advn_check<%=i%>"    value="09" <% if("09".equals(empalonkindcurRec.advn_alon)) out.print("checked"); %>>
          </td>
          <td  width="60"  class="gray" >
            <input type="checkbox" name="busnshow_check<%=i%>" value="10" <% if("10".equals(empalonkindcurRec.busnshow_alon)) out.print("checked"); %>>
          </td>
          <td  width="60"  class="gray" >
            <input type="checkbox" name="telfee_check<%=i%>"   value="11" <% if("11".equals(empalonkindcurRec.telfee_alon)) out.print("checked"); %>>
          </td>
        </tr>
<%
	}
%>
        </form>
      </table>
    </td>
  </tr>
</table>
</body>
<iframe name="empalonifrm" width=0 height=0></iframe>
</html>
