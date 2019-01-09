<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pr.papmake.rec.*
	,	chosun.ciis.pr.papmake.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PAPMAKE_8011_LDataSet ds = (PR_PAPMAKE_8011_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PAPMAKE_8011_LCURLISTRecord rec = (PR_PAPMAKE_8011_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "dcmt_no", rec.dcmt_no);
			rx.add(record, "dcmt_clsf", rec.dcmt_clsf);
			rx.add(record, "dcmt_nm", rec.dcmt_nm);
			rx.add(record, "requ_dt", rec.requ_dt);
			rx.add(record, "requ_pers", rec.requ_pers);
			rx.add(record, "requ_pers_nm", rec.requ_pers_nm); 
			rx.add(record, "resp_dt", rec.resp_dt);
			rx.add(record, "resp_pers", rec.resp_pers);
			rx.add(record, "resp_pers_nm", rec.resp_pers_nm);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "remk2", rec.remk2);
			rx.add(record, "dcmt_tp", rec.dcmt_tp);
			rx.add(record, "tel_no", rec.tel_no);						
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "dcmt_no", StringUtil.replaceToXml(rec.dcmt_no));
			//rx.add(record, "dcmt_clsf", StringUtil.replaceToXml(rec.dcmt_clsf));
			//rx.add(record, "dcmt_nm", StringUtil.replaceToXml(rec.dcmt_nm));
			//rx.add(record, "requ_dt", StringUtil.replaceToXml(rec.requ_dt));
			//rx.add(record, "requ_pers", StringUtil.replaceToXml(rec.requ_pers));
			//rx.add(record, "requ_pers_nm", StringUtil.replaceToXml(rec.requ_pers_nm));
			//rx.add(record, "resp_dt", StringUtil.replaceToXml(rec.resp_dt));
			//rx.add(record, "resp_pers", StringUtil.replaceToXml(rec.resp_pers));
			//rx.add(record, "resp_eprs_nm", StringUtil.replaceToXml(rec.resp_eprs_nm));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
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
<pr_papmake_8011_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<occr_dt/>
				<dcmt_no/>
				<dcmt_clsf/>
				<dcmt_nm/>
				<requ_dt/>
				<requ_pers/>
				<requ_pers_nm/>
				<resp_dt/>
				<resp_pers/>
				<resp_eprs_nm/>
				<remk/>
			</record>
		</CURLIST>
	</dataSet>
</pr_papmake_8011_l>
*/
%>

<% /* 작성시간 : Thu Jul 21 17:25:16 KST 2016 */ %>