<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : sl_reader_1500_a
* ��� :
* �ۼ����� :
* �ۼ��� :
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%-- dataset �ν��Ͻ� ����κ�--%>
<%
	SS_L_READER_BOINFO_INITDataSet ds = (SS_L_READER_BOINFO_INITDataSet)request.getAttribute("ds");
%>
<%
    applySession = true;	// ���� ���� ����
	//		String jobcd = Util.getSessionParameterValue(request, "jobcd", false);	// ���������ڵ�(�Ǹű���,��������,���������� ��� ��ȸ �ɼ��� �����ش�.)
%>

<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
// �̺�Ʈ �ڵ鷯 �ʱ�ȭ
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
	setInputBackgroundColor();
//	document.boemp_search_form.bonm.focus();
}



// ���� �˻�
function area_search(){
    var lo_form1 = document.boemp_search_form;

    if(lo_form1.deptcd.value == '') {

        // ������� �ʱ�ȭ
        var str = "<select id=areacd_id name=\"areacd\" onChange=\"bolist_search();\" class=\"sel_all\">" +
                      "<option value='' selected>��ü</option>" +
                  "</select>"
        document.all.areacd_id.outerHTML = str;

        // ������� �ʱ�ȭ
        var str_bolist = "<select id=bolist_id name=\"bolist\" onChange=\"detail_view();\" class=\"sel_all\">" +
                             "<option value='' selected>��ü</option>" +
                         "</select>"
        document.all.bolist_id.outerHTML = str_bolist;
        return;
    }

    // �μ��ڵ尪�� "/ss/common/1100" �������� ������
    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
    lo_form1.action = "/ss/common/1190";
    lo_form1.target = "ifrm1";
    lo_form1.submit();
}


// �������
function bolist_search(){

    var lo_form1 = document.boemp_search_form;
    var lo_form2 = document.rdrsrch_list_form;

    if(lo_form1.areacd.value == '') {
        var str = "<select id=bolist_id name=\"bolist\" onChange=\"detail_view();\" class=\"sel_all\">" +
                      "<option value='' selected>��ü</option>" +
                  "</select>"
        document.all.bolist_id.outerHTML = str;

        lo_form2.action = "/ss/reader/1701";
        lo_form2.target = "ifrm2";
        lo_form2.submit();

        return;
    }

    // �μ�/�������� "/ss/common/1116" �������� ������
    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
    lo_form1.common_areacd.value = lo_form1.areacd.value;
    lo_form1.action = "/ss/common/1116";
    lo_form1.target = "ifrm1";
    lo_form1.submit();

    lo_form2.action = "/ss/reader/1701";
    lo_form2.target = "ifrm2";
    lo_form2.submit();

}

// �������
function bolist_init(){

    var lo_form1 = document.boemp_search_form;
    var lo_form2 = document.rdrsrch_list_form;

    var str = "<select id=bolist_id name=\"bolist\" onChange=\"detail_view();\" class=\"sel_all\">" +
                  "<option value='' selected>��ü</option>" +
              "</select>"
    document.all.bolist_id.outerHTML = str;

    lo_form2.action = "/ss/reader/1701";
    lo_form2.target = "ifrm2";
    lo_form2.submit();

    return;

}


// �Ǹ����� ����ȭ������ �̵�
function detail_view(){
    var lo_form1 = document.rdrsrch_list_form;
    var lo_form2 = document.boemp_search_form;

    if( lo_form2.bolist.value == "" ) {
      lo_form1.action = "/ss/reader/1701";
      lo_form1.target = "ifrm2";
      lo_form1.submit();
      return;
    }

    lo_form1.bocd.value = lo_form2.bolist.value;
    lo_form1.rdr_no.value = "";
    lo_form1.find_type.value = "Y";

    // �Ǹ����� ����ȭ������ ��â�� ����.
    lo_form1.action = "/ss/slreader/1100";
    lo_form1.target = "ifrm2";
    lo_form1.submit();

    /*
    if( ifrm2.gs_rdr_no != null && ifrm2.gs_rdr_no != "" && ifrm2.gs_rdr_no != "undefined" ) {
      if( ifrm2.gs_rdr_no.closed == false ) {
        ifrm2.gs_rdr_no.close();
      }
    }
    */
}



//-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25"  align="absmiddle" >������Ȳ
      &gt; </b>����������ȸ</td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���� ����-->
    </td>
  </tr>
</table>

<!--�˻�����-->

<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<form name="boemp_search_form" method="post" action="" >
<!--	<input type="hidden" name="pageno" value ="1">-->				<!-- ���� ������ ��ȣ -->
<!--	<input type="hidden" name="pagesize" value ="0">-->	<!-- �� ȭ��� ����Ʈ �׸� �� -->
<!--	<input type="hidden" name="js_fn_nm" value ="page_move">-->
	<input type="hidden" name="common_deptcd" value ="">                    <!-- ���� �μ��ڵ� -->
    <input type="hidden" name="common_areacd" value ="">                    <!-- ���� �����ڵ� -->
<!--	<input type="hidden" name="bocd" value ="">  -->                       	<!-- ���������ڵ� -->
	<input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� -->
	<tr>
		<td bgcolor="#EBE9DC" width="38" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�μ�</td>
	    <td bgcolor="#EBE9DC" class="title" width="100">
		<select name="deptcd" onChange="area_search();" class="sel_all">
<%
            //�μ���� ǥ��
			writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true);
%>
	    </select>
        </td>
        <td bgcolor="#EBE9DC" width="38" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
        <td bgcolor="#EBE9DC" class="title" width="80">
        <select name="areacd" size="1" onChange="bolist_search();" id="areacd_id" class="sel_all">  <!--�����ڵ�, ������ ���-->
          <option value="">��ü</option>
<%
			writeAreaOpt(session, out, true);
%>
        </select>
    </td>
    <td bgcolor="#EBE9DC" class="title" width="38""><img src="/html/comm_img/ic_title.gif" width="12" height="7">����</td>
    <td bgcolor="#EBE9DC" class="title" width="150">
        <select name="bolist" size="1" id="bolist_id" onChange="detail_view();" class="sel_all">  <!--�����ڵ�, ������ ���-->
          <option value="">��ü</option>
<%
//			writeBolistOpt(session, out, true);
%>
        </select>
    </td>

<%--�Ǹű���,���������� �μ�,����,������ ���ð���--%>
<%--if("110".equals(jobcd) || "120".equals(jobcd)){--%>
<%--
    <td bgcolor="#EBE9DC" class="title" width="200">
		<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��ȸ����
		&nbsp;
		<select name="viewflag" size="1" class="sel_all">
			<option value="1" selected>�μ���</option>
			<option value="2">������</option>
			<option value="3">������</option>
		</select>
	</td>
--%>
<%--���������� ����,������ ���ð���--%>
<%--}else if("310".equals(jobcd)){--%>
<%--
    <td bgcolor="#EBE9DC" class="title" width="200">
		<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��ȸ����
		&nbsp;
		<select name="viewflag" size="1" class="sel_all">
			<option value="2" selected>������</option>
			<option value="3">������</option>
		</select>
	</td>
--%>
<%--}--%>

    <td bgcolor="#EBE9DC" class="title" align="right">&nbsp;
      <!--<input type="image" id="search_id" border="0" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="right" onclick="window.event.returnValue=false;">-->
    </td>
  </tr>
  <tr>
    <td height="3" colspan="6">
      <!--����-->
    </td>
  </tr>
 </form>
</table>
<!--�˻���-->
<!--list start-->
<!--list end-->
<!--HTML IFRAME START------------------------------------------------------------------------------->
<center>
<iframe name="ifrm2" src="/ss/reader/1701" width="860" height="550" frameborder="0" scrolling="no"></iframe>
</center>
<iframe name="ifrm1" width="0" height="0"></iframe>
<form name="rdrsrch_list_form" method="post" action="" >
<input type="hidden" name="bocd" value="">
<input type="hidden" name="rdr_no" value="">
<input type="hidden" name="find_type" value="">
</form>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
