<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 	: mo_ss_brmgr_11880_l.jsp
* 기능 	 	 :  센터관리-투입률조사-아파트정보 및 매체,약어리스트_모바일만존재
* 작성일자 	 : 2017-01-13
* 작성자 	 : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 :
* 기능 	 	 :
* 작성일자 	 :
* 작성자 	 :
---------------------------------------------------------------------------------------------------%>
<%
	SL_MO_L_INPIVSTINFODataSet ds = (SL_MO_L_INPIVSTINFODataSet)request.getAttribute("ds");
%>
<inpivstinfolist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>

<%
	if( ds.aptinfocur.size() > 0 ){
		SL_MO_L_INPIVSTINFOAPTINFOCURRecord rec = null;
		for( int i=0; i < ds.aptinfocur.size(); i++ ){
			rec = (SL_MO_L_INPIVSTINFOAPTINFOCURRecord)ds.aptinfocur.get( i );
%>
<aptinfo>
	<dongno><%= rec.dongno %></dongno><!-- 동 -->
	<hoscnt1><%= rec.hoscnt %></hoscnt1><!-- 세대수 -->
	<pyong1><%= rec.pyong %></pyong1><!-- 평 -->
</aptinfo>
<%
			}
		}else{
%>
<aptinfo>
	<dongno></dongno>
	<hoscnt1></hoscnt1>
	<pyong1></pyong1>
</aptinfo>
<%
	}
%>
<%
	if( ds.aptivstmedicur.size() > 0 ){
		SL_MO_L_INPIVSTINFOAPTIVSTMEDICURRecord rec = null;
		for( int i=0; i < ds.aptivstmedicur.size(); i++ ){
			rec = (SL_MO_L_INPIVSTINFOAPTIVSTMEDICURRecord)ds.aptivstmedicur.get( i );
%>
<aptivstmediinfo>
	<medicd><%= rec.medicd %></medicd><!-- 매체코드 -->
	<medinm><![CDATA[<%= rec.medinm %>]]></medinm><!-- 매체명 -->
	<mediycd><%= rec.mediycd %></mediycd><!-- 매체약어코드 -->
	<mediynm><![CDATA[<%= rec.mediynm %>]]></mediynm><!-- 매체약어명 -->
</aptivstmediinfo>
<%
			}
		}else{
%>
<aptivstmediinfo>
	<medicd></medicd>
	<medinm></medinm>
	<mediycd></mediycd>
	<mediynm></mediynm>
</aptivstmediinfo>
<%
	}
%>
	<etcinfo>
		<accflag></accflag> <!--입력:I / 수정:U / 삭제:D -->
		<hmflag></hmflag>  <!--입력방법 항상H -->
		<pyong2></pyong2> <!--평2 값이 없을 때 0-->
		<hscnt2></hscnt2><!--세대수2 값이 없을 때 0-->
		<pyong3></pyong3> <!--평3 값이 없을 때 0-->
		<hscnt3></hscnt3><!--세대수3 값이 없을 때 0-->
		<invsgdt></invsgdt><!--조사일자, default값으로 현재일자-->
		<housval></housval><!--호별매체 ex)009001C 9층1호에 조선일보-->
		<incmgpers></incmgpers><!--입력자-->
		<regtype1></regtype1> <!--등록구분1(센터) 항상 30-->
		<regtype2></regtype2><!--등록구분2(센터종사원) 항상 10-->
	</etcinfo>
<%
	}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode>
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>
	</errinfo>
	<aptinfo>
		<dongno></dongno>
		<hoscnt1></hoscnt1>
		<pyong1></pyong1>
	</aptinfo>
	<aptivstmediinfo>
		<medicd></medicd>
		<medinm></medinm>
		<mediycd></mediycd>
		<mediynm></mediynm>
	</aptivstmediinfo>
	<etcinfo>
		<accflag></accflag> <!--입력:I / 수정:U / 삭제:D -->
		<hmflag></hmflag>  <!--입력방법 항상H -->
		<pyong2></pyong2> <!--평2 값이 없을 때 0-->
		<hscnt2></hscnt2><!--세대수2 값이 없을 때 0-->
		<pyong3></pyong3> <!--평3 값이 없을 때 0-->
		<hscnt3></hscnt3><!--세대수3 값이 없을 때 0-->
		<invsgdt></invsgdt><!--조사일자, default값으로 현재일자-->
		<housval></housval><!--호별매체 ex)009001C 9층1호에 조선일보-->
		<incmgpers></incmgpers><!--입력자-->
		<regtype1></regtype1> <!--등록구분1(센터) 항상 30-->
		<regtype2></regtype2><!--등록구분2(센터종사원) 항상 10-->
	</etcinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
	<aptinfo>
		<dongno></dongno>
		<hoscnt1></hoscnt1>
		<pyong1></pyong1>
	</aptinfo>
	<aptivstmediinfo>
		<medicd></medicd>
		<medinm></medinm>
		<mediycd></mediycd>
		<mediynm></mediynm>
	</aptivstmediinfo>
	<etcinfo>
		<accflag></accflag> <!--입력:I / 수정:U / 삭제:D -->
		<hmflag></hmflag>  <!--입력방법 항상H -->
		<pyong2></pyong2> <!--평2 값이 없을 때 0-->
		<hscnt2></hscnt2><!--세대수2 값이 없을 때 0-->
		<pyong3></pyong3> <!--평3 값이 없을 때 0-->
		<hscnt3></hscnt3><!--세대수3 값이 없을 때 0-->
		<invsgdt></invsgdt><!--조사일자, default값으로 현재일자-->
		<housval></housval><!--호별매체 ex)009001C 9층1호에 조선일보-->
		<incmgpers></incmgpers><!--입력자-->
		<regtype1></regtype1> <!--등록구분1(센터) 항상 30-->
		<regtype2></regtype2><!--등록구분2(센터종사원) 항상 10-->
	</etcinfo>
<%
	}
%>
</inpivstinfolist>