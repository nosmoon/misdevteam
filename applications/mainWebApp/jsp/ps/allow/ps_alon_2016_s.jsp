<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<!--JSP COMMENT START------------------------------------------------------------------------------->
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pb_alon_2016_s.jsp
* ��� : �����ޱ� �� ��ȸ
* �ۼ����� : 2004-03-29
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    // 	dataset �ν��Ͻ� ����κ�
	PS_S_PAYADVDataSet ds = (PS_S_PAYADVDataSet)request.getAttribute("ds");
    String bocd = request.getParameter("bocd");
%>

    <!-- �����󼼺����� ���� -->
    <table id="emp_detail_id" width="330" border="0"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#FFFFFF">
        <form name="emp_detail_form" method="post" action="" >
            <input name="bocd"      type="hidden" value="<%=bocd%>">
            <input name="emp_code"  type="hidden" value="<%= ds.getBoemp_no()%>">
            <input name="supp_yymm" type="hidden" value="<%= ds.getYymm()%>">
            <tr >
            <td  width="120"class="gray" bgcolor="#dddddd"> �����ڵ�<font color="red">*</font></td>
            <td class="gray">
                <input name="boemp_no" type="text" value="<%= ds.getBoemp_no()%>" size="5" class="readonly_box" tabIndex="1" caption="�����ڵ�" dataType=integer minValue="00001" maxValue="99999" notEmpty  maxlength="5">
            </td>
            </tr>
            <tr >
            <td  width="120"class="gray" bgcolor="#dddddd"> ������<font color="red">*</font></td>
            <td class="gray">
                <input name="flnm" type="text" value="<%=ds.getFlnm()%>" size="12" tabIndex="2" class="readonly_box" caption="������" notEmpty>
            </td>
            </tr>

            <tr >
                <td width="120"class="gray" bgcolor="#dddddd"> ��ȭ��ȣ </td>
                <td class="gray">
                    <input name="tel1" type="text" value="<%= ds.getTel1()%>" size="4" tabIndex="3" class="readonly_box" dataType="integer">
                    <input name="tel2" type="text" value="<%= ds.getTel2()%>" size="4" tabIndex="4" class="readonly_box" dataType="integer">
                    <input name="tel3" type="text" value="<%= ds.getTel3()%>" size="4" tabIndex="5" class="readonly_box" dataType="integer">
                </td>
            </tr>

            <tr  >
                <td bgcolor="#dddddd" width="120" class="gray"> ��ȭ��� </td>
                <td class="gray" >
                <input name="tel_charge" type="text" value="<%= ds.getTel_charge()%>" size="12"  maxlength="12" class="text_box" caption="��ȭ���" tabIndex="6" dataType="integer" comma style='text-align:right;' onkeyup="javascript:fssubs_sum();">
                </td>
            </tr>
            <tr  >
                <td bgcolor="#dddddd" width="120" class="gray"> å�Ӱ� ���� </td>
                <td class="gray" >
                <input name="resp_subs" type="text" value="<%= ds.getResp_subs()%>" size="12"  maxlength="12"  class="text_box" caption="å�Ӱ� ����" tabIndex="7" dataType="integer" comma style='text-align:right;' onkeyup="javascript:fssubs_sum();">
                </td>
            </tr>

            <tr >
                <td width="120"class="gray" bgcolor="#dddddd"> �������� </td>
                <td class="gray">
                <input name="subs_susp" type="text" value="<%= ds.getSubs_susp()%>" size="12" tabIndex="8" class="text_box" caption="��������" dataType="integer" comma style='text-align:right;' onkeyup="javascript:fssubs_sum();">
                </td>
            </tr>
            <tr>
                <td width="120"class="gray" bgcolor="#dddddd"> ���ұ� </td>
                <td class="gray">
                <input name="pay_adv" type="text" value="<%= ds.getPay_adv()%>" size="12" tabIndex="9" class="text_box" caption="���ұ�" dataType="integer" comma style='text-align:right;' onkeyup="javascript:fssubs_sum();">
                </td>
            </tr>
            <tr>
                <td width="120"class="gray" bgcolor="#dddddd"> ����ȸ�� </td>
                <td class="gray">
                <input name="mutu_aid" type="text" value="<%= ds.getMutu_aid()%>" size="12" tabIndex="10" class="text_box" caption="����ȸ��" dataType="integer" comma style='text-align:right;' onkeyup="javascript:fssubs_sum();">
                </td>
            </tr>
            <tr>
                <td width="120"class="gray" bgcolor="#dddddd"> �뿩�� </td>
                <td class="gray">
                <input name="loan" type="text" value="<%= ds.getLoan()%>" size="12" tabIndex="11" class="text_box" caption="�뿩��" dataType="integer" comma style='text-align:right;' onkeyup="javascript:fssubs_sum();">
                </td>
            </tr>
            <tr>
                <td width="120"class="gray" bgcolor="#dddddd"> �뿩������ </td>
                <td class="gray">
                <input name="loan_interest" type="text" value="<%= ds.getLoan_interest()%>" size="12" tabIndex="12" class="text_box" caption="�뿩������" dataType="integer" comma style='text-align:right;' onkeyup="javascript:fssubs_sum();">
                </td>
            </tr>
			<tr>
                <td width="120"class="gray" bgcolor="#dddddd"> DC�ݾ�  </td>
                <td class="gray">
                <input name="etc2" type="text" value="<%= ds.getEtc2()%>" size="12" tabIndex="13" class="text_box" caption="DC�ݾ�" dataType="integer" comma style='text-align:right;' onkeyup="javascript:fssubs_sum();">
                </td>
            </tr>
			<tr>
                <td width="120"class="gray" bgcolor="#dddddd"> ���ʽ����߰��߼� </td>
                <td class="gray">
                <input name="etc3" type="text" value="<%= ds.getEtc3()%>" size="12" tabIndex="14" class="text_box" caption="���ʽ����߰��߼�" dataType="integer" comma style='text-align:right;' onkeyup="javascript:fssubs_sum();">
                </td>
            </tr>
            <tr>
                <td width="120"class="gray" bgcolor="#dddddd"> �ݼۺ� </td>
                <td class="gray">
                <input name="etc4" type="text" value="<%= ds.getEtc4()%>" size="12" tabIndex="15" class="text_box" caption="�ݼۺ�" dataType="integer" comma style='text-align:right;' onkeyup="javascript:fssubs_sum();">
                </td>
            </tr>
            <tr>
                <td width="120"class="gray" bgcolor="#dddddd"> ��Ÿ </td>
                <td class="gray">
                <input name="etc1" type="text" value="<%= ds.getEtc1()%>" size="12" tabIndex="16" class="text_box" caption="��Ÿ" dataType="integer" comma style='text-align:right;' onkeyup="javascript:fssubs_sum();">
                </td>
            </tr>
            <tr>
                <td width="120"class="gray" bgcolor="#dddddd"> �������հ� </td>
                <td class="gray">
                <input name="subs_sum" type="text" value="<%= ds.getSubs_sum()%>" size="12" tabIndex="17" class="text_box" caption="�������հ�" dataType="integer" comma style='text-align:right;'>
                </td>
            </tr>
            <tr >
                <td width="120"class="gray" bgcolor="#dddddd" height="105"> ��� </td>
                <td class="gray" height="105">
                <textarea name="remk" class="Input_textarea" cols="30" rows="7" tabIndex="18"><%= ds.getRemk()%></textarea>
                </td>
            </tr>
        </form>
    </table>
	<!-- �����󼼺����� �� -->
<script>
    parent.document.all.emp_detail_id.outerHTML = document.all.emp_detail_id.outerHTML;
    //parent.document.emp_detail_form.boemp_no.readOnly = true;
    parent.jsInit();
</script>
