<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPINOUT_1002_LDataSet ds = (MT_PAPINOUT_1002_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_1002_LCURLISTRecord rec = (MT_PAPINOUT_1002_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "issu_dt", rec.issu_dt_issu);
			rx.add(record, "medi_cdnm_issu", rec.medi_cdnm_issu);
			rx.add(record, "medi_cd", rec.medi_cd_issu);
			rx.add(record, "sect_cdnm_issu", rec.sect_cdnm_issu);
			rx.add(record, "sect_cd", rec.sect_cd_issu);
			rx.add(record, "pap_std", rec.pap_std);
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "bw_pcnt", rec.bw_pcnt);
			rx.add(record, "slip_qty", rec.slip_qty);
			rx.add(record, "prt_wgt", rec.prt_wgt);
			rx.add(record, "pj_excl_prt_wgt", rec.pj_excl_prt_wgt);
			rx.add(record, "sum_pjqunt", rec.sum_pjqunt);
			rx.add(record, "pap_gm_qunt", rec.pap_gm_qunt);
			rx.add(record, "remk", rec.remk);

//			rx.add(record, "issu_dt_issu", rec.issu_dt)
//			rx.add(record, "medi_cd_medc", rec.medi_cd_medc);
//			rx.add(record, "sect_cd_medc", rec.sect_cd_medc);
//			rx.add(record, "issu_pcnt_medc", rec.issu_pcnt_medc);
//			rx.add(record, "prt_qty", rec.prt_qty);
//			rx.add(record, "prt_dt", rec.prt_dt);
//			rx.add(record, "fac_clsf", rec.fac_clsf);
//			rx.add(record, "medi_cdnm_issu", rec.medi_cdnm_issu);

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
			<medi_cd_medc/>
			<issu_dt/>
			<sect_cd_medc/>
			<issu_pcnt_medc/>
			<prt_qty/>
			<prt_wgt/>
			<pj_excl_prt_wgt/>
			<pap_gm_qunt/>
			<remk/>
			<prt_dt/>
			<issu_dt_issu/>
			<fac_clsf/>
			<medi_cd_issu/>
			<pap_std/>
			<issu_pcnt/>
			<bw_pcnt/>
			<clr_pcnt/>
			<slip_qty/>
			<medi_cdnm_issu/>
			<sect_cd_issu/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Apr 14 15:34:49 KST 2009 */ %>