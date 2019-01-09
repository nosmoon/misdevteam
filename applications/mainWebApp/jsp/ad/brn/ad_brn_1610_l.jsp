<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.brn.rec.*
	,	chosun.ciis.ad.brn.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_BRN_1610_LDataSet ds = (AD_BRN_1610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BRN_1610_LCURLISTRecord rec = (AD_BRN_1610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "dlco_nm", rec.dlco_nm); 
			rx.add(record, "upd_prv_amt", rec.upd_prv_amt);
			rx.add(record, "upd_aft_amt", rec.upd_aft_amt);
			rx.add(record, "icdc_amt", rec.icdc_amt);
			rx.add(record, "make_dt", rec.make_dt);
			rx.add(record, "icdc_clsf", "01".equals(rec.icdc_clsf) ? "증가":"감소");

		}
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
