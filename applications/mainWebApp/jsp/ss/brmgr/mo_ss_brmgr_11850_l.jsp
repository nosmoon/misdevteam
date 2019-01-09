<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : mo_ss_brmgr_11850_l.jsp
* ��� 	 	 :  ���Ͱ���-���Է�����-�����ϱ� ���� ����Ʈ���Է���ȸ(����Ʈ���¸���Ʈ or ���Է���ϸ���Ʈ)_����ϸ�����
* �ۼ����� 	 : 2017-01-12
* �ۼ��� 	 : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 :
* ��� 	 	 :
* �ۼ����� 	 :
* �ۼ��� 	 :
---------------------------------------------------------------------------------------------------%>
<%

    // dataset �ν��Ͻ� ����κ�
    SS_MO_L_APTINPIVSTDataSet ds = (SS_MO_L_APTINPIVSTDataSet)request.getAttribute("ds");  // request dataset

%>
<!--���Ե�������Ե� ����Ʈ���¸���Ʈ or ����Ʈ���¸���Ʈ -->
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
	<dlvqty><%= rec.dlvqty %></dlvqty> <!-- ��ü����||ȣ��/ ������̸� BLANK -->
	<apt_dong><%= rec.apt_dong %></apt_dong> <!-- �� -->
	<apt_floor><%= rec.apt_floor %></apt_floor> <!-- �� -->
	<apt_ho><%= rec.apt_ho %></apt_ho><!-- ȣ -->
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