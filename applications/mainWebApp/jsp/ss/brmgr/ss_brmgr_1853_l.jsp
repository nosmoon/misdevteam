<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�	     : ss_brmgr_1853_l.jsp
* ��� 	 	 :
* �ۼ����� 	 : 2006-06-27
* �ۼ��� 	     : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 :
* ������ 	     :
* �������� 	 :
* ������ϸ�   :
---------------------------------------------------------------------------------------------------%>
<%

    // dataset �ν��Ͻ� ����κ�
    SL_L_APTLISTDataSet ds = (SL_L_APTLISTDataSet)request.getAttribute("ds");  // request dataset

%>

<select id="aptlist_id" name="aptlist" onChange="dong_search();" class="sel_all" style="width:197;">
  <option value="">��ü</option>
  <%=ds.addrcdcurOptHtml("")%>
</select>

<script>
    parent.document.all.aptlist_id.outerHTML = aptlist_id.outerHTML;
    parent.jsInit();
</script>
