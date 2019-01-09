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
	MC_BUDG_2291_LDataSet ds = (MC_BUDG_2291_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_2291_LCURLISTRecord rec = (MC_BUDG_2291_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "buseonm", rec.buseonm);
			rx.add(record, "buseocd", rec.buseocd);
			rx.add(record, "hsanm", rec.hsanm);
			rx.add(record, "hsacd", rec.hsacd);
			rx.add(record, "brnm", rec.brnm);
			rx.add(record, "brcd", rec.brcd);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "yscdnm", rec.yscdnm);
			rx.add(record, "budg_yymm", rec.budg_yymm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "maenm", rec.maenm);
			rx.add(record, "dtls_medi_cd", rec.dtls_medi_cd);
			rx.add(record, "dtls_medi_nm", rec.dtls_medi_nm);
			rx.add(record, "use_dept_cd", rec.use_dept_cd);
			rx.add(record, "bscdnm", rec.use_dept_cd+" "+rec.bscdnm);
			rx.add(record, "req_amt_sum", rec.req_amt_sum);
			rx.add(record, "fix_asin_amt_sum", rec.fix_asin_amt_sum);
			rx.add(record, "fix_asin_qunt", rec.fix_asin_qunt);
			rx.add(record, "fix_asin_uprc", rec.fix_asin_uprc);
			rx.add(record, "fix_asin_amt", rec.fix_asin_amt);
			rx.add(record, "budg_cndt_amt", rec.budg_cndt_amt);
			rx.add(record, "fix_cndt_amt", rec.fix_cndt_amt);
			rx.addCData(record, "rmks", rec.rmks);
			rx.add(record, "seq", rec.seq);
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
<mc_budg_2281_l>
	<dataSet>
		<CURLIST>
			<record>
				<evnt_cd/>
				<evnt_nm/>
				<budg_cd/>
				<budg_nm/>
				<reg_no/>
				<medi_cd/>
				<medi_nm/>
				<use_dept_nm/>
				<budg_yymm/>
				<req_qunt/>
				<req_uprc/>
				<req_amt/>
				<rmks/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_2281_l>
*/
%>

<% /* 작성시간 : Tue May 12 13:06:19 KST 2009 */ %>