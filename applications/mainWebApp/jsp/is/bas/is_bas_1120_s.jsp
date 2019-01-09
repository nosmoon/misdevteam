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
	IS_BAS_1120_SDataSet ds = (IS_BAS_1120_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_BAS_1120_SCURLISTRecord rec = (IS_BAS_1120_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "chrg_clsf", rec.chrg_clsf);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);
			rx.add(record, "sub_srt_seqo", rec.srt_seqo);
			rx.add(record, "frdt", rec.frdt);
			rx.add(record, "todt", rec.todt);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "chrg_pers_seq", rec.chrg_pers_seq);
		}
		
		int resForm   = rx.add(gridData, "resForm", "");
		
		rx.add(resForm, "supr_dept_cd", ds.supr_dept_cd);
		rx.add(resForm, "supr_dept_nm", ds.supr_dept_nm);
		rx.add(resForm, "dept_cd", ds.dept_cd);
		rx.add(resForm, "dept_nm", ds.dept_nm);
		rx.add(resForm, "rslt_dept_cd", ds.rslt_dept_cd);
		rx.add(resForm, "srt_seqo", ds.srt_seqo);
		rx.add(resForm, "hdpt_cd", ds.hdpt_cd);
		rx.add(resForm, "erplace_cd", ds.erplace_cd);
		rx.add(resForm, "dept_rptv_addr", ds.dept_rptv_addr);
		rx.add(resForm, "tel_no", ds.tel_no);
		rx.add(resForm, "fax_no", ds.fax_no);
		rx.add(resForm, "use_yn", ds.use_yn);
		rx.add(resForm, "chg_dt_tm", ds.chg_dt_tm);
		rx.add(resForm, "step", ds.step);
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
