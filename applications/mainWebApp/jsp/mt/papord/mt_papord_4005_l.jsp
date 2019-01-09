<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papord.rec.*
	,	chosun.ciis.mt.papord.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPORD_4005_LDataSet ds = (MT_PAPORD_4005_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");
		
		String sDualOut = "";
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPORD_4005_LCURLISTRecord rec = (MT_PAPORD_4005_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rowCnt", (i+1));
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "dual_out_clsf", rec.dual_out_clsf);
			rx.add(record, "std", rec.paper_std);
			rx.add(record, "dual_out_nm", rec.dual_out_clsf_nm);
			rx.add(record, "check", "");
			rx.add(record, "pcnt", rec.pcnt);
			rx.add(record, "slip_qty", rec.issu_qty);
			rx.add(record, "roll_wgt_a", rec.roll_wgt_a);
			//if(rec.wgt_a > 0) {
				rx.add(record, "wgt_a", rec.wgt_a);
			//} else {
			//	rx.add(record, "wgt_a", "");
			//}
			//if(rec.roll_cnt_a > 0) {
				rx.add(record, "roll_cnt_a", rec.roll_cnt_a);
			//} else {
			//	rx.add(record, "roll_cnt_a", "");
			//}
			rx.add(record, "roll_wgt_b", rec.roll_wgt_b);
			//if(rec.wgt_b > 0) {
				rx.add(record, "wgt_b", rec.wgt_b);
			//} else {
			//	rx.add(record, "wgt_b", "");
			//}
			//if(rec.roll_cnt_b > 0) {
				rx.add(record, "roll_cnt_b", rec.roll_cnt_b);
			//} else {
			//	rx.add(record, "roll_cnt_b", "");
			//}
			rx.add(record, "roll_wgt_c", rec.roll_wgt_c);
			//if(rec.wgt_c > 0) {
				rx.add(record, "wgt_c", rec.wgt_c);
			//} else {
			//	rx.add(record, "wgt_c", "");
			//}
			//if(rec.roll_cnt_c > 0) {
				rx.add(record, "roll_cnt_c", rec.roll_cnt_c);
			//} else {
			//	rx.add(record, "roll_cnt_c", "");
			//}
			rx.add(record, "matr_cd_a", rec.matr_cd_a);
			rx.add(record, "matr_cd_b", rec.matr_cd_b);
			rx.add(record, "matr_cd_c", rec.matr_cd_c);
			//rx.add(record, "paper_std_cd", rec.paper_std_cd);
			//rx.add(record, "paper_std_nm", rec.paper_std_nm);
			//if(rec.paper_std_cd.equals("A")) {
			//	rx.add(record, "matr_cd_a", rec.matr_cd_a);
			//	rx.add(record, "matr_cd_b", "");
			//	rx.add(record, "matr_cd_c", "");
			//} else if(rec.paper_std_cd.equals("B")) {
			//	rx.add(record, "matr_cd_b", rec.matr_cd);
			//	rx.add(record, "matr_cd_a", "");
			//	rx.add(record, "matr_cd_c", "");
			//} else if(rec.paper_std_cd.equals("C")) {
			//	rx.add(record, "matr_cd_c", rec.matr_cd);
			//	rx.add(record, "matr_cd_b", "");
			//	rx.add(record, "matr_cd_a", "");
			//}
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

		recordSet = rx.add(dataSet, "pap_clsf_a", "");
		for(int i = 0; i < ds.curlist_1.size(); i++) {
			MT_PAPORD_4005_LCURLIST_1Record rec = (MT_PAPORD_4005_LCURLIST_1Record)ds.curlist_1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "label", rec.matr_nm);
			rx.add(record, "value", rec.roll_wgt);
			rx.add(record, "matr", rec.matr_cd);
		}
		
		recordSet = rx.add(dataSet, "pap_clsf_b", "");
		for(int i = 0; i < ds.curlist_2.size(); i++) {
			MT_PAPORD_4005_LCURLIST_2Record rec = (MT_PAPORD_4005_LCURLIST_2Record)ds.curlist_2.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "label", rec.matr_nm);
			rx.add(record, "value", rec.roll_wgt);
			rx.add(record, "matr", rec.matr_cd);
		}
		
		recordSet = rx.add(dataSet, "pap_clsf_c", "");
		for(int i = 0; i < ds.curlist_3.size(); i++) {
			MT_PAPORD_4005_LCURLIST_3Record rec = (MT_PAPORD_4005_LCURLIST_3Record)ds.curlist_3.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "label", rec.matr_nm);
			rx.add(record, "value", rec.roll_wgt);
			rx.add(record, "matr", rec.matr_cd);
		}
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
			<cmpy_cd/>
			<issu_dt/>
			<fac_clsf/>
			<medi_cd/>
			<sect_cd/>
			<dual_out_clsf/>
			<issu_pcnt/>
			<issu_qty/>
			<matr_cd/>
			<roll_wgt_a/>
			<wgt_a/>
			<roll_cnt_a/>
			<roll_wgt_b/>
			<wgt_b/>
			<roll_cnt_b/>
			<roll_wgt_c/>
			<wgt_c/>
			<roll_cnt_c/>
			<paper_std_cd/>
			<paper_std_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Apr 13 15:34:37 KST 2009 */ %>