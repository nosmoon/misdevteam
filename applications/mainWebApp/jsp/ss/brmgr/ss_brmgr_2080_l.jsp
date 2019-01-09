<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ page import="somo.framework.util.*,somo.framework.lib.*,chosun.ciis.ss.sls.brmgr.ds.*,chosun.ciis.ss.sls.brmgr.dm.*,chosun.ciis.ss.sls.brmgr.rec.*,chosun.ciis.ss.sls.brmgr.servlet.*"%>
<html>
<link rel="stylesheet" href="/css/style_sheet.css" type="text/css">
<head>

	<script language="javascript">
		<!--
		parent.mainbody.style.cursor = "DEFAULT";
		parent.idwaiting.style.display = "none";
		//-->
	</script>		

	<script language="javascript">
		<!--	
			function openReaderDetailView01(i) {
				 var detailForm = eval("document.detailForm"+i);
			   var arr = new Array();
			   arr[0] = eval("document.detailForm"+i+".bocd"+i).value;
			   arr[1] = eval("document.detailForm"+i+".rdr_no"+i).value;
			   arr[2] = "";
			   var date = new Date();
			   var popid = "RDRDETAILPOP" + date.getTime();	//id 중복을 피하기 위한 timestamp
			   
			   var prop = "left:140px; top:50px; width:935px; height:570px;";
			   var url = "/xrw/ss/reader/sl_reader_1100_a.xrw";
			   //window.load(url, "modeless", popid, prop);
			   window.load(url, "modeless", popid, prop);
			   
			   window.children(popid).window.javaScript.setPostParameter(arr);
			}			
		//-->
	</script>
		

</head>
<%
	ABC_L_ABCWORKCHGDataSet ds = (ABC_L_ABCWORKCHGDataSet)request.getAttribute("ds");
	String bocd = Util.Uni2Ksc(Util.checkString((String)request.getAttribute("bocd")));
%>
<body>
	<table width="1380" border="1" cellspacing="0" cellpadding="0">
		<tr bgcolor="#EBE9DC">
			<td align="center" width="50">순번</td>
			<td align="center" width="50">지국명</td>
			<td align="center" width="70">독자번호</td>
			<td align="center" width="50">독자명</td>
			<td align="center" width="70">변경년월</td>
			<td align="center" width="40">작업<br>번호</td>
			<td align="center" width="40">작업<br>코드</td>
			<td align="center" width="150">기존수금이력</td>
			<td align="center" width="150">변경수금이력</td>
			<td align="center" width="300">변경사항</td>
			<td align="center" width="70">대표<br>확장일자</td>
			<td align="center" width="100">전화번호</td>
			<td align="center" width="100">휴대폰</td>
			<!--td align="center">배달지코드</td-->
			<td align="center" width="70">실구독금액</td>
			<td align="center" width="70">할인금액</td>
		</tr>
<% if(ds != null && ds.curabcchg.size()>0) { 
		for(int i=0; i<ds.curabcchg.size(); i++) {
			ABC_L_ABCWORKCHGCURABCCHGRecord curabcchgRec = (ABC_L_ABCWORKCHGCURABCCHGRecord)ds.curabcchg.get(i);

%>
		<tr>
			<form name="detailForm<%=i%>" method="post">
				<td align="center" width="50"><%= (i+1)%></td>
				<!--td align="center"><a href="javascript:openReaderDetailView01(<%=i%>)"><%= curabcchgRec.rdr_no%></a></td-->
				<td align="center" width="50"><%= curabcchgRec.bocd%></td>
				<td align="center" width="70"><%= curabcchgRec.rdr_no%></td>
				<td align="center" width="50"><%= curabcchgRec.rdr_nm%></td>
				<td align="center" width="70"><%= curabcchgRec.subsmappli%></td>
				<td align="center" width="40"><%= curabcchgRec.wrkseq%></td>
				<td align="center" width="40"><%= curabcchgRec.wrkcode%></td>
				<td align="center" width="150" bgcolor="yellow"><%= curabcchgRec.clamthsty.substring(0,12)%></td>
				<td align="center" width="150" bgcolor="orange"><%= curabcchgRec.clamlist.substring(0,12)%></td>
				<td width="300" bgcolor="yellow"><%= curabcchgRec.remk%></td>
				<td align="center" width="70"><%= curabcchgRec.rptvrdr_extndt%></td>
				<td align="center" width="100"><%= curabcchgRec.rdrtel%></td>
				<td align="center" width="100"><%= curabcchgRec.rdrptph%></td>
				<!--td align="center"><%= curabcchgRec.dlvcd%></td-->
				<td align="center" width="70"><%= curabcchgRec.realsubsamt%></td>
				<td align="center" width="70"><%= curabcchgRec.dscnamt%></td>
				<input type="hidden" name="bocd<%=i%>" value="<%=bocd%>">
				<input type="hidden" name="rdr_no<%=i%>" value="<%=curabcchgRec.rdr_no%>">
			</form>
		</tr>
<%
	}
} else {
%>

		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
	  </tr>			
<% }
%>	
  </table>
</body>
</html>
