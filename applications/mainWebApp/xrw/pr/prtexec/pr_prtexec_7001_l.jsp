<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.prtexec.rec.*
	,	chosun.ciis.pr.prtexec.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PRTEXEC_7001_LDataSet ds = (PR_PRTEXEC_7001_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "tempData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PRTEXEC_7001_LCURLISTRecord rec = (PR_PRTEXEC_7001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "gubun", rec.gubun);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "edt_nm", rec.edt_nm);
			rx.add(record, "ecnt", rec.ecnt);
			rx.add(record, "prt_dt", rec.prt_dt);
			rx.add(record, "advt_clr_pcnt", rec.advt_clr_pcnt);
			rx.add(record, "prv_side_advt_clr_pcnt", rec.prv_side_advt_clr_pcnt);
			rx.add(record, "atic_clr_pcnt", rec.atic_clr_pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "prv_side_advt_bw_pcnt", rec.prv_side_advt_bw_pcnt);
			rx.add(record, "bw_pcnt", rec.bw_pcnt);
			rx.add(record, "wht_pj_qty", rec.wht_pj_qty);
			rx.add(record, "blk_pj_qty", rec.blk_pj_qty);
			rx.add(record, "sect_cnt", rec.sect_cnt);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "sect_pcnt", rec.sect_pcnt);
			rx.add(record, "sect_clr_pcnt", rec.sect_clr_pcnt);
			rx.add(record, "sect_bw_pcnt", rec.sect_bw_pcnt);
			rx.add(record, "advt_bw_pcnt", rec.advt_bw_pcnt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

	}
	catch (Exception e) {
	}
	finally {
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
			<gubun/>
			<fac_clsf/>
			<fac_clsf_nm/>
			<medi_cd/>
			<edt_nm/>
			<ecnt/>
			<prt_dt/>
			<advt_clr_pcnt/>
			<prv_side_advt_clr_pcnt/>
			<atic_clr_pcnt/>
			<clr_pcnt/>
			<prv_side_advt_bw_pcnt/>
			<bw_pcnt/>
			<wht_pj_qty/>
			<blk_pj_qty/>
			<sect_cnt/>
			<sect_nm/>
			<sect_pcnt/>
			<sect_clr_pcnt/>
			<sect_bw_pcnt/>
			<advt_bw_pcnt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Jun 09 14:57:07 KST 2009 */ %>