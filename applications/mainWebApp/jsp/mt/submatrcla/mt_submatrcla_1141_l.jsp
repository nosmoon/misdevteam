<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.submatrcla.rec.*
	,	chosun.ciis.mt.submatrcla.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATRCLA_1141_LDataSet ds = (MT_SUBMATRCLA_1141_LDataSet)request.getAttribute("ds");
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
			MT_SUBMATRCLA_1141_LCURLISTRecord rec = (MT_SUBMATRCLA_1141_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			rx.add(record, "item_nm", StringUtil.replaceToXml(rec.item_nm));
			rx.add(record, "std", StringUtil.replaceToXml(rec.std));
			rx.add(record, "uprc", StringUtil.replaceToXml(rec.uprc));
			rx.add(record, "clam_qunt", StringUtil.replaceToXml(rec.clam_qunt));
			rx.add(record, "fix_qunt", StringUtil.replaceToXml(rec.fix_qunt));
			rx.add(record, "unit", StringUtil.replaceToXml(rec.unit));
			rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
			rx.add(record, "usag", StringUtil.replaceToXml(rec.usag));
			rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			rx.add(record, "clam_actu_cd", StringUtil.replaceToXml(rec.clam_actu_cd));
			rx.add(record, "res_yn", StringUtil.replaceToXml(rec.res_yn));
			rx.add(record, "acpn_dt", StringUtil.replaceToXml(rec.acpn_dt));
			rx.add(record, "via_dept_cnfm_yn", StringUtil.replaceToXml(rec.via_dept_cnfm_yn));
			rx.add(record, "job_cntc_no", StringUtil.replaceToXml(rec.job_cntc_no));
			rx.add(record, "buy_proc_stat", StringUtil.replaceToXml(rec.buy_proc_stat));
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			rx.add(record, "seq",  "");
			//rx.add(record, "occr_dt", rec.occr_dt);
			//rx.add(record, "item_nm", rec.item_nm);
			//rx.add(record, "std", rec.std);
			//rx.add(record, "uprc", rec.uprc);
			//rx.add(record, "clam_qunt", rec.clam_qunt);
			//rx.add(record, "fix_qunt", rec.fix_qunt);
			//rx.add(record, "unit", rec.unit);
			//rx.add(record, "amt", rec.amt);
			//rx.add(record, "usag", rec.usag);
			//rx.add(record, "dept_cd", rec.dept_cd);
			//rx.add(record, "clam_actu_cd", rec.clam_actu_cd);
			//rx.add(record, "res_yn", rec.res_yn);
			//rx.add(record, "acpn_dt", rec.acpn_dt);
			//rx.add(record, "via_dept_cnfm_yn", rec.via_dept_cnfm_yn);
			//rx.add(record, "job_cntc_no", rec.job_cntc_no);
			//rx.add(record, "buy_proc_stat", rec.buy_proc_stat);
			//rx.add(record, "remk", rec.remk);
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
<mt_submatrcla_1141_l>
	<dataSet>
		<CURLIST>
			<record>
				<occr_dt/>
				<item_nm/>
				<std/>
				<uprc/>
				<clam_qunt/>
				<fix_qunt/>
				<unit/>
				<amt/>
				<usag/>
				<dept_cd/>
				<clam_actu_cd/>
				<res_yn/>
				<acpn_dt/>
				<via_dept_cnfm_yn/>
				<job_cntc_no/>
				<buy_proc_stat/>
				<remk/>
			</record>
		</CURLIST>
	</dataSet>
</mt_submatrcla_1141_l>
*/
%>

<% /* 작성시간 : Sat Jul 11 17:17:26 KST 2009 */ %>