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
	MC_BUDG_6132_LDataSet ds = (MC_BUDG_6132_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_6132_LCURLISTRecord rec = (MC_BUDG_6132_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_clas_cd", rec.budg_clas_cd);
			rx.add(record, "budg_clas_cdnm", rec.budg_clas_cdnm);
			rx.add(record, "bf_sumamt", rec.bf_sumamt);
			rx.add(record, "af_sumamt", rec.af_sumamt);
			rx.add(record, "diff_amt", rec.diff_amt);
			rx.add(record, "bf_amt1", rec.bf_amt1);
			rx.add(record, "af_amt1", rec.af_amt1);
			rx.add(record, "bf_amt2", rec.bf_amt2);
			rx.add(record, "af_amt2", rec.af_amt2);
			rx.add(record, "bf_amt3", rec.bf_amt3);
			rx.add(record, "af_amt3", rec.af_amt3);
			rx.add(record, "bf_amt4", rec.bf_amt4);
			rx.add(record, "af_amt4", rec.af_amt4);
			rx.add(record, "bf_amt5", rec.bf_amt5);
			rx.add(record, "af_amt5", rec.af_amt5);
			rx.add(record, "bf_amt6", rec.bf_amt6);
			rx.add(record, "af_amt6", rec.af_amt6);
			rx.add(record, "bf_amt7", rec.bf_amt7);
			rx.add(record, "af_amt7", rec.af_amt7);
			rx.add(record, "bf_amt8", rec.bf_amt8);
			rx.add(record, "af_amt8", rec.af_amt8);
			rx.add(record, "bf_amt9", rec.bf_amt9);
			rx.add(record, "af_amt9", rec.af_amt9);
			rx.add(record, "bf_amt10", rec.bf_amt10);
			rx.add(record, "af_amt10", rec.af_amt10);
			rx.add(record, "bf_amt11", rec.bf_amt11);
			rx.add(record, "af_amt11", rec.af_amt11);
			rx.add(record, "bf_amt12", rec.bf_amt12);
			rx.add(record, "af_amt12", rec.af_amt12);
			//rx.add(record, "budg_clas_cd", StringUtil.replaceToXml(rec.budg_clas_cd));
			//rx.add(record, "budg_clas_cdnm", StringUtil.replaceToXml(rec.budg_clas_cdnm));
			//rx.add(record, "bf_sumamt", StringUtil.replaceToXml(rec.bf_sumamt));
			//rx.add(record, "af_sumamt", StringUtil.replaceToXml(rec.af_sumamt));
			//rx.add(record, "diff_amt", StringUtil.replaceToXml(rec.diff_amt));
			//rx.add(record, "bf_amt1", StringUtil.replaceToXml(rec.bf_amt1));
			//rx.add(record, "af_amt1", StringUtil.replaceToXml(rec.af_amt1));
			//rx.add(record, "bf_amt2", StringUtil.replaceToXml(rec.bf_amt2));
			//rx.add(record, "af_amt2", StringUtil.replaceToXml(rec.af_amt2));
			//rx.add(record, "bf_amt3", StringUtil.replaceToXml(rec.bf_amt3));
			//rx.add(record, "af_amt3", StringUtil.replaceToXml(rec.af_amt3));
			//rx.add(record, "bf_amt4", StringUtil.replaceToXml(rec.bf_amt4));
			//rx.add(record, "af_amt4", StringUtil.replaceToXml(rec.af_amt4));
			//rx.add(record, "bf_amt5", StringUtil.replaceToXml(rec.bf_amt5));
			//rx.add(record, "af_amt5", StringUtil.replaceToXml(rec.af_amt5));
			//rx.add(record, "bf_amt6", StringUtil.replaceToXml(rec.bf_amt6));
			//rx.add(record, "af_amt6", StringUtil.replaceToXml(rec.af_amt6));
			//rx.add(record, "bf_amt7", StringUtil.replaceToXml(rec.bf_amt7));
			//rx.add(record, "af_amt7", StringUtil.replaceToXml(rec.af_amt7));
			//rx.add(record, "bf_amt8", StringUtil.replaceToXml(rec.bf_amt8));
			//rx.add(record, "af_amt8", StringUtil.replaceToXml(rec.af_amt8));
			//rx.add(record, "bf_amt9", StringUtil.replaceToXml(rec.bf_amt9));
			//rx.add(record, "af_amt9", StringUtil.replaceToXml(rec.af_amt9));
			//rx.add(record, "bf_amt10", StringUtil.replaceToXml(rec.bf_amt10));
			//rx.add(record, "af_amt10", StringUtil.replaceToXml(rec.af_amt10));
			//rx.add(record, "bf_amt11", StringUtil.replaceToXml(rec.bf_amt11));
			//rx.add(record, "af_amt11", StringUtil.replaceToXml(rec.af_amt11));
			//rx.add(record, "bf_amt12", StringUtil.replaceToXml(rec.bf_amt12));
			//rx.add(record, "af_amt12", StringUtil.replaceToXml(rec.af_amt12));
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
<mc_budg_6132_l>
	<dataSet>
		<CURLIST>
			<record>
				<budg_clas_cd/>
				<budg_clas_cdnm/>
				<bf_sumamt/>
				<af_sumamt/>
				<diff_amt/>
				<bf_amt1/>
				<af_amt1/>
				<bf_amt2/>
				<af_amt2/>
				<bf_amt3/>
				<af_amt3/>
				<bf_amt4/>
				<af_amt4/>
				<bf_amt5/>
				<af_amt5/>
				<bf_amt6/>
				<af_amt6/>
				<bf_amt7/>
				<af_amt7/>
				<bf_amt8/>
				<af_amt8/>
				<bf_amt9/>
				<af_amt9/>
				<bf_amt10/>
				<af_amt10/>
				<bf_amt11/>
				<af_amt11/>
				<bf_amt12/>
				<af_amt12/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_6132_l>
*/
%>

<% /* 작성시간 : Fri Aug 14 11:45:32 KST 2009 */ %>