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
	FC_ACCT_2450_LDataSet ds = (FC_ACCT_2450_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURCOMMLIST BEGIN */
		recordSet = rx.add(dataSet, "CURCOMMLIST", "");

		for(int i = 0; i < ds.curcommlist.size(); i++) {
			FC_ACCT_2450_LCURCOMMLISTRecord rec = (FC_ACCT_2450_LCURCOMMLISTRecord)ds.curcommlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "titl", rec.titl);
			//rx.add(record, "reso_amt", rec.reso_amt);
			//rx.add(record, "impt_expn_clsf", rec.impt_expn_clsf);
			//rx.add(record, "proc_clsf", rec.proc_clsf);
			//rx.add(record, "proc_clsf_nm", rec.proc_clsf_nm);
			//rx.add(record, "proc_dt_tm", rec.proc_dt_tm);
			//rx.add(record, "emp_no", rec.emp_no);
			//rx.add(record, "nm_korn", rec.nm_korn);
			//rx.add(record, "incmg_pers_ipadd", rec.incmg_pers_ipadd);
			rx.add(record, "titl", StringUtil.replaceToXml(rec.titl));
			rx.add(record, "reso_amt", StringUtil.replaceToXml(rec.reso_amt));
			rx.add(record, "impt_expn_clsf", StringUtil.replaceToXml(rec.impt_expn_clsf));
			rx.add(record, "proc_clsf", StringUtil.replaceToXml(rec.proc_clsf));
			rx.add(record, "proc_clsf_nm", StringUtil.replaceToXml(rec.proc_clsf_nm));
			rx.add(record, "proc_dt_tm", StringUtil.replaceToXml(rec.proc_dt_tm));
			rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			rx.add(record, "incmg_pers_ipadd", StringUtil.replaceToXml(rec.incmg_pers_ipadd));
		}
		rx.add(recordSet, "totalcnt", ds.curcommlist.size());
		/****** CURCOMMLIST END */

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
<fc_acct_2450_l>
	<dataSet>
		<CURCOMMLIST>
			<record>
				<titl/>
				<reso_amt/>
				<impt_expn_clsf/>
				<proc_clsf/>
				<proc_clsf_nm/>
				<proc_dt_tm/>
				<emp_no/>
				<nm_korn/>
				<incmg_pers_ipadd/>
			</record>
		</CURCOMMLIST>
	</dataSet>
</fc_acct_2450_l>
*/
%>

<% /* 작성시간 : Wed Jul 15 21:25:24 KST 2009 */ %>