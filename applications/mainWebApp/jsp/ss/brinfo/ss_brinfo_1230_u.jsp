<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brinfo_1230_s.jsp
* ��� : ����Info-���������� ����(����)
* �ۼ����� : 2004-03-10
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    String bocd = Util.checkString((String)request.getAttribute("bocd"));
    String prn = Util.checkString((String)request.getAttribute("prn"));
    String bjjgseq = Util.checkString((String)request.getAttribute("bjjgseq"));
    String bjjuminno = Util.checkString((String)request.getAttribute("bjjuminno"));    
%>
<script language="javascript">
    alert("�����Ǿ����ϴ�.");

    // ���ȭ���� �������ش�.
    parent.detail_view('<%=bocd%>','<%=prn%>','<%=bjjgseq%>','<%=bjjuminno%>');
    
    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();    

</script>