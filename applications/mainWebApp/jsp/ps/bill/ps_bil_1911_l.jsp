 <%@ page contentType="text/html; charset=ksc5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_bil_1911_l.jsp
* ��� : ����-�ڵ���üû�����
* �ۼ����� : 2006-04-19
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    PS_L_SHFT_CLAM_OCOMDataSet ds = (PS_L_SHFT_CLAM_OCOMDataSet)request.getAttribute("ds");

    // ����¡ ����
    int records_per_page = Integer.parseInt(request.getParameter("records_per_page"));
    String curr_page_no = request.getParameter("curr_page_no");
    String total_records = String.valueOf(ds.getTotalcnt());
    String js_fn_nm = request.getParameter("js_fn_nm");
%>
<table width="829" border="0" cellpadding="1" cellspacing="0" bgcolor="#ffffff" class="gray" id="clam_ocom_id">
    <tr>
        <td width="55" bgcolor="#dddddd" class="gray" align="center"> û����</td>
        <td width="55" bgcolor="#dddddd" class="gray" align="center"> ��������</td>
        <td width="140" bgcolor="#dddddd" class="gray" align="center"> ���ڹ�ȣ </td>
        <td height="16" bgcolor="#dddddd" width="110" class="gray" align="center"> ���ڸ�</td>
        <td bgcolor="#dddddd" width="80" class="gray" align="center"> ��ü</td>
        <td bgcolor="#dddddd" width="40" class="gray" align="center"> �μ�</td>
        <td bgcolor="#dddddd" width="60" class="gray" align="center"> û���ݾ�</td>
        <td bgcolor="#dddddd" width="80" class="gray" align="center"> ����</td>
        <td bgcolor="#dddddd" width="50" class="gray" align="center"> ���</td>
        <td bgcolor="#dddddd" width="90" class="gray" align="center"> �Աݿ��� </td>
        <td bgcolor="#dddddd" width="220" class="gray" align="center"> ��������</td>
    </tr>
<!--û���������Ʈ ����-->
<%
    String styleStr = "style=\"color:RED;\"";
    int i = 0;
    for(i=0; i<ds.rsltcur.size(); i++){
        PS_L_SHFT_CLAM_OCOMRSLTCURRecord rsltcurRec = (PS_L_SHFT_CLAM_OCOMRSLTCURRecord)ds.rsltcur.get(i);
        if(rsltcurRec.erryn.equals("����")) styleStr = "";
%>
    <tr onmouseover="this.style.backgroundColor='#EDFFF1'" onmouseout="this.style.backgroundColor=''" >
        <td <%=styleStr%> width="55" class="gray"><%= Util.convertMonthS(rsltcurRec.basidt.substring(0, 6))%>&nbsp;</td>
        <td <%=styleStr%> width="55" class="gray"><%= Util.convertMonthS(rsltcurRec.subsmappli.substring(0, 6))%>&nbsp;</td>
        <td <%=styleStr%> width="140" class="gray"><%= rsltcurRec.rdr_no%>&nbsp;</td>
        <td <%=styleStr%> height="16" width="110" class="gray"><%= leftKscStrB(rsltcurRec.rdrnm, 14)%>&nbsp;</td>
        <td <%=styleStr%> width="80" class="gray"><%= rsltcurRec.medinm%>&nbsp;</td>
        <td <%=styleStr%> width="40" align="right" class="gray"><%= rsltcurRec.clamqty%>&nbsp;</td>
        <td <%=styleStr%> width="60" align="right" class="gray"><%= Util.comma(rsltcurRec.clamamt)%>&nbsp;</td>
        <td <%=styleStr%> width="80" align="center" class="gray"><%= rsltcurRec.shftclsfnm%>&nbsp;</td>
        <td <%=styleStr%> width="50" align="center" class="gray"><%= rsltcurRec.erryn%>&nbsp;</td>
        <td <%=styleStr%> width="90" align="center" class="gray"><%= rsltcurRec.rcpmrflynnm%>&nbsp;</td>
        <td <%=styleStr%> width="220" class="gray"><%= rsltcurRec.recpocomnm%>&nbsp;</td>
    </tr>
<%--�� �� ����--%>
<%
    }

if(i<records_per_page) {
    for(int j=0; j<records_per_page-i; j++) {
%>
    <tr>
        <td width="55" class="gray">&nbsp;</td>
        <td width="55" class="gray">&nbsp;</td>
        <td width="140" class="gray">&nbsp;</td>
        <td height="16" width="110" class="gray">&nbsp;</td>
        <td width="80" class="gray">&nbsp;</td>
        <td width="40" align="right" class="gray">&nbsp;</td>
        <td width="60" align="right" class="gray">&nbsp;</td>
        <td width="80" align="center" class="gray">&nbsp;</td>
        <td width="50" align="center" class="gray">&nbsp;</td>
        <td width="90" align="center" class="gray">&nbsp;</td>
        <td width="220" class="gray">&nbsp;</td>
    </tr>
<%
    }
}
%>
<%--û����� ����Ʈ ��--%>
    <tr bgcolor="#dddddd">
        <td colspan="3" height="20" class="gray" style="border-right:0;"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�� <b><%= ds.getTotalcnt()%>�� </b><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">���� <b><%= ds.getNormcnt()%>��</b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">���� <b><font color="red"><%= ds.getErrcnt()%>��</font></b></td>
        <td colspan="8" height="20" class="gray" align="right" bgcolor="#dddddd"> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�� û���ݾ� <b><%= Util.comma(ds.getTotalamt())%>��</b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">����ݾ� <b><%= Util.comma(ds.getNormamt())%>��</b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�����ݾ�<b> <font color="red"><%= Util.comma(ds.getErramt())%>��</font></b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">������<b> <%= Util.comma(ds.getComsamt())%>��</b><br><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�����۱ݾ�<b> <%= Util.comma(ds.getNormamt()-ds.getComsamt())%>��</b></td>
    </tr>
</table>
<!---button-->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="clam_ocom_nav_id">
    <tr>
        <td align="center" height="2"> <!--����--> </td>
    </tr>
    <tr>
        <td align="center" height="24" bgcolor="#E8E8E8">
        <!--JSP PAGE START---------------------------------------------------------------------------------->
        <jsp:include page="/jsp/ps/comm_jsp/page_navigator.jsp">
        <jsp:param name = "curr_page_no" 		value="<%=curr_page_no%>"/>
        <jsp:param name = "total_records" 		value="<%=total_records%>"/>
        <jsp:param name = "js_fn_nm" 			value="<%=js_fn_nm%>"/>
        <jsp:param name = "records_per_page" 	value="<%=records_per_page%>"/>
        <jsp:param name = "page_set_gubun" 		value="0"/>
        </jsp:include>
        <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<script language="javascript">
    parent.document.all.clam_ocom_id.outerHTML = document.all.clam_ocom_id.outerHTML;
    parent.document.all.clam_ocom_nav_id.outerHTML = document.all.clam_ocom_nav_id.outerHTML;
    <%
        if(ds.rsltcur.size()<1) {
    %>
    alert("�˻������ �����ϴ�.");
    <%
        }
    %>
</script>
