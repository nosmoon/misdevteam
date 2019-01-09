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
	HD_SALY_3000_LDataSet ds = (HD_SALY_3000_LDataSet)request.getAttribute("ds");
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
			HD_SALY_3000_LCURLISTRecord rec = (HD_SALY_3000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "saly_yy", rec.saly_yy);
			rx.add(record, "saly_no", rec.saly_no);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "etc_dduc_nm_1", rec.etc_dduc_nm_1);
			rx.add(record, "etc_dduc_1", rec.etc_dduc_1);
			rx.add(record, "etc_dduc_nm_2", rec.etc_dduc_nm_2);
			rx.add(record, "etc_dduc_2", rec.etc_dduc_2);
			rx.add(record, "etc_dduc_nm_3", rec.etc_dduc_nm_3);
			rx.add(record, "etc_dduc_3", rec.etc_dduc_3);
			rx.add(record, "etc_dduc_nm_4", rec.etc_dduc_nm_4);
			rx.add(record, "etc_dduc_4", rec.etc_dduc_4);
			rx.add(record, "etc_dduc_nm_5", rec.etc_dduc_nm_5);
			rx.add(record, "etc_dduc_5", rec.etc_dduc_5);
			rx.add(record, "prvmm_mstk_dduc", rec.prvmm_mstk_dduc);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.addCData(record, "etc_dduc_remk", rec.etc_dduc_remk);
			//rx.add(record, "saly_yy", StringUtil.replaceToXml(rec.saly_yy));
			//rx.add(record, "saly_no", StringUtil.replaceToXml(rec.saly_no));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "etc_dduc_nm_1", StringUtil.replaceToXml(rec.etc_dduc_nm_1));
			//rx.add(record, "etc_dduc_1", StringUtil.replaceToXml(rec.etc_dduc_1));
			//rx.add(record, "etc_dduc_nm_2", StringUtil.replaceToXml(rec.etc_dduc_nm_2));
			//rx.add(record, "etc_dduc_2", StringUtil.replaceToXml(rec.etc_dduc_2));
			//rx.add(record, "etc_dduc_nm_3", StringUtil.replaceToXml(rec.etc_dduc_nm_3));
			//rx.add(record, "etc_dduc_3", StringUtil.replaceToXml(rec.etc_dduc_3));
			//rx.add(record, "etc_dduc_nm_4", StringUtil.replaceToXml(rec.etc_dduc_nm_4));
			//rx.add(record, "etc_dduc_4", StringUtil.replaceToXml(rec.etc_dduc_4));
			//rx.add(record, "prvmm_mstk_dduc", StringUtil.replaceToXml(rec.prvmm_mstk_dduc));
			//rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
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
<hd_saly_3000_l>
	<dataSet>
		<CURLIST>
			<record>
				<saly_yy/>
				<saly_no/>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<flnm/>
				<dty_cd/>
				<dty_nm/>
				<posi_cd/>
				<posi_nm/>
				<etc_dduc_nm_1/>
				<etc_dduc_1/>
				<etc_dduc_nm_2/>
				<etc_dduc_2/>
				<etc_dduc_nm_3/>
				<etc_dduc_3/>
				<etc_dduc_nm_4/>
				<etc_dduc_4/>
				<prvmm_mstk_dduc/>
				<proc_stat/>
				<proc_stat_nm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_3000_l>
*/
%>

<% /* 작성시간 : Thu Apr 30 10:33:28 KST 2009 */ %>