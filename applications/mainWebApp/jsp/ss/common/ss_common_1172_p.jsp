<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : ss_common_1172_p.jsp
* ���       : ���ڰ˻��˾�(�⺻��)(�ʱ�ȭ��)
* �ۼ�����   : 2004-01-15
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
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
    window.returnValue	 = "";
    // �� visual initializing
    function init(){
    	setEventHandler();
		//setEnterKeyEventHandler();
        //set_background_color();

		var lo_form = document.reader_search_form;

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
        ga_args = ls_args.split(":");

        var	ls_bocd				=	ga_args[0];        	//���������ڵ�
        var	ls_rdr_extndt		=	ga_args[1];    		//Ȯ������(�ܺ�Ȯ��Ȯ�ν� �ߺ����� üũ��)
        var	ls_rdr_extnno		=	ga_args[2];     	//Ȯ���ȣ(�ܺ�Ȯ��Ȯ�ν� �ߺ����� üũ��)
        var	ls_search_order		=	ga_args[3];        	//��������('DSNO','NO','NM','TEL','ADDR','AMT') '' �̸� DEFAULT�� 'DSNO'
        var	ls_search_ad		=	ga_args[4];    		//"ASC" or "DESC"(Ȯ�� ���)
        var	ls_search_cond		=	ga_args[5];        	//�˻�����('ALL', 'DSTC', 'DSNO', 'NO', 'NM', 'ADDRS', 'TEL') '' �̸� 'ALL'
        var	ls_search_word		=	ga_args[6];        	//�˻���
        var	ls_search_stop 		=	ga_args[7];   		//������������ ��ȸ ����(Ȯ�� ���)

        //���������ڵ尡 '12345'�̰� ���ڹ�ȣ�� '030000001' �� ���ڸ� ���ڹ�ȣ�� �˻� �ϰ��� �� ����� �� : ���������ڵ�(12345) �˻�����(NO) ���ڹ�ȣ(030000001)

		if((ls_rdr_extndt != "" && ls_rdr_extnno != "") || (ls_bocd != "" && ls_search_word != "" )){
			lo_form.bocd.value        	=	ls_bocd			;
            lo_form.rdr_extndt.value  	= 	ls_rdr_extndt	;
            lo_form.rdr_extnno.value  	= 	ls_rdr_extnno	;
            lo_form.search_order.value	= 	ls_search_order	;
            lo_form.search_ad.value   	=	ls_search_ad	;
            lo_form.search_cond.value 	= 	ls_search_cond	;
            lo_form.search_word.value 	= 	ls_search_word	;
            lo_form.search_stop.value 	= 	ls_search_stop 	;
            lo_form.pageno.value     	=   "1"				;
            lo_form.pagesize.value     	=   "10"			;
            lo_form.action = "/ss/common/1120"			;
            lo_form.target = "ifrm"							;
            lo_form.submit()								;
        }
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
	function set_reader_info( 	 s_rdr_no         //���ڹ�ȣ
                                ,s_paty_clsfcd    //��ü�����ڵ�
                                ,s_natnclsfcd     //���������ڵ�
                                ,s_onlmembid      //�¶���ȸ�����̵�
                                ,s_rdrnm          //���ڸ�
                                ,s_prn            //�ֹε�Ϲ�ȣ
                                ,s_ernno          //����ڵ�Ϲ�ȣ
                                ,s_email          //�����̸���
                                ,s_dlvzip         //����� �����ȣ
                                ,s_dlvcd          //����� �ڵ�(�ּ��ڵ�)
                                ,s_dlvaddr        //����� �ּ�
                                ,s_dlvdtlsaddr    //����� ���ּ�
                                ,s_dlvdong        //����� ��
                                ,s_dlvser_no      //����� ȣ
                                ,s_dlvbnji        //����� ����
                                ,s_dlvteamcd      //����� ���ڵ�
                                ,s_dlvdstccd      //����� �����ڵ�
                                ,s_dlvno          //��޹�ȣ
                                ,s_dlvintvno      //��޻��̹�ȣ
                                ,s_dlvmthdcd      //��޹���ڵ�
                                ,s_dlvqty         //�ѱ����μ�
                                ,s_rdrtel_no1     //��ȭ��ȣ1
                                ,s_rdrtel_no2     //��ȭ��ȣ2
                                ,s_rdrtel_no3     //��ȭ��ȣ3
                                ,s_rdrptph_no1    //�޴�����ȣ1
                                ,s_rdrptph_no2    //�޴�����ȣ2
                                ,s_rdrptph_no3    //�޴�����ȣ3
                                ,s_realsubsamt    //�ѽǱ�����
                                ,s_subsamt        //�ѱ�����
                                ,s_dscnamt        //�����ξ�
                                ,s_rptvsubsdt     //���ʱ�������
                                ,s_rptvrdr_extndt //����Ȯ������
                                ,s_addrnm         //������ڵ��(�ּ��ڵ��)
                                ,s_mil            //���ϸ���
							){
        window.returnValue =         s_rdr_no         //���ڹ�ȣ
                            + "\n" + s_paty_clsfcd    //��ü�����ڵ�
                            + "\n" + s_natnclsfcd     //���������ڵ�
                            + "\n" + s_onlmembid      //�¶���ȸ�����̵�
                            + "\n" + s_rdrnm          //���ڸ�
                            + "\n" + s_prn            //�ֹε�Ϲ�ȣ
                            + "\n" + s_ernno          //����ڵ�Ϲ�ȣ
                            + "\n" + s_email          //�����̸���
                            + "\n" + s_dlvzip         //����� �����ȣ
                            + "\n" + s_dlvcd          //����� �ڵ�(�ּ��ڵ�)
                            + "\n" + s_dlvaddr        //����� �ּ�
                            + "\n" + s_dlvdtlsaddr    //����� ���ּ�
                            + "\n" + s_dlvdong        //����� ��
                            + "\n" + s_dlvser_no      //����� ȣ
                            + "\n" + s_dlvbnji        //����� ����
                            + "\n" + s_dlvteamcd      //����� ���ڵ�
                            + "\n" + s_dlvdstccd      //����� �����ڵ�
                            + "\n" + s_dlvno          //��޹�ȣ
                            + "\n" + s_dlvintvno      //��޻��̹�ȣ
                            + "\n" + s_dlvmthdcd      //��޹���ڵ�
                            + "\n" + s_dlvqty         //�ѱ����μ�
                            + "\n" + s_rdrtel_no1     //��ȭ��ȣ1
                            + "\n" + s_rdrtel_no2     //��ȭ��ȣ2
                            + "\n" + s_rdrtel_no3     //��ȭ��ȣ3
                            + "\n" + s_rdrptph_no1    //�޴�����ȣ1
                            + "\n" + s_rdrptph_no2    //�޴�����ȣ2
                            + "\n" + s_rdrptph_no3    //�޴�����ȣ3
                            + "\n" + s_realsubsamt    //�ѽǱ�����
                            + "\n" + s_subsamt        //�ѱ�����
                            + "\n" + s_dscnamt        //�����ξ�
                            + "\n" + s_rptvsubsdt     //���ʱ�������
                            + "\n" + s_rptvrdr_extndt //����Ȯ������
                            + "\n" + s_addrnm         //������ڵ��(�ּ��ڵ��)
                            + "\n" + s_mil;           //���ϸ���
        window.close();
    }


	// ���� ��� �˻�(�����ȸ)
	function reader_list_search(i_pageno){
        var lo_form = document.reader_search_form;
        if(!validate_reader_search_word()){
        	window.event.returnValue =false;
            return;
        }

        lo_form.bocd.value = "<%=Util.checkString(request.getParameter("bocd"))%>";
        lo_form.pageno.value = i_pageno;
        lo_form.pagesize.value = "10";

		if(!check_all(lo_form, "/ss/common/1120")) return;
		return;
	}

    // ���� ��� �˻��� �˻����� ����
    function validate_reader_search_word(){
        var lo_form = document.reader_search_form;
        var ls_cond = lo_form.search_cond.value;
        var ls_word = lo_form.search_word.value;

       	if(ls_cond == "DSTC"){  		// ������ ���
           	if(!isValidFormat(ls_word, /^([\w\d]{3})$/)){
            	alert("��ȿ���� ���� �����Դϴ�.");
                lo_form.search_word.select();
                return false;
            }
       	}else if(ls_cond == "DSNO") {	// ����+��޹�ȣ
        	if(!isValidFormat(ls_word, /^(\d{3})-(\d{3})(-{0,1})(\d{0,2})$/)){
               	alert("��ȿ���� ���� ����+��޹�ȣ �Դϴ�.\n ��) 101-101 �Ǵ� 101-101-01");
                lo_form.search_word.select();
                return false;
            }
        }else if(ls_cond == "NO") {		// ���ڹ�ȣ
        	if(!isValidFormat(ls_word, /^(\d{9})$/)){
               	alert("��ȿ���� ���� ���ڹ�ȣ �Դϴ�.\n ��)031234567");
                lo_form.search_word.select();
                return false;
            }
        }else if(ls_cond == "TEL") {	// ��ȭ��ȣ
        	if(!isValidFormat(ls_word, /^(\d{3,4})-(\d{4})$/)){
               	alert("��ȿ���� ���� ��ȭ��ȣ �Դϴ�.\n ��)������ȣ ���� 234-1234");
                lo_form.search_word.select();
                return false;
            }
        }
        return true;
    }

    //form elements �� input ��ҵ��� background color ����
    function set_background_color(){
        var forms = document.forms;
        var elements;
        for(var i=0; i<forms.length; i++){
        	elements = forms(i).elements;
        	for(var j=0; j<elements.length; j++){
                if(elements(j).tagName != "INPUT") continue;
            	if(elements(j).readOnly || elements(j).disabled ){
                	elements(j).style.backgroundColor = "#E6E6E6";
                	elements(j).style.color = "#6B6B6B";
            	}else{
                	elements(j).style.backgroundColor = "#FFFFFF";
                    elements(j).style.color = "#000000";
            	}
            }
        }
    }

    //Ư�� ���� elements �� input ��ҵ��� background color ����
    function set_background_color_form(o_form){
        var elements = o_form.elements;
        for(var j=0; j<elements.length; j++){
            if(elements(j).tagName != "INPUT") continue;
            if(elements(j).readOnly || elements(j).disabled ){
                elements(j).style.backgroundColor = "#E6E6E6";
                elements(j).style.color = "#000000";
            }else{
                elements(j).style.backgroundColor = "#FFFFFF";
                elements(j).style.color = "#000000";
            }

        }
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
<table width="670" border="0" cellspacing="0" cellpadding="0" height="100%">
  <tr>
    <td  height="7">
      <!-----��������-- -->
    </td>
  </tr>
  <tr>
    <td align="center" height="33" class="pup">
      <!--title-->
      <table width=670 border=0 cellpadding=0 cellspacing=0>
        <tr>
          <td width=2> <img src="/html/comm_img/car_01.gif" width=2 height=3 ></td>
          <td background="/html/comm_img/car`	_02.gif"></td>
          <td> <img src="/html/comm_img/car_03.gif" width=2 height=3 ></td>
        </tr>
        <tr>
          <td width=2> <img src="/html/comm_img/car_04.gif" width=2 height=23 ></td>
          <td background="/html/comm_img/car_05.gif" align="center" class="pup"> <img src="/html/comm_img/ic_pup.gif" width="19" height="8" align="absmiddle">
              <!--title �ڸ�-->
      ���� �˻� <img src="/html/comm_img/ic_pup.gif" width="19" height="8" align="absmiddle"></td>
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
      <!-----����Ʈ���̿���-- -->
    </td>
  </tr>
  <tr>
    <td align="center" class="pup" valign="top">
            <table width="670" border="0" cellspacing="0" cellpadding="2" bgcolor="#EBE9DC" height="30">
<!----------------------- ���ڰ˻� �� ���� --------------------------->
        <form name="reader_search_form" method="post">
            <input type=hidden name=bocd			 value="">		 <!--	���������ڵ�                                                           -->
            <input type=hidden name=rdr_extndt	     value="">       <!--	Ȯ������(�ܺ�Ȯ��Ȯ�ν� �ߺ����� üũ��)                               -->
            <input type=hidden name=rdr_extnno	     value="">       <!--	Ȯ���ȣ(�ܺ�Ȯ��Ȯ�ν� �ߺ����� üũ��)                               -->
            <input type=hidden name=search_ad	     value="">       <!--	"ASC" or "DESC"(Ȯ�� ���)                                             -->
            <input type=hidden name=search_stop      value="">       <!--	������������ ��ȸ ����(Ȯ�� ���)                                      -->
            <input type=hidden name=pageno			 value="">       <!--   ����������             -->
            <input type=hidden name=pagesize	     value="">       <!--�������� ������ �Ǽ�     -->
          <tr>
            <td width="163" height="30" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
                <select name="search_order" class="sel_all" caption="��������">
                  <option value="DSNO">����+���</option>
                  <option value="NO">���ڹ�ȣ</option>
                  <option value="NM">���ڸ�</option>
                  <option value="TEL">��ȭ��ȣ</option>
                  <!--option value="MIL">���ϸ���</option-->
                  <option value="ADDR">�ּ�</option>
                  <option value="AMT">�ѱ�����</option>
                </select></td>
            <td width="499" class="title" height="30"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
                <select name="search_cond" class="sel_all" caption="�˻�����">
                  <option value="ALL">��ü</option>
                  <option value="DSTC">����</option>
                  <option value="DSNO">����+���</option>
                  <option value="NO">���ڹ�ȣ</option>
                  <option value="NM">���ڸ�</option>
                  <option value="ADDR">���ּ�</option>
                  <option value="ADDRS">�ּ���ü</option>
                  <option value="TEL">��ȭ��ȣ</option>
                  <option value="EMAIL">�̸���</option>
                </select>
                <input name="search_word" type="text" size="10" class="text_box" onkeydown='if(window.event.keyCode == "13"){reader_list_search(1);window.event.returnValue=false;}'>
                <input name="image4" type="image" id="reader_list_search_btn" onclick="reader_list_search(1);window.event.returnValue=false;" src="/html/comm_img/bu_search.gif" align="absmiddle" width="36" height="19" border="0"></td>
          </tr>
        </form>
<!----------------------- ���ڰ˻� �� �� --------------------------->
      </table>
<!----------------------- ���ڸ�� ���� --------------------------->
      <table width="670"  cellpadding="2" cellspacing="0" class="gray" id="reader_list_id">
        <tr bgcolor="#DDDDDD">
          <td width="64" height="22" align="center" class="gray">����+���</td>
          <td width="59" align="center" class="gray"> ���ڹ�ȣ </td>
          <td width="87" height="22" align="center" class="gray" >���ڸ�</td>
          <td width="88" height="22" align="center" class="gray">��ȭ��ȣ</td>
          <td width="86" height="22" align="center" class="gray">���ϸ���</td>
          <td width="194" height="22" align="center" class="gray">�ּ�</td>
          <td width="62" height="22" align="center" class="gray"><span title="���ڰ� �������� ��ü�� �Ǳ�����(����μ�X��ü�ܰ�-���ξ�)�� ��� ���� �ݾ�">�ѱ�����</span></td>
        </tr>
<%--���ڸ�� ����--%>
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
          <td align="right" class="gray">&nbsp;</td>
        </tr>
<%
		}
%>
      </table>
      <table width="670" border="0" cellspacing="0" cellpadding="0"  class="title2" align="center" id="page_navigator_id">
        <tr>
          <td align="center" height="25" bgcolor="#E8E8E8">
            <!--JSP PAGE START---------------------------------------------------------------------------------->
                <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
                <jsp:param name = "curr_page_no" 		value="1"/>
                <jsp:param name = "total_records" 		value="0"/>
                <jsp:param name = "js_fn_nm" 			value="reader_list_search"/>
                <jsp:param name = "records_per_page" 	value="10"/>
                <jsp:param name = "page_set_gubun" 		value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
          </td>
        </tr>
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
    <td align="center" height="27"  bgcolor="#959595"><input type="image" src="/html/comm_img/bu_close.gif" onclick="close_modal();window.event.returnValue=false;"></a></td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>