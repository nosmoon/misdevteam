<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pr.prtexec.rec.*
	,	chosun.ciis.pr.prtexec.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PRTEXEC_5013_LDataSet ds = (PR_PRTEXEC_5013_LDataSet)request.getAttribute("ds");
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
			PR_PRTEXEC_5013_LCURLISTRecord rec = (PR_PRTEXEC_5013_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "prt_dt", rec.prt_dt);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "prt_clsf", rec.prt_clsf);
			rx.add(record, "prt_clsf_nm", rec.prt_clsf_nm);
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "pap_std", rec.pap_std);
			rx.add(record, "slip_qty", rec.slip_qty);
			rx.add(record, "base_qty", rec.base_qty);
			rx.add(record, "inc_yn", rec.inc_yn);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "prt_dt", StringUtil.replaceToXml(rec.prt_dt));
			//rx.add(record, "issu_dt", StringUtil.replaceToXml(rec.issu_dt));
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "fac_clsf_nm", StringUtil.replaceToXml(rec.fac_clsf_nm));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "medi_nm", StringUtil.replaceToXml(rec.medi_nm));
			//rx.add(record, "sect_cd", StringUtil.replaceToXml(rec.sect_cd));
			//rx.add(record, "sect_nm", StringUtil.replaceToXml(rec.sect_nm));
			//rx.add(record, "prt_clsf", StringUtil.replaceToXml(rec.prt_clsf));
			//rx.add(record, "prt_clsf_nm", StringUtil.replaceToXml(rec.prt_clsf_nm));
			//rx.add(record, "issu_pcnt", StringUtil.replaceToXml(rec.issu_pcnt));
			//rx.add(record, "pap_std", StringUtil.replaceToXml(rec.pap_std));
			//rx.add(record, "slip_qty", StringUtil.replaceToXml(rec.slip_qty));
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
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
<pr_prtexec_5013_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<prt_dt/>
				<issu_dt/>
				<fac_clsf/>
				<fac_clsf_nm/>
				<medi_cd/>
				<medi_nm/>
				<sect_cd/>
				<sect_nm/>
				<prt_clsf/>
				<prt_clsf_nm/>
				<issu_pcnt/>
				<pap_std/>
				<slip_qty/>
				<matr_cd/>
				<matr_nm/>
			</record>
		</CURLIST>
	</dataSet>
</pr_prtexec_5013_l>
*/
%>

<% /* 작성시간 : Tue Nov 17 17:10:49 KST 2009 */ %>