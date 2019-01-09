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
	IS_DEP_4610_LDataSet ds = (IS_DEP_4610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "", "");

	try {
		
		for(int i = 0; i<ds.curlist.size(); i++) {
			IS_DEP_4610_LCURLISTRecord rec = (IS_DEP_4610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "chg_pers_nm", rec.chg_pers_nm);
			rx.add(record, "cnt_t", rec.cnt_t);
			rx.addCData(record, "amt_t", rec.amt_t);
			rx.add(record, "amt_12", rec.amt_12);
			rx.add(record, "amt_08", rec.amt_08);
			rx.add(record, "amt_09", rec.amt_09);
			rx.add(record, "amt_10", rec.amt_10);
			
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "actu_slip_no", rec.actu_slip_no);
			rx.add(record, "clos_proc_dt", rec.clos_proc_dt);
			rx.add(record, "slip_clsf", rec.slip_clsf);
			rx.add(record, "chg_pers", rec.chg_pers);
			
			;
		}	
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
