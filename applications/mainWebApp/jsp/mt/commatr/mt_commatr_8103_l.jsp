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
	MT_COMMATR_8103_LDataSet ds = (MT_COMMATR_8103_LDataSet)request.getAttribute("ds");
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
			MT_COMMATR_8103_LCURLIST2Record rec = (MT_COMMATR_8103_LCURLIST2Record)ds.curlist2.get(i);
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
		/****** CURLIST2 END */
		
		
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_COMMATR_8103_LCURLISTRecord rec = (MT_COMMATR_8103_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "owh_dt", rec.owh_dt);
			rx.add(record, "bccgcnt_0", rec.bccgcnt_0);
			rx.add(record, "bccgwgt_0", rec.bccgwgt_0);
			rx.add(record, "bccgwgt1_0", rec.bccgwgt1_0);
			rx.add(record, "bccgamt_0", rec.bccgamt_0);
			rx.add(record, "bccgcnt_1", rec.bccgcnt_1);
			rx.add(record, "bccgwgt_1", rec.bccgwgt_1);
			rx.add(record, "bccgwgt1_1", rec.bccgwgt1_1);			
			rx.add(record, "bccgamt_1", rec.bccgamt_1);
			rx.add(record, "bccgcnt_3", rec.bccgcnt_3);
			rx.add(record, "bccgwgt_3", rec.bccgwgt_3);
			rx.add(record, "bccgwgt1_3", rec.bccgwgt1_3);			
			rx.add(record, "bccgamt_3", rec.bccgamt_3);
			rx.add(record, "bccgcnt_4", rec.bccgcnt_4);
			rx.add(record, "bccgwgt_4", rec.bccgwgt_4);
			rx.add(record, "bccgwgt1_4", rec.bccgwgt1_4);			
			rx.add(record, "bccgamt_4", rec.bccgamt_4);
			rx.add(record, "bccgwgt", rec.bccgwgt);
			rx.add(record, "bccgamt", rec.bccgamt);
			rx.add(record, "bccgvat", rec.bccgvat);
			rx.add(record, "bccgtot", rec.bccgtot);
			//rx.add(record, "bccgcnt_0", StringUtil.replaceToXml(rec.bccgcnt_0));
			//rx.add(record, "bccgwgt_0", StringUtil.replaceToXml(rec.bccgwgt_0));
			//rx.add(record, "bccgamt_0", StringUtil.replaceToXml(rec.bccgamt_0));
			//rx.add(record, "bccgcnt_1", StringUtil.replaceToXml(rec.bccgcnt_1));
			//rx.add(record, "bccgwgt_1", StringUtil.replaceToXml(rec.bccgwgt_1));
			//rx.add(record, "bccgamt_1", StringUtil.replaceToXml(rec.bccgamt_1));
			//rx.add(record, "bccgwgt", StringUtil.replaceToXml(rec.bccgwgt));
			//rx.add(record, "bccgamt", StringUtil.replaceToXml(rec.bccgamt));
			//rx.add(record, "bccgvat", StringUtil.replaceToXml(rec.bccgvat));
			//rx.add(record, "bccgtot", StringUtil.replaceToXml(rec.bccgtot));
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
<mt_commatr_8103_l>
	<dataSet>
		<CURLIST>
			<record>
				<bccgcnt_0/>
				<bccgwgt_0/>
				<bccgamt_0/>
				<bccgcnt_1/>
				<bccgwgt_1/>
				<bccgamt_1/>
				<bccgwgt/>
				<bccgamt/>
				<bccgvat/>
				<bccgtot/>
			</record>
		</CURLIST>
	</dataSet>
</mt_commatr_8103_l>
*/
%>

<% /* 작성시간 : Wed May 22 14:44:28 KST 2013 */ %>