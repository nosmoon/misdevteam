<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/se/comm_jsp/se_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_se_snd_11811_l.jsp
* ���       : �߼۰���-�뼱����-�뼱��ȸ_����Ͽ�
* �ۼ�����   : 2017-01-06
* �ۼ���     : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SE_MO_SND_1811_LDataSet ds = (SE_MO_SND_1811_LDataSet)request.getAttribute("ds");
%>
<nosunlist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
<%
	if( ds.curlist.size() > 0 ){
		SE_MO_SND_1811_LCURLISTRecord rec = null;
		for( int i=0; i < ds.curlist.size(); i++ ){
			rec = (SE_MO_SND_1811_LCURLISTRecord)ds.curlist.get( i );
%>
<nosuninfo>
	<route_cd><%=rec.route_cd %></route_cd> <!-- �뼱�ڵ� -->
	<route_nm><![CDATA[<%=rec.route_nm %>]]></route_nm> <!-- �뼱�� -->
	<send_rank><%= rec.send_rank %></send_rank><!-- �߼ۼ��� -->
	<plac_nm><![CDATA[<%= rec.plac_nm %>]]></plac_nm> <!--�߼�ó -->
	<addr><![CDATA[<%= rec.addr %>]]></addr><!-- �ּ� -->
</nosuninfo>
<%
			}
		}else{
%>
<nosuninfo>
	<route_cd></route_cd>
	<route_nm></route_nm>
	<send_rank></send_rank>
	<plac_nm></plac_nm>
	<addr></addr>
</nosuninfo>
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
<nosuninfo>
	<route_cd></route_cd>
	<route_nm></route_nm>
	<send_rank></send_rank>
	<plac_nm></plac_nm>
	<addr></addr>
</nosuninfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
<nosuninfo>
	<route_cd></route_cd>
	<route_nm></route_nm>
	<send_rank></send_rank>
	<plac_nm></plac_nm>
	<addr></addr>
</nosuninfo>
<%
	}
%>
</nosunlist>