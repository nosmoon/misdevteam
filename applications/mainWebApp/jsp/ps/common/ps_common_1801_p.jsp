<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_common_1801_p.jsp
* ���     : ���� �����ȣ �˻� (�˻� ��ư�� ���� �˾� ȭ��)
* �ۼ����� : 2004-01-30
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<html>
<head>
<title>::::�����ȣã��::::</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
	window.returnValue	 = "";

	// �� ��ȿ�� üũ & ����
    function check_all(form, s_uri){

		if(!validate(form)){
			return false;
		}
		else{
			makeValue(form); // "/" �� "," ����
			form.action = s_uri;
			form.target = "zipifrm";
			form.submit();
		}
	}


	// �� visual initializing
    function init(){
    	setEventHandler();

		var lo_form = document.zip_search_form;

    	//event check.
    	if(window.event) window.event.returnValue = false;

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

        ga_args = ls_args.split(":");  //ga_args[0] �˻���, ga_args[1] job_flg("A" ��ü �˻�, "S" ������ �˻�)

		if(ga_args[0] != ""){ //�����ȣ �˻��� �����ȣ�� argument �� �޾��� ��� �˻��� �����Ѵ�.
            // �˻����� ������ �˻��Ͽ��� �����ȣ ������ �ƴ϶��, ��/��/������ ������ ������ ������.
            if(validate_zip(ga_args[0])){
            	lo_form.zip.value           = deleteHyphen(trim(ga_args[0]));
            }else{
            	lo_form.addr3.value         = ga_args[0];
            }

            if(ga_args[1] == "A"){ // Ư�� ���� �ڵ带 �Է����� ������ ��ü �����ȣ������ �˻�
            	lo_form.bocd.value     		= "";
            }else{
            	lo_form.bocd.value     		= "";

            }

			lo_form.search_word.value	= ga_args[0];
            lo_form.pageno.value     	= "1";
            lo_form.pagesize.value     	= "10000";
            lo_form.action = "/ps/common/1106";
            lo_form.target = "zipifrm";
            lo_form.submit();
        }
    }

	// �����ȣ ��ȿ�� ����
    function validate_zip(s_zip){
		if(trim(s_zip) == "") return false;
        var format = /^(\d{3})(-{0,1})(\d{3})$/;
        return isValidFormat(s_zip, format);
    }

    // �θ� �����쿡 ���� ����
	function set_addr( 	 s_zip		    //�����ȣ
						,s_addr		    //�ּ�
						,s_bgnn		    //���۹���
						,s_endn		    //������
						,s_bocd		    //�ش����������ڵ�
						,s_bonm		    //�ش�������
						,s_telno1	    //�ش�������ȭ��ȣ1
						,s_telno2	    //�ش�������ȭ��ȣ2
						,s_telno3       //�ش�������ȭ��ȣ3
                        ,s_sendyn ){    //�����߼� ���ɿ���
        window.returnValue =         s_zip
							+ "\n" + s_addr
							+ "\n" + s_bgnn
							+ "\n" + s_endn
							+ "\n" + s_bocd
							+ "\n" + s_bonm
							+ "\n" + s_telno1
							+ "\n" + s_telno2
							+ "\n" + s_telno3
                            + "\n" + s_sendyn;
        window.close();
    }


	// �����ȣ �����ȸ
    function zip_search(i_pageno){

		/*
        if(zip_search_form.addr3.value == null || zip_search_form.addr3.value.replace(/ /gi, "") == "" ){
			window.event.returnValue = false;
           	return false;
        }
		*/
		var lo_form = document.zip_search_form;

        if(ga_args[1] == "A"){ 			   // ��ü �����ȣ������ �˻��ϵ��� �� ( "S" Ư������ )
            lo_form.bocd.value     	= "";
        }else{
        	lo_form.bocd.value     	= "";

        }

        if(validate_zip(lo_form.search_word.value)){
            lo_form.zip.value           = deleteHyphen(trim(lo_form.search_word.value));
        }else{
            lo_form.addr3.value         = lo_form.search_word.value;
        }
        lo_form.pageno.value     	= i_pageno;
        lo_form.pagesize.value     	= "10000";

		if(!check_all(lo_form,"/ps/common/1106")) return;
        return;
    }

	// â�ݱ�
	function close_modal(){
		window.close();
	}
-->
</script>

</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="5" topmargin="5" marginwidth="5" marginheight="5" class="scroll1" onload="init()">
<!--�˾� ������ 450*270-->
<table width="100%" border="0" cellspacing="0" cellpadding="0" height="100%">
  <tr>
    <td height="76">
      <!--top img -->
      <table width=100% border=0 cellpadding=0 cellspacing=0>
        <tr>
          <td width="16"> <img src="/html/comm_img/zip_find_01.gif" width=16 height=76 ></td>
          <td width=72> <img src="/html/comm_img/zip_find_02.gif" width=72 height=76 ></td>
          <td width=133> <img src="/html/comm_img/zip_find_03.gif" width=133 height=76 ></td>
          <td background="/html/comm_img/zip_find_04.gif" >&nbsp;</td>
        </tr>
      </table>
      <!--top img end -->
    </td>
  </tr>
  <tr>
    <td align="center" class="pup" valign="top">
      <!--�����ȣ �˻�-->
      <table width="400" border="0" cellspacing="0" cellpadding="1">
        <form name="zip_search_form" method="post" action="" onsubmit="zip_search(1);window.event.returnValue=false;">
	    <input type="hidden" name="bocd"     value="">	    <!--���������ڵ�-->
        <input type="hidden" name="zip"      value="">		<!--�����ȣ-->
       	<input type="hidden" name="addr3"    value="">		<!--��/��/��-->
        <input type="hidden" name="pageno"   value="">		<!--������������ȣ-->
    	<input type="hidden" name="pagesize" value="">		<!--�������� ���ڵ��-->
        <input type="hidden" name="job_flg"  value="P">		<!-- action �� Popup â���� �Ͼ���� �ǹ��Ѵ�. -->
        <tr>
          <td width="7"><img src="/html/comm_img/ic_arr02.gif" width="7" height="11"></td>
          <td>&quot;��/��/��&quot; �� �����ϰ� �Է� (<font  color="#0066cc">��) ����� �� ���</font>
            ) �� �˻���ư�� Ŭ��</td>
        </tr>
        <tr>
          <td width="7">&nbsp;</td>
          <td>&nbsp;��/��/��
            <input size="16" name="search_word" class="text_box" caption="�����ȣ Ȥ�� ��/��/����" notEmpty >
            <input type="image" src="/html/comm_img/bu_search.gif" style="cursor:hand" align="absmiddle" onclick="zip_search(1);window.event.returnValue=false;" >
          </td>
        </tr>
        <tr>
          <td colspan="2" height="15">
            <!--�ּҰ� ������ ������ ������ ���Ѱ��� -->
          </td>
        </tr>
        </form>
      </table>
      <table width="410" cellspacing="0" cellpadding="1" border="1" bordercolor="#FFFFFF" style="display:none" id="zip_list">
        <tr align="center" bgcolor="#979596">
          <td width="60"><font color="#ffffff">�����ȣ</font></td>
          <td><font color="#ffffff">�ּ�</font></td>
        </tr>
        <tr bgcolor="#F2F2F2">
          <td width="60" align="center">&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr bgcolor="#dddddd">
          <td width="60" align="center">&nbsp;</td>
          <td >&nbsp;</td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td align="center" height="7">
      <!--�ϴܿ���-->
    </td>
  </tr>
  <tr>
    <td align="center" height="27"  bgcolor="#959595">
      <input type="image" src="/html/comm_img/bu_close.gif" style="cursor:hand" onclick="close_modal();window.event.returnValue=false;">
    </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="zipifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
