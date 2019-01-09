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
	MT_PAPORD_5002_LDataSet ds = (MT_PAPORD_5002_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_PAPORD_5002_LCURLIST1Record rec = (MT_PAPORD_5002_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "jg_roll_cnt_a", rec.jg_roll_cnt_a);
			rx.add(record, "jg_wgt_a", rec.jg_wgt_a);
			rx.add(record, "jg_roll_cnt_b", rec.jg_roll_cnt_b);
			rx.add(record, "jg_wgt_b", rec.jg_wgt_b);
			rx.add(record, "jg_roll_cnt_c", rec.jg_roll_cnt_c);
			rx.add(record, "jg_wgt_c", rec.jg_wgt_c);
			rx.add(record, "bi_roll_cnt_a", rec.bi_roll_cnt_a);
			rx.add(record, "bi_wgt_a", rec.bi_wgt_a);
			rx.add(record, "bi_roll_cnt_b", rec.bi_roll_cnt_b);
			rx.add(record, "bi_wgt_b", rec.bi_wgt_b);
			rx.add(record, "bi_roll_cnt_c", rec.bi_roll_cnt_c);
			rx.add(record, "bi_wgt_c", rec.bi_wgt_c);
			rx.add(record, "fix_roll_cnt_a", "0");
			rx.add(record, "fix_wgt_a", "0");
			rx.add(record, "fix_roll_cnt_b", "0");
			rx.add(record, "fix_wgt_b", "0");
			rx.add(record, "fix_roll_cnt_c", "0");
			rx.add(record, "fix_wgt_c", "0");
			rx.add(record, "tot_wgt_a", 0);
			rx.add(record, "tot_wgt_b", 0);
			rx.add(record, "tot_wgt_c", 0);
			rx.add(record, "max_wgt", 0);
			rx.add(record, "balju_ratio_tot", 0);
			rx.add(record, "somo_cnt_a", rec.somo_cnt_a);
			rx.add(record, "somo_wgt_a", rec.somo_wgt_a);
			rx.add(record, "somo_cnt_b", rec.somo_cnt_b);
			rx.add(record, "somo_wgt_b", rec.somo_wgt_b);
			rx.add(record, "somo_cnt_c", rec.somo_cnt_c);
			rx.add(record, "somo_wgt_c", rec.somo_wgt_c);
			rx.add(record, "ordr_roll_cnt_a", rec.ordr_roll_cnt_a);
			rx.add(record, "ordr_wgt_a", rec.ordr_wgt_a);
			rx.add(record, "ordr_roll_cnt_b", rec.ordr_roll_cnt_b);
			rx.add(record, "ordr_wgt_b", rec.ordr_wgt_b);
			rx.add(record, "ordr_roll_cnt_c", rec.ordr_roll_cnt_c);
			rx.add(record, "ordr_wgt_c", rec.ordr_wgt_c);
			rx.add(record, "roll_wgt_a", rec.roll_wgt_a);
			rx.add(record, "roll_wgt_b", rec.roll_wgt_b);
			rx.add(record, "roll_wgt_c", rec.roll_wgt_c);
			rx.add(record, "balju_ratio_a",0);
			rx.add(record, "balju_ratio_b",0);
			rx.add(record, "balju_ratio_c",0);
			rx.add(record, "matr_a", rec.matr_a);
			rx.add(record, "matr_b", rec.matr_b);
			rx.add(record, "matr_c", rec.matr_c);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST END */
		
		
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PAPORD_5002_LCURLIST2Record rec = (MT_PAPORD_5002_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "papcmpy_cd", rec.papcmpy_cd);
			rx.add(record, "papcmpy_nm", rec.papcmpy_nm);
			rx.add(record, "p_ratio", rec.p_ratio);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "ord", rec.ord);
			rx.add(record, "roll_wgt_a", rec.roll_wgt_a);
			rx.add(record, "matr_cd_a", rec.matr_cd_a);
			rx.add(record, "wgt_a", rec.wgt_a);
			rx.add(record, "roll_a", rec.roll_a);
			rx.add(record, "car_a", rec.car_a);
			rx.add(record, "roll_wgt_b", rec.roll_wgt_b);
			rx.add(record, "matr_cd_b", rec.matr_cd_b);
			rx.add(record, "wgt_b", rec.wgt_b);
			rx.add(record, "roll_b", rec.roll_b);
			rx.add(record, "car_b", rec.car_b);
			rx.add(record, "roll_wgt_c", rec.roll_wgt_c);
			rx.add(record, "matr_cd_c", rec.matr_cd_c);
			rx.add(record, "wgt_c", rec.wgt_c);
			rx.add(record, "roll_c", rec.roll_c);
			rx.add(record, "car_c", rec.car_c);
			rx.add(record, "mix_roll_a",	"0");
			rx.add(record, "mix_wgt_a",	"0");
			rx.add(record, "mix_roll_b",	"0");
			rx.add(record, "mix_wgt_b",	"0");
			rx.add(record, "mix_roll_c",	"0");
			rx.add(record, "mix_wgt_c",	"0");
			rx.add(record, "roll_car_a", rec.roll_car_a);
			rx.add(record, "roll_car_b", rec.roll_car_b);
			rx.add(record, "roll_car_c", rec.roll_car_c);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
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
			<issu_dt/>
			<fac_clsf/>
			<fac_clsf_nm/>
			<jg_roll_cnt_a/>
			<jg_wgt_a/>
			<jg_roll_cnt_b/>
			<jg_wgt_b/>
			<jg_roll_cnt_c/>
			<jg_wgt_c/>
			<bi_roll_cnt_a/>
			<bi_roll_wgt_a/>
			<bi_roll_cnt_b/>
			<bi_roll_wgt_b/>
			<bi_roll_cnt_c/>
			<bi_roll_wgt_c/>
			<somo_cnt_a/>
			<somo_wgt_a/>
			<somo_cnt_b/>
			<somo_wgt_b/>
			<somo_cnt_c/>
			<somo_wgt_c/>
			<ordr_roll_cnt_a/>
			<ordr_wgt_a/>
			<ordr_roll_cnt_b/>
			<ordr_wgt_b/>
			<ordr_roll_cnt_c/>
			<ordr_wgt_c/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Jun 24 22:22:48 KST 2009 */ %>