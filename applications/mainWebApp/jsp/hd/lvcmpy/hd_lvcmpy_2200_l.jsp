<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.lvcmpy.rec.*
	,	chosun.ciis.hd.lvcmpy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_LVCMPY_2200_LDataSet ds = (HD_LVCMPY_2200_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_LVCMPY_2200_LCURLISTRecord rec = (HD_LVCMPY_2200_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "cmpy_nm", rec.cmpy_nm);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "impt_saly", rec.impt_saly);
			rx.add(record, "impt_bns", rec.impt_bns);
			rx.add(record, "aprv_bns_tot_amt", rec.aprv_bns_tot_amt);
			rx.add(record, "non_tax_work", rec.non_tax_work);
			rx.add(record, "non_tax_prod", rec.non_tax_prod);
			rx.add(record, "non_tax_frnc", rec.non_tax_frnc);
			rx.add(record, "non_tax_etc", rec.non_tax_etc);
			rx.add(record, "hosp_insr_fee", rec.hosp_insr_fee);
			rx.add(record, "np_pymt_amt", rec.np_pymt_amt);
			rx.add(record, "emp_insr_fee", rec.emp_insr_fee);
			rx.add(record, "deci_incm_tax", rec.deci_incm_tax);
			rx.add(record, "deci_res_tax", rec.deci_res_tax);
			rx.add(record, "seq", rec.seq);
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
			<emp_no/>
			<cmpy_nm/>
			<ern/>
			<impt_saly/>
			<impt_bns/>
			<aprv_bns_tot_amt/>
			<non_tax_work/>
			<non_tax_prod/>
			<non_tax_frnc/>
			<non_tax_etc/>
			<hosp_insr_fee/>
			<np_pymt_amt/>
			<emp_insr_fee/>
			<deci_incm_tax/>
			<deci_res_tax/>
			<seq/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu May 07 09:58:37 KST 2009 */ %>