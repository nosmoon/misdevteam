<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_common_1601_s.jsp
* ��� : ���ڹ�ȣ�� ���������˻�
* �ۼ����� : 2004-02-20
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
   //  ���� Set���ִ� function��
   String setFunction = request.getParameter("setFunction") ;
    // dataset �ν��Ͻ� ����κ�
    PS_S_RDRINFODataSet ds = (PS_S_RDRINFODataSet)request.getAttribute("ds");  // request dataset
%>

<html>
<head>
<title>���ڹ�ȣ ����ȸ</title>
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

