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
	AD_BRN_1110_LDataSet ds = (AD_BRN_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int curlist = rx.add(root, "curlist", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BRN_1110_LCURLISTRecord rec = (AD_BRN_1110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(curlist, "record", "");
			
			rx.add(record, "sale_stmt_issu_yn", rec.sale_stmt_issu_yn);
			rx.add(record, "pubc_dt", rec.pubc_dt); 
			rx.add(record, "pubc_slip_no", rec.pubc_slip_no);
			rx.add(record, "medi_nm", rec.medi_nm);  
			rx.add(record, "sect", rec.sect_cd+rec.sect_seq);
			rx.add(record, "dn", rec.dn);
			rx.add(record, "cm", rec.cm);
			rx.add(record, "arow", rec.arow); 
			rx.add(record, "slcrg_pers_nm", rec.slcrg_pers_nm);
			rx.add(record, "mchrg_pers_nm", rec.mchrg_pers_nm);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "vat", rec.vat);
			rx.add(record, "tot_pubc_amt", StringUtil.toNumber(rec.advt_fee) + StringUtil.toNumber(rec.vat));
			rx.add(record, "coms_rate", rec.coms_rate);
			rx.add(record, "coms", rec.coms);
			
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
