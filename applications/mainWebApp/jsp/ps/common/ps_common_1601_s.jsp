<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_common_1601_s.jsp
* 기능 : 독자번호로 독자정보검색
* 작성일자 : 2004-02-20
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
   //  값을 Set해주는 function명
   String setFunction = request.getParameter("setFunction") ;
    // dataset 인스턴스 선언부분
    PS_S_RDRINFODataSet ds = (PS_S_RDRINFODataSet)request.getAttribute("ds");  // request dataset
%>

<html>
<head>
<title>독자번호 상세조회</title>
<script language="JavaScript" >
<!--
function jsInit() {
    var lo_form = document.form1;
    var rdr_no = "";
    var medicd = "";
    var termsubsno = "";
    var rdrnm = "";
    var medinm = "";
<%
    if (ds != null) {
%>
        rdr_no = lo_form.rdr_no.value;
        medicd = lo_form.medicd.value;
        termsubsno = lo_form.termsubsno.value;
        rdrnm = lo_form.rdrnm.value;
        medinm = lo_form.medinm.value;
<%
    }
%>
    parent.<%=setFunction%>(rdr_no,medicd,termsubsno,rdrnm,medinm);
}
-->
</script>
</head>
<body onload="jsInit();" >
<form name="form1">
<%
    if (ds != null) {
%>
<input type="hidden" name="rdr_no" value="<%=ds.getRdr_no() %>">
<input type="hidden" name="medicd" value="<%=ds.getMedicd() %>">
<input type="hidden" name="termsubsno" value="<%=ds.getTermsubsno() %>">
<input type="hidden" name="rdrnm" value="<%=ds.getRdrnm() %>">
<input type="hidden" name="medinm" value="<%=ds.getMedinm() %>">
<%
	}
%>
</form>
</body>
</html>

