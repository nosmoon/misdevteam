<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_ss_admin_12120_s.jsp
* ���       : ������������-����ϰ���-������_����Ͽ�
* �ۼ�����   : 2017-01-23
* �ۼ���     : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
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
	<deptnm><![CDATA[<%=ds.deptnm%>]]></deptnm> <!-- ���� -->
	<partnm><![CDATA[<%=ds.partnm%>]]></partnm><!-- ��Ʈ�� -->
	<areanm><![CDATA[<%=ds.areanm%>]]></areanm> <!-- ������ -->
	<bocd><%=ds.bocd%></bocd><!-- �����ڵ� -->
	<bonm><![CDATA[<%=ds.bonm%>]]></bonm> <!-- ���͸� -->
	<prsi_nm><![CDATA[<%=ds.presi_nm%>]]></prsi_nm> <!-- ���ʹ�ǥ�� -->
	<tel_no><%=ds.tel_no%></tel_no> <!-- ������ȭ��ȣ -->
	<bo_addr><![CDATA[<%=ds.bo_addr%>]]></bo_addr> <!-- �����ּ� -->
	<boemp_no><%=ds.boemp_no%></boemp_no> <!-- �����ڵ�-->
	<flnm><![CDATA[<%=ds.flnm%>]]></flnm><!-- ������ -->
	<dutycd><%=ds.dutycd%></dutycd> <!-- ��å�ڵ� -->
	<dutynm><![CDATA[<%=ds.dutynm%>]]></dutynm><!-- ��å�ڵ�� -->
	<boemp_id><%=ds.boemp_id%></boemp_id> <!-- �����ID -->
	<tel><%=ds.tel%></tel> <!-- ������ȭ��ȣ -->
	<ptph><%=ds.ptph%></ptph> <!-- �����޴�����ȣ -->
	<maprvaplcdt><%=ds.maprvaplcdt%></maprvaplcdt> <!-- ���ν�û���� -->
	<deviceid><%=ds.deviceid%></deviceid> <!-- ���ID -->
	<gcmid><%=ds.gcmid%></gcmid> <!-- GCMID -->
	<logindt><%=ds.logindt%></logindt> <!-- �ֱٷα������� -->
	<appuseyn><%=ds.appuseyn%></appuseyn> <!-- ����ϻ�뿩�� -->
	<maprvstatcd><%=ds.maprvstatcd%></maprvstatcd> <!-- ���λ����ڵ� -->
	<maprvstatnm><![CDATA[<%=ds.maprvstatnm%>]]></maprvstatnm><!-- ���λ����ڵ�� -->
	<ddaprvid><%=ds.ddaprvid%></ddaprvid><!-- ������ID -->
	<ddaprvdt><%=ds.ddaprvdt%></ddaprvdt><!-- ���������� -->
	<ddremk><![CDATA[<%=ds.ddremk%>]]></ddremk><!-- ����� -->
	<ddaprvnm><![CDATA[<%=ds.ddaprvnm%>]]></ddaprvnm><!-- ���� -->
	<in_cmpy_dt><%=ds.in_cmpy_dt %></in_cmpy_dt><!-- �Ի����� -->
	<lv_cmpy_dt><%=ds.lv_cmpy_dt %></lv_cmpy_dt><!-- ������� -->
	<mblockyn><%=ds.mblockyn %></mblockyn> <!-- ��������ܿ��� -->
	<min_login_dt><%=ds.min_login_dt %></min_login_dt>	<!-- ���ʷα��νð� -->
	<max_login_dt><%=ds.max_login_dt %></max_login_dt> <!-- �����α��νð� -->
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