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
	HD_INSR_1400_LDataSet ds = (HD_INSR_1400_LDataSet)request.getAttribute("ds");
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
			HD_INSR_1400_LCURLISTRecord rec = (HD_INSR_1400_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rnum", rec.rnum);
			rx.add(record, "hlth_entr_no", rec.hlth_entr_no);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "burd_cnt", rec.burd_cnt);
			rx.add(record, "med_cnt", rec.med_cnt);
			rx.add(record, "sum_insr_care", rec.sum_insr_care);
			rx.add(record, "sum_insr_fee", rec.sum_insr_fee);
			rx.add(record, "sum_care_insr_fee", rec.sum_care_insr_fee);
			rx.add(record, "impt_stot", rec.impt_stot);
			rx.add(record, "bet", rec.bet);
			//rx.add(record, "rnum", StringUtil.replaceToXml(rec.rnum));
			//rx.add(record, "hlth_entr_no", StringUtil.replaceToXml(rec.hlth_entr_no));
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "prn", StringUtil.replaceToXml(rec.prn));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "burd_cnt", StringUtil.replaceToXml(rec.burd_cnt));
			//rx.add(record, "med_cnt", StringUtil.replaceToXml(rec.med_cnt));
			//rx.add(record, "sum_insr_care", StringUtil.replaceToXml(rec.sum_insr_care));
			//rx.add(record, "sum_insr_fee", StringUtil.replaceToXml(rec.sum_insr_fee));
			//rx.add(record, "sum_care_insr_fee", StringUtil.replaceToXml(rec.sum_care_insr_fee));
			//rx.add(record, "impt_stot", StringUtil.replaceToXml(rec.impt_stot));
			//rx.add(record, "bet", StringUtil.replaceToXml(rec.bet));
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
<hd_insr_1400_l>
	<dataSet>
		<CURLIST>
			<record>
				<rnum/>
				<hlth_entr_no/>
				<cmpy_cd/>
				<emp_no/>
				<nm_korn/>
				<prn/>
				<in_cmpy_dt/>
				<burd_cnt/>
				<med_cnt/>
				<sum_insr_care/>
				<sum_insr_fee/>
				<sum_care_insr_fee/>
				<impt_stot/>
				<bet/>
			</record>
		</CURLIST>
	</dataSet>
</hd_insr_1400_l>
*/
%>

<% /* 작성시간 : Mon May 18 10:08:12 KST 2009 */ %>