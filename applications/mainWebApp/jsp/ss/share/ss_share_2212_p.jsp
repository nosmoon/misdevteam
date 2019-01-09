<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_2212_p.jsp
* 기능 : 판매국메인-달력-일별일정
* 작성일자 : 2004-04-27
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    SS_L_DAY_SCHEDataSet ds = (SS_L_DAY_SCHEDataSet)request.getAttribute("ds");    // request dataset
    String select_day = request.getParameter("yyyymmdd");
%>
<html>
<head>
<title>일정</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">

// 이벤트 핸들러 초기화
function jsInit(){
    setEventHandler();
}
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginheight="0" class="scroll1" onload="jsInit()">
<table width="580" height="100%"  cellspacing="2" cellpadding="2" align="center">
<tr> 
	<td valign="top">
	
		<table width="100%" border="0"  cellpadding="1" cellspacing="0" align="center">
			<tr> 
			  <td height="3"> 
			    <!--여백-->
			  </td>
			</tr>
			<tr> 
			  <td  height="25" bgcolor="#EBE9DC" class="title"><%=Util.convertS(select_day)%>일자 일정 내역</td>
			</tr>			  
			<tr> 
			  <td height="3"> 
			    <!--여백-->
			  </td>
			</tr>
		</table>
		
		<%--일정 목록이 존재할 경우--%>
		<%if(ds.dayschecur.size()>0){%>
	      
			<table width="100%" class="gray" cellpadding="2" cellspacing="0" >
				<tr>
					<td class="gray" width="70" align="center" bgcolor="#dddddd"> 구분 </td>
					<td class="gray" width="70" align="center" bgcolor="#dddddd"> 항목 </td>
					<td class="gray" width="70" align="center" bgcolor="#dddddd"> 시작일 </td>
					<td class="gray" width="70" align="center" bgcolor="#dddddd"> 종료일 </td>
					<td class="gray" bgcolor="#dddddd" align="center" > 내용 </td>
				</tr>
				<%for(int i=0 ; i< ds.dayschecur.size(); i++){
					SS_L_DAY_SCHEDAYSCHECURRecord rec = (SS_L_DAY_SCHEDAYSCHECURRecord)ds.dayschecur.get(i);%>
				<tr> 
					<td class="gray" width="70" align="center"><%=rec.schemangunitcd_nm%>&nbsp;</td>
					<td class="gray" width="70" align="center"><%=rec.schemangitemcd_nm%>&nbsp;</td>
					<td class="gray" width="70" align="center"><%=Util.convertS(rec.frdt)%>&nbsp;</td>
					<td class="gray" width="70" align="center"><%=Util.convertS(rec.todt)%>&nbsp;</td>
					<td class="gray" align="left" ><%=rec.remk%>&nbsp;</td>
				</tr>
				<%}%>
			</table>

		<%--일정 목록이 존재하지 않을 경우--%>
		<%}else{%>
			<table width ="100%" height="200" >
				<tr> 
					<td align="center"><b><font color="#FF6600">등록된 일정이 없습니다</font></b></td>
				</tr>
			</table>
		<%}%> 
	</td>	
	     
</tr>
<tr>
	<td align="center" height="25" bgcolor="#dddddd"><a href="javascript:self.close();"><img src="/html/comm_img/bu_close.gif" width="49" height="19" border="0"></a></td>
</tr>
</table>
</body>
</html>