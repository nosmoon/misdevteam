<%@ page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.mng.rec.*
	,	chosun.ciis.co.mng.ds.*
	,	org.json.*;
	"
%>
<%
System.out.println("jsp go");

	RwXml rx = new RwXml();
	CO_MNG_1000_LDataSet ds = (CO_MNG_1000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");
	
	try{
		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_MNG_1000_LCURLISTRecord rec = (CO_MNG_1000_LCURLISTRecord)ds.curlist.get(i);
				int recode = rx.add(resData, "recode", "");
				rx.add(recode, "menu_nm", rec.menu_nm);		
				rx.add(recode, "menu_id", rec.menu_id);	
				rx.add(recode, "role_id", rec.role_id);	
		} 
	} catch (Exception e) {
	} finally {
		JSONObject obj = XML.toJSONObject(rx.getXml());
		out.println(obj.toString());
		out.println(rx.xmlEndFlush());	
	}
%>

