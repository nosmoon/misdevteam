<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : sl_reader_1140_p.jsp
* ���       : ������������(���������˾�-�ʱ�ȭ��)
* �ۼ�����   : 2003-12-12
* �ۼ���     : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<html>
<head>
<title>::::��������::::</title>
<meta http-equiv="Content-Type" content="text/html; charset=KSC5601">
<link rel="stylesheet" href="/html/comm_css/sal.css" type="text/css">
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
			form.target = "ifrm";
			form.submit();
		}
	}

	// �� visual initializing
    function jsInit(){
    	setEventHandler();
		setEnterKeyEventHandler();
        setInputBackgroundColor();
    }

	// ������ �ε��� �� �⺻������ �˻�
    function default_search(){

   		var lo_form = document.his_search_form;

		var ls_args = ":"; // dialog argument
		// dialog�� argument�� ������ ���ڿ��� ":" �� split
        //window.dialogArguments = "040000047:130";
        if(window.dialogArguments){
           if(window.dialogArguments.indexOf(":") == -1){
               alert("��ȿ���� ���� arguments �Դϴ�.");
               window.returnValue = "";
               window.close();
           }
           ls_args = window.dialogArguments;
           ga_args = ls_args.split(":");  //(ga_args[0] : ���ڹ�ȣ), (ga_args[1] : ��ü�ڵ� )

           if(ga_args[0] == "" || ga_args[1] == ""){
               alert("���ڹ�ȣ�� ��ü�ڵ尡 ���õ��� �ʾҽ��ϴ�.");
               window.returnValue = "";
               window.close();
           }

            window.returnValue = ga_args[0];

			lo_form.rdr_no.value = ga_args[0];
            lo_form.medicd.value = ga_args[1];
            lo_form.pid.value = "1150"; //���ʴ� �������� ��� ��ȸ
			lo_form.pageno.value = "1";
			lo_form.pagesize.value = "9";

			window.setTimeout("stop_interval()", 5000);
            sync_medicd(); // argument ���� medicd �� ��ü�ڵ� ��ϰ� ��ġ��Ų��.

			lo_form.action = "/ss/slreader/1150";
			lo_form.target = "ifrm";
			lo_form.submit();
        }
    }

	// ������ �׺���̼�
    function page_move(i_pageno){
		var lo_search_form = document.his_search_form;
		lo_search_form.pageno.value = i_pageno;
        lo_search_form.pagesize.value = "9";
        if(!check_all(lo_search_form, "/ss/slreader/" + lo_search_form.pid.value)) return;
		return;
    }

	// ���� ��ȸ
    function his_list_search(s_pid) {
		var ls_pid  = "";
		if(s_pid == "") ls_pid = "1150"; //defaut �������� ��ȸ
 		else ls_pid = s_pid;

        var lo_medi_form = medi_ifrm.document.bohndl_medi_list_form;
        var lo_search_form = document.his_search_form;
		lo_search_form.pid.value = ls_pid;
        // �κ������� ��� check�� ��ü�ڵ尡 �־�� ���� ó���� ������
		var j = 0;
		if(lo_medi_form.medicd.length){
			for(var i=0; i<lo_medi_form.medicd.length; i++) { // üũ�� �Ǽ��� �ջ�
				if(lo_medi_form.medicd[i].checked) j++;
			}
		}else{
			if(lo_medi_form.medicd.checked) j++;
		}
		if(j==0) { // üũ�� ���� ���� ��
			alert('üũ�� ��ü�� �������� �ʽ��ϴ�.');
			return;
		}

        lo_search_form.pageno.value = "1";
        lo_search_form.pagesize.value = "9";
        var ls_concat_str = "##";
        lo_search_form.medicd.value 		= concatenate_with_delimiter(lo_medi_form.medicd, ls_concat_str, lo_medi_form.medicd);		// ��ü�ڵ�

//alert(lo_search_form.medicd.value);
		if(!check_all(lo_search_form, "/ss/slreader/" + s_pid)) return;
		return;
    }

    // �ش� �ε����� key_obj�� üũ�Ǿ��ִ����� ���� concat_str�� ����� ���ڿ��� �����Ѵ�.
    // array_obj�� collection type�̴�.
    function concatenate_with_delimiter(array_obj, concat_str, key_obj) {
        var ls_ret_str = "";
        var ls_obj_val;

		if(array_obj.length){
            for(var i=0; i<array_obj.length; i++) {
                if(key_obj[i].checked) {
                    ls_obj_val = array_obj[i].value;
                    //if(ls_obj_val=="") ls_obj_val = null;
                    ls_ret_str += (concat_str + ls_obj_val);
                }
            }
		}else{
            if(key_obj.checked) {
                ls_obj_val = array_obj.value;
                //if(ls_obj_val=="") ls_obj_val = null;
                ls_ret_str += (concat_str + ls_obj_val);
            }
        }

        ls_ret_str = ls_ret_str.substr(concat_str.length);

        return ls_ret_str;
    }


    // Ÿ��Ʋ üũ �ڽ� Ŭ�� �̺�Ʈ �ڵ鷯
	function set_checkbox_state(o_this){
        var lo_form = medi_ifrm.document.bohndl_medi_list_form;
        if(o_this.checked == false){
    		on_off_checkbox(lo_form.medicd, "off");
        }else{
           	on_off_checkbox(lo_form.medicd, "on");
        }
        return;
    }

	// Ÿ��Ʋ üũ �ڽ� Ŭ���� medi_ifrm �� �ִ� ��� üũ �ڽ��� ���� Ȥ�� ����
    // s_flg("on","off")
    function on_off_checkbox(o_checkbox, s_flg){
		if(!o_checkbox) return;
        if(o_checkbox.length){ // üũ�ڽ��� ������ �ϰ��( array �� ���)
        	for(var i=0; i<o_checkbox.length; i++){
                if(s_flg == "on"){
                	o_checkbox[i].checked=true;
                }else{
                  	o_checkbox[i].checked=false;
                }
            }
        }else{ // �Ѱ� �ϰ��
            if(s_flg == "on"){
                o_checkbox.checked=true;
            }else{
                o_checkbox.checked=false;
            }
        }

    }


    //dialog argument�� �Ѿ�� ��ü�ڵ� �� �˻������� ��ü ����� �Ͱ� ����ȭ
    var o_interval = ""; // interval ȣ��
	function sync_medicd(){
        if(o_interval == ""){
			o_interval=window.setInterval("check_medi_list()",200);
        }else{
        	stop_interval();
        }
    }

	//argument�� �Ѱ� ���� ��ü�ڵ忡 �ش��ϴ� ��ü�� ��ü��Ͽ��� üũ( ����ȭ )
	function check_medi_list(){
        if( !medi_ifrm.document.bohndl_medi_list_form || medi_ifrm.document.bohndl_medi_list_form == "undefined" ) return;
		var lo_search_form = document.his_search_form;
        var lo_medi_form = medi_ifrm.document.bohndl_medi_list_form;
		var ls_medicd = lo_search_form.medicd.value;

		if(lo_medi_form.medicd.length){
			for(var i=0; i<lo_medi_form.medicd.length; i++) {
				if(lo_medi_form.medicd[i].value == ls_medicd)  lo_medi_form.medicd[i].checked = true;
				else lo_medi_form.medicd[i].checked = false;
			}
		}else{
			lo_medi_form.medicd.checked = true;
		}
        stop_interval();
	}

	//sync_medicd �� interval�� ������ �� ����
    function stop_interval(){
        if(o_interval!=""){
            window.clearInterval(o_interval);
        }
    }

	//â�ݱ�
	function close_modal(){
		window.close();
	}

-->
</script>

</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="5" topmargin="5" marginwidth="5" marginheight="5" class="scroll1" onload="jsInit();default_search();">
<!--title-->
<table width="860" border="0" cellspacing="0" cellpadding="0" height="100%">
  <tr>
    <td  height="7">
      <!-----��������-- -->
    </td>
  </tr>
  <tr>
    <td align="center" height="33" class="pup">
      <!--title-->
      <table width="860" border=0 cellpadding=0 cellspacing=0>
        <tr>
          <td width=2> <img src="/html/slcomm_img/car_01.gif" width=2 height=3 ></td>
          <td background="/html/slcomm_img/car_02.gif"></td>
          <td> <img src="/html/slcomm_img/car_03.gif" width=2 height=3 ></td>
        </tr>
        <tr>
          <td width=2> <img src="/html/slcomm_img/car_04.gif" width=2 height=23 ></td>
          <td background="/html/slcomm_img/car_05.gif" align="center" class="pup"> <img src="/html/slcomm_img/ic_pup.gif" width="19" height="8" align="absmiddle">
            <!--title �ڸ�-->
            �������� <img src="/html/slcomm_img/ic_pup.gif" width="19" height="8" align="absmiddle"></td>
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
    <td align="center" class="pup" valign="top">
      <!--����Ʈ ����-->
      <table width="860" border="0" cellspacing="0" cellpadding="2">
        <tr valign="top">
          <td width="220">
            <!--�˻� -->
            <table width="220" border="0" cellspacing="0" cellpadding="2">
              <form name="his_search_form" method="post" >
                <input type=hidden name=rdr_no   > <!--���ڹ�ȣ          -->
                <input type=hidden name=medicd   > <!--��ü����Ʈ         -->
                <input type=hidden name=pageno   > <!--����������         -->
                <input type=hidden name=pagesize > <!--�������� ������ �Ǽ�-->
                <input type=hidden name=pid      > <!--���α׷� id (�̺�Ʈ ��ȣ)-->
              <tr>
                <td bgcolor="#EBE9DC" class="title" width="35"><img src="/html/slcomm_img/ic_title.gif" width="11" height="7" align="absmiddle">�Ⱓ</td>
                <td bgcolor="#EBE9DC" class="title" width="175">
                  <input name="frdt" type="text" size="9" class="text_box" dataType="date" caption="��������" value="">
                  ~
                  <input name="todt" type="text" size="9" class="text_box" dataType="date" caption="��������" value="">
                </td>
              </tr>
              <tr>
                <td height="3" colspan="2">
                  <!--����-->
                </td>
              </tr>
              </form>
            </table>
            <!--����Ʈ -->
            <table width="220" border="0" cellpadding="1" cellspacing="0" bgcolor="#FFFFFF" class="gray" >
              <tr align="center">
                <td width="30" bgcolor="#dddddd" class="gray">
                  <input id="all_check" name="all_check" type="checkbox"  value="checkbox" onclick="set_checkbox_state(this)">
                </td>
                <td width="110" height="16" bgcolor="#dddddd" class="gray"> ��ü��
                </td>
                <td width="80" bgcolor="#dddddd" class="gray"> ��� </td>
              </tr>
            </table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
    <iframe name="medi_ifrm" src="/ss/slcommon/1600" height="207" width="220" scrolling="yes" frameborder="0" marginheight="0" marginwidth="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->

          </td>
          <td width="632">
            <!--��ư -->
            <table width="100%" border="0" cellspacing="0" cellpadding="2" id="his_title_id">
              <tr>
                <td width="292" height="27" bgcolor="#EBE9DC" class="title">��������</td>
                <td bgcolor="#EBE9DC" class="title" align="right" height="27">
                  <input type="image" src="/html/slcomm_img/bu_gu_1.gif" width="39" height="19" align="absbottom" onclick="his_list_search('1150');">
				  <input type="image" src="/html/slcomm_img/bu_move.gif" width="39" height="19" align="absmiddle" onclick="his_list_search('1170');">
				  <input type="image" src="/html/slcomm_img/bu_rest.gif" width="39" height="19" align="absmiddle" onclick="his_list_search('1160');"></td>
              </tr>
              <tr>
                <td height="3" colspan="2">
                  <!--����-->
                </td>
              </tr>
            </table>
            <!--����Ʈ -->
            <table width="100%" border="0" cellspacing="0" cellpadding="1" bgcolor="#FFFFFF" class="gray" id="his_list_id">
              <tr bgcolor="#dddddd" align="center">
                <td width="150" class="gray" height="23"  > �����Ⱓ </td>
                <td width="90" height="23" class="gray"  > ������ </td>
                <td width="99" class="gray" height="23"  > ��ü�� </td>
                <td width="65" class="gray"> Ȯ������ </td>
                <td class="gray" height="23"  > ��� </td>
              </tr>
              <tr>
                <td width="150" align="center" class="gray" >&nbsp;</td>
                <td class="gray" >&nbsp; </td>
                <td width="99" class="gray"  >&nbsp; </td>
                <td width="65" class="gray">&nbsp; </td>
                <td class="gray" >&nbsp; </td>
              </tr>
              <tr>
                <td width="150" align="center" class="gray">&nbsp;</td>
                <td class="gray">&nbsp; </td>
                <td width="99" class="gray" >&nbsp;</td>
                <td width="65" class="gray">&nbsp; </td>
                <td class="gray">&nbsp; </td>
              </tr>
              <tr>
                <td width="150" align="center" class="gray">&nbsp;</td>
                <td class="gray">&nbsp; </td>
                <td width="99" class="gray" >&nbsp; </td>
                <td width="65" class="gray">&nbsp; </td>
                <td class="gray">&nbsp; </td>
              </tr>
              <tr>
                <td width="150" align="center" class="gray">&nbsp;</td>
                <td class="gray">&nbsp; </td>
                <td width="99" class="gray" >&nbsp; </td>
                <td width="65" class="gray">&nbsp; </td>
                <td class="gray">&nbsp; </td>
              </tr>
              <tr>
                <td width="150" align="center" class="gray">&nbsp;</td>
                <td class="gray">&nbsp; </td>
                <td width="99" class="gray" >&nbsp; </td>
                <td width="65" class="gray">&nbsp; </td>
                <td class="gray">&nbsp; </td>
              </tr>
              <tr>
                <td width="150" align="center" class="gray">&nbsp;</td>
                <td class="gray">&nbsp; </td>
                <td width="99" class="gray" >&nbsp; </td>
                <td width="65" class="gray">&nbsp; </td>
                <td class="gray">&nbsp; </td>
              </tr>
              <tr>
                <td width="150" align="center" class="gray">&nbsp;</td>
                <td class="gray">&nbsp;</td>
                <td width="99" class="gray" >&nbsp; </td>
                <td width="65" class="gray">&nbsp; </td>
                <td class="gray">&nbsp; </td>
              </tr>
              <tr>
                <td width="150" align="center" class="gray">&nbsp;</td>
                <td class="gray">&nbsp;</td>
                <td width="99" class="gray" >&nbsp; </td>
                <td width="65" class="gray">&nbsp; </td>
                <td class="gray">&nbsp; </td>
              </tr>
              <tr>
                <td width="150" align="center" class="gray">&nbsp;</td>
                <td class="gray">&nbsp;</td>
                <td width="99" class="gray" >&nbsp;</td>
                <td width="65" class="gray">&nbsp; </td>
                <td class="gray">&nbsp; </td>
              </tr>
            </table>
            <!--��ư-->
            <table width="100%" border="0" cellspacing="0" cellpadding="0"  class="title2" align="center" id="navigator_id">
              <tr>
                <td align="center" height="25" bgcolor="#E8E8E8">
                  <!--JSP PAGE START---------------------------------------------------------------------------------->
                        <jsp:include page="/jsp/ss/slcomm_jsp/page_navigator.jsp">
                        <jsp:param name = "curr_page_no" 		value="1"/>
                        <jsp:param name = "total_records" 		value="0"/>
                        <jsp:param name = "js_fn_nm" 			value="page_move"/>
                        <jsp:param name = "records_per_page" 	value="9"/>
                        <jsp:param name = "page_set_gubun" 	value="0"/>
                        </jsp:include>
                  <!--JSP PAGE END------------------------------------------------------------------------------------>
                </td>
              </tr>
            </table>
          </td>
        </tr>
        <tr valign="top">
          <td>&nbsp;</td>
          <td>&nbsp;</td>
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
    <td align="center" height="27"  bgcolor="#959595"><input type="image" src="/html/slcomm_img/bu_close.gif" onclick="close_modal();window.event.returnValue=false;"></a></td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="100%" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>