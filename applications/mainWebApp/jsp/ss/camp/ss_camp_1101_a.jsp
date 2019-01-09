<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : ss_camp_1101_a.jsp
* 기능 		 : 캠페인확장등록-이벤트목록조회
* 작성일자 	 : 2005-05-27
* 작성자 	 : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    // getting datasetgetAttribute
    SS_L_CAMP_EVENT_LISTDataSet ds = (SS_L_CAMP_EVENT_LISTDataSet)request.getAttribute("ds");  // request dataset

%>

	<select name="camp_id" id="camp_id" class="sel_all">
                  <%= ds.curcampeventcdOptHtml("") %>
	</select>

<script language="javascript">
	parent.document.all.camp_id.outerHTML = camp_id.outerHTML;
	parent.jsInit();
    <%
    if(ds.curcampeventcd.size()==0) {
        out.print("alert(\"검색결과가 없습니다.\");");
    }
    %>
</script>
