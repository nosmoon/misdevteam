<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : sl_reader_1460_p.jsp
* ���       : ������������(�������ڸ���˾�-�ʱ�ȭ��)
* �ۼ�����   : 2004-04-06
* �ۼ���     : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	// request
    long curr_page_no = ((String)request.getParameter("pageno") == null)? 1 : Long.parseLong(request.getParameter("pageno"));
	long records_per_page = ((String)request.getParameter("pagesize") == null)? 10 : Long.parseLong(request.getParameter("pagesize"));
%>
<html>
<head>
<title>::::���ڰ˻�::::</title>
<meta http-equiv="Content-Type" content="text/html; charset=KSC5601">
<link rel="stylesheet" href="/html/comm_css/sal.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
    window.returnValue	 = "";
    // �� visual initializing
    function init(){
    	setEventHandler();
        setEnterKeyEventHandler();
        setInputBackgroundColor();

		var lo_form = document.dup_check_form;

		var ls_args = ":"; // dialog argument
		// dialog�� argument�� ������ ���ڿ��� ":" �� split
        if(window.dialogArguments){
           if(window.dialogArguments.indexOf(":") == -1){
               alert("��ȿ���� ���� arguments �Դϴ�.");
               window.returnValue = "";
               window.close();
            }
           ls_args = window.dialogArguments;
        }

        //�Ѱ��� arguments�� �����Ǹ� ������ �����ϸ鼭 ��������� ��.
        ga_args = ls_args.split(":");
        var ls_rdrnm            =   ga_args[0];         //���ڸ�
        var ls_rdrtel_no1       =   ga_args[1];         //��ȭ��ȣ1
        var ls_rdrtel_no2       =   ga_args[2];         //��ȭ��ȣ2
        var ls_rdrtel_no3       =   ga_args[3];         //��ȭ��ȣ3
        var ls_rdrptph_no1      =   ga_args[4];         //�޴�����ȣ1
        var ls_rdrptph_no2      =   ga_args[5];         //�޴�����ȣ2
        var ls_rdrptph_no3      =   ga_args[6];         //�޴�����ȣ3
        var ls_dlvzip           =   ga_args[7];         //�����ȣ
        var ls_dlvaddr          =   ga_args[8];         //�ּ�
        var ls_dlvdtlsaddr      =   ga_args[9];         //���ּ�
        var ls_dlvdong          =   ga_args[10];        //��
        var ls_dlvser_no        =   ga_args[11];        //ȣ��
        var ls_dlvbnji          =   ga_args[12];        //����
        var ls_prn              =   ga_args[13];        //�ֹε�Ϲ�ȣ
        var ls_email            =   ga_args[14];        //�̸���


		lo_form.rdrnm.value      	= 	ls_rdrnm       ;
        lo_form.rdrtel_no1.value 	= 	ls_rdrtel_no1  ;
        lo_form.rdrtel_no2.value 	= 	ls_rdrtel_no2  ;
        lo_form.rdrtel_no3.value 	= 	ls_rdrtel_no3  ;
        lo_form.rdrptph_no1.value	= 	ls_rdrptph_no1 ;
        lo_form.rdrptph_no2.value	= 	ls_rdrptph_no2 ;
        lo_form.rdrptph_no3.value	= 	ls_rdrptph_no3 ;
        lo_form.prn.value        	= 	ls_prn         ;
        lo_form.dlvzip.value     	= 	ls_dlvzip      ;
        lo_form.dlvaddr.value    	= 	ls_dlvaddr     ;
        lo_form.dlvdtlsaddr.value  	= 	ls_dlvdtlsaddr ;
        lo_form.dlvdong.value    	= 	ls_dlvdong     ;
        lo_form.dlvser_no.value  	= 	ls_dlvser_no   ;
        lo_form.dlvbnji.value    	= 	ls_dlvbnji     ;
        lo_form.email.value      	= 	ls_email       ;

        //lo_form.action = "/ss/slreader/1465";
        lo_form.action = "/jsp/ss/util/reqToInst.jsp";
        //lo_form.target = "ifrm";
        lo_form.submit();
    }

    // �� ��ȿ�� üũ & ����
    function check_all(form, s_uri){
		if(!validate(form)){
			return false;
		}
		else{
			makeValue(form); // "/" �� "," ����
         	form.action = s_uri;
			form.target = "ifrm";
			form.submit();
		}
	}

    // �θ� �����쿡 ���� ����
	function set_reader_info( s_rdr_no ){
        window.returnValue = s_rdr_no;         //���ڹ�ȣ
        close_modal();
    }

    //â�ݱ�
	function close_modal(){
		window.close();
	}
-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="5" topmargin="5" marginwidth="5" marginheight="5" class="scroll1" onload="init()">
<!--title-->
<table width="890" border="0" cellspacing="0" cellpadding="0" height="100%">
  <tr>
    <td  height="7">
      <!-----��������-- -->
    </td>
  </tr>
  <tr>
    <td align="center" height="33" class="pup">
      <!--title-->
      <table width="890" border=0 cellpadding=0 cellspacing=0>
        <tr>
          <td width=2> <img src="/html/slcomm_img/car_01.gif" width=2 height=3 ></td>
          <td background="/html/slcomm_img/car_02.gif"></td>
          <td> <img src="/html/slcomm_img/car_03.gif" width=2 height=3 ></td>
        </tr>
        <tr>
          <td width=2> <img src="/html/slcomm_img/car_04.gif" width=2 height=23 ></td>
          <td background="/html/slcomm_img/car_05.gif" align="center" class="pup"> <img src="/html/slcomm_img/ic_pup.gif" width="19" height="8" align="absmiddle">
          <!--title �ڸ�--> �������� ��� <img src="/html/slcomm_img/ic_pup.gif" width="19" height="8" align="absmiddle"></td>
          <td width=2><img src="/html/slcomm_img/car_06.gif" width=2 height=23 ></td>
        </tr>
        <tr>
          <td width=2><img src="/html/slcomm_img/car_07.gif" width=2 height=7 ></td>
          <td background="/html/slcomm_img/car_08.gif"></td>
          <td width=2> <img src="/html/slcomm_img/car_09.gif" width=2 height=7 ></td>
        </tr>
      </table>
      <!--title end-->
    </td>
  </tr>
  <tr>
    <td  height="7">
      <!-----����Ʈ���̿���-- -->
    </td>
  </tr>
  <tr>
    <td>
      <font color="red">*</font>�Ʒ� ��Ͽ��� Ư�����ڸ� ������ ��� �ش絶���� ������ ��ȸ �� �����߰����� �˾��� �ڵ����� ����˴ϴ�.
      ����, ���� �Է����� ���ڿ� �ߺ��Ǵ� ���ڰ� ��Ͽ� �������� �ʴ´ٸ� "�ݱ�"��ư�� Ŭ���Ͽ� â�� �����ð� �����߰� ������ ��� �����Ͻø� �˴ϴ�.
    </td>
  </tr>
  <tr>
    <td align="center" class="pup" valign="top">
<!----------------------- ���ڸ�� ���� --------------------------->
      <table width="890"  cellpadding="2" cellspacing="0" class="gray" id="reader_list_id">
        <tr bgcolor="#DDDDDD" align="center" >
          <td width="61" class="gray"> ���ڹ�ȣ</td>
          <td width="98" class="gray">���ڸ�</td>
          <td width="89" class="gray">�ֹε�Ϲ�ȣ</td>
          <td width="120" class="gray">�̸���</td>
          <td width="312" class="gray">�ּ�</td>
          <td width="90" class="gray">��ȭ��ȣ</td>
          <td width="90" class="gray">�޴�����ȣ</td>
        </tr>
<%--�������ڸ�� ����--%>
<%

		for(int j=0; j<records_per_page; j++){
%>
        <tr bgcolor="#FFFFFF">
          <td height="17" class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
        </tr>
<%
		}
%>
      </table>
      <!----------------------- ���ڸ�� �� --------------------------->
    </td>
  </tr>
  <tr>
    <td align="center" height="7">
      <!--�ϴܿ���-->
    </td>
  </tr>
  <tr>
    <td align="center" height="27"  bgcolor="#959595"><input type="image" src="/html/slcomm_img/bu_close.gif" onclick="close_modal();window.event.returnValue=false;"></a></td>
  </tr>
</table>
<form name="dup_check_form" method="post" style="display:none"><!-- �������ڸ�� ī��Ʈ�� Ȱ�� -->
    <input type=hidden name=accflag      value="20"><!--ó�� FLAG ('10' : �������� ī��Ʈ, '20' : �������ڸ����ȸ ) -->
    <input type=hidden name=rdrnm        value="">  <!--�����ڸ�          -->
    <input type=hidden name=rdrtel_no1   value="">  <!--��������ȭ��ȣ1   -->
    <input type=hidden name=rdrtel_no2   value="">  <!--��������ȭ��ȣ2   -->
    <input type=hidden name=rdrtel_no3   value="">  <!--��������ȭ��ȣ3   -->
    <input type=hidden name=rdrptph_no1  value="">  <!--�������޴���1     -->
    <input type=hidden name=rdrptph_no2  value="">  <!--�������޴���2     -->
    <input type=hidden name=rdrptph_no3  value="">  <!--�������޴���3     -->
    <input type=hidden name=prn          value="">  <!--�ֹι�ȣ          -->
    <input type=hidden name=dlvzip       value="">  <!--�����ȣ          -->
    <input type=hidden name=dlvaddr      value="">  <!--�ּ�              -->
    <input type=hidden name=dlvdtlsaddr  value="">  <!--���ּ�          -->
    <input type=hidden name=dlvdong      value="">  <!--��                -->
    <input type=hidden name=dlvser_no    value="">  <!--ȣ��              -->
    <input type=hidden name=dlvbnji      value="">  <!--����              -->
    <input type=hidden name=email        value="">  <!--�̸���            -->
</form>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="100%" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>