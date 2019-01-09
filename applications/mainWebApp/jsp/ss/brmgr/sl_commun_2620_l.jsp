<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/sl_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명	: sl_commun_2620_l.jsp.jsp
* 기능 	 	 : 판매지국-통신실 아파트투입 현황조사 및 등록 동번호 불러오기
* 작성일자 	 : 2004-02-27
* 작성자 	 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%

    // dataset 인스턴스 선언부분
    SL_L_COMM_APT_DONGNODataSet ds = (SL_L_COMM_APT_DONGNODataSet)request.getAttribute("ds");  // request dataset

%>

<select id="dong_id" name="dongno" class="sel_all" tabIndex="3" onChange="apt_search();">
    <option value='' <% if (true) {%> selected <%} else { }%> >선택</option>
    <%
    // 동리스트 가져 오는 부분
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
