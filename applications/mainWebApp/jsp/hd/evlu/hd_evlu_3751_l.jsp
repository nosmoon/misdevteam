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
	HD_EVLU_3751_LDataSet ds = (HD_EVLU_3751_LDataSet)request.getAttribute("ds");
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
			HD_EVLU_3751_LCURLISTRecord rec = (HD_EVLU_3751_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "evlu_clsf", rec.evlu_clsf);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.addCData(record, "evlu_pers_deci_grad_2tms", rec.evlu_pers_deci_grad_2tms);
			rx.add(record, "asst_nm_korn", rec.asst_nm_korn);
			rx.addCData(record, "evlu_opn", rec.evlu_opn);
			rx.add(record, "tms1_nm_korn", rec.tms1_nm_korn);
			rx.addCData(record, "evlu_cmpt_opn_1tms", rec.evlu_cmpt_opn_1tms);
			rx.addCData(record, "evlu_pers_meda_opn_1tms", rec.evlu_pers_meda_opn_1tms);
			rx.add(record, "tms2_nm_korn", rec.tms2_nm_korn);
			rx.addCData(record, "evlu_pers_meda_opn_2tms", rec.evlu_pers_meda_opn_2tms);
			//rx.add(record, "evlu_clsf", StringUtil.replaceToXml(rec.evlu_clsf));
			//rx.add(record, "evlu_pers_deci_grad_2tms", StringUtil.replaceToXml(rec.evlu_pers_deci_grad_2tms));
			//rx.add(record, "asst_nm_korn", StringUtil.replaceToXml(rec.asst_nm_korn));
			//rx.add(record, "evlu_opn", StringUtil.replaceToXml(rec.evlu_opn));
			//rx.add(record, "tms1_nm_korn", StringUtil.replaceToXml(rec.tms1_nm_korn));
			//rx.add(record, "evlu_cmpt_opn_1tms", StringUtil.replaceToXml(rec.evlu_cmpt_opn_1tms));
			//rx.add(record, "evlu_pers_meda_opn_1tms", StringUtil.replaceToXml(rec.evlu_pers_meda_opn_1tms));
			//rx.add(record, "tms2_nm_korn", StringUtil.replaceToXml(rec.tms2_nm_korn));
			//rx.add(record, "evlu_pers_meda_opn_2tms", StringUtil.replaceToXml(rec.evlu_pers_meda_opn_2tms));
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
<hd_evlu_3751_l>
	<dataSet>
		<CURLIST>
			<record>
				<evlu_clsf/>
				<evlu_pers_deci_grad_2tms/>
				<asst_nm_korn/>
				<evlu_opn/>
				<tms1_nm_korn/>
				<evlu_cmpt_opn_1tms/>
				<evlu_pers_meda_opn_1tms/>
				<tms2_nm_korn/>
				<evlu_pers_meda_opn_2tms/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_3751_l>
*/
%>

<% /* 작성시간 : Thu Apr 23 16:13:47 KST 2015 */ %>