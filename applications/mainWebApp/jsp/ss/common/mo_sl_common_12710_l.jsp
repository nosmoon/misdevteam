<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : mo_sl_common_12720_l.jsp
* ���     : ���� �����ȣ �˻��� ���� ��ȸ�� ���_����Ͽ�
* �ۼ����� : 2017-02-17
* �ۼ���   : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    //getting dataset
	CO_MO_L_NEW_ADDRDataSet ds = (CO_MO_L_NEW_ADDRDataSet)request.getAttribute("ds");
%>
<addrlist>
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
		if(ds != null){
			CO_MO_L_NEW_ADDRCURCOMMLISTRecord rec = null;

			for(int i=0; i<ds.curcommlist.size(); i++){
				rec = (CO_MO_L_NEW_ADDRCURCOMMLISTRecord)ds.curcommlist.get(i);
%>
	<addrinfo>
		<zip><%=rec.zip %></zip>  <!-- �����ȣ -->
		<rd_addr><![CDATA[<%=rec.rd_addr %>]]></rd_addr> <!-- ���θ��ּ� -->
		<bldgnm><![CDATA[<%=rec.bldgnm %>]]></bldgnm>  <!-- �ñ�����ǹ��� -->
		<rd_fulladdr><![CDATA[<%=rec.rd_fulladdr %>]]></rd_fulladdr>  <!-- ���θ��ּ���ü -->
		<bj_addr><![CDATA[<%=rec.bj_addr %>]]></bj_addr>		<!-- �����ּ� -->
		<bonm><![CDATA[<%=rec.bonm %>]]></bonm>				<!-- ���͸� -->
		<bldmngnn><%=rec.bldmngnn %></bldmngnn> <!-- �ǹ�������ȣ -->
		<bj_addr_fst><![CDATA[<%=rec.bj_addr_fst %>]]></bj_addr_fst> <!-- �����ּ��� �� �κ� -->
		<bj_addr_lst><%=rec.bj_addr_lst %></bj_addr_lst> <!-- �����ּ��� ���� �κ� -->
		<bocd><%=rec.bocd %></bocd> <!-- �����ڵ� -->
		<telno1><%=rec.telno1 %></telno1> <!-- ������ȭ��ȣ1 -->
		<telno2><%=rec.telno2 %></telno2> <!-- ������ȭ��ȣ2-->
		<telno3><%=rec.telno3 %></telno3> <!-- ������ȭ��ȣ3 -->
		<sellnetclsf><![CDATA[<%=rec.sellnetclsf %>]]></sellnetclsf>  <!-- �ǸŸ����� -->
	</addrinfo>
<%
			}
		}else{
%>
	<addrinfo>
		<zip></zip>
		<rd_addr></rd_addr>
		<bldgnm></bldgnm>
		<rd_fulladdr></rd_fulladdr>
		<bj_addr></bj_addr>
		<bonm></bonm>
		<bldmngnn></bldmngnn>
		<bj_addr_fst></bj_addr_fst>
		<bj_addr_lst></bj_addr_lst>
		<bocd></bocd>
		<telno1></telno1>
		<telno2></telno2>
		<telno3></telno3>
		<sellnetclsf></sellnetclsf>
	</addrinfo>
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
	<addrinfo>
		<zip></zip>
		<rd_addr></rd_addr>
		<bldgnm></bldgnm>
		<rd_fulladdr></rd_fulladdr>
		<bj_addr></bj_addr>
		<bonm></bonm>
		<bldmngnn></bldmngnn>
		<bj_addr_fst></bj_addr_fst>
		<bj_addr_lst></bj_addr_lst>
		<bocd></bocd>
		<telno1></telno1>
		<telno2></telno2>
		<telno3></telno3>
		<sellnetclsf></sellnetclsf>
	</addrinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
	<totalcnt></totalcnt>
	<addrinfo>
		<zip></zip>
		<rd_addr></rd_addr>
		<bldgnm></bldgnm>
		<rd_fulladdr></rd_fulladdr>
		<bj_addr></bj_addr>
		<bonm></bonm>
		<bldmngnn></bldmngnn>
		<bj_addr_fst></bj_addr_fst>
		<bj_addr_lst></bj_addr_lst>
		<bocd></bocd>
		<telno1></telno1>
		<telno2></telno2>
		<telno3></telno3>
		<sellnetclsf></sellnetclsf>
	</addrinfo>
<%
	}
%>
</addrlist>