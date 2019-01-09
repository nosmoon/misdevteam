<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.budg.rec.*
	,	chosun.ciis.mc.budg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_BUDG_6141_LDataSet ds = (MC_BUDG_6141_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MC_BUDG_6141_LCURLISTRecord rec = (MC_BUDG_6141_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "major_amt", rec.major_amt);
			rx.add(record, "sub_amt", rec.sub_amt);
			rx.add(record, "prt_labor_amt", rec.prt_labor_amt);
			rx.add(record, "sub_tot", rec.sub_tot);
			rx.add(record, "major_amt_local", rec.major_amt_local);
			rx.add(record, "sub_amt_local", rec.sub_amt_local);
			rx.add(record, "sub_tot_local", rec.sub_tot_local);
			rx.add(record, "tot_avg", rec.tot_avg);
			rx.add(record, "deduct_labor_amt", rec.deduct_labor_amt);
			rx.add(record, "bmajor_amt", rec.bmajor_amt);
			rx.add(record, "bsub_amt", rec.bsub_amt);
			rx.add(record, "bprt_labor_amt", rec.bprt_labor_amt);
			rx.add(record, "bsub_tot", rec.bsub_tot);
			rx.add(record, "bmajor_amt_local", rec.bmajor_amt_local);
			rx.add(record, "bsub_amt_local", rec.bsub_amt_local);
			rx.add(record, "bsub_tot_local", rec.bsub_tot_local);
			rx.add(record, "btot_avg", rec.btot_avg);
			rx.add(record, "bdeduct_labor_amt", rec.bdeduct_labor_amt);
			rx.add(record, "bmajor_cost", rec.bmajor_cost);
			rx.add(record, "bsub_cost", rec.bsub_cost);
			rx.add(record, "bprt_labor_cost", rec.bprt_labor_cost);
			rx.add(record, "bsub_tot_cost", rec.bsub_tot_cost);
			rx.add(record, "bmajor_local_cost", rec.bmajor_local_cost);
			rx.add(record, "bsub_local_cost", rec.bsub_local_cost);
			rx.add(record, "tot_local_cost", rec.tot_local_cost);
			rx.add(record, "btot_avg_cost", rec.btot_avg_cost);
			rx.add(record, "bdeduct_labor_cost", rec.bdeduct_labor_cost);
			rx.add(record, "iss_cho", rec.iss_cho);
			rx.add(record, "iss_local", rec.iss_local);
			rx.add(record, "avg_qty", rec.avg_qty);
			//rx.add(record, "major_amt", StringUtil.replaceToXml(rec.major_amt));
			//rx.add(record, "sub_amt", StringUtil.replaceToXml(rec.sub_amt));
			//rx.add(record, "prt_labor_amt", StringUtil.replaceToXml(rec.prt_labor_amt));
			//rx.add(record, "sub_tot", StringUtil.replaceToXml(rec.sub_tot));
			//rx.add(record, "major_amt_local", StringUtil.replaceToXml(rec.major_amt_local));
			//rx.add(record, "sub_amt_local", StringUtil.replaceToXml(rec.sub_amt_local));
			//rx.add(record, "sub_tot_local", StringUtil.replaceToXml(rec.sub_tot_local));
			//rx.add(record, "tot_avg", StringUtil.replaceToXml(rec.tot_avg));
			//rx.add(record, "deduct_labor_amt", StringUtil.replaceToXml(rec.deduct_labor_amt));
			//rx.add(record, "bmajor_amt", StringUtil.replaceToXml(rec.bmajor_amt));
			//rx.add(record, "bsub_amt", StringUtil.replaceToXml(rec.bsub_amt));
			//rx.add(record, "bprt_labor_amt", StringUtil.replaceToXml(rec.bprt_labor_amt));
			//rx.add(record, "bsub_tot", StringUtil.replaceToXml(rec.bsub_tot));
			//rx.add(record, "bmajor_amt_local", StringUtil.replaceToXml(rec.bmajor_amt_local));
			//rx.add(record, "bsub_amt_local", StringUtil.replaceToXml(rec.bsub_amt_local));
			//rx.add(record, "bsub_tot_local", StringUtil.replaceToXml(rec.bsub_tot_local));
			//rx.add(record, "btot_avg", StringUtil.replaceToXml(rec.btot_avg));
			//rx.add(record, "bdeduct_labor_amt", StringUtil.replaceToXml(rec.bdeduct_labor_amt));
			//rx.add(record, "bmajor_cost", StringUtil.replaceToXml(rec.bmajor_cost));
			//rx.add(record, "bsub_cost", StringUtil.replaceToXml(rec.bsub_cost));
			//rx.add(record, "bprt_labor_cost", StringUtil.replaceToXml(rec.bprt_labor_cost));
			//rx.add(record, "bsub_tot_cost", StringUtil.replaceToXml(rec.bsub_tot_cost));
			//rx.add(record, "bmajor_local_cost", StringUtil.replaceToXml(rec.bmajor_local_cost));
			//rx.add(record, "bsub_local_cost", StringUtil.replaceToXml(rec.bsub_local_cost));
			//rx.add(record, "tot_local_cost", StringUtil.replaceToXml(rec.tot_local_cost));
			//rx.add(record, "btot_avg_cost", StringUtil.replaceToXml(rec.btot_avg_cost));
			//rx.add(record, "bdeduct_labor_cost", StringUtil.replaceToXml(rec.bdeduct_labor_cost));
			//rx.add(record, "iss_cho", StringUtil.replaceToXml(rec.iss_cho));
			//rx.add(record, "iss_local", StringUtil.replaceToXml(rec.iss_local));
			//rx.add(record, "avg_qty", StringUtil.replaceToXml(rec.avg_qty));
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
<mc_budg_6141_l>
	<dataSet>
		<CURLIST>
			<record>
				<major_amt/>
				<sub_amt/>
				<prt_labor_amt/>
				<sub_tot/>
				<major_amt_local/>
				<sub_amt_local/>
				<sub_tot_local/>
				<tot_avg/>
				<deduct_labor_amt/>
				<bmajor_amt/>
				<bsub_amt/>
				<bprt_labor_amt/>
				<bsub_tot/>
				<bmajor_amt_local/>
				<bsub_amt_local/>
				<bsub_tot_local/>
				<btot_avg/>
				<bdeduct_labor_amt/>
				<bmajor_cost/>
				<bsub_cost/>
				<bprt_labor_cost/>
				<bsub_tot_cost/>
				<bmajor_local_cost/>
				<bsub_local_cost/>
				<tot_local_cost/>
				<btot_avg_cost/>
				<bdeduct_labor_cost/>
				<iss_cho/>
				<iss_local/>
				<avg_qty/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_6141_l>
*/
%>

<% /* 작성시간 : Sat May 23 15:54:02 KST 2009 */ %>