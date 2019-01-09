<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.insr.rec.*
	,	chosun.ciis.hd.insr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INSR_1300_LDataSet ds = (HD_INSR_1300_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INSR_1300_LCURLISTRecord rec = (HD_INSR_1300_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_cd_nm", rec.dty_cd_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_cd_nm", rec.posi_cd_nm);
			rx.add(record, "lst_slf_burd_insr_fee", rec.lst_slf_burd_insr_fee);
			rx.add(record, "lst_slf_burd_med_care_insr_fee", rec.lst_slf_burd_med_care_insr_fee);
			rx.add(record, "slf_burd_insr_fee", rec.slf_burd_insr_fee);
			rx.add(record, "slf_burd_med_care_insr_fee", rec.slf_burd_med_care_insr_fee);
			rx.add(record, "hlth_insr_fee", rec.hlth_insr_fee);
			rx.add(record, "hlth_insr_med_care_insr_fee", rec.hlth_insr_med_care_insr_fee);
			rx.add(record, "slf_minus_insr", rec.slf_minus_insr);
			rx.add(record, "slf_minus_care", rec.slf_minus_care);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_cd_nm", StringUtil.replaceToXml(rec.dept_cd_nm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_cd_nm", StringUtil.replaceToXml(rec.dty_cd_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_cd_nm", StringUtil.replaceToXml(rec.posi_cd_nm));
			//rx.add(record, "lst_slf_burd_insr_fee", StringUtil.replaceToXml(rec.lst_slf_burd_insr_fee));
			//rx.add(record, "lst_slf_burd_med_care_insr_fee", StringUtil.replaceToXml(rec.lst_slf_burd_med_care_insr_fee));
			//rx.add(record, "slf_burd_insr_fee", StringUtil.replaceToXml(rec.slf_burd_insr_fee));
			//rx.add(record, "slf_burd_med_care_insr_fee", StringUtil.replaceToXml(rec.slf_burd_med_care_insr_fee));
			//rx.add(record, "hlth_insr_fee", StringUtil.replaceToXml(rec.hlth_insr_fee));
			//rx.add(record, "hlth_insr_med_care_insr_fee", StringUtil.replaceToXml(rec.hlth_insr_med_care_insr_fee));
			//rx.add(record, "slf_minus_insr", StringUtil.replaceToXml(rec.slf_minus_insr));
			//rx.add(record, "slf_minus_care", StringUtil.replaceToXml(rec.slf_minus_care));
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
<hd_insr_1300_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<nm_korn/>
				<dept_cd/>
				<dept_cd_nm/>
				<dty_cd/>
				<dty_cd_nm/>
				<posi_cd/>
				<posi_cd_nm/>
				<lst_slf_burd_insr_fee/>
				<lst_slf_burd_med_care_insr_fee/>
				<slf_burd_insr_fee/>
				<slf_burd_med_care_insr_fee/>
				<hlth_insr_fee/>
				<hlth_insr_med_care_insr_fee/>
				<slf_minus_insr/>
				<slf_minus_care/>
			</record>
		</CURLIST>
	</dataSet>
</hd_insr_1300_l>
*/
%>

<% /* 작성시간 : Fri May 15 14:39:28 KST 2009 */ %>