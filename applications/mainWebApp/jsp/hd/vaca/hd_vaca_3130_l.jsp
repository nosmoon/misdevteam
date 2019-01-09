<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.vaca.rec.*
	,	chosun.ciis.hd.vaca.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_VACA_3130_LDataSet ds = (HD_VACA_3130_LDataSet)request.getAttribute("ds");
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
			HD_VACA_3130_LCURLISTRecord rec = (HD_VACA_3130_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "mon_ck", rec.mon_ck);
			rx.add(record, "tue_ck", rec.tue_ck);
			rx.add(record, "wed_ck", rec.wed_ck);
			rx.add(record, "thu_ck", rec.thu_ck);
			rx.add(record, "fri_ck", rec.fri_ck);
			rx.add(record, "sat_ck", rec.sat_ck);
			rx.add(record, "sun_ck", rec.sun_ck);
			rx.add(record, "aply_yymm", rec.aply_yymm);
			rx.add(record, "week", rec.week);
			rx.add(record, "wkdy", rec.wkdy);
			rx.add(record, "hody_plan_dt_mon", rec.hody_plan_dt_mon);
			rx.add(record, "hody_plan_dt_tue", rec.hody_plan_dt_tue);
			rx.add(record, "hody_plan_dt_wed", rec.hody_plan_dt_wed);
			rx.add(record, "hody_plan_dt_thu", rec.hody_plan_dt_thu);
			rx.add(record, "hody_plan_dt_fri", rec.hody_plan_dt_fri);
			rx.add(record, "hody_plan_dt_sat", rec.hody_plan_dt_sat);
			rx.add(record, "hody_plan_dt_sun", rec.hody_plan_dt_sun);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_nm", rec.proc_nm);
			rx.add(record, "rmn_vaca_dds", rec.rmn_vaca_dds);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "mon_ck", StringUtil.replaceToXml(rec.mon_ck));
			//rx.add(record, "tue_ck", StringUtil.replaceToXml(rec.tue_ck));
			//rx.add(record, "wed_ck", StringUtil.replaceToXml(rec.wed_ck));
			//rx.add(record, "thu_ck", StringUtil.replaceToXml(rec.thu_ck));
			//rx.add(record, "fri_ck", StringUtil.replaceToXml(rec.fri_ck));
			//rx.add(record, "sat_ck", StringUtil.replaceToXml(rec.sat_ck));
			//rx.add(record, "sun_ck", StringUtil.replaceToXml(rec.sun_ck));
			//rx.add(record, "aply_yymm", StringUtil.replaceToXml(rec.aply_yymm));
			//rx.add(record, "week", StringUtil.replaceToXml(rec.week));
			//rx.add(record, "wkdy", StringUtil.replaceToXml(rec.wkdy));
			//rx.add(record, "hody_plan_dt_mon", StringUtil.replaceToXml(rec.hody_plan_dt_mon));
			//rx.add(record, "hody_plan_dt_tue", StringUtil.replaceToXml(rec.hody_plan_dt_tue));
			//rx.add(record, "hody_plan_dt_wed", StringUtil.replaceToXml(rec.hody_plan_dt_wed));
			//rx.add(record, "hody_plan_dt_thu", StringUtil.replaceToXml(rec.hody_plan_dt_thu));
			//rx.add(record, "hody_plan_dt_fri", StringUtil.replaceToXml(rec.hody_plan_dt_fri));
			//rx.add(record, "hody_plan_dt_sat", StringUtil.replaceToXml(rec.hody_plan_dt_sat));
			//rx.add(record, "hody_plan_dt_sun", StringUtil.replaceToXml(rec.hody_plan_dt_sun));
			//rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
			//rx.add(record, "proc_nm", StringUtil.replaceToXml(rec.proc_nm));
			//rx.add(record, "rmn_vaca_dds", StringUtil.replaceToXml(rec.rmn_vaca_dds));
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
<hd_vaca_3130_l>
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
				<dty_cd/>
				<dty_nm/>
				<mon_ck/>
				<tue_ck/>
				<wed_ck/>
				<thu_ck/>
				<fri_ck/>
				<sat_ck/>
				<sun_ck/>
				<aply_yymm/>
				<week/>
				<wkdy/>
				<hody_plan_dt_mon/>
				<hody_plan_dt_tue/>
				<hody_plan_dt_wed/>
				<hody_plan_dt_thu/>
				<hody_plan_dt_fri/>
				<hody_plan_dt_sat/>
				<hody_plan_dt_sun/>
				<proc_stat/>
				<proc_nm/>
				<rmn_vaca_dds/>
			</record>
		</CURLIST>
	</dataSet>
</hd_vaca_3130_l>
*/
%>

<% /* 작성시간 : Mon Jun 08 14:48:23 KST 2015 */ %>