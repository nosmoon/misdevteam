<%@ page contentType="text/html; charset=ksc5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pb_bil_1721_l.jsp
* ��� : ����-�ڵ���ü ���ں� ��ü����Ʈ
* �ۼ����� : 2006-04-17
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    PB_L_MEDIDataSet ds = (PB_L_MEDIDataSet)request.getAttribute("ds");
%>
<select name="medicd" class="sel_all" id="medi_list_id" onChange="set_medi(this)" notEmpty caption="������ü">
    <option value="">����</option>
<%
    for(int i=0; i<ds.rsltcur.size(); i++){
        PB_L_MEDIRSLTCURRecord rsltcurRec = (PB_L_MEDIRSLTCURRecord)ds.rsltcur.get(i);
%>
    <option value="<%=rsltcurRec.getMedicd()%>" dlvqty="<%=rsltcurRec.getDlvqty()%>" realsubsamt="<%=rsltcurRec.getRealsubsamt()%>"><%=rsltcurRec.getMedinm()%></option>
<%
    }
%>
</select>
<script language="javascript">
    parent.document.all.medi_list_id.outerHTML = document.all.medi_list_id.outerHTML;
    parent.setEventHandler();
</script>
