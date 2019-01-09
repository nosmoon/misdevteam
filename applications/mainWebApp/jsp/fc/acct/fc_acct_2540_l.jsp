<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2540_LDataSet ds = (FC_ACCT_2540_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_ACCT_2540_LCURLIST2Record rec = (FC_ACCT_2540_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "out_cbjunamt", rec.out_cbjunamt);
			rx.add(record, "out_dbjunamt", rec.out_dbjunamt);
			rx.add(record, "out_cbhapamt", rec.out_cbhapamt);
			rx.add(record, "out_dbhapamt", rec.out_dbhapamt);
			rx.add(record, "out_cbjanamt", rec.out_cbjanamt);
			rx.add(record, "out_dbjanamt", rec.out_dbjanamt);
			rx.add(record, "out_accdjagb", rec.out_accdjagb);
			//rx.add(record, "out_cbjunamt", StringUtil.replaceToXml(rec.out_cbjunamt));
			//rx.add(record, "out_dbjunamt", StringUtil.replaceToXml(rec.out_dbjunamt));
			//rx.add(record, "out_cbhapamt", StringUtil.replaceToXml(rec.out_cbhapamt));
			//rx.add(record, "out_dbhapamt", StringUtil.replaceToXml(rec.out_dbhapamt));
			//rx.add(record, "out_cbjanamt", StringUtil.replaceToXml(rec.out_cbjanamt));
			//rx.add(record, "out_dbjanamt", StringUtil.replaceToXml(rec.out_dbjanamt));
			//rx.add(record, "out_accdjagb", StringUtil.replaceToXml(rec.out_accdjagb));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_ACCT_2540_LCURLIST1Record rec = (FC_ACCT_2540_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
            //rx.add(record, "fisc_dt", rec.fisc_dt);
            //rx.add(record, "slip_no", rec.slip_no);
            //rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
            //rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
            //rx.add(record, "slip_seq", rec.slip_seq);
            //rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
            //rx.add(record, "slip_arow_no", rec.slip_arow_no);
            //rx.add(record, "rmks", rec.rmks);
            //rx.add(record, "dr_amt", rec.dr_amt);
            //rx.add(record, "crdt_amt", rec.crdt_amt);
            //rx.add(record, "mang_clsf_cd", rec.mang_clsf_cd);
            //rx.add(record, "pch_gwgbnm", rec.pch_gwgbnm);
            //rx.add(record, "mang_no", rec.mang_no);
            //rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
            //rx.add(record, "pch_compgbnm", rec.pch_compgbnm);
            //rx.add(record, "dlco_cd", rec.dlco_cd);
            //rx.add(record, "dlco_nm", rec.dlco_nm);
            //rx.add(record, "boks_dlco_nm", rec.boks_dlco_nm);
            //rx.add(record, "medi_cd", rec.medi_cd);
            //rx.add(record, "pch_mccdnm", rec.pch_mccdnm);
            //rx.add(record, "insd_acct_cd", rec.insd_acct_cd);
            //rx.add(record, "evnt_cd", rec.evnt_cd);
            //rx.add(record, "pch_hsnm", rec.pch_hsnm);
            //rx.add(record, "obj_amt", rec.obj_amt);
            //rx.add(record, "pch_cgbsnm", rec.pch_cgbsnm);
            //rx.add(record, "pch_dsacctnm", rec.pch_dsacctnm);
            rx.add(record, "fisc_dt", StringUtil.replaceToXml(rec.fisc_dt));
            rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
            rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
            rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
            rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
            rx.add(record, "slip_sub_seq", StringUtil.replaceToXml(rec.slip_sub_seq));
            rx.add(record, "slip_arow_no", StringUtil.replaceToXml(rec.slip_arow_no));
            rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
            rx.add(record, "dr_amt", StringUtil.replaceToXml(rec.dr_amt));
            rx.add(record, "crdt_amt", StringUtil.replaceToXml(rec.crdt_amt));
            rx.add(record, "mang_clsf_cd", StringUtil.replaceToXml(rec.mang_clsf_cd));
            rx.add(record, "pch_gwgbnm", StringUtil.replaceToXml(rec.pch_gwgbnm));
            rx.add(record, "mang_no", StringUtil.replaceToXml(rec.mang_no));
            rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
            rx.add(record, "pch_compgbnm", StringUtil.replaceToXml(rec.pch_compgbnm));
            rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
            rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
            rx.add(record, "boks_dlco_nm", StringUtil.replaceToXml(rec.boks_dlco_nm));
            rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
            rx.add(record, "pch_mccdnm", StringUtil.replaceToXml(rec.pch_mccdnm));
            rx.add(record, "insd_acct_cd", StringUtil.replaceToXml(rec.insd_acct_cd));
            rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
            rx.add(record, "pch_hsnm", StringUtil.replaceToXml(rec.pch_hsnm));
            rx.add(record, "obj_amt", StringUtil.replaceToXml(rec.obj_amt));
            rx.add(record, "pch_cgbsnm", StringUtil.replaceToXml(rec.pch_cgbsnm));
            rx.add(record, "pch_dsacctnm", StringUtil.replaceToXml(rec.pch_dsacctnm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<fc_acct_2540_l>
	<dataSet>
		<CURLIST2>
			<record>
				<out_cbjunamt/>
				<out_dbjunamt/>
				<out_cbhapamt/>
				<out_dbhapamt/>
				<out_cbjanamt/>
				<out_dbjanamt/>
				<out_accdjagb/>
			</record>
		</CURLIST2>
	</dataSet>
</fc_acct_2540_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2540_l>
	<dataSet>
		<CURLIST1>
			<record>
				<fisc_dt/>
				<slip_no/>
				<slip_occr_dt/>
				<slip_clsf_cd/>
				<slip_seq/>
				<slip_sub_seq/>
				<slip_arow_no/>
				<rmks/>
				<dr_amt/>
				<crdt_amt/>
				<mang_clsf_cd/>
				<pch_gwgbnm/>
				<mang_no/>
				<dlco_clsf_cd/>
				<pch_compgbnm/>
				<dlco_cd/>
				<dlco_nm/>
				<boks_dlco_nm/>
				<medi_cd/>
				<pch_mccdnm/>
				<insd_acct_cd/>
				<evnt_cd/>
				<pch_hsnm/>
				<obj_amt/>
				<pch_cgbsnm/>
				<pch_dsacctnm/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_acct_2540_l>
*/
%>

<% /* 작성시간 : Fri May 29 18:02:12 KST 2009 */ %>