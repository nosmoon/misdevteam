<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.papord.rec.*
	,	chosun.ciis.mt.papord.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPORD_1410_LDataSet ds = (MT_PAPORD_1410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "gridData", "");

	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPORD_1410_LCURLISTRecord rec = (MT_PAPORD_1410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "prt_dt", rec.issu_dt);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "pap_std", rec.pap_std);
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "slip_qty", rec.slip_qty);
			rx.add(record, "pap_model", rec.pap_model);
			rx.add(record, "a_wgt", rec.a_wgt);
			rx.add(record, "b_wgt", rec.b_wgt);
			rx.add(record, "c_wgt", rec.c_wgt);
			rx.add(record, "wk_pap_std", rec.wk_pap_std);
			rx.add(record, "wk_issu_pcnt", rec.wk_issu_pcnt);
			rx.add(record, "wk_slip_qty", rec.wk_slip_qty);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);

		}
		//rx.add(recordSet, "totalcnt", ds.curlist.size());
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
<mt_papord_4006_l>
	<dataSet>
		<CURLIST>
			<record>
				<issu_dt/>
				<fac_clsf/>
				<medi_cd/>
				<sect_cd/>
				<pcnt/>
				<dual_out_clsf/>
				<slip_qty/>
				<fac_clsf_nm/>
				<medi_nm/>
				<sect_nm/>
				<dual_out_nm/>
			</record>
		</CURLIST>
	</dataSet>
</mt_papord_4006_l>
*/
%>

<% /* 작성시간 : Wed Jul 01 15:33:52 KST 2009 */ %>