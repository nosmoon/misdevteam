<%@ page contentType="text/html; charset=EUC-KR" %>

<%
	String pubc_dt	= request.getParameter("pubc_dt");
%>
<HTML>
<HEAD>
<META http-equiv="Content-Type" content="text/html; charset=euc-kr">

<title>조선일보통합정보지원시스템</title>
<script language="javascript" src="/js/TFControlWrite.js"></script>
<script language="javascript">
<!--
	var pubc_dt;
	function jsInit(){
		setPubcDt('<%= pubc_dt %>');
	}
	function setPubcDt(pubc_dt){
		this.pubc_dt = pubc_dt;
	}
//		xrw : 
//		var pubc_dt = htmlwindow.getPubcDt();		
	
	function getPubcDt(){
		return pubc_dt;
	}
//-->	
</script>

</HEAD>
<BODY border="0" leftmargin="0" topmargin="0" rightmargin="0" bottommargin="0" cellpadding="0" cellspacing="0" scroll="no" onload="jsInit();">
	<table cellSpacing="0" cellPadding="0" width="100%" height="100%" border="0">
		<tr>
			<td width="100%" height="100%" style="border:0px; padding:0px;">						
				<div id="TFViewerControlLocation">
					<script>
						TFViewerWrite(TFViewerControlLocation, "mainFrame", "/xrw/ad/AD_COM_1400.xrw", "100%", "100%", "http://localhost:7001");
					</script>
				</div>
			</td>
		</tr> 
	</table>
</body>
</HTML>
