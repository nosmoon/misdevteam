<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 	: mo_ss_brmgr_11880_l.jsp
* ��� 	 	 :  ���Ͱ���-���Է�����-����Ʈ���� �� ��ü,����Ʈ_����ϸ�����
* �ۼ����� 	 : 2017-01-13
* �ۼ��� 	 : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 :
* ��� 	 	 :
* �ۼ����� 	 :
* �ۼ��� 	 :
---------------------------------------------------------------------------------------------------%>
<%
	SL_MO_L_INPIVSTINFODataSet ds = (SL_MO_L_INPIVSTINFODataSet)request.getAttribute("ds");
%>
<inpivstinfolist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>

<%
	if( ds.aptinfocur.size() > 0 ){
		SL_MO_L_INPIVSTINFOAPTINFOCURRecord rec = null;
		for( int i=0; i < ds.aptinfocur.size(); i++ ){
			rec = (SL_MO_L_INPIVSTINFOAPTINFOCURRecord)ds.aptinfocur.get( i );
%>
<aptinfo>
	<dongno><%= rec.dongno %></dongno><!-- �� -->
	<hoscnt1><%= rec.hoscnt %></hoscnt1><!-- ����� -->
	<pyong1><%= rec.pyong %></pyong1><!-- �� -->
</aptinfo>
<%
			}
		}else{
%>
<aptinfo>
	<dongno></dongno>
	<hoscnt1></hoscnt1>
	<pyong1></pyong1>
</aptinfo>
<%
	}
%>
<%
	if( ds.aptivstmedicur.size() > 0 ){
		SL_MO_L_INPIVSTINFOAPTIVSTMEDICURRecord rec = null;
		for( int i=0; i < ds.aptivstmedicur.size(); i++ ){
			rec = (SL_MO_L_INPIVSTINFOAPTIVSTMEDICURRecord)ds.aptivstmedicur.get( i );
%>
<aptivstmediinfo>
	<medicd><%= rec.medicd %></medicd><!-- ��ü�ڵ� -->
	<medinm><![CDATA[<%= rec.medinm %>]]></medinm><!-- ��ü�� -->
	<mediycd><%= rec.mediycd %></mediycd><!-- ��ü����ڵ� -->
	<mediynm><![CDATA[<%= rec.mediynm %>]]></mediynm><!-- ��ü���� -->
</aptivstmediinfo>
<%
			}
		}else{
%>
<aptivstmediinfo>
	<medicd></medicd>
	<medinm></medinm>
	<mediycd></mediycd>
	<mediynm></mediynm>
</aptivstmediinfo>
<%
	}
%>
	<etcinfo>
		<accflag></accflag> <!--�Է�:I / ����:U / ����:D -->
		<hmflag></hmflag>  <!--�Է¹�� �׻�H -->
		<pyong2></pyong2> <!--��2 ���� ���� �� 0-->
		<hscnt2></hscnt2><!--�����2 ���� ���� �� 0-->
		<pyong3></pyong3> <!--��3 ���� ���� �� 0-->
		<hscnt3></hscnt3><!--�����3 ���� ���� �� 0-->
		<invsgdt></invsgdt><!--��������, default������ ��������-->
		<housval></housval><!--ȣ����ü ex)009001C 9��1ȣ�� �����Ϻ�-->
		<incmgpers></incmgpers><!--�Է���-->
		<regtype1></regtype1> <!--��ϱ���1(����) �׻� 30-->
		<regtype2></regtype2><!--��ϱ���2(���������) �׻� 10-->
	</etcinfo>
<%
	}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode>
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>
	</errinfo>
	<aptinfo>
		<dongno></dongno>
		<hoscnt1></hoscnt1>
		<pyong1></pyong1>
	</aptinfo>
	<aptivstmediinfo>
		<medicd></medicd>
		<medinm></medinm>
		<mediycd></mediycd>
		<mediynm></mediynm>
	</aptivstmediinfo>
	<etcinfo>
		<accflag></accflag> <!--�Է�:I / ����:U / ����:D -->
		<hmflag></hmflag>  <!--�Է¹�� �׻�H -->
		<pyong2></pyong2> <!--��2 ���� ���� �� 0-->
		<hscnt2></hscnt2><!--�����2 ���� ���� �� 0-->
		<pyong3></pyong3> <!--��3 ���� ���� �� 0-->
		<hscnt3></hscnt3><!--�����3 ���� ���� �� 0-->
		<invsgdt></invsgdt><!--��������, default������ ��������-->
		<housval></housval><!--ȣ����ü ex)009001C 9��1ȣ�� �����Ϻ�-->
		<incmgpers></incmgpers><!--�Է���-->
		<regtype1></regtype1> <!--��ϱ���1(����) �׻� 30-->
		<regtype2></regtype2><!--��ϱ���2(���������) �׻� 10-->
	</etcinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
	<aptinfo>
		<dongno></dongno>
		<hoscnt1></hoscnt1>
		<pyong1></pyong1>
	</aptinfo>
	<aptivstmediinfo>
		<medicd></medicd>
		<medinm></medinm>
		<mediycd></mediycd>
		<mediynm></mediynm>
	</aptivstmediinfo>
	<etcinfo>
		<accflag></accflag> <!--�Է�:I / ����:U / ����:D -->
		<hmflag></hmflag>  <!--�Է¹�� �׻�H -->
		<pyong2></pyong2> <!--��2 ���� ���� �� 0-->
		<hscnt2></hscnt2><!--�����2 ���� ���� �� 0-->
		<pyong3></pyong3> <!--��3 ���� ���� �� 0-->
		<hscnt3></hscnt3><!--�����3 ���� ���� �� 0-->
		<invsgdt></invsgdt><!--��������, default������ ��������-->
		<housval></housval><!--ȣ����ü ex)009001C 9��1ȣ�� �����Ϻ�-->
		<incmgpers></incmgpers><!--�Է���-->
		<regtype1></regtype1> <!--��ϱ���1(����) �׻� 30-->
		<regtype2></regtype2><!--��ϱ���2(���������) �׻� 10-->
	</etcinfo>
<%
	}
%>
</inpivstinfolist>