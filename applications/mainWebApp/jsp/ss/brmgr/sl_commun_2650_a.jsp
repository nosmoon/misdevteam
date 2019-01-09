<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/sl_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_commun_2650_a.jsp
* 기능 	 	 : 판매지국-통신실 아파트투입 현황조사 및 등록 초기화면
* 작성일자 	 : 2004-02-24
* 작성자 	 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<% 
	// dataset 인스턴스 선언부분
    SL_A_COMM_APT_THRWDataSet ds = (SL_A_COMM_APT_THRWDataSet)request.getAttribute("ds");  // request dataset

	String acc_flg = request.getParameter("accflag");
	String hmflag = request.getParameter("hmflag");
	
%>

<!--투입매체별 현황-->
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
      <input name="bgnhour" type="text" maxlength="2" size="1" class="text_box" dataType="number" len="2" caption="배달시작시간" maxValue="24">
      : 
      <input name="bgnminute" type="text" maxlength="2" size="1" class="text_box" dataType="number" len="2" caption="배달시작분" maxValue="59">
      ~ 
      <input name="endhour" type="text" maxlength="2" size="1" class="text_box" dataType="number" len="2" caption="배달종료시간" maxValue="24">
      : 
      <input name="endminute" type="text" maxlength="2" size="1" class="text_box" dataType="number" len="2" caption="배달종료분" maxValue="59">
    </td>
    <td class="gray" align="center" width="121">
      <select name="dlvstatcd" class="sel_all">
        <option value="">선택</option>
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

	alert("매체별 투입 현황도 입력후 저장하십시요.");
	
	parent.displayTab('tab12');
	parent.set_on_off_medi_tab('tab_1', 2);
    parent.apt_thrw_temp_form.invsgno.value = "<%=ds.getInvsgno()%>"
	
</script>
<% } %>
<%
	if("I".equals(acc_flg) && "M".equals(hmflag)){
%>
<script language="javascript">

	alert("저장 되었습니다.");
	
	parent.displayTab('tab11');
	parent.set_on_off_medi_tab('tab_0', 2);
	
	parent.list_search();
	parent.hous_cancel()
    parent.apt_thrw_temp_form.invsgno.value = "<%=ds.getInvsgno()%>"
	
    parent.jsInit();
</script>
<% } %>

<%-- 현황조사 수정이었을 경우 --%>
<% 
	if("U".equals(acc_flg) && "H".equals(hmflag)){
%>
<script language="javascript">

	alert("매체별 투입 현황도 수정하십시요.");
	parent.displayTab('tab12');
	parent.set_on_off_medi_tab('tab_1', 2);
    parent.jsInit();
</script>
<% } %>
<% 
	if(("U".equals(acc_flg) && "M".equals(hmflag)) || ("U".equals(acc_flg) && "S".equals(hmflag))){
%>
<script language="javascript">
	alert("저장 되었습니다.");
	var lo_form = parent.document.apt_thrw_temp_form;
    parent.thrw_view(lo_form.invsgdt.value,lo_form.invsgno.value,lo_form.addrcd.value,lo_form.dongno.value);
    
    parent.jsInit();
</script>
<% } %>


