<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=EUC-KR" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_se_boi_11010_l.jsp
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
	SS_MO_L_RDR_SRCHDataSet ds = (SS_MO_L_RDR_SRCHDataSet)request.getAttribute("ds");
%>
<curcommlist>
<%
	if( ds != null ){
		if( ds.getErrcode() == null || ds.getErrcode().equals( "" ) ){
%>
	<errinfo>
		<errcode></errcode> 													<!-- �����ڵ� -->
		<errmsg></errmsg>														<!-- �����޽��� -->
	</errinfo>
<%
			if( ds.curcommlist.size() > 0 ){
				SS_MO_L_RDR_SRCHCURCOMMLISTRecord rec = null;
				for( int i=0; i<ds.curcommlist.size(); i++ ){
					rec = ( SS_MO_L_RDR_SRCHCURCOMMLISTRecord )ds.curcommlist.get( i );
%>
	<cur_info>
		<bocd><%= rec.bocd %></bocd>											<!-- ���������ڵ� -->
		<bonm><![CDATA[<%= rec.bonm %>]]></bonm>								<!-- ��������� -->
		<tel_no11><%= rec.tel_no11 %></tel_no11>								<!-- �������� ��ȭ��ȣ1 -->
		<tel_no12><%= rec.tel_no12 %></tel_no12>								<!-- �������� ��ȭ��ȣ2 -->
		<tel_no13><%= rec.tel_no13 %></tel_no13>								<!-- �������� ��ȭ��ȣ3 -->
		<rdr_no><%= rec.rdr_no %></rdr_no>										<!-- ���ڹ�ȣ -->
		<rdrnm><![CDATA[<%= rec.rdrnm %>]]></rdrnm>								<!-- ���ڸ� -->
		<rdrtel_no1><%= rec.rdrtel_no1 %></rdrtel_no1>							<!-- ������ȭ��ȣ1 -->
		<rdrtel_no2><%= rec.rdrtel_no2 %></rdrtel_no2>							<!-- ������ȭ��ȣ2 -->
		<rdrtel_no3><%= rec.rdrtel_no3 %></rdrtel_no3>							<!-- ������ȭ��ȣ3 -->
		<dlvaddr><![CDATA[<%= rec.dlvaddr %>]]></dlvaddr>						<!-- �����ּ� -->
		<dlvdtlsaddr><![CDATA[<%= rec.dlvdtlsaddr %>]]></dlvdtlsaddr>			<!-- ���ڻ��ּ� -->
		<dlvqty><%= rec.dlvqty %></dlvqty>										<!-- ��޺μ�(dlvqty ���� 0�̸� �������� 0�̻��̸� ��������) -->
		<onlmembid><%= rec.onlmembid %></onlmembid>								<!-- ȸ�����̵� -->
	</cur_info>
<%
				}
			}else{
%>
	<cur_info>
		<bocd></bocd>              												<!-- ���������ڵ� -->
		<bonm></bonm>              												<!-- ��������� -->
		<tel_no11></tel_no11>      												<!-- �������� ��ȭ��ȣ1 -->
		<tel_no12></tel_no12>      												<!-- �������� ��ȭ��ȣ2 -->
		<tel_no13></tel_no13>      												<!-- �������� ��ȭ��ȣ3 -->
		<rdr_no></rdr_no>          												<!-- ���ڹ�ȣ -->
		<rdrnm></rdrnm>            												<!-- ���ڸ� -->
		<rdrtel_no1></rdrtel_no1>  												<!-- ������ȭ��ȣ1 -->
		<rdrtel_no2></rdrtel_no2>  												<!-- ������ȭ��ȣ2 -->
		<rdrtel_no3></rdrtel_no3>  												<!-- ������ȭ��ȣ3 -->
		<dlvaddr></dlvaddr>        												<!-- �����ּ� -->
		<dlvdtlsaddr></dlvdtlsaddr>												<!-- ���ڻ��ּ� -->
		<dlvqty></dlvqty>          												<!-- ��޺μ�(dlvqty ���� 0�̸� �������� 0�̻��̸� ��������) -->
		<onlmembid></onlmembid>    												<!-- ȸ�����̵� -->
	</cur_info>
<%
			}
%>
	<cnt>
		<totalcnt><%=ds.totalcnt %></totalcnt>									<!-- �ѰǼ� -->
	</cnt>
<%
		}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode> 					<!-- �����ڵ� -->
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>						<!-- �����޽��� -->
	</errinfo>
	<cur_info>
		<bocd></bocd>              												<!-- ���������ڵ� -->
		<bonm></bonm>              												<!-- ��������� -->
		<tel_no11></tel_no11>      												<!-- �������� ��ȭ��ȣ1 -->
		<tel_no12></tel_no12>      												<!-- �������� ��ȭ��ȣ2 -->
		<tel_no13></tel_no13>      												<!-- �������� ��ȭ��ȣ3 -->
		<rdr_no></rdr_no>          												<!-- ���ڹ�ȣ -->
		<rdrnm></rdrnm>            												<!-- ���ڸ� -->
		<rdrtel_no1></rdrtel_no1>  												<!-- ������ȭ��ȣ1 -->
		<rdrtel_no2></rdrtel_no2>  												<!-- ������ȭ��ȣ2 -->
		<rdrtel_no3></rdrtel_no3>  												<!-- ������ȭ��ȣ3 -->
		<dlvaddr></dlvaddr>        												<!-- �����ּ� -->
		<dlvdtlsaddr></dlvdtlsaddr>												<!-- ���ڻ��ּ� -->
		<dlvqty></dlvqty>          												<!-- ��޺μ�(dlvqty ���� 0�̸� �������� 0�̻��̸� ��������) -->
		<onlmembid></onlmembid>    												<!-- ȸ�����̵� -->
	</cur_info>
	<cnt>
		<totalcnt></totalcnt>													<!-- �ѰǼ� -->
	</cnt>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>																	<!-- �����ڵ� -->
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>		<!-- �����޽��� -->
	</errinfo>
	<cur_info>
		<bocd></bocd>              												<!-- ���������ڵ� -->
		<bonm></bonm>              												<!-- ��������� -->
		<tel_no11></tel_no11>      												<!-- �������� ��ȭ��ȣ1 -->
		<tel_no12></tel_no12>      												<!-- �������� ��ȭ��ȣ2 -->
		<tel_no13></tel_no13>      												<!-- �������� ��ȭ��ȣ3 -->
		<rdr_no></rdr_no>          												<!-- ���ڹ�ȣ -->
		<rdrnm></rdrnm>            												<!-- ���ڸ� -->
		<rdrtel_no1></rdrtel_no1>  												<!-- ������ȭ��ȣ1 -->
		<rdrtel_no2></rdrtel_no2>  												<!-- ������ȭ��ȣ2 -->
		<rdrtel_no3></rdrtel_no3>  												<!-- ������ȭ��ȣ3 -->
		<dlvaddr></dlvaddr>        												<!-- �����ּ� -->
		<dlvdtlsaddr></dlvdtlsaddr>												<!-- ���ڻ��ּ� -->
		<dlvqty></dlvqty>          												<!-- ��޺μ�(dlvqty ���� 0�̸� �������� 0�̻��̸� ��������) -->
		<onlmembid></onlmembid>    												<!-- ȸ�����̵� -->
	</cur_info>
	<cnt>
		<totalcnt></totalcnt>													<!-- �ѰǼ� -->
	</cnt>
<%
	}
%>
</curcommlist>