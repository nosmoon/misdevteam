<%@ include file="/common/jsp/ad_oz_common.jsp" %>
<%
    String cmpy_cd  	=  Util.getSessionParameterValue(request, "cmpycd", true);
    String frdt 		= request.getParameter("frdt");
    String todt 		= request.getParameter("todt");    
    String unit 		= request.getParameter("unit");  
    String ad_self 		= request.getParameter("ad_self");  
    String graph_clsf 	= request.getParameter("graph_clsf");   

%>
<div STYLE="padding-left:10">
	<OBJECT width = "863" height = "286" CLASSID="<%=ozClasssID%>">
		<param name="connection.servlet"			value="<%=ozServerIP%>">
		<param name="connection.reportname"			value="ad/SP_AD_EIS_1310_P1.ozr">
		<param name="odi.odinames"					value="SP_AD_EIS_1310_P1">
		<param name="odi.SP_AD_EIS_1310_P1.pcount"	value="6">
		<param name="odi.SP_AD_EIS_1310_P1.args1"	value="iv_cmpy_cd=<%=cmpy_cd%>">
		<param name="odi.SP_AD_EIS_1310_P1.args2"	value="iv_frdt=<%=frdt%>">
		<param name="odi.SP_AD_EIS_1310_P1.args3"	value="iv_todt=<%=todt%>">
		<param name="odi.SP_AD_EIS_1310_P1.args4"	value="iv_unit=<%=unit%>">
		<param name="odi.SP_AD_EIS_1310_P1.args5"	value="iv_ad_self=<%=ad_self%>">
		<param name="odi.SP_AD_EIS_1310_P1.args6"	value="iv_graph_clsf=<%=graph_clsf%>">
		<param name="applet.configmode"				value="html">
        <param name="applet.isframe"             	value="true">
        <param name="applet.mode"                   value="preview">     
        <PARAM NAME="applet.usestatusbar"   		value="false">   
		<PARAM NAME="toolbar.all"     				value="false">       
		<PARAM NAME="viewer.viewmode"      			value="fittocontents">
		<PARAM NAME="applet.useoutborder"  			value="false">		
	</OBJECT>
</div>