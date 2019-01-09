<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_bil_1111_i.jsp
* 기능 :  개별 입금 저장
* 작성일자 : 2004-03-31
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<html>
<head>
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="javascript">
    alert("저장되었습니다.");
    // 상세정보 폼의 값을 reset 해준다.
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

    // 무조건 검색 후 수정이므로 검색폼을 submit 시켜준다.
	//var curr_page_no=lo_form1.curr_page_no.value;
    parent.seprrcpm_list(1);
</script>
</head>
</html>