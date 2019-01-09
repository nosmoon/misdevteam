<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_ss_brmgr_11830_l.jsp
* 기능       : 배달카드(해당센터의 아파트 구독현황 조회) _모바일용
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
    // dataset 인스턴스 선언부분
    SS_L_APTDLV_LISTDataSet ds = (SS_L_APTDLV_LISTDataSet)request.getAttribute("ds");  // request dataset

%>
<!-- 아파트 구독현황 리스트 시작 -->
<dlvlistcurlist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
<%
	if( ds.dlvlistcur.size() > 0 ){
		SS_L_APTDLV_LISTDLVLISTCURRecord rec = null;
		for( int i=0; i < ds.dlvlistcur.size(); i++ ){
			rec = (SS_L_APTDLV_LISTDLVLISTCURRecord)ds.dlvlistcur.get( i );
%>
	<dlvlistcurinfo>
		<dlvqty><%=rec.dlvqty %></dlvqty>                      <!-- 매체+부수(2부터표시)+호 -->
		<dlvqty2><%=rec.dlvqty2 %></dlvqty2>				<!-- 매체+부수(2부터표시)+호+투입장소 -->
		<apt_dong><%=rec.dongno %></apt_dong>				<!-- 아파트동 -->
		<apt_floor><%=rec.dlvdong %></apt_floor>			<!-- 층 -->
		<apt_ho><%=rec.dlvser_no %></apt_ho>	<!-- 호 -->
		<rdrmisuyn><%=rec.rdrmisuyn %></rdrmisuyn>	<!-- 독자번호#미수여부 -->
	</dlvlistcurinfo>
<%
			}
		}else{
%>
	<dlvlistcurinfo>
		<dlvqty></dlvqty>                      <!-- 매체+부수(2부터표시)+호 -->
		<dlvqty2></dlvqty2>				<!-- 매체+부수(2부터표시)+호+투입장소 -->
		<apt_dong></apt_dong>				<!-- 아파트동 -->
		<apt_floor></apt_floor>			<!-- 층 -->
		<apt_ho></apt_ho>	<!-- 호 -->
		<rdrmisuyn></rdrmisuyn>	<!-- 독자번호#미수여부 -->
	</dlvlistcurinfo>
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
	<dlvlistcurinfo>
		<dlvqty></dlvqty>                      <!-- 매체+부수(2부터표시)+호 -->
		<dlvqty2></dlvqty2>				<!-- 매체+부수(2부터표시)+호+투입장소 -->
		<apt_dong></apt_dong>				<!-- 아파트동 -->
		<apt_floor></apt_floor>			<!-- 층 -->
		<apt_ho></apt_ho>	<!-- 호 -->
		<rdrmisuyn></rdrmisuyn>	<!-- 독자번호#미수여부 -->
	</dlvlistcurinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
	<dlvlistcurinfo>
		<dlvqty></dlvqty>                      <!-- 매체+부수(2부터표시)+호 -->
		<dlvqty2></dlvqty2>				<!-- 매체+부수(2부터표시)+호+투입장소 -->
		<apt_dong></apt_dong>				<!-- 아파트동 -->
		<apt_floor></apt_floor>			<!-- 층 -->
		<apt_ho></apt_ho>	<!-- 호 -->
		<rdrmisuyn></rdrmisuyn>	<!-- 독자번호#미수여부 -->
	</dlvlistcurinfo>
<%
	}
%>
</dlvlistcurlist>

<!--		1. dlvqty, dlvqty2 값이 BLANK일 때						-->
<!--            없는 공간을 BLANK로 표시                                 -->
