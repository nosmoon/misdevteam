<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_ss_brmgr_11830_l.jsp
* ���       : ���ī��(�ش缾���� ����Ʈ ������Ȳ ��ȸ) _����Ͽ�
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
    SS_L_APTDLV_LISTDataSet ds = (SS_L_APTDLV_LISTDataSet)request.getAttribute("ds");  // request dataset

%>
<!-- ����Ʈ ������Ȳ ����Ʈ ���� -->
<dlvlistcurlist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
<%
	if( ds.dlvlistcur.size() > 0 ){
		SS_L_APTDLV_LISTDLVLISTCURRecord rec = null;
		for( int i=0; i < ds.dlvlistcur.size(); i++ ){
			rec = (SS_L_APTDLV_LISTDLVLISTCURRecord)ds.dlvlistcur.get( i );
%>
	<dlvlistcurinfo>
		<dlvqty><%=rec.dlvqty %></dlvqty>                      <!-- ��ü+�μ�(2����ǥ��)+ȣ -->
		<dlvqty2><%=rec.dlvqty2 %></dlvqty2>				<!-- ��ü+�μ�(2����ǥ��)+ȣ+������� -->
		<apt_dong><%=rec.dongno %></apt_dong>				<!-- ����Ʈ�� -->
		<apt_floor><%=rec.dlvdong %></apt_floor>			<!-- �� -->
		<apt_ho><%=rec.dlvser_no %></apt_ho>	<!-- ȣ -->
		<rdrmisuyn><%=rec.rdrmisuyn %></rdrmisuyn>	<!-- ���ڹ�ȣ#�̼����� -->
	</dlvlistcurinfo>
<%
			}
		}else{
%>
	<dlvlistcurinfo>
		<dlvqty></dlvqty>                      <!-- ��ü+�μ�(2����ǥ��)+ȣ -->
		<dlvqty2></dlvqty2>				<!-- ��ü+�μ�(2����ǥ��)+ȣ+������� -->
		<apt_dong></apt_dong>				<!-- ����Ʈ�� -->
		<apt_floor></apt_floor>			<!-- �� -->
		<apt_ho></apt_ho>	<!-- ȣ -->
		<rdrmisuyn></rdrmisuyn>	<!-- ���ڹ�ȣ#�̼����� -->
	</dlvlistcurinfo>
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
	<dlvlistcurinfo>
		<dlvqty></dlvqty>                      <!-- ��ü+�μ�(2����ǥ��)+ȣ -->
		<dlvqty2></dlvqty2>				<!-- ��ü+�μ�(2����ǥ��)+ȣ+������� -->
		<apt_dong></apt_dong>				<!-- ����Ʈ�� -->
		<apt_floor></apt_floor>			<!-- �� -->
		<apt_ho></apt_ho>	<!-- ȣ -->
		<rdrmisuyn></rdrmisuyn>	<!-- ���ڹ�ȣ#�̼����� -->
	</dlvlistcurinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
	<dlvlistcurinfo>
		<dlvqty></dlvqty>                      <!-- ��ü+�μ�(2����ǥ��)+ȣ -->
		<dlvqty2></dlvqty2>				<!-- ��ü+�μ�(2����ǥ��)+ȣ+������� -->
		<apt_dong></apt_dong>				<!-- ����Ʈ�� -->
		<apt_floor></apt_floor>			<!-- �� -->
		<apt_ho></apt_ho>	<!-- ȣ -->
		<rdrmisuyn></rdrmisuyn>	<!-- ���ڹ�ȣ#�̼����� -->
	</dlvlistcurinfo>
<%
	}
%>
</dlvlistcurlist>

<!--		1. dlvqty, dlvqty2 ���� BLANK�� ��						-->
<!--            ���� ������ BLANK�� ǥ��                                 -->
