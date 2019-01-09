<%@ include file="/common/jsp/ad_oz_common.jsp" %>

<%
    String cmpy_cd   = Util.getSessionParameterValue(request, "cmpycd", true);
    String trgt_clsf = request.getParameter("trgt_clsf");
    String trgt_obj  = request.getParameter("trgt_obj");
    String trgt_yymm = request.getParameter("trgt_yymm");    
%>
	<OBJECT width = "865" height = "285" CLASSID="<%=ozClasssID%>">
		<param name="connection.servlet"			value="<%=ozServerIP%>">
		<param name="connection.reportname"			value="ad/SP_AD_BAS_3450_P.ozr">
		<param name="odi.odinames"					value="SP_AD_BAS_3450_P">
		<param name="odi.SP_AD_BAS_3450_P.pcount"	value="4">
		<param name="odi.SP_AD_BAS_3450_P.args1"	value="cmpy_cd=<%=cmpy_cd%>">
		<param name="odi.SP_AD_BAS_3450_P.args2"	value="trgt_clsf=<%=trgt_clsf%>">
		<param name="odi.SP_AD_BAS_3450_P.args3"	value="trgt_obj=<%=trgt_obj%>">
		<param name="odi.SP_AD_BAS_3450_P.args4"	value="trgt_yymm=<%=trgt_yymm%>">
		<param name="applet.configmode"				value="html">
        <param name="applet.isframe"             	value="false">
        <param name="applet.mode"                   value="preview">     
        <PARAM NAME="applet.usestatusbar"   		value="false">   
		<PARAM NAME="toolbar.all"     				value="false">       
		<PARAM NAME="viewer.viewmode"      			value="fittocontents">
		<PARAM NAME="applet.useoutborder"  			value="false">		
	</OBJECT>
  