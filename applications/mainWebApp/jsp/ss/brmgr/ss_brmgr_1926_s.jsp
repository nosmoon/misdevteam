<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<!--JSP COMMENT START------------------------------------------------------------------------------->
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_2326_s.jsp
* ��� : ��ü �ϰ��߼� ��üȣ��
* �ۼ����� : 
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
    SS_S_BO_SEND_INITDataSet ds = (SS_S_BO_SEND_INITDataSet)request.getAttribute("ds");  // request dataset
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
