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
	MT_SUBMATRCLA_3320_LDataSet ds = (MT_SUBMATRCLA_3320_LDataSet)request.getAttribute("ds");
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
			MT_SUBMATRCLA_3320_LCURLISTRecord rec = (MT_SUBMATRCLA_3320_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "chk_yn", rec.chk_yn);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "sub_seq", rec.sub_seq);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "via_dept", rec.via_dept);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "part_cd", rec.part_cd);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "clam_qunt", rec.clam_qunt);
			rx.add(record, "fix_qunt", rec.fix_qunt);
			rx.add(record, "ewh_qunt", rec.ewh_qunt);
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "acpn_dt", rec.acpn_dt);
			rx.add(record, "ewh_clsf", rec.ewh_clsf);
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "via_dept", StringUtil.replaceToXml(rec.via_dept));
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
			//rx.add(record, "clam_qunt", StringUtil.replaceToXml(rec.clam_qunt));
			//rx.add(record, "fix_qunt", StringUtil.replaceToXml(rec.fix_qunt));
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
<mt_common_matr_0004_l>
	<dataSet>
		<CURLIST>
			<record>
				<occr_dt/>
				<seq/>
				<dept_cd/>
				<via_dept/>
				<matr_cd/>
				<matr_nm/>
				<clam_qunt/>
				<fix_qunt/>
			</record>
		</CURLIST>
	</dataSet>
</mt_common_matr_0004_l>
*/
%>

<% /* 작성시간 : Sun Nov 29 19:50:18 KST 2009 */ %>