<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_8201_LDataSet ds = (HD_SALY_8201_LDataSet)request.getAttribute("ds");
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
			HD_SALY_8201_LCURLIST2Record rec = (HD_SALY_8201_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sum_welf_pens_amt", rec.sum_welf_pens_amt);
			rx.add(record, "sum_prsn_pens_amt", rec.sum_prsn_pens_amt);
			rx.add(record, "subtotal_amt", rec.subtotal_amt);
			rx.add(record, "sum_prsn_sppt_amt", rec.sum_prsn_sppt_amt);
			rx.add(record, "sum_sepr_pens_amt", rec.sum_sepr_pens_amt);
			//rx.add(record, "sum_welf_pens_amt", StringUtil.replaceToXml(rec.sum_welf_pens_amt));
			//rx.add(record, "sum_prsn_pens_amt", StringUtil.replaceToXml(rec.sum_prsn_pens_amt));
			//rx.add(record, "sum_prsn_sppt_amt", StringUtil.replaceToXml(rec.sum_prsn_sppt_amt));
			//rx.add(record, "sum_sepr_pens_amt", StringUtil.replaceToXml(rec.sum_sepr_pens_amt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_SALY_8201_LCURLISTRecord rec = (HD_SALY_8201_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "pymt_yy", rec.pymt_yy);
			rx.add(record, "pymt_no", rec.pymt_no);
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "welf_pens_amt", rec.welf_pens_amt);
			rx.add(record, "prsn_pens_amt", rec.prsn_pens_amt);
			rx.add(record, "prsn_sppt_amt", rec.prsn_sppt_amt);
			rx.add(record, "sepr_pens_amt", rec.sepr_pens_amt);
			rx.add(record, "pymt_gubun", rec.pymt_gubun);
			rx.add(record, "pymt_gubun_nm", rec.pymt_gubun_nm);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "pymt_yy", StringUtil.replaceToXml(rec.pymt_yy));
			//rx.add(record, "pymt_no", StringUtil.replaceToXml(rec.pymt_no));
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "welf_pens_amt", StringUtil.replaceToXml(rec.welf_pens_amt));
			//rx.add(record, "prsn_pens_amt", StringUtil.replaceToXml(rec.prsn_pens_amt));
			//rx.add(record, "prsn_sppt_amt", StringUtil.replaceToXml(rec.prsn_sppt_amt));
			//rx.add(record, "sepr_pens_amt", StringUtil.replaceToXml(rec.sepr_pens_amt));
			//rx.add(record, "pymt_gubun", StringUtil.replaceToXml(rec.pymt_gubun));
			//rx.add(record, "pymt_gubun_nm", StringUtil.replaceToXml(rec.pymt_gubun_nm));
			//rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
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
<hd_saly_8201_l>
	<dataSet>
		<CURLIST2>
			<record>
				<sum_welf_pens_amt/>
				<sum_prsn_pens_amt/>
				<sum_prsn_sppt_amt/>
				<sum_sepr_pens_amt/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_saly_8201_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_saly_8201_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<pymt_yy/>
				<pymt_no/>
				<cd_nm/>
				<dept_nm/>
				<dept_cd/>
				<flnm/>
				<welf_pens_amt/>
				<prsn_pens_amt/>
				<prsn_sppt_amt/>
				<sepr_pens_amt/>
				<pymt_gubun/>
				<pymt_gubun_nm/>
				<proc_stat_nm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_8201_l>
*/
%>

<% /* 작성시간 : Fri Apr 15 14:53:05 KST 2016 */ %>