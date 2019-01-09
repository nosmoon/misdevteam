<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_8004_LDataSet ds = (HD_SALY_8004_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	int total_amt =   0 ;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_SALY_8004_LCURLISTRecord rec = (HD_SALY_8004_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "pymt_dt", rec.pymt_dt);
			rx.add(record, "welf_pens_amt", rec.welf_pens_amt);
			rx.add(record, "prsn_pens_amt", rec.prsn_pens_amt);
			rx.add(record, "prsn_sppt_amt", rec.prsn_sppt_amt);
			rx.add(record, "sepr_pens_amt", rec.sepr_pens_amt);
			rx.add(record, "remk", rec.remk);
			
			total_amt = total_amt +  Integer.parseInt(rec.sepr_pens_amt) ;
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "pymt_dt", StringUtil.replaceToXml(rec.pymt_dt));
			//rx.add(record, "welf_pens_amt", StringUtil.replaceToXml(rec.welf_pens_amt));
			//rx.add(record, "prsn_pens_amt", StringUtil.replaceToXml(rec.prsn_pens_amt));
			//rx.add(record, "prsn_sppt_amt", StringUtil.replaceToXml(rec.prsn_sppt_amt));
			//rx.add(record, "sepr_pens_amt", StringUtil.replaceToXml(rec.sepr_pens_amt));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		rx.add(recordSet, "total_amt", total_amt);
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
<hd_saly_8004_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<pymt_dt/>
				<welf_pens_amt/>
				<prsn_pens_amt/>
				<prsn_sppt_amt/>
				<sepr_pens_amt/>
				<remk/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_8004_l>
*/
%>

<% /* 작성시간 : Fri Mar 04 14:37:24 KST 2016 */ %>