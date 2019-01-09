<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_3010_SDataSet ds = (HD_INFO_3010_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int formData = rx.add(root, "formData", "");

	try {
		//int resForm = rx.add(resData, "resForm", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_3010_SCURLISTRecord rec = (HD_INFO_3010_SCURLISTRecord)ds.curlist.get(i);
			
			rx.add(formData, "cont", rec.cont);
			//rx.add(formData, "cont"		, StringUtil.replaceToXml(rec.cont));
		}
	}
	catch (Exception e) {
	
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

