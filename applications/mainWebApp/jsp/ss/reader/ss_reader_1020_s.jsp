<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1020_s.jsp
* ��� : ������Ȳ-��������-�����̷� ��
* �ۼ����� : 2003-12-29
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_RDR_HSTYDataSet ds = (SS_S_RDR_HSTYDataSet)request.getAttribute("ds");
%>

<!--���� ���� �� ����-->
<table width="280" border="0" cellspacing="0" cellpadding="0" class="gray" bgcolor="#FFFFFF"  id="rdr_detail_id">
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray"> ���ڹ�ȣ</td>
        <td class="gray" width="70"><%= ds.getRdr_no()%>&nbsp;</td>
        <td class="gray" width="70" bgcolor="#DDDDDD">���ڸ�</td>
        <td class="gray" width="70"><%= ds.getRdrnm()%>&nbsp;</td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70"> ��ȭ��ȣ</td>
        <td class="gray" colspan="3"><%= Util.getChainStr(ds.getRdrtel_no1(), ds.getRdrtel_no2(), ds.getRdrtel_no3(), "-")%>&nbsp;</td>
    </tr>
    <tr>
        <td class="gray" width="70" bgcolor="#DDDDDD">�޴�����ȣ</td>
        <td class="gray" colspan="3"><%= Util.getChainStr(ds.getRdrptph_no1(), ds.getRdrptph_no2(), ds.getRdrptph_no3(), "-")%>&nbsp;</td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70"> �̸���</td>
        <td class="gray" colspan="3"><%= ds.getEmail()%>&nbsp;</td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70"> ���ϸ���</td>
        <td class="gray" colspan="3"><%= ds.getMil()%>&nbsp;</td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70"> �����ȣ</td>
        <td class="gray" colspan="3"><%= ds.getDlvzip()%>&nbsp;</td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70"> �ּ�</td>
        <td class="gray" colspan="3"><%= ds.getDlvaddr()%>&nbsp;<%= ds.getDlvdtlsaddr()%></td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70"> �ְ�����</td>
        <td class="gray" width="70"><%= ds.getResitypecdnm()%>&nbsp;</td>
        <td class="gray" width="70" bgcolor="#DDDDDD">�ְű���</td>
        <td class="gray" width="70"><%= ds.getResiclsfcdnm()%>&nbsp;</td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70"> ����</td>
        <td class="gray" width="70"><%= ds.getPyong()%>&nbsp;</td>
        <td class="gray" width="70" bgcolor="#DDDDDD">�������</td>
        <td class="gray" width="70"><%= ds.getThrw_plac()%>&nbsp;</td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70">�������� </td>
        <td class="gray" colspan="3"><%= Util.convertS(ds.getRptvsubsdt())%>&nbsp;</td>
    </tr>
</table>
<!--���� ���� �� ��-->


<!--���� ���� �� ����-->
<table width="280" border="0" cellpadding="0" cellspacing="0"  align="top" class="gray" id="subs_detail_id">
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">��ü��</td>
        <td bgcolor="#FFFFFF" class="gray" colspan="3">
            <select name="medicd" onChange="subs_detail_view(this.value);"class="sel_all">
            <%-- ���� ������ü ��� --%>
            <%-- ���� ������ü �� ��ǥ��ü�� �����Ͽ� �����ش�. --%>
            <%
            for(int i=0; i<ds.curcommlist.size(); i++){
                SS_S_RDR_HSTYCURCOMMLISTRecord curcommlistRec = (SS_S_RDR_HSTYCURCOMMLISTRecord)ds.curcommlist.get(i);
				if(curcommlistRec.medicd != null && curcommlistRec.medicd.equals(ds.getMedicd())){%>
					<%-- �˻��� ��ǥ��ü�ڵ�� ������ ��� ���õǵ��� ó���Ѵ�. --%>
					<option value="<%= curcommlistRec.medicd%>" selected><%=curcommlistRec.medicdnm%></option>
				<%}else{%>
					<option value="<%= curcommlistRec.medicd%>"><%=curcommlistRec.medicdnm%></option>
				<%}%>
            <%}%>
            </select>
        </td>
	</tr>
	<tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">�ܰ�</td>
        <td bgcolor="#FFFFFF" class="gray" align="right" colspan="3"><%= Util.comma(ds.getSubsamt())%></td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">����μ�</td>
        <td width="70" bgcolor="#FFFFFF" class="gray" align="right"><%= ds.getValqty()%> ��</td>
        <td width="70" bgcolor="#DDDDDD" class="gray">�������μ�</td>
        <td width="70" bgcolor="#FFFFFF" class="gray" align="right"><%= ds.getPre_valqty()%> ��</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">����μ�</td>
        <td width="70" bgcolor="#FFFFFF" class="gray" align="right"><%= ds.getNo_valqty()%> ��</td>
        <td width="70" bgcolor="#DDDDDD" class="gray">���ᱸ��</td>
        <td width="70" bgcolor="#FFFFFF" class="gray" align="right"><%= ds.getRptvfreeclsf()%>&nbsp;</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">Ȯ������</td>
        <td width="70" bgcolor="#FFFFFF" class="gray"><%= Util.convertS(ds.getRptvrdr_extndt())%>&nbsp; </td>
        <td width="70" bgcolor="#DDDDDD" class="gray">Ȯ������</td>
        <td width="70" bgcolor="#FFFFFF" class="gray"><%= ds.getRptvrdr_extntype()%>&nbsp;</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">Ȯ����</td>
        <td width="70" bgcolor="#FFFFFF" class="gray"><%= ds.getRptvextn()%>&nbsp; </td>
        <td width="70" bgcolor="#DDDDDD" class="gray">Ȯ����</td>
        <td width="70" bgcolor="#FFFFFF" class="gray" align="right"><%= Util.comma(ds.getTotrdr_extncost())%>&nbsp;</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">��������</td>
        <td width="70" bgcolor="#FFFFFF" class="gray"><%= Util.convertS(ds.getRptvsubsdt())%>&nbsp;</td>
        <td width="70" bgcolor="#DDDDDD" class="gray">���ݹ��</td>
        <td width="70" bgcolor="#FFFFFF" class="gray"><%= ds.getClamtmthdcdnm()%>&nbsp;</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">������</td>
        <td width="70" bgcolor="#FFFFFF" class="gray"><%= ds.getRptvvalmm()%>&nbsp;</td>
        <td width="70" bgcolor="#DDDDDD" class="gray">�б�</td>
        <td width="70" bgcolor="#FFFFFF" class="gray" align="right"><%= ds.getClamtcyclcdnm()%>&nbsp;��</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">��������</td>
        <td width="70" bgcolor="#FFFFFF" class="gray"><%= ds.getRptvrdr_movmdt()%>&nbsp;</td>
        <td width="70" bgcolor="#DDDDDD" class="gray">���˹�</td>
        <td width="70" bgcolor="#FFFFFF" class="gray"><%= ds.getRptvbns_item()%>&nbsp;</td>
    </tr>
</table>
<!--���� ���� �� ��-->

<!--�̷� �˻� ��ü ���� ����-->
<select name="medicd" class="sel_all" id="hsty_search_medicd_id">
<%-- ���� ������ü ��� --%>
<%-- ���� ������ü �� ��ǥ��ü�� �����Ͽ� �����ش�. --%>
<%
for(int i=0; i<ds.curcommlist.size(); i++){
    SS_S_RDR_HSTYCURCOMMLISTRecord curcommlistRec = (SS_S_RDR_HSTYCURCOMMLISTRecord)ds.curcommlist.get(i);
    if(curcommlistRec.medicd != null && curcommlistRec.medicd.equals(ds.getMedicd())){%>
        <%-- �˻��� ��ǥ��ü�ڵ�� ������ ��� ���õǵ��� ó���Ѵ�. --%>
        <option value="<%= curcommlistRec.medicd%>" selected><%=curcommlistRec.medicdnm%></option>
    <%}else{%>
        <option value="<%= curcommlistRec.medicd%>"><%=curcommlistRec.medicdnm%></option>
    <%}%>
<%}%>
</select>
<!--�̷� �˻� ��ü ���� ��-->
<script>
    parent.document.all.rdr_detail_id.outerHTML = rdr_detail_id.outerHTML;
    parent.document.all.subs_detail_id.outerHTML = subs_detail_id.outerHTML;
    parent.document.all.hsty_search_medicd_id.outerHTML = hsty_search_medicd_id.outerHTML;
</script>
