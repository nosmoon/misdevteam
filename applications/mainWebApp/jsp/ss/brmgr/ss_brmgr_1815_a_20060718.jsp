<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : ss_brmgr_1815_a.jsp
* ��� 	 	 : �Ǹ�����-��Ž� ����Ʈ���� ��Ȳ���� �� ��� �ʱ�ȭ��
* �ۼ����� 	 : 2004-02-24
* �ۼ��� 	 : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ########## ���� ###########
* ���ϸ� 	 : ss_brmgr_1815_a.jsp
* ��� 	 	 : �Ǹű�-�����濵-����Ʈ������-����Ʈ���� ��Ȳ���� �� ��� �ʱ�ȭ��
* �ۼ����� 	 : 2005-10-05
* �ۼ��� 	 : ����
---------------------------------------------------------------------------------------------------%>
<%--
    int page_rec = 5;
--%>

<%
    int page_rec = 5;

    // dataset �ν��Ͻ� ����κ�
    SS_L_COMM_APT_THRWDataSet ds = (SS_L_COMM_APT_THRWDataSet)request.getAttribute("ds");  // request dataset

    String concatDelimiter = "##";	// �ϰ�������Ʈ�� ���� ������
    String incmgtype = Util.getSessionParameterValue(request, "uid", true);
    String reg1 = "";
    boolean applySession = true;	// ���� ���� ����

    if( (incmgtype.substring(0,1)).equals("c") ) {
      reg1 = "10";
    } else if( (incmgtype.substring(0,1)).equals("i") ) {
      reg1 = "20";
    } else {
      reg1 = "30";
    }
%>

<html>
<head>
<style>
    .on_1{background-image:url("/html/comm_img/tb3_01.gif");}
    .on_2{background-image:url("/html/comm_img/tb3_02.gif");}
    .on_3{background-image:url("/html/comm_img/tb3_03.gif");}
    .on_4{background-image:url("/html/comm_img/tb3_04.gif");}
    .on_5{background-image:url("/html/comm_img/tb3_05.gif");}
    .on_6{background-image:url("/html/comm_img/tb3_06.gif");}
    .off_1{background-image:url("/html/comm_img/tb4_01.gif");}
    .off_2{background-image:url("/html/comm_img/tb4_02.gif");}
    .off_3{background-image:url("/html/comm_img/tb4_03.gif");}
    .off_4{background-image:url("/html/comm_img/tb4_04.gif");}
    .off_5{background-image:url("/html/comm_img/tb4_05.gif");}
    .off_6{background-image:url("/html/comm_img/tb4_06.gif");}
</style>
<script language="javascript">

var xmlHttp;
var xmlReqUrl;
var xmlQueryString;

<!--
    //�������ʱ�ȭ�� ��ư������ EventHandlerȣ��
    function jsInit(){
            setEventHandler();
            setEnterKeyEventHandler();
            setInputBackgroundColor();
//            displayTab(tab_form.tabKey.value);
        }

//��ư ���� ����
    function btnInit( initFlag ){

        document.all("insert_btn").disabled = false;
        document.all("update_btn").disabled = true;
        document.all("delete_btn").disabled = true;
        document.all("clear_btn").disabled = false;

        if( initFlag == "3" ) { //��ȸ�� ��Ͽ��� ����
           document.all("insert_btn").disabled = true;  //��Ϲ�ư ��Ȱ��
           document.all("update_btn").disabled = false; //������ư Ȱ��
           document.all("delete_btn").disabled = false; //������ư Ȱ��
        }

    }

    // ���޻��� ����Ʈ ��ȸ(����Ű)
    function list_search_enter() {
        if(event.keyCode == 13) list_search(1);
    }

    // ��Ȳ���� ����Ʈ ��ȸ
    function list_search(curr_page_no) {
        var lo_form = document.thrw_search_form;

        if(lo_form.invsgdt1.value == '' || lo_form.invsgdt2.value == '') {
            alert("�������ڴ� �ʼ��׸��Դϴ�.");
            return;
        }

        if(curr_page_no!=null) {
            lo_form.curr_page_no.value = curr_page_no;
        }

        lo_form.method = "post";
        lo_form.action = "1830";
        lo_form.target = "ifrm";
        check_all(lo_form);

        return;
    }


    // ��Ȳ���� �󼼺���
    function thrw_view(regdt,invsgdt,invsgno,addrcd,dongno) {
        var lo_form = document.apt_thrw_temp_form;

        //�ٷΰ��� Ű ����
        parent.document.boemp_search_form.qsearch.value = lo_form.bocd.value + "-" + addrcd + "-" + dongno;

        lo_form.regdt.value = regdt;
        lo_form.invsgdt.value = invsgdt;
        lo_form.invsgno.value = invsgno;
        lo_form.addrcd.value = addrcd;
        lo_form.dongno.value = dongno;


        lo_form.action = "/ss/brmgr/1850";
        lo_form.target = "ifrm";
        check_all(lo_form);

        document.thrw_head_form.invsgpers.value = "";

        btnInit("3"); //��ư ���¼���

    }


    // ȣ�� ���
    function hous_save() {

        var lo_form  = document.thrw_head_form;
        var lo_form2 = ifrm_2.document.all.hous_thrw_form;
        var lo_form3 = document.all.medi_thrw_rate_form;
        var regtype1 = lo_form.sel_regtype1.value;
        var regtype2 = lo_form.sel_regtype2.value;
        var incmgtype = "<%=incmgtype%>";

        if(lo_form.addrcd.value == '' || lo_form.dongno.value == '') {
            alert("������Ʈ�� ���� �����ϼ���");
            return;
        }

        if(regtype1 == '' || regtype2 == '') {
            alert("����ڱ����� �����ϼ���");
            return;
        }

        if(lo_form.invsgpers.value == '' ) {
            alert("�����ڸ��� �����ϼ���");
            return;
        }

        incmgtype = incmgtype.substring(0,1);
        if( incmgtype == "c" ) {
            if( regtype1 != "10" ) {
                alert( "����ڱ����� ���縸 ���� �����մϴ�");
        		return;
            }
            if( regtype2 == "10" || regtype2 == "30" ) {
                alert( "����ڱ����� �ǸŴ��, �Ƹ�����Ʈ, ����ǽ��� ���� �����մϴ�");
       	    	return;
            }
        } else if( incmgtype == "i" ) {
            if( regtype1 != "20" ) {
                alert( "����ڱ����� ��Ź�� ���� �����մϴ�");
		        return;
            }
            if( regtype2 != "30" && regtype2 != "40" && regtype2 != "70" ) {
                alert( "����ڱ����� ����IS, �Ƹ�����Ʈ, ������� ���� �����մϴ�");
          		return;
            }
        } else {
            if( regtype1 != "30" ) {
                alert( "����ڱ����� ������ ���� �����մϴ�");
		        return;
            }
            if( regtype2 != "10" ) {
                alert( "����ڱ����� ����������� ���� �����մϴ�");
		        return;
            }
        }

        if( lo_form.hoscnt.value <= 0 ) {
          alert("������� �Է��ϼ���");
          return;
        }


        document.apt_thrw_temp_form.accflag.value 	    = "I";

        //�����ڵ�, �۾�����, ����Ʈ�ڵ� �� ��, ����, �����, �Է�����
        lo_form2.bocd.value         = lo_form.bocd.value;
        lo_form2.accflag.value 	    = "I";
        lo_form2.hmflag.value		= "H";
        lo_form2.zip.value	 		= lo_form.zip.value;
        lo_form2.addr.value     	= lo_form.addr.value;
        lo_form2.addrcd.value 		= lo_form.addrcd.value;
        lo_form2.dongno.value		= lo_form.dongno.value;
        lo_form2.pyong1.value	 	= lo_form.pyong.value;
        lo_form2.hoscnt1.value      = lo_form.hoscnt.value;

        //��
        if(lo_form.year.value.length==0) lo_form.year.value = lo_form.year.value+"00";
        if(lo_form.year.value.length==1) "0"+lo_form.year.value = lo_form.year.value;
        //��
        if(lo_form.month.value.length==0) lo_form.month.value = lo_form.month.value+"00";
        if(lo_form.month.value.length==1) "0"+lo_form.month.value = lo_form.month.value;
        //��
        if(lo_form.day.value.length==0) lo_form.day.value = lo_form.day.value+"00";
        if(lo_form.day.value.length==1) "0"+lo_form.day.value = lo_form.day.value;

        lo_form2.invsgdt.value 	    = lo_form.year.value + lo_form.month.value + lo_form.day.value;

        //(��,��,��)��޻���, Ȱ������
        lo_form2.dlvstatcd1.value 	    = lo_form3.sel_dlvstatcd1.value;
        lo_form2.dlvstatcd2.value 	    = lo_form3.sel_dlvstatcd2.value;
        lo_form2.dlvstatcd3.value 	    = lo_form3.sel_dlvstatcd3.value;
        lo_form2.remk.value 	        = lo_form3.act_remk.value;

        //����ڱ���1, ����ڱ���2
        lo_form2.regtype1.value 	    = lo_form.sel_regtype1.value;
        lo_form2.regtype2.value 	    = lo_form.sel_regtype2.value;

        //�����ȣ, �ּ�
        lo_form2.zip.value	 		    = lo_form.zip.value;
        lo_form2.addr.value     	    = lo_form.addr.value;


        //�����Ͻ�,����ð� üũ
        if(lo_form.hour.value.length==0) lo_form.hour.value = lo_form.hour.value+"00";
        if(lo_form.hour.value.length==1) lo_form.hour.value = lo_form.hour.value+"0";
        if(lo_form.minute.value.length==0) lo_form.minute.value = lo_form.minute.value+"00";
        if(lo_form.minute.value.length==1) lo_form.minute.value = lo_form.minute.value+"0";

        lo_form2.invsghhmm.value	= lo_form.hour.value + lo_form.minute.value;
        lo_form2.invsgpers.value    = lo_form.invsgpers.value

        lo_form2.action = "/ss/brmgr/1870";
        lo_form2.target = "ifrm";
        lo_form2.method = "post";
        check_all(lo_form2);
    }


    // ȣ�� ����
    function hous_update() {

        var lo_form  = document.thrw_head_form;
        var lo_form2 = ifrm_2.document.hous_thrw_form;
        var lo_form3 = document.apt_thrw_temp_form;
        var lo_form4 = document.all.medi_thrw_rate_form;
        var regtype1 = lo_form.sel_regtype1.value;
        var regtype2 = lo_form.sel_regtype2.value;
        var incmgtype = "<%=incmgtype%>";


        if(regtype1 == '' || regtype2 == '') {
            alert("����ڱ����� �����ϼ���");
            return;
        }

        if(lo_form3.invsgdt.value == '' || lo_form3.invsgno.value == '') {
            alert("������ �������� �����ϼ���");
            return;
        }


       incmgtype = incmgtype.substring(0,1);
        if( incmgtype == "c" ) {
            if( regtype1 != "10" ) {
                alert( "����ڱ����� ���縸 ���� �����մϴ�");
        		return;
            }
            if( regtype2 == "10" || regtype2 == "30" ) {
                alert( "����ڱ����� �ǸŴ��, �Ƹ�����Ʈ, ����ǽ��� ���� �����մϴ�");
       	    	return;
            }
        } else if( incmgtype == "i" ) {
            if( regtype1 != "20" ) {
                alert( "����ڱ����� ��Ź�� ���� �����մϴ�");
		        return;
            }
            if( regtype2 != "30" && regtype2 != "40" && regtype2 != "70" ) {
                alert( "����ڱ����� ����IS, �Ƹ�����Ʈ, ������� ���� �����մϴ�");
          		return;
            }
        } else {
            if( regtype1 != "30" ) {
                alert( "����ڱ����� ������ ���� �����մϴ�");
		        return;
            }
            if( regtype2 != "10" ) {
                alert( "����ڱ����� ����������� ���� �����մϴ�");
		        return;
            }
        }

        if( lo_form.hoscnt.value <= 0 ) {
          alert("������� �Է��ϼ���");
          return;
        }

        if( !confirm("���� ���� �Ͻðڽ��ϱ�?") ) {
            return;
        }

        document.apt_thrw_temp_form.accflag.value 	    = "U";

        lo_form2.bocd.value         = lo_form.bocd.value;
        lo_form2.accflag.value 	    = "U";
        lo_form2.hmflag.value		= "H";
        lo_form2.addrcd.value 		= lo_form3.addrcd.value;
        lo_form2.dongno.value		= lo_form3.dongno.value;

        //��
        if(lo_form.year.value.length==0) lo_form.year.value = lo_form.year.value+"00";
        if(lo_form.year.value.length==1) "0"+lo_form.year.value = lo_form.year.value;
        //��
        if(lo_form.month.value.length==0) lo_form.month.value = lo_form.month.value+"00";
        if(lo_form.month.value.length==1) "0"+lo_form.month.value = lo_form.month.value;
        //��
        if(lo_form.day.value.length==0) lo_form.day.value = lo_form.day.value+"00";
        if(lo_form.day.value.length==1) "0"+lo_form.day.value = lo_form.day.value;

        lo_form2.invsgdt.value 	    = lo_form.year.value + lo_form.month.value + lo_form.day.value;

        lo_form2.invsgno.value 	    = lo_form3.invsgno.value;
        lo_form2.regdt.value        = lo_form3.regdt.value;

        lo_form2.pyong1.value       = lo_form.pyong.value;
        lo_form2.hoscnt1.value      = lo_form.hoscnt.value;
        lo_form2.invsgpers.value    = lo_form.invsgpers.value;

        lo_form2.zip.value	 		= lo_form.zip.value;
        lo_form2.addr.value     	= lo_form.addr.value;

        lo_form2.dlvstatcd1.value 	    = lo_form4.sel_dlvstatcd1.value;
        lo_form2.dlvstatcd2.value 	    = lo_form4.sel_dlvstatcd2.value;
        lo_form2.dlvstatcd3.value 	    = lo_form4.sel_dlvstatcd3.value;
        lo_form2.remk.value 	        = lo_form4.act_remk.value;
        lo_form2.regtype1.value 	    = lo_form.sel_regtype1.value;
        lo_form2.regtype2.value 	    = lo_form.sel_regtype2.value;

        //�����Ͻ�,����ð� üũ
        if(lo_form.hour.value.length==0) lo_form.hour.value = lo_form.hour.value+"00";
        if(lo_form.hour.value.length==1) lo_form.hour.value = lo_form.hour.value+"0";
        if(lo_form.minute.value.length==0) lo_form.minute.value = lo_form.minute.value+"00";
        if(lo_form.minute.value.length==1) lo_form.minute.value = lo_form.minute.value+"0";
        lo_form2.invsghhmm.value	= lo_form.hour.value + lo_form.minute.value;
        lo_form2.invsgpers.value    = lo_form.invsgpers.value

        lo_form2.action = "/ss/brmgr/1870";
        lo_form2.target = "ifrm";
        lo_form2.method = "post";

        check_all(lo_form2);
    }


    // ȣ�� ����
    function hous_delete() {

        var lo_form  = document.thrw_head_form;
        var lo_form2 = ifrm_2.document.hous_thrw_form;
        var lo_form3 = document.apt_thrw_temp_form;

        if(lo_form3.invsgdt.value == '' || lo_form3.invsgno.value == '') {
            alert("������ �������� �����ϼ���");
            return;
        }

        if( !confirm("���� ���� �Ͻðڽ��ϱ�?") ) {
            return;
        }

        document.apt_thrw_temp_form.accflag.value 	    = "D";

        lo_form2.bocd.value         = lo_form.bocd.value;
        lo_form2.accflag.value 	    = "D";
        lo_form2.hmflag.value		= "H";
        lo_form2.addrcd.value 		= lo_form3.addrcd.value;
        lo_form2.dongno.value		= lo_form3.dongno.value;
        lo_form2.invsgdt.value 	    = lo_form3.invsgdt.value;
        lo_form2.invsgno.value 	    = lo_form3.invsgno.value;
        lo_form2.regdt.value        = lo_form3.regdt.value;

        lo_form2.pyong1.value       = lo_form.pyong.value;
        lo_form2.hoscnt1.value      = lo_form.hoscnt.value;
        lo_form2.invsgpers.value    = lo_form.invsgpers.value;

        lo_form2.zip.value	 		= lo_form.zip.value;
        lo_form2.addr.value     	= lo_form.addr.value;

        lo_form2.action = "/ss/brmgr/1870";
        lo_form2.target = "ifrm";
        lo_form2.method = "post";

        check_all(lo_form2);

    }



    // ȣ����Ȳ clear(�ʱ�ȭ)
    function hous_clear()
    {
        var lo_form = ifrm_2.document.hous_thrw_form;	    // ������ ��
        var lo_form1 = document.thrw_head_form.all;	        // ����Ʈ���� ��
        var lo_form2 = document.medi_thrw_rate_form.all;	// ��ü�� �������� ��

        //����Ʈ, �� ��� �ʱ�ȭ
        lo_form1.addrcd_id.selectedIndex = 0;
        dong_search();

        init_in_forms();

        document.apt_thrw_temp_form.accflag.value = "";
    }

    function init_in_forms() {

        var lo_form = ifrm_2.document.hous_thrw_form;	    // ������ ��
        var lo_form1 = document.thrw_head_form.all;	        // ����Ʈ���� ��
        var lo_form2 = document.medi_thrw_rate_form.all;	// ��ü�� �������� ��

        //�ּ�,�Է½ð� �ʱ�ȭ
        lo_form1.zip.value = "";
        lo_form1.addr.value = "";
        lo_form1.year.value = "<%=Util.getYear()%>";    //�����Ͻ�(��)
        lo_form1.month.value = "<%=Util.getMonth()%>";  //�����Ͻ�(��)
        lo_form1.day.value = "<%=Util.getDay()%>";      //�����Ͻ�(��)
        lo_form1.hour.value = "00";                     //����ð�(�ð�)
        lo_form1.minute.value = "00";                   //����ð�(��)
        lo_form1.mvindt.value = "";                     //��������

        //�������� �ʱ�ȭ
        for( var i =0; i< lo_form.length; i++){
            lo_form(i).value = "";
        }

        //��,��,�� ���Ժμ� �ʱ�ȭ
        lo_form2.div_c_cnt.innerHTML = "0&nbsp;";
        lo_form2.div_j_cnt.innerHTML = "0&nbsp;";
        lo_form2.div_d_cnt.innerHTML = "0&nbsp;";
        lo_form2.div_o_cnt.innerHTML = "0&nbsp;";

        //��,��,�� ���Է� �ʱ�ȭ
        lo_form2.div_c_rate.innerHTML = "0%&nbsp;";
        lo_form2.div_j_rate.innerHTML = "0%&nbsp;";
        lo_form2.div_d_rate.innerHTML = "0%&nbsp;";
        lo_form2.div_o_rate.innerHTML = "0%&nbsp;";

        //��,��,�� ��޻��� �ʱ�ȭ
        lo_form2.sel_dlvstatcd1.selectedIndex = 0;
        lo_form2.sel_dlvstatcd2.selectedIndex = 0;
        lo_form2.sel_dlvstatcd3.selectedIndex = 0;

        //Ȱ������ �ʱ�ȭ
        lo_form2.act_remk.value = "";

        btnInit("0"); //��ư ���� ����
    }

<%--
    // ��ü�� ���
    function medi_save() {
        var lo_form  = ifrm_1.document.medi_thrw_form;
        var lo_form2 = document.apt_thrw_temp_form;
        var lo_form3 = ifrm_2.document.hous_thrw_form;

        lo_form2.accflag.value 	    = "I";
        lo_form2.hmflag.value		= "M";
        lo_form2.addrcd.value 		= lo_form3.addrcd.value;
        lo_form2.dongno.value		= lo_form3.dongno.value;
        lo_form2.invsgdt.value 		= lo_form3.invsgdt.value;

        if(lo_form.medicd == null){
            alert("ȣ�� ���Ը�ü ��Ȳ�� ���Ե� ȣ�� �ּ��� �ϳ��� �����Ͽ���\n��ü�� ������Ȳ ����� �����մϴ�.");
            return;
        }

        if(lo_form.medicd.length > 1) {
            lo_form2.medicd.value	 	= concatenate_with_delimiter(lo_form.medicd);
            lo_form2.qty.value     		= concatenate_with_delimiter(lo_form.qty);
            lo_form2.qtyratio.value 	= concatenate_with_delimiter(lo_form.qtyratio);
            lo_form2.bgndlvtm.value		= concatenate_with_delimiter2(lo_form.bgnhour,lo_form.bgnminute);
            lo_form2.enddlvtm.value		= concatenate_with_delimiter2(lo_form.endhour,lo_form.endminute);
            lo_form2.dlvstatcd.value	= concatenate_with_delimiter(lo_form.dlvstatcd);
            lo_form2.leaffeednosh.value	= concatenate_with_delimiter(lo_form.leaffeednosh);
        } else {
            lo_form2.medicd.value	 	= lo_form.medicd.value;
            lo_form2.qty.value     		= lo_form.qty.value;
            lo_form2.qtyratio.value 	= lo_form.qtyratio.value;
            lo_form2.bgndlvtm.value		= lo_form.bgnhour.value+lo_form.bgnminute.value;
            lo_form2.enddlvtm.value		= lo_form.endhour.value+lo_form.endminute.value;
            lo_form2.dlvstatcd.value	= lo_form.dlvstatcd.value;
            lo_form2.leaffeednosh.value	= lo_form.leaffeednosh.value;
        }

        lo_form2.action = "/ss/brmgr/1870";
        lo_form2.target = "ifrm";
        lo_form2.method = "post";
        check_all(lo_form2);
    }

    // ��ü�� ����
    function medi_update() {
        var lo_form  = ifrm_1.document.medi_thrw_form;
        var lo_form2 = document.apt_thrw_temp_form;
        var lo_form3 = ifrm_2.document.hous_thrw_form;

        lo_form2.accflag.value 	    = "U";
        if(lo_form3.accflag.value=="U" && lo_form3.hmflag.value == "H") lo_form2.hmflag.value		= "S";
        else lo_form2.hmflag.value		= "M";

        if(lo_form.medicd.length > 1) {
            lo_form2.medicd.value	 	= concatenate_with_delimiter(lo_form.medicd);
            lo_form2.qty.value     		= concatenate_with_delimiter(lo_form.qty);
            lo_form2.qtyratio.value 	= concatenate_with_delimiter(lo_form.qtyratio);
            lo_form2.bgndlvtm.value		= concatenate_with_delimiter2(lo_form.bgnhour,lo_form.bgnminute);
            lo_form2.enddlvtm.value		= concatenate_with_delimiter2(lo_form.endhour,lo_form.endminute);
            lo_form2.dlvstatcd.value	= concatenate_with_delimiter(lo_form.dlvstatcd);
            lo_form2.leaffeednosh.value	= concatenate_with_delimiter(lo_form.leaffeednosh);
        } else {
            lo_form2.medicd.value	 	= lo_form.medicd.value;
            lo_form2.qty.value     		= lo_form.qty.value;
            lo_form2.qtyratio.value 	= lo_form.qtyratio.value;
            lo_form2.bgndlvtm.value		= lo_form.bgnhour.value+lo_form.bgnminute.value;
            lo_form2.enddlvtm.value		= lo_form.endhour.value+lo_form.endminute.value;
            lo_form2.dlvstatcd.value	= lo_form.dlvstatcd.value;
            lo_form2.leaffeednosh.value	= lo_form.leaffeednosh.value;
        }

//alert( lo_form2.hmflag.value + " : " + " : " + lo_form2.addrcd.value + " : " + lo_form2.dongno.value );

        lo_form2.action = "/ss/brmgr/1870";
        lo_form2.target = "ifrm";
        lo_form2.method = "post";
        check_all(lo_form2);
    }

    // ��ü�� clear(���)
    function medi_cancel()
    {
        var lo_form = ifrm_1.document.medi_thrw_form;	// ������ ��
        for( var i =0; i< lo_form.length; i++){
            lo_form(i).value = "";
        }

        document.apt_thrw_temp_form.accflag.value = "";

        document.all("update_btn2").disabled = true;
    }
--%>
<%--
    // �ش� �ε����� key_obj�� üũ�Ǿ��ִ����� ���� concat_str�� ����� ���ڿ��� �����Ѵ�.
    // array_obj�� collection type�̴�.
    function concatenate_with_delimiter(array_obj) {
        var ls_ret_str = "";
        var ls_obj_val = "";
        var ls_deli_str = "<%=concatDelimiter%>";

        for(var i=0; i<array_obj.length; i++) {

                ls_obj_val = array_obj[i].value;
                ls_ret_str += (ls_deli_str + ls_obj_val);
        }

        ls_ret_str = ls_ret_str.substr(ls_deli_str.length);
        return ls_ret_str;
    }

    function concatenate_with_delimiter2(array_obj1,array_obj2) {
        var ls_ret_str = "";
        var ls_obj_val = "";
        var ls_deli_str = "<%=concatDelimiter%>";

        for(var i=0; i<array_obj1.length; i++) {

                ls_obj_val = array_obj1[i].value+array_obj2[i].value;
                ls_ret_str += (ls_deli_str + ls_obj_val);
        }

        ls_ret_str = ls_ret_str.substr(ls_deli_str.length);
        return ls_ret_str;
    }
--%>
/*    // TABŬ���� �ش� ���̾� ǥ�� �Ǵ� ����
    function displayTab(tapValue) {
        var form = document.tab_form;
        var lo_form = document.apt_thrw_temp_form;

        if(lo_form.accflag.value == "" && tapValue == "tab12"){
            alert("ȣ�� ���Ը�ü ��Ȳ���� ����Ͻʽÿ�.");
            return;
        }

        form.tabKey.value = tapValue;
        if(tapValue == "tab11"){
            Layer1.style.display = "";
            Layer2.style.display = "none";
        } else if(tapValue == "tab12") {
            Layer1.style.display = "none";
            Layer2.style.display = "";
        }
    }
*/

    // TAB�� ���� �ٲٱ�
    function set_background_color(){
        var forms = document.forms;
        var elements;
        for(var i=0; i<forms.length; i++){
            elements = forms(i).elements;
            for(var j=0; j<elements.length; j++){
                if(elements(j).tagName != "INPUT") continue;
                if(elements(j).readOnly){
                    elements(j).style.backgroundColor = "#E6E6E6";
                    elements(j).style.color = "#6B6B6B";
                }else{
                    elements(j).style.backgroundColor = "#FFFFFF";
                    elements(j).style.color = "#000000";
                }
            }
        }
    }


/*
    //��ü tab ��ü�� ���� display ����
    function set_on_off_medi_tab(curr_tab_id, i_total_count){
        var ls_tab_id = "";
        var lo_form = document.apt_thrw_temp_form;	 // ���� ȭ�鳻 ���ڻ���

        if(lo_form.accflag.value == "" && curr_tab_id == "tab_1"){
            return;
        }
        for(var i=0; i<i_total_count; i++){
            ls_tab_id = "tab_" + i;

            if(curr_tab_id == ls_tab_id){
                set_medi_tab(document.all(ls_tab_id), "on");
            }else{
                set_medi_tab(document.all(ls_tab_id), "off");
            }
        }
    }
    //��ü tab "ON/OFF"
    function set_medi_tab(o_this, s_on_off){
        var lo_cells = o_this.cells;
        //alert(o_this.id);
        var count = 1;
        for (i=0; i < o_this.rows.length; i++) {
            for (j=0; j < o_this.rows(i).cells.length; j++) {
                //alert(o_this.rows(i).cells(j).outerHTML );
                o_this.rows(i).cells(j).className = s_on_off + "_" + count++;
            }
        }
    }
*/

    // �ش����Ʈ�� �� ����� �ҷ��´�
    function dong_search() {
        var lo_form = document.thrw_head_form;

        // ���������ڵ尡 NULL�� ���
        if(lo_form.addrcd.value == "") {
            var str = "<select id=dong_id name=\"dongno\" tabIndex=\"3\" class=\"sel_all\" onChange=\"apt_search()\">" +
                          "<option value='' selected></option>" +
                      "</select>"
            document.all.dong_id.outerHTML = str;
            return;
        }

        parent.boemp_search_form.qsearch.value = "";
        lo_form.action = "/ss/brmgr/1820";
        lo_form.target = "ifrm";

        init_in_forms();

        check_all(lo_form);
    }


    // �ش����Ʈ���� �⺻������ ������ �ҷ��´�
    function apt_search() {
        var lo_form = document.thrw_head_form;

        //�ٷΰ��� Ű ����
        parent.document.boemp_search_form.qsearch.value = get_qsearch_key();

        lo_form.action = "/ss/brmgr/1840";
        lo_form.target = "ifrm";

        btnInit("0"); //��ư ���� ����

        init_in_forms();

        check_all(lo_form);
    }

    // submit�� ȣ��
    function check_all(form){
            if(!validate(form)) return false;
            else{
                makeValue(form);
                form.submit();
            }
    }

    //����Ű�� ���� �����ȣ �˻�
    function zip_enter_search(i_pageno){
        var e = window.event;
        if(!e || e.keyCode != "13") return;

        //�����ȣ ������ �ƴ϶�� zip_search �Լ��� call �Ѵ�.
        if(!validate_zip(document.thrw_head_form.zip.value)){
            zip_search(i_pageno);
            /*
            alert("�����ȣ ������ ��ȿ���� �ʽ��ϴ�. \n��)123-123 Ȥ�� 123123 ó�� �Է��ϼ���.");
            document.thrw_head_form.zip.select();
            e.returnValue = false;
            */
            return;
        }

        var lo_form = document.zip_search_form;
        //lo_form.bocd.value = "00070"; //�������� �ڵ�
        lo_form.zip.value = deleteHyphen(trim(document.thrw_head_form.zip.value));
        lo_form.pageno.value = i_pageno;   // ��������ȣ
        lo_form.pagesize.value = "10000";  // ������������( �� �������� �ִ� ���ڵ� ��)

        insertDash(document.thrw_head_form.zip, 3);
        zip_search_form.target = "ifrm";
        zip_search_form.method = "post";
        zip_search_form.action = "/ss/common/1005";
        if(!check_all(zip_search_form)) return;
    }

    // �����ȣ ��ȿ�� ����
    function validate_zip(s_zip){
        if(trim(s_zip) == "") return false;
        var format = /^(\d{3})(-{0,1})(\d{3})$/;
        return isValidFormat(s_zip, format);
    }

    //�˻���ư�� ���� �����ȣ �˻�(�˾�)
    function zip_search(i_pageno){
        var job_flg = "A"; //��ü �˻� "A" , ������ �˻� "S"
        var ls_name = deleteHyphen(trim(document.thrw_head_form.zip.value) + ":" + job_flg);
        var lo_form = document.thrw_head_form;
//        var ls_uri = "/ss/common/1000";
        var ls_uri = "/ss/common/1150";
        var ls_return = jsNewModalWinNoS(ls_uri, ls_name, "495", "410");

        var la_str;
        if(ls_return.indexOf("\n") != -1){
            la_str = ls_return.split("\n");
            var la_temp = new Array();
            la_temp[0] = la_str[2];
            la_temp[1] = la_str[3];
            //lo_form.addr.value 	= trim(la_str[1]) + " " + jsGetChainStr(la_temp, "~");
            //�����ȣ ��ȸ�� ���õ� �ּҿ��� ���۹���,�������� ǥ�� ���� 20041109 ����� (�ǰ�:�̱��)
            lo_form.addr.value 	= trim(la_str[1]);
            lo_form.zip.value = la_str[0];
        }
        return;
    }

    //�ּҰ˻����� ����Ʈ��� ã��(�˾�)
    function apt_zip_search(){
        var job_flg = "A"; //��ü �˻� "A" , ������ �˻� "S"
        var ls_name = deleteHyphen(trim(document.thrw_head_form.zip.value) + ":" + job_flg + ":" + "APT");
        var lo_form = document.thrw_head_form;
        var ls_uri = "/ss/common/1150";
        var ls_return = jsNewModalWinNoS(ls_uri, ls_name, "495", "410");

        var la_str;
        if(ls_return.indexOf("\n") != -1){
            la_str = ls_return.split("\n");
            var la_temp = new Array();
            la_temp[0] = la_str[2];
            la_temp[1] = la_str[3];
            //lo_form.addr.value 	= trim(la_str[1]) + " " + jsGetChainStr(la_temp, "~");
            //�����ȣ ��ȸ�� ���õ� �ּҿ��� ���۹���,�������� ǥ�� ���� 20041109 ����� (�ǰ�:�̱��)
            lo_form.addr.value 	= trim(la_str[1]);
            lo_form.zip.value = la_str[0];

            //�ٷΰ��� ��� �̿��ؼ� �ּҿ� �ش��ϴ� ����Ʈ��� ��ȸ la_str[4]=>�����ڵ�
            parent.document.boemp_search_form.qsearch.value = la_str[4];
            document.thrw_head_form.qsearch.value = la_str[4];
            quick_search(la_str[0], la_str[1]);
        }
        return;
    }


    //�ּҰ˻����� ����Ʈ��� ã��(�˾�)
    function addr_to_apt_search(){
        var job_flg = "A"; //��ü �˻� "A" , ������ �˻� "S"
        var ls_name = deleteHyphen(trim(document.thrw_head_form.zip.value) + ":" + job_flg + ":" + "APT");
        var lo_form = document.thrw_head_form;
        var ls_uri = "/ss/brmgr/1825";
        var ls_return = jsNewModalWinNoS(ls_uri, ls_name, "495", "410");

        var la_str;
        if(ls_return.indexOf("\n") != -1){
            la_str = ls_return.split("\n");
            parent.document.boemp_search_form.qsearch.value = la_str[0] + la_str[1];
            document.thrw_head_form.qsearch.value = la_str[0] + la_str[1];
            quick_search('','');
        }
        return;
    }


    //����Ű�� ���� �����ȣ �˻� �� �˻� ����� �Ѱ��϶�, ����� �ʵ忡 ����
    function set_zip_search_result(){
        var zip_form 		= ifrm.document.zip_detail_form; // ifrm �� ��ȸ�� ��� form
        var lo_form 	= document.thrw_head_form;	 // ���� ȭ�鳻 ���ڻ���

        var la_temp = new Array();
        la_temp[0] = zip_form.bgnn.value;
        la_temp[1] = zip_form.endn.value;

        //lo_form.addr.value 	= trim(zip_form.addr.value) + " " + jsGetChainStr(la_temp, "~");
        //�����ȣ ��ȸ�� ���õ� �ּҿ��� ���۹���,�������� ǥ�� ���� 20041109 ����� (�ǰ�:�̱��)
        lo_form.addr.value 	= trim(zip_form.addr.value);
        lo_form.zip.value 	= zip_form.zip.value;
        insertDash(lo_form.zip, 3);
    }


    // �����˻�(�˾�)
    function boemp_search(){
        var ls_boemp_no = "";

        var lo_form2 = thrw_head_form;

//        var ls_return = jsNewModalWinNoS("/ss/account/1160", ls_boemp_no, "420", "410");
        var ls_return = jsNewModalWinNoS("/ss/brmgr/1860?bocd=<%=request.getParameter("bocd")%>", ls_boemp_no, "420", "410");

        var la_str;
        if(ls_return.indexOf("\n") != -1){
            la_str = ls_return.split("\n");
            lo_form2.invsgpers.value = la_str[1];
        }

        return;
    }


    // ��ü�ڵ�˻�(�˾�)
    function medi_ynmpop(){
        var ls_return = jsNewModalWinNoS("/ss/brmgr/1880", "", "420", "410");
        return;
    }


    // Ȱ������ ���(�˾�)
    function act_memo( accflag, invsgdt, invsgno, addrcd, dongno ){
    //  alert('aa');
//        if(!is_valid_rdr_no()) return;
//        var lo_form = document.reader_detail_form;
//        var s_rdr_no = lo_form.rdr_no.value;
//        if(s_rdr_no == "") return;
//        var ls_arg = s_rdr_no + ":R"; //���â�� �Ѱ��� argument���� ( "���ڹ�ȣ:ó��FLAG" ) - ó�� FLAG �� (R:��ȸ, U:����, D:�ʱ�ȭ)
//        var lo_layer1 = document.all.layer1;
//        var left = lo_layer1.offsetLeft + 142;
//        var top = 132 + lo_layer1.offsetTop;
        //var nLeft  = screen.width/2 -250/2 ;
        //var nTop  = screen.height/2 - 250/2 ;
        //var ls_opt = "dialogWidth:265px; dialogHeight:480px; dialogLeft:"+left+"px; dialogTop:"+top+"px; center:yes; help:no; resizable:no; scroll:no; status:no";

        //var ls_arg = acctflag + ":" + invsgdt + ":" + invsgno + ":" + addrcd + ":" + dongno;
        //alert(invsgdt);
        var left = screen.width/2 -350/2 ;
        var top = screen.height/2 - 480/2 ;
        var ls_opt = "dialogWidth:350px; dialogHeight:480px; dialogLeft:"+left+"px; dialogTop:"+top+"px; center:yes; help:no; resizable:no; scroll:no; status:no";
        var ls_return = window.showModalDialog("/ss/brmgr/1890?accflag=" + accflag + "&invsgdt=" + invsgdt + "&invsgno=" + invsgno + "&addrcd=" + addrcd + "&dongno=" + dongno, "", ls_opt );
        //var ls_return = jsNewModalWinNoS("/ss/reader/1420", ls_arg, "275", "480");
        return;
    }

    function set_tb_color( obj, tot ) {
        var i;

        for( i=0; i<tot; i++ ) {
          eval( "thrw_id_" + i + ".style.backgroundColor = '#ffffff'" );
        }

        eval( obj + ".style.backgroundColor = '#BFD2DD'" );
    }

    /* ----------- AJAX Begin ----------- */
    function calc_thrw_rate() {
        fnCreateXMLHttp();
        fnCreateReqUrl();

        xmlHttp.open( "POST", xmlReqUrl, true );
        xmlHttp.onreadystatechange = fnHandleCallback;
        xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        xmlHttp.send( xmlQueryString );

    }

    function fnCreateXMLHttp() {
        if( window.ActiveXObject ) {
          xmlHttp = new ActiveXObject( "Microsoft.XMLHTTP" );
        } else if( widow.XMLHttpRequest ) {
          xmlHttp = new XMLHttpRequest();
        }
    }

    function fnCreateReqUrl() {
        var lo_form = ifrm_2.document.all.hous_thrw_form;
        var lo_form2  = document.thrw_head_form;

        var obj;
        var sData = "";
        var tmpString = "";

        for( var i=0; i<lo_form.elements.length; i++) {
          obj = lo_form.elements[i]
          if( obj.name.substring(0,2) == "h_" && obj.value != "" ) {
            sData = sData + obj.value + ",";
          }
        }

        xmlReqUrl = "/ss/brmgr/1891";
        xmlQueryString = "hoscnt=" + lo_form2.hoscnt.value + "&housval=" + sData;
    }

    function fnHandleCallback() {
        var xmlDoc;
        var xmlDiv
        var lo_form = document.medi_thrw_rate_form.all;
        var lo_form2 = document.all.calc_thrw_rate_form;

        if( xmlHttp.readyState == 4 ) {
          if( xmlHttp.status == 200 ) {
//                xmlDoc = xmlHttp.responseXML
              var nPos = 0;
              var data = new Array(8);
              var buff = "";
              var i = 0;
              buff = xmlHttp.responseText;

              //alert( "###: " + buff );
              buff = buff.substring( (buff.indexOf("#"))+1 );  //ù��° ��ġ ����

              //alert( "###: " + buff );
              while( (nPos = buff.indexOf( "#" )) >= 0 ) {
                //alert( buff + " : " + nPos );
                  data[i++] = buff.substring( 0, nPos );
                  buff = buff.substring( nPos+1 );
              }

               //alert( buff );
               lo_form.div_c_cnt.innerHTML  = data[0] + "&nbsp;";
               lo_form.div_j_cnt.innerHTML  = data[1] + "&nbsp;";
               lo_form.div_d_cnt.innerHTML  = data[2] + "&nbsp;";
               lo_form.div_o_cnt.innerHTML  = data[3] + "&nbsp;";
               lo_form.div_c_rate.innerHTML = data[4] + "%&nbsp;";
               lo_form.div_j_rate.innerHTML = data[5] + "%&nbsp;";
               lo_form.div_d_rate.innerHTML = data[6] + "%&nbsp;";
               lo_form.div_o_rate.innerHTML = data[7] + "%&nbsp;";

          } else {
            //����ó��
          }
        }
    }
    /* ----------- AJAX End ----------- */


//�ٷΰ��� ����
function quick_search(szip, saddr) {
  var lo_form1 = parent.document.boemp_search_form;
  var lo_form2 = document.thrw_head_form;

  lo_form2.qsearch.value = lo_form1.qsearch.value;

  lo_form2.action = "/ss/brmgr/1841";
  lo_form2.target = "ifrm";

  btnInit("0"); //��ư ���� ����

  init_in_forms();

  lo_form2.zip.value    = szip;
  lo_form2.addr.value 	= trim(saddr);

//  apt_search();
  check_all(lo_form2);

}

//������ ����Ʈ,���� �ش��ϴ� �ٷΰ��� Ű ����
function get_qsearch_key() {
  var lo_form1 = document.thrw_head_form;
  var strKey = "";

  strKey = lo_form1.bocd.value + "-" + lo_form1.addrcd_id.value + "-" + lo_form1.dong_id.value;
  return strKey;

}

-->
</script>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=KSC5601">
<link rel="stylesheet" href="/html/comm_css/sal.css" type="text/css">
<script language="javascript" src="/html/comm_js/common.js"></script>
</head>
<body onload="jsInit();" bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1">
<%--<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle">�����濵
      &gt; </b>����Ʈ ������ &gt; ��Ȳ���� �� ��� </td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���� ����-->
    </td>
  </tr>
</table>--%>
<!--����Ʈ ������Ȳ ���� title-->
<%--
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr><td height="3"></td></tr>
</table>
<table width="830" border="0" align="center" cellpadding="2" cellspacing="0">
  <tr>
    <td bgcolor="#EBE9DC" class="title">����Ʈ ������Ȳ ���</td>
  </tr>
  <tr>
    <td height="2">
      <!--����-->
    </td>
  </tr>
</table>
--%>

<!--����Ʈ ������Ȳ ����Ʈ���� ����-->
<table width="830" border="0" align="center" cellpadding="2" cellspacing="0" class="gray" >
<form name="thrw_head_form" method="post" action="" >
<input name="bocd" type="hidden" value="<%=request.getParameter("bocd")%>">
<input name="qsearch" type="hidden" value="">
<input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� -->
  <tr>
    <td class="gray" width="90" bgcolor="#dddddd">�ּ�</td>
    <td colspan="5" class="gray">
<%--        <a href="javascript:apt_zip_search();"><img src="/html/comm_img/bu_findgi.gif" height="19" border="0" align="absmiddle"></a>--%>
        <a href="javascript:addr_to_apt_search();"><img src="/html/comm_img/bu_findapt.gif" height="19" border="0" align="absmiddle"></a>
        <input name="zip" type="text" size="7" tabIndex="1" class="text_box" tabIndex="2" onkeydown="zip_enter_search(1);">
        <a href="javascript:zip_search();"><img src="/html/comm_img/bu_search03.gif" width="39" height="19" border="0" align="absmiddle"></a>
        <input name="addr" type="text" tabIndex="3" style="background-color:#EBE9DC; width:240;" class="text_box" readonly>
      <select id="addrcd_id" name="addrcd" class="sel_all" tabIndex="2" onChange="dong_search();">
        <option value="">����</option>
        <%=ds.addrcdcurOptHtml("")%>
      </select>
      ����Ʈ
      <select id="dong_id" name="dongno" class="sel_all" tabIndex="3" onChange="apt_search();">
        <option value="">����</option>
      </select>
      ��
    </td>
<%--       <td class="gray" align="right"><a href="javascript:apt_zip_search();"><img src="/html/comm_img/bu_findgi.gif" height="19" border="0" align="absmiddle"></a></td>--%>
  </tr>

  <tr>
    <td width="90" class="gray" bgcolor="#dddddd">����Ʈ����</td>
    <td width="340" class="gray">
      <input name="pyong" type="text" style="ime-mode:disabled;text-align:right; width:77;" class="text_box" tabIndex="4" size="5">
      ���� <font color="blue">[���������� ��� �Է� ��)25/35]</font></td>
    <td  class="gray" width="70" bgcolor="#dddddd">��������</td>
    <td  class="gray" width="140">
      <input name="mvindt" type="text" style="ime-mode:disabled;text-align:center" class="text_box" tabIndex="5" size="10" readonly>
    </td>
    <td  class="gray" width="70" bgcolor="#dddddd">�����</td>
    <td  class="gray" width="*">
      <input name="hoscnt" type="text" style="ime-mode:disabled;text-align:right" class="text_box" tabIndex="5" size="5">
    </td>
  </tr>

  <tr>
    <td class="gray" width="90" bgcolor="#dddddd">�����Ͻ�</td>
    <td class="gray">
      <input name="year" type="text" class="text_box" maxlength="4" tabIndex="6" value="<%=Util.getYear()%>" size="4" dataType="number" len="4" caption="����⵵" notEmpty>
      ��
      <input name="month" type="text" size="2" tabIndex="7" maxlength="2" value="<%=Util.getMonth()%>" class="text_box" dataType="number" len="2" caption="�����" maxValue="12" notEmpty>
      ��
      <input name="day" type="text" size="2" tabIndex="8" maxlength="2" value="<%=Util.getDay()%>" class="text_box" dataType="number" len="2" caption="������" maxValue="31">
      ��
      <input name="hour" type="text" size="2" tabIndex="9" maxlength="2" value="00" class="text_box" dataType="number" len="2" caption="�ð�" maxValue="24">
      ��
      <input name="minute" type="text" size="2" tabIndex="10" maxlength="2" value="00" class="text_box" dataType="number" len="2" caption="��" maxValue="59">
      �а�
    </td>
    <td  class="gray" bgcolor="#dddddd">����ڱ���</td>
    <td  class="gray" >
<%-- ����ڱ���1, ����ڱ���2 ���� --%>
      <select id="sel_regtype1_id" name="sel_regtype1" class="sel_all" tabIndex="3" onChange="">
        <option value="">����</option>
        <%=ds.regtypecur1OptHtml(reg1)%>
      </select>
      <select id="sel_regtype2_id" name="sel_regtype2" class="sel_all" tabIndex="3" onChange="">
        <option value="">����</option>
        <%=ds.regtypecur2OptHtml("")%>
      </select>
<%--
      <select id="sel_regtype1_id" name="sel_regtype1" class="sel_all" tabIndex="3" onChange="">
        <option value="">����</option>
        <option value="10" selected>����</option>
        <option value="20">��Ź</option>
        <option value="30">����</option>
      </select>
      <select id="sel_regtype2_id" name="sel_regtype2" class="sel_all" tabIndex="3" onChange="">
        <option value="">����</option>
        <option value="10">���������</option>
        <option value="20" selected>�ǸŴ��</option>
        <option value="30">����IS</option>
        <option value="40">�Ƹ�����Ʈ</option>
        <option value="50">����ǽ�</option>
      </select>
--%>
    </td>
    <td class="gray" bgcolor="#dddddd" >�����ڸ�</td>
    <td class="gray" >
      <input name="invsgpers" type="text" size="10" tabIndex="11" class="text_box" value="<%=getCookieParameterValue(request, "EMP_NM", false)%>">
    </td>
  </tr>
</form>
</table>
<br>
<!--����Ʈ ������Ȳ ����Ʈ���� ��-->



<%--
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center" style="visibility:visible">
  <tr>
    <td width="150">
      <table id="tab_0" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:displayTab('tab11');set_on_off_medi_tab(this.id, 2);" style="cursor:hand">
        <tr>
          <td height=3 background="/html/comm_img/tb3_01.gif" width=5 height=3 ></td>
          <td  background="/html/comm_img/tb3_02.gif" height=3 ></td>
          <td height=3 background="/html/comm_img/tb3_03.gif" width=5 height=3 ></td>
        </tr>
        <tr>
          <td background="/html/comm_img/tb3_04.gif"  style width="5"></td>
          <td  align="center" background="/html/comm_img/tb3_05.gif">ȣ�� ���Ը�ü ��Ȳ</td>
          <td background="/html/comm_img/tb3_06.gif"  style width="5"></td>
        </tr>
      </table>
    </td>
    <td width="150">
            <!--tab2-->
            <table id="tab_1" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:displayTab('tab12');set_on_off_medi_tab(this.id, 2);" style="cursor:hand">
              <tr>
                <td height=3 background="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
                <td  background="/html/comm_img/tb4_02.gif" height=3 ></td>
                <td height=3 background="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
              </tr>

              <tr>
                <td background="/html/comm_img/tb4_04.gif"  style width="5"></td>
                <td  align="center" background="/html/comm_img/tb4_05.gif">��ü�� ���� ��Ȳ</td>
                <td background="/html/comm_img/tb4_06.gif"  style width="5"></td>
              </tr>
            </table>
            <!--tab 2 end-->
          </td>
          <td width="530">
            <!--tab ����-->
          </td>
        </tr>
      </table>
--%>

<!--ȣ�� ���Ը�ü ��Ȳ ����-->
<div id="Layer1">
<table width="830" border="0" align="center" cellpadding="2" cellspacing="0">
  <tr>
    <td bgcolor="#EBE9DC" class="title" height="25"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">ȣ�� ���Ը�ü ��Ȳ
    <img src="/html/comm_img/bu_me01.gif" onClick="medi_ynmpop();" style="cursor:hand;" width="104" align="absmiddle">
      &nbsp;&nbsp;( �߾� J, ���� D, �ѱ� UH, �Ѱܷ� UG, ���� UA, �Ѱ� H, �Ű� FA, ���� UB, �ڸ����췲�� KH )
    </td>
  </tr>
  <tr>
    <td height="2">
      <!--����-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellpadding="2" cellspacing="0"  align="center" class="gray">
  <tr align="center" bgcolor="#dddddd">
    <td class="gray" style="padding:0;">
        <iframe name="ifrm_2" src="/html/brmgr/ss_brmgr_1850_l.htm" frameborder="0" height="250" width="100%" marginheight="0" marginwidth="0" scrolling="yes"></iframe>
    </td>
  </tr>
  <tr bgcolor="#dddddd">
    <td colspan="13" class="gray">* �����Ϻ��� �����Ϻ��� ���� ��� ȣ �Է� ��) C,D</td>
  </tr>
</table>
</div>
<!--ȣ�� ���Ը�ü ��Ȳ ��-->
<br>
<!--���Ը�ü�� ��Ȳ ����-->
<div id="div_medistat_id">
<table width="830" border="0" align="center" cellpadding="2" cellspacing="0">
  <tr>
    <td bgcolor="#EBE9DC" class="title" height="25"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���Ը�ü�� ��Ȳ</td>
  </tr>
  <tr>
    <td height="2"><!--����--></td>
  </tr>
</table>
<table id="medi_thrw_rate_id" width="830" border="0" cellspacing="0"  align="center" cellpadding="2" class="gray">
<form name="medi_thrw_rate_form" method="post" action="" >
  <tr align="center">
    <td width="127" height="19" bgcolor="#dddddd" class="gray">��ü</td>
    <td width="140" height="19" bgcolor="#dddddd" class="gray">���Ժμ�</td>
    <td width="140" bgcolor="#dddddd" class="gray"> ���Է�</td>
    <td width="*" bgcolor="#dddddd" class="gray">��޻���</td>
    <td width="*" bgcolor="#dddddd" class="gray">Ȱ������</td>
  </tr>
  <tr align="center">
    <td width="127" height="19" bgcolor="#dddddd" class="gray">�����Ϻ�</td>
    <td width="140" class="gray" align="right"><div id="div_c_cnt">0&nbsp;</div></td>
    <td width="140" class="gray" align="right"><div id="div_c_rate">0%&nbsp;</div></td>
    <td class="gray" align="center" width="121">
      <select name="sel_dlvstatcd1" class="sel_all" style="width:100;">
        <option value="">����</option>
        <%=ds.dlvstatcurOptHtml("")%>
      </select>
    </td>
    <td width="*" bgcolor="#ffffff" class="gray" rowspan="5" align="left" valign="top">
    <div style="margin-top:0; margin-left:0;">
      <textarea id="act_remk" cols="36" rows="6" style="border-width:0; width:276; height:90;"></textarea>
    </div>
    </td>
  </tr>
  <tr align="center">
    <td width="127" height="19" bgcolor="#dddddd" class="gray">�߾��Ϻ�</td>
    <td width="140" class="gray" align="right"><div id="div_j_cnt">0&nbsp;</div></td>
    <td width="140" class="gray" align="right"><div id="div_j_rate">0%&nbsp;</div></td>
    <td class="gray" align="center" width="121">
      <select name="sel_dlvstatcd2" class="sel_all" style="width:100;">
        <option value="">����</option>
        <%=ds.dlvstatcurOptHtml("")%>
      </select>
    </td>
  </tr>
  <tr align="center">
    <td width="127" height="19" bgcolor="#dddddd" class="gray">�����Ϻ�</td>
    <td width="140" class="gray" align="right"><div id="div_d_cnt">0&nbsp;</div></td>
    <td width="140" class="gray" align="right"><div id="div_d_rate">0%&nbsp;</div></td>
    <td class="gray" align="center" width="121">
      <select name="sel_dlvstatcd3" class="sel_all" style="width:100;">
        <option value="">����</option>
        <%=ds.dlvstatcurOptHtml("")%>
      </select>
    </td>
  </tr>
  <tr align="center">
    <td width="127" height="19" bgcolor="#dddddd" class="gray">��Ÿ</td>
    <td width="140" class="gray" align="right"><div id="div_o_cnt">0&nbsp;</div></td>
    <td width="140" class="gray" align="right"><div id="div_o_rate">0%&nbsp;</div></td>
    <td class="gray" align="center" width="121">&nbsp;</td>
  </tr>
</form>
</table>
</div>
<div id="div_btnctrl_id">
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
  <tr>
    <td align="center" height="2"><!--����--></td>
  </tr>
  <tr>
    <td align="center" height="24" bgcolor="#E8E8E8">
        <input type="image" src="/html/comm_img/bu_regist.gif" name="insert_btn" value="" align="absmiddle"-
            onclick="hous_save();window.event.returnValue=false;">
        <input type="image" src="/html/comm_img/bu_edit.gif" name="update_btn" value="" align="absmiddle"-
            onclick="hous_update();window.event.returnValue=false;">
        <input type="image" src="/html/comm_img/bu_del.gif" name="delete_btn" value="" align="absmiddle"-
            onclick="hous_delete();window.event.returnValue=false;">
        <input type="image" src="/html/comm_img/bu_default.gif" name="clear_btn" value="" align="absmiddle"
            onclick="hous_clear();window.event.returnValue=false;">
    </td>
  </tr>
</table>
</div>
<!--���Ը�ü�� ��Ȳ ��-->


<%--
<!--���Ը�ü�� ��Ȳ title-->
<div id="Layer2" style="display:none;">
<table width="830" border="0" align="center" cellpadding="2" cellspacing="0">
  <tr>
    <td bgcolor="#EBE9DC" class="title" height="25">���Ը�ü�� ��Ȳ</td>
  </tr>
  <tr>
    <td height="2">
      <!--����-->
    </td>
  </tr>
</table>
<!--���Ը�ü�� ��Ȳ ��Ȳ-->
<table width="830" border="0" cellspacing="0"  align="center" cellpadding="2" class="gray">
  <tr bgcolor="#dddddd" align="center">
    <td  class="gray" bgcolor="#dddddd" align="center" width="120"> ����(����) </td>
    <td  class="gray" bgcolor="#dddddd" align="center" width="100"> ���Ժμ�(��) </td>
    <td  class="gray" bgcolor="#dddddd" align="center" width="100"> ���Է�(%) </td>
    <td  class="gray" bgcolor="#dddddd" align="center" width="180"> ��޽ð�(��:��)~(��:��) </td>
    <td  class="gray" bgcolor="#dddddd" align="center" width="120"> ��޻��� </td>
    <td  class="gray" bgcolor="#dddddd" align="center" width="150"> ���ܻ����ż�(��) </td>
  </tr>
  <tr>
      <td class="gray" colspan="6" style="padding:0;">
%--        <iframe name="ifrm_1" src="/html/commun/sl_commun_2610_l.html" frameborder="0" height="151" width="100%" marginheight="0" marginwidth="0" scrolling="yes"></iframe>--%
        <iframe name="ifrm_1" src="/html/brmgr/ss_brmgr_1855_l.htm" frameborder="0" height="151" width="100%" marginheight="0" marginwidth="0" scrolling="yes"></iframe>
      </td>
  </tr>
</table>
<!--button -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
  <tr>
    <td align="center" height="2">
      <!--����-->
    </td>
  </tr>
  <tr>
    <td align="center" height="24" bgcolor="#E8E8E8">
--        <input type="image" src="/html/comm_img/bu_regist.gif" name="insert_btn2" value="" align="absmiddle"
            onclick="medi_save();window.event.returnValue=false;" >--
        <input type="image" src="/html/comm_img/bu_edit.gif" name="update_btn2" value="" align="absmiddle"
            onclick="medi_update();window.event.returnValue=false;">
        <input type="image" src="/html/comm_img/bu_default.gif" name="cancel_btn2" value="" align="absmiddle"
            onclick="medi_cancel();window.event.returnValue=false;">
    </td>
  </tr>
</table>
</div>
--%>


<!--����Ʈ ������Ȳ ���系�� ��ȸ ����-->
<br>
<div id="div_search_id">
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<form name="thrw_search_form" method="post" action="" >
    <input name="bocd" type="hidden" value="<%=request.getParameter("bocd")%>">
    <input name="curr_page_no" type="hidden" value ="1">
    <input name="records_per_page" type="hidden" value ="<%=page_rec%>">
    <input name="jobcdset" type="hidden" value="<%=request.getParameter("jobcdset")%>">
  <tr>
    <td bgcolor="#EBE9DC" class="title" width="80"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��������</td>
    <td bgcolor="#EBE9DC" class="title" width="200">
      <input name="invsgdt1" type="text" value="<%=Util.getYear()+"0101"%>" tabIndex="1" size="10" class="text_box" dataType=date caption="��������(�˻�)">
      -
      <input name="invsgdt2" type="text" value="<%=Util.getDate()%>" tabIndex="2" size="10" class="text_box" dataType=date caption="��������(�˻�)">
    </td>
    <td bgcolor="#EBE9DC" class="title" width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����Ʈ</td>
    <td class="title" bgcolor="#EBE9DC" width="500">
      <select name="thrw_addrcd" class="sel_all" tabIndex="3" onkeydown="list_search_enter();">
        <option value="">��ü</option>
        <%=ds.addrcdcurOptHtml("")%>
      </select>
      &nbsp;&nbsp;&nbsp;
      <a href="javascript:list_search(1);"><img src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" ></a>
    </td>
  </tr>
  <tr>
    <td height="3" colspan="3">
      <!--����-->
    </td>
  </tr>
</form>
</table>

      <table id="thrw_list_id" width="830" border="0" cellpadding="2" cellspacing="0" bgcolor="#FFFFFF" class="gray" align="center">
        <tr align="center" bgcolor="#dddddd" >
          <td class="gray" width="80" align="center">����</td>
          <td class="gray" width="200" align="center">�����Ͻ�</td>
          <td class="gray" width="200" align="center">����Ʈ��</td>
          <td class="gray" width="200" align="center">����ȣ</td>
          <td class="gray" width="200" align="center">������</td>
<%--        <td class="gray" width="60" align="center">Ȱ������</td> --%>
        </tr>
        <%-- ��ǰ ����Ʈ�� ��ĭ���� ��� --%>
        <%
            for(int i=0; i<page_rec; i++){
        %>
        <tr>
          <td class="gray" width="80" align="center">&nbsp;</td>
          <td class="gray" width="200">&nbsp;</td>
          <td class="gray" width="200">&nbsp;</td>
          <td class="gray" width="200">&nbsp;</td>
          <td class="gray" width="200">&nbsp;</td>
<%--          <td class="gray" width="60">&nbsp;</td>--%>
        </tr>
        <%
            }
        %>
        <tr  bgcolor="#dddddd" align="right" >
          <td  colspan="13" class="gray" height="23"> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">
            �� �Ǽ� : <b>0</b>�� </td>
        </tr>
      </table>
      <!---button-->
      <table id="thrw_list_nav_id" width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
        <tr>
          <td align="center" height="2">
            <!--����-->
          </td>
        </tr>
        <tr>
          <td align="center" height="24" bgcolor="#E8E8E8">
          <%-- �������̵��� ��������, ��ü�׸�� ���� --%>
            <%
                String curr_page_no,total_records,js_fn_nm;
                if("".equals(Util.checkString(request.getParameter("curr_page_no")))){
                    curr_page_no = "1";
                } else {
                    curr_page_no = request.getParameter("curr_page_no");
                }
                //total_records = String.valueOf(ds.getTotalcnt());
                total_records = "0";
                js_fn_nm = "list_search";
            %>

            <jsp:include page="/jsp/ss/comm_jsp/page_navigator2.jsp">
            <jsp:param name = "curr_page_no" 		value="<%=curr_page_no%>"/>
            <jsp:param name = "total_records" 		value="<%=total_records%>"/>
            <jsp:param name = "js_fn_nm" 			value="<%=js_fn_nm%>"/>
            <jsp:param name = "records_per_page" 	value="<%=page_rec%>"/>
            <jsp:param name = "page_set_gubun" 		value="0"/>
            </jsp:include>
           </td>
        </tr>
      </table>
</div>
<!--����Ʈ ������Ȳ ���系�� ��ȸ ��-->

<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width=00 height=00></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
<form name="tab_form">
    <input type="hidden" name="tabKey" value="tab11">
</form>
<form name="zip_search_form" method="post" style="display:none">
    <input type=hidden name=bocd     	 value="<%=request.getParameter("bocd")%>">  <!--���������ڵ�           -->
    <input type=hidden name=zip 		 value="">  <!--�����ȣ               -->
    <input type=hidden name=pageno		 value="">  <!--����������             -->
    <input type=hidden name=pagesize	 value="">  <!--�������� ������ �Ǽ�   -->
</form>
<form name="apt_thrw_temp_form" method="post" style="display:none">
    <input type=hidden name=bocd     	 	value="<%=request.getParameter("bocd")%>">
    <input type=hidden name=accflag 		value="">
    <input type=hidden name=hmflag		 	value="">
    <input type=hidden name=addrcd 		 	value="">
    <input type=hidden name=dongno		 	value="">
    <input type=hidden name=invsgdt 		value="">
    <input type=hidden name=invsgno		 	value="">
    <input type=hidden name=incmgpers		value="">
    <input type=hidden name=medicd	 		value="">
    <input type=hidden name=qty     	 	value="">
    <input type=hidden name=qtyratio 		value="">
    <input type=hidden name=bgndlvtm		value="">
    <input type=hidden name=enddlvtm	 	value="">
    <input type=hidden name=dlvstatcd		value="">
    <input type=hidden name=leaffeednosh	value="">

    <input type=hidden name=dlvstatcd1  	value="">
    <input type=hidden name=dlvstatcd2  	value="">
    <input type=hidden name=dlvstatcd3  	value="">
    <input type=hidden name=remk  	        value="">
    <input type=hidden name=regtype1    	value="">
    <input type=hidden name=regtype2    	value="">
    <input type=hidden name=regdt           value="">
    <input type=hidden name=invsgdtnew 		value="">

</form>

<form name="calc_thrw_rate_form" method="post" style="display:none">
<div id="div_c_cnt">0&nbsp;</div>
<div id="div_c_rate">0%&nbsp;</div>
<div id="div_j_cnt">0&nbsp;</div>
<div id="div_j_rate">0%&nbsp;</div>
<div id="div_d_cnt">0&nbsp;</div>
<div id="div_d_rate">0%&nbsp;</div>
<div id="div_o_cnt">0&nbsp;</div>
<div id="div_o_rate">0%&nbsp;</div>
</form>
