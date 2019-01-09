<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명	     : ss_brmgr_1853_l.jsp
* 기능 	 	 :
* 작성일자 	 : 2006-06-27
* 작성자 	     : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	     :
* 수정일자 	 :
* 백업파일명   :
---------------------------------------------------------------------------------------------------%>
<%

    // dataset 인스턴스 선언부분
    SL_L_APTLISTDataSet ds = (SL_L_APTLISTDataSet)request.getAttribute("ds");  // request dataset

%>

<select id="aptlist_id" name="aptlist" onChange="dong_search();" class="sel_all" style="width:197;">
  <option value="">전체</option>
  <%=ds.addrcdcurOptHtml("")%>
</select>

<script>
    parent.document.all.aptlist_id.outerHTML = aptlist_id.outerHTML;
    parent.jsInit();
</script>
