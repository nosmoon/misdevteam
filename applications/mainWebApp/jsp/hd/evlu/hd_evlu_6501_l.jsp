<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_6501_LDataSet ds = (HD_EVLU_6501_LDataSet)request.getAttribute("ds");
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
			HD_EVLU_6501_LCURLISTRecord rec = (HD_EVLU_6501_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "evlu_grp_cd", rec.evlu_grp_cd);
			rx.add(record, "evlu_grp_nm", rec.evlu_grp_nm);
			rx.add(record, "dept_nm1", rec.dept_nm1);
			rx.add(record, "emp_no1", rec.emp_no1);
			rx.add(record, "nm_korn1", rec.nm_korn1);
			rx.add(record, "dept_nm2", rec.dept_nm2);
			rx.add(record, "emp_no2", rec.emp_no2);
			rx.add(record, "nm_korn2", rec.nm_korn2);
			rx.add(record, "db_status", rec.db_status);
			rx.add(record, "evlu_yy", rec.evlu_yy);
			rx.add(record, "tms_clsf", rec.tms_clsf);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "evlu_grp_cd", StringUtil.replaceToXml(rec.evlu_grp_cd));
			//rx.add(record, "evlu_grp_nm", StringUtil.replaceToXml(rec.evlu_grp_nm));
			//rx.add(record, "dept_nm1", StringUtil.replaceToXml(rec.dept_nm1));
			//rx.add(record, "emp_no1", StringUtil.replaceToXml(rec.emp_no1));
			//rx.add(record, "nm_korn1", StringUtil.replaceToXml(rec.nm_korn1));
			//rx.add(record, "dept_nm2", StringUtil.replaceToXml(rec.dept_nm2));
			//rx.add(record, "emp_no2", StringUtil.replaceToXml(rec.emp_no2));
			//rx.add(record, "nm_korn2", StringUtil.replaceToXml(rec.nm_korn2));
			//rx.add(record, "db_status", StringUtil.replaceToXml(rec.db_status));
			//rx.add(record, "evlu_yy", StringUtil.replaceToXml(rec.evlu_yy));
			//rx.add(record, "tms_clsf", StringUtil.replaceToXml(rec.tms_clsf));
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
<hd_evlu_6501_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<dty_nm/>
				<evlu_grp_cd/>
				<evlu_grp_nm/>
				<dept_nm1/>
				<emp_no1/>
				<nm_korn1/>
				<dept_nm2/>
				<emp_no2/>
				<nm_korn2/>
				<db_status/>
				<evlu_yy/>
				<tms_clsf/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_6501_l>
*/
%>

<% /* 작성시간 : Tue Sep 22 16:20:04 KST 2015 */ %>