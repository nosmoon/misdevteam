<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.co.rec.*
	,	chosun.ciis.mc.co.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_CO_2070_MDataSet ds = (MC_CO_2070_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_budg_type_cd_010", ds.getXx_budg_type_cd_010());
		rx.add(dataSet, "xx_budg_type_cd_020", ds.getXx_budg_type_cd_020());
		rx.add(dataSet, "xx_budg_type_cd_030", ds.getXx_budg_type_cd_030());
		rx.add(dataSet, "xx_budg_cd_010", ds.getXx_budg_cd_010());
		rx.add(dataSet, "xx_budg_cd_020", ds.getXx_budg_cd_020());
		rx.add(dataSet, "xx_budg_cd_030", ds.getXx_budg_cd_030());
		rx.add(dataSet, "xx_budg_cd_040", ds.getXx_budg_cd_040());
		rx.add(dataSet, "xx_budg_cd_050", ds.getXx_budg_cd_050());
		rx.add(dataSet, "xx_budg_cd_060", ds.getXx_budg_cd_060());
		rx.add(dataSet, "xx_from_clas_cd1_010", ds.getXx_from_clas_cd1_010());
		rx.add(dataSet, "xx_to_clas_cd1_010", ds.getXx_to_clas_cd1_010());
		rx.add(dataSet, "xx_from_clas_cd1_020", ds.getXx_from_clas_cd1_020());
		rx.add(dataSet, "xx_to_clas_cd1_020", ds.getXx_to_clas_cd1_020());
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Fri Jan 13 15:33:04 KST 2012 */ %>