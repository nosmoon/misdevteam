<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_6401_LDataSet ds = (HD_EVLU_6401_LDataSet)request.getAttribute("ds");
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
			HD_EVLU_6401_LCURLISTRecord rec = (HD_EVLU_6401_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "evlu_grp_nm", rec.evlu_grp_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "tgt_evlu_pers_emp_no", rec.tgt_evlu_pers_emp_no);
			rx.add(record, "tgt_evlu_pers_nm_korn", rec.tgt_evlu_pers_nm_korn);
			rx.add(record, "rvis_scor", rec.rvis_scor);
			rx.add(record, "rank", rec.rank);
			rx.add(record, "last_grad", rec.last_grad);
			rx.add(record, "evlu_pers_emp_no_1tms", rec.evlu_pers_emp_no_1tms);
			rx.add(record, "evlu_pers_nm_korn1", rec.evlu_pers_nm_korn1);
			rx.add(record, "evlu_pers_emp_no_2tms", rec.evlu_pers_emp_no_2tms);
			rx.add(record, "evlu_pers_nm_korn2", rec.evlu_pers_nm_korn2);
			rx.add(record, "grad_nm_1tms_10", rec.grad_nm_1tms_10);
			rx.add(record, "grad_nm_1tms_20", rec.grad_nm_1tms_20);
			rx.add(record, "grad_nm_1tms_30", rec.grad_nm_1tms_30);
			rx.add(record, "grad_nm_1tms_40", rec.grad_nm_1tms_40);
			rx.add(record, "grad_nm_1tms_50", rec.grad_nm_1tms_50);
			rx.add(record, "grad_nm_1tms_60", rec.grad_nm_1tms_60);
			rx.add(record, "grad_nm_1tms_70", rec.grad_nm_1tms_70);
			rx.add(record, "grad_nm_2tms_10", rec.grad_nm_2tms_10);
			rx.add(record, "grad_nm_2tms_20", rec.grad_nm_2tms_20);
			rx.add(record, "grad_nm_2tms_30", rec.grad_nm_2tms_30);
			rx.add(record, "grad_nm_2tms_40", rec.grad_nm_2tms_40);
			rx.add(record, "grad_nm_2tms_50", rec.grad_nm_2tms_50);
			rx.add(record, "grad_nm_2tms_60", rec.grad_nm_2tms_60);
			rx.add(record, "grad_nm_2tms_70", rec.grad_nm_2tms_70);
			rx.add(record, "tot_evlu_1tms", rec.tot_evlu_1tms);
			rx.add(record, "tot_evlu_2tms", rec.tot_evlu_2tms);
			//rx.add(record, "evlu_grp_nm", StringUtil.replaceToXml(rec.evlu_grp_nm));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "tgt_evlu_pers_emp_no", StringUtil.replaceToXml(rec.tgt_evlu_pers_emp_no));
			//rx.add(record, "tgt_evlu_pers_nm_korn", StringUtil.replaceToXml(rec.tgt_evlu_pers_nm_korn));
			//rx.add(record, "rvis_scor", StringUtil.replaceToXml(rec.rvis_scor));
			//rx.add(record, "rank", StringUtil.replaceToXml(rec.rank));
			//rx.add(record, "last_grad", StringUtil.replaceToXml(rec.last_grad));
			//rx.add(record, "evlu_pers_emp_no_1tms", StringUtil.replaceToXml(rec.evlu_pers_emp_no_1tms));
			//rx.add(record, "evlu_pers_nm_korn1", StringUtil.replaceToXml(rec.evlu_pers_nm_korn1));
			//rx.add(record, "evlu_pers_emp_no_2tms", StringUtil.replaceToXml(rec.evlu_pers_emp_no_2tms));
			//rx.add(record, "evlu_pers_nm_korn1", StringUtil.replaceToXml(rec.evlu_pers_nm_korn1));
			//rx.add(record, "grad_nm_1tms_10", StringUtil.replaceToXml(rec.grad_nm_1tms_10));
			//rx.add(record, "grad_nm_1tms_20", StringUtil.replaceToXml(rec.grad_nm_1tms_20));
			//rx.add(record, "grad_nm_1tms_30", StringUtil.replaceToXml(rec.grad_nm_1tms_30));
			//rx.add(record, "grad_nm_1tms_40", StringUtil.replaceToXml(rec.grad_nm_1tms_40));
			//rx.add(record, "grad_nm_1tms_50", StringUtil.replaceToXml(rec.grad_nm_1tms_50));
			//rx.add(record, "grad_nm_1tms_60", StringUtil.replaceToXml(rec.grad_nm_1tms_60));
			//rx.add(record, "grad_nm_1tms_70", StringUtil.replaceToXml(rec.grad_nm_1tms_70));
			//rx.add(record, "grad_nm_2tms_10", StringUtil.replaceToXml(rec.grad_nm_2tms_10));
			//rx.add(record, "grad_nm_2tms_20", StringUtil.replaceToXml(rec.grad_nm_2tms_20));
			//rx.add(record, "grad_nm_2tms_30", StringUtil.replaceToXml(rec.grad_nm_2tms_30));
			//rx.add(record, "grad_nm_2tms_40", StringUtil.replaceToXml(rec.grad_nm_2tms_40));
			//rx.add(record, "grad_nm_2tms_50", StringUtil.replaceToXml(rec.grad_nm_2tms_50));
			//rx.add(record, "grad_nm_2tms_60", StringUtil.replaceToXml(rec.grad_nm_2tms_60));
			//rx.add(record, "grad_nm_2tms_70", StringUtil.replaceToXml(rec.grad_nm_2tms_70));
			//rx.add(record, "tot_evlu_1tms", StringUtil.replaceToXml(rec.tot_evlu_1tms));
			//rx.add(record, "tot_evlu_2tms", StringUtil.replaceToXml(rec.tot_evlu_2tms));
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
<hd_evlu_6401_l>
	<dataSet>
		<CURLIST>
			<record>
				<evlu_grp_nm/>
				<dept_nm/>
				<tgt_evlu_pers_emp_no/>
				<tgt_evlu_pers_nm_korn/>
				<rvis_scor/>
				<rank/>
				<last_grad/>
				<evlu_pers_emp_no_1tms/>
				<evlu_pers_nm_korn1/>
				<evlu_pers_emp_no_2tms/>
				<evlu_pers_nm_korn1/>
				<grad_nm_1tms_10/>
				<grad_nm_1tms_20/>
				<grad_nm_1tms_30/>
				<grad_nm_1tms_40/>
				<grad_nm_1tms_50/>
				<grad_nm_1tms_60/>
				<grad_nm_1tms_70/>
				<grad_nm_2tms_10/>
				<grad_nm_2tms_20/>
				<grad_nm_2tms_30/>
				<grad_nm_2tms_40/>
				<grad_nm_2tms_50/>
				<grad_nm_2tms_60/>
				<grad_nm_2tms_70/>
				<tot_evlu_1tms/>
				<tot_evlu_2tms/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_6401_l>
*/
%>

<% /* 작성시간 : Wed Oct 14 15:51:41 KST 2015 */ %>