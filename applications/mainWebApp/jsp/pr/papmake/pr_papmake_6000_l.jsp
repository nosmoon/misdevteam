<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.papmake.rec.*
	,	chosun.ciis.pr.papmake.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PAPMAKE_6000_LDataSet ds = (PR_PAPMAKE_6000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
    int seq1=1;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PAPMAKE_6000_LCURLISTRecord rec = (PR_PAPMAKE_6000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "yymm", rec.yymm);
			rx.add(record, "sub_cmpy_clsf", rec.sub_cmpy_clsf);
			rx.add(record, "sub_cmpy_clsf_nm", rec.sub_cmpy_clsf_nm);
			rx.add(record, "adjm_obj", rec.adjm_obj);
			rx.add(record, "adjm_obj_nm", rec.adjm_obj_nm);
			rx.add(record, "servcost_clsf", rec.servcost_clsf);
			rx.add(record, "servcost_clsf_nm", rec.servcost_clsf_nm);
			rx.add(record, "base_prt_servcost", rec.base_prt_servcost);
			rx.add(record, "addm_prt_servcost", rec.addm_prt_servcost);
			rx.add(record, "sep_prt_servcost", rec.sep_prt_servcost);
			rx.add(record, "total", rec.total);
			rx.add(record, "base_make_servcost", rec.base_make_servcost);
			rx.add(record, "addm_make_servcost", rec.addm_make_servcost);
			rx.add(record, "slip_clsf", rec.slip_clsf);
			rx.add(record, "slip_proc_occr_dt", rec.slip_proc_occr_dt);
			rx.add(record, "slip_proc_seq", rec.slip_proc_seq);
			rx.add(record, "tax_stmt_dt", rec.tax_stmt_dt);
			rx.add(record, "tax_stmt_seq", rec.tax_stmt_seq);
            rx.add(record, "seq1",seq1);
            seq1++;
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<yymm/>
			<fac_clsf/>
			<base_prt_servcost/>
			<addm_prt_servcost/>
			<sep_prtn_servcost/>
			<crps_cost/>
			<etc_cost/>
			<base_make_servcost/>
			<addm_make_servcost/>
			<slip_clsf/>
			<slip_proc_occr_dt/>
			<slip_proc_seq/>
			<tax_stmt_dt/>
			<tax_stmt_seq/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon May 11 15:19:26 KST 2009 */ %>