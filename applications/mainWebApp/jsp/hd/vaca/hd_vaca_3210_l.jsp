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
	HD_VACA_3210_LDataSet ds = (HD_VACA_3210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {		
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_VACA_3210_LCURLIST3Record rec = (HD_VACA_3210_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_cnt", rec.emp_cnt);			
			rx.addCData(record, "tot_week_rate", rec.tot_week_rate);
			rx.addCData(record, "tot_sunday_rate", rec.tot_sunday_rate);
		}
		/****** CURLIST3 END */
		
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_VACA_3210_LCURLIST2Record rec = (HD_VACA_3210_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "aply_yymm", rec.aply_yymm);
			rx.add(record, "week", rec.week);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "week1", rec.week1);
			rx.add(record, "week2", rec.week2);
			rx.add(record, "week3", rec.week3);
			rx.add(record, "week4", rec.week4);
			rx.add(record, "week5", rec.week5);
			rx.addCData(record, "sun_rate", rec.sun_rate+"%");
			rx.addCData(record, "week_rate", rec.week_rate+"%");
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_VACA_3210_LCURLIST1Record rec = (HD_VACA_3210_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "aply_yymm", rec.aply_yymm);
			rx.add(record, "week", rec.week);
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
			rx.add(record, "wkdy", rec.wkdy);
			rx.add(record, "frdt", rec.frdt);
			rx.add(record, "todt", rec.todt);
			rx.add(record, "hody_plan_dt_mon", rec.hody_plan_dt_mon);
			rx.add(record, "hody_plan_dt_tue", rec.hody_plan_dt_tue);
			rx.add(record, "hody_plan_dt_wed", rec.hody_plan_dt_wed);
			rx.add(record, "hody_plan_dt_thu", rec.hody_plan_dt_thu);
			rx.add(record, "hody_plan_dt_fri", rec.hody_plan_dt_fri);
			rx.add(record, "hody_plan_dt_sat", rec.hody_plan_dt_sat);
			rx.add(record, "hody_plan_dt_sun", rec.hody_plan_dt_sun);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_nm", rec.proc_nm);
			rx.addCData(record, "hody_plan_dt", rec.aply_yymm.substring(4,6)+"월"+rec.week+"주<"+rec.frdt+"-"+rec.todt+">");
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_3210_LCURLISTRecord rec = (HD_VACA_3210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "aply_yymm", rec.aply_yymm);
			rx.add(record, "week", rec.week);
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
			rx.add(record, "wkdy", rec.wkdy);
			rx.add(record, "frdt", rec.frdt);
			rx.add(record, "todt", rec.todt);
			rx.add(record, "hody_plan_dt_mon", rec.hody_plan_dt_mon);
			rx.add(record, "hody_plan_dt_tue", rec.hody_plan_dt_tue);
			rx.add(record, "hody_plan_dt_wed", rec.hody_plan_dt_wed);
			rx.add(record, "hody_plan_dt_thu", rec.hody_plan_dt_thu);
			rx.add(record, "hody_plan_dt_fri", rec.hody_plan_dt_fri);
			rx.add(record, "hody_plan_dt_sat", rec.hody_plan_dt_sat);
			rx.add(record, "hody_plan_dt_sun", rec.hody_plan_dt_sun);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_nm", rec.proc_nm);
			rx.addCData(record, "hody_plan_dt", rec.aply_yymm.substring(4,6)+"월"+rec.week+"주<"+rec.frdt+"-"+rec.todt+">");
			rx.add(record, "send", "");
			rx.add(record, "retu", "");
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
<hd_vaca_3210_l>
	<dataSet>
		<CURLIST2>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<aply_yymm/>
				<week/>
				<nm_korn/>
				<dept_cd/>
				<dept_nm/>
				<posi_cd/>
				<posi_nm/>
				<dty_cd/>
				<dty_nm/>
				<week1/>
				<week2/>
				<week3/>
				<week4/>
				<week5/>
				<sun_rate/>
				<week_rate/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_vaca_3210_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_vaca_3210_l>
	<dataSet>
		<CURLIST1>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<aply_yymm/>
				<week/>
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
				<wkdy/>
				<frdt/>
				<todt/>
				<hody_plan_dt_mon/>
				<hody_plan_dt_tue/>
				<hody_plan_dt_wed/>
				<hody_plan_dt_thu/>
				<hody_plan_dt_fri/>
				<hody_plan_dt_sat/>
				<hody_plan_dt_sun/>
				<proc_stat/>
				<proc_nm/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_vaca_3210_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_vaca_3210_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<aply_yymm/>
				<week/>
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
				<wkdy/>
				<frdt/>
				<todt/>
				<hody_plan_dt_mon/>
				<hody_plan_dt_tue/>
				<hody_plan_dt_wed/>
				<hody_plan_dt_thu/>
				<hody_plan_dt_fri/>
				<hody_plan_dt_sat/>
				<hody_plan_dt_sun/>
				<proc_stat/>
				<proc_nm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_vaca_3210_l>
*/
%>

<% /* 작성시간 : Fri Jul 17 14:27:06 KST 2015 */ %>