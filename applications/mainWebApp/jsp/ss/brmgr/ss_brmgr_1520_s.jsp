<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_1520_s.jsp
* ��� : �����濵-�����������-��
* �ۼ����� : 2004-04-16
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_FCT_FRFTDataSet ds = (SS_S_FCT_FRFTDataSet)request.getAttribute("ds");
%>

    <!--���� -->
      <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" bgcolor="#FFFFFF" id="fct_frft_detail">
 		<form name="detail_form" method="post" action="">
		<input type="hidden" name="common_deptcd" value ="">
		<input type="hidden" name="bocd" value ="<%= ds.getBocd()%>" maxlength="5" >                   <!-- ���� �μ�(��)�ڵ� -->
		<input type="hidden" name="accflag" value ="" maxlength="5" >
        <input type="hidden" name="incmgpers" value="">
        <input type="hidden" name="impndt_pk" value="<%= ds.getImpndt()%>">
        <input type="hidden" name="deptcd_pk" value="<%= ds.getDeptcd()%>">
        <input type="hidden" name="areacd_pk" value="<%= ds.getAreacd()%>">
        <input type="hidden" name="viltresn_pk" value="<%= ds.getViltresn()%>">
        <tr>
          <td  bgcolor="#dddddd" class="gray" width="90">����
          </td>
          <td width="250" class="gray">��&nbsp;
            <select name="deptcd" size="1" class="sel_all" notEmpty caption="��" onChange="area_search('2');">
              <option value="" selected>����</option>
              <%= ds.deptlistOptHtml(ds.getDeptcd()) %>
            </select>
            ����
            <select name="areacd" size="1" class="sel_all" notEmpty caption="����" id="fct_frft_areacd_id">
              <option value="<%= ds.getAreacd()%>" selected><%= ds.getAreanm()%></option>
            </select>
		  </td>
		  <td class="gray" colspan="2">
            ����
            <input name="bonm" type="text" size="8" value="<%= ds.getBonm()%>" notEmpty style="ime-mode:active;" size="8" class="text_box" onkeydown="bo_enter_search('2');">
            <input type="image" id="bo_search_id" src="/html/comm_img/bu_search02.gif" width="39" style="cursor:hand" height="19" align="absmiddle" onclick="javascript:bo_search('2');window.event.returnValue=false;"><!--�����˻��˾�-->
            <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('2');window.event.returnValue=false;"> <!--�μ�(��),����,���� �ʱ�ȭ-->
          </td>
          <td bgcolor="#dddddd" class="gray" width="90">���ݰǼ�</td>
          <td class="gray">
            <input name="viltnoit" type="text" value="<%= ds.getViltnoit()%>" size="4" class="text_box">
            ��</td>
        </tr>
        <tr>
          <td width="90" height="26" bgcolor="#dddddd" class="gray">�ΰ����� </td>
          <td class="gray" width="250">
            <input type="text" name="impndt" value="<%= ds.getImpndt()%>" notEmpty caption="�ΰ�����" class="text_box" dataType="date">
          </td>
          <td width="90" bgcolor="#dddddd" class="gray">���ڸ� </td>
          <td colspan="3" class="gray">
            <input type="text" style="ime-mode:active;" name="rdrnm" value="<%= ds.getRdrnm()%>" caption="���ڸ�" class="text_box">
          </td>
        </tr>
        <tr>
          <td height="26" bgcolor="#dddddd" class="gray" width="90">�ΰ��ݾ� </td>
          <td class="gray" width="250">
            <input type="text" name="frftimpnamt" value="<%= ds.getFrftimpnamt()%>" caption="�ΰ��ݾ�" style="text-align:right" dataType="number" class="text_box" comma>
          </td>
          <td width="90" bgcolor="#dddddd" class="gray">�����ݾ� </td>
          <td colspan="3" class="gray">
            <input type="text" name="resamt" caption="�����ݾ�" value="<%= ds.getResamt()%>" style="text-align:right" dataType="number"  class="text_box" comma>
          </td>
        </tr>
        <tr>
          <td height="26" bgcolor="#dddddd" class="gray" width="90">���ǰ�� </td>
          <td class="gray" width="250">
            <select name="delbocom" caption="���ǰ��" class="sel_all">
              <option value="" selected>����</option>
              <%= ds.delbocomlistOptHtml(ds.getDelbocom()) %>
            </select>
          </td>
          <td width="90" bgcolor="#dddddd" class="gray">�������</td>
          <td colspan="3" class="gray">
            <select name="viltresn" notEmpty  size="1" class="sel_all" caption="�������" >
              <option value="" selected>����</option>
              <%= ds.viltresnlistOptHtml(ds.getViltresn()) %>
            </select>
          </td>
        </tr>
        <tr>
          <td height="26" bgcolor="#dddddd" class="gray" width="90">�����Աݾ� </td>
          <td class="gray" width="250">
            <input type="text" caption="�����Աݾ�" value="<%= ds.getHdqtrcpmamt()%>" style="text-align:right" dataType="number" name="hdqtrcpmamt" class="text_box" comma>
          </td>
          <td width="90" bgcolor="#dddddd" class="gray">�����Ա����� </td>
          <td class="gray" width="200">
            <input type="text" name="hdqtrcpmdt" value="<%= ds.getHdqtrcpmdt()%>" dataType="date" caption="�����Ա�����" class="text_box">
          </td>
          <td width="90" bgcolor="#dddddd" class="gray">����̳��ݾ� </td>
          <td class="gray">
            <input type="text" name="hdqtun_pymtamt" value="<%= ds.getHdqtun_pymtamt()%>" caption="����̳��ݾ�" style="text-align:right" dataType="number" class="text_box" comma>
          </td>
        </tr>
        <tr>
          <td height="26" bgcolor="#dddddd" class="gray" width="90">�����Աݾ� </td>
          <td class="gray" width="250">
            <input type="text" name="borcpmamt" value="<%= ds.getBorcpmamt()%>" caption="�����Աݾ�" style="text-align:right" dataType="number" class="text_box" comma>
          </td>
          <td width="90" bgcolor="#dddddd" class="gray">�����Ա����� </td>
          <td class="gray" width="200">
            <input type="text" name="borcpmdt" value="<%= ds.getBorcpmdt()%>" caption="�����Ա�����" dataType="date" class="text_box">
          </td>
          <td bgcolor="#dddddd" class="gray" width="90">�����̳��ݾ� </td>
          <td class="gray">
            <input type="text" name="boun_pymtamt" value="<%= ds.getBoun_pymtamt()%>" caption="�����̳��ݾ�" style="text-align:right" dataType="number" class="text_box" comma>
          </td>
        </tr>
		</form>
      </table>

<script>
    parent.document.all.fct_frft_detail.outerHTML = fct_frft_detail.outerHTML;
    // detail_form �� accflag �� 'U'�� �����Ѵ�.
    parent.document.detail_form.accflag.value = 'U'
    // ��ҹ�ư Ȱ��ȭ
    parent.document.all.cancel_id.disabled = false;
	// �Է��׸� ó��
	parent.jsInit();
</script>
