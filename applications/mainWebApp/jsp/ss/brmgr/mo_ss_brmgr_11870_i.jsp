<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_ss_brmgr_11870_i.jsp
* 기능       : 센터관리-투입률조사-아파트투입률조사 저장/수정/삭제_모바일용
* 작성일자   : 2017-01-19
* 작성자     : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SL_MO_A_COMM_APT_THRWDataSet ds = (SL_MO_A_COMM_APT_THRWDataSet)request.getAttribute("ds");
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