<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@	page import="chosun.ciis.ss.sls.rdr.ds.*,chosun.ciis.ss.sls.rdr.rec.*,chosun.ciis.ss.sls.rdr.dm.*"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : mo_ss_reader_11110_l.jsp
* ��� :
* �ۼ����� : 2016-12-22
* �ۼ��� : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	:
* ������	:
* ��������	:
* ������ϸ�:
---------------------------------------------------------------------------------------------------%>
<%
	SS_MO_L_RDR_DSCTDataSet ds = (SS_MO_L_RDR_DSCTDataSet)request.getAttribute("ds");
%>
<curcommlist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode><!--�����ڵ� -->
		<errmsg></errmsg><!--�����޼��� -->
	</errinfo>

	<cntinfo>
		<totalcnt><%=ds.totalcnt%></totalcnt><!--�ѰǼ� -->
	</cntinfo>

<%
	if( ds.curcommlist.size() > 0 ){
		SS_MO_L_RDR_DSCTCURCOMMLISTRecord rec = null;
		for( int i=0; i < ds.curcommlist.size(); i++ ){
			rec = (SS_MO_L_RDR_DSCTCURCOMMLISTRecord)ds.curcommlist.get( i );
%>
	<dsctinfo>
		<regdt><%= rec.regdt %></regdt>                         <!--�������              -->
		<regno><%= rec.regno %></regno>                         <!--��Ϲ�ȣ              -->
		<rdr_no><%= rec.rdr_no %></rdr_no>                      <!--���ڹ�ȣ              -->
		<rdrnm><![CDATA[<%= rec.rdrnm %>]]></rdrnm>                         <!--���ڸ�                -->
		<acpndt><%= rec.acpndt %></acpndt>                      <!--��������              -->
		<bonm><![CDATA[<%= rec.bonm %>]]></bonm>                            <!--���������            -->
		<dscttypecdnm><![CDATA[<%= rec.dscttypecdnm %>]]></dscttypecdnm>    <!--��������(���)��      -->
		<acpnpathcdnm><![CDATA[<%= rec.acpnpathcdnm %>]]></acpnpathcdnm>    <!--��û��θ�            -->
		<bocnfmyn><%= rec.bocnfmyn %></bocnfmyn>                <!--��������Ȯ�ο���      -->
		<titl><![CDATA[<%= rec.titl %>]]></titl>                            <!--����                  -->
	</dsctinfo>
<%
			}
		}else{
%>
	<dsctinfo>
 		<regdt></regdt>                     <!--�������              -->
 		<regno></regno>                     <!--��Ϲ�ȣ              -->
 		<rdr_no></rdr_no>                   <!--���ڹ�ȣ              -->
 		<rdrnm></rdrnm>                     <!--���ڸ�                -->
 		<acpndt></acpndt>                   <!--��������              -->
 		<bonm></bonm>                       <!--���������            -->
 		<dscttypecdnm></dscttypecdnm>       <!--��������(���)��      -->
 		<acpnpathcdnm></acpnpathcdnm>       <!--��û��θ�            -->
 		<bocnfmyn></bocnfmyn>               <!--��������Ȯ�ο���      -->
		<titl></titl>                       <!--����                  -->
	</dsctinfo>
<%
	}
%>
<%
	}else{
%>


	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode><!--�����ڵ� -->
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg><!--�����޼��� -->
	</errinfo>
	<cntinfo>
		<totalcnt></totalcnt>				<!--����Ʈ�� -->
	</cntinfo>
	<dsctinfo>
 		<regdt></regdt>                     <!--�������              -->
 		<regno></regno>                     <!--��Ϲ�ȣ              -->
 		<rdr_no></rdr_no>                   <!--���ڹ�ȣ              -->
 		<rdrnm></rdrnm>                     <!--���ڸ�                -->
 		<acpndt></acpndt>                   <!--��������              -->
 		<bonm></bonm>                       <!--���������            -->
 		<dscttypecdnm></dscttypecdnm>       <!--��������(���)��      -->
 		<acpnpathcdnm></acpnpathcdnm>       <!--��û��θ�            -->
 		<bocnfmyn></bocnfmyn>               <!--��������Ȯ�ο���      -->
		<titl></titl>                       <!--����                  -->
	</dsctinfo>
<%
		}
	}else{
%>


	<errinfo>
		<errcode><![CDATA[-9999]]></errcode><!--�����ڵ� -->
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg><!--�����޼��� -->
	</errinfo>
	<cntinfo>
		<totalcnt></totalcnt>				<!--����Ʈ�� -->
	</cntinfo>
	<dsctinfo>
 		<regdt></regdt>                     <!--�������              -->
 		<regno></regno>                     <!--��Ϲ�ȣ              -->
 		<rdr_no></rdr_no>                   <!--���ڹ�ȣ              -->
 		<rdrnm></rdrnm>                     <!--���ڸ�                -->
 		<acpndt></acpndt>                   <!--��������              -->
 		<bonm></bonm>                       <!--���������            -->
 		<dscttypecdnm></dscttypecdnm>       <!--��������(���)��      -->
 		<acpnpathcdnm></acpnpathcdnm>       <!--��û��θ�            -->
 		<bocnfmyn></bocnfmyn>               <!--��������Ȯ�ο���      -->
		<titl></titl>                       <!--����                  -->
	</dsctinfo>
<%
	}
%>
</curcommlist>