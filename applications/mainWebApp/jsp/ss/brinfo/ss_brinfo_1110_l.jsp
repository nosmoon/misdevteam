<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brinfo_1110_l.jsp
* ��� : ����Info-������Ȳ-��ȸ
* �ۼ����� : 2004-02-10
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%-- dataset �ν��Ͻ� ����κ�--%>
<%
	SS_L_BOINFODataSet ds = (SS_L_BOINFODataSet)request.getAttribute("ds");
    int moveListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
%>

      <!--������Ȳ ��Ȳ��� list iframe-->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_list_id">
        <tr bgcolor="#dddddd" align="center">
          <td class="gray" height="23"> ��&nbsp;</td>
          <td class="gray" width="70"> ����</td>
          <td class="gray" width="70"> ����</td>
          <td class="gray" width="70"> ������</td>
          <td class="gray" width="340"> �ּ�</td>
          <td class="gray" width="90"> ���� ��ȭ��ȣ</td>
          <td class="gray" width="90"> ������ �޴���</td>
        </tr>
	<%-- ������ǰ��Ȳ ��Ȳ ����Ʈ ���� ���� �κ�--%>
	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_BOINFOCURCOMMLISTRecord curcommlistRec = (SS_L_BOINFOCURCOMMLISTRecord)ds.curcommlist.get(i);
	%>
        <tr bgcolor="" onclick="detail_view('<%= curcommlistRec.bocd%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
          <td class="gray">&nbsp;<%= curcommlistRec.boksnm%></td>
          <td class="gray" width="70">&nbsp;<%= curcommlistRec.areanm%></td>
          <td class="gray" width="70">&nbsp;<%= curcommlistRec.bonm%></td>
          <td class="gray" width="70">&nbsp;<%= curcommlistRec.bo_headnm%></td>
          <td class="gray" width="340">&nbsp;<%= curcommlistRec.boaddr%> <%= curcommlistRec.bodtlsaddr%></td>
          <td class="gray" width="90" align="left">&nbsp;<%= Util.getChainStr(curcommlistRec.tel_no11,curcommlistRec.tel_no12,curcommlistRec.tel_no13,"-")%></td>
          <td class="gray" width="90" align="left">&nbsp;<%= Util.getChainStr(curcommlistRec.bo_head_ptph_no1,curcommlistRec.bo_head_ptph_no2,curcommlistRec.bo_head_ptph_no3,"-")%></td>
        </tr>
	<%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
    <%for(int i=0; i<(moveListCount-ds.curcommlist.size()); i++){%>
        <tr>
          <td class="gray">&nbsp;</td>
          <td class="gray" width="70">&nbsp;</td>
          <td class="gray" width="70">&nbsp;</td>
          <td class="gray" width="70">&nbsp;</td>
          <td class="gray" width="340">&nbsp;</td>
          <td class="gray" width="90" align="center">&nbsp;</td>
          <td class="gray" width="90" align="center">&nbsp;</td>
        </tr>
	<%}%>
    <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
        <tr align="right">
          <td colspan="9" bgcolor="#dddddd" class="gray" height="23">
          	<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b>�ѰǼ� <%= Util.comma(ds.getTotalcnt())%> ��</b>
          </td>
        </tr>
      </table>
      <!---button-->
      <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move">
        <tr>
          <td align="center" height="2">
            <!--����-->
          </td>
        </tr>
        <tr>
          <td align="center" height="24" bgcolor="#E8E8E8">
		    <!--JSP PAGE START---------------------------------------------------------------------------------->
		    <%
		        String pageno = request.getParameter("pageno");
		        String totalcnt = String.valueOf(ds.getTotalcnt());
		        String js_fn_nm = request.getParameter("js_fn_nm");
		    %>
		    <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
			    <jsp:param name = "pageno" 			value="<%=pageno%>"/>
			    <jsp:param name = "totalcnt" 		value="<%=totalcnt%>"/>
			    <jsp:param name = "js_fn_nm" 		value="<%=js_fn_nm%>"/>
			    <jsp:param name = "pagesize" 		value="<%=moveListCount%>"/>
			    <jsp:param name = "page_set_gubun" 	value="0"/>
		    </jsp:include>
		    <!--JSP PAGE END------------------------------------------------------------------------------------>
          </td>
        </tr>
      </table>
		<!--������Ȳ ��Ȳ��� list iframe end -->


<!-- ��� �˻��� �� ȭ�� �ʱ�ȭ�� ���� ���̺� ���� -->

<!--���� (����) ����Ʈ -->
<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail1">
<tr bgcolor="#D5DACD">
  <td colspan="11" align="center" class="gray"><b>���� (����)</b></td>
<tr>
<tr bgcolor="#dddddd" align="center">
  <td rowspan="2" class="gray"> �ѹ� </td>
  <td colspan="5" class="gray" width="375" align="center"> ��� </td>
  <td rowspan="2" class="gray" width="75"> ���� </td>
  <td rowspan="2" class="gray" width="75"> �渮 </td>
  <td rowspan="2" class="gray" width="75"> �ֹ� </td>
  <td rowspan="2" class="gray" width="75"> ��Ÿ </td>
  <td rowspan="2" class="gray"> �Ѱ� </td>
</tr>
<tr bgcolor="#dddddd"  align="center">
  <td class="gray" width="75"> ���� </td>
  <td class="gray" width="75"> �ֺ� </td>
  <td class="gray" width="75"> �˹� </td>
  <td class="gray" width="75"> ��Ÿ </td>
  <td class="gray" width="75"> �� </td>
</tr>
<tr align="right">
  <td class="gray" width="75">&nbsp;</td>
  <td class="gray" width="75">&nbsp;</td>
  <td class="gray" width="75">&nbsp;</td>
  <td class="gray" width="75">&nbsp;</td>
  <td class="gray" width="75">&nbsp;</td>
  <td class="gray" width="75">&nbsp;</td>
  <td class="gray" width="75">&nbsp;</td>
  <td class="gray" width="75">&nbsp;</td>
  <td class="gray" width="75">&nbsp;</td>
  <td class="gray" width="75">&nbsp;</td>
  <td class="gray">&nbsp;</td>
</tr>
</table>
<!--Ȯ��/���� ����Ʈ -->
<table width="830" border="0" cellspacing="0" cellpadding="1" bgcolor="#FFFFFF" class="gray" id="boinfo_detail2">
<tr bgcolor="#D5DACD">
  <td colspan="15" align="center" class="gray"><b>Ȯ��/����</b></td>
<tr>
<tr align="center">
  <td  rowspan="2" bgcolor="#dddddd" class="gray" width="55"> Ȯ��</td>
  <td class="gray" bgcolor="#dddddd" width="55" > ��û</td>
  <td class="gray" bgcolor="#dddddd" width="55"> ����</td>
  <td class="gray" bgcolor="#dddddd" width="55"> ���</td>
  <td class="gray" bgcolor="#dddddd" width="55"> ����</td>
  <td class="gray" bgcolor="#dddddd" width="55"> ����</td>
  <td class="gray" bgcolor="#dddddd" width="55"> ��</td>
  <td class="gray" bgcolor="#dddddd" width="55"> Ȯ����</td>
  <td  rowspan="2" bgcolor="#dddddd" class="gray" width="55"> ����</td>
  <td class="gray" bgcolor="#dddddd" width="55" > �̻�</td>
  <td class="gray" bgcolor="#dddddd" width="55" > ����</td>
  <td class="gray" bgcolor="#dddddd" width="55" > Ÿ������</td>
  <td class="gray" bgcolor="#dddddd" width="55" > ��Ÿ</td>
  <td class="gray" bgcolor="#dddddd" width="55" > ��</td>
  <td class="gray" bgcolor="#dddddd" width="55" > ������</td>
</tr>
<tr >
  <td class="gray" align="right" width="55">&nbsp;</td>
  <td class="gray" align="right" width="55">&nbsp;</td>
  <td class="gray" align="right" width="55">&nbsp;</td>
  <td class="gray" align="right" width="55">&nbsp;</td>
  <td class="gray" align="right" width="55">&nbsp;</td>
  <td class="gray" align="right" width="55">&nbsp;</td>
  <td class="gray" align="right" width="55">&nbsp;</td>
  <td class="gray" align="right" width="55" >&nbsp;</td>
  <td class="gray" align="right" width="55" >&nbsp;</td>
  <td class="gray" align="right" width="55" >&nbsp;</td>
  <td class="gray" align="right" width="55" >&nbsp;</td>
  <td class="gray" align="right" width="55" >&nbsp;</td>
  <td class="gray" align="right" width="55" >&nbsp;</td>
</tr>
</table>
<!--�μ� ����Ʈ -->
<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail3">
<tr bgcolor="#D5DACD">
  <td colspan="17" align="center" class="gray"><b>�μ�</b></td>
<tr>
<tr bgcolor="#dddddd" align="center">
  <td  rowspan="2" class="gray" width="70"> �߼ۺμ� </td>
  <td  rowspan="2" class="gray" width="70" bgcolor="#dddddd"> ������� </td>
  <td colspan="6" class="gray"> ������ </td>
  <td  rowspan="2" class="gray" width="70"> ȫ���� </td>
  <td  rowspan="2" class="gray" width="70"> ������ </td>
  <td  rowspan="2" class="gray" width="70"> ������ </td>
  <td colspan="6" class="gray"> �⿵�� </td>
</tr>
<tr bgcolor="#dddddd" align="center">
  <td class="gray" width="40"> 1�ļ� </td>
  <td class="gray" width="40"> 2�ļ� </td>
  <td class="gray" width="40"> 3�ļ� </td>
  <td class="gray" width="40"> 4�ļ� </td>
  <td class="gray" width="40"> 5�ļ�+ </td>
  <td class="gray" width="40"> �� </td>
  <td class="gray" width="40"> ������ </td>
  <td class="gray" width="40"> �ҳ� </td>
  <td class="gray" width="40"> �Ѱ� </td>
  <td class="gray" width="40"> �췲�� </td>
  <td class="gray" width="40"> ��Ÿ </td>
  <td class="gray" width="40"> �� </td>
</tr>
<tr align="right">
  <td class="gray" width="70" >&nbsp;</td>
  <td class="gray" width="70" >&nbsp;</td>
  <td class="gray" width="40">&nbsp;</td>
  <td class="gray" width="40">&nbsp;</td>
  <td class="gray" width="40">&nbsp;</td>
  <td class="gray" width="40">&nbsp;</td>
  <td class="gray" width="40">&nbsp;</td>
  <td class="gray" width="40">&nbsp; </td>
  <td class="gray" width="70" >&nbsp;</td>
  <td class="gray" width="70" >&nbsp;</td>
  <td class="gray" width="70" >&nbsp;</td>
  <td class="gray" width="40">&nbsp;</td>
  <td class="gray" width="40">&nbsp;</td>
  <td class="gray" width="40">&nbsp;</td>
  <td class="gray" width="40">&nbsp;</td>
  <td class="gray" width="40">&nbsp;</td>
  <td class="gray" width="40">&nbsp;</td>
</tr>
</table>
<!--���帮��Ʈ -->
<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail4">
<tr bgcolor="#D5DACD">
  <td colspan="12" align="center" class="gray"><b>����</b></td>
<tr>
<tr align="center">
  <td  colspan="3" class="gray" bgcolor="#dddddd"> �����μ� </td>
  <td colspan="3" class="gray" bgcolor="#dddddd"> ����μ� </td>
  <td colspan="3" class="gray" bgcolor="#dddddd"> ����μ�(�������) </td>
  <td colspan="3" class="gray" bgcolor="#dddddd"> ����μ�(������) </td>
</tr>
<tr align="center">
  <td class="gray" width="69" bgcolor="#dddddd" > ������� </td>
  <td class="gray" width="69" bgcolor="#dddddd" > ������ </td>
  <td class="gray" width="69" bgcolor="#dddddd" > �� </td>
  <td class="gray" width="69" bgcolor="#dddddd"> ������� </td>
  <td class="gray" width="69" bgcolor="#dddddd"> ������ </td>
  <td class="gray" width="69" bgcolor="#dddddd"> �� </td>
  <td class="gray" width="69" bgcolor="#dddddd"> ������� </td>
  <td class="gray" width="69" bgcolor="#dddddd"> ������ </td>
  <td class="gray" width="69" bgcolor="#dddddd"> �� </td>
  <td class="gray" width="69" bgcolor="#dddddd"> ������� </td>
  <td class="gray" width="69" bgcolor="#dddddd"> ������ </td>
  <td class="gray" width="69" bgcolor="#dddddd"> �� </td>
</tr>
<tr align="right">
  <td class="gray" width="69" >&nbsp;</td>
  <td class="gray" width="69" >&nbsp;</td>
  <td class="gray" width="69" >&nbsp;</td>
  <td class="gray" width="69" >&nbsp;</td>
  <td class="gray" width="69" >&nbsp;</td>
  <td class="gray" width="69" >&nbsp;</td>
  <td class="gray" width="69" >&nbsp;</td>
  <td class="gray" width="69" >&nbsp;</td>
  <td class="gray" width="69" >&nbsp;</td>
  <td class="gray" width="69" >&nbsp;</td>
  <td class="gray" width="69" >&nbsp;</td>
  <td class="gray" width="69" >&nbsp;</td>
</tr>
</table>
<!--��������Ʈ -->
<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail5">

<tr bgcolor="#D5DACD">
  <td colspan="11" align="center" class="gray"><b>����</b></td>
<tr>
<tr bgcolor="#dddddd" align="center">
  <td rowspan="2" class="gray" width="80" bgcolor="#dddddd"> ��ǥ�� </td>
  <td colspan="5" class="gray"> �Ѽ��ݾ� </td>
  <td  rowspan="2" class="gray" width="80"> �������ݾ� </td>
  <td rowspan="2" class="gray" width="80"> ������� </td>
  <td  rowspan="2" class="gray" width="80"> �������� </td>
  <td  rowspan="2" class="gray" width="80"> ����IS���� </td>
  <td rowspan="2" class="gray" width="80"> ���ܼ��ݾ� </td>
</tr>
<tr align="center">
  <td bgcolor="#dddddd" class="gray" width="69"> ���μ��� </td>
  <td  bgcolor="#dddddd" class="gray" width="69"> �湮���� </td>
  <td bgcolor="#dddddd" class="gray" width="69"> �ڵ���ü </td>
  <td bgcolor="#dddddd" class="gray" width="69"> ��Ÿ </td>
  <td bgcolor="#dddddd" class="gray" width="69"> �Ұ� </td>
</tr>
<tr align="right">
  <td class="gray" width="80">&nbsp;</td>
  <td class="gray" width="69">&nbsp;</td>
  <td class="gray" width="69">&nbsp;</td>
  <td class="gray" width="69">&nbsp;</td>
  <td class="gray" width="69">&nbsp;</td>
  <td class="gray" width="69">&nbsp;</td>
  <td class="gray" width="80">&nbsp;</td>
  <td class="gray" width="80">&nbsp;</td>
  <td class="gray" width="80">&nbsp;</td>
  <td class="gray" width="80">&nbsp;</td>
  <td class="gray" width="80">&nbsp;</td>
</tr>
</table>
<!--���븮��Ʈ -->
<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail6">
<tr bgcolor="#D5DACD">
  <td colspan="5" align="center" class="gray"><b>����</b></td>
<tr>
<tr bgcolor="#dddddd" align="center">
  <td class="gray" width="166" > ���� </td>
  <td class="gray" width="166" > �ҳ� </td>
  <td class="gray" width="166" > �ְ� </td>
  <td class="gray" width="166" > ������ </td>
  <td class="gray" width="166" > �� </td>
</tr>
<tr align="right">
  <td class="gray" width="166" >&nbsp;</td>
  <td class="gray" width="166" >&nbsp;</td>
  <td class="gray" width="166" >&nbsp;</td>
  <td class="gray" width="166" >&nbsp;</td>
  <td class="gray" width="166" >&nbsp;</td>
</tr>
</table>
<!-- ��� �˻��� �� ȭ�� �ʱ�ȭ�� ���� ���̺� �� -->
<script>
    parent.document.all.boinfo_list_id.outerHTML = boinfo_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;
<%--
    // ��ȭ�� ��� �ʱ�ȭ
    parent.document.boinfo_detail_form.basi_yymm.value='<%= Util.getYyyyMm()%>';
--%>
    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();

    // ��ȭ�� �ʱ�ȭ
	parent.document.all.boinfo_detail_bonm_id.innerHTML	= '&nbsp;';

    parent.document.all.boinfo_detail1.outerHTML = boinfo_detail1.outerHTML;
    parent.document.all.boinfo_detail2.outerHTML = boinfo_detail2.outerHTML;
    parent.document.all.boinfo_detail3.outerHTML = boinfo_detail3.outerHTML;
    parent.document.all.boinfo_detail4.outerHTML = boinfo_detail4.outerHTML;
    parent.document.all.boinfo_detail5.outerHTML = boinfo_detail5.outerHTML;
    parent.document.all.boinfo_detail6.outerHTML = boinfo_detail6.outerHTML;

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>
</script>
