<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : ss_brinfo_1660_s.jsp
* ��� 	 	 : ����info-SMS ��ȸ
* �ۼ����� 	 : 2004-04-02
* �ۼ��� 	 : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 :
* ������ 	 :
* �������� 	 :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    //	datacct �ν��Ͻ� ����κ�
    SS_S_SMSDataSet ds = (SS_S_SMSDataSet)request.getAttribute("ds");  // request datacct
%>

<script language="javascript">
    var go_form1 = parent.document.sms_form;

    go_form1.sms1.value = '<%=ds.getSms1()%>';
    go_form1.sms2.value = '<%=ds.getSms2()%>';
    go_form1.sms3.value = '<%=ds.getSms3()%>';
    go_form1.emailnm.value = '<%=ds.getEmailnm()%>';
    
    if('<%=ds.getSmsset()%>'=='Y'){
    	go_form1.smsset_check.checked = true;
    }
    if('<%=ds.getEmailset()%>'=='Y'){
    	go_form1.emailset_check.checked = true;
    }
    
    parent.jsInit();
</script>