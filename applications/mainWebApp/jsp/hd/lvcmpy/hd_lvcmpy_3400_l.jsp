<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.lvcmpy.rec.*
	,	chosun.ciis.hd.lvcmpy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_LVCMPY_3400_LDataSet ds = (HD_LVCMPY_3400_LDataSet)request.getAttribute("ds");
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
			HD_LVCMPY_3400_LCURLISTRecord rec = (HD_LVCMPY_3400_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "cont_svc_yys", rec.cont_svc_yys);
			rx.add(record, "grad_advn_yys", rec.grad_advn_yys);
			rx.add(record, "saly_3month_stot", rec.saly_3month_stot);
			rx.add(record, "alon_amt", rec.alon_amt);
			rx.add(record, "bns", rec.bns);
			rx.add(record, "yymm_alon", rec.yymm_alon);
			rx.add(record, "etc_saly", rec.etc_saly);
			rx.add(record, "mm_avg_saly", rec.mm_avg_saly);
			rx.add(record, "lvcmpy_saly_estm_amt", rec.lvcmpy_saly_estm_amt);
			rx.add(record, "dty_acty_fee", rec.dty_acty_fee);
			
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "cont_svc_yys", StringUtil.replaceToXml(rec.cont_svc_yys));
			//rx.add(record, "grad_advn_yys", StringUtil.replaceToXml(rec.grad_advn_yys));
			//rx.add(record, "saly_3month_stot", StringUtil.replaceToXml(rec.saly_3month_stot));
			//rx.add(record, "alon_amt", StringUtil.replaceToXml(rec.alon_amt));
			//rx.add(record, "bns", StringUtil.replaceToXml(rec.bns));
			//rx.add(record, "yymm_alon", StringUtil.replaceToXml(rec.yymm_alon));
			//rx.add(record, "etc_saly", StringUtil.replaceToXml(rec.etc_saly));
			//rx.add(record, "mm_avg_saly", StringUtil.replaceToXml(rec.mm_avg_saly));
			//rx.add(record, "lvcmpy_saly_estm_amt", StringUtil.replaceToXml(rec.lvcmpy_saly_estm_amt));
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
<hd_lvcmpy_3400_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<flnm/>
				<dty_nm/>
				<posi_nm/>
				<in_cmpy_dt/>
				<cont_svc_yys/>
				<grad_advn_yys/>
				<saly_3month_stot/>
				<alon_amt/>
				<bns/>
				<yymm_alon/>
				<etc_saly/>
				<mm_avg_saly/>
				<lvcmpy_saly_estm_amt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_lvcmpy_3400_l>
*/
%>

<% /* 작성시간 : Tue Jul 12 10:39:12 KST 2011 */ %>