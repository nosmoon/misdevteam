<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_ss_common_11180_l.jsp
* ���       : 
* �ۼ�����   : 
* �ۼ���     : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SL_MO_L_BOLISTDataSet ds = (SL_MO_L_BOLISTDataSet)request.getAttribute("ds");
%>
<bolistcur>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>


<%
	if( ds.bolistcur.size() > 0 ){
		SL_MO_L_BOLISTBOLISTCURRecord rec = null;
		for( int i=0; i < ds.bolistcur.size(); i++ ){
			rec = (SL_MO_L_BOLISTBOLISTCURRecord)ds.bolistcur.get( i );
%>
<boinfo>
     <bocd><%= rec.bocd %></bocd>                                               <!--���������ڵ�      -->       
      <bonm><![CDATA[<%=rec.bonm %>]]></bonm>                              <!--���������        -->
</boinfo>
<%
			}
		}else{
%>
<boinfo>
	<bocd></bocd>
	<bonm></bonm>
</boinfo>
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
<boinfo>
	<bocd></bocd>
	<bonm></bonm>
</boinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
<boinfo>
	<bocd></bocd>
	<bonm></bonm>
</boinfo>
<%
	}
%>
</bolistcur>