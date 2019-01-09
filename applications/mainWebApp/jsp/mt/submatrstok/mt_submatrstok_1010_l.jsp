<%@	page contentType="text/xml; charset=EUC-KR" %>
 
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.submatrstok.rec.*
	,	chosun.ciis.mt.submatrstok.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATRSTOK_1010_LDataSet ds = (MT_SUBMATRSTOK_1010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
	rx.add(dataSet,"remk", ds.remk);	
	rx.add(dataSet, "clos_yn", ds.clos_yn);
	rx.add(dataSet, "clos_nm", ds.clos_nm);

	try {
	
		recordSet = rx.add(dataSet, "gridData2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_SUBMATRSTOK_1010_LCURLIST2Record rec = (MT_SUBMATRSTOK_1010_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "unit", rec.unit);
			rx.add(record, "befor_wgt", rec.befor_wgt);
			rx.add(record, "ewh_wgt", rec.ewh_wgt);
			rx.add(record, "use_qunt", rec.use_qunt);
			rx.add(record, "jego_wgt", rec.jego_wgt);
			rx.add(record, "mm_ewh_wgt", rec.mm_ewh_wgt);
			rx.add(record, "mm_req_wgt", rec.mm_req_wgt);
			rx.add(record, "req_wgt", rec.req_wgt);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "req_remk", rec.req_remk);
			//rx.add(record, "purc_uprc", rec.purc_uprc);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */
	
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData1", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_SUBMATRSTOK_1010_LCURLIST1Record rec = (MT_SUBMATRSTOK_1010_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd); 
			rx.addCData(record, "sect_nm", rec.sect_nm);
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "bw_pcnt", rec.bw_pcnt);
			rx.add(record, "slip_qty", rec.slip_qty);
			rx.add(record, "prt_bgn_tm", rec.prt_bgn_tm);
			rx.add(record, "prt_end_tm", rec.prt_end_tm);
			rx.add(record, "real_prt_qty", rec.real_prt_qty);
			rx.add(record, "err_tms", rec.err_tms);
			
		}
		
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
			<occr_dt/>
			<seq/>
			<prt_dt/>
			<issu_dt/>
			<fac_clsf/>
			<medi_cd/>
			<sect_cd/>
			<pap_std/>
			<issu_pcnt/>
			<clr_pcnt/>
			<bw_pcnt/>
			<slip_qty/>
			<is_cnt_ex_yn/>
			<is_qty_inc_yn/>
			<add_prt_yn/>
			<qunt_out_yn/>
			<duty_ovt_prt_yn/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Apr 27 19:33:59 KST 2009 */ %>