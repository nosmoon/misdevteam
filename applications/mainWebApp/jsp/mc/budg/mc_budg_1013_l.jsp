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
	MC_BUDG_1013_LDataSet ds = (MC_BUDG_1013_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_1013_LCURLISTRecord rec = (MC_BUDG_1013_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "evnt_cd_ch", rec.evnt_cd_ch);
			rx.add(record, "evnt_nm", rec.evnt_nm);
			rx.add(record, "bgn_dt", rec.bgn_dt);
			rx.add(record, "last_dt", rec.last_dt);
			rx.add(record, "supv_dept_cd", rec.supv_dept_cd);
			rx.add(record, "buseonm", rec.buseonm);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "a_igbhannm", rec.a_igbhannm);
			rx.add(record, "evnt_nm1", rec.evnt_nm1);
			rx.add(record, "evnt_nm2", rec.evnt_nm2);
			//rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
			//rx.add(record, "evnt_cd_ch", StringUtil.replaceToXml(rec.evnt_cd_ch));
			//rx.add(record, "evnt_nm", StringUtil.replaceToXml(rec.evnt_nm));
			//rx.add(record, "bgn_dt", StringUtil.replaceToXml(rec.bgn_dt));
			//rx.add(record, "last_dt", StringUtil.replaceToXml(rec.last_dt));
			//rx.add(record, "supv_dept_cd", StringUtil.replaceToXml(rec.supv_dept_cd));
			//rx.add(record, "buseonm", StringUtil.replaceToXml(rec.buseonm));
			//rx.add(record, "incmg_pers", StringUtil.replaceToXml(rec.incmg_pers));
			//rx.add(record, "a_igbhannm", StringUtil.replaceToXml(rec.a_igbhannm));
			//rx.add(record, "evnt_nm1", StringUtil.replaceToXml(rec.evnt_nm1));
			//rx.add(record, "evnt_nm2", StringUtil.replaceToXml(rec.evnt_nm2));
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
<mc_budg_1013_l>
	<dataSet>
		<CURLIST>
			<record>
				<evnt_cd/>
				<evnt_cd_ch/>
				<evnt_nm/>
				<bgn_dt/>
				<last_dt/>
				<supv_dept_cd/>
				<buseonm/>
				<incmg_pers/>
				<a_igbhannm/>
				<evnt_nm1/>
				<evnt_nm2/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_1013_l>
*/
%>

<% /* 작성시간 : Fri Nov 25 14:38:52 KST 2011 */ %>