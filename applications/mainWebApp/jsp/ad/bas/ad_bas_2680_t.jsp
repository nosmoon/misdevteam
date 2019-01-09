<%@ include file="/common/jsp/ad_oz_common.jsp" %>

<%
    String cmpy_cd  	= Util.getSessionParameterValue(request, "cmpycd", true);
    String trgt_clsf 	= Util.checkString(request.getParameter("trgt_clsf"));
    String trgt_yymm 	= Util.checkString(request.getParameter("trgt_yymm"));    
    String medi_cd 		= Util.checkString(request.getParameter("medi_cd"));    
    String chrg_pers 	= Util.checkString(request.getParameter("chrg_pers"));  
    
    System.out.println("chrg_pers = " + chrg_pers);  
    
%>
	<OBJECT width = "865" height = "285" CLASSID="<%=ozClasssID%>">
		<param name="connection.servlet"			value="<%=ozServerIP%>">
		<param name="connection.reportname"			value="ad/SP_AD_BAS_2680_P.ozr">
		<param name="odi.odinames"					value="SP_AD_BAS_2680_P">
		<param name="odi.SP_AD_BAS_2680_P.pcount"	value="5">
		<param name="odi.SP_AD_BAS_2680_P.args1"	value="cmpy_cd=<%=cmpy_cd%>">
		<param name="odi.SP_AD_BAS_2680_P.args2"	value="trgt_clsf=<%=trgt_clsf%>">
		<param name="odi.SP_AD_BAS_2680_P.args3"	value="trgt_yymm=<%=trgt_yymm%>">
		<param name="odi.SP_AD_BAS_2680_P.args4"	value="medi_cd=<%=medi_cd%>">
		<param name="odi.SP_AD_BAS_2680_P.args5"	value="chrg_pers=<%=chrg_pers%>">
		<param name="applet.configmode"				value="html">
        <param name="applet.isframe"             	value="false">
        <param name="applet.mode"                   value="preview">     
        <PARAM NAME="applet.usestatusbar"   		value="false">   
		<PARAM NAME="toolbar.all"     				value="false">       
		<PARAM NAME="viewer.viewmode"      			value="fittocontents">
		<PARAM NAME="applet.useoutborder"  			value="false">		
	</OBJECT>
