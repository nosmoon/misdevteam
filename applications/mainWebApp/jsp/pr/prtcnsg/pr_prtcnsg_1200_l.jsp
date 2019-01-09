<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pr.prtcnsg.rec.*
	,	chosun.ciis.pr.prtcnsg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PRTCNSG_1200_LDataSet ds = (PR_PRTCNSG_1200_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");
//System.out.println("ds.curlist.size() =>"+ds.curlist.size());
		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PRTCNSG_1200_LCURLISTRecord rec = (PR_PRTCNSG_1200_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "day", "");
			rx.add(record, "issu_qty", rec.issu_qty);
			rx.add(record, "bw_pcnt", rec.bw_pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "film_use_qunt", rec.film_use_qunt);
			rx.add(record, "u_1", rec.u_1);
			rx.add(record, "n_1", rec.n_1);
			rx.add(record, "u_2", rec.u_2);
			rx.add(record, "n_2", rec.n_2);
			rx.add(record, "u_4", rec.u_4);
			rx.add(record, "n_4", rec.n_4);
			rx.add(record, "u_m2", rec.u_m2);
			rx.add(record, "n_m2", rec.n_m2);
			rx.add(record, "u_m4", rec.u_m4);
			rx.add(record, "n_m4", rec.n_m4);
			rx.add(record, "prt_fee", rec.prt_fee);
			rx.add(record, "paper_wgt", rec.paper_wgt);
			rx.add(record, "paper_amt", rec.paper_amt);
			rx.add(record, "psplat_use_amt", rec.psplat_use_amt);
			rx.add(record, "gnaw_fee", rec.gnaw_fee);
			rx.add(record, "film_make_fee", rec.film_make_fee);
			rx.add(record, "pack_fee", rec.pack_fee);
			rx.add(record, "paper_portage", rec.paper_portage);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			//rx.add(record, "total",Integer.parseInt(rec.prt_fee)+Integer.parseInt(rec.psplat_use_amt)+Integer.parseInt(rec.gnaw_fee)+Integer.parseInt(rec.film_make_fee));
			rx.add(record, "total", rec.total);
			//rx.add(record, "issu_dt", StringUtil.replaceToXml(rec.issu_dt));
			//rx.add(record, "issu_qty", StringUtil.replaceToXml(rec.issu_qty));
			//rx.add(record, "bw_pcnt", StringUtil.replaceToXml(rec.bw_pcnt));
			//rx.add(record, "clr_pcnt", StringUtil.replaceToXml(rec.clr_pcnt));
			//rx.add(record, "film_use_qunt", StringUtil.replaceToXml(rec.film_use_qunt));
			//rx.add(record, "u_1", StringUtil.replaceToXml(rec.u_1));
			//rx.add(record, "n_1", StringUtil.replaceToXml(rec.n_1));
			//rx.add(record, "u_2", StringUtil.replaceToXml(rec.u_2));
			//rx.add(record, "n_2", StringUtil.replaceToXml(rec.n_2));
			//rx.add(record, "u_4", StringUtil.replaceToXml(rec.u_4));
			//rx.add(record, "n_4", StringUtil.replaceToXml(rec.n_4));
			//rx.add(record, "u_m2", StringUtil.replaceToXml(rec.u_m2));
			//rx.add(record, "n_m2", StringUtil.replaceToXml(rec.n_m2));
			//rx.add(record, "u_m4", StringUtil.replaceToXml(rec.u_m4));
			//rx.add(record, "n_m4", StringUtil.replaceToXml(rec.n_m4));
			//rx.add(record, "prt_fee", StringUtil.replaceToXml(rec.prt_fee));
			//rx.add(record, "paper_wgt_1", StringUtil.replaceToXml(rec.paper_wgt_1));
			//rx.add(record, "paper_wgt", StringUtil.replaceToXml(rec.paper_wgt));
			//rx.add(record, "psplat_use_amt", StringUtil.replaceToXml(rec.psplat_use_amt));
			//rx.add(record, "gnaw_fee", StringUtil.replaceToXml(rec.gnaw_fee));
			//rx.add(record, "film_make_fee", StringUtil.replaceToXml(rec.film_make_fee));
			//rx.add(record, "pack_fee", StringUtil.replaceToXml(rec.pack_fee));
			//rx.add(record, "paper_portage", StringUtil.replaceToXml(rec.paper_portage));
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
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
TrustForm�� Instance ����ο� �����ؼ� ���
<pr_prtcnsg_1200_l>
	<dataSet>
		<CURLIST>
			<record>
				<issu_dt/>
				<issu_qty/>
				<bw_pcnt/>
				<clr_pcnt/>
				<film_use_qunt/>
				<u_1/>
				<n_1/>
				<u_2/>
				<n_2/>
				<u_4/>
				<n_4/>
				<u_m2/>
				<n_m2/>
				<u_m4/>
				<n_m4/>
				<prt_fee/>
				<paper_wgt_1/>
				<paper_wgt/>
				<psplat_use_amt/>
				<gnaw_fee/>
				<film_make_fee/>
				<pack_fee/>
				<paper_portage/>
				<cmpy_cd/>
				<occr_dt/>
				<seq/>
			</record>
		</CURLIST>
	</dataSet>
</pr_prtcnsg_1200_l>
*/
%>

<% /* �ۼ��ð� : Thu May 21 16:17:12 KST 2009 */ %>