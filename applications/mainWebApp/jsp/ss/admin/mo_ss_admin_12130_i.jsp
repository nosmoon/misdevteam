<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_ss_admin_12130_i.jsp.jsp
* 기능       : 기초정보관리-모바일관리-직원-담당승인,담당거절,담당비번초기화_모바일용
* 작성일자   : 2017-01-23
* 작성자     : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_MO_A_LOGINAPLC_APRVDataSet ds = (SS_MO_A_LOGINAPLC_APRVDataSet)request.getAttribute("ds");
%>
<accesslist>
<%
	if(ds !=null){
		if(ds.getErrcode()==null || ds.getErrcode().equals("")){
%>
<errinfo>
	<errcode></errcode> <!-- 에러코드 -->
	<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>	<!-- 에러메시지 -->
</errinfo>
<%
		}else{
%>
<errinfo>
	<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode> 		<!-- 에러코드 -->
	<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>			<!-- 에러메시지 -->
</errinfo>
<%
		}
	}else{
%>
<errinfo>
	<errcode><![CDATA[-9999]]></errcode>                     	<!-- 에러코드 -->
	<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>      				<!-- 에러메시지 -->
</errinfo>
<%
	}
%>
</accesslist>