<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brinfo_1120_s.jsp
* ��� : ����Info-������Ȳ ��ȭ��
* �ۼ����� : 2004-02-23
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_BOINFODataSet ds = (SS_S_BOINFODataSet)request.getAttribute("ds");

	// �����ȯ��ó��(���� �����ϸ� ()�� �ѷ��ΰ� ������ ()�� �����Ѵ�.
	String oprenvclsfnm = "";
	if(!"".equals(ds.getOprenvclsfnm())){
		oprenvclsfnm = "("+	ds.getOprenvclsfnm() + ")";
	}

	// �ش� ���������ڵ��	request�κ��� ��´�.
	String bocd = request.getParameter("bocd");
%>
      <!--���� (����) ����Ʈ -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail1">

		<%
		for(int i=0; i<ds.curcommlist1.size(); i++){
			SS_S_BOINFOCURCOMMLIST1Record curcommlist1Rec = (SS_S_BOINFOCURCOMMLIST1Record)ds.curcommlist1.get(i);
		%>
	    <tr bgcolor="#D5DACD">
          <td colspan="11" align="center" class="gray"><b>���� (����)</b></td>
        <tr>
        <tr bgcolor="#dddddd" align="center">
          <td rowspan="2" class="gray" width="75"> �ѹ� </td>
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
          <td class="gray" width="75">&nbsp;<%= curcommlist1Rec.dutycd20%></td>
          <td class="gray" width="75">&nbsp;<%= curcommlist1Rec.dutycd50%></td>
          <td class="gray" width="75">&nbsp;<%= curcommlist1Rec.dutycd60%></td>
          <td class="gray" width="75">&nbsp;<%= curcommlist1Rec.dutycd70%></td>
          <td class="gray" width="75">&nbsp;<%= curcommlist1Rec.dutycd80%></td>
          <td class="gray" width="75">&nbsp;<%= curcommlist1Rec.total1%></td>
          <td class="gray" width="75">&nbsp;<%= curcommlist1Rec.dutycd40%></td>
          <td class="gray" width="75">&nbsp;<%= curcommlist1Rec.dutycd100%></td>
          <td class="gray" width="75">&nbsp;<%= curcommlist1Rec.dutycd110%></td>
          <td class="gray" width="75">&nbsp;<%= curcommlist1Rec.dutycd120%></td>
          <td class="gray">&nbsp;<%= curcommlist1Rec.total2%></td>
        </tr>
      <%}%>
      </table>

      <!--Ȯ��/���� ����Ʈ -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" bgcolor="#FFFFFF" class="gray" id="boinfo_detail2">
		<%
		for(int i=0; i<ds.curcommlist2.size(); i++){
			SS_S_BOINFOCURCOMMLIST2Record curcommlist2Rec = (SS_S_BOINFOCURCOMMLIST2Record)ds.curcommlist2.get(i);
		%>
	    <tr bgcolor="#D5DACD">
          <td colspan="15" align="center" class="gray"><b>Ȯ��/���� (<%= Util.convertMonthS(ds.getBasi_yymm())%>)</b></td>
        <tr>
        <tr align="center">
          <td  rowspan="2" bgcolor="#dddddd" class="gray" width="55"> Ȯ��</td>
          <td class="gray" bgcolor="#dddddd" width="55"> ��û</td>
          <td class="gray" bgcolor="#dddddd" width="55"> ����</td>
          <td class="gray" bgcolor="#dddddd" width="55"> ���</td>
          <td class="gray" bgcolor="#dddddd" width="55"> ����</td>
          <td class="gray" bgcolor="#dddddd" width="55"> ����</td>
          <td class="gray" bgcolor="#dddddd" width="55"> ��</td>
          <td class="gray" bgcolor="#dddddd" width="55"> Ȯ����</td>
          <td  rowspan="2" bgcolor="#dddddd" class="gray" width="55"> ����</td>
          <td class="gray" bgcolor="#dddddd" width="55"> �̻�</td>
          <td class="gray" bgcolor="#dddddd" width="55"> ����</td>
          <td class="gray" bgcolor="#dddddd" width="55"> Ÿ������</td>
          <td class="gray" bgcolor="#dddddd" width="55"> ��Ÿ</td>
          <td class="gray" bgcolor="#dddddd" width="55"> ��</td>
          <td class="gray" bgcolor="#dddddd" width="55"> ������</td>
        </tr>
        <tr >
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_rdr_extnaplc%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_rdr_extnemp%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_rdr_extnstaf%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_rdr_extnrdr_movm%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_rdr_extnhdqt%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_rdr_extn_tot%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_rdr_extnrate%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_suspmovm%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_susprefu%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_suspothnwsp%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_suspetc%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_susp_tot%></td>
          <td class="gray" align="right" width="55">&nbsp;<%= curcommlist2Rec.d_susprate%></td>
        </tr>
      </table>

      <!--�μ� ����Ʈ -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail3">
	    <tr bgcolor="#D5DACD">
          <td colspan="17" align="center" class="gray"><b>�μ� (<%= Util.convertMonthS(Util.addMonth(ds.getBasi_yymm()+"01",1).substring(0,6))%>)</b></td>
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
          <td class="gray" width="70" >&nbsp;<%= curcommlist2Rec.d_hmmsendqty%></td>
          <td class="gray" width="70" >&nbsp;<%= curcommlist2Rec.d_hmmvalqty%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_ftcnt1%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_ftcnt2%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_ftcnt3%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_ftcnt4%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_excsaftcnt6%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_aftcnt_tot%></td>
          <td class="gray" width="70">&nbsp;<%= curcommlist2Rec.d_pub_infonwsp%></td>
          <td class="gray" width="70">&nbsp;<%= curcommlist2Rec.d_dntnwsp%></td>
          <td class="gray" width="70">&nbsp;<%= curcommlist2Rec.d_resvnwsp%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_hmmsendqty1%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_hmmsendqty2%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_hmmsendqty3%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_hmmsendqty4%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_hmmsendqty5%></td>
          <td class="gray" width="40">&nbsp;<%= curcommlist2Rec.d_hmmsendqty_etc_tot%></td>
        </tr>
      </table>

      <!--���帮��Ʈ -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail4">
	    <tr bgcolor="#D5DACD">
          <td colspan="12" align="center" class="gray"><b>���� (<%= Util.convertMonthS(ds.getBasi_yymm())%>)</b></td>
        <tr>
        <tr align="center">
          <td colspan="3" class="gray" bgcolor="#dddddd"> �����μ� </td>
          <td colspan="3" class="gray" bgcolor="#dddddd"> ����μ� </td>
          <td colspan="3" class="gray" bgcolor="#dddddd"> ����μ�(�������) </td>
          <td colspan="3" class="gray" bgcolor="#dddddd"> ����μ�(������) </td>
        </tr>
        <tr align="center">
          <td class="gray" width="69" bgcolor="#dddddd"> ������� </td>
          <td class="gray" width="69" bgcolor="#dddddd"> ������ </td>
          <td class="gray" width="69" bgcolor="#dddddd"> �� </td>
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
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.pm_hmmvalqtyb)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.pm_aftcnt_totb)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.pm_val_totb)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_hmmvalqtyb)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_aftcnt_totb)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_val_totb)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.dpm_hmmvalqtyb)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.dpm_aftcnt_totb)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.dpm_val_totb)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.dpy_hmmvalqtyb)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.dpy_aftcnt_totb)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.dpy_val_totb)%></td>
        </tr>
      </table>

      <!--��������Ʈ -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail5">

        <tr bgcolor="#D5DACD">
          <td colspan="11" align="center" class="gray"><b>���� (<%= Util.convertMonthS(ds.getBasi_yymm())%>)</b></td>
        <tr>
        <tr bgcolor="#dddddd" align="center">
          <td rowspan="2" class="gray" width="80" bgcolor="#dddddd"> ��ǥ�� </td>
          <td colspan="5" class="gray"> �Ѽ��ݾ� </td>
          <td rowspan="2" class="gray" width="80"> �������ݾ� </td>
          <td rowspan="2" class="gray" width="80"> ������� </td>
          <td rowspan="2" class="gray" width="80"> �������� </td>
          <td rowspan="2" class="gray" width="80"> ����IS���� </td>
          <td rowspan="2" class="gray" width="80"> ���ܼ��ݾ� </td>
        </tr>
        <tr align="center">
          <td bgcolor="#dddddd" class="gray" width="69"> ���μ��� </td>
          <td bgcolor="#dddddd" class="gray" width="69"> �湮���� </td>
          <td bgcolor="#dddddd" class="gray" width="69"> �ڵ���ü </td>
          <td bgcolor="#dddddd" class="gray" width="69"> ��Ÿ </td>
          <td bgcolor="#dddddd" class="gray" width="69"> �Ұ� </td>
        </tr>
        <tr align="right">
          <td class="gray" width="80" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_meda_amt)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_giroclamt)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_vistclamt)%></td>
          <%--  �ڵ���ü(�����ڵ���ü)--%>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_giroauto_shiftclamt)%></td>
          <%-- ��Ÿ(����ī����ü���ݾ�,�Ϲ�ī����ü���ݾ�,�¶��ΰ������ݾ�,��Ÿ���ݾ�) --%>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_etcclamt+curcommlist2Rec.d_docard_shiftclamt+curcommlist2Rec.d_gnrcard_shiftclamt+curcommlist2Rec.d_onlsetlclamt)%></td>
          <td class="gray" width="69" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_clamt_tot)%></td>
          <td class="gray" width="80" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.pm_clamt_tot)%></td>
          <td class="gray" width="80" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.dpm_clamt_tot)%></td>
          <td class="gray" width="80" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_arealeafclamt)%></td>
          <td class="gray" width="80" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_teampreisleafclamt)%></td>
          <td class="gray" width="80" align="right">&nbsp;<%= Util.comma(curcommlist2Rec.d_leafclamt)%></td>
        </tr>
      <%}%>
      </table>
      <!--���븮��Ʈ -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail6">
		<%
		for(int i=0; i<ds.curcommlist3.size(); i++){
			SS_S_BOINFOCURCOMMLIST3Record curcommlist3Rec = (SS_S_BOINFOCURCOMMLIST3Record)ds.curcommlist3.get(i);
		%>
	    <tr bgcolor="#D5DACD">
          <td colspan="5" align="center" class="gray"><b>���� (<%= Util.convertMonthS(ds.getJd_yymm())%>)</b></td>
        <tr>
        <tr bgcolor="#dddddd" align="center">
          <td class="gray" width="166"> ���� </td>
          <td class="gray" width="166"> �ҳ� </td>
          <td class="gray" width="166"> �ְ� </td>
          <td class="gray" width="166"> ������ </td>
          <td class="gray" width="166"> �� </td>
        </tr>
        <tr align="right">
          <td class="gray" width="166"><%= Util.comma(curcommlist3Rec.cho_amt)%>&nbsp;</td>
          <td class="gray" width="166"><%= Util.comma(curcommlist3Rec.boy_amt)%>&nbsp;</td>
          <td class="gray" width="166"><%= Util.comma(curcommlist3Rec.wee_amt)%>&nbsp;</td>
          <td class="gray" width="166"><%= Util.comma(curcommlist3Rec.sch_amt)%>&nbsp;</td>
          <td class="gray" width="166"><%= Util.comma(curcommlist3Rec.tot_amt)%>&nbsp;</td>
        </tr>
      <%}%>
      </form>
      </table>

<script>
	// �˻� ���س�� ����
	parent.boinfo_detail_form.basi_yymm.value = '<%= ds.getBasi_yymm()%>';
	// ������ ����
	parent.document.all.boinfo_detail_bonm_id.innerHTML	= '- <%= ds.getBonm()%> <%= oprenvclsfnm%>';
	// �׸� �� ����
    parent.document.all.boinfo_detail1.outerHTML = boinfo_detail1.outerHTML;
    parent.document.all.boinfo_detail2.outerHTML = boinfo_detail2.outerHTML;
    parent.document.all.boinfo_detail3.outerHTML = boinfo_detail3.outerHTML;
    parent.document.all.boinfo_detail4.outerHTML = boinfo_detail4.outerHTML;
    parent.document.all.boinfo_detail5.outerHTML = boinfo_detail5.outerHTML;
    parent.document.all.boinfo_detail6.outerHTML = boinfo_detail6.outerHTML;
	// �Է��׸� ó��
	parent.jsInit();
</script>
