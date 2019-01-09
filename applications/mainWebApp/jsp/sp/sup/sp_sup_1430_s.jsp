<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sup.rec.*
	,	chosun.ciis.sp.sup.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SUP_1430_SDataSet ds = (SP_SUP_1430_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData   = rx.add(root, "tempData", "");

	try {
		rx.add(tempData, "adms_dstc_cd_nm", ds.adms_dstc_cd_nm);
		rx.add(tempData, "chrg_pers_nm", ds.chrg_pers_nm);
		rx.add(tempData, "ptph_no", ds.ptph_no);
		rx.add(tempData, "tel_no", ds.tel_no);
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
