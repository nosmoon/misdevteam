<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ss_common_1176_a.jsp
* ���     : ���� �˻� �˾�
* �ۼ����� : 2003-04-13
* �ۼ���   : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    int listCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
%>

<html>
<head>
<title>::: ���ڰ˻�::::</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<meta http-equiv="expired" content="0">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">

<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
// �̺�Ʈ ����
window.returnValue	 = "";

// �̺�Ʈ �ڵ鷯 �ʱ�ȭ
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
    init();
    check_enter_search();
    document.rdr_search_form.rdr_no.focus();
}

// �� ��ȿ�� üũ
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// ���� �Ű����� ó��
function init(){
    var lo_form = document.rdr_search_form;

    if(window.dialogArguments){
        lo_form.rdrnm.value = window.dialogArguments;
    }
}

// ����Ű�� ���� �˻� ����� ���ڸ��� ���� ��� ���ڸ����� �˻��� �����Ѵ�.
function check_enter_search(){
    var lo_form1 = document.rdr_search_form;

	if(lo_form1.rdrnm.value != ''){
		lo_form1.addr3.value = '';
	    lo_form1.action = "/ss/common/1178";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	}
}

// ��Ϻ���
function list_search(){
    var lo_form1 = document.rdr_search_form;

    // ���ڹ�ȣ, �̸� �� �ϳ��� �˻��׸����� �ԷµǾ�� �Ѵ�.
    if(    (lo_form1.rdr_no.value 		== '')
    	&& (lo_form1.rdrnm.value 		== '')){
    	alert("���ڹ�ȣ, �̸� �� ��� �ϳ��� �Է��ؾ� �մϴ�.");
		return;
    }

	// ���ڹ�ȣ�׸� 9�ڸ� �˻�
	if( (lo_form1.rdr_no.value != '') && (lo_form1.rdr_no.value.length != 9)){
		alert("���ڹ�ȣ�� 9�ڸ��Դϴ�.");
		return;
	}

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // ȭ�������� ��ȣ�� �ʱ�ȭ�Ѵ�.
    lo_form1.pageno.value = '1';

	// �˻� �׸� ������ /ss/common/1180 �������� ������.
    lo_form1.action = "/ss/common/1180";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ������ �̵�
function page_move(pageno) {
    var lo_form1 = document.rdr_search_form;

    // ���ڹ�ȣ, �̸� �� �ϳ��� �˻��׸����� �ԷµǾ�� �Ѵ�.
    if(    (lo_form1.rdr_no.value 		== '')
    	&& (lo_form1.rdrnm.value 		== '')){
    	alert("���ڹ�ȣ, �̸� �� ��� �ϳ��� �Է��ؾ� �մϴ�.");
		return;
    }

	// ���ڹ�ȣ�׸� 9�ڸ� �˻�
	if( (lo_form1.rdr_no.value != '') && (lo_form1.rdr_no.value.length != 9)){
		alert("���ڹ�ȣ�� 9�ڸ��Դϴ�.");
		return;
	}

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    // ���ڰ˻� ��ȸ������ "/ss/common/1180" �������� ������
    lo_form1.action = "/ss/common/1180";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �θ� �����쿡 ���� ����
function set_reader_info( 	 s_rdr_no         //���ڹ�ȣ
                            ,s_rdrnm          //���ڸ�
                            ,s_onlmembid      //�¶���ȸ�����̵�
                            ,s_dlvzip         //����� �����ȣ
                            ,s_dlvaddr        //����� �ּ�
                            ,s_dlvdtlsaddr    //����� ���ּ�
                            ,s_rdrtel_no1     //��ȭ��ȣ1
                            ,s_rdrtel_no2     //��ȭ��ȣ2
                            ,s_rdrtel_no3     //��ȭ��ȣ3
                            ,s_rdrptph_no1    //�޴�����ȣ1
                            ,s_rdrptph_no2    //�޴�����ȣ2
                            ,s_rdrptph_no3    //�޴�����ȣ3
                            ,s_email          //�����̸���
                            ,s_prn            //�ֹε�Ϲ�ȣ
                            ,s_onlmembseq     //�¶���ȸ���Ϸù�ȣ

						){
    window.returnValue =         s_rdr_no         //���ڹ�ȣ           
                        + "\n" + s_rdrnm          //���ڸ�             
                        + "\n" + s_onlmembid      //�¶���ȸ�����̵�   
                        + "\n" + s_dlvzip         //����� �����ȣ    
                        + "\n" + s_dlvaddr        //����� �ּ�        
                        + "\n" + s_dlvdtlsaddr    //����� ���ּ�    
                        + "\n" + s_rdrtel_no1     //��ȭ��ȣ1          
                        + "\n" + s_rdrtel_no2     //��ȭ��ȣ2          
                        + "\n" + s_rdrtel_no3     //��ȭ��ȣ3          
                        + "\n" + s_rdrptph_no1    //�޴�����ȣ1        
                        + "\n" + s_rdrptph_no2    //�޴�����ȣ2        
                        + "\n" + s_rdrptph_no3    //�޴�����ȣ3        
                        + "\n" + s_email          //�����̸���         
                        + "\n" + s_prn            //�ֹε�Ϲ�ȣ       
                        + "\n" + s_onlmembseq;    //�¶���ȸ���Ϸù�ȣ
    window.close();
}


// �˾� ����
function close_modal(){
    window.close();
}

-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsInit();list_search();">
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
        <form name="rdr_search_form" method="post">
			<input name="pageno" type="hidden" value ="1">			                	<!-- ���� ������ ��ȣ -->
			<input name="pagesize" type="hidden" value ="<%= listCount%>">	    <!-- �� ȭ��� ����Ʈ �׸� �� -->
			<input name="js_fn_nm" type="hidden" value ="page_move">
			<tr>
				<td bgcolor="#EBE9DC" width="60" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���ڹ�ȣ</td>
				<td bgcolor="#EBE9DC" class="title">
					<input type="text" name="rdr_no" size="9" class="text_box">
				</td>
				<td bgcolor="#EBE9DC" width="50" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�̸�</td>
				<td bgcolor="#EBE9DC" class="title">
					<input type="text" name="rdrnm" size="10" class="text_box">
				</td>
				<td bgcolor="#EBE9DC" class="title"title width="200">
					<img src="/html/comm_img/ic_title.gif" width="12" height="7">��/��/��
					<input type="text" name="addr3" size="12" class="text_box">
				</td>
				<td bgcolor="#EBE9DC" class="title" align="right">
					<input type="image" src="/html/comm_img/bu_search.gif" width="36" height="19" border="0" align="absmiddle" onclick="javascript:list_search();window.event.returnValue=false;">
				</td>
			</tr>         
        </form>
<!----------------------- ���ڰ˻� �� �� --------------------------->
      </table>
<!----------------------- ���ڸ�� ���� --------------------------->
      <table width="670"  cellpadding="2" cellspacing="0" class="gray" id="reader_list_id">
        <tr bgcolor="#DDDDDD">
		  <td width="59" align="center" class="gray"> ���ڹ�ȣ </td>
          <td width="59" height="22" align="center" class="gray" >���ڸ�</td>
		  <td width="59" align="center" class="gray"> ����ID </td>
          <td width="194" height="22" align="center" class="gray">�ּ�</td>
          <td width="88" height="22" align="center" class="gray">��ȭ��ȣ</td>
          <td width="88" height="22" align="center" class="gray">�޴�����ȣ</td>                    		            		          
          <td width="100" height="22" align="center" class="gray">Email</td>
        </tr>
<%--���ڸ�� ����--%>
<%

		for(int j=0; j<listCount; j++){
%>
        <tr bgcolor="#FFFFFF">
          <td class="gray">&nbsp;</td>
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
      <table width="670" border="0" cellspacing="0" cellpadding="0"  class="title2" align="center" id="page_move">
        <tr>
          <td align="center" height="25" bgcolor="#E8E8E8">
            <!--JSP PAGE START---------------------------------------------------------------------------------->
            <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
                    <jsp:param name = "pageno" 		value="0"/>
                    <jsp:param name = "totalcnt" 	value="0"/>
                    <jsp:param name = "js_fn_nm" 	value="page_move"/>
                    <jsp:param name = "pagesize" 	value="<%= listCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
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