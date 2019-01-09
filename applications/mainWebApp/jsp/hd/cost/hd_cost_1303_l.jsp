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
	HD_COST_1303_LDataSet ds = (HD_COST_1303_LDataSet)request.getAttribute("ds");
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
			HD_COST_1303_LCURLISTRecord rec = (HD_COST_1303_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "save", rec.save);
			rx.addCData(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dept_cd", rec.emp_no);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "card_no", rec.card_no);
			rx.add(record, "decid_dt", rec.decid_dt);
			rx.add(record, "deal_dt", rec.deal_dt);
			rx.add(record, "deal_amt", rec.deal_amt);
			rx.addCData(record, "use_plac", rec.use_plac);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "actu_slip_no", rec.actu_slip_no);
			rx.add(record, "proc_clsf_nm", rec.proc_clsf_nm);
			rx.addCData(record, "remk_2", rec.remk_2); 
			rx.add(record, "card_type", rec.card_type);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "decid_yymm", rec.decid_yymm);
			rx.add(record, "seq", rec.seq);
			//rx.add(record, "save", StringUtil.replaceToXml(rec.save));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "card_no", StringUtil.replaceToXml(rec.card_no));
			//rx.add(record, "decid_dt", StringUtil.replaceToXml(rec.decid_dt));
			//rx.add(record, "deal_dt", StringUtil.replaceToXml(rec.deal_dt));
			//rx.add(record, "deal_amt", StringUtil.replaceToXml(rec.deal_amt));
			//rx.add(record, "use_plac", StringUtil.replaceToXml(rec.use_plac));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "actu_slip_no", StringUtil.replaceToXml(rec.actu_slip_no));
			//rx.add(record, "proc_clsf_nm", StringUtil.replaceToXml(rec.proc_clsf_nm));
			//rx.add(record, "remk_2", StringUtil.replaceToXml(rec.remk_2));
			//rx.add(record, "card_type", StringUtil.replaceToXml(rec.card_type));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "decid_yymm", StringUtil.replaceToXml(rec.decid_yymm));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
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
<hd_cost_1303_l>
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
</hd_cost_1303_l>
*/
%>

<% /* 작성시간 : Tue Oct 26 09:43:35 KST 2010 */ %>