<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1445_l.jsp
* ��� : Ȯ����Ȳ-Ȯ��������-���/��ȸ-���
* �ۼ����� : 2003-12-18
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_EXTN_SLSCOSTDataSet ds = (SS_L_RDR_EXTN_SLSCOSTDataSet)request.getAttribute("ds");
    int listCount = 10;		// ȭ��� �׸��
	int colCount = 0;		// ȭ�鼱�ÿ� ���� �����ֿ��� �� �÷���
	int tdWidth = 0;		// �÷��� �ʺ�
	// �����׸��� ������ ����Ѵ�.
	if("Y".equals(ds.getBoextn())){
		colCount++;
	}
	if("Y".equals(ds.getMovm())){
		colCount++;
	}
	if("Y".equals(ds.getEmpextn())){
		colCount++;
	}
	if("Y".equals(ds.getExgextn())){
		colCount++;
	}

	// 0 ������ üũ
	if(colCount == 0){
		tdWidth = 180;
	}else{
		tdWidth = (int)(180/colCount);
	}
%>

<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="sply_list_id">
<form name="sply_list_form" method="post" action="" >
    <input name="basidtary" type="hidden" value ="">
    <input name="bocdary" type="hidden" value ="">
    <input name="payqtyary" type="hidden" value ="">
    <input name="uprcary" type="hidden" value ="">
    <input name="splyamtary" type="hidden" value ="">
    
	<tr bgcolor="#dddddd" align="center">
		<td rowspan="2" class="gray">����</td>
		<td width="45" rowspan="2" class="gray">�ǵ���</td>
<%	if(! "Y".equals(ds.getBoextn())){%><!--<%}%>
		<td width="<%= tdWidth %>" rowspan="2" class="gray">����</td>
<%	if(! "Y".equals(ds.getBoextn())){%>--><%}%>
<%	if(! "Y".equals(ds.getMovm())){%><!--<%}%>
		<td width="<%= tdWidth %>" rowspan="2" class="gray">�̻�</td>
<%	if(! "Y".equals(ds.getMovm())){%>--><%}%>
<%	if(! "Y".equals(ds.getEmpextn())){%><!--<%}%>
		<td width="<%= tdWidth %>" rowspan="2" class="gray">���</td>
<%	if(! "Y".equals(ds.getEmpextn())){%>--><%}%>
<%	if(! "Y".equals(ds.getExgextn())){%><!--<%}%>
		<td width="<%= tdWidth %>" rowspan="2" class="gray">ǰ����</td>
<%	if(! "Y".equals(ds.getExgextn())){%>--><%}%>
		<td width="45" rowspan="2" class="gray">��</td>
		<td colspan="6" class="gray">�ְ�����</td>
		<td width="55" rowspan="2" class="gray" bgcolor="#dddddd"> ���޺μ�</td>
		<td width="55" rowspan="2" class="gray">����ܰ�</td>
		<td width="60" rowspan="2" class="gray"> �����ݾ�</td>
	</tr>
	<tr bgcolor="#dddddd" align="center">
		<td width="40" class="gray"> APT</td>
		<td width="40" class="gray"> ����</td>
		<td width="40" class="gray"> ����</td>
		<td width="40" class="gray"> �繫��</td>
		<td width="40" class="gray">��</td>
		<td width="40" class="gray">��Ÿ</td>
	</tr>

<%
for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_RDR_EXTN_SLSCOSTCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_SLSCOSTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <input name="basidt" type="hidden" value ="<%= curcommlistRec.basidt%>">	<!-- �������� -->
    <input name="bocd" type="hidden" value ="<%= curcommlistRec.bocd%>">		<!-- ���������ڵ� -->
    
	<tr>
		<td class="gray" align="left"><%= curcommlistRec.bocdnm%>&nbsp;</td>
		<td width="45" class="gray" align="right"><%= Util.comma(curcommlistRec.realrdrcnt)%>&nbsp;</td>
<%	if(! "Y".equals(ds.getBoextn())){%><!--<%}%>
		<td width="<%= tdWidth %>" class="gray" align="right"><%= Util.comma(curcommlistRec.boqty)%>&nbsp;</td>
<%	if(! "Y".equals(ds.getBoextn())){%>--><%}%>
<%	if(! "Y".equals(ds.getMovm())){%><!--<%}%>
		<td width="<%= tdWidth %>" class="gray" align="right"><%= Util.comma(curcommlistRec.movmqty)%>&nbsp;</td>
<%	if(! "Y".equals(ds.getMovm())){%>--><%}%>
<%	if(! "Y".equals(ds.getEmpextn())){%><!--<%}%>
		<td width="<%= tdWidth %>" class="gray" align="right"><%= Util.comma(curcommlistRec.empqty)%>&nbsp;</td>
<%	if(! "Y".equals(ds.getEmpextn())){%>--><%}%>
<%	if(! "Y".equals(ds.getExgextn())){%><!--<%}%>
		<td width="<%= tdWidth %>" class="gray" align="right"><%= Util.comma(curcommlistRec.exgqty)%>&nbsp;</td>
<%	if(! "Y".equals(ds.getExgextn())){%>--><%}%>
		<td width="45" class="gray" align="right"><%= Util.comma(curcommlistRec.sumqty)%>&nbsp;</td>
		<td width="40" class="gray" align="right"><%= Util.comma(curcommlistRec.apt)%>&nbsp; </td>
		<td width="40" class="gray" align="right"><%= Util.comma(curcommlistRec.villa)%>&nbsp;</td>
		<td width="40" class="gray" align="right"><%= Util.comma(curcommlistRec.hous)%>&nbsp;</td>
		<td width="40" class="gray" align="right"><%= Util.comma(curcommlistRec.offi_room)%>&nbsp;</td>
		<td width="40" class="gray" align="right"><%= Util.comma(curcommlistRec.shop)%>&nbsp;</td>
		<td width="40" class="gray" align="right"><%= Util.comma(curcommlistRec.etc)%>&nbsp;</td>
		<td width="55" class="gray" align="center">
			<input name="payqty" type="text" size="7" class="text_box" value="<%= curcommlistRec.payqty%>" dataType="integer" comma style="text-align:right">
		</td>
		<td width="55" class="gray" align="center">
			<input name="uprc" type="text" size="7" class="text_box" value="<%= curcommlistRec.uprc%>" dataType="integer" comma style="text-align:right">
		</td>
		<td width="60" class="gray" align="center">
			<input name="splyamt" type="text" size="8" class="text_box" value="<%= curcommlistRec.splyamt%>" dataType="integer" comma style="text-align:right">
		</td>
	</tr>
<%}%>

<%if(ds.curcommlist.size() == 0){%>
	<%for(int i=0; i<listCount; i++){%>
	<tr align="center">
		<td class="gray" align="left">&nbsp;</td>
		<td width="45" class="gray" align="left">&nbsp;</td>
<%	if(! "Y".equals(ds.getBoextn())){%><!--<%}%>
		<td width="<%= tdWidth %>" class="gray" align="right">&nbsp;</td>
<%	if(! "Y".equals(ds.getBoextn())){%>--><%}%>
<%	if(! "Y".equals(ds.getMovm())){%><!--<%}%>
		<td width="<%= tdWidth %>" class="gray" align="right">&nbsp;</td>
<%	if(! "Y".equals(ds.getMovm())){%>--><%}%>
<%	if(! "Y".equals(ds.getEmpextn())){%><!--<%}%>
		<td width="<%= tdWidth %>" class="gray" align="right">&nbsp;</td>
<%	if(! "Y".equals(ds.getEmpextn())){%>--><%}%>
<%	if(! "Y".equals(ds.getExgextn())){%><!--<%}%>
		<td width="<%= tdWidth %>" class="gray" align="right">&nbsp;</td>
<%	if(! "Y".equals(ds.getExgextn())){%>--><%}%>
		<td width="45" class="gray" align="right">&nbsp;</td>
		<td width="40" class="gray" align="right">&nbsp;</td>
		<td width="40" class="gray" align="right">&nbsp;</td>
		<td width="40" class="gray" align="right">&nbsp;</td>
		<td width="40" class="gray" align="right">&nbsp;</td>
		<td width="40" class="gray" align="right">&nbsp;</td>
		<td width="40" class="gray" align="right">&nbsp;</td>
		<td width="55" class="gray" align="center"><input name="text" type="text" size="7" class="text_box"></td>
		<td width="55" class="gray" align="center"><input name="text" type="text" size="7" class="text_box"></td>
		<td width="60" class="gray" align="center"><input name="text" type="text" size="8" class="text_box"></td>
	</tr>
	<%}%>
<%}%>

	<tr bgcolor="#dddddd">
		<td colspan="16" class="gray" height="23">
			<div align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �������ݾ� <%= Util.comma(ds.getTotalsplyamt())%> �� </b>&nbsp;&nbsp;&nbsp;					
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� <%= Util.comma(ds.getTotalcnt())%> �� </b>
			</div>
		</td>
	</tr>
</form>
</table>


<script>
    parent.document.all.sply_list_id.outerHTML = sply_list_id.outerHTML;

    //ȭ�� �ʱ�ȭ
    parent.jsInit();
    
<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>     
</script>

