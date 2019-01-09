<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.cost.rec.*
	,	chosun.ciis.mc.cost.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_COST_3021_LDataSet ds = (MC_COST_3021_LDataSet)request.getAttribute("ds");
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
			MC_COST_3021_LCURLISTRecord rec = (MC_COST_3021_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "clas_nm", rec.clas_nm);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_nm", rec.budg_nm);
			rx.add(record, "acct_cd", rec.acct_cd);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "dtls_medi_cd", rec.dtls_medi_cd);
			rx.add(record, "dtls_medi_nm", rec.dtls_medi_nm);
			rx.add(record, "use_dept_cd", rec.use_dept_cd);
			rx.add(record, "use_dept_nm", rec.use_dept_nm);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "qty", rec.qty);
			//rx.add(record, "clas_nm", StringUtil.replaceToXml(rec.clas_nm));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_nm", StringUtil.replaceToXml(rec.budg_nm));
			//rx.add(record, "acct_cd", StringUtil.replaceToXml(rec.acct_cd));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "medi_nm", StringUtil.replaceToXml(rec.medi_nm));
			//rx.add(record, "dtls_medi_cd", StringUtil.replaceToXml(rec.dtls_medi_cd));
			//rx.add(record, "dtls_medi_nm", StringUtil.replaceToXml(rec.dtls_medi_nm));
			//rx.add(record, "use_dept_cd", StringUtil.replaceToXml(rec.use_dept_cd));
			//rx.add(record, "use_dept_nm", StringUtil.replaceToXml(rec.use_dept_nm));
			//rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
			//rx.add(record, "qty", StringUtil.replaceToXml(rec.qty));
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
<mc_cost_3021_l>
	<dataSet>
		<CURLIST>
			<record>
				<clas_nm/>
				<budg_cd/>
				<budg_nm/>
				<acct_cd/>
				<medi_cd/>
				<medi_nm/>
				<dtls_medi_cd/>
				<dtls_medi_nm/>
				<use_dept_cd/>
				<use_dept_nm/>
				<amt/>
				<qty/>
			</record>
		</CURLIST>
	</dataSet>
</mc_cost_3021_l>
*/
%>

<% /* 작성시간 : Tue Aug 04 11:00:38 KST 2009 */ %>