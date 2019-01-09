<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_ss_brmgr_12510_l.jsp
* 기능       : 센터관리-건전도관리-센터종합정보관리_확장부수_모바일용
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
	SS_MO_SLS_BRMGR_2510_LDataSet ds = (SS_MO_SLS_BRMGR_2510_LDataSet)request.getAttribute("ds");
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
		SS_MO_SLS_BRMGR_2510_LCURCOMMLISTRecord rec = null;
		for( int i=0; i < ds.curcommlist.size(); i++ ){
			rec = (SS_MO_SLS_BRMGR_2510_LCURCOMMLISTRecord)ds.curcommlist.get( i );
%>
<extncntinfo>
	<yymm><%= rec.yymm %></yymm> <!--년월-->
	<bonm><![CDATA[<%= rec.bonm %>]]></bonm><!--센터명-->
	<boclsf><![CDATA[<%= rec.boclsf %>]]></boclsf><!--센터구분-->
	<rdr_qty><%= rec.rdr_qty %></rdr_qty><!--독자부수-->
	<jm_qty><%= rec.jm_qty %></jm_qty><!--재무부수-->
	<extn_qty><%= rec.extn_qty %></extn_qty> <!--확장부수-->
	<susp_qty><%= rec.susp_qty %></susp_qty><!--중지부수-->
	<grow_qty><%= rec.grow_qty %></grow_qty> <!--성장부수-->
	<extn_rate><%= rec.extn_rate %></extn_rate><!--확장률-->
	<susp_rate><%= rec.susp_rate %></susp_rate><!--중지률-->
	<extn_qty2><%= rec.extn_qty2 %></extn_qty2><!--확장부수(수당지급부수조건추가)-->
	<susp_qty2><%= rec.susp_qty2 %></susp_qty2><!--중지부수(수당지급부수조건추가)-->
	<grow_qty2><%= rec.grow_qty2 %></grow_qty2><!--성장부수(수당지급부수조건추가)-->
	<extn_rate2><%= rec.extn_rate2 %></extn_rate2><!--확장률(수당지급부수조건추가)-->
	<susp_rate2><%= rec.susp_rate2 %></susp_rate2><!--중지률(수당지급부수조건추가)-->
</extncntinfo>
<%
			}
		}else{
%>
<extncntinfo>
	<yymm></yymm>
	<bonm></bonm>
	<boclsf></boclsf>
	<rdr_qty></rdr_qty>
	<jm_qty></jm_qty>
	<extn_qty></extn_qty>
	<susp_qty></susp_qty>
	<grow_qty></grow_qty>
	<extn_rate></extn_rate>
	<susp_rate></susp_rate>
	<extn_qty2></extn_qty2>
	<susp_qty2></susp_qty2>
	<grow_qty2></grow_qty2>
	<extn_rate2></extn_rate2>
	<susp_rate2></susp_rate2>
</extncntinfo>
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
<extncntinfo>
	<yymm></yymm>
	<bonm></bonm>
	<boclsf></boclsf>
	<rdr_qty></rdr_qty>
	<jm_qty></jm_qty>
	<extn_qty></extn_qty>
	<susp_qty></susp_qty>
	<grow_qty></grow_qty>
	<extn_rate></extn_rate>
	<susp_rate></susp_rate>
	<extn_qty2></extn_qty2>
	<susp_qty2></susp_qty2>
	<grow_qty2></grow_qty2>
	<extn_rate2></extn_rate2>
	<susp_rate2></susp_rate2>
</extncntinfo>
<%
		}
	}else{
%>
<errinfo>
	<errcode><![CDATA[-9999]]></errcode>
	<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
</errinfo>
<extncntinfo>
	<yymm></yymm>
	<bonm></bonm>
	<boclsf></boclsf>
	<rdr_qty></rdr_qty>
	<jm_qty></jm_qty>
	<extn_qty></extn_qty>
	<susp_qty></susp_qty>
	<grow_qty></grow_qty>
	<extn_rate></extn_rate>
	<susp_rate></susp_rate>
	<extn_qty2></extn_qty2>
	<susp_qty2></susp_qty2>
	<grow_qty2></grow_qty2>
	<extn_rate2></extn_rate2>
	<susp_rate2></susp_rate2>
</extncntinfo>
<%
	}
%>
</curcommlist>