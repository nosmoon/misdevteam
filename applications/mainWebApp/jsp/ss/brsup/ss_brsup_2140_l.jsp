<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : ss_brsup_2140_l.jsp
* ��� 	 	 : ��������-��ǻ��AS
* �ۼ����� 	 : 2004-03-15
* �ۼ��� 	 : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 :
* ������ 	 :
* �������� 	 :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    //	dataset �ν��Ͻ� ����κ�
    SS_L_ASREQDataSet ds = (SS_L_ASREQDataSet)request.getAttribute("ds");  // request dataset
%>

  <select id="computer_id" name="computernm" class="sel_all" onChange="bocomp_search();">
    <% for(int i=0 ; i< ds.curcomplist.size(); i++) {
        SS_L_ASREQCURCOMPLISTRecord rec = (SS_L_ASREQCURCOMPLISTRecord)ds.curcomplist.get(i);%>
        <%if(i == 0){%>
    		<option value="" selected>��ȸ�� ��ǻ�͸� �����ϼ���.</option>
    	<%}%>
    		<option value="<%=rec.eqpno%>"><%=rec.computernm%></option>
    <%}%>
    <%if(ds.curcomplist.size() == 0){%>
    	<option value="" selected>��ǻ�� ����</option>
	<%}%>    		    
    
  </select>
		     

<script>
    parent.document.all.computer_id.outerHTML = computer_id.outerHTML;
    <%if(ds.curcomplist.size() == 0){%>
		alert("������ ��ϵ� ��ǻ�Ͱ� �������� �ʽ��ϴ�.");    		
	<%}%>    		    
    
    parent.jsInit();
</script>