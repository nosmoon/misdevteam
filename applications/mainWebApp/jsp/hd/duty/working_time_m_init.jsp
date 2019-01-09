<%@ page contentType="text/html; charset=KSC5601"%>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.duty.rec.*
	,	chosun.ciis.hd.duty.ds.*
	,	somo.framework.util.*;
	"
%>
<%

String cmpycd = (String)session.getAttribute("BLNG_CMPY_CD") == null ? "" : (String)session.getAttribute("BLNG_CMPY_CD");		// 회사
String emp_no = (String)session.getAttribute("EMPNO") == null ? "" : (String)session.getAttribute("EMPNO");						// 사번
String today  = "";  
String last_week = "";
String week_cls1 = "";
String week_cls2 = "";


//----------test-----------
//cmpycd = "100";
//emp_no = "202029";
//----------test-----------


//세션없을 시 로그인으I로
if(cmpycd.equals("")){
	response.sendRedirect("/");
}
%>

<%
        HD_DUTY_WORK_1001_LDataSet ds = (HD_DUTY_WORK_1001_LDataSet)request.getAttribute("ds");
        String prsnt_tm  = ds.getPrsnt_tm();
        String finish_tm = ds.getFinish_tm();
        String addm_rest_minute = ds.getAddm_rest_minute();
%>

<script>
parent.set_default_tm("<%=prsnt_tm%>", "<%=finish_tm%>", "<%=addm_rest_minute%>");
</script>
