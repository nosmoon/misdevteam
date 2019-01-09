<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.srch.rec.*
	,	chosun.ciis.hd.srch.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SRCH_1700_LDataSet ds = (HD_SRCH_1700_LDataSet)request.getAttribute("ds");
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
			HD_SRCH_1700_LCURLISTRecord rec = (HD_SRCH_1700_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "up_dept_nm", rec.up_dept_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "birth_yyyymmdd", rec.birth_yyyymmdd);
			rx.add(record, "s1", rec.s1);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "rmsthr", rec.rmsthr);
			rx.add(record, "last_upgrd_dt", rec.last_upgrd_dt);
			rx.add(record, "wlrrmq", rec.wlrrmq);
			rx.add(record, "in_cmpy_clsf_nm", rec.in_cmpy_clsf_nm);
			rx.add(record, "open_invit_clsf_nm", rec.open_invit_clsf_nm);
			rx.add(record, "open_invit_desty", rec.open_invit_desty);
			rx.add(record, "forc_clsi_nm", rec.forc_clsi_nm);
			rx.add(record, "cls_nm", rec.cls_nm);
			rx.add(record, "scl_nm", rec.scl_nm);
			rx.add(record, "evlu2", rec.evlu2);
			rx.add(record, "evlu1", rec.evlu1);
			rx.add(record, "evlu4", rec.evlu4);
			rx.add(record, "evlu3", rec.evlu3);
			rx.add(record, "carr_aprvdds", rec.carr_aprvdds);
			//rx.add(record, "up_dept_nm", StringUtil.replaceToXml(rec.up_dept_nm));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "birth_yyyymmdd", StringUtil.replaceToXml(rec.birth_yyyymmdd));
			//rx.add(record, "s1", StringUtil.replaceToXml(rec.s1));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "rmsthr", StringUtil.replaceToXml(rec.rmsthr));
			//rx.add(record, "last_upgrd_dt", StringUtil.replaceToXml(rec.last_upgrd_dt));
			//rx.add(record, "wlrrmq", StringUtil.replaceToXml(rec.wlrrmq));
			//rx.add(record, "in_cmpy_clsf_nm", StringUtil.replaceToXml(rec.in_cmpy_clsf_nm));
			//rx.add(record, "open_invit_clsf_nm", StringUtil.replaceToXml(rec.open_invit_clsf_nm));
			//rx.add(record, "open_invit_desty", StringUtil.replaceToXml(rec.open_invit_desty));
			//rx.add(record, "forc_clsi_nm", StringUtil.replaceToXml(rec.forc_clsi_nm));
			//rx.add(record, "cls_nm", StringUtil.replaceToXml(rec.cls_nm));
			//rx.add(record, "scl_nm", StringUtil.replaceToXml(rec.scl_nm));
			//rx.add(record, "evlu2", StringUtil.replaceToXml(rec.evlu2));
			//rx.add(record, "evlu1", StringUtil.replaceToXml(rec.evlu1));
			//rx.add(record, "evlu4", StringUtil.replaceToXml(rec.evlu4));
			//rx.add(record, "evlu3", StringUtil.replaceToXml(rec.evlu3));
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
<hd_srch_1700_l>
	<dataSet>
		<CURLIST>
			<record>
				<up_dept_nm/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<dty_nm/>
				<posi_nm/>
				<birth_yyyymmdd/>
				<s1/>
				<in_cmpy_dt/>
				<rmsthr/>
				<last_upgrd_dt/>
				<wlrrmq/>
				<in_cmpy_clsf_nm/>
				<open_invit_clsf_nm/>
				<open_invit_desty/>
				<forc_clsi_nm/>
				<cls_nm/>
				<scl_nm/>
				<evlu2/>
				<evlu1/>
				<evlu4/>
				<evlu3/>
			</record>
		</CURLIST>
	</dataSet>
</hd_srch_1700_l>
*/
%>

<% /* 작성시간 : Fri Sep 04 09:56:16 KST 2009 */ %>