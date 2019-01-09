<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.cost.rec.*
	,	chosun.ciis.hd.cost.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_COST_1700_LDataSet ds = (HD_COST_1700_LDataSet)request.getAttribute("ds");
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
			HD_COST_1700_LCURLISTRecord rec = (HD_COST_1700_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.addCData(record, "dept_nm", rec.dept_nm);
			rx.add(record, "decid_yymm", rec.decid_yymm);
			rx.add(record, "deal_dt", rec.deal_dt);
			rx.add(record, "card_type", rec.card_type);
			rx.add(record, "vaca_frdt", rec.vaca_frdt);
			rx.add(record, "vaca_todt", rec.vaca_todt);
			rx.add(record, "vaca_dds", rec.vaca_dds);
			rx.add(record, "vaca_clsf", rec.vaca_clsf);
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
<hd_cost_1700_l>
	<dataSet>
		<CURLIST>
			<record>
				<save/>
				<dept_nm/>
				<emp_no/>
				<flnm/>
				<dty_nm/>
				<posi_nm/>
				<card_no/>
				<decid_dt/>
				<deal_dt/>
				<deal_amt/>
				<use_plac/>
				<occr_dt/>
				<actu_slip_no/>
				<proc_clsf_nm/>
				<remk_2/>
				<card_type/>
				<dept_cd/>
				<dty_cd/>
				<posi_cd/>
				<decid_yymm/>
				<seq/>
			</record>
		</CURLIST>
	</dataSet>
</hd_cost_1700_l>
*/
%>

<% /* 작성시간 : Tue Oct 26 09:43:35 KST 2010 */ %>