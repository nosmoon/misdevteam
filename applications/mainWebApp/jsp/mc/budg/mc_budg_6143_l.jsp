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
	MC_BUDG_6143_LDataSet ds = (MC_BUDG_6143_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_6143_LCURLISTRecord rec = (MC_BUDG_6143_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "area_clsf", rec.area_clsf);
			rx.add(record, "paper_amt", rec.paper_amt);
			rx.add(record, "submat_amt", rec.submat_amt);
			rx.add(record, "prt_amt", rec.prt_amt);
			rx.add(record, "non_dduc_paper_amt", rec.non_dduc_paper_amt);
			rx.add(record, "non_dduc_submat_amt", rec.non_dduc_submat_amt);
			rx.add(record, "non_dduc_prt_amt", rec.non_dduc_prt_amt);
			rx.add(record, "paper_amt_cost", rec.paper_amt_cost);
			rx.add(record, "submat_amt_cost", rec.submat_amt_cost);
			rx.add(record, "prt_amt_cost", rec.prt_amt_cost);
			rx.add(record, "pcnt_cost", rec.pcnt_cost);
			rx.add(record, "cho_issu_cnt", rec.cho_issu_cnt);
			rx.add(record, "local_issu_cnt", rec.local_issu_cnt);
			rx.add(record, "avg_cnt", rec.avg_cnt);
			//rx.add(record, "area_clsf", StringUtil.replaceToXml(rec.area_clsf));
			//rx.add(record, "paper_amt", StringUtil.replaceToXml(rec.paper_amt));
			//rx.add(record, "submat_amt", StringUtil.replaceToXml(rec.submat_amt));
			//rx.add(record, "prt_amt", StringUtil.replaceToXml(rec.prt_amt));
			//rx.add(record, "non_dduc_paper_amt", StringUtil.replaceToXml(rec.non_dduc_paper_amt));
			//rx.add(record, "non_dduc_submat_amt", StringUtil.replaceToXml(rec.non_dduc_submat_amt));
			//rx.add(record, "non_dduc_prt_amt", StringUtil.replaceToXml(rec.non_dduc_prt_amt));
			//rx.add(record, "paper_amt_cost", StringUtil.replaceToXml(rec.paper_amt_cost));
			//rx.add(record, "submat_amt_cost", StringUtil.replaceToXml(rec.submat_amt_cost));
			//rx.add(record, "prt_amt_cost", StringUtil.replaceToXml(rec.prt_amt_cost));
			//rx.add(record, "pcnt_cost", StringUtil.replaceToXml(rec.pcnt_cost));
			//rx.add(record, "cho_issu_cnt", StringUtil.replaceToXml(rec.cho_issu_cnt));
			//rx.add(record, "local_issu_cnt", StringUtil.replaceToXml(rec.local_issu_cnt));
			//rx.add(record, "avg_cnt", StringUtil.replaceToXml(rec.avg_cnt));
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
<mc_budg_6143_l>
	<dataSet>
		<CURLIST>
			<record>
				<area_clsf/>
				<paper_amt/>
				<submat_amt/>
				<prt_amt/>
				<non_dduc_paper_amt/>
				<non_dduc_submat_amt/>
				<non_dduc_prt_amt/>
				<paper_amt_cost/>
				<submat_amt_cost/>
				<prt_amt_cost/>
				<pcnt_cost/>
				<cho_issu_cnt/>
				<local_issu_cnt/>
				<avg_cnt/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_6143_l>
*/
%>

<% /* 작성시간 : Fri May 22 10:30:48 KST 2009 */ %>