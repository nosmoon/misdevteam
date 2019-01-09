<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.yadjm.rec.*
	,	chosun.ciis.hd.yadjm.ds.*;
	"
%>

<%


	
	RwXml rx = new RwXml();
	HD_YADJM_2012_7000_LDataSet ds = (HD_YADJM_2012_7000_LDataSet)request.getAttribute("ds");

	int root = RwXml.rootNodeID;
	int curlist1 = rx.add(root, "curlist1", "");


	try {
		/****** CURLIST BEGIN */

		//거래처접촉자료
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_YADJM_2012_7000_LCURLISTRecord rec = (HD_YADJM_2012_7000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(curlist1, "record", "");
			rx.add(record, "adjm_rvrs_yy", rec.adjm_rvrs_yy);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "add_file_nm", rec.add_file_nm);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
			rx.add(record, "chg_pers_nm", rec.chg_pers_nm);
			rx.add(record, "doc_type", rec.doc_type);
			rx.add(record, "form_cd", rec.form_cd);
			rx.add(record, "add_file", rec.add_file.length());
			
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
