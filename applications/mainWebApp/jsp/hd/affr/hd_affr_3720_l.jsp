<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_3720_LDataSet ds = (HD_AFFR_3720_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_3720_LCURLISTRecord rec = (HD_AFFR_3720_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "aply_yy", rec.aply_yy);
			rx.add(record, "aply_no", rec.aply_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "aplc_dt", rec.aplc_dt);
			rx.add(record, "cmpy_insr_cd", rec.cmpy_insr_cd);
			rx.add(record, "pay_cd", rec.pay_cd);
			rx.add(record, "pay_dt", rec.pay_dt);
			rx.add(record, "pay_amt", rec.pay_amt);
			rx.add(record, "acpn_dt", rec.acpn_dt);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "org_cd", rec.org_cd);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "patyinsr_yn", rec.patyinsr_yn);		
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
<hd_affr_3720_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<occr_dt/>
				<seq/>
				<aply_yy/>
				<aply_no/>
				<flnm/>
				<prn/>
				<aplc_dt/>
				<cmpy_insr_cd/>
				<pay_cd/>
				<pay_dt/>
				<pay_amt/>
				<acpn_dt/>
				<remk/>
				<magam_flag/>
				<dept_cd/>
				<dept_nm/>
				<posi_cd/>
				<posi_nm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_3720_l>
*/
%>

<% /* 작성시간 : Thu Jul 02 17:57:44 KST 2015 */ %>