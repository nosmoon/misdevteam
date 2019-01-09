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
	SP_SUP_1020_SDataSet ds = (SP_SUP_1020_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resForm   = rx.add(root, "resForm", "");

	try {

		rx.add(resForm, "dt", ds.dt);
		rx.add(resForm, "dlco_no", ds.dlco_no);
		rx.add(resForm, "dlco_nm", ds.dlco_nm);
		rx.add(resForm, "dlco_nm", ds.dlco_nm);
		rx.add(resForm, "vist_bgn_hh", ds.vist_bgn_hh);
		rx.add(resForm, "vist_bgn_mm", ds.vist_bgn_mm);
		rx.add(resForm, "vist_end_hh", ds.vist_end_hh);
		rx.add(resForm, "vist_end_mm", ds.vist_end_mm);
		rx.add(resForm, "vist_obj_clsf", ds.vist_obj_clsf);
		rx.add(resForm, "vist_clsf", ds.vist_clsf);
		rx.add(resForm, "callcoms", ds.callcoms);
		rx.add(resForm, "job_cont", ds.job_cont);
		rx.add(resForm, "flag", "U");
		rx.add(resForm, "job_clas", "");
		
		
		
		for(int i = 0; i < ds.curlist1.size(); i++) {
			SP_SUP_1020_SCURLIST1Record rec = (SP_SUP_1020_SCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(resForm, "record", "");
			rx.add(record, "step", rec.step);
			rx.add(record, "value", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.add(record, "up_cd", rec.up_cd);
			rx.add(record, "sort", rec.sort);
			rx.add(record, "job_clas", rec.job_clas);
		}
		
		
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
