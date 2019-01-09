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
	AS_ASET_1005_SDataSet ds = (AS_ASET_1005_SDataSet)request.getAttribute("ds");
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
			AS_ASET_1005_SCURLISTRecord rec = (AS_ASET_1005_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "aset_no", rec.aset_no);
			rx.add(record, "bldg_plcw", rec.bldg_plcw);
			rx.add(record, "land_size", rec.land_size);
			rx.add(record, "bldg_size", rec.bldg_size);
			rx.add(record, "flor_size", rec.flor_size);
			rx.add(record, "arch", rec.arch);
			rx.add(record, "flor_cnt", rec.flor_cnt);
			rx.add(record, "cmpl_yymm", rec.cmpl_yymm);
			rx.add(record, "acqr_tax_amt", rec.acqr_tax_amt);
			rx.add(record, "acqr_tax_yymm", rec.acqr_tax_yymm);
			rx.add(record, "now_tax_amt", rec.now_tax_amt);
			rx.add(record, "now_tax_yymm", rec.now_tax_yymm);
			rx.add(record, "blng_ward_offi", rec.blng_ward_offi);
			rx.add(record, "under_flor", rec.under_flor);
			rx.add(record, "under_size", rec.under_size);
			rx.add(record, "bldg_prmt_dt", rec.bldg_prmt_dt);
			rx.add(record, "leas_ern_no", rec.leas_ern_no);
			rx.add(record, "rela_no", rec.rela_no);
			rx.add(record, "rela_nm", rec.rela_nm);
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
			<bldg_plcw/>
			<land_size/>
			<bldg_size/>
			<flor_size/>
			<arch/>
			<flor_cnt/>
			<cmpl_yymm/>
			<acqr_tax_amt/>
			<acqr_tax_yymm/>
			<now_tax_amt/>
			<now_tax_yymm/>
			<blng_ward_offi/>
			<under_flor/>
			<under_size/>
			<bldg_prmt_dt/>
			<leas_ern_no/>
			<rela_no/>
			<rela_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Mar 04 12:58:00 KST 2009 */ %>