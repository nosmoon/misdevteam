<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_common_1160_l.jsp
* 기능 : 공통-매체코드검색(회사별)-검색폼
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
    SS_L_CMPY_MEDICDDataSet ds = (SS_L_CMPY_MEDICDDataSet)request.getAttribute("ds");
%>
<select name="medicd" class="sel_all" id="medicd_id">
	<option value="" selected>전체</option>
	<%= ds.curcommlistOptHtml("") %>
</select>

<script language="javascript">
	parent.document.all.medicd_id.outerHTML = medicd_id.outerHTML;
</script>
