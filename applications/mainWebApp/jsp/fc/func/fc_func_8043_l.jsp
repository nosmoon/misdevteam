<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_8043_LDataSet ds = (FC_FUNC_8043_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_8043_LCURLIST1Record rec = (FC_FUNC_8043_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pymt_dt", rec.pymt_dt);
			rx.add(record, "exrate", rec.exrate);
			rx.add(record, "libo_int_rate", rec.libo_int_rate);
			rx.add(record, "dedu_int_rate", rec.dedu_int_rate);
			rx.add(record, "pymt_prcp", rec.pymt_prcp);
			rx.add(record, "pymt_int", rec.pymt_int);
			rx.add(record, "won_amt", rec.won_amt);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "nomach_adpay_bal", rec.nomach_adpay_bal);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			rx.add(record, "slip_arow_no", rec.slip_arow_no);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			//rx.add(record, "pymt_dt", StringUtil.replaceToXml(rec.pymt_dt));
			//rx.add(record, "exrate", StringUtil.replaceToXml(rec.exrate));
			//rx.add(record, "libo_int_rate", StringUtil.replaceToXml(rec.libo_int_rate));
			//rx.add(record, "dedu_int_rate", StringUtil.replaceToXml(rec.dedu_int_rate));
			//rx.add(record, "pymt_prcp", StringUtil.replaceToXml(rec.pymt_prcp));
			//rx.add(record, "pymt_int", StringUtil.replaceToXml(rec.pymt_int));
			//rx.add(record, "won_amt", StringUtil.replaceToXml(rec.won_amt));
			//rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
			//rx.add(record, "nomach_adpay_bal", StringUtil.replaceToXml(rec.nomach_adpay_bal));
			//rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			//rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			//rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			//rx.add(record, "slip_sub_seq", StringUtil.replaceToXml(rec.slip_sub_seq));
			//rx.add(record, "slip_arow_no", StringUtil.replaceToXml(rec.slip_arow_no));
			//rx.add(record, "comp_dt", StringUtil.replaceToXml(rec.comp_dt));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
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
<fc_func_8043_l>
	<dataSet>
		<CURLIST1>
			<record>
				<pymt_dt/>
				<exrate/>
				<libo_int_rate/>
				<dedu_int_rate/>
				<pymt_prcp/>
				<pymt_int/>
				<won_amt/>
				<rmks/>
				<nomach_adpay_bal/>
				<slip_occr_dt/>
				<slip_clsf_cd/>
				<slip_seq/>
				<slip_sub_seq/>
				<slip_arow_no/>
				<comp_dt/>
				<mtry_dt/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_func_8043_l>
*/
%>

<% /* 작성시간 : Thu Apr 09 15:11:08 KST 2009 */ %>