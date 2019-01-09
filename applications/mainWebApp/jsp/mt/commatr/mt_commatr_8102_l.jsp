<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.commatr.rec.*
	,	chosun.ciis.mt.commatr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_COMMATR_8102_LDataSet ds = (MT_COMMATR_8102_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_COMMATR_8102_LCURLIST2Record rec = (MT_COMMATR_8102_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			rx.add(record, "titl", rec.titl);
			rx.add(record, "reso_amt", rec.reso_amt);
			rx.add(record, "adpay_amt", rec.adpay_amt);
			rx.add(record, "comp_amt", "");
			//rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
			//rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			//rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			//rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			//rx.add(record, "slip_sub_seq", StringUtil.replaceToXml(rec.slip_sub_seq));
			//rx.add(record, "titl", StringUtil.replaceToXml(rec.titl));
			//rx.add(record, "reso_amt", StringUtil.replaceToXml(rec.reso_amt));
			//rx.add(record, "adpay_amt", StringUtil.replaceToXml(rec.adpay_amt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_COMMATR_8102_LCURLISTRecord rec = (MT_COMMATR_8102_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "somodat", rec.somodat);
			rx.add(record, "bpwt", rec.bpwt);
			rx.add(record, "pchpwt_1", rec.pchpwt_1);
			rx.add(record, "pchpwt", rec.pchpwt);
			rx.add(record, "pcsim62cnt", rec.pcsim62cnt);
			rx.add(record, "pcsim31cnt", rec.pcsim31cnt);
			rx.add(record, "pcsim46cnt", rec.pcsim46cnt);
			rx.add(record, "pcseoljiwt", rec.pcseoljiwt);
			rx.add(record, "hpdan", rec.hpdan);
			rx.add(record, "sim62dan", rec.sim62dan);
			rx.add(record, "sim31dan", rec.sim31dan);
			rx.add(record, "sim46dan", rec.sim46dan);
			rx.add(record, "seoldan", rec.seoldan);
			rx.add(record, "pcgitapaji", rec.pcgitapaji);
			rx.add(record, "gitadan", rec.gitadan);
			rx.add(record, "bpdan", rec.bpdan);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "tot_amt", rec.tot_amt);
			//rx.add(record, "somodat", StringUtil.replaceToXml(rec.somodat));
			//rx.add(record, "bpwt", StringUtil.replaceToXml(rec.bpwt));
			//rx.add(record, "pchpwt_1", StringUtil.replaceToXml(rec.pchpwt_1));
			//rx.add(record, "pchpwt", StringUtil.replaceToXml(rec.pchpwt));
			//rx.add(record, "pcsim62cnt", StringUtil.replaceToXml(rec.pcsim62cnt));
			//rx.add(record, "pcsim31cnt", StringUtil.replaceToXml(rec.pcsim31cnt));
			//rx.add(record, "pcsim46cnt", StringUtil.replaceToXml(rec.pcsim46cnt));
			//rx.add(record, "pcseoljiwt", StringUtil.replaceToXml(rec.pcseoljiwt));
			//rx.add(record, "hpdan", StringUtil.replaceToXml(rec.hpdan));
			//rx.add(record, "sim62dan", StringUtil.replaceToXml(rec.sim62dan));
			//rx.add(record, "sim31dan", StringUtil.replaceToXml(rec.sim31dan));
			//rx.add(record, "sim46dan", StringUtil.replaceToXml(rec.sim46dan));
			//rx.add(record, "seoldan", StringUtil.replaceToXml(rec.seoldan));
			//rx.add(record, "pcgitapaji", StringUtil.replaceToXml(rec.pcgitapaji));
			//rx.add(record, "gitadan", StringUtil.replaceToXml(rec.gitadan));
			//rx.add(record, "bpdan", StringUtil.replaceToXml(rec.bpdan));
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
<mt_commatr_8102_l>
	<dataSet>
		<CURLIST>
			<record>
				<somodat/>
				<bpwt/>
				<pchpwt_1/>
				<pchpwt/>
				<pcsim62cnt/>
				<pcsim31cnt/>
				<pcsim46cnt/>
				<pcseoljiwt/>
				<hpdan/>
				<sim62dan/>
				<sim31dan/>
				<sim46dan/>
				<seoldan/>
				<pcgitapaji/>
				<gitadan/>
				<bpdan/>
			</record>
		</CURLIST>
	</dataSet>
</mt_commatr_8102_l>
*/
%>

<% /* 작성시간 : Wed May 15 17:28:43 KST 2013 */ %>