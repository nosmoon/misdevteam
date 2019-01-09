<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : mo_ss_brmgr_11850_l.jsp
* 기능 	 	 :  센터관리-투입률조사-저장하기 위한 아파트투입률조회(아파트형태리스트 or 투입률등록리스트)_모바일만존재
* 작성일자 	 : 2017-01-12
* 작성자 	 : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 :
* 기능 	 	 :
* 작성일자 	 :
* 작성자 	 :
---------------------------------------------------------------------------------------------------%>
<%

    // dataset 인스턴스 선언부분
    SS_MO_L_APTINPIVSTDataSet ds = (SS_MO_L_APTINPIVSTDataSet)request.getAttribute("ds");  // request dataset

%>
<!--투입등록이포함된 아파트형태리스트 or 아파트형태리스트 -->
<aptinpivstlist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
<%
	if( ds.aptinpivstcur.size() > 0 ){
		SS_MO_L_APTINPIVSTAPTINPIVSTCURRecord rec = null;
		for( int i=0; i < ds.aptinpivstcur.size(); i++ ){
			rec = (SS_MO_L_APTINPIVSTAPTINPIVSTCURRecord)ds.aptinpivstcur.get( i );
%>
<aptinpivstinfo>
	<dlvqty><%= rec.dlvqty %></dlvqty> <!-- 매체요약명||호수/ 빈공간이면 BLANK -->
	<apt_dong><%= rec.apt_dong %></apt_dong> <!-- 동 -->
	<apt_floor><%= rec.apt_floor %></apt_floor> <!-- 층 -->
	<apt_ho><%= rec.apt_ho %></apt_ho><!-- 호 -->
</aptinpivstinfo>
<%
			}
		}else{
%>
<aptinpivstinfo>
	<dlvqty></dlvqty>
	<apt_dong></apt_dong>
	<apt_floor></apt_floor>
	<apt_ho></apt_ho>
</aptinpivstinfo>
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
<aptinpivstinfo>
	<dlvqty></dlvqty>
	<apt_dong></apt_dong>
	<apt_floor></apt_floor>
	<apt_ho></apt_ho>
</aptinpivstinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
<aptinpivstinfo>
	<dlvqty></dlvqty>
	<apt_dong></apt_dong>
	<apt_floor></apt_floor>
	<apt_ho></apt_ho>
</aptinpivstinfo>
<%
	}
%>
</aptinpivstlist>