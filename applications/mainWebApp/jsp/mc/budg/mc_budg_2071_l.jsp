<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.budg.rec.*
	,	chosun.ciis.mc.budg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_BUDG_2071_LDataSet ds = (MC_BUDG_2071_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_2071_LCURLIST2Record rec = (MC_BUDG_2071_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_yy", rec.budg_yy);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.addCData(record, "rmks", rec.rmks);
			rx.add(record, "work_no", rec.work_no);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "use_dept_cd", rec.use_dept_cd);
			rx.addCData(record, "abrv_nm", rec.abrv_nm);
			rx.add(record, "budg_yymm01", rec.budg_yymm01);
			rx.add(record, "budg_yymm02", rec.budg_yymm02);
			rx.add(record, "budg_yymm03", rec.budg_yymm03);
			rx.add(record, "budg_yymm04", rec.budg_yymm04);
			rx.add(record, "budg_yymm05", rec.budg_yymm05);
			rx.add(record, "budg_yymm06", rec.budg_yymm06);
			rx.add(record, "budg_yymm07", rec.budg_yymm07);
			rx.add(record, "budg_yymm08", rec.budg_yymm08);
			rx.add(record, "budg_yymm09", rec.budg_yymm09);
			rx.add(record, "budg_yymm10", rec.budg_yymm10);
			rx.add(record, "budg_yymm11", rec.budg_yymm11);
			rx.add(record, "budg_yymm12", rec.budg_yymm12);
			rx.add(record, "req_amt_tot", rec.req_amt_tot);
			rx.add(record, "jobtag", "");
			//rx.add(record, "budg_yy", StringUtil.replaceToXml(rec.budg_yy));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
			//rx.add(record, "work_no", StringUtil.replaceToXml(rec.work_no));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "use_dept_cd", StringUtil.replaceToXml(rec.use_dept_cd));
			//rx.add(record, "abrv_nm", StringUtil.replaceToXml(rec.abrv_nm));
			//rx.add(record, "budg_yymm01", StringUtil.replaceToXml(rec.budg_yymm01));
			//rx.add(record, "budg_yymm02", StringUtil.replaceToXml(rec.budg_yymm02));
			//rx.add(record, "budg_yymm03", StringUtil.replaceToXml(rec.budg_yymm03));
			//rx.add(record, "budg_yymm04", StringUtil.replaceToXml(rec.budg_yymm04));
			//rx.add(record, "budg_yymm05", StringUtil.replaceToXml(rec.budg_yymm05));
			//rx.add(record, "budg_yymm06", StringUtil.replaceToXml(rec.budg_yymm06));
			//rx.add(record, "budg_yymm07", StringUtil.replaceToXml(rec.budg_yymm07));
			//rx.add(record, "budg_yymm08", StringUtil.replaceToXml(rec.budg_yymm08));
			//rx.add(record, "budg_yymm09", StringUtil.replaceToXml(rec.budg_yymm09));
			//rx.add(record, "budg_yymm10", StringUtil.replaceToXml(rec.budg_yymm10));
			//rx.add(record, "budg_yymm11", StringUtil.replaceToXml(rec.budg_yymm11));
			//rx.add(record, "budg_yymm12", StringUtil.replaceToXml(rec.budg_yymm12));
			//rx.add(record, "req_amt_tot", StringUtil.replaceToXml(rec.req_amt_tot));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MC_BUDG_2071_LCURLIST1Record rec = (MC_BUDG_2071_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "budg_yymm", rec.budg_yymm);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "work_no", rec.work_no);
			rx.addCData(record, "rmks", rec.rmks);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "dtls_medi_cd", rec.dtls_medi_cd);
			rx.add(record, "dtls_medi_cd_nm", rec.dtls_medi_cd_nm);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "budg_yymm", StringUtil.replaceToXml(rec.budg_yymm));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
			//rx.add(record, "work_no", StringUtil.replaceToXml(rec.work_no));
			//rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
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
<mc_budg_2071_l>
	<dataSet>
		<CURLIST2>
			<record>
				<budg_yy/>
				<medi_cd/>
				<rmks/>
				<work_no/>
				<seq/>
				<use_dept_cd/>
				<abrv_nm/>
				<budg_yymm01/>
				<budg_yymm02/>
				<budg_yymm03/>
				<budg_yymm04/>
				<budg_yymm05/>
				<budg_yymm06/>
				<budg_yymm07/>
				<budg_yymm08/>
				<budg_yymm09/>
				<budg_yymm10/>
				<budg_yymm11/>
				<budg_yymm12/>
				<req_amt_tot/>
			</record>
		</CURLIST2>
	</dataSet>
</mc_budg_2071_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_budg_2071_l>
	<dataSet>
		<CURLIST1>
			<record>
				<cmpy_cd/>
				<budg_yymm/>
				<budg_cd/>
				<dept_cd/>
				<evnt_cd/>
				<work_no/>
				<rmks/>
				<medi_cd/>
			</record>
		</CURLIST1>
	</dataSet>
</mc_budg_2071_l>
*/
%>

<% /* 작성시간 : Thu Jul 23 17:38:54 KST 2009 */ %>