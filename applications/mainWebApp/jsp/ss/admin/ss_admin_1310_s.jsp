<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1310_s.jsp
* ��� : ������-���ϸ���-���ޱ���-��
* �ۼ����� : 2004-03-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_MIGLBASIDataSet ds = (SS_S_MIGLBASIDataSet)request.getAttribute("ds");
    int sel_idx = 0;	// ������������ ���� ���� ȭ���� readOnly �Ӽ��� �����ϱ� ���� pontcalcclsfcd_changed(sel_idx) ��ũ��Ʈ �Լ� ȣ���� �Ű����� ��� ����
%>
<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="paybasi_detail_id">
<form name="paybasi_detail_form" method="post" action="">
    <input type="hidden" name="accflag" value="I">          					<!-- �Է�(I),����(U),����(D) �����ʵ� �ʱⰪ(I) -->
    <input name="cmpycd" type="hidden" value ="<%= ds.getCmpycd()%>">			<!--ȸ���ڵ�-->
    <input name="medicd" type="hidden" value ="<%= ds.getMedicd()%>">           <!--��ü�ڵ�-->
    <input name="payclsfcd" type="hidden" value ="<%= ds.getPayclsfcd()%>">    	<!--���ޱ���-->
    <input name="paybasicd" type="hidden" value ="<%= ds.getPaybasicd()%>">    	<!--���ޱ���-->
	<input name="pontcalcclsfcd" type="hidden" value ="<%= ds.getPontcalcclsfcd()%>">   <!--��������-->
   
	<tr> 
		
		<td bgcolor="#dddddd" class="gray"> ȸ��<font color="red">*</font></td>
		<td colspan="3" class="gray" width="200" id="cmpycd_td_id">&nbsp;<%= ds.getCmpy()%></td>
		<td width="150" bgcolor="#dddddd" class="gray"> ��������<font color="red">*</font></td>
		<td width="150" bgcolor="#dddddd" class="gray"> ����Ʈ</td>
		<td class="gray" width="130">
			<input name="pont" type="text" value="<%= ds.getPont()%>" size="8"  class="text_box" dataType="integer" comma >
		</td>			
		
	</tr>
	<tr> 
	
		<td bgcolor="#dddddd" class="gray"> ��ü<font color="red">*</font></td>
		<td colspan="3" class="gray"  width="200" id="medicd_td_id">&nbsp;<%= ds.getMedinm()%></td>
		<td width="150" bgcolor="#dddddd" class="gray"> 
<%--�������������ڵ� ������ư ���--%>			
<%for(int i=0; i<ds.curpontcalcclsfcd.size(); i++){
		String checked = "";
		SS_S_MIGLBASICURPONTCALCCLSFCDRecord curpontcalcclsfcdRec = (SS_S_MIGLBASICURPONTCALCCLSFCDRecord)ds.curpontcalcclsfcd.get(i);		
		
		if(curpontcalcclsfcdRec.cicodeval.equals(ds.pontcalcclsfcd)){
			checked = "checked";
			sel_idx = i;
		}else{
			checked = ""; 
		}		
%>
		<input type="radio" name="pontcalcclsfcd_sel" value="<%= curpontcalcclsfcdRec.cicodeval%>" onclick="pontcalcclsfcd_changed('<%= i%>');" <%=checked%>><%= curpontcalcclsfcdRec.cicdnm%></input>
<%}%>
		</td>
		<td bgcolor="#dddddd" class="gray"> ����Ʈ����</td>
		<td class="gray" width="130">
			<input name="pontrate" type="text" value="<%= ds.getPontrate()%>" size="8"  class="text_box" >
		</td>
	</tr>
	<tr> 
		<td bgcolor="#dddddd" class="gray"> ���ޱ����ڵ�<font color="red">*</font></td>
		<td colspan="3" class="gray" width="200" id="payclsfcd_td_id">&nbsp;<%= ds.getPayclsf()%></td>
		<td width="150" rowspan="2" bgcolor="#dddddd" class="gray"> �д���� </td>
		<td width="150" bgcolor="#dddddd" class="gray"> ����<font color="red">*</font></td>
		<td class="gray" width="130"> 
			<input name="hdqtallmratio" type="text" value="<%= ds.getHdqtallmratio()%>" size="8" caption="����д����" class="text_box" notEmpty>
		</td>
	</tr>
	<tr> 
		<td bgcolor="#dddddd" class="gray"> ���ޱ����ڵ�<font color="red">*</font></td>
		<td colspan="3" class="gray" width="200" id="paybasicd_td_id">&nbsp;<%= ds.getPaybasi()%></td>
		<td bgcolor="#dddddd" class="gray" width="95"> ��������<font color="red">*</font></td>
		<td class="gray" width="130"> 
			<input name="boallmratio" type="text" value="<%= ds.getBoallmratio()%>" size="8"  class="text_box"  caption="��������д����" notEmpty>
		</td>
	</tr>
	<tr> 
		<td bgcolor="#dddddd" class="gray"> ���ڵ���ջ꿩��</td>
		<td class="gray" width="50"> 
			<input name="rdrgradsumyn" type="checkbox" size="8"  class="text_box" <%= Util.convertYn(ds.getRdrgradsumyn(),"checked","")%>>
		</td>
		<td bgcolor="#dddddd" class="gray" width="150"> ��ȿ����</td>
		<td class="gray" width="50"> 
			<input name="vdtyyn" type="checkbox" size="8"  class="text_box" <%= Util.convertYn(ds.getVdtyyn(),"checked","")%>>
		</td>
		<td colspan="2" bgcolor="#dddddd" class="gray">����ȯ��<font color="red">*</font></td>
		<td class="gray" width="130"> 
			<input name="adjmexchrate" type="text" value="<%= ds.getAdjmexchrate()%>" size="8"  class="text_box"  caption="����ȯ��" notEmpty>
		</td>
	</tr>
	<tr> 
		<td bgcolor="#dddddd" class="gray"> ���� </td>
		<td colspan="6" class="gray"> 
			<textarea name="descri" cols="96" rows="3" class="scroll1"><%= ds.getDescri()%></textarea>
		</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" class="gray"> ���޽������� </td>
		<td colspan="6" class="gray">
			<textarea name="paypointdescri" cols="96" rows="3" class="scroll1"><%= ds.getPaypointdescri()%></textarea>
		</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" class="gray"> ��� </td>
		<td colspan="6" class="gray">
			<textarea name="remk" cols="96" rows="3" class="scroll1"><%= ds.getRemk()%></textarea>
		</td>
	</tr>
</form>
</table>

<script language="javascript">
    parent.document.all.paybasi_detail_id.outerHTML = paybasi_detail_id.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();
    
	// ������������ radio ����
	parent.pontcalcclsfcd_changed(<%=sel_idx%>);

	// ���� accflag �� 'U'�� �����Ѵ�.
    parent.document.paybasi_detail_form.accflag.value = 'U'
	
	// ��ҹ�ư ��Ȱ��ȭ 
 	parent.document.all.cancel_id.disabled=false;							
   
        
</script>
