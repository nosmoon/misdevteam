<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.papord.rec.*
	,	chosun.ciis.mt.papord.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPORD_5006_LDataSet ds = (MT_PAPORD_5006_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
	String same_a = "";
	String same_b = "";
	String same_c = "";

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_PAPORD_5006_LCURLIST1Record rec = (MT_PAPORD_5006_LCURLIST1Record)ds.curlist1.get(i);
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
			rx.add(record, "bi_roll_wgt_a", rec.bi_roll_wgt_a);
			rx.add(record, "bi_roll_cnt_b", rec.bi_roll_cnt_b);
			rx.add(record, "bi_roll_wgt_b", rec.bi_roll_wgt_b);
			rx.add(record, "bi_roll_cnt_c", rec.bi_roll_cnt_c);
			rx.add(record, "bi_roll_wgt_c", rec.bi_roll_wgt_c);
			rx.add(record, "somo_cnt_a", rec.somo_cnt_a);
			rx.add(record, "somo_wgt_a", rec.somo_wgt_a);
			rx.add(record, "somo_cnt_b", rec.somo_cnt_b);
			rx.add(record, "somo_wgt_b", rec.somo_wgt_b);
			rx.add(record, "somo_cnt_c", rec.somo_cnt_c);
			rx.add(record, "somo_wgt_c", rec.somo_wgt_c);
			rx.add(record, "expt_cnt_a", rec.expt_cnt_a);
			rx.add(record, "expt_wgt_a", rec.expt_wgt_a);
			rx.add(record, "expt_cnt_b", rec.expt_cnt_b);
			rx.add(record, "expt_wgt_b", rec.expt_wgt_b);
			rx.add(record, "expt_cnt_c", rec.expt_cnt_c);
			rx.add(record, "expt_wgt_c", rec.expt_wgt_c);
			rx.add(record, "ordr_roll_cnt_a", rec.ordr_roll_cnt_a);
			rx.add(record, "ordr_wgt_a", rec.ordr_wgt_a);
			rx.add(record, "ordr_roll_cnt_b", rec.ordr_roll_cnt_b);
			rx.add(record, "ordr_wgt_b", rec.ordr_wgt_b);
			rx.add(record, "ordr_roll_cnt_c", rec.ordr_roll_cnt_c);
			rx.add(record, "ordr_wgt_c", rec.ordr_wgt_c);
			rx.add(record, "fix_roll_cnt_a", rec.ordr_roll_cnt_a);
			rx.add(record, "fix_wgt_a", rec.ordr_wgt_a);
			rx.add(record, "fix_roll_cnt_b", rec.ordr_roll_cnt_b);
			rx.add(record, "fix_wgt_b", rec.ordr_wgt_b);
			rx.add(record, "fix_roll_cnt_c", rec.ordr_roll_cnt_c);
			rx.add(record, "fix_wgt_c", rec.ordr_wgt_c);
			rx.add(record, "tot_wgt_a", 0);
			rx.add(record, "tot_wgt_b", 0);
			rx.add(record, "tot_wgt_c", 0);
			rx.add(record, "max_wgt", 0);
			rx.add(record, "balju_ratio_a",0);
			rx.add(record, "balju_ratio_b",0);
			rx.add(record, "balju_ratio_c",0);
			rx.add(record, "balju_ratio_tot", 0);
			if (rec.somo_wgt_a.equalsIgnoreCase(rec.expt_wgt_a)){
				same_a = "Y";
			} else {
				same_a = "N";
			}
			if (rec.somo_wgt_b.equalsIgnoreCase(rec.expt_wgt_b)){
				same_b = "Y";
			} else {
				same_b = "N";
			}
			if (rec.somo_wgt_c.equalsIgnoreCase(rec.expt_wgt_c)){
				same_c = "Y";
			} else {
				System.out.println("rec.somo_wgt_c=" + rec.somo_wgt_c + "___________rec.expt_wgt_c=" + rec.expt_wgt_c);
				same_c = "N";
			}
			rx.add(record, "same_a",same_a);
			rx.add(record, "same_b",same_b);
			rx.add(record, "same_c",same_c);
			rx.add(record, "chg_yn", "N");
			rx.add(record, "roll_wgt_a", rec.roll_wgt_a);
			rx.add(record, "roll_wgt_b", rec.roll_wgt_b);
			rx.add(record, "roll_wgt_c", rec.roll_wgt_c);
			
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "issu_dt", StringUtil.replaceToXml(rec.issu_dt));
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "fac_clsf_nm", StringUtil.replaceToXml(rec.fac_clsf_nm));
			//rx.add(record, "jg_roll_cnt_a", StringUtil.replaceToXml(rec.jg_roll_cnt_a));
			//rx.add(record, "jg_wgt_a", StringUtil.replaceToXml(rec.jg_wgt_a));
			//rx.add(record, "jg_roll_cnt_b", StringUtil.replaceToXml(rec.jg_roll_cnt_b));
			//rx.add(record, "jg_wgt_b", StringUtil.replaceToXml(rec.jg_wgt_b));
			//rx.add(record, "jg_roll_cnt_c", StringUtil.replaceToXml(rec.jg_roll_cnt_c));
			//rx.add(record, "jg_wgt_c", StringUtil.replaceToXml(rec.jg_wgt_c));
			//rx.add(record, "bi_roll_cnt_a", StringUtil.replaceToXml(rec.bi_roll_cnt_a));
			//rx.add(record, "bi_roll_wgt_a", StringUtil.replaceToXml(rec.bi_roll_wgt_a));
			//rx.add(record, "bi_roll_cnt_b", StringUtil.replaceToXml(rec.bi_roll_cnt_b));
			//rx.add(record, "bi_roll_wgt_b", StringUtil.replaceToXml(rec.bi_roll_wgt_b));
			//rx.add(record, "bi_roll_cnt_c", StringUtil.replaceToXml(rec.bi_roll_cnt_c));
			//rx.add(record, "bi_roll_wgt_c", StringUtil.replaceToXml(rec.bi_roll_wgt_c));
			//rx.add(record, "somo_cnt_a", StringUtil.replaceToXml(rec.somo_cnt_a));
			//rx.add(record, "somo_wgt_a", StringUtil.replaceToXml(rec.somo_wgt_a));
			//rx.add(record, "somo_cnt_b", StringUtil.replaceToXml(rec.somo_cnt_b));
			//rx.add(record, "somo_wgt_b", StringUtil.replaceToXml(rec.somo_wgt_b));
			//rx.add(record, "somo_cnt_c", StringUtil.replaceToXml(rec.somo_cnt_c));
			//rx.add(record, "somo_wgt_c", StringUtil.replaceToXml(rec.somo_wgt_c));
			//rx.add(record, "expt_cnt_a", StringUtil.replaceToXml(rec.expt_cnt_a));
			//rx.add(record, "expt_wgt_a", StringUtil.replaceToXml(rec.expt_wgt_a));
			//rx.add(record, "expt_cnt_b", StringUtil.replaceToXml(rec.expt_cnt_b));
			//rx.add(record, "expt_wgt_b", StringUtil.replaceToXml(rec.expt_wgt_b));
			//rx.add(record, "expt_cnt_c", StringUtil.replaceToXml(rec.expt_cnt_c));
			//rx.add(record, "expt_wgt_c", StringUtil.replaceToXml(rec.expt_wgt_c));
			//rx.add(record, "ordr_roll_cnt_a", StringUtil.replaceToXml(rec.ordr_roll_cnt_a));
			//rx.add(record, "ordr_wgt_a", StringUtil.replaceToXml(rec.ordr_wgt_a));
			//rx.add(record, "ordr_roll_cnt_b", StringUtil.replaceToXml(rec.ordr_roll_cnt_b));
			//rx.add(record, "ordr_wgt_b", StringUtil.replaceToXml(rec.ordr_wgt_b));
			//rx.add(record, "ordr_roll_cnt_c", StringUtil.replaceToXml(rec.ordr_roll_cnt_c));
			//rx.add(record, "ordr_wgt_c", StringUtil.replaceToXml(rec.ordr_wgt_c));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST END */

		
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "gridData2", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PAPORD_5006_LCURLIST2Record rec = (MT_PAPORD_5006_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "papcmpy_cd", rec.papcmpy_cd);
			rx.add(record, "papcmpy_nm", rec.papcmpy_nm);
			rx.add(record, "p_ratio", rec.p_ratio);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "ord", rec.ord);
			rx.add(record, "matr_cd_a", rec.matr_cd_a);
			rx.add(record, "matr_cd_b", rec.matr_cd_b);
			rx.add(record, "matr_cd_c", rec.matr_cd_c);
			rx.add(record, "roll_wgt_a", rec.roll_wgt_a);
			rx.add(record, "roll_wgt_b", rec.roll_wgt_b);
			rx.add(record, "roll_wgt_c", rec.roll_wgt_c);
			rx.add(record, "car_a", rec.car_a);
			rx.add(record, "car_b", rec.car_b);
			rx.add(record, "car_c", rec.car_c);
			rx.add(record, "wgt_a", rec.wgt_a);
			rx.add(record, "wgt_b", rec.wgt_b);
			rx.add(record, "wgt_c", rec.wgt_c);
			rx.add(record, "roll_a", rec.roll_a);
			rx.add(record, "roll_b", rec.roll_b);
			rx.add(record, "roll_c", rec.roll_c);
			rx.add(record, "mix_wgt_a", rec.mix_wgt_a);
			rx.add(record, "mix_roll_a", rec.mix_roll_a);
			rx.add(record, "mix_wgt_b", rec.mix_wgt_b);
			rx.add(record, "mix_roll_b", rec.mix_roll_b);
			rx.add(record, "mix_wgt_c", rec.mix_wgt_c);
			rx.add(record, "mix_roll_c", rec.mix_roll_c);
			rx.add(record, "roll_car_a", rec.roll_car_a);
			rx.add(record, "roll_car_b", rec.roll_car_b);
			rx.add(record, "roll_car_c", rec.roll_car_c);
			
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "papcmpy_cd", StringUtil.replaceToXml(rec.papcmpy_cd));
			//rx.add(record, "papcmpy_nm", StringUtil.replaceToXml(rec.papcmpy_nm));
			//rx.add(record, "matr_cd_a", StringUtil.replaceToXml(rec.matr_cd_a));
			//rx.add(record, "roll_wgt_a", StringUtil.replaceToXml(rec.roll_wgt_a));
			//rx.add(record, "somo_roll_a", StringUtil.replaceToXml(rec.somo_roll_a));
			//rx.add(record, "somo_wgt_a", StringUtil.replaceToXml(rec.somo_wgt_a));
			//rx.add(record, "ordr_roll_a", StringUtil.replaceToXml(rec.ordr_roll_a));
			//rx.add(record, "ordr_wgt_a", StringUtil.replaceToXml(rec.ordr_wgt_a));
			//rx.add(record, "car_kind_a", StringUtil.replaceToXml(rec.car_kind_a));
			//rx.add(record, "seq_a", StringUtil.replaceToXml(rec.seq_a));
			//rx.add(record, "occr_dt_a", StringUtil.replaceToXml(rec.occr_dt_a));
			//rx.add(record, "car_prd_cnt_a", StringUtil.replaceToXml(rec.car_prd_cnt_a));
			//rx.add(record, "matr_cd_b", StringUtil.replaceToXml(rec.matr_cd_b));
			//rx.add(record, "roll_wgt_b", StringUtil.replaceToXml(rec.roll_wgt_b));
			//rx.add(record, "somo_roll_b", StringUtil.replaceToXml(rec.somo_roll_b));
			//rx.add(record, "somo_wgt_b", StringUtil.replaceToXml(rec.somo_wgt_b));
			//rx.add(record, "ordr_roll_b", StringUtil.replaceToXml(rec.ordr_roll_b));
			//rx.add(record, "ordr_wgt_b", StringUtil.replaceToXml(rec.ordr_wgt_b));
			//rx.add(record, "car_kind_b", StringUtil.replaceToXml(rec.car_kind_b));
			//rx.add(record, "seq_b", StringUtil.replaceToXml(rec.seq_b));
			//rx.add(record, "occr_dt_b", StringUtil.replaceToXml(rec.occr_dt_b));
			//rx.add(record, "car_prd_cnt_b", StringUtil.replaceToXml(rec.car_prd_cnt_b));
			//rx.add(record, "matr_cd_c", StringUtil.replaceToXml(rec.matr_cd_c));
			//rx.add(record, "roll_wgt_c", StringUtil.replaceToXml(rec.roll_wgt_c));
			//rx.add(record, "somo_roll_c", StringUtil.replaceToXml(rec.somo_roll_c));
			//rx.add(record, "somo_wgt_c", StringUtil.replaceToXml(rec.somo_wgt_c));
			//rx.add(record, "ordr_roll_c", StringUtil.replaceToXml(rec.ordr_roll_c));
			//rx.add(record, "ordr_wgt_c", StringUtil.replaceToXml(rec.ordr_wgt_c));
			//rx.add(record, "car_kind_c", StringUtil.replaceToXml(rec.car_kind_c));
			//rx.add(record, "seq_c", StringUtil.replaceToXml(rec.seq_c));
			//rx.add(record, "occr_dt_c", StringUtil.replaceToXml(rec.occr_dt_c));
			//rx.add(record, "car_prd_cnt_c", StringUtil.replaceToXml(rec.car_prd_cnt_c));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */
		
		
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "gridData3", "");
		for(int i = 0; i < ds.curlist4.size(); i++) {
			MT_PAPORD_5006_LCURLIST4Record rec = (MT_PAPORD_5006_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "papcmpy_cd", rec.papcmpy_cd);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "roll_cnt", rec.roll_cnt);
			rx.add(record, "wgt", rec.wgt);
			rx.add(record, "car_occr_dt", rec.car_occr_dt);
			rx.add(record, "car_seq", rec.car_seq);
			//rx.add(record, "ordr_dt", StringUtil.replaceToXml(rec.ordr_dt));
			//rx.add(record, "papcmpy_cd", StringUtil.replaceToXml(rec.papcmpy_cd));
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "roll_cnt", StringUtil.replaceToXml(rec.roll_cnt));
			//rx.add(record, "wgt", StringUtil.replaceToXml(rec.wgt));
			//rx.add(record, "car_occr_dt", StringUtil.replaceToXml(rec.car_occr_dt));
			//rx.add(record, "car_seq", StringUtil.replaceToXml(rec.car_seq));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "gridData4", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_PAPORD_5006_LCURLIST3Record rec = (MT_PAPORD_5006_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "papcmpy_cd", rec.papcmpy_cd);
			rx.add(record, "roll_wgt", rec.roll_wgt);
			rx.add(record, "somo_roll", rec.somo_roll);
			rx.add(record, "somo_wgt", rec.somo_wgt);
			rx.add(record, "ord_roll", rec.ord_roll);
			rx.add(record, "ord_wgt", rec.ord_wgt);
			rx.add(record, "car_occr_dt", rec.car_occr_dt);
			rx.add(record, "car_seq", rec.car_seq);
			rx.add(record, "car_cnt", rec.car_cnt);
			//rx.add(record, "ordr_dt", StringUtil.replaceToXml(rec.ordr_dt));
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "papcmpy_cd", StringUtil.replaceToXml(rec.papcmpy_cd));
			//rx.add(record, "roll_wgt", StringUtil.replaceToXml(rec.roll_wgt));
			//rx.add(record, "expt_roll_cnt", StringUtil.replaceToXml(rec.expt_roll_cnt));
			//rx.add(record, "expt_wgt", StringUtil.replaceToXml(rec.expt_wgt));
			//rx.add(record, "ordr_roll_cnt", StringUtil.replaceToXml(rec.ordr_roll_cnt));
			//rx.add(record, "ordr_wgt", StringUtil.replaceToXml(rec.ordr_wgt));
			//rx.add(record, "car_occr_dt", StringUtil.replaceToXml(rec.car_occr_dt));
			//rx.add(record, "car_seq", StringUtil.replaceToXml(rec.car_seq));
			//rx.add(record, "car_prd_cnt", StringUtil.replaceToXml(rec.car_prd_cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */
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
<mt_papord_5006_l>
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
				<expt_cnt_a/>
				<expt_wgt_a/>
				<expt_cnt_b/>
				<expt_wgt_b/>
				<expt_cnt_c/>
				<expt_wgt_c/>
				<ordr_roll_cnt_a/>
				<ordr_wgt_a/>
				<ordr_roll_cnt_b/>
				<ordr_wgt_b/>
				<ordr_roll_cnt_c/>
				<ordr_wgt_c/>
			</record>
		</CURLIST>
	</dataSet>
</mt_papord_5006_l>
*/
%>

<% /* 작성시간 : Sun Jul 12 20:28:10 KST 2009 */ %>