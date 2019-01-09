<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2900_LDataSet ds = (FC_ACCT_2900_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** RMTT_PAY_LIST BEGIN */
		recordSet = rx.add(dataSet, "RMTT_PAY_LIST", "");

		for(int i = 0; i < ds.rmtt_pay_list.size(); i++) {
			FC_ACCT_2900_LRMTT_PAY_LISTRecord rec = (FC_ACCT_2900_LRMTT_PAY_LISTRecord)ds.rmtt_pay_list.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "check1", rec.check1);
			//rx.add(record, "slip_no", rec.slip_no);
			//rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			//rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			//rx.add(record, "slip_seq", rec.slip_seq);
			//rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			//rx.add(record, "clam_dept", rec.clam_dept);
			//rx.add(record, "ptcr", rec.ptcr);
			//rx.add(record, "amt", rec.amt);
			//rx.add(record, "src_tax", rec.src_tax);
			//rx.add(record, "calc_amt", rec.calc_amt);
			//rx.add(record, "rmtt_cnt", rec.rmtt_cnt);
			//rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "check1", StringUtil.replaceToXml(rec.check1));
			rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
			rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			rx.add(record, "slip_sub_seq", StringUtil.replaceToXml(rec.slip_sub_seq));
			rx.add(record, "clam_dept", StringUtil.replaceToXml(rec.clam_dept));
			rx.add(record, "ptcr", StringUtil.replaceToXml(rec.ptcr));
			rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
			rx.add(record, "src_tax", StringUtil.replaceToXml(rec.src_tax));
			rx.add(record, "calc_amt", StringUtil.replaceToXml(rec.calc_amt));
			rx.add(record, "rmtt_cnt", StringUtil.replaceToXml(rec.rmtt_cnt));
			rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
		}
		rx.add(recordSet, "totalcnt", ds.rmtt_pay_list.size());
		/****** RMTT_PAY_LIST END */

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
<fc_acct_2900_l>
	<dataSet>
		<RMTT_PAY_LIST>
			<record>
				<check1/>
				<slip_no/>
				<slip_occr_dt/>
				<slip_clsf_cd/>
				<slip_seq/>
				<slip_sub_seq/>
				<clam_dept/>
				<ptcr/>
				<amt/>
				<src_tax/>
				<calc_amt/>
				<rmtt_cnt/>
				<cmpy_cd/>
			</record>
		</RMTT_PAY_LIST>
	</dataSet>
</fc_acct_2900_l>
*/
%>

<% /* 작성시간 : Thu Jun 18 11:11:53 KST 2009 */ %>