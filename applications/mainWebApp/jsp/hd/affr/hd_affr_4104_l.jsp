<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_4104_LDataSet ds = (HD_AFFR_4104_LDataSet)request.getAttribute("ds");
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
			HD_AFFR_4104_LCURLISTRecord rec = (HD_AFFR_4104_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "aply_yy", rec.aply_yy);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
			rx.add(record, "frdt", rec.frdt);
			rx.add(record, "stop_dt", rec.stop_dt);
			rx.add(record, "cont_svc_yys", rec.cont_svc_yys);
			rx.add(record, "rest_vaca_yys_clsf", rec.rest_vaca_yys_clsf);
			rx.add(record, "base_pont", rec.base_pont);
			rx.add(record, "faml_pont", rec.faml_pont);
			rx.add(record, "cont_svc_pont", rec.cont_svc_pont);
			rx.add(record, "rest_pont", rec.rest_pont);
			rx.add(record, "dty_taem_chf_un_norm", rec.dty_taem_chf_un_norm);
			rx.add(record, "dty_comite_memb", rec.dty_comite_memb);
			rx.add(record, "pont_tot", rec.pont_tot);
			rx.add(record, "use_pont", rec.use_pont);
			rx.add(record, "rsrt_amt", rec.rsrt_amt);
			rx.add(record, "stat", "lvcmpy");

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
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<dept_cd/>
			<dept_nm/>
			<emp_no/>
			<nm_korn/>
			<dty_cd/>
			<dty_nm/>
			<posi_cd/>
			<posi_nm/>
			<emp_clsf/>
			<emp_clsf_nm/>
			<in_cmpy_dt/>
			<lvcmpy_dt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Mon May 25 20:15:01 KST 2009 */ %>