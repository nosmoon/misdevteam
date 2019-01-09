<%@ page contentType="text/html; charset=EUC-KR" %>
<%
	String domainName = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
	String strmainFrame =  "/xrw/hd/evlu/HD_EVLU_1100.xrw";
%>
<HTML>
<HEAD>
<META http-equiv="Content-Type" content="text/html; charset=euc-kr">
<title>조선일보통합정보지원시스템</title>
<script language="javascript" src="/js/TFControlWrite.js"></script>
<script language="javascript">
<!--
//-->
</script>
</HEAD>
<BODY border="0" leftmargin="0" topmargin="0" rightmargin="0" bottommargin="0" cellpadding="0" cellspacing="0" scroll="no">

<table cellSpacing="0" cellPadding="0" width="1200" height="830" border="0">
	<tr>
		<td>

			<!-- ===================== TF Framework 부분 =======================================  -->
			<table cellSpacing="0" cellPadding="0" width="1200" height="800" border="0">
				<tr>
					<td width="100%" height="100%" style="border:0px; padding:0px;">
						<div id="TFViewerControlLocation">
							<script>
								TFViewerWrite(TFViewerControlLocation, "mainFrame", "<%= strmainFrame %>", "1200", "800", "<%= domainName %>");
							</script>
						</div>
					</td>
				</tr> 
			</table>

		</td>
	</tr>
</table>

</body>
</HTML>
