<%@	page contentType="text/html; charset=EUC-KR" %>
<%
	double self_tot_cnt		= 0;
	double asst_tot_cnt		= 0;
	double tms1_tot_cnt		= 0;
	double tms2_tot_cnt		= 0; 

	double self_done_cnt	= 0;
	double self_doing_cnt	= 0;
	double asst_done_cnt	= 0;
	double asst_doing_cnt	= 0;
	double tms1_done_cnt	= 0;
	double tms1_doing_cnt	= 0;
	double tms2_done_cnt	= 0;
	double tms2_doing_cnt	= 0;
	
	try{
		self_done_cnt	= Long.parseLong(request.getParameter("self_done_cnt"));
	}catch(Exception e){
		self_done_cnt = 0;
	}
	try{
		self_doing_cnt	= Long.parseLong(request.getParameter("self_doing_cnt"));
	}catch(Exception e){
		self_doing_cnt = 0;
	}
	
	self_tot_cnt = self_done_cnt + self_doing_cnt;
	
	try{
		asst_done_cnt	= Long.parseLong(request.getParameter("asst_done_cnt"));
	}catch(Exception e){
		asst_done_cnt = 0;
	}
	try{
		asst_doing_cnt	= Long.parseLong(request.getParameter("asst_doing_cnt"));
	}catch(Exception e){
		asst_doing_cnt = 0;
	}
	
	asst_tot_cnt = asst_done_cnt + asst_doing_cnt;
	
	try{
		tms1_done_cnt	= Long.parseLong(request.getParameter("tms1_done_cnt"));
	}catch(Exception e){
		tms1_done_cnt = 0;
	}
	try{
		tms1_doing_cnt	= Long.parseLong(request.getParameter("tms1_doing_cnt"));
	}catch(Exception e){
		tms1_doing_cnt = 0;
	}
	
	tms1_tot_cnt = tms1_done_cnt + tms1_doing_cnt;
	
	try{
		tms2_done_cnt	= Long.parseLong(request.getParameter("tms2_done_cnt"));
	}catch(Exception e){
		tms2_done_cnt = 0;
	}
	try{
		tms2_doing_cnt	= Long.parseLong(request.getParameter("tms2_doing_cnt"));
	}catch(Exception e){
		tms2_doing_cnt = 0;
	}
	
	tms2_tot_cnt = tms2_done_cnt + tms2_doing_cnt;


//	out.println("self_done_cnt : " + self_done_cnt + "<br>");
//	out.println("self_doing_cnt : " + self_doing_cnt + "<br>");
//	out.println("self_tot_cnt : " + self_tot_cnt + "<br>");
//	out.println("asst_done_cnt : " + asst_done_cnt + "<br>");
//	out.println("asst_doing_cnt : " + asst_doing_cnt + "<br>");
//	out.println("asst_tot_cnt : " + asst_tot_cnt + "<br>");
//	out.println("tms1_done_cnt : " + tms1_done_cnt + "<br>");
//	out.println("tms1_doing_cnt : " + tms1_doing_cnt + "<br>");
//	out.println("tms1_tot_cnt : " + tms1_tot_cnt + "<br>");
//	out.println("tms2_done_cnt : " + tms2_done_cnt + "<br>");
//	out.println("tms2_doing_cnt : " + tms2_doing_cnt + "<br>");
//	out.println("tms2_tot_cnt : " + tms2_tot_cnt + "<br>");


	double self_done_rate = 0;
	try{
		self_done_rate = Math.round(self_done_cnt/self_tot_cnt*100);
	}catch(Exception e){
		self_done_rate = 0;
	}
	//out.println("self_done_rate : " + self_done_rate + "<br>");
	double self_doing_rate = 0;
	try{
		self_doing_rate = Math.round(self_doing_cnt/self_tot_cnt*100);
	}catch(Exception e){
		self_doing_rate = 0;
	}
	//out.println("self_doing_rate : " + self_doing_rate + "<br>");
	double asst_done_rate = 0;
	try{
		asst_done_rate = Math.round(asst_done_cnt/asst_tot_cnt*100);
	}catch(Exception e){
		asst_done_rate = 0;
	}
	//out.println("asst_done_rate : " + asst_done_rate + "<br>");
	double asst_doing_rate = 0;
	try{
		asst_doing_rate = Math.round(asst_doing_cnt/asst_tot_cnt*100);
	}catch(Exception e){
		asst_doing_rate = 0;
	}
	//out.println("asst_doing_rate : " + asst_doing_rate + "<br>");
	double tms1_done_rate = 0;
	try{
		tms1_done_rate = Math.round(tms1_done_cnt/tms1_tot_cnt*100);
	}catch(Exception e){
		tms1_done_rate = 0;
	}
	//out.println("tms1_done_rate : " + tms1_done_rate + "<br>");
	double tms1_doing_rate = 0;
	try{
		tms1_doing_rate = Math.round(tms1_doing_cnt/tms1_tot_cnt*100);
	}catch(Exception e){
		tms1_doing_rate = 0;
	}
	//out.println("tms1_doing_rate : " + tms1_doing_rate + "<br>");
	double tms2_done_rate = 0;
	try{
		tms2_done_rate = Math.round(tms2_done_cnt/tms2_tot_cnt*100);
	}catch(Exception e){
		tms2_done_rate = 0;
	}
	//out.println("tms2_done_rate  : " + tms2_done_rate  + "<br>");
	double tms2_doing_rate = 0;
	try{
		tms2_doing_rate = Math.round(tms2_doing_cnt/tms2_tot_cnt*100);
	}catch(Exception e){
		tms2_doing_rate = 0;
	}
	//out.println("tms2_doing_rate : " + tms2_doing_rate + "<br>");
%>
<html>
<head>
<title>평가진행상태 그래프</title>
<link rel="styleshee" type="text/css" href="/css/style_sheet.css">
<style type="text/css">
	td.td01 {
		height:26px;
		font-size:12px;
		font-weight:bold;
		border-style:solid;
		border-color:#dcdcdc;
		text-align:center;
		vertical-align:middle;
		background-color:#eaedfe;
	}
	td.td02{
		height:26px;
		font-size:12px;
		border-style:solid;
		border-color:#dcdcdc;
		text-align:center;
		vertical-align:middle;
		background-color:#ffffff;
	}
	td.td03{
		height:26px;
		font-size:12px;
		border-style:solid;
		border-color:#dcdcdc;   
		text-align:left;
		vertical-align:middle;
		background-color:#ffffff;
	}
</style>
</head>
<body style="margin-top:0;margin-bottom:0;margin-left=0;margin-right:0">
<table height="130"  width="910" cellpadding="0" cellspacing="0" border="1">
<tr>
	<td class="td01" width="150">평가단계</td>
	<td class="td01" width="560">평가진행현황</td>
	<td class="td01" width="100">완료</td>
	<td class="td01" width="100">미완료</td>
</tr>
<tr>
	<td class="td01">본인업적기술</td>
	<% if(self_done_rate <= 0 && self_doing_rate <= 0){ %>
	<td class="td03">&nbsp;</td>
	<% }else{ %>
	<td class="td03" align="left"><% 	if(self_done_rate > 0) { %><img src="/images/poll_bar.gif" width="<%=(int)self_done_rate%>%" height="15"><% 	} %><% 	if(self_doing_rate > 0) { %><img src="/images/poll_bar2.gif" width="<%=(int)self_doing_rate%>%" height="15"></td><% 	} %>
	<% } %>
	<td class="td02"><%=(int)self_done_cnt%>명</td>
	<td class="td02"><%=(int)self_doing_cnt%>명</td>
</tr>
<tr>
	<td class="td01">보조평가</td>
	<% if(asst_done_rate <= 0 && asst_doing_rate <= 0){ %>
	<td class="td03">&nbsp;</td>
	<% }else{ %>
	<td class="td03"><% 	if(asst_done_rate > 0) { %><img src="/images/poll_bar.gif" width="<%=(int)asst_done_rate%>%" height="15"><% 	} %><% 	if(asst_doing_rate > 0) { %><img src="/images/poll_bar2.gif" width="<%=(int)asst_doing_rate%>%" height="15"></td><% 	} %>
	<% } %>
	<td class="td02"><%=(int)asst_done_cnt%>명</td>
	<td class="td02"><%=(int)asst_doing_cnt%>명</td>
</tr>
<tr>
	<td class="td01">1차평가</td>
	<% if(tms1_done_rate <= 0 && tms1_doing_rate <= 0){ %>
	<td class="td03">&nbsp;</td>
	<% }else{ %>
	<td class="td03"><% if(tms1_done_rate > 0) { %><img src="/images/poll_bar.gif" width="<%=(int)tms1_done_rate%>%" height="15"><% } %><% if(tms1_doing_rate > 0) { %><img src="/images/poll_bar2.gif" width="<%=(int)tms1_doing_rate%>%" height="15"></td><% } %>
	<% } %>
	<td class="td02"><%=(int)tms1_done_cnt%>명</td>
	<td class="td02"><%=(int)tms1_doing_cnt%>명</td>
</tr>
<tr>
	<td class="td01">2차평가</td>
	<% if(tms2_done_rate <= 0 && tms2_doing_rate <= 0){ %>
	<td class="td03">&nbsp;</td>
	<% }else{ %>
	<td class="td03"><% if(tms2_done_rate > 0) { %><img src="/images/poll_bar.gif" width="<%=(int)tms2_done_rate%>%" height="15"><% } %><% if(tms2_doing_rate > 0) { %><img src="/images/poll_bar2.gif" width="<%=(int)tms2_doing_rate%>%" height="15"></td><% } %>
	<% } %>
	<td class="td02"><%=(int)tms2_done_cnt%>명</td>
	<td class="td02"><%=(int)tms2_doing_cnt%>명</td>
</tr>
</table>
</body>
</html>