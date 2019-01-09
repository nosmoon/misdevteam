<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_ss_brmgr_12511_l.jsp
* 기능       : 센터관리-건전도관리-센터종합정보관리_부수현황_모바일용
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
	SS_MO_SLS_BRMGR_2511_LDataSet ds = (SS_MO_SLS_BRMGR_2511_LDataSet)request.getAttribute("ds");
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
		SS_MO_SLS_BRMGR_2511_LCURCOMMLISTRecord rec = null;
		for( int i=0; i < ds.curcommlist.size(); i++ ){
			rec = (SS_MO_SLS_BRMGR_2511_LCURCOMMLISTRecord)ds.curcommlist.get( i );
%>
	<qtyinfo>
		<yymm><%= rec.yymm %></yymm> <!-- 년월 -->
		<bonm><![CDATA[<%=rec.bonm %>]]></bonm><!-- 센터명 -->
		<boclsf><![CDATA[<%=rec.boclsf %>]]></boclsf><!-- 센터구분 -->
		<curmm_issu_qty><%= rec.curmm_issu_qty %></curmm_issu_qty> <!-- 발송부수 -->
		<rdr_qty><%= rec.rdr_qty %></rdr_qty><!-- 독자부수(부수) -->
		<gap_qty><%= rec.gap_qty %></gap_qty><!-- 독자부수(전월대비) -->
		<val_qty><%= rec.val_qty %></val_qty><!-- 당월유가(부수) -->
		<val_rate><%= rec.val_rate %></val_rate><!-- 당월유가(비율) -->
		<pre_val_qty><%= rec.pre_val_qty %></pre_val_qty><!-- 준유가(부수) -->
		<pre_val_rate><%= rec.pre_val_rate %></pre_val_rate><!-- 준유가(비율) -->
</qtyinfo>
<%
			}
		}else{
%>
	<qtyinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<curmm_issu_qty></curmm_issu_qty>
		<rdr_qty></rdr_qty>
		<gap_qty></gap_qty>
		<val_qty></val_qty>
		<val_rate></val_rate>
		<pre_val_qty></pre_val_qty>
		<pre_val_rate></pre_val_rate>
</qtyinfo>
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
	<qtyinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<curmm_issu_qty></curmm_issu_qty>
		<rdr_qty></rdr_qty>
		<gap_qty></gap_qty>
		<val_qty></val_qty>
		<val_rate></val_rate>
		<pre_val_qty></pre_val_qty>
		<pre_val_rate></pre_val_rate>
</qtyinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
	<qtyinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<curmm_issu_qty></curmm_issu_qty>
		<rdr_qty></rdr_qty>
		<gap_qty></gap_qty>
		<val_qty></val_qty>
		<val_rate></val_rate>
		<pre_val_qty></pre_val_qty>
		<pre_val_rate></pre_val_rate>
</qtyinfo>
<%
	}
%>
</curcommlist>