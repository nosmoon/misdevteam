<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_bil_1111_i.jsp
* ��� :  ���� �Ա� ����
* �ۼ����� : 2004-03-31
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<html>
<head>
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="javascript">
    alert("����Ǿ����ϴ�.");
    // ������ ���� ���� reset ���ش�.
	var lo_form1 = parent.document.seprrcpm_form;
	var lo_form2 = parent.document.seprrcpm_list_form;
    //var form1_elements = form1.elements;
    //for( var i =0; i< form1_elements.length; i++) {
    //    form1_elements(i).value = "";
    //}
	lo_form2.proc_dd_1.value = lo_form1.procdt.value;
	lo_form2.proc_dd_2.value = lo_form1.procdt.value;

	lo_form1.procdt.value="<%=Util.getDate()%>";
	lo_form1.recpdt.value="<%=Util.getDate()%>";
	lo_form1.rcpmseq.value="input";
	lo_form1.recpmthd.value="";
	lo_form1.rcpmamt.value="";
	lo_form1.rdr_no.value="";
	lo_form1.medicd.value="";
	lo_form1.termsubsno.value="";
	lo_form1.rdrnm.value="";
	lo_form1.medinm.value="";
	lo_form1.bocd.value="";
	lo_form1.bonm.value="";

    // ������ �˻� �� �����̹Ƿ� �˻����� submit �����ش�.
	//var curr_page_no=lo_form1.curr_page_no.value;
    parent.seprrcpm_list(1);
</script>
</head>
</html>