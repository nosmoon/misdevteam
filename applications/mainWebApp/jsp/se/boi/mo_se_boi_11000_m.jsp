<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/se/comm_jsp/se_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : mo_se_boi_11000_m.jsp_����Ͽ�
* ���       :  ������������-�ʱ�ȭ��
* �ۼ�����   :  2016-12-01
* �ۼ���     : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SE_BOI_1000_MDataSet ds = ( SE_BOI_1000_MDataSet )request.getAttribute("ds");  // request dataset
%>
<sech_list>
<%
	if(ds != null){

		if(ds.getErrcode()==null || ds.getErrcode().equals("")){
%>
<errinfo>
	<errcode></errcode> 																<!-- �����ڵ� -->
	<errmsg></errmsg>																	<!-- �����޽��� -->
</errinfo>
<!-- ��������Ʈ���� -->
<%
			SE_BOI_1000_MCOMMCDCUR2Record rec1 = null;
			for(int i=0; i<ds.commcdcur2.size(); i++){
				rec1 = (SE_BOI_1000_MCOMMCDCUR2Record)ds.commcdcur2.get(i);

					String areacd = rec1.cd;
					String areanm = rec1.cdnm;
%>
	<area_info>
		<areacd><%=areacd %></areacd>												<!-- �����ڵ� -->
		<areanm><![CDATA[<%=areanm %>]]></areanm>									<!-- �����ڵ�� -->
	</area_info>
<%
				}
%>
<!-- ��������Ʈ �� -->
<!-- ��ฮ��Ʈ ���� -->
<%
			SE_BOI_1000_MCOMMCDCUR3Record rec2 = null;
			for(int i=0; i<ds.commcdcur3.size(); i++){
				rec2 = (SE_BOI_1000_MCOMMCDCUR3Record)ds.commcdcur3.get(i);

				String cntrcd = rec2.cd;
				String cntrnm = rec2.cdnm;
%>
	<cntr_info>
		<cntrcd><%=cntrcd %></cntrcd>												<!-- ����ڵ� -->
		<cntrnm><![CDATA[<%=cntrnm %>]]></cntrnm>									<!-- ����ڵ�� -->
	</cntr_info>
<%
			}
%>
<!-- ��ฮ��Ʈ �� -->
<%
		// �����ڵ尡 ������
		} else {
%>
<errinfo>
	<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode> 		<!-- �����ڵ� -->
	<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>			<!-- �����޽��� -->
</errinfo>
	<area_info>
		<areacd></areacd>																	<!-- �����ڵ� -->
		<areanm></areanm>																	<!-- �����ڵ�� -->
	</area_info>
	<cntr_info>
		<cntrcd></cntrcd>																	<!-- ����ڵ� -->
		<cntrnm></cntrnm>																	<!-- ����ڵ�� -->
	</cntr_info>
<%
		}
	// ds�� ���϶�
	} else {
%>
<errinfo>
	<errcode><![CDATA[-9999]]></errcode>							<!-- �����ڵ� -->
	<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>		<!-- �����޽��� -->
</errinfo>
	<area_info>
		<areacd></areacd>																	<!-- �����ڵ� -->
		<areanm></areanm>																	<!-- �����ڵ�� -->
	</area_info>
	<cntr_info>
		<cntrcd></cntrcd>																	<!-- ����ڵ� -->
		<cntrnm></cntrnm>																	<!-- ����ڵ�� -->
	</cntr_info>
<%
	}
%>
</sech_list>
