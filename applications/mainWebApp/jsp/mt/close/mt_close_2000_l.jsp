<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.close.rec.*
	,	chosun.ciis.mt.close.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_CLOSE_2000_LDataSet ds = (MT_CLOSE_2000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_CLOSE_2000_LCURLIST1Record rec = (MT_CLOSE_2000_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "o_bi", rec.o_bi);
			rx.add(record, "o_qunt", rec.o_qunt);
			rx.add(record, "o_amt", rec.o_amt);
			rx.add(record, "s_bi", rec.s_bi);
			rx.add(record, "s_qunt", rec.s_qunt);
			rx.add(record, "s_amt", rec.s_amt);
			rx.add(record, "b_bi", rec.b_bi);
			rx.add(record, "b_qunt", rec.b_qunt);
			rx.add(record, "b_amt", rec.b_amt);
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
			//rx.add(record, "fac_clsf_nm", StringUtil.replaceToXml(rec.fac_clsf_nm));
			//rx.add(record, "o_bi", StringUtil.replaceToXml(rec.o_bi));
			//rx.add(record, "o_qunt", StringUtil.replaceToXml(rec.o_qunt));
			//rx.add(record, "o_amt", StringUtil.replaceToXml(rec.o_amt));
			//rx.add(record, "s_bi", StringUtil.replaceToXml(rec.s_bi));
			//rx.add(record, "s_qunt", StringUtil.replaceToXml(rec.s_qunt));
			//rx.add(record, "s_amt", StringUtil.replaceToXml(rec.s_amt));
			//rx.add(record, "b_bi", StringUtil.replaceToXml(rec.b_bi));
			//rx.add(record, "b_qunt", StringUtil.replaceToXml(rec.b_qunt));
			//rx.add(record, "b_amt", StringUtil.replaceToXml(rec.b_amt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_CLOSE_2000_LCURLISTRecord rec = (MT_CLOSE_2000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "owh_qunt", rec.owh_qunt);
			rx.add(record, "owh_amt", rec.owh_amt);
			rx.add(record, "avg_owh_amt", rec.avg_owh_amt);
			rx.add(record, "all_qunt", rec.all_qunt);
			rx.add(record, "shet_qunt", rec.shet_qunt);
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "fac_clsf_nm", StringUtil.replaceToXml(rec.fac_clsf_nm));
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
			//rx.add(record, "owh_qunt", StringUtil.replaceToXml(rec.owh_qunt));
			//rx.add(record, "owh_amt", StringUtil.replaceToXml(rec.owh_amt));
			//rx.add(record, "avg_owh_amt", StringUtil.replaceToXml(rec.avg_owh_amt));
			//rx.add(record, "all_qunt", StringUtil.replaceToXml(rec.all_qunt));
			//rx.add(record, "shet_qunt", StringUtil.replaceToXml(rec.shet_qunt));
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
<mt_close_2000_l>
	<dataSet>
		<CURLIST1>
			<record>
				<fac_clsf/>
				<matr_cd/>
				<matr_nm/>
				<fac_clsf_nm/>
				<o_bi/>
				<o_qunt/>
				<o_amt/>
				<s_bi/>
				<s_qunt/>
				<s_amt/>
				<b_bi/>
				<b_qunt/>
				<b_amt/>
			</record>
		</CURLIST1>
	</dataSet>
</mt_close_2000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_close_2000_l>
	<dataSet>
		<CURLIST>
			<record>
				<occr_dt/>
				<fac_clsf/>
				<fac_clsf_nm/>
				<matr_cd/>
				<matr_nm/>
				<owh_qunt/>
				<owh_amt/>
				<avg_owh_amt/>
				<all_qunt/>
				<shet_qunt/>
			</record>
		</CURLIST>
	</dataSet>
</mt_close_2000_l>
*/
%>

<% /* 작성시간 : Mon Aug 03 21:09:16 KST 2009 */ %>