<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<!--JSP COMMENT START------------------------------------------------------------------------------->
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_send_1226_s.jsp
* ��� : ��ü �ϰ��߼� ��üȣ��
* �ۼ����� : 2005-11-28
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<!--JSP COMMENT END--------------------------------------------------------------------------------->
<%
    //  dataset �ν��Ͻ� ����κ�
    PS_S_BO_SEND_INITDataSet ds = (PS_S_BO_SEND_INITDataSet)request.getAttribute("ds");  // request dataset
%>
	<select name="mediser_no" size="1" class="sel_all" class="sel_all" style="width:80;" notEmpty  caption="��üȣ��" id="mediser_no_view">
        <%=ds.medisercurOptHtml("") %>
    </select>
	<select name="senddt" size="1" class="sel_all" class="sel_all" style="width:80;" notEmpty  caption="��üȣ��" id="senddt_view">
        <%=ds.hdqtsenddtcurOptHtml("") %>
    </select>

    <script>
    	parent.document.all.mediser_no_view.outerHTML = mediser_no_view.outerHTML;
    	parent.document.all.senddt_view.outerHTML = senddt_view.outerHTML;
		parent.setEventHandler();
    </script>
