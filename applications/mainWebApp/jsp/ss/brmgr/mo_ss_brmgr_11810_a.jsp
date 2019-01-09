<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_ss_brmgr_11810_a.jsp
* 기능       : 센터관리-투입률조사-아파트주소코드리스트_모바일용
* 작성일자   : 2017-01-13
* 작성자     : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SL_MO_L_COMM_APT_THRWDataSet ds = (SL_MO_L_COMM_APT_THRWDataSet)request.getAttribute("ds");
%>
<addrcdcurlist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
<!-- 아파트주소리스트 시작 -->
<%
	if( ds.addrcdcur.size() > 0 ){
		SL_MO_L_COMM_APT_THRWADDRCDCURRecord rec = null;
		for( int i=0; i < ds.addrcdcur.size(); i++ ){
			rec = (SL_MO_L_COMM_APT_THRWADDRCDCURRecord)ds.addrcdcur.get( i );
%>
	<addrcdcurinfo>
		<addrcd><%= rec.addrcd %></addrcd><!--주소코드-->
		<addrnm><![CDATA[<%= rec.addrnm %>]]></addrnm><!--주소코드명-->
		<addrdonglist><![CDATA[<%=rec.donglist %>]]></addrdonglist><!--동리스트-->
	</addrcdcurinfo>
<%
			}
		}else{
%>
	<addrcdcurinfo>
		<addrcd></addrcd>
		<addrnm></addrnm>
		<addrdonglist></addrdonglist>
	</addrcdcurinfo>
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
	<addrcdcurinfo>
		<addrcd></addrcd>
		<addrnm></addrnm>
		<addrdonglist></addrdonglist>
	</addrcdcurinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
	<addrcdcurinfo>
		<addrcd></addrcd>
		<addrnm></addrnm>
	</addrcdcurinfo>
<%
	}
%>
</addrcdcurlist>

