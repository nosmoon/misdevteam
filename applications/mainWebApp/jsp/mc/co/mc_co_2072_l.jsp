<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.co.rec.*
	,	chosun.ciis.mc.co.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_CO_2072_LDataSet ds = (MC_CO_2072_LDataSet)request.getAttribute("ds");
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
			MC_CO_2072_LCURLIST1Record rec = (MC_CO_2072_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "work_no", rec.work_no);
			//rx.add(record, "seq", rec.seq);
			//rx.add(record, "budg_yymm", rec.budg_yymm);
			//rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "budg_cdnm", rec.budg_cdnm);
			//rx.add(record, "medi_cd", rec.medi_cd);
			//rx.add(record, "medi_nm", rec.medi_nm);
			//rx.add(record, "use_dept_cd", rec.use_dept_cd);
			//rx.add(record, "use_dept_cdnm", rec.use_dept_cdnm);
			//rx.add(record, "rmks", rec.rmks);
			//rx.add(record, "evnt_cd", rec.evnt_cd);
			//rx.add(record, "req_amt_tot", rec.req_amt_tot);
			//rx.add(record, "req_uprc", rec.req_uprc);
			//rx.add(record, "req_qunt_tot", rec.req_qunt_tot);
			rx.add(record, "work_no", StringUtil.replaceToXml(rec.work_no));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "budg_yymm", StringUtil.replaceToXml(rec.budg_yymm));
			rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			rx.add(record, "budg_cdnm", StringUtil.replaceToXml(rec.budg_cdnm));
			rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			rx.add(record, "medi_nm", StringUtil.replaceToXml(rec.medi_nm));
			rx.add(record, "use_dept_cd", StringUtil.replaceToXml(rec.use_dept_cd));
			rx.add(record, "use_dept_cdnm", StringUtil.replaceToXml(rec.use_dept_cdnm));
			rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
			rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
			rx.add(record, "req_amt_tot", StringUtil.replaceToXml(rec.req_amt_tot));
			rx.add(record, "req_uprc", StringUtil.replaceToXml(rec.req_uprc));
			rx.add(record, "req_qunt_tot", StringUtil.replaceToXml(rec.req_qunt_tot));
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
<mc_co_2072_l>
	<dataSet>
		<CURLIST1>
			<record>
				<work_no/>
				<seq/>
				<budg_yymm/>
				<budg_cd/>
				<budg_cdnm/>
				<medi_cd/>
				<medi_nm/>
				<use_dept_cd/>
				<use_dept_cdnm/>
				<rmks/>
				<evnt_cd/>
				<req_amt_tot/>
				<req_uprc/>
				<req_qunt_tot/>
			</record>
		</CURLIST1>
	</dataSet>
</mc_co_2072_l>
*/
%>

<% /* 작성시간 : Wed Jul 08 09:05:55 KST 2009 */ %>