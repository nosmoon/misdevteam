<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_ss_admin_12110_l.jsp
* ���       : ������������-����ϰ���-��������Ʈ_����Ͽ�
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
	SS_MO_L_LOGINAPLC_APRVDataSet ds = (SS_MO_L_LOGINAPLC_APRVDataSet)request.getAttribute("ds");
%>
<boemplist>
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
	if( ds.aplclist.size() > 0 ){
		SS_MO_L_LOGINAPLC_APRVAPLCLISTRecord rec = null;
		for( int i=0; i < ds.aplclist.size(); i++ ){
			rec = (SS_MO_L_LOGINAPLC_APRVAPLCLISTRecord)ds.aplclist.get( i );
%>
<boempinfo>
	<deptcd><%= rec.deptcd %></deptcd> <!-- ���ڵ� -->
	<deptnm><![CDATA[<%= rec.deptnm %>]]></deptnm> <!-- ���� -->
	<partcd><%= rec.partcd %></partcd> <!-- ��Ʈ�ڵ� -->
	<partnm><![CDATA[<%= rec.partnm %>]]></partnm><!-- ��Ʈ�� -->
	<areacd><%= rec.areacd %></areacd> <!-- �����ڵ� -->
	<areanm><![CDATA[<%= rec.areanm %>]]></areanm> <!-- ������ -->
	<bocd><%= rec.bocd %></bocd> <!-- �����ڵ� -->
	<bonm><![CDATA[<%= rec.bonm %>]]></bonm><!-- ���͸� -->
	<boemp_no><%= rec.boemp_no %></boemp_no> <!-- �����ڵ� -->
	<dutycd><%= rec.dutycd %></dutycd> <!-- ��å�ڵ� -->
	<dutynm><![CDATA[<%= rec.dutynm %>]]></dutynm><!-- ��å�� -->
	<flnm><![CDATA[<%= rec.flnm %>]]></flnm><!-- ������ -->
	<boemp_id><%= rec.boemp_id %></boemp_id><!-- �����ID -->
	<ptph><%= rec.crm_ptph %></ptph><!-- �޴�����ȣ -->
	<maprvstatcd><%= rec.maprvstatcd %></maprvstatcd><!-- ���λ����ڵ� -->
	<maprvstatnm><![CDATA[<%= rec.maprvstatnm %>]]></maprvstatnm><!-- ���λ����ڵ�� -->
</boempinfo>
<%
			}
		}else{
%>
<boempinfo>
	<deptcd></deptcd>
	<deptnm></deptnm>
	<partcd></partcd>
	<partnm></partnm>
	<areacd></areacd>
	<areanm></areanm>
	<bocd></bocd>
	<bonm></bonm>
	<boemp_no></boemp_no>
	<dutycd></dutycd>
	<dutynm></dutynm>
	<flnm></flnm>
	<boemp_id></boemp_id>
	<ptph></ptph>
	<maprvstatcd></maprvstatcd>
	<maprvstatnm></maprvstatnm>
</boempinfo>
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
<boempinfo>
	<deptcd></deptcd>
	<deptnm></deptnm>
	<partcd></partcd>
	<partnm></partnm>
	<areacd></areacd>
	<areanm></areanm>
	<bocd></bocd>
	<bonm></bonm>
	<boemp_no></boemp_no>
	<dutycd></dutycd>
	<dutynm></dutynm>
	<flnm></flnm>
	<boemp_id></boemp_id>
	<ptph></ptph>
	<maprvstatcd></maprvstatcd>
	<maprvstatnm></maprvstatnm>
</boempinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
	<totalcnt></totalcnt>
<boempinfo>
	<deptcd></deptcd>
	<deptnm></deptnm>
	<partcd></partcd>
	<partnm></partnm>
	<areacd></areacd>
	<areanm></areanm>
	<bocd></bocd>
	<bonm></bonm>
	<boemp_no></boemp_no>
	<dutycd></dutycd>
	<dutynm></dutynm>
	<flnm></flnm>
	<boemp_id></boemp_id>
	<ptph></ptph>
	<maprvstatcd></maprvstatcd>
	<maprvstatnm></maprvstatnm>
</boempinfo>
<%
	}
%>
</boemplist>