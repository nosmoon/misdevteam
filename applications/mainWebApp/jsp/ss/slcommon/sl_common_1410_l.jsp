<%@ page contentType="text/html; charset=euc-kr" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_common_1410_l.jsp
* ��� 		 : ���� ���� ã�� (�˻� ��ư�� ���� �˾� ȭ��)
* �ۼ����� 	 : 2003-12-09
* �ۼ��� 	 : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 :
* ������ 	 :
* �������� 	 :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SL_L_BO_SRCHDataSet ds = (SL_L_BO_SRCHDataSet)request.getAttribute("ds");
%>
<%-- �˻������ ���� ���--%>
<%if(ds.curbolist.size() == 0){%>

    <!--���� �˻� ����� ���� ��� ��� ����-->
    <table width="680" border="0" cellspacing="0" cellpadding="3" id="bo_list_id">
        <tr>
            <td bgcolor="#979596" height="1">
            <!--line-->
            </td>
        </tr>
        <tr>
            <td bgcolor="#E7E7E7" align="center"><b>�Է��Ͻ� '����'�� �����ϴ�.</b><br>
            �����Ͻô� ������ '��/��/�� �̸�'�� ��Ȯ�ϰ� �ԷµǾ����� �ٽ� Ȯ�����ֽñ� �ٶ��ϴ�.</td>
        </tr>
        <tr>
            <td bgcolor="#979596" height="1">
            <!--line-->
            </td>
        </tr>
    </table>
    <!--���� �˻� ����� ���� ��� ��� ��-->

<%-- �˻������ ���� ��� --%>
<%}else{%>

    <!--���� �˻� ����� ���� ��� ��� ����-->
    <table width="680" border="1" cellspacing="0" align="center" class="gray" cellpadding="1" bgcolor="#FFFFFF" bordercolor="#FFFFFF" id="bo_list_id">
        <tr align="center">
            <td width="80" class="gray" bgcolor="#979596" ><font color="#FFFFFF">
            ���� </font></td>
            <td width="120" class="gray" bgcolor="#979596"  ><font color="#FFFFFF">
            ������/�̸��� </font></td>
            <td width="90" class="gray" bgcolor="#979596" ><font color="#FFFFFF">
            ������ȭ/�ѽ� </font></td>
            <td width="110" class="gray" bgcolor="#979596" ><font color="#FFFFFF">
            �������޴���/����</font></td>
            <td class="gray" bgcolor="#979596" ><font color="#FFFFFF">
            �����ּ�/�����������ּ�</font></td>
        </tr>
    <%-- ���� �˻� ��� ���� --%>
    <%for(int i=0; i<ds.curbolist.size(); i++){
        SL_L_BO_SRCHCURBOLISTRecord curbolistRec = (SL_L_BO_SRCHCURBOLISTRecord)ds.curbolist.get(i);%>
        <tr bgcolor="#F2F2F2" onclick="popup_select('<%= curbolistRec.bocd%>','<%= curbolistRec.bonm%>','<%= curbolistRec.deptcd%>','<%= curbolistRec.deptnm%>','<%= curbolistRec.areacd%>','<%= curbolistRec.areanm%>');" style="cursor:hand" onmouseover="change_row_color_in(this);" onmouseout="change_row_color_out(this);">
            <td rowspan="2" width="80" class="gray"><%-- ������ --%>
                <%= curbolistRec.bonm%>
            </td>
            <td width="120" class="gray"> <%= curbolistRec.bo_headnm%> &nbsp;</td><%-- ������� --%>
            <td width="90" class="gray"><%-- ������ȭ��ȣ --%>
                <%= curbolistRec.tel_no11%>-
                <%= curbolistRec.tel_no12%>-
                <%= curbolistRec.tel_no13%>&nbsp; </td>
            <td width="110" class="gray"><%-- �������޴��� --%>
                <%= curbolistRec.hptph_no1%>-
                <%= curbolistRec.hptph_no2%>-
                <%= curbolistRec.hptph_no3%>&nbsp; </td>
            <td class="gray"> <%-- �����ּ�--%>
                <%= curbolistRec.boaddr%>&nbsp;
                <%= curbolistRec.bodtlsaddr%>&nbsp;</td>
        </tr>
        <tr bgcolor="#F2F2F2" onclick="popup_select('<%= curbolistRec.bocd%>','<%= curbolistRec.bonm%>','<%= curbolistRec.deptcd%>','<%= curbolistRec.deptnm%>','<%= curbolistRec.areacd%>','<%= curbolistRec.areanm%>');" style="cursor:hand" onmouseover="change_row_color_in(this);" onmouseout="change_row_color_out(this);">
            <td width="120" class="gray"> <%= curbolistRec.hemail%>&nbsp;</td><%-- �������̸��� --%>
            <td width="90" class="gray"><%-- �����ѽ���ȣ --%>
                <%= curbolistRec.fax1%>-
                <%= curbolistRec.fax2%>-
                <%= curbolistRec.fax3%> &nbsp;</td>
            <td width="110" class="gray" ><%-- ������ ������ȭ --%>
                <%= curbolistRec.htel_no1%>-
                <%= curbolistRec.htel_no2%>-
                <%= curbolistRec.htel_no3%>&nbsp; </td>
            <td class="gray"> <%-- ������ �����ּ�--%>
                <%= curbolistRec.hboaddr%>
                <%= curbolistRec.hbodtlsaddr%>&nbsp;</td>
        </tr>
    <%}%>
    <%-- ���� �˻� ��� �� --%>
</table>
<%}%>

<!--���� �˻� ����� ���� ��� ��� ��-->
<script>
    parent.document.all.bo_list_id.outerHTML = bo_list_id.outerHTML;
</script>
