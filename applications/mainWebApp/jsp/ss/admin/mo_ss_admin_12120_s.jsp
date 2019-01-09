<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_ss_admin_12120_s.jsp
* 기능       : 기초정보관리-모바일관리-직원상세_모바일용
* 작성일자   : 2017-01-23
* 작성자     : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_MO_S_LOGINAPLC_APRVDataSet ds = (SS_MO_S_LOGINAPLC_APRVDataSet)request.getAttribute("ds");
%>
<boempdetaillist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
<boempdetailinfo>
	<deptnm><![CDATA[<%=ds.deptnm%>]]></deptnm> <!-- 팀명 -->
	<partnm><![CDATA[<%=ds.partnm%>]]></partnm><!-- 파트명 -->
	<areanm><![CDATA[<%=ds.areanm%>]]></areanm> <!-- 지역명 -->
	<bocd><%=ds.bocd%></bocd><!-- 센터코드 -->
	<bonm><![CDATA[<%=ds.bonm%>]]></bonm> <!-- 센터명 -->
	<prsi_nm><![CDATA[<%=ds.presi_nm%>]]></prsi_nm> <!-- 센터대표명 -->
	<tel_no><%=ds.tel_no%></tel_no> <!-- 센터전화번호 -->
	<bo_addr><![CDATA[<%=ds.bo_addr%>]]></bo_addr> <!-- 센터주소 -->
	<boemp_no><%=ds.boemp_no%></boemp_no> <!-- 직원코드-->
	<flnm><![CDATA[<%=ds.flnm%>]]></flnm><!-- 직원명 -->
	<dutycd><%=ds.dutycd%></dutycd> <!-- 직책코드 -->
	<dutynm><![CDATA[<%=ds.dutynm%>]]></dutynm><!-- 직책코드명 -->
	<boemp_id><%=ds.boemp_id%></boemp_id> <!-- 모바일ID -->
	<tel><%=ds.tel%></tel> <!-- 직원전화번호 -->
	<ptph><%=ds.ptph%></ptph> <!-- 직원휴대폰번호 -->
	<maprvaplcdt><%=ds.maprvaplcdt%></maprvaplcdt> <!-- 승인신청일자 -->
	<deviceid><%=ds.deviceid%></deviceid> <!-- 기기ID -->
	<gcmid><%=ds.gcmid%></gcmid> <!-- GCMID -->
	<logindt><%=ds.logindt%></logindt> <!-- 최근로그인일자 -->
	<appuseyn><%=ds.appuseyn%></appuseyn> <!-- 모바일사용여부 -->
	<maprvstatcd><%=ds.maprvstatcd%></maprvstatcd> <!-- 승인상태코드 -->
	<maprvstatnm><![CDATA[<%=ds.maprvstatnm%>]]></maprvstatnm><!-- 승인상태코드명 -->
	<ddaprvid><%=ds.ddaprvid%></ddaprvid><!-- 담당승인ID -->
	<ddaprvdt><%=ds.ddaprvdt%></ddaprvdt><!-- 담당승인일자 -->
	<ddremk><![CDATA[<%=ds.ddremk%>]]></ddremk><!-- 담당비고 -->
	<ddaprvnm><![CDATA[<%=ds.ddaprvnm%>]]></ddaprvnm><!-- 담당명 -->
	<in_cmpy_dt><%=ds.in_cmpy_dt %></in_cmpy_dt><!-- 입사일자 -->
	<lv_cmpy_dt><%=ds.lv_cmpy_dt %></lv_cmpy_dt><!-- 퇴사일자 -->
	<mblockyn><%=ds.mblockyn %></mblockyn> <!-- 모바일차단여부 -->
	<min_login_dt><%=ds.min_login_dt %></min_login_dt>	<!-- 최초로그인시간 -->
	<max_login_dt><%=ds.max_login_dt %></max_login_dt> <!-- 최종로그인시간 -->
</boempdetailinfo>
<%
	}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode>
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>
	</errinfo>
<boempdetailinfo>
	<deptnm></deptnm>
	<partnm></partnm>
	<areanm></areanm>
	<bocd></bocd>
	<bonm></bonm>
	<presi_nm></presi_nm>
	<tel_no></tel_no>
	<bo_addr></bo_addr>
	<boemp_no></boemp_no>
	<flnm></flnm>
	<dutycd></dutycd>
	<dutynm></dutynm>
	<boemp_id></boemp_id>
	<tel></tel>
	<ptph></ptph>
	<maprvaplcdt></maprvaplcdt>
	<deviceid></deviceid>
	<gcmid></gcmid>
	<logindt></logindt>
	<appuseyn></appuseyn>
	<maprvstatcd></maprvstatcd>
	<maprvstatnm></maprvstatnm>
	<ddaprvid></ddaprvid>
	<ddaprvdt></ddaprvdt>
	<ddremk></ddremk>
	<ddaprvnm></ddaprvnm>
	<in_cmpy_dt></in_cmpy_dt>
	<lv_cmpy_dt></lv_cmpy_dt>
	<mblockyn></mblockyn>
	<min_login_dt></min_login_dt>
	<max_login_dt></max_login_dt>
</boempdetailinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
<boempdetailinfo>
	<deptnm></deptnm>
	<partnm></partnm>
	<areanm></areanm>
	<bocd></bocd>
	<bonm></bonm>
	<presi_nm></presi_nm>
	<tel_no></tel_no>
	<bo_addr></bo_addr>
	<boemp_no></boemp_no>
	<flnm></flnm>
	<dutycd></dutycd>
	<dutynm></dutynm>
	<boemp_id></boemp_id>
	<tel></tel>
	<ptph></ptph>
	<maprvaplcdt></maprvaplcdt>
	<deviceid></deviceid>
	<gcmid></gcmid>
	<logindt></logindt>
	<appuseyn></appuseyn>
	<maprvstatcd></maprvstatcd>
	<maprvstatnm></maprvstatnm>
	<ddaprvid></ddaprvid>
	<ddaprvdt></ddaprvdt>
	<ddremk></ddremk>
	<ddaprvnm></ddaprvnm>
	<in_cmpy_dt></in_cmpy_dt>
	<lv_cmpy_dt></lv_cmpy_dt>
	<mblockyn></mblockyn>
	<min_login_dt></min_login_dt>
	<max_login_dt></max_login_dt>
</boempdetailinfo>
<%
	}
%>
</boempdetaillist>