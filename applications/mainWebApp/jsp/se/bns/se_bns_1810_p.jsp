<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,   somo.framework.util.Util
	"
%>
<%
	String report_nm		= Util.checkString(request.getParameter("report_nm"	));
	String preview_gubun	= Util.checkString(request.getParameter("preview_gubun"	));
	preview_gubun			= "V".equals(preview_gubun) ? "preview" : "print";
	/*
	String cmpy_cd 			= Util.getSessionParameterValue(request, "cmpycd", true);
    String incmg_pers		= Util.getSessionParameterValue(request, "emp_no", true);
    */
    String cmpy_cd          = "100";
    String incmg_pers       = "";
    String dt				= Util.checkString(request.getParameter("dt"		));
    String yymm				= Util.checkString(request.getParameter("yymm"		));
    String prt_seq			= Util.checkString(request.getParameter("prt_seq"	));
    String bns_item_cd		= Util.checkString(request.getParameter("bsn_item_cd"));
    String bgn_dt			= Util.checkString(request.getParameter("bgn_dt"	));
    String end_dt			= Util.checkString(request.getParameter("end_dt"	));
    String team				= Util.checkString(request.getParameter("team"		));
    String part				= Util.checkString(request.getParameter("part"		));
    String area				= Util.checkString(request.getParameter("area"		));
    String searchgubun		= Util.checkString(request.getParameter("searchgubun"));
%>
	    <OBJECT width="800" height="600" classid="CLSID:64da633f-e73b-4344-83bf-48483346cd53">
	    	<PARAM name="connection.servlet" value="http://220.73.135.221:8020/oz30/server"></PARAM> 
   			<PARAM name="connection.reportname" 		value="se/<%=report_nm%>.ozr"></PARAM> 
   			<PARAM name="odi.odinames"					value="<%=report_nm%>"></PARAM>
<%	
	if ( "SP_SE_BNS_1805_P".equals(report_nm) ){
%>
			<PARAM name="odi.<%=report_nm%>.pcount" 	value="4"></PARAM>
			<PARAM name="odi.<%=report_nm%>.args1" 		value="iv_cmpy_cd=<%=cmpy_cd%>"></PARAM>
		    <PARAM name="odi.<%=report_nm%>.args2" 		value="iv_rcpm_dt=<%=dt%>"></PARAM>
		    <PARAM name="odi.<%=report_nm%>.args3" 		value="iv_prt_seq=<%=prt_seq%>"></PARAM>
		    <PARAM name="odi.<%=report_nm%>.args4" 		value="iv_incmg_pers=<%=incmg_pers%>"></PARAM>
<%
	} else if (   "SP_SE_BNS_1810_P".equals(report_nm)
	            ||"SP_SE_BNS_1815_P".equals(report_nm)
				||"SP_SE_BNS_1820_P".equals(report_nm)
				||"SP_SE_BNS_1825_P".equals(report_nm) ){
%>
			<PARAM name="odi.<%=report_nm%>.pcount" 	value="3"></PARAM>
			<PARAM name="odi.<%=report_nm%>.args1" 		value="iv_cmpy_cd=<%=cmpy_cd%>"></PARAM>
		    <PARAM name="odi.<%=report_nm%>.args2" 		value="iv_dt=<%=dt%>"></PARAM>
		    <PARAM name="odi.<%=report_nm%>.args3" 		value="iv_incmg_pers=<%=incmg_pers%>"></PARAM>
<%
	} else if (   "SP_SE_BNS_1830_P".equals(report_nm) ){
%>
			<PARAM name="odi.<%=report_nm%>.pcount" 	value="3"></PARAM>
			<PARAM name="odi.<%=report_nm%>.args1" 		value="iv_cmpy_cd=<%=cmpy_cd%>"></PARAM>
		    <PARAM name="odi.<%=report_nm%>.args2" 		value="iv_yymm=<%=yymm%>"></PARAM>
		    <PARAM name="odi.<%=report_nm%>.args3" 		value="iv_incmg_pers=<%=incmg_pers%>"></PARAM>
<%
	} else if (   "SP_SE_BNS_1835_P".equals(report_nm)
	            ||"SP_SE_BNS_1840_P".equals(report_nm) ){
%>
			<PARAM name="odi.<%=report_nm%>.pcount" 	value="8"></PARAM>
			<PARAM name="odi.<%=report_nm%>.args1" 		value="iv_cmpy_cd=<%=cmpy_cd%>"></PARAM>
		    <PARAM name="odi.<%=report_nm%>.args2" 		value="iv_bns_item_cd=<%=bns_item_cd%>"></PARAM>
		    <PARAM name="odi.<%=report_nm%>.args3" 		value="iv_bgn_dt=<%=bgn_dt%>"></PARAM>
		    <PARAM name="odi.<%=report_nm%>.args4" 		value="iv_end_dt=<%=end_dt%>"></PARAM>
		    <PARAM name="odi.<%=report_nm%>.args5" 		value="iv_team=<%=team%>"></PARAM>
		    <PARAM name="odi.<%=report_nm%>.args6" 		value="iv_part=<%=part%>"></PARAM>
		    <PARAM name="odi.<%=report_nm%>.args7" 		value="iv_area=<%=area%>"></PARAM>
		    <PARAM name="odi.<%=report_nm%>.args8" 		value="iv_incmg_pers=<%=incmg_pers%>"></PARAM>
<%
	} else if (   "SP_SE_BNS_1845_P".equals(report_nm) ){
%>
			<PARAM name="odi.<%=report_nm%>.pcount" 	value="6"></PARAM>
			<PARAM name="odi.<%=report_nm%>.args1" 		value="iv_cmpy_cd=<%=cmpy_cd%>"></PARAM>
		    <PARAM name="odi.<%=report_nm%>.args2" 		value="iv_bns_item_cd=<%=bns_item_cd%>"></PARAM>
		    <PARAM name="odi.<%=report_nm%>.args3" 		value="iv_bgn_divn_dt=<%=bgn_dt%>"></PARAM>
		    <PARAM name="odi.<%=report_nm%>.args4" 		value="iv_end_divn_dt=<%=end_dt%>"></PARAM>
		    <PARAM name="odi.<%=report_nm%>.args5" 		value="iv_searchgubun=<%=searchgubun%>"></PARAM>
		    <PARAM name="odi.<%=report_nm%>.args8" 		value="iv_incmg_pers=<%=incmg_pers%>"></PARAM>
<%
	}
%>
	        <PARAM name="applet.configmode" 			value="html"></PARAM>
	        <PARAM name="applet.isframe" 				value="false"></PARAM>
	        <PARAM name="killprocess"                   valuae="true"></PARAM>
	        <PARAM name="applet.mode" 					value="<%=preview_gubun%>"></PARAM> 
	    </OBJECT> 
		