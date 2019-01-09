<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.duty.rec.*
	,	chosun.ciis.hd.duty.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DUTY_1801_LDataSet ds = (HD_DUTY_1801_LDataSet)request.getAttribute("ds");
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
			HD_DUTY_1801_LCURLISTRecord rec = (HD_DUTY_1801_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "duty_cnt", rec.duty_cnt);
			rx.add(record, "vaca_cnt", rec.vaca_cnt);
			rx.add(record, "stay_tm", rec.stay_tm);
			rx.add(record, "duty_tm", rec.duty_tm);
			rx.add(record, "rest_tm", rec.rest_tm);
			rx.add(record, "basi_tm", rec.basi_tm);
			rx.add(record, "excs_tm", rec.excs_tm);
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "duty_cnt", StringUtil.replaceToXml(rec.duty_cnt));
			//rx.add(record, "vaca_cnt", StringUtil.replaceToXml(rec.vaca_cnt));
			//rx.add(record, "stay_tm", StringUtil.replaceToXml(rec.stay_tm));
			//rx.add(record, "duty_tm", StringUtil.replaceToXml(rec.duty_tm));
			//rx.add(record, "rest_tm", StringUtil.replaceToXml(rec.rest_tm));
			//rx.add(record, "basi_tm", StringUtil.replaceToXml(rec.basi_tm));
			//rx.add(record, "excs_tm", StringUtil.replaceToXml(rec.excs_tm));
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
<hd_duty_1801_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<dty_nm/>
				<posi_nm/>
				<duty_cnt/>
				<vaca_cnt/>
				<stay_tm/>
				<duty_tm/>
				<rest_tm/>
				<basi_tm/>
				<excs_tm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_duty_1801_l>
*/
%>

<% /* 작성시간 : Tue Jun 12 17:57:58 KST 2018 */ %>