<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1710_s.jsp
* ��� : Ȯ����Ȳ-���̹�Ȯ��-��ȸ����-��
* �ۼ����� : 2004-04-06
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_RDR_EXTN_CYBCAMPDataSet ds = (SS_S_RDR_EXTN_CYBCAMPDataSet)request.getAttribute("ds");
    int mediListCount = 9;
%>
<table id="camp_detail_title_id" width="100%" border="0" cellspacing="0" cellpadding="2">
    <tr>
        <td height="25" bgcolor="#EBE9DC" class="title">���̹�Ȯ���ȸ ��</td>
    </tr>
    <tr>
        <td height="3">
        <!--����-->
        </td>
    </tr>
</table>

<table id="camp_detail_id" width="340" border="0" cellspacing="0" cellpadding="1" bgcolor="#ffffff" class="gray">
<form name="camp_detail_form" method="post" action="">
    <input type="hidden" name="accflag" value="U">									<!-- �Է�(I),����(U),����(D) �����ʵ� �ʱⰪ(I) -->
    <input type="hidden" name="rdr_extncampno" value="<%= ds.getRdr_extncampno()%>"><!-- ���Ȯ���ȸ��ȣ -->
    <input type="hidden" name="closyn" value="<%= ds.getClosyn()%>">				<!-- ���Ȯ���ȸ �������� -->
    <input type="hidden" name="medicdary" value="">									<!-- ��ü���� ���ڿ� ���� -->
    <input type="hidden" name="alonamtary" value="">        						<!-- ����ݾ� ���ڿ� ���� -->
    <input type="hidden" name="cnvsalonamtary" value="">    						<!-- �����ڼ��� ���ڿ� ���� -->
	<tr>
		<td bgcolor="#dddddd"  class="gray" height="25">��ȸ��<font color="#FF0000">*</td>
		<td colspan="2" class="gray" height="25">
			<input name="campnm" type="text" size="20" class="text_box" value="<%= ds.getCampnm()%>" caption="��ȸ��" notEmpty>
		</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" class="gray" height="25">��������<font color="#FF0000">*</td>
		<td colspan="2" class="gray" height="25">
			<input name="frdt" type="text" size="10" class="text_box" value="<%= ds.getFrdt()%>"  caption="��������" dataType="date" notEmpty>
		</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" class="gray" height="25">��������<font color="#FF0000">*</td>
		<td colspan="2" class="gray" height="25">
			<input name="todt" type="text" size="10" class="text_box" value="<%= ds.getTodt()%>" caption="��������" dataType="date" notEmpty>
		</td>
	</tr>
<%--	
	<tr>
		<td bgcolor="#dddddd" class="gray" height="25">��������<font color="#FF0000">*</td>
		<td colspan="2" class="gray" height="25">
			<input name="closdt" type="text" size="10" class="text_box" value="<%= ds.getClosdt()%>" caption="��������" dataType="date" notEmpty>
		</td>
	</tr>
	<tr>
		<td  bgcolor="#dddddd" class="gray" height="25">��������</td>
		<td colspan="2" class="gray" height="25"><%= ds.getClosyn()%></td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" class="gray" height="25">��������<font color="#FF0000">*</td>
		<td colspan="2" class="gray" height="25">
			<input name="alonpayplandt" type="text" size="10" class="text_box" value="<%= ds.getAlonpayplandt()%>" caption="��������" dataType="date" notEmpty>
		</td>
	</tr>
--%>	
	<tr>
		<td bgcolor="#dddddd" class="gray" height="25">���</td>
		<td colspan="2" class="gray" height="25">
			<input name="remk" type="text" size="35" class="text_box" value="<%= ds.getRemk()%>">
		</td>
	</tr>
	<tr align="center" bgcolor="#EBE9DC">
		<td Width="140" class="gray" height="25">��ü</td>
		<td width="100" class="gray" height="25">����</td>
		<td width="100" class="gray" height="25">�����ڼ���</td>
	</tr>


<%-- ��ü ��� �ݺ� ���� --%>
<%
for(int i=0; i<mediListCount; i++){     // ȭ�鿡 ǥ���� ��� ���� ��ŭ
    if(i< ds.curcommlist.size()){		// ������ ������� ������ �ִ� ���
        SS_S_RDR_EXTN_CYBCAMPCURCOMMLISTRecord curcommlistRec = (SS_S_RDR_EXTN_CYBCAMPCURCOMMLISTRecord)ds.curcommlist.get(i);
%>
  <tr>
    <td width="110" class="gray" height="25" align="center">
    <%-- �ϳ��� ��ü�� �ʼ� �Է��׸� --%>
    <%
        if( i== 0 ){
    %>
    <select name="medicd<%= i+1 %>" id="medicd<%= i+1 %>" class="sel_all" caption="��ü����" notEmpty onchange="javascript:medicd_change(medicd<%= i+1 %>, alonamt<%= i+1 %>,  cnvsalonamt<%= i+1 %>);">
    <%
        }else{
    %>
    <select name="medicd<%= i+1 %>" id="medicd<%= i+1 %>" class="sel_all" caption="��ü����" onchange="javascript:medicd_change(medicd<%= i+1 %>, alonamt<%= i+1 %>,  cnvsalonamt<%= i+1 %>);">
    <%
        }
    %>
        <!-- ��ü�ڵ�, �ڵ�� ��� -->
        <option value=''>����</option>
        <%
            for(int j=0; j<ds.curmedicd.size(); j++){
                SS_S_RDR_EXTN_CYBCAMPCURMEDICDRecord curmedicdRec = (SS_S_RDR_EXTN_CYBCAMPCURMEDICDRecord)ds.curmedicd.get(j);

                if(curmedicdRec.cicodeval.equals(curcommlistRec.medicd)){
        %>
                    <option value="<%= curmedicdRec.cicodeval%>" selected><%= curmedicdRec.cicdnm%></option>
        <%      }else{%>
                    <option value="<%= curmedicdRec.cicodeval%>"><%= curmedicdRec.cicdnm%></option>
        <%
                }
            }
        %>
    </select>
    </td>
    <td class="gray" height="25" align="center">
      <input name="alonamt<%= i+1 %>" id="alonamt<%= i+1 %>" type="text" style="text-align:right" value="<%= curcommlistRec.alonamt%>" size="8" class="text_box" caption="����" dataType="integer" comma >
    </td>
    <td class="gray" height="25" align="center">
      <input name="cnvsalonamt<%= i+1 %>" id="cnvsalonamt<%= i+1 %>" type="text" style="text-align:right" value="<%= curcommlistRec.cnvsalonamt%>" size="10" class="text_box" caption="�����ڼ���" dataType="integer" comma>
    </td>
  </tr>
<%
    }else{                  //������ ������� ������ ���� ���� ���
%>
  <tr>
    <td class="gray" height="25" align="center">
    <%-- �ϳ��� ��ü�� �ʼ� �Է��׸� --%>
    <%
        if( i== 0 ){
    %>
    <select name="medicd<%= i+1 %>" id="medicd<%= i+1 %>" class="sel_all" caption="��ü����" notEmpty onchange="javascript:medicd_change(medicd<%= i+1 %>, alonamt<%= i+1 %>,  cnvsalonamt<%= i+1 %>);">
    <%
        }else{
    %>
    <select name="medicd<%= i+1 %>" id="medicd<%= i+1 %>" class="sel_all" caption="��ü����" onchange="javascript:medicd_change(medicd<%= i+1 %>, alonamt<%= i+1 %>,  cnvsalonamt<%= i+1 %>);">
    <%
        }
    %>
        <option value='' selected>����</option>
        <%= ds.curmedicdOptHtml("") %><!-- ��ü�ڵ�, �ڵ�� ��� -->
    </select>
    </td>
    <td class="gray" height="25" align="center">
      <input name="alonamt<%= i+1 %>" id="alonamt<%= i+1 %>" type="text" style="text-align:right" value="" size="8" class="text_box" caption="����" dataType="integer" comma >
    </td>
    <td class="gray" height="25" align="center">
      <input name="cnvsalonamt<%= i+1 %>" id="cnvsalonamt<%= i+1 %>" type="text" style="text-align:right" value="" size="10" class="text_box" caption="�����ڼ���" dataType="integer" comma>
    </td>
  </tr>
<%
    }
}
%>

<%-- ��ü ��� �ݺ� �� --%>
</form>
</table>

<script language="javascript">
    parent.document.all.camp_detail_title_id.outerHTML = camp_detail_title_id.outerHTML;
    parent.document.all.camp_detail_id.outerHTML = camp_detail_id.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();

	// ��ҹ�ư Ȱ��ȭ
	parent.document.all.cancel_id.disabled = false;

	// ���� accflag �� 'U'�� �����Ѵ�.
    parent.document.camp_detail_form.accflag.value = 'U'
</script>
