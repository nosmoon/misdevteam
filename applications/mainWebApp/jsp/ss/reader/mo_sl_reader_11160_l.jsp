<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_sl_reader_11160_l.jsp
* 기능       : 독자정보관리-구독내역팝업창-휴독리스트
* 작성일자   : 2017-02-06
* 작성자     : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%--DataSet 및 Request를 처리 한다. --%>
<%
	SL_MO_L_VSPTCRDataSet ds = (SL_MO_L_VSPTCRDataSet)request.getAttribute("ds");
%>
<vslist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
	<totalcnt><%=ds.totalcnt%></totalcnt>
<%
	if( ds.vsptcrcur.size() > 0 ){
		SL_MO_L_VSPTCRVSPTCRCURRecord rec = null;
		for( int i=0; i < ds.vsptcrcur.size(); i++ ){
			rec = (SL_MO_L_VSPTCRVSPTCRCURRecord)ds.vsptcrcur.get( i );
%>
	<vsinfo>
		<bonm><![CDATA[<%= rec.bonm %>]]></bonm><!-- 센터명 -->
		<medinm><![CDATA[<%= rec.medinm %>]]></medinm><!-- 매체명 -->
		<suspfrdt><%= rec.suspfrdt %></suspfrdt><!-- 휴독시작일자 --><!-- 휴독기간 = 휴독시작일자~휴독끝일자 -->
		<susptodt><%= rec.susptodt %></susptodt><!-- 휴독끝일자 -->
	</vsinfo>
<%
			}
		}else{
%>
	<vsinfo>
		<bonm></bonm>
		<medinm></medinm>
		<suspfrdt></suspfrdt>
		<susptodt></susptodt>
	</vsinfo>
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
	<totalcnt></totalcnt>
	<vsinfo>
		<bonm></bonm>
		<medinm></medinm>
		<suspfrdt></suspfrdt>
		<susptodt></susptodt>
	</vsinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
	<totalcnt></totalcnt>
	<vsinfo>
		<bonm></bonm>
		<medinm></medinm>
		<suspfrdt></suspfrdt>
		<susptodt></susptodt>
	</vsinfo>
<%
	}
%>
</vslist>