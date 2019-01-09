<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_ss_brinfo_11610_l.jsp
* 기능       : 판매-발송관리-마감관리-발송노선 조회_모바일용
* 작성일자   : 2016-12-28
* 작성자     : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_MO_S_BSNSDataSet ds = (SS_MO_S_BSNSDataSet)request.getAttribute("ds");
%>
<bsdetaillist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
<bsdetailinfo>
	<bocd><%=ds.bocd%></bocd><!--센터코드 -->
	<jpcode><%=ds.jpcode%></jpcode> <!-- 노선코드 -->
	<jbjiorder><![CDATA[<%=ds.jbjiorder%>]]></jbjiorder> <!-- 노선구분 -->
	<jbpansu><%=ds.jbpansu%></jbpansu><!--  판수 -->
	<jpname><![CDATA[<%=ds.jpname%>]]></jpname><!-- 센터명 -->
	<inname><![CDATA[<%=ds.inname%>]]></inname><!-- 인쇄처 -->
	<jbbusu><%=ds.jbbusu%></jbbusu><!-- 부수 -->
	<jbbalcha><%=ds.jbbalcha%></jbbalcha><!-- 발차시간 -->
	<jbyetime><%=ds.jbyetime%></jbyetime><!-- 예정시간 -->
	<jbdotime><%=ds.jbdotime%></jbdotime><!-- 도착시간 -->
	<medicd><%=ds.medicd%></medicd><!-- 매체코드 -->
	<mcname><![CDATA[<%=ds.mcname%>]]></mcname><!-- 매체명 -->
	<bo_addr><![CDATA[<%=ds.bo_addr%>]]></bo_addr><!-- 센터주소 -->
</bsdetailinfo>
<%
	}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode>
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>
	</errinfo>
<bsdetailinfo>
	<bocd></bocd>
	<jpcode></jpcode>
	<jbjiorder></jbjiorder>
	<jbpansu></jbpansu>
	<jpname></jpname>
	<inname></inname>
	<jbbusu></jbbusu>
	<jbbalcha></jbbalcha>
	<jbyetime></jbyetime>
	<jbdotime></jbdotime>
	<medicd></medicd>
	<mcname></mcname>
	<bo_addr></bo_addr>
</bsdetailinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
<bsdetailinfo>
	<bocd></bocd>
	<jpcode></jpcode>
	<jbjiorder></jbjiorder>
	<jbpansu></jbpansu>
	<jpname></jpname>
	<inname></inname>
	<jbbusu></jbbusu>
	<jbbalcha></jbbalcha>
	<jbyetime></jbyetime>
	<jbdotime></jbdotime>
	<medicd></medicd>
	<mcname></mcname>
	<bo_addr></bo_addr>
</bsdetailinfo>
<%
	}
%>
</bsdetaillist>