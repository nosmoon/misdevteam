<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.bas.rec.*
	,	chosun.ciis.is.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_BAS_1520_SDataSet ds = (IS_BAS_1520_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resForm   = rx.add(root, "resForm", "");
	
	try {
		rx.add(resForm, "advcs_cd", ds.advcs_cd);
		rx.add(resForm, "advcs_nm", ds.advcs_nm);
		rx.add(resForm, "indt_cd", ds.indt_cd);
		rx.add(resForm, "chg_dt_tm", ds.chg_dt_tm);
		rx.add(resForm, "zip_1", ds.zip_1);
		rx.add(resForm, "zip_2", ds.zip_2);
		rx.add(resForm, "addr", ds.addr);
		rx.add(resForm, "dtls_addr", ds.dtls_addr);
		rx.add(resForm, "tel_no", ds.tel_no);
		rx.add(resForm, "sms_ptph_no", ds.sms_ptph_no);
		rx.add(resForm, "fax_no", ds.fax_no);
		rx.add(resForm, "remk", ds.remk);
		rx.add(resForm, "flag", "U");
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
