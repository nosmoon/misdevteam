<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_ss_brinfo_11610_l.jsp
* ���       : �Ǹ�-�߼۰���-��������-�߼۳뼱 ��ȸ_����Ͽ�
* �ۼ�����   : 2016-12-28
* �ۼ���     : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_MO_L_BSNSDataSet ds = (SS_MO_L_BSNSDataSet)request.getAttribute("ds");
%>
<bsnslist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
<%
	if( ds.bsnslist.size() > 0 ){
		SS_MO_L_BSNSBSNSLISTRecord rec = null;
		for( int i=0; i < ds.bsnslist.size(); i++ ){
			rec = (SS_MO_L_BSNSBSNSLISTRecord)ds.bsnslist.get( i );
%>
<bsnsinfo>
	<jpcode><%= rec.jpcode %></jpcode> <!-- �뼱�ڵ� -->
	<jpname><![CDATA[<%= rec.jpname %>]]></jpname><!-- �뼱�� -->
	<send_rank><%=rec.send_rank %></send_rank> <!-- �߼ۼ��� -->
  	<bocd><%= rec.bocd %></bocd><!-- �����ڵ� -->
	<bonm><![CDATA[<%= rec.jiname %>]]></bonm><!-- ���͸� -->
	<jbbalcha><%= rec.jbbalcha %></jbbalcha><!-- �����ð� -->
	<jbdotime><%= rec.jbdotime %></jbdotime><!-- �����ð� -->
</bsnsinfo>
<%
			}
		}else{
%>
<bsnsinfo>
	<jpcode></jpcode>
	<jpname></jpname>
	<send_rank></send_rank>
  	<bocd></bocd>
	<bonm></bonm>
	<jbbalcha></jbbalcha>
	<jbdotime></jbdotime>
</bsnsinfo>
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
<bsnsinfo>
	<jpcode></jpcode>
	<jpname></jpname>
	<send_rank></send_rank>
  	<bocd></bocd>
	<bonm></bonm>
	<jbbalcha></jbbalcha>
	<jbdotime></jbdotime>
</bsnsinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
<bsnsinfo>
	<jpcode></jpcode>
	<jpname></jpname>
	<send_rank></send_rank>
  	<bocd></bocd>
	<bonm></bonm>
	<jbbalcha></jbbalcha>
	<jbdotime></jbdotime>
</bsnsinfo>
<%
	}
%>
</bsnslist>