<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ss_reader_1615_l.jsp
* ���     : ������Ȳ-���ڵ�ް���-���ں񱳰˻�
* �ۼ����� : 2004-04-21
* �ۼ���   : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    //dataset �ν��Ͻ� ����κ�
	CO_L_RDRCRTS_APLC_CMPRDataSet ds = (CO_L_RDRCRTS_APLC_CMPRDataSet)request.getAttribute("ds");

    //ȭ�鿡 ������ ���ڵ� �� ����
    int   showRecCnt  =  5;
%>

<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">

<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">

<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
    //�̺�Ʈ�ʱ�ȭ
    function jsInit() {
        setEventHandler();
    }


	//�˻���ư
	function sear_button(pageno) {
	    var lo_form1 = document.search_form;

		if(lo_form1.hd_rownum.value == null || lo_form1.hd_rownum.value =="") {
			alert("���ڼ����� �˻��ϼ���");
			return false;
		}
    	//event check.
    	
    	if(window.event) window.event.returnValue = false;

		lo_form1.hd_searcd.value  = lo_form1.sh_searcd.value; 
		lo_form1.hd_searnm.value  = lo_form1.sh_searnm.value; 
		lo_form1.hd_medicd.value  = lo_form1.sh_medicd.value; 
		lo_form1.hd_phone1.value  = lo_form1.sh_phone1.value;
		lo_form1.hd_phone2.value  = lo_form1.sh_phone2.value;
		lo_form1.hd_phone3.value  = lo_form1.sh_phone3.value;

		if (!chk_search(pageno)) return;
	}


	//PAGE��ư
	function list_search(pageno) {
	    var lo_form1 = document.search_form;
	    
	    //���� �˻����ǰ� ���濩�� üũ
		lo_form1.sh_searcd.value  = lo_form1.hd_searcd.value; 
		lo_form1.sh_searnm.value  = lo_form1.hd_searnm.value; 
		lo_form1.sh_medicd.value  = lo_form1.hd_medicd.value; 
		lo_form1.sh_phone1.value  = lo_form1.hd_phone1.value;
		lo_form1.sh_phone2.value  = lo_form1.hd_phone2.value;
		lo_form1.sh_phone3.value  = lo_form1.hd_phone3.value;

		if (!chk_search(pageno)) return;
	}


	//���ں񱳰˻� ����Ʈ ��ȸ
	function chk_search(pageno) {	
	    var lo_form1 = document.search_form;

		lo_form1.pageno.value   =   pageno;

		if((lo_form1.sh_searnm.value == null || lo_form1.sh_searnm.value == "") &&
		   (lo_form1.sh_phone1.value == null || lo_form1.sh_phone1.value == "") &&
		   (lo_form1.sh_phone2.value == null || lo_form1.sh_phone2.value == "") &&
		   (lo_form1.sh_phone3.value == null || lo_form1.sh_phone3.value == "")) {
			alert("�˻�� ��ȭ��ȣ �����ϳ��� �ʼ� �Դϴ�.");
			return false;
			lo_form1.sh_searnm.focus();
		}
        //�Է��׸� ��ü üũ
        if(!validate(lo_form1)) return false;
		makeValue(lo_form1);
	    lo_form1.method = "post";
	    lo_form1.action = "/ss/reader/1620";
	    lo_form1.target = "cmprifrm";
	    lo_form1.submit();
	}

	//���ڹ�ȣ ���γѱ�
	function rdrno_set(rdr_no,rownum,bocd, bonm){
		var lo_form = parent.document.grad_form;

		if(lo_form.rdr_no!=null && lo_form.bocd!=null){
            lo_form.rdr_no[rownum].value = rdr_no;
            lo_form.bocd[rownum].value = bocd;
            lo_form.bonm[rownum].value = bonm;
			//lo_form.rdrgrad[rownum].value = 1;
			lo_form.dtlsprocstat[rownum].value = 20;
			lo_form.grad_check[rownum].checked = 'true';
            return;
		} else {
            var inx_nm = "rdr_no"+rownum;
			var inx_bocd = "bocd"+rownum;
			var inx_bonm = "bonm"+rownum;
			//var inx_grad = "rdrgrad"+rownum;
			var inx_dtlsprocstat = "dtlsprocstat"+rownum;
			var inx_grad_check = "grad_check"+rownum;

            lo_form.all[inx_nm].value = rdr_no;
            lo_form.all[inx_bocd].value = bocd;
            lo_form.all[inx_bonm].value = bonm;
			//lo_form.all[inx_grad].value = 1;
			lo_form.all[inx_dtlsprocstat].value = 20;
			lo_form.all[inx_grad_check].checked = true;
            return;

		}
	}

    //���� üũ�ڽ� ��ü üũ �Ǵ� ����
    function checkAll() {
    	//filtering
    	if (!window.event) return;

    	var lo_form1  =  document.cmpr_form;
    	var li_len    =  new Number(lo_form1.listcnt.value);

    	if (li_len < 1) return;

    	var lo_src    =  window.event.srcElement;
    	var ls_name   =  window.event.srcElement.name;

    	for(var i=0; i<li_len; i++) {
    		if (lo_src.checked) {
    		    if (document.all(ls_name + new String(i)).disabled == true)  continue;
    		    document.all(ls_name + new String(i)).checked = true;
    		}
    		else {
    		    document.all(ls_name + new String(i)).checked = false;
    		}
    	}
    }


	// rowspan �Ǿ� �ִ� 2���� �ο쿡�� ���콺 OUT �� ���� ���� /
	function change_row_color_out(obj){
	    for (i=0; i < document.all.list_zone.rows.length; i++) {
	    	if(document.all.list_zone.rows(i) == obj){
	            document.all.list_zone.rows(i).style.backgroundColor = "";
                //document.all.list_zone.rows(i).className = "out";
				if( (i%2) == 1 && document.all.list_zone.rows(i-1) != null){	    // ¦���̸� �ڽź��� 1 �� ���� Ȧ�� �ο���� ����
	                document.all.list_zone.rows(i-1).style.backgroundColor = "";
                    //document.all.list_zone.rows(i-1).className = "out";
				}else if( (i%2) == 0 && document.all.list_zone.rows(i+1) != null){	// Ȧ���̸� �ڽź��� 1 �� ū ¦�� �ο���� ����
	                document.all.list_zone.rows(i+1).style.backgroundColor = "";
                    //document.all.list_zone.rows(i+1).className = "out";
				}
	        }
	    }
	}


	// rowspan �Ǿ� �ִ� 2���� �ο쿡�� ���콺 IN �� ���� ����
	function change_row_color_in(obj){
	    for (i=0; i < document.all.list_zone.rows.length; i++) {
	    	if(document.all.list_zone.rows(i) == obj){
	            document.all.list_zone.rows(i).style.backgroundColor = "#CCCCBB";
                //document.all.list_zone.rows(i).className = "over";
				if( (i%2) == 1 && document.all.list_zone.rows(i-1) != null){	    // ¦���̸� �ڽź��� 1 �� ���� Ȧ�� �ο���� ����
	                document.all.list_zone.rows(i-1).style.backgroundColor = "#CCCCBB";
                    //document.all.list_zone.rows(i-1).className = "over";
				}else if( (i%2) == 0 && document.all.list_zone.rows(i+1) != null){	// Ȧ���̸� �ڽź��� 1 �� ū ¦�� �ο���� ����
	                document.all.list_zone.rows(i+1).style.backgroundColor = "#CCCCBB";
                    //document.all.list_zone.rows(i+1).className = "over";
				}
	        }
	    }
	}
-->
</script>

</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="gray"  onload="jsInit();">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr> 
    <td height="10"> 
      <!--������ ���� ����-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
  <tr> 
    <td bgcolor="#EBE9DC" class="title" height="27"><b>���ں񱳰˻�</b></td>
  </tr>
  <tr> 
    <td height="3"> 
      <!--����-->
    </td>
  </tr>
</table>
<!--�˻�����-->
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
  <form name="search_form" method="post" action="" onsubmit="sear_button(1);">
  <input type="hidden" name="pageno"     value="1" >               <%--����������--%>
  <input type="hidden" name="pagesize"   value="<%=showRecCnt%>">  <%--���������� ���ڵ��--%>
  <input type="hidden" name="js_fn_nm"   value="list_search">      <%--�������̵��� ȣ��Ǵ� �ڹٽ�ũ��Ʈ �̸�--%>

  <%--������ �̵��� ���� �˻����ǰ� ������ �����ϱ� ���� Hidden Type--%>
  <input type="hidden" name="hd_searcd"  value="">                 <%--�˻�����--%>
  <input type="hidden" name="hd_searnm"  value="">                 <%--�˻���--%>
  <input type="hidden" name="hd_medicd"  value="">                 <%--��û��ü--%>
  <input type="hidden" name="hd_phone1"  value="">                 <%--��ȭ��ȣ1--%>
  <input type="hidden" name="hd_phone2"  value="">                 <%--��ȭ��ȣ2--%>
  <input type="hidden" name="hd_phone3"  value="">                 <%--��ȭ��ȣ3--%>
  <Input type="hidden" name="hd_rownum"  value="">                 <%--Row �ѹ�--%>
  <tr bgcolor="#EBE9DC">
    <td class="title">
      <table width="830" border="0" cellspacing="0" cellpadding="2">
        <tr> 
          <td width="90"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">
             <select name="sh_searcd" size="1" class="sel_all" >
               <option value="NM" >���ڸ�</option>
               <option value="NO" >���ڹ�ȣ</option>
               <option value="PR" >�ֹι�ȣ</option>
               <option value="ML" >�̸���</option>
             </select>
          </td>
          <td> 
            <input type="text" name="sh_searnm" size="15" maxlength="30" class="text_box" caption="�˻���">
          </td>
          <td width="40"><img src="/html/comm_img/ic_title.gif" width="12" height="7">��ü</td>
          <td> 
             <select name="sh_medicd" size="1" class="sel_all" style="width:70;" >
               <option value="ALL" selected >��ü</option>
<%--��ü �޺��ڽ� ����--%>
<%
	for(int i=0; i<ds.medicdcur.size(); i++){
		CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord medicdcurRec = (CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord)ds.medicdcur.get(i);
%>
               <option value="<%= medicdcurRec.cicodeval%>"><%= medicdcurRec.cicdnm%></option>
<%
	}
%>
             </select>
          </td>
          <td width="80" ><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��ȭ/�޴���</td>
          <td> 
            <input type="text" name="sh_phone1" size="4" maxlength="4" class="text_box">
            <input type="text" name="sh_phone2" size="4" maxlength="4" class="text_box">
            <input type="text" name="sh_phone3" size="4" maxlength="4" class="text_box">
          </td>
          <td align="right"> 
            <input type="image" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="sear_button(1);window.event.returnValue=false;">
          </td>
        </tr>
      </table>
    </td>
  </tr>
  <tr> 
    <td height="3"> 
      <!--����-->
    </td>
  </tr>
  </form>
</table>
<!--�˻���-->
<!--list start -->
<table width="830" border="0" align="center" cellpadding="1" cellspacing="0" bgcolor="#ffffff" class="gray" id="list_zone">
  <form name="cmpr_form" method="post" action="" onsubmit="sear_button(1);">
  <input type="hidden" name="listcnt" value="<%=showRecCnt%>">
  <tr bgcolor="#dddddd" align="center"> 
    <td class="gray" width="80"  >��������</td>
    <td class="gray" width="90"  >����</td>
    <td class="gray" width="90"  >���ڹ�ȣ</td>
    <td class="gray" width="100" >���ڸ�</td>
    <td class="gray" width="100" >ȸ�����̵�</td>
    <td class="gray" width="50"  >���</td>
    <td class="gray" width="100" >��ü</td>
    <td class="gray" width="100" >����ȣ��</td>
    <td class="gray" width="110" >�ֹι�ȣ</td>
  </tr>
  <tr bgcolor="#dddddd" align="center"> 
    <td class="gray" colspan="3" >��ȭ/������ȭ/�޴���</td>
    <td class="gray" colspan="2" >�̸���</td>
    <td class="gray" colspan="4" >�ּ�</td>
  </tr>
<%--ȭ�鿡 ������ �⺻ ���ڵ���� ���� ���信 �°� Display--%>
<%
	for(int i=0; i < showRecCnt ; i++) {
%>
  <tr> 
    <td class="gray" width="80"   align="center">&nbsp;</td>
    <td class="gray" width="90"   align="center">&nbsp;</td>
    <td class="gray" width="90"   align="center">&nbsp;</td>
    <td class="gray" width="100"  align="left"  >&nbsp;</td>
    <td class="gray" width="100"  align="left"  >&nbsp;</td>
    <td class="gray" width="50"   align="center">&nbsp;</td>
    <td class="gray" width="100"  align="left"  >&nbsp;</td>
    <td class="gray" width="100"  align="center">&nbsp;</td>
    <td class="gray" width="110"  align="left"  >&nbsp;</td>
  </tr>
  <tr> 
    <td class="gray" colspan="3"  align="left"  >&nbsp;</td>
    <td class="gray" colspan="2"  align="left"  >&nbsp;</td>
    <td class="gray" colspan="4"  align="left"  >&nbsp;</td>
  </tr>
<%
	}
%>
  </form>
</table>
<!---button-->
<table  width="830" cellpadding="0" border="0" cellspacing="0" class="title2" align="center" id="page_zone">
  <tr>
    <td height="20" bgcolor="#E8E8E8">
      <div align="center">
        <!--JSP PAGE START---------------------------------------------------------------------------------->
        <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
        <jsp:param name  ="pageno"        value="1"/>
        <jsp:param name  ="totalcnt"       value="0"/>
        <jsp:param name  ="js_fn_nm"            value="list_search"/>
        <jsp:param name  ="records_per_page"    value="<%=showRecCnt%>"/>
        <jsp:param name  ="page_set_gubun"      value="0"/>
        </jsp:include>
        <!--JSP PAGE END------------------------------------------------------------------------------------>
      </div>
    </td>
  </tr>
</table>
<iframe name="cmprifrm" width=0 height=0></iframe>
</body>
</html>
