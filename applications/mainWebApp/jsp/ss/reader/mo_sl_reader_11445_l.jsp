<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_sl_reader_11445_l.jsp
* 기능       : 독자정보관리(중지내역팝업-목록조회)_모바일용
* 작성일자   : 2017-02-03
* 작성자     : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SL_L_SUBS_CNTR_STOP_HISTDataSet ds = (SL_L_SUBS_CNTR_STOP_HISTDataSet)request.getAttribute("ds");
%>
<susplist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
<%
	if( ds.stopcntrcur.size() > 0 ){
		SL_L_SUBS_CNTR_STOP_HISTSTOPCNTRCURRecord rec = null;
		for( int i=0; i < ds.stopcntrcur.size(); i++ ){
			rec = (SL_L_SUBS_CNTR_STOP_HISTSTOPCNTRCURRecord)ds.stopcntrcur.get( i );
%>
<stopinfo>
	<medinm><![CDATA[<%= rec.medinm %>]]></medinm><!-- 매체명 -->
	<cntrno><%= rec.cntrno %></cntrno><!-- 계약번호 -->
	<mangno><%= rec.mangno %></mangno><!-- 관리번호 -->
<%
	String freeyn = rec.freeyn ;

	if("Y".equals(freeyn)){
		freeyn = "무료";
	}else{
		freeyn = "유료";
	}
%>
	<freeyn><![CDATA[<%= freeyn%>]]></freeyn> <!-- 구독구분 -->
	<subsqty><%= rec.subsqty %></subsqty><!-- 부수 -->
	<subsuprc><%= rec.subsuprc %></subsuprc><!-- 구독단가 -->
	<valmm><%= rec.valmm %></valmm><!-- 유가월 -->
	<rdr_extndt><%= rec.rdr_extndt %></rdr_extndt><!-- 확장일자 -->
	<suspdt><%= rec.suspdt %></suspdt><!-- 중지일자 -->
	<suspresn><![CDATA[<%= rec.suspresn %>]]></suspresn><!-- 중지사유코드명 -->
</stopinfo>
<%
			}
		}else{
%>
<stopinfo>
	<medinm></medinm>
	<cntrno></cntrno>
	<mangno></mangno>
	<freeyn></freeyn>
	<subsqty></subsqty>
	<subsuprc></subsuprc>
	<valmm></valmm>
	<rdr_extndt></rdr_extndt>
	<suspdt></suspdt>
	<suspresn></suspresn>
</stopinfo>
<%
	}
%>
<%
	}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode>
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>
	</errinfo>
<stopinfo>
	<medinm></medinm>
	<cntrno></cntrno>
	<mangno></mangno>
	<freeyn></freeyn>
	<subsqty></subsqty>
	<subsuprc></subsuprc>
	<valmm></valmm>
	<rdr_extndt></rdr_extndt>
	<suspdt></suspdt>
	<suspresn></suspresn>
</stopinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
<stopinfo>
	<medinm></medinm>
	<cntrno></cntrno>
	<mangno></mangno>
	<freeyn></freeyn>
	<subsqty></subsqty>
	<subsuprc></subsuprc>
	<valmm></valmm>
	<rdr_extndt></rdr_extndt>
	<suspdt></suspdt>
	<suspresn></suspresn>
</stopinfo>
<%
	}
%>
</susplist>