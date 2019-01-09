<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_PUB_1812_LDataSet ds = (AD_PUB_1812_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	//int resData = rx.add(root, "resData", "");
	int resForm = rx.add(root, "resForm3", "");

	try {
		rx.add(resForm, "tot_pubc_amt2", ds.tot_adv_amt);			
		rx.add(resForm, "tot_vat_amt2",  ds.tot_vat_amt);
		rx.add(resForm, "tot_misu_amt2", ds.tot_misu_amt);
		rx.add(resForm, "tot_fee_amt2",  ds.tot_fee_amt);
		rx.add(resForm, "tot_pubc2",     StringUtil.toDouble(ds.tot_pubc));
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
