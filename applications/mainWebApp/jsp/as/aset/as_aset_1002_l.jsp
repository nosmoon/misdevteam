<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.as.aset.rec.*
	,	chosun.ciis.as.aset.ds.*;
	"
%> 

<%
	RwXml rx = new RwXml();
	AS_ASET_1002_LDataSet ds = (AS_ASET_1002_LDataSet)request.getAttribute("ds");
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
			AS_ASET_1002_LCURLISTRecord rec = (AS_ASET_1002_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "aset_no", rec.aset_no);
			rx.addCData(record, "aset_nm", rec.aset_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "acqr_dt", rec.acqr_dt);
			rx.add(record, "orgin_acqr_amt", rec.orgin_acqr_amt);
			rx.add(record, "sale_dt", rec.sale_dt);
			rx.add(record, "sale_amt", rec.sale_amt);
			rx.add(record, "svc_yys_cnt", rec.svc_yys_cnt);
			rx.add(record, "buy_clsf_nm", rec.buy_clsf_nm);
			rx.add(record, "aset_qunt_cnt", rec.aset_qunt_cnt);
			rx.addCData(record, "aset_usag", rec.aset_usag);
			rx.addCData(record, "aset_size", rec.aset_size);
			rx.addCData(record, "aset_loca", rec.aset_loca);
			rx.add(record, "incmg_pers_nm", rec.incmg_pers_nm);
			rx.add(record, "incmg_dt", rec.incmg_dt);
			rx.add(record, "bund_cd", rec.bund_cd);
			rx.addCData(record, "bund_nm", rec.bund_nm);
			rx.addCData(record, "insr_type", rec.insr_type);
			rx.addCData(record, "make_no", rec.make_no);
			rx.addCData(record, "make_cmpy", rec.make_cmpy);
			rx.addCData(record, "remk", rec.remk);
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
			<aset_no/>
			<aset_nm/>
			<dept_nm/>
			<acqr_dt/>
			<orgin_acqr_amt/>
			<sale_dt/>
			<sale_amt/>
			<svc_yys_cnt/>
			<buy_clsf_nm/>
			<aset_qunt_cnt/>
			<aset_usag/>
			<aset_size/>
			<aset_loca/>
			<incmg_pers_nm/>
			<incmg_dt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 05 16:58:27 KST 2009 */ %>