<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%------------------------------------------------------------------------------------------------
* ���ϸ� : mo_ss_share_11302_s.jsp /  agency/commun_11120_s.jsp����
* ��� : �������� ��_����Ͽ�
* �ۼ����� : 2017-01-24
* �ۼ��� : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_MO_L_INFOEXG_SRCHDataSet ds = (SS_MO_L_INFOEXG_SRCHDataSet)request.getAttribute("ds");
%>
<notilist>
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
	if( ds.infoexglist.size() > 0 ){
		SS_MO_L_INFOEXG_SRCHINFOEXGLISTRecord rec = null;
		for( int i=0; i < ds.infoexglist.size(); i++ ){
			rec = (SS_MO_L_INFOEXG_SRCHINFOEXGLISTRecord)ds.infoexglist.get( i );
%>
<notiinfo>
	<seq><%= rec.seq %></seq> <!-- �Ϸù�ȣ -->
	<titl><![CDATA[<%= rec.titl %>]]></titl> <!-- ���� -->
	<makepersnm><![CDATA[<%= rec.makepersnm %>]]></makepersnm> <!-- �ۼ��� -->
	<regdt><%= rec.regdt %></regdt><!-- ������� -->
	<filenm><![CDATA[<%= rec.filenm %>]]></filenm> <!-- ���ϸ� -->
	<dwloadcnt><%= rec.dwloadcnt %></dwloadcnt><!-- �ٿ�ε�� -->
	<brwscnt><%= rec.brwscnt %></brwscnt><!-- �˻��� -->
</notiinfo>
<%
			}
		}else{
%>
<notiinfo>
	<seq></seq>
	<titl></titl>
	<makepersnm></makepersnm>
	<regdt></regdt>
	<filenm></filenm>
	<dwloadcnt></dwloadcnt>
	<brwscnt></brwscnt>
</notiinfo>
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
<notiinfo>
	<seq></seq>
	<titl></titl>
	<makepersnm></makepersnm>
	<regdt></regdt>
	<filenm></filenm>
	<dwloadcnt></dwloadcnt>
	<brwscnt></brwscnt>
</notiinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
	<totalcnt></totalcnt>
<notiinfo>
	<seq></seq>
	<titl></titl>
	<makepersnm></makepersnm>
	<regdt></regdt>
	<filenm></filenm>
	<dwloadcnt></dwloadcnt>
	<brwscnt></brwscnt>
</notiinfo>
<%
	}
%>
</notilist>