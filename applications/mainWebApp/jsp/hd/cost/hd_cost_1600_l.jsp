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
	HD_COST_1600_LDataSet ds = (HD_COST_1600_LDataSet)request.getAttribute("ds");
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
			HD_COST_1600_LCURLISTRecord rec = (HD_COST_1600_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "hd_mang_dty_nm", rec.hd_mang_dty_nm);
			rx.add(record, "deal_dt", rec.deal_dt);
			rx.add(record, "deal_day", rec.deal_day);
			rx.addCData(record, "use_plac", rec.use_plac);
			rx.add(record, "deal_amt", rec.deal_amt);
			rx.addCData(record, "remk_2", rec.remk_2);
			rx.add(record, "slip_proc_mang", rec.slip_proc_mang);
			rx.add(record, "actu_slip_no", rec.actu_slip_no);
			rx.add(record, "proc_clsf_nm", rec.proc_clsf_nm);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "hd_mang_dty_nm", StringUtil.replaceToXml(rec.hd_mang_dty_nm));
			//rx.add(record, "deal_dt", StringUtil.replaceToXml(rec.deal_dt));
			//rx.add(record, "deal_day", StringUtil.replaceToXml(rec.deal_day));
			//rx.add(record, "use_plac", StringUtil.replaceToXml(rec.use_plac));
			//rx.add(record, "deal_amt", StringUtil.replaceToXml(rec.deal_amt));
			//rx.add(record, "remk_2", StringUtil.replaceToXml(rec.remk_2));
			//rx.add(record, "slip_proc_mang", StringUtil.replaceToXml(rec.slip_proc_mang));
			//rx.add(record, "actu_slip_no", StringUtil.replaceToXml(rec.actu_slip_no));
			//rx.add(record, "proc_clsf_nm", StringUtil.replaceToXml(rec.proc_clsf_nm));
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
<hd_cost_1600_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<flnm/>
				<dept_nm/>
				<dty_nm/>
				<posi_nm/>
				<hd_mang_dty_nm/>
				<deal_dt/>
				<deal_day/>
				<use_plac/>
				<deal_amt/>
				<remk_2/>
				<slip_proc_mang/>
				<actu_slip_no/>
				<proc_clsf_nm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_cost_1600_l>
*/
%>

<% /* 작성시간 : Fri Jan 28 12:45:32 KST 2011 */ %>