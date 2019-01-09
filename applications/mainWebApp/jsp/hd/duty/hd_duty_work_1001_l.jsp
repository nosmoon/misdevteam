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
	HD_DUTY_WORK_1001_LDataSet ds = (HD_DUTY_WORK_1001_LDataSet)request.getAttribute("ds");
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
			HD_DUTY_WORK_1001_LCURLISTRecord rec = (HD_DUTY_WORK_1001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "clndr_dt", rec.clndr_dt);
			rx.add(record, "prsnt_tm", rec.prsnt_tm);
			rx.add(record, "finish_tm", rec.finish_tm);
			rx.add(record, "stay_tm", rec.stay_tm);
			rx.add(record, "rest_tm", rec.rest_tm);
			rx.add(record, "duty_clsf_nm", rec.duty_clsf_nm);
			rx.add(record, "duty_dt", rec.duty_dt);
			rx.add(record, "proc_stat", rec.proc_stat);

			//rx.add(record, "clndr_dt", StringUtil.replaceToXml(rec.clndr_dt));
			//rx.add(record, "prsnt_tm", StringUtil.replaceToXml(rec.prsnt_tm));
			//rx.add(record, "finish_tm", StringUtil.replaceToXml(rec.finish_tm));
			//rx.add(record, "stay_tm", StringUtil.replaceToXml(rec.stay_tm));
			//rx.add(record, "rest_tm", StringUtil.replaceToXml(rec.rest_tm));
			//rx.add(record, "duty_clsf_nm", StringUtil.replaceToXml(rec.duty_clsf_nm));
		}
		rx.add(dataSet, "xx_tot_duty_tm", ds.getXx_tot_duty_tm() );
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
<hd_duty_work_1001_l>
	<dataSet>
		<CURLIST>
			<record>
				<clndr_dt/>
				<prsnt_tm/>
				<finish_tm/>
				<stay_tm/>
				<rest_tm/>
				<duty_clsf_nm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_duty_work_1001_l>
*/
%>

<% /* 작성시간 : Wed Jul 04 10:48:22 KST 2018 */ %>