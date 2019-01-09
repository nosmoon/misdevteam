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
	MT_SUBMATRCLA_1101_LDataSet ds = (MT_SUBMATRCLA_1101_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_SUBMATRCLA_1101_LCURLIST3Record rec = (MT_SUBMATRCLA_1101_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "doc_date", StringUtil.replaceToXml(rec.doc_date));
			rx.add(record, "doc_time", StringUtil.replaceToXml(rec.doc_time));
			//rx.add(record, "doc_date", rec.doc_date);
			//rx.add(record, "doc_time", rec.doc_time);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_SUBMATRCLA_1101_LCURLIST2Record rec = (MT_SUBMATRCLA_1101_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "tot_amt", StringUtil.replaceToXml(rec.tot_amt));
			rx.add(record, "month_tot_amt", StringUtil.replaceToXml(rec.month_tot_amt));
			//rx.add(record, "tot_amt", rec.tot_amt);
			//rx.add(record, "month_tot_amt", rec.month_tot_amt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_SUBMATRCLA_1101_LCURLIST1Record rec = (MT_SUBMATRCLA_1101_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			rx.add(record, "item_nm", StringUtil.replaceToXml(rec.item_nm));
			rx.add(record, "std", StringUtil.replaceToXml(rec.std));
			rx.add(record, "uprc", StringUtil.replaceToXml(rec.uprc));
			rx.add(record, "clam_qunt", StringUtil.replaceToXml(rec.clam_qunt));
			rx.add(record, "fix_qunt", StringUtil.replaceToXml(rec.fix_qunt));
			rx.add(record, "unit", StringUtil.replaceToXml(rec.unit));
			rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
			rx.add(record, "usag", StringUtil.replaceToXml(rec.usag));
			rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "dept_nm", rec.dept_nm);
			//rx.add(record, "matr_cd", rec.matr_cd);
			//rx.add(record, "item_nm", rec.item_nm);
			//rx.add(record, "std", rec.std);
			//rx.add(record, "uprc", rec.uprc);
			//rx.add(record, "clam_qunt", rec.clam_qunt);
			//rx.add(record, "fix_qunt", rec.fix_qunt);
			//rx.add(record, "unit", rec.unit);
			//rx.add(record, "amt", rec.amt);
			//rx.add(record, "usag", rec.usag);
			//rx.add(record, "occr_dt", rec.occr_dt);
			//rx.add(record, "seq", rec.seq);
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
<mt_submatrcla_1101_l>
	<dataSet>
		<CURLIST3>
			<record>
				<doc_date/>
				<doc_time/>
			</record>
		</CURLIST3>
	</dataSet>
</mt_submatrcla_1101_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_submatrcla_1101_l>
	<dataSet>
		<CURLIST2>
			<record>
				<tot_amt/>
				<month_tot_amt/>
			</record>
		</CURLIST2>
	</dataSet>
</mt_submatrcla_1101_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_submatrcla_1101_l>
	<dataSet>
		<CURLIST1>
			<record>
				<dept_nm/>
				<matr_cd/>
				<item_nm/>
				<std/>
				<uprc/>
				<clam_qunt/>
				<fix_qunt/>
				<unit/>
				<amt/>
				<usag/>
				<occr_dt/>
				<seq/>
			</record>
		</CURLIST1>
	</dataSet>
</mt_submatrcla_1101_l>
*/
%>

<% /* 작성시간 : Fri Jul 10 19:38:19 KST 2009 */ %>