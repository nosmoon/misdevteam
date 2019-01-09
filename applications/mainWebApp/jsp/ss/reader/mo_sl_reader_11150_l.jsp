<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_sl_reader_11150_l.jsp
* 기능       : 독자정보관리-구독내역팝업창-구독리스트
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
	SL_MO_L_NWSPSUBSCNTRPTCRDataSet ds = (SL_MO_L_NWSPSUBSCNTRPTCRDataSet)request.getAttribute("ds");
%>
<cntrptlist>
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
	if( ds.nwspsubscntrcur.size() > 0 ){
		SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord rec = null;
		for( int i=0; i < ds.nwspsubscntrcur.size(); i++ ){
			rec = (SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord)ds.nwspsubscntrcur.get( i );
%>
	<cntrptinfo>
		<rdr_extndt><%= rec.rdr_extndt %></rdr_extndt><!-- 확장일자 --> <!-- 구독기간은 확장일자~중지일자임 -->
		<suspdt><%= rec.suspdt %></suspdt><!-- 중지일자 -->
		<bonm><![CDATA[<%= rec.bonm %>]]></bonm><!-- 센터명 -->
		<medinm><![CDATA[<%= rec.medinm %>]]></medinm><!-- 매체명 -->
		<rdr_extntypenm><![CDATA[<%= rec.rdr_extntypenm %>]]></rdr_extntypenm><!-- 확장유형 -->
		<extnnm><![CDATA[<%= rec.extnnm %>]]></extnnm><!-- 확장자 -->
		<suspresncd><![CDATA[<%= rec.suspresncd %>]]></suspresncd><!-- 중지사유 -->
		<remk><![CDATA[<%= rec.remk %>]]></remk><!-- 비고 -->
	</cntrptinfo>
<%
			}
		}else{
%>
	<cntrptinfo>
		<rdr_extndt></rdr_extndt>
		<suspdt></suspdt>
		<bonm></bonm>
		<medinm></medinm>
		<rdr_extntypenm></rdr_extntypenm>
		<extnnm></extnnm>
		<suspresncd></suspresncd>
		<remk></remk>
	</cntrptinfo>
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
	<cntrptinfo>
		<rdr_extndt></rdr_extndt>
		<suspdt></suspdt>
		<bonm></bonm>
		<medinm></medinm>
		<rdr_extntypenm></rdr_extntypenm>
		<extnnm></extnnm>
		<suspresncd></suspresncd>
		<remk></remk>
	</cntrptinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
	<totalcnt></totalcnt>
	<cntrptinfo>
		<rdr_extndt></rdr_extndt>
		<suspdt></suspdt>
		<bonm></bonm>
		<medinm></medinm>
		<rdr_extntypenm></rdr_extntypenm>
		<extnnm></extnnm>
		<suspresncd></suspresncd>
		<remk></remk>
	</cntrptinfo>
<%
	}
%>
</cntrptlist>