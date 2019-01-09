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
	MT_SUBMATRCLA_3201_LDataSet ds = (MT_SUBMATRCLA_3201_LDataSet)request.getAttribute("ds");
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
			MT_SUBMATRCLA_3201_LCURLISTRecord rec = (MT_SUBMATRCLA_3201_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cnt", StringUtil.replaceToXml(rec.cnt));
			rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			rx.add(record, "clam_actu_cd", StringUtil.replaceToXml(rec.clam_actu_cd));
			rx.add(record, "item_nm", StringUtil.replaceToXml(rec.item_nm));
			rx.add(record, "aplc_pers", StringUtil.replaceToXml(rec.aplc_pers));
			rx.add(record, "via_dept", StringUtil.replaceToXml(rec.via_dept));
			rx.add(record, "via_dept_cnfm_yn", StringUtil.replaceToXml(rec.via_dept_cnfm_yn));
			rx.add(record, "misno_actu", StringUtil.replaceToXml(rec.misno_actu));
			rx.add(record, "acpn_dt", StringUtil.replaceToXml(rec.acpn_dt));
			rx.add(record, "rid_tel_no", StringUtil.replaceToXml(rec.rid_tel_no));
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "cnt", rec.cnt);
			//rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//rx.add(record, "occr_dt", rec.occr_dt);
			//rx.add(record, "seq", rec.seq);
			//rx.add(record, "dept_cd", rec.dept_cd);
			//rx.add(record, "clam_actu_cd", rec.clam_actu_cd);
			//rx.add(record, "item_nm", rec.item_nm);
			//rx.add(record, "aplc_pers", rec.aplc_pers);
			//rx.add(record, "via_dept", rec.via_dept);
			//rx.add(record, "via_dept_cnfm_yn", rec.via_dept_cnfm_yn);
			//rx.add(record, "misno_actu", rec.misno_actu);
			//rx.add(record, "acpn_dt", rec.acpn_dt);
			//rx.add(record, "misno_matr", rec.misno_matr);
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
<mt_submatrcla_1110_l>
	<dataSet>
		<CURLIST>
			<record>
				<cnt/>
				<cmpy_cd/>
				<occr_dt/>
				<seq/>
				<dept_cd/>
				<clam_actu_cd/>
				<item_nm/>
				<aplc_pers/>
				<via_dept/>
				<via_dept_cnfm_yn/>
				<misno_actu/>
				<acpn_dt/>
				<misno_matr/>
			</record>
		</CURLIST>
	</dataSet>
</mt_submatrcla_1110_l>
*/
%>

<% /* 작성시간 : Thu Jul 09 15:07:26 KST 2009 */ %>