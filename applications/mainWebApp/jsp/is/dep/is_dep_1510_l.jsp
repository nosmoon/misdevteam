<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.dep.rec.*
	,	chosun.ciis.is.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_DEP_1510_LDataSet ds = (IS_DEP_1510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	try {
		int gridData = rx.add( root , "gridData" , "");
		for(int i = 0; i<ds.curlist.size(); i++) {
			IS_DEP_1510_LCURLISTRecord rec = (IS_DEP_1510_LCURLISTRecord)ds.curlist.get(i);

			int record = rx.add(gridData, "record", "");
			rx.add(record, "payo_clsf", rec.payo_clsf); 
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt); 
			rx.add(record, "payo_slip_no", rec.payo_slip_no); 
			rx.add(record, "rcpm_slip_no", rec.rcpm_slip_no);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "drbk_amt", rec.drbk_amt);
			rx.add(record, "dlco_no", rec.dlco_no);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
