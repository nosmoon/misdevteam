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
	MT_PAPORD_5003_LDataSet ds = (MT_PAPORD_5003_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData2", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPORD_5003_LCURLISTRecord rec = (MT_PAPORD_5003_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "papcmpy_cd", rec.papcmpy_cd);
			rx.add(record, "papcmpy_nm", rec.papcmpy_nm);
			rx.add(record, "matr_cd_a", rec.matr_cd_a);
			rx.add(record, "roll_wgt_a", rec.roll_wgt_a);
			rx.add(record, "somo_cnt_a", rec.somo_cnt_a);
			rx.add(record, "somo_wgt_a", rec.somo_wgt_a);
			rx.add(record, "ordr_roll_cnt_a", rec.ordr_roll_cnt_a);
			rx.add(record, "ordr_wgt_a", rec.ordr_wgt_a);
			
			if(rec.car_kind_a.equals("")) {
				rx.add(record, "car_kind_a", rec.car_kind_a);
				rx.add(record, "car_a", 0);
			} else {
				rx.add(record, "car_kind_a", rec.car_kind_a + "롤적재");
				rx.add(record, "car_a", rec.car_kind_a);
			}
			
			rx.add(record,"roll_other_a",rec.mix_roll_a);
			rx.add(record,"mix_roll_a", rec.mix_roll_a);
			rx.add(record,"mix_wgt_a",rec.mix_wgt_a);
			rx.add(record, "seq_a", rec.seq_a);
			rx.add(record, "occr_dt_a", rec.occr_dt_a);
			rx.add(record, "car_prd_cnt_a", rec.car_prd_cnt_a);
			rx.add(record, "matr_cd_b", rec.matr_cd_b);
			rx.add(record, "roll_wgt_b", rec.roll_wgt_b);
			rx.add(record, "somo_cnt_b", rec.somo_cnt_b);
			rx.add(record, "somo_wgt_b", rec.somo_wgt_b);
			rx.add(record, "ordr_roll_cnt_b", rec.ordr_roll_cnt_b);
			rx.add(record, "ordr_wgt_b", rec.ordr_wgt_b);
			
			if(rec.car_kind_b.equals("")) {
				rx.add(record, "car_kind_b", rec.car_kind_b);
				rx.add(record, "car_b", 0);
			} else {
				rx.add(record, "car_kind_b", rec.car_kind_b + "롤적재");
				rx.add(record, "car_b", rec.car_kind_b);
			}
			
			rx.add(record,"roll_other_b",rec.mix_roll_b);
			rx.add(record,"mix_roll_b", rec.mix_roll_b);
			rx.add(record,"mix_wgt_b",rec.mix_wgt_b);
			
			rx.add(record, "seq_b", rec.seq_b);
			rx.add(record, "occr_dt_b", rec.occr_dt_b);
			rx.add(record, "car_prd_cnt_b", rec.car_prd_cnt_b);
			rx.add(record, "matr_cd_c", rec.matr_cd_c);
			rx.add(record, "roll_wgt_c", rec.roll_wgt_c);
			rx.add(record, "somo_cnt_c", rec.somo_cnt_c);
			rx.add(record, "somo_wgt_c", rec.somo_wgt_c);
			rx.add(record, "ordr_roll_cnt_c", rec.ordr_roll_cnt_c);
			rx.add(record, "ordr_wgt_c", rec.ordr_wgt_c);
			
			if(rec.car_kind_c.equals("")) {
				rx.add(record, "car_kind_c", rec.car_kind_c);
				rx.add(record, "car_c", 0);
			} else {
				rx.add(record, "car_kind_c", rec.car_kind_c + "롤적재");
				rx.add(record, "car_c", rec.car_kind_c);
			}
			
			rx.add(record,"roll_other_c", rec.mix_roll_c);
			rx.add(record,"mix_roll_c", rec.mix_roll_c);
			rx.add(record,"mix_wgt_c",rec.mix_wgt_c);
			rx.add(record, "seq_c", rec.seq_c);
			rx.add(record, "occr_dt_c", rec.occr_dt_c);
			rx.add(record, "car_prd_cnt_c", rec.car_prd_cnt_c);
			rx.add(record, "issu_dt", "");
			
			
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
			<cmpy_cd/>
			<papcmpy_cd/>
			<papcmpy_nm/>
			<matr_cd_a/>
			<roll_wgt_a/>
			<somo_cnt_a/>
			<somo_wgt_a/>
			<ordr_roll_cnt_a/>
			<ordr_wgt_a/>
			<car_kind_a/>
			<seq_a/>
			<occr_dt_a/>
			<car_prd_cnt_a/>
			<matr_cd_b/>
			<roll_wgt_b/>
			<somo_cnt_b/>
			<somo_wgt_b/>
			<ordr_roll_cnt_b/>
			<ordr_wgt_b/>
			<car_kind_b/>
			<seq_b/>
			<occr_dt_b/>
			<car_prd_cnt_b/>
			<matr_cd_c/>
			<roll_wgt_c/>
			<somo_cnt_c/>
			<somo_wgt_c/>
			<ordr_roll_cnt_c/>
			<ordr_wgt_c/>
			<car_kind_c/>
			<seq_c/>
			<occr_dt_c/>
			<car_prd_cnt_c/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Jun 26 18:05:39 KST 2009 */ %>