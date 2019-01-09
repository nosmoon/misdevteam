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
	MT_SUBMATRCLA_3202_LDataSet ds = (MT_SUBMATRCLA_3202_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "dataSet", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_SUBMATRCLA_3202_LCURLISTRecord rec = (MT_SUBMATRCLA_3202_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "part_cd", StringUtil.replaceToXml(rec.part_cd));
			rx.addCData(record, "part_nm", StringUtil.replaceToXml(rec.part_nm));
			rx.addCData(record, "item_nm", rec.item_nm);
			rx.addCData(record, "std", rec.std);
			rx.add(record, "unit", rec.unit);
			rx.add(record, "clam_qunt", rec.clam_qunt);
			rx.add(record, "usag", rec.usag);
			rx.add(record, "pay_posb_dt", rec.pay_posb_dt);
			rx.add(record, "fix_qunt", rec.fix_qunt);
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "res_yn", rec.res_yn);
			rx.add(record, "recp_pers", rec.recp_pers);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "job_cntc_no", rec.job_cntc_no);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "sub_seq", rec.sub_seq);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "misno_matr", rec.misno_matr);
			rx.add(record, "acpn_dt", rec.acpn_dt);
			rx.add(record, "clam_clsf", rec.clam_clsf);
			rx.add(record, "paper_clsf", rec.paper_clsf);
			rx.add(record, "dlco_no", StringUtil.replaceToXml(rec.dlco_no));
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "ern", StringUtil.replaceToXml(rec.ern));
			rx.add(record, "frex_unit", rec.frex_unit);																		
			rx.add(record, "frex_uprc", rec.frex_uprc);				
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "item_nm", StringUtil.replaceToXml(rec.item_nm));
			//rx.add(record, "std", StringUtil.replaceToXml(rec.std));
			//rx.add(record, "unit", StringUtil.replaceToXml(rec.unit));
			//rx.add(record, "clam_qunt", StringUtil.replaceToXml(rec.clam_qunt));
			//rx.add(record, "usag", StringUtil.replaceToXml(rec.usag));
			//rx.add(record, "pay_posb_dt", StringUtil.replaceToXml(rec.pay_posb_dt));
			//rx.add(record, "fix_qunt", StringUtil.replaceToXml(rec.fix_qunt));
			//rx.add(record, "uprc", StringUtil.replaceToXml(rec.uprc));
			//rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
			//rx.add(record, "res_yn", StringUtil.replaceToXml(rec.res_yn));
			//rx.add(record, "recp_pers", StringUtil.replaceToXml(rec.recp_pers));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "job_cntc_no", StringUtil.replaceToXml(rec.job_cntc_no));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "sub_seq", StringUtil.replaceToXml(rec.sub_seq));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "misno_matr", StringUtil.replaceToXml(rec.misno_matr));
			//rx.add(record, "apcn_dt", StringUtil.replaceToXml(rec.apcn_dt));
			//rx.add(record, "clam_clsf", StringUtil.replaceToXml(rec.clam_clsf));
			//rx.add(record, "paper_clsf", StringUtil.replaceToXml(rec.paper_clsf));
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
<mt_submatrcla_3202_l>
	<dataSet>
		<CURLIST>
			<record>
				<matr_cd/>
				<item_nm/>
				<std/>
				<unit/>
				<clam_qunt/>
				<usag/>
				<pay_posb_dt/>
				<fix_qunt/>
				<uprc/>
				<amt/>
				<res_yn/>
				<recp_pers/>
				<nm_korn/>
				<job_cntc_no/>
				<remk/>
				<sub_seq/>
				<seq/>
				<occr_dt/>
				<misno_matr/>
				<apcn_dt/>
				<clam_clsf/>
				<paper_clsf/>
			</record>
		</CURLIST>
	</dataSet>
</mt_submatrcla_3202_l>
*/
%>

<% /* 작성시간 : Tue Mar 10 17:59:16 KST 2015 */ %>