<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.sal.rec.*
	,	chosun.ciis.is.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_SAL_1201_MDataSet ds = (IS_SAL_1201_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");
	try {
		int cmb_work_clsf = rx.add( tempData , "cmb_work_clsf" , "");		
		
		for(int i=0; i<ds.curlist.size(); i++){ 
			IS_SAL_1201_MCURLISTRecord rec = (IS_SAL_1201_MCURLISTRecord)ds.curlist.get(i);
			int item  = rx.add( cmb_work_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd_abrv_nm);
		}

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
