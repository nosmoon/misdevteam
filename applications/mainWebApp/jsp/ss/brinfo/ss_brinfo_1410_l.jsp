<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brinfo_1410_l.jsp
* ��� : ����Info-������ǰ��Ȳ-��Ȳ-��ȸ
* �ۼ����� : 2004-01-31
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
	SS_L_ASETDataSet ds = (SS_L_ASETDataSet)request.getAttribute("ds");
    int moveListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��

    String[] cicdnm = new String[10];
    int k = (int)ds.getCdcnt(); //��ȿ�ڵ� ���� ���� �ִ� 10
	int sum1 = 0; // �Ұ踦 ���� ����
	int sum2 = 0; // �Ұ踦 ���� ����
	int sum3 = 0; // �Ұ踦 ���� ����
	int sum4 = 0; // �Ұ踦 ���� ����
	int sum5 = 0; // �Ұ踦 ���� ����
	int sum6 = 0; // �Ұ踦 ���� ����
	int sum7 = 0; // �Ұ踦 ���� ����
	int sum8 = 0; // �Ұ踦 ���� ����
	int sum9 = 0; // �Ұ踦 ���� ����
	int sum10 = 0; // �Ұ踦 ���� ����

	int sum_total = 0; // �հ� �Ұ�

    //������ǰ��Ȳ ��ȿ�ڵ��̸� �����ϱ�
	for(int h=0; h<ds.asetclascd.size(); h++){
		SS_L_ASETASETCLASCDRecord asetclascdRec = (SS_L_ASETASETCLASCDRecord)ds.asetclascd.get(h);
		cicdnm[h] = asetclascdRec.cicdnm;
	}

%>

      <!--������ǰ��Ȳ ��Ȳ��� list iframe-->
<table border="0" cellspacing="0" align="center" id="aset_list_id">
<tr><td>
<table width="830" border="0" cellspacing="0" align="center" class="gray" bgcolor="#FFFFFF">
  <tr bgcolor="#dddddd" align="center" height="23">
    <td width="59" class="gray"> ��&nbsp; </td>
    <td width="59" class="gray"> ���� </td>
    <td width="59" class="gray"> ���� </td>
	<%
	for(int j=0; j<k; j++){
	%>
		<td width="70" class="gray"><%= cicdnm[j]%></td>
	<%}%>
    <td width="59" class="gray"> �� </td>
  </tr>
	<%-- ������ǰ��Ȳ ��Ȳ ����Ʈ ���� ���� �κ�--%>
	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_ASETCURCOMMLISTRecord curcommlistRec = (SS_L_ASETCURCOMMLISTRecord)ds.curcommlist.get(i);
		sum_total = sum_total + curcommlistRec.total;
	%>

		  <tr>
			    <td width="59" class="gray"> &nbsp;<%= curcommlistRec.boknm%> </td>
			    <td width="59" class="gray"> &nbsp;<%= curcommlistRec.areanm%> </td>
			    <td width="59" class="gray"> &nbsp;<%= curcommlistRec.bonm%> </td>
			<%
				if(k==0){
			%>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd1%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;</td>
			<%
				}else if (k==1){
					sum1 = sum1 + curcommlistRec.cnt1;
			%>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd1%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt1)%></td>
			<%
				}else if (k==2){
					sum1 = sum1 + curcommlistRec.cnt1;
					sum2 = sum2 + curcommlistRec.cnt2;
			%>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd1%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt1)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd2%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt2)%></td>
			<%
				}else if (k==3){
					sum1 = sum1 + curcommlistRec.cnt1;
					sum2 = sum2 + curcommlistRec.cnt2;
					sum3 = sum3 + curcommlistRec.cnt3;
			%>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd1%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt1)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd2%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt2)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd3%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt3)%></td>
			<%
				}else if (k==4){
					sum1 = sum1 + curcommlistRec.cnt1;
					sum2 = sum2 + curcommlistRec.cnt2;
					sum3 = sum3 + curcommlistRec.cnt3;
					sum4 = sum4 + curcommlistRec.cnt4;
			%>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd1%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt1)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd2%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt2)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd3%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt3)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd4%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt4)%></td>
			<%
				}else if (k==5){
					sum1 = sum1 + curcommlistRec.cnt1;
					sum2 = sum2 + curcommlistRec.cnt2;
					sum3 = sum3 + curcommlistRec.cnt3;
					sum4 = sum4 + curcommlistRec.cnt4;
					sum5 = sum5 + curcommlistRec.cnt5;
			%>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd1%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt1)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd2%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt2)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd3%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt3)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd4%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt4)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd5%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt5)%></td>
			<%
				}else if (k==6){
					sum1 = sum1 + curcommlistRec.cnt1;
					sum2 = sum2 + curcommlistRec.cnt2;
					sum3 = sum3 + curcommlistRec.cnt3;
					sum4 = sum4 + curcommlistRec.cnt4;
					sum5 = sum5 + curcommlistRec.cnt5;
					sum6 = sum6 + curcommlistRec.cnt6;
			%>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd1%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt1)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd2%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt2)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd3%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt3)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd4%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt4)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd5%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt5)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd6%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt6)%></td>
			<%
				}else if (k==7){
					sum1 = sum1 + curcommlistRec.cnt1;
					sum2 = sum2 + curcommlistRec.cnt2;
					sum3 = sum3 + curcommlistRec.cnt3;
					sum4 = sum4 + curcommlistRec.cnt4;
					sum5 = sum5 + curcommlistRec.cnt5;
					sum6 = sum6 + curcommlistRec.cnt6;
					sum7 = sum7 + curcommlistRec.cnt7;
			%>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd1%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt1)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd2%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt2)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd3%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt3)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd4%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt4)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd5%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt5)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd6%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt6)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd7%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt7)%></td>
			<%
				}else if (k==8){
					sum1 = sum1 + curcommlistRec.cnt1;
					sum2 = sum2 + curcommlistRec.cnt2;
					sum3 = sum3 + curcommlistRec.cnt3;
					sum4 = sum4 + curcommlistRec.cnt4;
					sum5 = sum5 + curcommlistRec.cnt5;
					sum6 = sum6 + curcommlistRec.cnt6;
					sum7 = sum7 + curcommlistRec.cnt7;
					sum8 = sum8 + curcommlistRec.cnt8;
			%>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd1%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt1)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd2%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt2)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd3%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt3)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd4%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt4)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd5%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt5)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd6%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt6)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd7%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt7)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd8%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt8)%></td>
			<%
				}else if (k==9){
					sum1 = sum1 + curcommlistRec.cnt1;
					sum2 = sum2 + curcommlistRec.cnt2;
					sum3 = sum3 + curcommlistRec.cnt3;
					sum4 = sum4 + curcommlistRec.cnt4;
					sum5 = sum5 + curcommlistRec.cnt5;
					sum6 = sum6 + curcommlistRec.cnt6;
					sum7 = sum7 + curcommlistRec.cnt7;
					sum8 = sum8 + curcommlistRec.cnt8;
					sum9 = sum9 + curcommlistRec.cnt9;
			%>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd1%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt1)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd2%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt2)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd3%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt3)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd4%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt4)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd5%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt5)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd6%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt6)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd7%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt7)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd8%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt8)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd9%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt9)%></td>
			<%
				}else if (k==10){
					sum1 = sum1 + curcommlistRec.cnt1;
					sum2 = sum2 + curcommlistRec.cnt2;
					sum3 = sum3 + curcommlistRec.cnt3;
					sum4 = sum4 + curcommlistRec.cnt4;
					sum5 = sum5 + curcommlistRec.cnt5;
					sum6 = sum6 + curcommlistRec.cnt6;
					sum7 = sum7 + curcommlistRec.cnt7;
					sum8 = sum8 + curcommlistRec.cnt8;
					sum9 = sum9 + curcommlistRec.cnt9;
					sum10 = sum10 + curcommlistRec.cnt10;
			%>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd1%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt1)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd2%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt2)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd3%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt3)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd4%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt4)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd5%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt5)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd6%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt6)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd7%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt7)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd8%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt8)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd9%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt9)%></td>
		    	<td width="70" class="gray" align="right" style="cursor:hand" onclick="go_aset_detail('<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.areanm%>','<%= curcommlistRec.bocd%>','<%= curcommlistRec.bonm%>','<%= curcommlistRec.cd10%>');" onmouseover="this.style.backgroundColor='#CCCCBB'" onmouseout="this.style.backgroundColor='#FFFFFF'"> &nbsp;<%= Util.comma(curcommlistRec.cnt10)%></td>
			<%
				}
			%>
			<td width="59" class="gray" align="right"> &nbsp;<%= curcommlistRec.total%> </td>
		  </tr>
    <%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
    <%for(int i=0; i<(moveListCount-ds.curcommlist.size()); i++){%>

  <tr>
			    <td width="59" class="gray"> &nbsp;</td>
			    <td width="59" class="gray"> &nbsp;</td>
			    <td width="59" class="gray"> &nbsp;</td>
	<%
		for(int c=0; c<k; c++){
	%>
    	<td width="70" class="gray" align="right"> &nbsp; </td>
	<%	}%>

    <td width="59" class="gray" align="right"> &nbsp; </td>
  </tr>
	<%}%>
  <tr bgcolor="#dddddd">
    <td  colspan="3" class="gray" align="center"> &nbsp;�Ұ� </td>

			<%
				if(k==0){
			%>
		    	<td width="70" class="gray" align="right"> &nbsp;</td>
			<%
				}else if (k==1){
			%>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum1)%></td>
			<%
				}else if (k==2){
			%>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum1)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum1)%></td>
			<%
				}else if (k==3){
			%>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum1)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum2)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum3)%></td>
			<%
				}else if (k==4){
			%>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum1)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum2)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum3)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum4)%></td>
			<%
				}else if (k==5){
			%>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum1)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum2)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum3)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum4)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum5)%></td>
			<%
				}else if (k==6){
			%>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum1)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum2)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum3)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum4)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum5)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum6)%></td>
			<%
				}else if (k==7){
			%>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum1)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum2)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum3)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum4)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum5)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum6)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum7)%></td>
			<%
				}else if (k==8){
			%>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum1)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum2)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum3)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum4)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum5)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum6)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum7)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum8)%></td>
			<%
				}else if (k==9){
			%>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum1)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum2)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum3)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum4)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum5)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum6)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum7)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum8)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum9)%></td>
			<%
				}else if (k==10){
			%>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum1)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum2)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum3)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum4)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum5)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum6)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum7)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum8)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum9)%></td>
		    	<td width="70" class="gray" align="right"> &nbsp;<%= Util.comma(sum10)%></td>
			<%
				}
			%>

    <td width="59" class="gray" align="right"> <%= sum_total%> </td>
  </tr>
    <%-- ������ǰ��Ȳ ��Ȳ ��� �ݺ� �� --%>
  <tr bgcolor="#dddddd" align="right">
    <td  colspan="14" height="23" class="gray">
    	<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b>�ѰǼ� <%= Util.comma(ds.getTotalcnt())%> ��</b>
	</td>
  </tr>
</table>
<!---button-->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
  <tr>
    <td align="center" height="2" colspan="10">
      <!--����-->
    </td>
  </tr>
    <tr>
        <td align="center" height="24" bgcolor="#E8E8E8" colspan="<%=4+ds.asetclascd.size()%>">
	    <!--JSP PAGE START---------------------------------------------------------------------------------->
	    <%
	        String pageno = request.getParameter("pageno");
	        String totalcnt = String.valueOf(ds.getTotalcnt());
	        String js_fn_nm = request.getParameter("js_fn_nm");
	    %>
        <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
	    <jsp:param name = "pageno" 			value="<%=pageno%>"/>
	    <jsp:param name = "totalcnt" 		value="<%=ds.getTotalcnt()%>"/>
	    <jsp:param name = "js_fn_nm" 		value="<%=js_fn_nm%>"/>
	    <jsp:param name = "pagesize" 		value="<%=moveListCount%>"/>
	    <jsp:param name = "page_set_gubun" 	value="0"/>
	    </jsp:include>
	    <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
</td></tr>
</table>
		<!--������ǰ��Ȳ ��Ȳ��� list iframe end -->

<script>
    parent.document.all.aset_list_id.outerHTML = aset_list_id.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>
</script>
