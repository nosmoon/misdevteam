<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_common_1162_l.jsp
* 기능 : 공통-지급기준코드검색(지급구분별-마일리지)-검색폼
* 작성일자 : 2004-03-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_MIG_CLSF_BASIDataSet ds = (SS_L_MIG_CLSF_BASIDataSet)request.getAttribute("ds");
%>
<select name="paybasicd" class="sel_all" id="paybasicd_id">
	<option value="" selected>전체</option>
	<%= ds.curcommlistOptHtml("") %>
</select>

<script language="javascript">
	parent.document.all.paybasicd_id.outerHTML = paybasicd_id.outerHTML;
</script>
