<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<!--JSP COMMENT START------------------------------------------------------------------------------->
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_1226_s.jsp
* 기능 : 매체 일괄발송 매체호수
* 작성일자 : 2005-11-28
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<!--JSP COMMENT END--------------------------------------------------------------------------------->
<%
    //  dataset 인스턴스 선언부분
    PS_S_BO_SEND_INITDataSet ds = (PS_S_BO_SEND_INITDataSet)request.getAttribute("ds");  // request dataset
%>
	<select name="mediser_no" size="1" class="sel_all" class="sel_all" style="width:80;" notEmpty  caption="매체호수" id="mediser_no_view">
        <%=ds.medisercurOptHtml("") %>
    </select>
	<select name="senddt" size="1" class="sel_all" class="sel_all" style="width:80;" notEmpty  caption="매체호수" id="senddt_view">
        <%=ds.hdqtsenddtcurOptHtml("") %>
    </select>

    <script>
    	parent.document.all.mediser_no_view.outerHTML = mediser_no_view.outerHTML;
    	parent.document.all.senddt_view.outerHTML = senddt_view.outerHTML;
		parent.setEventHandler();
    </script>
