<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/sl_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�	: sl_commun_2620_l.jsp.jsp
* ��� 	 	 : �Ǹ�����-��Ž� ����Ʈ���� ��Ȳ���� �� ��� ����ȣ �ҷ�����
* �ۼ����� 	 : 2004-02-27
* �ۼ��� 	 : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 :
* ������ 	 :
* �������� 	 :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%

    // dataset �ν��Ͻ� ����κ�
    SL_L_COMM_APT_DONGNODataSet ds = (SL_L_COMM_APT_DONGNODataSet)request.getAttribute("ds");  // request dataset

%>

<select id="dong_id" name="dongno" class="sel_all" tabIndex="3" onChange="apt_search();">
    <option value='' <% if (true) {%> selected <%} else { }%> >����</option>
    <%
    // ������Ʈ ���� ���� �κ�
    for(int i=0 ; i< ds.dongcur.size(); i++) {
        SL_L_COMM_APT_DONGNODONGCURRecord rec = (SL_L_COMM_APT_DONGNODONGCURRecord)ds.dongcur.get(i);

    %>

    <option value="<%=rec.dongno%>">
    <%=rec.dongno%>
    </option>
    <%
     }
    %>
</select>

<script>
    parent.document.all.dong_id.outerHTML = dong_id.outerHTML;
    			
    parent.jsInit();
</script>
