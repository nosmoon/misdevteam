<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : ss_camp_1101_a.jsp
* ��� 		 : ķ����Ȯ����-�̺�Ʈ�����ȸ
* �ۼ����� 	 : 2005-05-27
* �ۼ��� 	 : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 :
* ������ 	 :
* �������� 	 :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    // getting datasetgetAttribute
    SS_L_CAMP_EVENT_LISTDataSet ds = (SS_L_CAMP_EVENT_LISTDataSet)request.getAttribute("ds");  // request dataset

%>

	<select name="camp_id" id="camp_id" class="sel_all">
                  <%= ds.curcampeventcdOptHtml("") %>
	</select>

<script language="javascript">
	parent.document.all.camp_id.outerHTML = camp_id.outerHTML;
	parent.jsInit();
    <%
    if(ds.curcampeventcd.size()==0) {
        out.print("alert(\"�˻������ �����ϴ�.\");");
    }
    %>
</script>
