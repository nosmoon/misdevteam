<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : ss_brsup_2140_l.jsp
* 기능 	 	 : 지국지원-컴퓨터AS
* 작성일자 	 : 2004-03-15
* 작성자 	 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    //	dataset 인스턴스 선언부분
    SS_L_ASREQDataSet ds = (SS_L_ASREQDataSet)request.getAttribute("ds");  // request dataset
%>

  <select id="computer_id" name="computernm" class="sel_all" onChange="bocomp_search();">
    <% for(int i=0 ; i< ds.curcomplist.size(); i++) {
        SS_L_ASREQCURCOMPLISTRecord rec = (SS_L_ASREQCURCOMPLISTRecord)ds.curcomplist.get(i);%>
        <%if(i == 0){%>
    		<option value="" selected>조회할 컴퓨터를 선택하세요.</option>
    	<%}%>
    		<option value="<%=rec.eqpno%>"><%=rec.computernm%></option>
    <%}%>
    <%if(ds.curcomplist.size() == 0){%>
    	<option value="" selected>컴퓨터 없음</option>
	<%}%>    		    
    
  </select>
		     

<script>
    parent.document.all.computer_id.outerHTML = computer_id.outerHTML;
    <%if(ds.curcomplist.size() == 0){%>
		alert("지국에 등록된 컴퓨터가 존재하지 않습니다.");    		
	<%}%>    		    
    
    parent.jsInit();
</script>