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
	MC_BUDG_5173_LDataSet ds = (MC_BUDG_5173_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_5173_LCURLISTRecord rec = (MC_BUDG_5173_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.addCData(record, "medi_cdnm", rec.medi_cdnm);
			rx.add(record, "dtls_medi_cd", rec.dtls_medi_cd);
			rx.addCData(record, "dtls_medi_nm", rec.dtls_medi_nm);
			rx.add(record, "curmm_cndt_amt_01", rec.curmm_cndt_amt_01);
			rx.add(record, "curmm_cndt_amt_02", rec.curmm_cndt_amt_02);
			rx.add(record, "curmm_cndt_amt_03", rec.curmm_cndt_amt_03);
			rx.add(record, "curmm_cndt_amt_04", rec.curmm_cndt_amt_04);
			rx.add(record, "curmm_cndt_amt_05", rec.curmm_cndt_amt_05);
			rx.add(record, "curmm_cndt_amt_06", rec.curmm_cndt_amt_06);
			rx.add(record, "curmm_cndt_amt_07", rec.curmm_cndt_amt_07);
			rx.add(record, "curmm_cndt_amt_08", rec.curmm_cndt_amt_08);
			rx.add(record, "curmm_cndt_amt_09", rec.curmm_cndt_amt_09);
			rx.add(record, "curmm_cndt_amt_10", rec.curmm_cndt_amt_10);
			rx.add(record, "curmm_cndt_amt_11", rec.curmm_cndt_amt_11);
			rx.add(record, "curmm_cndt_amt_12", rec.curmm_cndt_amt_12);
			rx.add(record, "curmm_cndt_amt_tot", rec.curmm_cndt_amt_tot);
			
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
<mc_budg_5161_l>
	<dataSet>
		<CURLIST>
			<record>
				<budg_yymm/>
				<dept_cd/>
				<buseonm/>
				<budg_cd/>
				<evnt_nm/>
				<ysnm/>
				<cjysbjamt/>
				<budg_ask_amt/>
				<budg_cndt_amt/>
				<chamt/>
				<evnt_cd/>
				<slip_no/>
				<amt/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_5161_l>
*/
%>

<% /* 작성시간 : Sat Jul 11 13:42:07 KST 2009 */ %>