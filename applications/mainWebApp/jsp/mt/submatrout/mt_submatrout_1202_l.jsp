<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.submatrout.rec.*
	,	chosun.ciis.mt.submatrout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATROUT_1202_LDataSet ds = (MT_SUBMATROUT_1202_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_SUBMATROUT_1202_LCURLISTRecord rec = (MT_SUBMATROUT_1202_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
		    rx.addCData(record, "matr_nm", rec.matr_nm);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.addCData(record, "matr_cd_nm", rec.matr_cd + " " + rec.matr_nm);

			rx.add(record, "owh_dt", rec.owh_dt);

			rx.add(record, "owh_dept", rec.owh_dept);
			rx.add(record, "bccgdeptnm", rec.bccgdeptnm);
			rx.add(record, "owh_dept_cd_nm", rec.owh_dept + " " + rec.bccgdeptnm);

			rx.add(record, "owh_uprc", rec.owh_uprc);
			rx.add(record, "owh_qunt", rec.owh_qunt);
			rx.add(record, "owh_amt", rec.owh_amt);
			rx.add(record, "ewh_dt", rec.ewh_dt);
			rx.add(record, "ewh_seq", rec.ewh_seq);
			rx.add(record, "ewh_sub_seq", rec.ewh_sub_seq);
			rx.add(record, "ewh_no", rec.ewh_seq + "-" + rec.ewh_sub_seq);

			rx.add(record, "owh_budg_cd", rec.owh_budg_cd);
			rx.add(record, "matr_clas", rec.matr_clas);
			//rx.add(record, "owh_unit", rec.owh_unit);
			//rx.add(record, "medi_cd", rec.medi_cd);
			//rx.add(record, "medi_ser_no", rec.medi_ser_no);
			rx.addCData(record, "remk", rec.remk);
			//rx.add(record, "ewh_budg_cd", rec.ewh_budg_cd);
			//rx.add(record, "unit", rec.unit);
			//rx.add(record, "purc_uprc", rec.purc_uprc);

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
<dataSet>
	<CURLIST>
		<record>
			<fac_clsf_nm/>
			<matr_nm/>
			<matr_cd/>
			<matr_cd_nm/>
			<owh_dt/>
			<owh_seq/>
			<sub_seq/>
			<owh_seq_sub/>
			<owh_dept/>
			<bccgdeptnm/>
			<owh_dept_cd_nm/>
			<owh_uprc/>
			<owh_qunt/>
			<owh_amt/>
			<ewh_dt/>
			<ewh_seq/>
			<ewh_sub_seq/>
			<ewh_no/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Mar 25 16:54:24 KST 2009 */ %>