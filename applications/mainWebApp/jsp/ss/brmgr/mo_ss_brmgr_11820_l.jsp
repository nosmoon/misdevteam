<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_ss_brmgr_11820_l.jsp
* ���       : ���Ͱ���-���Է�����-����Ʈ������Ʈ_����Ͽ�
* �ۼ�����   : 2017-01-13
* �ۼ���     : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    // dataset �ν��Ͻ� ����κ�
    SL_L_DTLSADDRDataSet ds = (SL_L_DTLSADDRDataSet)request.getAttribute("ds");

	String addrcd = request.getParameter("addrcd");

%>
<!-- �� ����Ʈ ���� -->
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
		<addrcd><%=addrcd %></addrcd>				<!-- �ּ��ڵ� -->
		<dongno><%=rec.dongno %></dongno>		<!-- �� -->
		<florcnt><%=rec.florcnt %></florcnt>			<!-- �� -->
		<hoscnt><%=rec.flor_houscnt %></hoscnt><!-- ȣ -->
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
