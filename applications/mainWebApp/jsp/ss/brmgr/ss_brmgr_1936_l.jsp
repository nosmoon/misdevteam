<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1936_l.jsp
* 기능 : 공통 지역코드,코드명 목록 가져오기
* 작성일자 : 2003-11-20
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 : 셔센의 지역코드, 지역명 목록 반영
* 수정자 : 김대섭
* 수정일자 : 2004-02-17
* 백업파일명 : ss_common_1100_l.jsp.backup.20040217
* 수정사유 : SiteMinder  연동으로 인한 사용자 세션의  관리지역코드, 관리지역명 목록 화면 반영
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_BO_SEND_INITDataSet ds = (SS_S_BO_SEND_INITDataSet)request.getAttribute("ds");
%>
<select name="areacd" size="1" id="areacd_id" class="sel_all"  id=areacd_id>  <!--지역코드, 지역명 목록-->
    <option value='' selected>전체</option>
    <%= ds.areacdcurOptHtml("") %>
</select>
<script>
    parent.document.all.areacd_id.outerHTML = areacd_id.outerHTML;
</script>
