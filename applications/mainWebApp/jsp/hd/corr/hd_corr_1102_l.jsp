<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.corr.rec.*
	,	chosun.ciis.hd.corr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_CORR_1102_LDataSet ds = (HD_CORR_1102_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
	try {
		/****** CURLIST BEGIN */

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_CORR_1102_LCURLISTRecord rec = (HD_CORR_1102_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "sub_seq", rec.sub_seq);
			rx.add(record, "pay_yymm", rec.pay_yymm);
			rx.add(record, "istt_cost_cd", rec.istt_cost_cd);
			rx.add(record, "istt_cost_nm", rec.istt_cost_nm);
			rx.add(record, "istt_cost_ptcr", rec.istt_cost_ptcr);
			rx.add(record, "frex_clsf", rec.frex_clsf);
			rx.add(record, "frex_clsf_nm", rec.frex_clsf_nm);
			rx.add(record, "aplc_frex", rec.aplc_frex);
			rx.add(record, "aplc_won", rec.aplc_won);
			rx.add(record, "adjm_frex", rec.adjm_frex);
			rx.add(record, "adjm_won", rec.adjm_won);
			rx.add(record, "remk", rec.remk);
		}
		rx.add(dataSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */
		
		/****** CURLIST1 BEGIN */

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_CORR_1102_LCURLIST1Record rec = (HD_CORR_1102_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(dataSet, "fwdData", "");
			rx.add(record, "aplc_frex_stot", rec.aplc_frex_stot);
			rx.add(record, "aplc_won_stot", rec.aplc_won_stot);
			rx.add(record, "adjm_frex_stot", rec.adjm_frex_stot);
			rx.add(record, "adjm_won_stot", rec.adjm_won_stot);
		}
		/****** CURLIST1 END */		

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
<tempData>
	<CURLIST>
		<record>
			<emp_no/>
			<occr_dt/>
			<seq/>
			<sub_seq/>
			<pay_yymm/>
			<istt_cost_cd/>
			<istt_cost_nm/>
			<istt_cost_ptcr/>
			<frex_clsf/>
			<frex_clsf_nm/>
			<aplc_frex/>
			<aplc_won/>
			<adjm_frex/>
			<adjm_won/>
			<remk/>
		</record>
	</CURLIST>
</tempData>
*/
%>

<% /* 작성시간 : Thu Apr 09 16:07:48 KST 2009 */ %>