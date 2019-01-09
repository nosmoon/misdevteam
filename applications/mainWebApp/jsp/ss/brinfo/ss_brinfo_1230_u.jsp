<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brinfo_1230_s.jsp
* 기능 : 지국Info-지국장정보 저장(수정)
* 작성일자 : 2004-03-10
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    String bocd = Util.checkString((String)request.getAttribute("bocd"));
    String prn = Util.checkString((String)request.getAttribute("prn"));
    String bjjgseq = Util.checkString((String)request.getAttribute("bjjgseq"));
    String bjjuminno = Util.checkString((String)request.getAttribute("bjjuminno"));    
%>
<script language="javascript">
    alert("수정되었습니다.");

    // 목록화면을 갱신해준다.
    parent.detail_view('<%=bocd%>','<%=prn%>','<%=bjjgseq%>','<%=bjjuminno%>');
    
    // 이벤트 핸들러 호출
    parent.jsInit();    

</script>