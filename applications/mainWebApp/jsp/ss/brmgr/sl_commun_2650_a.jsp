<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/sl_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_commun_2650_a.jsp
* ��� 	 	 : �Ǹ�����-��Ž� ����Ʈ���� ��Ȳ���� �� ��� �ʱ�ȭ��
* �ۼ����� 	 : 2004-02-24
* �ۼ��� 	 : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 :
* ������ 	 :
* �������� 	 :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<% 
	// dataset �ν��Ͻ� ����κ�
    SL_A_COMM_APT_THRWDataSet ds = (SL_A_COMM_APT_THRWDataSet)request.getAttribute("ds");  // request dataset

	String acc_flg = request.getParameter("accflag");
	String hmflag = request.getParameter("hmflag");
	
%>

<!--���Ը�ü�� ��Ȳ-->
<table id="medi_thrw_id" width="100%" border="0" cellspacing="0"  align="center" cellpadding="2" class="gray">
<form name="medi_thrw_form" method="post" action="" >     
    <%
        for(int i=0; i<ds.medicur.size(); i++){
            SL_A_COMM_APT_THRWMEDICURRecord rsltcurRec = (SL_A_COMM_APT_THRWMEDICURRecord)ds.medicur.get(i);
	%>
  <tr>                       
    <input type=hidden name=medicd	 		value="<%=rsltcurRec.medicd%>">  
    <input type=hidden name=qty     	 	value="<%=rsltcurRec.qty%>">              
	<input type=hidden name=qtyratio 		value="<%=rsltcurRec.qtyratio%>">  
    <td class="gray" bgcolor="#dddddd" align="center" width="120"><%=rsltcurRec.medicd%>:::: <%=rsltcurRec.medinm%> </td>
    <td  class="gray" align="right" width="100"><%=rsltcurRec.qty%>&nbsp;</td>
    <td  class="gray" align="right" width="102"><%=rsltcurRec.qtyratio%>&nbsp;</td>
    <td  class="gray" align="center" width="182">
      <input name="bgnhour" type="text" maxlength="2" size="1" class="text_box" dataType="number" len="2" caption="��޽��۽ð�" maxValue="24">
      : 
      <input name="bgnminute" type="text" maxlength="2" size="1" class="text_box" dataType="number" len="2" caption="��޽��ۺ�" maxValue="59">
      ~ 
      <input name="endhour" type="text" maxlength="2" size="1" class="text_box" dataType="number" len="2" caption="�������ð�" maxValue="24">
      : 
      <input name="endminute" type="text" maxlength="2" size="1" class="text_box" dataType="number" len="2" caption="��������" maxValue="59">
    </td>
    <td class="gray" align="center" width="121">
      <select name="dlvstatcd" class="sel_all">
        <option value="">����</option>
        <%=ds.dlvstatcurOptHtml("")%>
      </select>
    </td>
    <td class="gray" align="center" width="134">
      <input name="leaffeednosh" type="text" size="4" class="text_box">
    </td>
  </tr>
        <%
			}
        %>
</form>
</table>
<%
	if(!("U".equals(acc_flg) && "M".equals(hmflag)) && !("U".equals(acc_flg) && "S".equals(hmflag))){
%>
<script>
    parent.ifrm_1.document.all.medi_thrw_id.outerHTML = medi_thrw_id.outerHTML;
</script>
<%
	}
	if("I".equals(acc_flg) && "H".equals(hmflag)){
%>
<script language="javascript">

	alert("��ü�� ���� ��Ȳ�� �Է��� �����Ͻʽÿ�.");
	
	parent.displayTab('tab12');
	parent.set_on_off_medi_tab('tab_1', 2);
    parent.apt_thrw_temp_form.invsgno.value = "<%=ds.getInvsgno()%>"
	
</script>
<% } %>
<%
	if("I".equals(acc_flg) && "M".equals(hmflag)){
%>
<script language="javascript">

	alert("���� �Ǿ����ϴ�.");
	
	parent.displayTab('tab11');
	parent.set_on_off_medi_tab('tab_0', 2);
	
	parent.list_search();
	parent.hous_cancel()
    parent.apt_thrw_temp_form.invsgno.value = "<%=ds.getInvsgno()%>"
	
    parent.jsInit();
</script>
<% } %>

<%-- ��Ȳ���� �����̾��� ��� --%>
<% 
	if("U".equals(acc_flg) && "H".equals(hmflag)){
%>
<script language="javascript">

	alert("��ü�� ���� ��Ȳ�� �����Ͻʽÿ�.");
	parent.displayTab('tab12');
	parent.set_on_off_medi_tab('tab_1', 2);
    parent.jsInit();
</script>
<% } %>
<% 
	if(("U".equals(acc_flg) && "M".equals(hmflag)) || ("U".equals(acc_flg) && "S".equals(hmflag))){
%>
<script language="javascript">
	alert("���� �Ǿ����ϴ�.");
	var lo_form = parent.document.apt_thrw_temp_form;
    parent.thrw_view(lo_form.invsgdt.value,lo_form.invsgno.value,lo_form.addrcd.value,lo_form.dongno.value);
    
    parent.jsInit();
</script>
<% } %>


