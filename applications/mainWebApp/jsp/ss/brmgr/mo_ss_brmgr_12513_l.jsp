<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_ss_brmgr_12513_l.jsp
* 기능       : 센터관리-건전도관리-센터종합정보관리_구독료수금_모바일용
* 작성일자   : 2016-12-19
* 작성자     : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_MO_SLS_BRMGR_2513_LDataSet ds = (SS_MO_SLS_BRMGR_2513_LDataSet)request.getAttribute("ds");
%>
<curcommlist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
<%
	if( ds.curcommlist.size() > 0 ){
		SS_MO_SLS_BRMGR_2513_LCURCOMMLISTRecord rec = null;
		for( int i=0; i < ds.curcommlist.size(); i++ ){
			rec = (SS_MO_SLS_BRMGR_2513_LCURCOMMLISTRecord)ds.curcommlist.get( i );
%>
<clamtinfo>
		<yymm><%= rec.yymm %></yymm><!-- 년월 -->
		<bonm><![CDATA[<%=rec.bonm %>]]></bonm><!-- 센터명-->
		<boclsf><![CDATA[<%=rec.boclsf %>]]></boclsf><!-- 센터구분 -->
		<medaqty><%= rec.medaqty %></medaqty><!-- 조정부수 -->
		<meda_amt><%= rec.meda_amt %></meda_amt><!-- 조정액 -->
		<repm_amt><%= rec.repm_amt %></repm_amt><!-- 수금액 -->
		<repm_rate><%= rec.repm_rate %></repm_rate><!-- 수금률 -->
		<longmisu><%= rec.longmisu %></longmisu><!-- 장기미수 -->
		<lm_rate><%= rec.lm_rate %></lm_rate><!-- 미수비율 -->
</clamtinfo>
<%
			}
		}else{
%>
<clamtinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<medaqty></medaqty>
		<meda_amt></meda_amt>
		<repm_amt></repm_amt>
		<repm_rate></repm_rate>
		<longmisu></longmisu>
		<lm_rate></lm_rate>
</clamtinfo>
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
<clamtinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<medaqty></medaqty>
		<meda_amt></meda_amt>
		<repm_amt></repm_amt>
		<repm_rate></repm_rate>
		<longmisu></longmisu>
		<lm_rate></lm_rate>
</clamtinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
<clamtinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<medaqty></medaqty>
		<meda_amt></meda_amt>
		<repm_amt></repm_amt>
		<repm_rate></repm_rate>
		<longmisu></longmisu>
		<lm_rate></lm_rate>
</clamtinfo>
<%
	}
%>
</curcommlist>