<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.submatrout.rec.*
	,	chosun.ciis.mt.submatrout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATROUT_1500_LDataSet ds = (MT_SUBMATROUT_1500_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "dataGrid3", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_SUBMATROUT_1500_LCURLIST3Record rec = (MT_SUBMATROUT_1500_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "owh_dt", rec.owh_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			//rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "qunt", rec.qunt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "dataGrid2", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_SUBMATROUT_1500_LCURLIST2Record rec = (MT_SUBMATROUT_1500_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "owh_dt", rec.owh_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			//rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "owh_num_shet", rec.owh_num_shet);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "dataGrid1", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_SUBMATROUT_1500_LCURLIST1Record rec = (MT_SUBMATROUT_1500_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "owh_dt", rec.owh_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "owh_qunt", rec.owh_qunt);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);

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
<mt_submatrout_1500_l>
	<dataSet>
		<CURLIST>
			<record>
				<owh_dt/>
				<fac_clsf/>
				<matr_cd/>
				<matr_nm/>
				<owh_qunt/>
				<occr_dt/>
				<seq/>
			</record>
		</CURLIST>
	</dataSet>
</mt_submatrout_1500_l>
*/
%>

<% /* 작성시간 : Tue Sep 15 00:26:03 KST 2009 */ %>