<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.rpt.rec.*
	,	chosun.ciis.is.rpt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_RPT_1210_LDataSet ds = (IS_RPT_1210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_RPT_1210_LCURLIST1Record rec = (IS_RPT_1210_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "sale_clsf_nm", rec.sale_clsf_nm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "dm_tgt_amt", rec.dm_tgt_amt);
			rx.add(record, "dm_rst_amt", rec.dm_rst_amt);
			//rx.add(record, "dm_d_rate", rec.dm_d_rate);
			rx.add(record, "dm_d_rate", DigitUtil.cutUnderPoint(rec.dm_d_rate,2));
			rx.add(record, "dm_tgt_amt_s", rec.dm_tgt_amt_s);
			rx.add(record, "dm_rst_amt_s", rec.dm_rst_amt_s);
			//rx.add(record, "dm_d_rate_s", rec.dm_d_rate_s);
			rx.add(record, "dm_d_rate_s", DigitUtil.cutUnderPoint(rec.dm_d_rate_s,2));
			rx.add(record, "ty_tgt_amt", rec.ty_tgt_amt);
			rx.add(record, "ny_tgt_amt", rec.ny_tgt_amt);
			rx.add(record, "ny_rst_amt", rec.ny_rst_amt);
			//rx.add(record, "ny_d_rate", rec.ny_d_rate);
			rx.add(record, "ny_d_rate", DigitUtil.cutUnderPoint(rec.ny_d_rate,2));
			rx.add(record, "pl_rst_amt", rec.pl_rst_amt);
		}
		/****** CURLIST1 END */
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<is_rpt_1210_l>
	<dataSet>
		<CURLIST1>
			<record>
				<dept_cd/>
				<dept_cd_nm/>
				<dm_tgt_amt/>
				<dm_rst_amt/>
				<dm_d_rate/>
				<dm_tgt_amt_s/>
				<dm_rst_amt_s/>
				<dm_d_rate_s/>
				<ty_tgt_amt/>
				<ny_tgt_amt/>
				<ny_rst_amt/>
				<ny_d_rate/>
				<pl_rst_amt/>
			</record>
		</CURLIST1>
	</dataSet>
</is_rpt_1210_l>
*/
%>

<% /* 작성시간 : Mon Jun 04 14:45:24 KST 2012 */ %>