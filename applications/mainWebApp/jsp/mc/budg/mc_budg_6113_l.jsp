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
	MC_BUDG_6113_LDataSet ds = (MC_BUDG_6113_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_6113_LCURLISTRecord rec = (MC_BUDG_6113_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "kind", rec.kind);
			rx.add(record, "clas_cd", rec.clas_cd);
			rx.add(record, "clas_cd_code", rec.clas_cd_code);
			rx.add(record, "budg_clas_cd_nm", rec.budg_clas_cd_nm);
			rx.add(record, "amt_01", rec.amt_01);
			rx.add(record, "amt_02", rec.amt_02);
			rx.add(record, "amt_03", rec.amt_03);
			rx.add(record, "amt_04", rec.amt_04);
			rx.add(record, "amt_05", rec.amt_05);
			rx.add(record, "amt_06", rec.amt_06);
			rx.add(record, "amt_07", rec.amt_07);
			rx.add(record, "amt_08", rec.amt_08);
			rx.add(record, "amt_09", rec.amt_09);
			rx.add(record, "amt_10", rec.amt_10);
			rx.add(record, "amt_11", rec.amt_11);
			rx.add(record, "amt_12", rec.amt_12);
			rx.add(record, "tot_amt", rec.tot_amt);
			rx.add(record, "pre_tot_amt", rec.pre_tot_amt);
			//rx.add(record, "kind", StringUtil.replaceToXml(rec.kind));
			//rx.add(record, "clas_cd", StringUtil.replaceToXml(rec.clas_cd));
			//rx.add(record, "clas_cd_code", StringUtil.replaceToXml(rec.clas_cd_code));
			//rx.add(record, "budg_clas_cd_nm", StringUtil.replaceToXml(rec.budg_clas_cd_nm));
			//rx.add(record, "amt_01", StringUtil.replaceToXml(rec.amt_01));
			//rx.add(record, "amt_02", StringUtil.replaceToXml(rec.amt_02));
			//rx.add(record, "amt_03", StringUtil.replaceToXml(rec.amt_03));
			//rx.add(record, "amt_04", StringUtil.replaceToXml(rec.amt_04));
			//rx.add(record, "amt_05", StringUtil.replaceToXml(rec.amt_05));
			//rx.add(record, "amt_06", StringUtil.replaceToXml(rec.amt_06));
			//rx.add(record, "amt_07", StringUtil.replaceToXml(rec.amt_07));
			//rx.add(record, "amt_08", StringUtil.replaceToXml(rec.amt_08));
			//rx.add(record, "amt_09", StringUtil.replaceToXml(rec.amt_09));
			//rx.add(record, "amt_10", StringUtil.replaceToXml(rec.amt_10));
			//rx.add(record, "amt_11", StringUtil.replaceToXml(rec.amt_11));
			//rx.add(record, "amt_12", StringUtil.replaceToXml(rec.amt_12));
			//rx.add(record, "tot_amt", StringUtil.replaceToXml(rec.tot_amt));
			//rx.add(record, "pre_tot_amt", StringUtil.replaceToXml(rec.pre_tot_amt));
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
<mc_budg_6113_l>
	<dataSet>
		<CURLIST>
			<record>
				<kind/>
				<clas_cd/>
				<clas_cd_code/>
				<budg_clas_cd_nm/>
				<amt_01/>
				<amt_02/>
				<amt_03/>
				<amt_04/>
				<amt_05/>
				<amt_06/>
				<amt_07/>
				<amt_08/>
				<amt_09/>
				<amt_10/>
				<amt_11/>
				<amt_12/>
				<tot_amt/>
				<pre_tot_amt/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_6113_l>
*/
%>

<% /* 작성시간 : Mon Apr 06 19:43:07 KST 2009 */ %>