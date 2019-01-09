<%@ page contentType="text/html; charset=ksc5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pb_bil_1721_l.jsp
* 기능 : 수금-자동이체 독자별 매체리스트
* 작성일자 : 2006-04-17
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    PB_L_MEDIDataSet ds = (PB_L_MEDIDataSet)request.getAttribute("ds");
%>
<select name="medicd" class="sel_all" id="medi_list_id" onChange="set_medi(this)" notEmpty caption="구독매체">
    <option value="">선택</option>
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
