<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.etcimpt.rec.*
	,	chosun.ciis.mt.etcimpt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCIMPT_1210_LDataSet ds = (MT_ETCIMPT_1210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_ETCIMPT_1210_LCURLIST2Record rec = (MT_ETCIMPT_1210_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			rx.add(record, "impt_occr_cost", StringUtil.replaceToXml(rec.impt_occr_cost));
			rx.add(record, "vat_clsf", StringUtil.replaceToXml(rec.vat_clsf));
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			rx.add(record, "yy", StringUtil.replaceToXml(rec.yy));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "leas_clsf", StringUtil.replaceToXml(rec.leas_clsf));
			rx.add(record, "sub_seq", StringUtil.replaceToXml(rec.sub_seq));
			//rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "impt_occr_cost", rec.impt_occr_cost);
			//rx.add(record, "vat_clsf", rec.vat_clsf);
			//rx.add(record, "remk", rec.remk);
			//rx.add(record, "yy", rec.yy);
			//rx.add(record, "seq", rec.seq);
			//rx.add(record, "leas_clsf", rec.leas_clsf);
			//rx.add(record, "sub_seq", rec.sub_seq);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_ETCIMPT_1210_LCURLIST1Record rec = (MT_ETCIMPT_1210_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			rx.add(record, "yy", StringUtil.replaceToXml(rec.yy));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "leas_clsf", StringUtil.replaceToXml(rec.leas_clsf));
			rx.add(record, "sub_seq", StringUtil.replaceToXml(rec.sub_seq));
			rx.add(record, "cost_case_titl", StringUtil.replaceToXml(rec.cost_case_titl));
			rx.add(record, "real_ship_dt", StringUtil.replaceToXml(rec.real_ship_dt));
			rx.add(record, "ship_port", StringUtil.replaceToXml(rec.ship_port));
			rx.add(record, "ariv_port", StringUtil.replaceToXml(rec.ariv_port));
			rx.add(record, "entr_dt", StringUtil.replaceToXml(rec.entr_dt));
			rx.add(record, "ewh_amt", StringUtil.replaceToXml(rec.ewh_amt));
			//rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//rx.add(record, "yy", rec.yy);
			//rx.add(record, "seq", rec.seq);
			//rx.add(record, "leas_clsf", rec.leas_clsf);
			//rx.add(record, "sub_seq", rec.sub_seq);
			//rx.add(record, "cost_case_titl", rec.cost_case_titl);
			//rx.add(record, "real_ship_dt", rec.real_ship_dt);
			//rx.add(record, "ship_port", rec.ship_port);
			//rx.add(record, "ariv_port", rec.ariv_port);
			//rx.add(record, "entr_dt", rec.entr_dt);
			//rx.add(record, "ewh_amt", rec.ewh_amt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
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
<mt_etcimpt_1210_l>
	<dataSet>
		<CURLIST2>
			<record>
				<cd/>
				<cd_abrv_nm/>
				<impt_occr_cost/>
				<vat_clsf/>
				<remk/>
				<yy/>
				<seq/>
				<leas_clsf/>
				<sub_seq/>
			</record>
		</CURLIST2>
	</dataSet>
</mt_etcimpt_1210_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_etcimpt_1210_l>
	<dataSet>
		<CURLIST1>
			<record>
				<cmpy_cd/>
				<yy/>
				<seq/>
				<leas_clsf/>
				<sub_seq/>
				<cost_case_titl/>
				<real_ship_dt/>
				<ship_port/>
				<ariv_port/>
				<entr_dt/>
				<ewh_amt/>
			</record>
		</CURLIST1>
	</dataSet>
</mt_etcimpt_1210_l>
*/
%>

<% /* 작성시간 : Sat Jul 04 18:33:51 KST 2009 */ %>