<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@ page import = "java.io.*,
                   java.sql.*,
                   java.util.*,
                   kr.co.comsquare.rwXmlLib.*,
                   kr.co.comsquare.db.*,
                   kr.co.comsquare.util.Tokenizer,
                   chosun.ciis.en.evnt.ds.*,
                   chosun.ciis.en.evnt.rec.*,
                   chosun.ciis.co.base.util.StringUtil;"
%>

<%
	RwXml rx = new RwXml();
	EN_EVNT_1201_LDataSet ds = (EN_EVNT_1201_LDataSet)request.getAttribute("ds");
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
			EN_EVNT_1201_LCURLISTRecord rec = (EN_EVNT_1201_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "tmp_evnt_cd", rec.evnt_yy + "-" + rec.evnt_cd + "-" + rec.evnt_seq);
      rx.add(record, "evnt_nm", StringUtil.replaceToXml(rec.evnt_nm));
			rx.add(record, "evnt_rcpm_unit_nm", StringUtil.replaceToXml(rec.evnt_rcpm_unit_nm));
			rx.add(record, "vitl_acct_no_bgn", rec.vitl_acct_no_bgn);
			rx.add(record, "vitl_acct_no_end", rec.vitl_acct_no_end);
			rx.add(record, "use_end_yn", rec.use_end_yn);
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_pers_emp_nm", StringUtil.replaceToXml(rec.incmg_pers_emp_nm));
			rx.add(record, "incmg_dt", rec.incmg_dt);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_pers_emp_nm", StringUtil.replaceToXml(rec.chg_pers_emp_nm));
			rx.add(record, "chg_dt", rec.chg_dt);
      rx.add(record, "evnt_rcpm_unit_clsf", rec.evnt_rcpm_unit_clsf);
      rx.add(record, "cmpy_cd", rec.cmpy_cd);
      rx.add(record, "evnt_yy", rec.evnt_yy);
      rx.add(record, "evnt_cd", rec.evnt_cd);
      rx.add(record, "evnt_seq", rec.evnt_seq);
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
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<evnt_yy/>
			<evnt_cd/>
			<evnt_seq/>
			<evnt_rcpm_unit_clsf/>
			<evnt_rcpm_unit_nm/>
			<vitl_acct_no_bgn/>
			<vitl_acct_no_end/>
			<use_end_yn/>
			<remk/>
			<incmg_pers/>
			<incmg_pers_emp_nm/>
			<incmg_dt/>
			<chg_pers/>
			<chg_pers_emp_nm/>
			<chg_dt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Feb 09 10:38:24 KST 2009 */ %>