<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1035_l.jsp
* ��� : ������Ȳ-��������-�����̷� �����̷� ���
* �ۼ����� : 2003-12-30
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_CLAM_HSTYDataSet ds = (SS_L_CLAM_HSTYDataSet)request.getAttribute("ds");
    int clamHstyListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    String prevyymm = ds.getPrevyymm();	// �������(6�ڸ�)
	String frYYMM8 = Util.addDate(prevyymm+"01", Calendar.MONTH, -5);	// 6���� ���� ���(8�ڸ�)
	String toYYMM8 = Util.addDate(prevyymm+"01", Calendar.MONTH, 4);	// 3���� ���� ���
	String frYYMM = Util.checkString(frYYMM8).substring(0,6);			// 6���� ���� ���(8�ڸ�)
	String toYYMM = Util.checkString(toYYMM8).substring(0,6);			// 3���� ���� ���
%>
<table width="100%" border="0" cellspacing="0" cellpadding="1" bgcolor="#FFFFFF" class="gray" id="hsty_list_id">

	<tr bgcolor="#dddddd" align="center">
		<td width="100" height="23" class="gray" align="center"> ����</td>
		<td width="150" height="23" class="gray" align="center"> �Ա�����</td>
		<td width="100" height="23" class="gray" align="center"> �ݾ�</td>
		<td width="100" height="23" class="gray" align="center"> �Ա�</td>
		<td width="100" height="23" class="gray" align="center"> �Աݱ���</td>
	</tr>

	<!--�����̷� ��� ����-->
	<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_CLAM_HSTYRSLTCURRecord rsltcurRec = (SS_L_CLAM_HSTYRSLTCURRecord)ds.rsltcur.get(i);
    %>
	<tr>
		<td width="100" class="gray" align="center"> <%= Util.convertMonthS(rsltcurRec.subsmappli)%>&nbsp;</td>
		<td width="150" class="gray" align="center"> <%= Util.convertS(rsltcurRec.recpdt)%>&nbsp;</td>
		<td width="100" class="gray" align="right"> <%= Util.comma(rsltcurRec.clamamt)%>&nbsp;</td>
		<td width="100" class="gray" align="right"> <%= Util.comma(rsltcurRec.clamt)%>&nbsp;</td>
		<td width="100" class="gray" align="center"> <%= rsltcurRec.rcpmclsfnm%>&nbsp;</td>
	</tr>
	<%}%>
	<!--�����̷� ��� ��-->

    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
	<%for(int j=0; j<clamHstyListCount - ds.rsltcur.size(); j++){%>
	<tr>
		<td width="100" class="gray"> &nbsp;</td>
		<td width="150" class="gray"> &nbsp;</td>
		<td width="100" class="gray"> &nbsp;</td>
		<td width="100" class="gray"> &nbsp;</td>
		<td width="100" class="gray"> &nbsp;</td>
	</tr>
	<%}%>
</table>

<!-- ������ �̵� -->
<!-- �Ϲ� ������ �̵��� �ƴ϶� ����, ���� �� ��ư���� ���ؿ��� �̵��ϸ鼭 �����̷� ����� �����ش�. -->
<table width="100%" border="0" cellspacing="0" cellpadding="0"  class="title2" align="center" id="page_move_hsty">
  <tr>
    <td align="center" height="25" bgcolor="#E8E8E8">
		<img src="/html/comm_img/bu_ar02.gif" height="19" border="0" align="absmiddle" style="cursor:hand" onclick="javascript:clam_hsty_search('prev')">
		[<%= Util.convertMonthS(frYYMM)%>] - [<%= Util.convertMonthS(toYYMM)%>] ����
		<img src="/html/comm_img/bu_ar01.gif" height="19" border="0" align="absmiddle" style="cursor:hand" onclick="javascript:clam_hsty_search('next')">
	</td>
  </tr>
</table>
<!-- ������ �̵� -->

<script language="javascript">
	parent.document.all.hsty_list_id.outerHTML = hsty_list_id.outerHTML;
  	parent.document.all.page_move_hsty.outerHTML = page_move_hsty.outerHTML;
	// ���س��, ����, ���� ��� ����
	parent.document.hsty_search_form.basiyymm.value = <%= ds.getCurryymm()%>;
	parent.document.hsty_search_form.prevyymm.value = <%= ds.getPrevyymm()%>;
	parent.document.hsty_search_form.nextyymm.value = <%= ds.getNextyymm()%>;
	
    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();
    
<%if(ds.rsltcur.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%></script>