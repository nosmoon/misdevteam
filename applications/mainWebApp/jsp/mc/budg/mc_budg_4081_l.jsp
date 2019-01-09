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
	MC_BUDG_4081_LDataSet ds = (MC_BUDG_4081_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_4081_LCURLISTRecord rec = (MC_BUDG_4081_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "evnt_nm", rec.evnt_nm);
			rx.add(record, "supv_dept_cd", rec.supv_dept_cd);
			rx.add(record, "bgn_dt", rec.bgn_dt);
			rx.add(record, "last_dt", rec.last_dt);
			rx.add(record, "intfce_yn", rec.intfce_yn);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
			//rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
			//rx.add(record, "evnt_nm", StringUtil.replaceToXml(rec.evnt_nm));
			//rx.add(record, "supv_dept_cd", StringUtil.replaceToXml(rec.supv_dept_cd));
			//rx.add(record, "bgn_dt", StringUtil.replaceToXml(rec.bgn_dt));
			//rx.add(record, "last_dt", StringUtil.replaceToXml(rec.last_dt));
			//rx.add(record, "intfce_yn", StringUtil.replaceToXml(rec.intfce_yn));
			//rx.add(record, "incmg_pers", StringUtil.replaceToXml(rec.incmg_pers));
			//rx.add(record, "incmg_dt_tm", StringUtil.replaceToXml(rec.incmg_dt_tm));
			//rx.add(record, "chg_pers", StringUtil.replaceToXml(rec.chg_pers));
			//rx.add(record, "chg_dt_tm", StringUtil.replaceToXml(rec.chg_dt_tm));
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
<mc_budg_4081_l>
	<dataSet>
		<CURLIST>
			<record>
				<evnt_cd/>
				<evnt_nm/>
				<supv_dept_cd/>
				<bgn_dt/>
				<last_dt/>
				<intfce_yn/>
				<incmg_pers/>
				<incmg_dt_tm/>
				<chg_pers/>
				<chg_dt_tm/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_4081_l>
*/
%>

<% /* 작성시간 : Mon May 18 14:24:01 KST 2009 */ %>