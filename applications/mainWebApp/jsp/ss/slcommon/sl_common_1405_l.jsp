<%@ page contentType="text/html;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_common_1405_l.jsp
* ��� 		 : �����˻�(������ �Է¿� ���� �˻�-����Ű)
* �ۼ����� 	 : 2003-12-09
* �ۼ��� 	 : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 :
* ������ 	 :
* �������� 	 :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SL_L_BO_SRCHDataSet ds = (SL_L_BO_SRCHDataSet)request.getAttribute("ds");
    SL_L_BO_SRCHCURBOLISTRecord rec = null;

	if(ds.curbolist.size() == 1){
		rec = (SL_L_BO_SRCHCURBOLISTRecord)ds.curbolist.get(0);
%>
    <form name="bo_form" method="post">
        <input type=hidden name=bocd 		value="<%=rec.bocd 			%>">	<!--���������ڵ�      -->
        <input type=hidden name=bonm 		value="<%=rec.bonm 			%>">	<!--���������        -->
        <input type=hidden name=deptcd 		value="<%=rec.deptcd 		%>">	<!--�μ��ڵ�          -->
        <input type=hidden name=deptnm 		value="<%=rec.deptnm 		%>">	<!--�μ���            -->
        <input type=hidden name=areacd 		value="<%=rec.areacd 		%>">	<!--�����ڵ�          -->
        <input type=hidden name=areanm 		value="<%=rec.areanm 		%>">	<!--������            -->
        <input type=hidden name=tel_no11 	value="<%=rec.tel_no11 		%>">	<!--������ȭ��ȣ1     -->
        <input type=hidden name=tel_no12 	value="<%=rec.tel_no12 		%>">	<!--������ȭ��ȣ2     -->
        <input type=hidden name=tel_no13 	value="<%=rec.tel_no13 		%>">	<!--������ȭ��ȣ3     -->
        <input type=hidden name=fax1 		value="<%=rec.fax1 			%>">	<!--�����ѽ�1         -->
        <input type=hidden name=fax2 		value="<%=rec.fax2 			%>">	<!--�����ѽ�2         -->
        <input type=hidden name=fax3 		value="<%=rec.fax3 			%>">	<!--�����ѽ�3         -->
        <input type=hidden name=bo_headnm 	value="<%=rec.bo_headnm 	%>">	<!--�������          -->
        <input type=hidden name=htel_no1 	value="<%=rec.htel_no1 		%>">	<!--��������ȭ��ȣ1   -->
        <input type=hidden name=htel_no2 	value="<%=rec.htel_no2 		%>">	<!--��������ȭ��ȣ2   -->
        <input type=hidden name=htel_no3 	value="<%=rec.htel_no3 		%>">	<!--��������ȭ��ȣ3   -->
        <input type=hidden name=hptph_no1 	value="<%=rec.hptph_no1 	%>">	<!--�������޴�����ȣ1 -->
        <input type=hidden name=hptph_no2 	value="<%=rec.hptph_no2 	%>">	<!--�������޴�����ȣ2 -->
        <input type=hidden name=hptph_no3 	value="<%=rec.hptph_no3 	%>">	<!--�������޴�����ȣ3 -->
        <input type=hidden name=hemail 		value="<%=rec.hemail 		%>">	<!--�������̸���      -->
        <input type=hidden name=boaddr 		value="<%=rec.boaddr 		%>">	<!--�����ּ�          -->
        <input type=hidden name=bodtlsaddr 	value="<%=rec.bodtlsaddr 	%>">	<!--�������ּ�      -->
        <input type=hidden name=hboaddr 	value="<%=rec.hboaddr 		%>">	<!--�������ּ�        -->
        <input type=hidden name=hbodtlsaddr value="<%=rec.hbodtlsaddr 	%>">	<!--��������ּ�    -->
    </form>
    <script language="javascript">
        parent.bo_search_result();
    </script>
<%
    }else{
%>
    <script language="javascript">
        parent.bo_search();
    </script>
<%
    }
%>