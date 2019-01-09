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
	MC_COST_3191_LDataSet ds = (MC_COST_3191_LDataSet)request.getAttribute("ds");
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
			MC_COST_3191_LCURLISTRecord rec = (MC_COST_3191_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "use_dept_cd", rec.use_dept_cd);
			rx.add(record, "use_dept_nm", rec.use_dept_nm);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_nm", rec.budg_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "dtls_medi_cd", rec.dtls_medi_cd);
			rx.add(record, "dtls_medi_nm", rec.dtls_medi_nm);
			rx.add(record, "acct_cd", rec.acct_cd);
			rx.add(record, "acct_nm", rec.acct_nm);
			rx.add(record, "dstb_dept_cd1", rec.dstb_dept_cd1);
			rx.add(record, "dstb_dept_nm1", rec.dstb_dept_nm1);
			rx.add(record, "dstb_dept_cd2", rec.dstb_dept_cd2);
			rx.add(record, "dstb_dept_nm2", rec.dstb_dept_nm2);
			rx.add(record, "dstb_medi_cd", rec.dstb_medi_cd);
			rx.add(record, "dstb_medi_cdnm", rec.dstb_medi_cdnm);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "qunt", rec.qunt);
			//rx.add(record, "use_dept_cd", StringUtil.replaceToXml(rec.use_dept_cd));
			//rx.add(record, "use_dept_nm", StringUtil.replaceToXml(rec.use_dept_nm));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_nm", StringUtil.replaceToXml(rec.budg_nm));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "medi_nm", StringUtil.replaceToXml(rec.medi_nm));
			//rx.add(record, "dtls_medi_cd", StringUtil.replaceToXml(rec.dtls_medi_cd));
			//rx.add(record, "dtls_medi_nm", StringUtil.replaceToXml(rec.dtls_medi_nm));
			//rx.add(record, "acct_cd", StringUtil.replaceToXml(rec.acct_cd));
			//rx.add(record, "acct_nm", StringUtil.replaceToXml(rec.acct_nm));
			//rx.add(record, "dstb_dept_cd1", StringUtil.replaceToXml(rec.dstb_dept_cd1));
			//rx.add(record, "dstb_dept_nm1", StringUtil.replaceToXml(rec.dstb_dept_nm1));
			//rx.add(record, "dstb_dept_cd2", StringUtil.replaceToXml(rec.dstb_dept_cd2));
			//rx.add(record, "dstb_dept_nm2", StringUtil.replaceToXml(rec.dstb_dept_nm2));
			//rx.add(record, "dstb_medi_cd", StringUtil.replaceToXml(rec.dstb_medi_cd));
			//rx.add(record, "dstb_medi_cdnm", StringUtil.replaceToXml(rec.dstb_medi_cdnm));
			//rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
			//rx.add(record, "qunt", StringUtil.replaceToXml(rec.qunt));
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
<mc_cost_3191_l>
	<dataSet>
		<CURLIST>
			<record>
				<use_dept_cd/>
				<use_dept_nm/>
				<budg_cd/>
				<budg_nm/>
				<medi_cd/>
				<medi_nm/>
				<dtls_medi_cd/>
				<dtls_medi_nm/>
				<acct_cd/>
				<acct_nm/>
				<dstb_dept_cd1/>
				<dstb_dept_nm1/>
				<dstb_dept_cd2/>
				<dstb_dept_nm2/>
				<dstb_medi_cd/>
				<dstb_medi_cdnm/>
				<amt/>
				<qunt/>
			</record>
		</CURLIST>
	</dataSet>
</mc_cost_3191_l>
*/
%>

<% /* 작성시간 : Tue Aug 04 14:58:12 KST 2009 */ %>