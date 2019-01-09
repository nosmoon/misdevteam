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
	MT_COMMATR_7510_LDataSet ds = (MT_COMMATR_7510_LDataSet)request.getAttribute("ds");
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
			MT_COMMATR_7510_LCURLIST2Record rec = (MT_COMMATR_7510_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fact_nm", rec.fact_nm);
			rx.add(record, "wgt", rec.wgt);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "vat", rec.vat);
			rx.add(record, "tot", rec.tot);
			rx.add(record, "per2", rec.per2);
			//rx.add(record, "fact_nm", StringUtil.replaceToXml(rec.fact_nm));
			//rx.add(record, "wgt", StringUtil.replaceToXml(rec.wgt));
			//rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
			//rx.add(record, "vat", StringUtil.replaceToXml(rec.vat));
			//rx.add(record, "tot", StringUtil.replaceToXml(rec.tot));
			//rx.add(record, "per2", StringUtil.replaceToXml(rec.per2));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_COMMATR_7510_LCURLIST1Record rec = (MT_COMMATR_7510_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "jejisa", rec.jejisa);
			rx.add(record, "paper_cmpy", rec.paper_cmpy);
			rx.add(record, "wgt_tot", rec.wgt_tot);
			rx.add(record, "per_tot", rec.per_tot);
			rx.add(record, "std_rate", rec.std_rate);
			rx.add(record, "diff_rate", rec.diff_rate);
			rx.add(record, "amt", rec.amt);
			//rx.add(record, "jejisa", StringUtil.replaceToXml(rec.jejisa));
			//rx.add(record, "paper_cmpy", StringUtil.replaceToXml(rec.paper_cmpy));
			//rx.add(record, "wgt_tot", StringUtil.replaceToXml(rec.wgt_tot));
			//rx.add(record, "per_tot", StringUtil.replaceToXml(rec.per_tot));
			//rx.add(record, "std_rate", StringUtil.replaceToXml(rec.std_rate));
			//rx.add(record, "diff_rate", StringUtil.replaceToXml(rec.diff_rate));
			//rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */
		
		recordSet = rx.add(dataSet, "ly_wgt", ds.ly_wgt);
		recordSet = rx.add(dataSet, "ly_avg", ds.ly_avg);
		recordSet = rx.add(dataSet, "lm_wgt", ds.lm_wgt);
		recordSet = rx.add(dataSet, "lm_avg", ds.lm_avg);
		

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
<mt_commatr_7510_l>
	<dataSet>
		<CURLIST2>
			<record>
				<fact_nm/>
				<wgt/>
				<amt/>
				<vat/>
				<tot/>
				<per2/>
			</record>
		</CURLIST2>
	</dataSet>
</mt_commatr_7510_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_commatr_7510_l>
	<dataSet>
		<CURLIST1>
			<record>
				<jejisa/>
				<paper_cmpy/>
				<wgt_tot/>
				<per_tot/>
				<std_rate/>
				<diff_rate/>
				<amt/>
			</record>
		</CURLIST1>
	</dataSet>
</mt_commatr_7510_l>
*/
%>

<% /* 작성시간 : Fri Dec 04 14:52:34 KST 2015 */ %>