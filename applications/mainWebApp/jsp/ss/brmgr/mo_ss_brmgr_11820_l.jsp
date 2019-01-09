<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_ss_brmgr_11820_l.jsp
* 기능       : 센터관리-투입률조사-아파트동리스트_모바일용
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
    SL_L_DTLSADDRDataSet ds = (SL_L_DTLSADDRDataSet)request.getAttribute("ds");

	String addrcd = request.getParameter("addrcd");

%>
<!-- 동 리스트 시작 -->
<dongcurlist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
<%
		 if(ds != null){
			for(int i=0 ; i< ds.curcommlist.size(); i++) {
		 		SL_L_DTLSADDRCURCOMMLISTRecord rec = (SL_L_DTLSADDRCURCOMMLISTRecord)ds.curcommlist.get(i);
%>
	<dongcurinfo>
		<addrcd><%=addrcd %></addrcd>				<!-- 주소코드 -->
		<dongno><%=rec.dongno %></dongno>		<!-- 동 -->
		<florcnt><%=rec.florcnt %></florcnt>			<!-- 층 -->
		<hoscnt><%=rec.flor_houscnt %></hoscnt><!-- 호 -->
	</dongcurinfo>
<%
			}
		 }else{
%>
	<dongcurinfo>
		<addrcd></addrcd>
		<dongno></dongno>
		<florcnt></florcnt>
		<hoscnt></hoscnt>
	</dongcurinfo>
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
	<dongcurinfo>
		<addrcd></addrcd>
		<dongno></dongno>
		<florcnt></florcnt>
		<hoscnt></hoscnt>
	</dongcurinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
	<dongcurinfo>
		<addrcd></addrcd>
		<dongno></dongno>
		<florcnt></florcnt>
		<hoscnt></hoscnt>
	</dongcurinfo>
<%
	}
%>
</dongcurlist>
