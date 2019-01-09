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
	HD_VACA_3510_LDataSet ds = (HD_VACA_3510_LDataSet)request.getAttribute("ds");
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
			HD_VACA_3510_LCURLISTRecord rec = (HD_VACA_3510_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "chg_dept_cd", rec.chg_dept_cd);
			rx.add(record, "chg_dept_nm", rec.chg_dept_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "chg_posi_cd", rec.chg_posi_cd);
			rx.add(record, "chg_posi_nm", rec.chg_posi_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "chg_dty_cd", rec.chg_dty_cd);
			rx.add(record, "chg_dty_nm", rec.chg_dty_nm);
			rx.add(record, "appmt_dt", rec.appmt_dt);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "chg_dept_cd", StringUtil.replaceToXml(rec.chg_dept_cd));
			//rx.add(record, "chg_dept_nm", StringUtil.replaceToXml(rec.chg_dept_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "chg_posi_cd", StringUtil.replaceToXml(rec.chg_posi_cd));
			//rx.add(record, "chg_posi_nm", StringUtil.replaceToXml(rec.chg_posi_nm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "chg_dty_cd", StringUtil.replaceToXml(rec.chg_dty_cd));
			//rx.add(record, "chg_dty_nm", StringUtil.replaceToXml(rec.chg_dty_nm));
			//rx.add(record, "appmt_dt", StringUtil.replaceToXml(rec.appmt_dt));
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
<hd_vaca_3510_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<nm_korn/>
				<dept_cd/>
				<dept_nm/>
				<chg_dept_cd/>
				<chg_dept_nm/>
				<posi_cd/>
				<posi_nm/>
				<chg_posi_cd/>
				<chg_posi_nm/>
				<dty_cd/>
				<dty_nm/>
				<chg_dty_cd/>
				<chg_dty_nm/>
				<appmt_dt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_vaca_3510_l>
*/
%>

<% /* 작성시간 : Wed Aug 05 16:19:37 KST 2015 */ %>