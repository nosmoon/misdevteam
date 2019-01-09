<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_alon_1801_a.jsp
* ���     : ���� ������
* �ۼ����� : 2004-03-12
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
	PS_L_DEPTEMP_ALON_PTCRDataSet ds = (PS_L_DEPTEMP_ALON_PTCRDataSet)request.getAttribute("ds");

    String searclosmm = Util.Uni2Ksc(Util.checkString(request.getParameter("closmm")));   //�˻� �������
    String searbocd   = Util.Uni2Ksc(Util.checkString(request.getParameter("bocd")));     //�˻� ���������ڵ�
    String seardeptcd = Util.Uni2Ksc(Util.checkString(request.getParameter("deptcd")));   //�˻� �μ��ڵ�
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


    //�����۾� ó��
    function alon_clos() {
        var lo_form1 = document.clos_form;

		//������� üũ
		if(!isDate(lo_form1.closmm.value+'01')) {
			alert('��������� ���Ŀ� ���� �ʰų� �Էµ��� �ʾҽ��ϴ�.\n��������� �ʼ��Է� �׸��Դϴ�.');
			lo_form1.closmm.focus();
			lo_form1.closmm.select();
			return;
		}

        //�Է��׸� ��ü üũ
		if(!validate(lo_form1)) return false;
		else{
			makeValue(lo_form1);
		}

        lo_form1.action = "/ps/allow/1806";
        lo_form1.target = "alonifrm";
        lo_form1.method = "post";
        lo_form1.submit();
    }


    //�����۾� ���ó��
    function clos_cancel() {
        var lo_form1 = document.clos_form;

		//������� üũ
		if(!isDate(lo_form1.closmm.value+'01')) {
			alert('��������� ���Ŀ� ���� �ʰų� �Էµ��� �ʾҽ��ϴ�.\n��������� �ʼ��Է� �׸��Դϴ�.');
			lo_form1.closmm.focus();
			lo_form1.closmm.select();
			return;
		}

		if(!validate(lo_form1)) return false;
		else{
			makeValue(lo_form1);
		}

        lo_form1.action = "/ps/allow/1811";
        lo_form1.target = "alonifrm";
        lo_form1.method = "post";
        lo_form1.submit();
    }


    //�������� ��ȸ
    function clos_search() {
        var lo_form1 = document.search_form;

    	//event check.
    	if(window.event) window.event.returnValue = false;

		//������� üũ
		if(!isDate(lo_form1.closmm.value+'01')) {
			alert('��������� ���Ŀ� ���� �ʰų� �Էµ��� �ʾҽ��ϴ�.\n��������� �ʼ��Է� �׸��Դϴ�.');
			lo_form1.closmm.focus();
			lo_form1.closmm.select();
			return;
		}

        //�Է��׸� ��ü üũ
		if(!validate(lo_form1)) return false;
		else{
			makeValue(lo_form1);
		}

        lo_form1.action = "/ps/allow/1816";
        lo_form1.target = "_self";
        lo_form1.method = "post";
        lo_form1.submit();
    }


    //���纰 �μ��˻�
    function bodept_search() {
        var lo_form1    = document.search_form;

        lo_form1.action = "/ps/common/1301";
        lo_form1.target = "alonifrm";
        lo_form1.method = "post";
        lo_form1.submit();
    }


    //�������� ���
    function clos_print() {
        var lo_form1 = document.search_form;

		//������� üũ
		if(!isDate(lo_form1.closmm.value+'01')) {
			alert('��������� ���Ŀ� ���� �ʰų� �Էµ��� �ʾҽ��ϴ�.\n��������� �ʼ��Է� �׸��Դϴ�.');
			lo_form1.closmm.focus();
			lo_form1.closmm.select();
			return;
		}
        //�Է��׸� ��ü üũ
		if(!validate(lo_form1)) return false;
		else{
			makeValue(lo_form1);
		}

        lo_form1.action = "/ps/allow/1821";
        lo_form1.target = "alonifrm";
        lo_form1.method = "post";
        lo_form1.submit();
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
	            document.all.list_zone.rows(i).style.backgroundColor = "#EDFFF1";
                //document.all.list_zone.rows(i).className = "over";
				if( (i%2) == 1 && document.all.list_zone.rows(i-1) != null){	    // ¦���̸� �ڽź��� 1 �� ���� Ȧ�� �ο���� ����
	                document.all.list_zone.rows(i-1).style.backgroundColor = "#EDFFF1";
                    //document.all.list_zone.rows(i-1).className = "over";
				}else if( (i%2) == 0 && document.all.list_zone.rows(i+1) != null){	// Ȧ���̸� �ڽź��� 1 �� ū ¦�� �ο���� ����
	                document.all.list_zone.rows(i+1).style.backgroundColor = "#EDFFF1";
                    //document.all.list_zone.rows(i+1).className = "over";
				}
	        }
	    }
	}
-->
</script>

</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsInit();clos_form.closmm.focus();">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle">����
      &gt; </b>���������</td>
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
        <!--print title -->
        <table width="830" border="0" cellspacing="0" cellpadding="2">
          <tr>
            <td height="27" class="title" bgcolor="#EBE9DC"><b>���������</b></td>
            <td height="27" class="title" width="130"  bgcolor="#EBE9DC" align="right">
              <img src="/html/comm_img/bu_day03.gif"    width="63" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="alon_clos();window.event.returnValue=false;">
              <img src="/html/comm_img/bu_cencle01.gif" width="63" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="clos_cancel();window.event.returnValue=false;">
            </td>
          </tr>
          <tr>
            <td height="3" colspan="2">
              <!--����-->
            </td>
          </tr>
        </table>
        <!--list -->
        <table  cellspacing="0" width="830" cellpadding="2" border="0" bgcolor="#FFFFFF" class="gray">
          <form name="clos_form" method="post" action="" >
          <tr>
            <td width="80" bgcolor="#dddddd" class="gray" >�������  <font color="red"> *</font></td>
            <td class="gray" >
              <input type="text" name="closmm" size="6" maxlength="6"  class="text_box" caption="�������" dataType="number" notEmpty >
            </td>
            <td width="80" bgcolor="#dddddd" class="gray" >���� <font color="red"> *</font></td>
            <td class="gray" >
              <select name="bocd" size="1" class="sel_all" caption="����" notEmpty >
                <option value="" selected >����</option>
<%
	for(int i=0; i<ds.intgbocdcur.size(); i++){
		PS_L_DEPTEMP_ALON_PTCRINTGBOCDCURRecord intgbocdcurRec = (PS_L_DEPTEMP_ALON_PTCRINTGBOCDCURRecord)ds.intgbocdcur.get(i);
%>
                <option value="<%= intgbocdcurRec.bocd%>" ><%= intgbocdcurRec.bonm%></option>
<%
	}
%>
              </select>
            </td>
            <td width="80" bgcolor="#dddddd" class="gray" >�������� <font color="red"> *</font></td>
            <td class="gray" >
              <input type="text" name="paydt" size="10" maxlength="10" class="text_box" caption="��������" dataType="date" notEmpty >
            </td>
          </tr>
          </form>
        </table>
      </td>
    </tr>
    <tr>
      <td height="10">
        <!------����--- -->
      </td>
    </tr>
    <tr>
      <td>
        <!--Ÿ��Ʋ -->
        <table width="830" border="0" cellspacing="0" cellpadding="2">
          <tr>
            <td height="27" class="title" bgcolor="#EBE9DC"><b>���������</b></td>
            <td height="27" class="title" width="50"  bgcolor="#EBE9DC" align="right">
              <img src="/html/comm_img/bu_print.gif" width="39" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="clos_print();window.event.returnValue=false;">
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
        <!--search-->
        <table width="830" border="0" cellspacing="0" cellpadding="2" class="title1" bgcolor="#EBE9DC">
          <form name="search_form" method="post" action="" onsubmit="clos_search();">
          <tr>
            <td width="80"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle"> ������� <font color="red"> *</font> </td>
            <td width="120">
              <input type="text" name="closmm" size="6" maxlength="6" value="<%= searclosmm%>" class="text_box" caption="�������" dataType="number" notEmpty >
            </td>
            <td width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���� <font color="red"> *</font></td>
            <td width="120">
              <select name="bocd" size="1" class="sel_all" caption="����" notEmpty onchange="bodept_search();">
                <option value="" <% if(searbocd.equals("")) out.print("selected"); %>>����</option>
<%
	for(int i=0; i<ds.intgbocdcur.size(); i++){
		PS_L_DEPTEMP_ALON_PTCRINTGBOCDCURRecord intgbocdcurRec = (PS_L_DEPTEMP_ALON_PTCRINTGBOCDCURRecord)ds.intgbocdcur.get(i);
%>
                <option value="<%= intgbocdcurRec.bocd%>" <% if(searbocd.equals(intgbocdcurRec.bocd)) out.print("selected"); %>><%= intgbocdcurRec.bonm%></option>
<%
	}
%>
              </select>
            </td>
            <td width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�μ�</td>
            <td>
              <select name="deptcd" size="1" class="sel_all" style="width:80;" caption="�μ�" notEmpty id="bodept_sel" >
                <option value="%" <% if(seardeptcd.equals("%") || seardeptcd.equals("")) out.print("selected"); %>>��ü</option>
<%--�μ� �޺��ڽ�--%>
<%
	for(int i=0; i<ds.deptlistcur.size(); i++){
		PS_L_DEPTEMP_ALON_PTCRDEPTLISTCURRecord deptlistcurRec = (PS_L_DEPTEMP_ALON_PTCRDEPTLISTCURRecord)ds.deptlistcur.get(i);
%>
                <option value="<%= deptlistcurRec.deptcd%>" <% if(seardeptcd.equals(deptlistcurRec.deptcd)) out.print("selected"); %>><%= deptlistcurRec.deptnm%></option>
<%
	}
%>
              </select>
              <input type="image" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle" border="0" style="cursor:hand" onclick="clos_search();window.event.returnValue=false;">
            </td>
          </tr>
          </form>
        </table>
        <!--����Ʈ -->
        <table cellspacing="0" width="830" cellpadding="1" border="0" class="gray" bgcolor="#FFFFFF" id="list_zone">
          <tr>
            <td rowspan="2" class="gray" bgcolor="#dddddd" align="center" >�μ���</td>
            <td width="80"  class="gray" bgcolor="#dddddd" align="center" >�����ȣ</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >���ޱݾ�</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >�����ݾ�</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >�����ްǼ�</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >���޽ű�</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >���޿���</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >�����ű�</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >��������</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >�����ޱ�</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >��������</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >��ǰ����</td>
          </tr>
          <tr>
            <td width="80"  class="gray" bgcolor="#dddddd" align="center" >�����</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >�����ݾ�</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >��������</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >��������</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >Ư������</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >��å����</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >��ټ���</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >ķ���μ���</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >���ݼ���</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >��ȭ����</td>
            <td width="60"  class="gray" bgcolor="#dddddd" align="center" >��ǰ����</td>
          </tr>
<%--��������--%>
<%
    //TOTAL �� ��������
    int  tot_paytot_amt          = 0;   //���ޱݾ���
    int  tot_dductot_amt         = 0;   //�����ݾ���
    int  tot_payrealnoit         = 0;   //�����ްǼ���
    int  tot_paynewnoit          = 0;   //���޽ű���
    int  tot_paylinknoit         = 0;   //���޿�����
    int  tot_dducnewnoit         = 0;   //�����ű���
    int  tot_dduclinknoit        = 0;   //����������
    int  tot_advnalon_amt        = 0;   //�����ޱ���
    int  tot_dcl_amtamt          = 0;   //�����ݾ���
    int  tot_dcl_amtalontot_amt  = 0;   //����������
    int  tot_rsltalontot_amt     = 0;   //����������
    int  tot_spcalontot_amt      = 0;   //Ư��������
    int  tot_posialontot_amt     = 0;   //��å������
    int  tot_prsntalontot_amt    = 0;   //��ټ�����
    int  tot_campalontot_amt     = 0;   //ķ���μ�����
    int  tot_cashalon_amt        = 0;   //���ݼ�����
    int  tot_busnshow_amt        = 0;   //����������
    int  tot_telfee_amt          = 0;   //��ȭ������
    int  tot_retnalon_amt        = 0;   //��ǰ������
    int  tot_gdsdducalon_amt     = 0;   //��ǰ������

	for(int i=0; i<ds.empaloncur.size(); i++){
		PS_L_DEPTEMP_ALON_PTCREMPALONCURRecord empaloncurRec = (PS_L_DEPTEMP_ALON_PTCREMPALONCURRecord)ds.empaloncur.get(i);
%>
          <tr onmouseover="change_row_color_in(this);" onmouseout="change_row_color_out(this);" >
            <td rowspan="2" class="gray" align="center">&nbsp;<%= empaloncurRec.deptnm%>&nbsp;</td>
            <td width="80"  class="gray" align="center">&nbsp;<%= empaloncurRec.boemp_no%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.paytot_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.dductot_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.paynewnoit+empaloncurRec.paylinknoit-empaloncurRec.dducnewnoit-empaloncurRec.dduclinknoit)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.paynewnoit)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.paylinknoit)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.dducnewnoit)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.dduclinknoit)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.advnalon_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.busnshow_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.retnalonamt)%>&nbsp;</td>
          </tr>
          <tr onmouseover="change_row_color_in(this);" onmouseout="change_row_color_out(this);" >
            <td width="80"  class="gray" align="center">&nbsp;<%= empaloncurRec.flnm%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.dcl_amtamt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.dcl_amtalontot_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.rsltalontot_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.spcalontot_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.posialontot_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.prsntalontot_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.campalontot_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.cashalon_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.telfee_amt)%>&nbsp;</td>
            <td width="60"  class="gray" align="right" ><%= Util.comma(empaloncurRec.gdsdducalonamt)%>&nbsp;</td>
          </tr>
<%
        //TOTAL
        tot_paytot_amt          = tot_paytot_amt         + empaloncurRec.paytot_amt        ;   //���ޱݾ���
        tot_dductot_amt         = tot_dductot_amt        + empaloncurRec.dductot_amt       ;   //�����ݾ���
        tot_paynewnoit          = tot_paynewnoit         + empaloncurRec.paynewnoit        ;   //���޽ű���
        tot_paylinknoit         = tot_paylinknoit        + empaloncurRec.paylinknoit       ;   //���޿�����
        tot_dducnewnoit         = tot_dducnewnoit        + empaloncurRec.dducnewnoit       ;   //�����ű���
        tot_dduclinknoit        = tot_dduclinknoit       + empaloncurRec.dduclinknoit      ;   //����������
        tot_advnalon_amt        = tot_advnalon_amt       + empaloncurRec.advnalon_amt      ;   //�����ޱ���
        tot_dcl_amtamt          = tot_dcl_amtamt         + empaloncurRec.dcl_amtamt        ;   //�����ݾ���
        tot_dcl_amtalontot_amt  = tot_dcl_amtalontot_amt + empaloncurRec.dcl_amtalontot_amt;   //����������
        tot_rsltalontot_amt     = tot_rsltalontot_amt    + empaloncurRec.rsltalontot_amt   ;   //����������
        tot_spcalontot_amt      = tot_spcalontot_amt     + empaloncurRec.spcalontot_amt    ;   //Ư��������
        tot_posialontot_amt     = tot_posialontot_amt    + empaloncurRec.posialontot_amt   ;   //��å������
        tot_prsntalontot_amt    = tot_prsntalontot_amt   + empaloncurRec.prsntalontot_amt  ;   //��ټ�����
        tot_campalontot_amt     = tot_campalontot_amt    + empaloncurRec.campalontot_amt   ;   //ķ���μ�����
        tot_cashalon_amt        = tot_cashalon_amt       + empaloncurRec.cashalon_amt      ;   //���ݼ�����
        tot_busnshow_amt        = tot_busnshow_amt       + empaloncurRec.busnshow_amt      ;   //����������
        tot_telfee_amt          = tot_telfee_amt         + empaloncurRec.telfee_amt        ;   //��ȭ������
        tot_retnalon_amt        = tot_retnalon_amt       + empaloncurRec.retnalonamt       ;   //��ǰ������
        tot_gdsdducalon_amt     = tot_gdsdducalon_amt    + empaloncurRec.gdsdducalonamt    ;   //��ǰ������
	}

    //�����ްǼ���
    tot_payrealnoit  = tot_paynewnoit + tot_paylinknoit - tot_dducnewnoit - tot_dduclinknoit;  //�����ްǼ���
%>

<%---------------------
	for(int i=0; i<showreccnt-ds.empaloncur.size(); i++){
%>
          <tr>
            <td rowspan="2" class="gray" align="center">&nbsp;</td>
            <td width="70"  class="gray" align="center">&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
          </tr>
          <tr>
            <td width="70"  class="gray" align="center">&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
            <td width="60"  class="gray" align="right" >&nbsp;</td>
          </tr>
<%
	}
--------------------------------------------------------------------------%>
          <tr onmouseover="change_row_color_in(this);" onmouseout="change_row_color_out(this);" >
            <td rowspan="2" colspan="2" class="gray" align="center"><font color="red">�� ��</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_paytot_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_dductot_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_payrealnoit)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_paynewnoit)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_paylinknoit)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_dducnewnoit)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_dduclinknoit)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_advnalon_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_busnshow_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_retnalon_amt)%>&nbsp;</font></td>
          </tr>
          <tr onmouseover="change_row_color_in(this);" onmouseout="change_row_color_out(this);" >
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_dcl_amtamt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_dcl_amtalontot_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_rsltalontot_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_spcalontot_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_posialontot_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_prsntalontot_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_campalontot_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_cashalon_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_retnalon_amt)%>&nbsp;</font></td>
            <td width="60"  class="gray" align="right" ><font color="red"><%=Util.comma(tot_gdsdducalon_amt)%>&nbsp;</font></td>
          </tr>
        </table>
      </td>
    </tr>
  </table>
</body>
<iframe name="alonifrm" width=100 height=0></iframe>
</html>
