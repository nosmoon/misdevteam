<%@ page language="java" contentType="text/html; charset=euc-kr"%>
<%@ include file="/jsp/ps/comm_jsp/pb_common.jsp" %>

<!--JSP COMMENT START------------------------------------------------------------------------------->
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pu_bil_1131_s.jsp
* ��� : ���� �Ա� �� ����
* �ۼ����� : 2003-11-25
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<!--JSP COMMENT END--------------------------------------------------------------------------------->
<%
// dataset �ν��Ͻ� ���� �κ�
//PB_S_SEPBKDataSet ds=(PB_S_SEPBKDataSet)request.getAttribute("ds"); //request dataset
%>

<!--�˻� -->
<!--
      <table  cellspacing="0" width="830" cellpadding="2" border="0" class="gray" bgcolor="#FFFFFF" id="seprrcpm">
        <tr>
          <td width="90" bgcolor="#dddddd" class="gray" > �Ա�����</td>
          <td class="gray" >
            <input type="text" name="rcpm_dd" size="10" class="text_box" caption="�Ա�����" notEmpty>
          </td>
          <td bgcolor="#dddddd" class="gray" width="90" >�Աݹ��</td>
          <td class="gray" >
            <select name="rcpm_mthd" size="1" class="sel_all" caption="�Աݹ��" notEmpty>
              <option>����</option>
-->
				<% //=ds.rcpmmthdcurOptHtml("") %>
<!--
              <option>OCR</option>
              <option>MICR</option>
              <option>CARD</option>
              <option>������</option>
              <option>����</option>
-->
<!--            </select>
          </td>
          <td width="90" bgcolor="#dddddd" class="gray" >�ݾ�</td>
          <td class="gray" width="200">
            <input type="text" name="rcpm_amt" size="10" class="text_box" caption="�ݾ�" notEmpty>
          </td>
        </tr>
        <tr>
          <td width="90" bgcolor="#dddddd" class="gray" > ��������</td>
          <td class="gray" >
            <input type="text" name="recp_dd" size="10" class="text_box" caption="��������" notEmpty>
          </td>
          <td width="90" bgcolor="#dddddd" class="gray" > ���ڹ�ȣ</td>
          <td colspan="3" class="gray" >
            <input type="text" name="rdrno_1" size="9" class="text_box" caption="���ڹ�ȣ1" notEmpty>
            <input type="text" name="rdrno_2" size="3"  class="text_box" caption="���ڹ�ȣ2" notEmpty>
            <input type="text" name="rdrno_3" size="5"  class="text_box" caption="���ڹ�ȣ3" notEmpty>
            <input type="text" name="rdr_nm" size="10" value="����"  class="text_box" caption="����" notEmpty>
            <input type="text" name="subs_medi" size="10" value="������ü_1"  class="text_box" caption="������ü" notEmpty>
          </td>
        </tr>
      </table>
-->
<script>
    parent.document.all.seprrcpm.outerHTML = seprrcpm.outerHTML;
</script>