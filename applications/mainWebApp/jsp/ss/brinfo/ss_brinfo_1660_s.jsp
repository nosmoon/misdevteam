<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : ss_brinfo_1660_s.jsp
* 기능 	 	 : 지국info-SMS 조회
* 작성일자 	 : 2004-04-02
* 작성자 	 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    //	datacct 인스턴스 선언부분
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