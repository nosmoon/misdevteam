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
	MT_SUBMATRCLA_3501_LDataSet ds = (MT_SUBMATRCLA_3501_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_SUBMATRCLA_3501_LCURLISTRecord rec = (MT_SUBMATRCLA_3501_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "sub_seq", rec.sub_seq);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "via_dept", rec.via_dept);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.addCData(record, "matr_nm", rec.matr_nm);
			rx.add(record, "part_cd", rec.part_cd);
			rx.addCData(record, "part_nm", rec.part_nm);
			rx.add(record, "clam_qunt", rec.clam_qunt);
			rx.add(record, "fix_qunt", rec.fix_qunt);
			rx.add(record, "ewh_qunt", rec.ewh_qunt);
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "unit", rec.unit);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "std_modl", rec.std_modl);
			rx.add(record, "acpn_dt", rec.acpn_dt);
			rx.add(record, "usag", rec.usag);
			rx.add(record, "stok", rec.stok);
			rx.add(record, "ewh_clsf", rec.ewh_clsf);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "part_clas1_nm", rec.part_clas1_nm);
			rx.addCData(record, "maker", rec.maker);
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "sub_seq", StringUtil.replaceToXml(rec.sub_seq));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "via_dept", StringUtil.replaceToXml(rec.via_dept));
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
			//rx.add(record, "part_cd", StringUtil.replaceToXml(rec.part_cd));
			//rx.add(record, "part_nm", StringUtil.replaceToXml(rec.part_nm));
			//rx.add(record, "clam_qunt", StringUtil.replaceToXml(rec.clam_qunt));
			//rx.add(record, "fix_qunt", StringUtil.replaceToXml(rec.fix_qunt));
			//rx.add(record, "ewh_qunt", StringUtil.replaceToXml(rec.ewh_qunt));
			//rx.add(record, "uprc", StringUtil.replaceToXml(rec.uprc));
			//rx.add(record, "unit", StringUtil.replaceToXml(rec.unit));
			//rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
			//rx.add(record, "std_modl", StringUtil.replaceToXml(rec.std_modl));
			//rx.add(record, "acpn_dt", StringUtil.replaceToXml(rec.acpn_dt));
			//rx.add(record, "usag", StringUtil.replaceToXml(rec.usag));
			//rx.add(record, "stok", StringUtil.replaceToXml(rec.stok));
			//rx.add(record, "ewh_clsf", StringUtil.replaceToXml(rec.ewh_clsf));
			//rx.add(record, "dlco_no", StringUtil.replaceToXml(rec.dlco_no));
			//rx.add(record, "ern", StringUtil.replaceToXml(rec.ern));
			//rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			//rx.add(record, "part_clas1_nm", StringUtil.replaceToXml(rec.part_clas1_nm));
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
<mt_submatrcla_3501_l>
	<dataSet>
		<CURLIST>
			<record>
				<occr_dt/>
				<seq/>
				<sub_seq/>
				<dept_cd/>
				<via_dept/>
				<matr_cd/>
				<matr_nm/>
				<part_cd/>
				<part_nm/>
				<clam_qunt/>
				<fix_qunt/>
				<ewh_qunt/>
				<uprc/>
				<unit/>
				<amt/>
				<std_modl/>
				<acpn_dt/>
				<usag/>
				<stok/>
				<ewh_clsf/>
				<dlco_no/>
				<ern/>
				<dlco_nm/>
				<part_clas1_nm/>
			</record>
		</CURLIST>
	</dataSet>
</mt_submatrcla_3501_l>
*/
%>

<% /* 작성시간 : Fri Jul 29 18:47:30 KST 2016 */ %>