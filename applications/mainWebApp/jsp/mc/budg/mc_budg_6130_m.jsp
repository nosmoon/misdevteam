<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.budg.rec.*
	,	chosun.ciis.mc.budg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_BUDG_6130_MDataSet ds = (MC_BUDG_6130_MDataSet)request.getAttribute("ds");
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
			MC_BUDG_6130_MCURLISTRecord rec = (MC_BUDG_6130_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "tms", rec.tms);
			rx.add(record, "rslt_aply_prd_bgn", rec.rslt_aply_prd_bgn);
			rx.add(record, "rslt_aply_prd_end", rec.rslt_aply_prd_end);
			rx.add(record, "expt_aply_prd_bgn", rec.expt_aply_prd_bgn);
			rx.add(record, "expt_aply_prd_end", rec.expt_aply_prd_end);
			//rx.add(record, "tms", StringUtil.replaceToXml(rec.tms));
			//rx.add(record, "rslt_aply_prd_bgn", StringUtil.replaceToXml(rec.rslt_aply_prd_bgn));
			//rx.add(record, "rslt_aply_prd_end", StringUtil.replaceToXml(rec.rslt_aply_prd_end));
			//rx.add(record, "expt_aply_prd_bgn", StringUtil.replaceToXml(rec.expt_aply_prd_bgn));
			//rx.add(record, "expt_aply_prd_end", StringUtil.replaceToXml(rec.expt_aply_prd_end));
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
<mc_budg_6130_m>
	<dataSet>
		<CURLIST>
			<record>
				<tms/>
				<rslt_aply_prd_bgn/>
				<rslt_aply_prd_end/>
				<expt_aply_prd_bgn/>
				<expt_aply_prd_end/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_6130_m>
*/
%>

<% /* 작성시간 : Fri Aug 14 11:45:32 KST 2009 */ %>