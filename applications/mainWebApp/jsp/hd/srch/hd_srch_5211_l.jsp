<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.srch.rec.*
	,	chosun.ciis.hd.srch.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SRCH_5211_LDataSet ds = (HD_SRCH_5211_LDataSet)request.getAttribute("ds");
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
			HD_SRCH_5211_LCURLIST2Record rec = (HD_SRCH_5211_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.addCData(record, "dept_nm", rec.dept_nm);
			rx.add(record, "flnm", rec.flnm);
			rx.addCData(record, "posi_nm", rec.posi_nm);
			rx.addCData(record, "dspch_prd", rec.dspch_prd);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "dspch_prd", StringUtil.replaceToXml(rec.dspch_prd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_SRCH_5211_LCURLIST1Record rec = (HD_SRCH_5211_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.addCData(record, "addm_dept_nm", rec.addm_dept_nm);
			rx.addCData(record, "dept_nm", rec.dept_nm);
			rx.add(record, "flnm", rec.flnm);
			rx.addCData(record, "dspch_prd", rec.dspch_prd);
			rx.addCData(record, "remk", rec.remk);
			//rx.add(record, "appmt_resn_nm", StringUtil.replaceToXml(rec.appmt_resn_nm));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dspch_prd", StringUtil.replaceToXml(rec.dspch_prd));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
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
<hd_srch_5211_l>
	<dataSet>
		<CURLIST2>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<flnm/>
				<dept_nm/>
				<flnm/>
				<posi_nm/>
				<dspch_prd/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_srch_5211_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_srch_5211_l>
	<dataSet>
		<CURLIST1>
			<record>
				<appmt_resn_nm/>
				<dept_nm/>
				<flnm/>
				<dspch_prd/>
				<remk/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_srch_5211_l>
*/
%>

<% /* 작성시간 : Thu Nov 15 11:03:28 KST 2018 */ %>