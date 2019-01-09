<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_commun_2630_s.jsp
* 기능 	 	 : 판매지국-통신실 아파트투입 현황조사 및 등록 아파트구조보기
* 작성일자 	 : 2004-03-02
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
    SL_S_COMM_APT_STRUCTDataSet ds = (SL_S_COMM_APT_STRUCTDataSet)request.getAttribute("ds");  // request dataset

	int col = Integer.parseInt(ds.getFlorcnt());
	int row = Integer.parseInt(ds.getFlor_houscnt());
	int li_col = row;
	int li_widthVaule = (li_col*35)+35; // (컬럼겟수*컬럼사이즈)+층을 나타내는 열사이즈

	//건물형태 구성을 위해 비어있는 호수를 가져온다
	String KubunVaue = "";
	for(int kk=0 ; kk < ds.apttypecur.size() ; kk++) {
		SL_S_COMM_APT_STRUCTAPTTYPECURRecord rec = (SL_S_COMM_APT_STRUCTAPTTYPECURRecord)ds.apttypecur.get(kk);
		KubunVaue = KubunVaue+"*"+rec.getTotalrowcol();
}
%>

<table id="hous_thrw_id" width="810" border="0" cellpadding="2" cellspacing="0"  align="center" class="gray">
<form name="hous_thrw_form" method="post" action="" >
	<input type=hidden name=accflag 		value="">
    <input type=hidden name=hmflag		 	value="">
    <input type=hidden name=zip	 			value="">
    <input type=hidden name=addr     	 	value="">
	<input type=hidden name=addrcd 		 	value="">
    <input type=hidden name=dongno		 	value="">
    <input type=hidden name=pyong1	 		value="">
    <input type=hidden name=hoscnt1	     	value="">
	<input type=hidden name=invsgdt 		value="">
    <input type=hidden name=invsgno		 	value="">
    <input type=hidden name=invsghhmm	 	value="">
    <input type=hidden name=invsgpers     	value="">
  <tr align="center" bgcolor="#dddddd">
    <td  class="gray" width="50" height="24" > 층</td>
    <% for(int inx = 0 ; inx < row ; inx++) { %> <!-- 층 -->
    <td  class="gray" width="40"> <%=inx+1%>호 </td>
	<% } %>
  </tr>
  <% for(int i = 1 ; i <= col ; i++) { %> <!-- 층수 -->
			<tr align="center">
			<td class="gray" width="50" ><%=col-i+1%> 층 </td>
			<% for(int j = 1 ; j <= row ; j++) { %> <!-- 호수 -->

						<%
							DecimalFormat dFormat = new DecimalFormat("0000");
							String ii = dFormat.format(col-i+1);
							String jj = dFormat.format(j);
							String hh = ii+","+jj;
							int checkInt = KubunVaue.lastIndexOf(hh);
							if(checkInt > 0) {
						%>		<!-- 존재하지않는 층호 -->
								<td class="gray" width="40">&nbsp;</td>
						<%
							} else if(checkInt <= 0) {
						%>		<!-- 존재하는 층호 -->
								<td class="gray" width="40"><input name="h_<%=Util.lpad(col-i+1)%><%=Util.lpad(j)%>" type="text" size="4" class="text_box" ></td>
						<%
							}
						%>
			<% } %>
			</tr>
		<% } %>
</form>
</table>

<script language="javascript">
    var go_form1 = parent.document.thrw_head_form;

    go_form1.pyong.value = '<%=ds.getPyong()%>';
    go_form1.hoscnt.value = '<%=ds.getHoscnt()%>';

    parent.ifrm_2.document.all.hous_thrw_id.outerHTML = document.all.hous_thrw_id.outerHTML;

	parent.hous_cancel()
	parent.displayTab('tab11');
	parent.set_on_off_medi_tab('tab_0', 2);

    parent.jsInit();
</script>


<script language="javascript">
<%

        for(int i=0; i<ds.crdrcur.size(); i++){
            SL_S_COMM_APT_STRUCTCRDRCURRecord rsltcurRec = (SL_S_COMM_APT_STRUCTCRDRCURRecord)ds.crdrcur.get(i);

            String lo_flor = "";
            String lo_hous = "";

            if(rsltcurRec.dlvser_no.length()==1 || rsltcurRec.dlvser_no.length()==2){
            	lo_flor = "001";
            	lo_hous = Util.lpad(Integer.parseInt(rsltcurRec.dlvser_no))+"";
            } else if(rsltcurRec.dlvser_no.length()==3) {
            	lo_flor = Util.lpad(Integer.parseInt(rsltcurRec.dlvser_no.substring(0,1)))+"";
            	lo_hous = Util.lpad(Integer.parseInt(rsltcurRec.dlvser_no.substring(1,3)))+"";
            } else if(rsltcurRec.dlvser_no.length()==4) {
            	lo_flor = Util.lpad(Integer.parseInt(rsltcurRec.dlvser_no.substring(0,2)))+"";
            	lo_hous = Util.lpad(Integer.parseInt(rsltcurRec.dlvser_no.substring(2,4)))+"";
            } else {
            	continue;
            }
	%>
    	parent.ifrm_2.document.all.hous_thrw_form.h_<%=lo_flor+lo_hous%>.value = "C";

    <%
		}
    %>
</script>
