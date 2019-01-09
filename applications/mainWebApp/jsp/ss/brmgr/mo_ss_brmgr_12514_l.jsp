<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_ss_brmgr_12514_l.jsp
* 기능       : 센터관리-건전도관리-센터종합정보관리_전단/기타_모바일용
* 작성일자   : 2016-12-15
* 작성자     : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_MO_SLS_BRMGR_2514_LDataSet ds = (SS_MO_SLS_BRMGR_2514_LDataSet)request.getAttribute("ds");
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
		SS_MO_SLS_BRMGR_2514_LCURCOMMLISTRecord rec = null;
		for( int i=0; i < ds.curcommlist.size(); i++ ){
			rec = (SS_MO_SLS_BRMGR_2514_LCURCOMMLISTRecord)ds.curcommlist.get( i );
%>
	<etcinfo>
		<yymm><%= rec.yymm %></yymm> <!-- 년월 -->
		<bonm><![CDATA[<%=rec.bonm %>]]></bonm> <!-- 센터명 -->
		<boclsf><![CDATA[<%=rec.boclsf %>]]></boclsf><!-- 센터구분 -->
		<leaf_amt><%= rec.leaf_amt %></leaf_amt> <!-- 전단매출 -->
		<extn_alon><%= rec.extn_alon %></extn_alon><!-- 확장수당 -->
		<daenap_amt><%= rec.daenap_amt %></daenap_amt> <!-- 대납 -->
	</etcinfo>
<%
			}
		}else{
%>
<etcinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<leaf_amt></leaf_amt>
		<extn_alon></extn_alon>
		<daenap_amt></daenap_amt>
</etcinfo>
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
<etcinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<leaf_amt></leaf_amt>
		<extn_alon></extn_alon>
		<daenap_amt></daenap_amt>
</etcinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
<etcinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<leaf_amt></leaf_amt>
		<extn_alon></extn_alon>
		<daenap_amt></daenap_amt>
</etcinfo>
<%
	}
%>
</curcommlist>