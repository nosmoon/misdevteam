<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.duty.rec.*
	,	chosun.ciis.hd.duty.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DUTY_1203_LDataSet ds = (HD_DUTY_1203_LDataSet)request.getAttribute("ds");
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
			HD_DUTY_1203_LCURLISTRecord rec = (HD_DUTY_1203_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "duty_dt", rec.duty_dt);
			rx.add(record, "prsnt_tm", rec.prsnt_tm);
			rx.add(record, "finish_dd_clsf", rec.finish_dd_clsf);
			rx.add(record, "finish_dd_nm", rec.finish_dd_nm);
			rx.add(record, "finish_tm", rec.finish_tm);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_nm", rec.proc_nm);
			rx.add(record, "hody_clsf", rec.hody_clsf);
			rx.add(record, "hody_nm", rec.hody_nm);
			rx.add(record, "vaca_cd", rec.vaca_cd);
			rx.add(record, "vaca_nm", rec.vaca_nm);
			rx.add(record, "addm_rest_minute", rec.addm_rest_minute);
			rx.add(record, "duty_clsf", rec.duty_clsf); // 20180809 추가 

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
			<nm_korn/>
			<dept_cd/>
			<dept_nm/>
			<posi_cd/>
			<posi_nm/>
			<occr_dt/>
			<prsnt_tm/>
			<finish_dd_clsf/>
			<finish_dd_nm/>
			<finish_tm/>
			<proc_stat/>
			<proc_nm/>
			<hody_clsf/>
			<hody_nm/>
			<vaca/>
			<vaca_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Mar 20 18:22:49 KST 2009 */ %>