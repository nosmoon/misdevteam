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
	MT_SUBMATROUT_3204_LDataSet ds = (MT_SUBMATROUT_3204_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */


		if( ds.curlist.size()> 0 ) {
			recordSet = rx.add(dataSet, "head_data", "");
			MT_SUBMATROUT_3204_LCURLISTRecord rec = (MT_SUBMATROUT_3204_LCURLISTRecord)ds.curlist.get(0);
			rx.add(recordSet, "ordr_dt", rec.ordr_dt);
			rx.add(recordSet, "dlco_no", rec.dlco_no);
			rx.add(recordSet, "dlco_nm", rec.dlco_nm);
			rx.add(recordSet, "ordr_per", rec.ordr_per);
			rx.add(recordSet, "ordr_per_nm", rec.ordr_per_nm);
			rx.add(recordSet, "ordr_per_email", rec.ordr_per_email);
			rx.add(recordSet, "dlvs_dt", rec.dlvs_dt);
			rx.add(recordSet, "dlvs_fac_cd", rec.dlvs_fac_cd);
			rx.add(recordSet, "dlco_per", rec.dlco_per);
			rx.add(recordSet, "dlco_telno", rec.dlco_telno);
			rx.add(recordSet, "dlco_email", rec.dlco_email);
			rx.add(recordSet, "amt_pay_mthd", rec.amt_pay_mthd);
			rx.add(recordSet, "remk", rec.remk);


			recordSet = rx.add(dataSet, "gridData", "");
			for(int i = 0; i < ds.curlist.size(); i++) {
				MT_SUBMATROUT_3204_LCURLISTRecord recGrid = (MT_SUBMATROUT_3204_LCURLISTRecord)ds.curlist.get(i);
				int record = rx.add(recordSet, "record", "");

				rx.add(record, "sub_seq", recGrid.sub_seq);
				rx.add(record, "matr_cd", recGrid.matr_cd);
				rx.add(record, "item_nm", recGrid.item_nm);
				rx.add(record, "std_modl", recGrid.std_modl);
				rx.add(record, "unit", recGrid.unit);
				rx.add(record, "ordr_qunt", recGrid.ordr_qunt);
				rx.add(record, "ordr_uprc", recGrid.ordr_uprc);
				rx.add(record, "ordr_amt", recGrid.ordr_amt);
				rx.add(record, "ordr_req_dd", rec.ordr_req_dd);
				rx.add(record, "remk_ar", recGrid.remk_ar);
			}
			rx.add(recordSet, "totalcnt", ds.curlist.size());
			}
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
			<ordr_dt/>
			<dlco_cd/>
			<ordr_pers/>
			<ordr_pers_email/>
			<dlvs_dt/>
			<dlvs_fac_cd/>
			<dlvs_chrg_pers/>
			<chrg_pers_cntc_plac/>
			<chrg_pers_email/>
			<amt_pay_mthd/>
			<remk/>
			<sub_seq/>
			<matr_cd/>
			<item_nm/>
			<std_modl/>
			<unit/>
			<ordr_qunt/>
			<ordr_uprc/>
			<ordr_amt/>
			<remk_ar/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu May 07 09:58:24 KST 2009 */ %>