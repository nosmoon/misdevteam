<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_common_1107_l.jsp
* ���     : ���� �����ȣ �˻� (�����ȣ �Է� ���� �˻�)
* �ۼ����� : 2004-01-30
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
	//���� �� �ּҰ˻� ��ġ
    String zipseq = Util.Uni2Ksc(Util.checkString(request.getParameter("zipseq")));

    //getting dataset
	PB_L_TAOCC_PSTCDDataSet ds = (PB_L_TAOCC_PSTCDDataSet)request.getAttribute("ds");

	//����Ÿ �������
    if(ds.zipaddrcur.size() == 1){
		PB_L_TAOCC_PSTCDZIPADDRCURRecord zipaddrcurRec = (PB_L_TAOCC_PSTCDZIPADDRCURRecord)ds.zipaddrcur.get(0);
%>
		<form name="zip_detail_form" method="post">
        	<input type=hidden name="zip1"   value="<%=zipaddrcurRec.juzipcd1%>">
        	<input type=hidden name="zip2"   value="<%=zipaddrcurRec.juzipcd2%>">
        	<input type=hidden name="zip3"   value="<%=zipaddrcurRec.juzipcd3%>">
			<input type=hidden name="addr"   value="<%=zipaddrcurRec.jujuso1%> <%=zipaddrcurRec.jujuso2%> <%=zipaddrcurRec.jujuso3%> <%=zipaddrcurRec.jujuso4%>">
        </form>
        <script language="javascript">
        	parent.set_zip_search_result(<%=zipseq%>);
        </script>
<%
    }else{
%>
		<script language="javascript">
        	parent.zip_search(<%=zipseq%>);
        </script>
<%
    }
%>
