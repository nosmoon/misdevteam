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
	HD_DUTY_1500_LDataSet ds = (HD_DUTY_1500_LDataSet)request.getAttribute("ds");
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
			HD_DUTY_1500_LCURLISTRecord rec = (HD_DUTY_1500_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "duty_behv_yymm", rec.duty_behv_yymm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "fix_labr_dds", rec.fix_labr_dds);
			rx.add(record, "week_hody_duty_dds", rec.week_hody_duty_dds);
			rx.add(record, "nissu_dd_duty_dds", rec.nissu_dd_duty_dds);
			rx.add(record, "lgl_hody_duty_dds", rec.lgl_hody_duty_dds);
			rx.add(record, "duty_dds_stot", rec.duty_dds_stot);
			rx.add(record, "edu_dds", rec.edu_dds);
			rx.add(record, "busi_trip_dds", rec.busi_trip_dds);
			rx.add(record, "temp_dds", rec.temp_dds);
			rx.add(record, "vaca_use_dds_stot", rec.vaca_use_dds_stot);
			rx.add(record, "year_use_dds", rec.year_use_dds);
			rx.add(record, "alvc_use_dds", rec.alvc_use_dds);
			rx.add(record, "congr_condl_vaca_use_dds", rec.congr_condl_vaca_use_dds);
			rx.add(record, "offi_vaca_use_dds", rec.offi_vaca_use_dds);
			rx.add(record, "sick_vaca_use_dds", rec.sick_vaca_use_dds);
			rx.add(record, "hlth_vaca_use_dds", rec.hlth_vaca_use_dds);
			rx.add(record, "rest_vaca_use_dds", rec.rest_vaca_use_dds);
			rx.add(record, "etc_vaca_use_dds", rec.etc_vaca_use_dds);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist.size());
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
			<duty_behv_yymm/>
			<dept_nm/>
			<emp_no/>
			<nm_korn/>
			<dty_nm/>
			<posi_nm/>
			<fix_labr_dds/>
			<week_hody_duty_dds/>
			<nissu_dd_duty_dds/>
			<lgl_hody_duty_dds/>
			<duty_dds_stot/>
			<edu_dds/>
			<busi_trip_dds/>
			<temp_dds/>
			<vaca_use_dds_stot/>
			<year_use_dds/>
			<alvc_use_dds/>
			<congr_condl_vaca_use_dds/>
			<offi_vaca_use_dds/>
			<sick_vaca_use_dds/>
			<hlth_vaca_use_dds/>
			<rest_vaca_use_dds/>
			<etc_vaca_use_dds/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 31 15:55:52 KST 2009 */ %>