<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_ss_common_11108_l.jsp
* 기능       : 공통-지역검색(지역리스트)_모바일용
* 작성일자   : 2016-12-14
* 작성자     : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SL_MO_L_AREALISTDataSet ds = (SL_MO_L_AREALISTDataSet)request.getAttribute("ds");
%>
<arealist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
<errinfo>
	<errcode></errcode>
	<errmsg></errmsg>
</errinfo>

<%
	if( ds.areacur.size() > 0 ){
		SL_MO_L_AREALISTAREACURRecord rec = null;
		for( int i=0; i < ds.areacur.size(); i++ ){
			rec = (SL_MO_L_AREALISTAREACURRecord)ds.areacur.get( i );
%>
<areainfo>
	<areacd><%= rec.cd %></areacd> <!-- 지역코드 -->
	<areanm><![CDATA[<%= rec.cdnm %>]]></areanm> <!-- 지역코드명 -->
</areainfo>
<%
			}
		}else{
%>
<areainfo>
	<areacd></areacd>
	<areanm></areanm>
</areainfo>
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
<areainfo>
	<areacd></areacd> <!-- 지역코드 -->
	<areanm></areanm> <!-- 지역코드명 -->
</areainfo>
<%
		}
	}else{
%>
<errinfo>
	<errcode><![CDATA[-9999]]></errcode>
	<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
</errinfo>
<areainfo>
	<areacd></areacd>
	<areanm></areanm>
</areainfo>

<%
	}
%>
</arealist>