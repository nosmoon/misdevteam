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
	HD_VACA_3320_LDataSet ds = (HD_VACA_3320_LDataSet)request.getAttribute("ds");
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
			HD_VACA_3320_LCURLIST2Record rec = (HD_VACA_3320_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_cnt", rec.emp_cnt);
			rx.add(record, "tot_acc_cnt", rec.tot_acc_cnt);
			rx.add(record, "tot_alvc_use_rate", rec.tot_alvc_use_rate);
			rx.add(record, "tot_week_rate", rec.tot_week_rate);
			rx.add(record, "tot_sunday_rate", rec.tot_sunday_rate);
			//rx.add(record, "emp_cnt", StringUtil.replaceToXml(rec.emp_cnt));
			//rx.add(record, "tot_acc_cnt", StringUtil.replaceToXml(rec.tot_acc_cnt));
			//rx.add(record, "tot_alvc_use_rate", StringUtil.replaceToXml(rec.tot_alvc_use_rate));
			//rx.add(record, "tot_week_rate", StringUtil.replaceToXml(rec.tot_week_rate));
			//rx.add(record, "tot_sunday_rate", StringUtil.replaceToXml(rec.tot_sunday_rate));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_3320_LCURLISTRecord rec = (HD_VACA_3320_LCURLISTRecord)ds.curlist.get(i);
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
			rx.add(record, "tot_acc_cnt", rec.tot_acc_cnt);
			rx.add(record, "alvc_use_rate", rec.alvc_use_rate);
			rx.add(record, "sunday_rate", rec.sunday_rate);
			rx.add(record, "week_rate", rec.week_rate);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "tot_acc_cnt", StringUtil.replaceToXml(rec.tot_acc_cnt));
			//rx.add(record, "alvc_use_rate", StringUtil.replaceToXml(rec.alvc_use_rate));
			//rx.add(record, "sunday_rate", StringUtil.replaceToXml(rec.sunday_rate));
			//rx.add(record, "week_rate", StringUtil.replaceToXml(rec.week_rate));
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
<hd_vaca_3320_l>
	<dataSet>
		<CURLIST2>
			<record>
				<emp_cnt/>
				<tot_acc_cnt/>
				<tot_alvc_use_rate/>
				<tot_week_rate/>
				<tot_sunday_rate/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_vaca_3320_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_vaca_3320_l>
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
				<tot_acc_cnt/>
				<alvc_use_rate/>
				<sunday_rate/>
				<week_rate/>
			</record>
		</CURLIST>
	</dataSet>
</hd_vaca_3320_l>
*/
%>

<% /* 작성시간 : Thu Aug 20 15:21:30 KST 2015 */ %>