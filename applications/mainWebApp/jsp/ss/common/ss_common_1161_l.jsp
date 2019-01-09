<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_common_1161_l.jsp
* 기능 : 공통-매체코드검색(회사별)-상세폼
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
<select name="medicd_sel" class="sel_all" id="detail_medicd_id" onChange="medicd_changed();">
	<option value="" selected>선택</option>
	<%= ds.curcommlistOptHtml("") %>
</select>

<script language="javascript">
	parent.document.all.detail_medicd_id.outerHTML = detail_medicd_id.outerHTML;
</script>
