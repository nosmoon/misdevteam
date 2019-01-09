<%@	page contentType="text/html; charset=KSC5601" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.duty.rec.*
	,	chosun.ciis.hd.duty.ds.*
	,	somo.framework.util.*;
	"
%>

<%
//세션없을 시 로그인으I로
String cmpycd = (String)session.getAttribute("BLNG_CMPY_CD") == null ? "" : (String)session.getAttribute("BLNG_CMPY_CD"); 
if(cmpycd.equals("")){
        response.sendRedirect("/");
}
%>

<div class="tbl_area" id="div_table" name="div_table">
<table class="table_style" id="table_list" name="table_list" summery="금주 근무시간을 등록">
        <caption>근무시간</caption>
        <colgroup>
          <col class="c1"></col>
          <col class="c2"></col>
          <col class="c3"></col>
          <col class="c4"></col>
          <col class="c5"></col>
          <col class="c6"></col>
          <col class="c7"></col>
        </colgroup>
        <thead>
          <tr>
            <th scope="col"><input type="checkbox" id="check_all" name="check_all" onclick="set_check_onoff(this);"><label for="check_all"></label></th>
            <th scope="col">날짜</th>
            <th scope="col">출근시각</th>
            <th scope="col">퇴근시각</th>
            <th scope="col">휴게시간</th>
            <th scope="col">비고</th>
            <th scope="col">근무시간</th>
          </tr>
        </thead>
        <tbody id="table_body" name="table_body">
<form id="frm_list" name="frm_list" method="post" action="">
<%
	HD_DUTY_WORK_1001_LDataSet ds = (HD_DUTY_WORK_1001_LDataSet)request.getAttribute("ds");	            	
	String str_style = "";
	String str_disabled = "";            		
	
	for(int i = 0; i < ds.curlist.size(); i++) {
		HD_DUTY_WORK_1001_LCURLISTRecord rec = (HD_DUTY_WORK_1001_LCURLISTRecord)ds.curlist.get(i);		
		str_style = (i==0) ? "bdnone" : "";

		//진행상태에 따른 삭제여부
		if(rec.proc_stat != null && rec.proc_stat != "") {
			str_disabled = (Integer.parseInt(rec.proc_stat) >= 14 ) ? "disabled" : "";
		} else {
			str_disabled = "";
		}
%>
<tr>
        <td scope="col" class="<%=str_style%>"><input type="checkbox" id="t<%=i%>" name="check_yn" value="<%=rec.duty_dt %>" <%=str_disabled%>><label for="t<%=i%>"></label></td>
        <td scope="col" class="date_num <%=str_style%>"><%=rec.clndr_dt %></td>
        <td scope="col" class="<%=str_style%>"><%=rec.prsnt_tm%></td>
        <td scope="col" class="<%=str_style%>"><%=rec.finish_tm%></td>
        <td scope="col" class="<%=str_style%>"><%=rec.rest_tm %></td>
        <td scope="col" class="<%=str_style%>"><%=rec.duty_clsf_nm %></td>
		<td scope="col" class="last <%=str_style%>"><%=rec.duty_tm %>
		<input type="hidden" id="duty_dt" name="duty_dt" value="<%=rec.duty_dt %>">
		<input type="hidden" id="proc_stat" name="proc_stat" value="<%=rec.proc_stat %>"></td>			
</tr>
<%
	} 
%>
</tbody>
</form>
</table>
</div>
<div class="selectBox" id="div_selectbox" name="div_selectbox">
<select id="basi_dt_chg_clsf" name="basi_dt_chg_clsf" onchange="search_time();">
		<option value="10" <%=(ds.getBasi_dt_chg_clsf().equals("10")?"selected" : "")%>>(일)</option>
		<option value="20" <%=(ds.getBasi_dt_chg_clsf().equals("20")?"selected" : "")%>>(월)</option>            	 								
		<option value="30" <%=(ds.getBasi_dt_chg_clsf().equals("30")?"selected" : "")%>>(화)</option>
		<option value="40" <%=(ds.getBasi_dt_chg_clsf().equals("40")?"selected" : "")%>>(수)</option>
		<option value="50" <%=(ds.getBasi_dt_chg_clsf().equals("50")?"selected" : "")%>>(목)</option>            	 								
		<option value="60" <%=(ds.getBasi_dt_chg_clsf().equals("60")?"selected" : "")%>>(금)</option> 
		<option value="70" <%=(ds.getBasi_dt_chg_clsf().equals("70")?"selected" : "")%>>(토)</option>
</select>
</div>
<script>
parent.document.all.sum_txt.innerHTML = "<%=ds.xx_tot_duty_tm %>";
parent.document.all.div_table.outerHTML = document.all.div_table.outerHTML;
parent.document.all.last_week_dt.value = "<%=Util.addDate(request.getParameter("basi_dt"), -7)%>";
parent.document.all.prsnt_tm.value = "<%= ds.getPrsnt_tm()%>";
parent.document.all.finish_tm.value = "<%= ds.getFinish_tm()%>";
parent.document.all.div_selectbox.outerHTML = document.all.div_selectbox.outerHTML;
//alert(parent.document.all.div_selectbox.outerHTML+ "<%=ds.getBasi_dt_chg_clsf()%>");
parent.search_time();
</script>
