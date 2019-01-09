<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.bas.rec.*
	,	chosun.ciis.pl.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pl_bas_1220_l.jsp
* 기능 : 
* 작성일자 : 2009-03-04
* 작성자 : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	PL_BAS_1220_LDataSet ds = (PL_BAS_1220_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "resform", "");

	try {
		/****** DLCODTLLIST BEGIN */
		for(int i = 0; i < ds.dlcodtllist.size(); i++) {
			PL_BAS_1220_LDLCODTLLISTRecord rec = (PL_BAS_1220_LDLCODTLLISTRecord)ds.dlcodtllist.get(i);
			int record = rx.add(dataSet, "DLCODTLLIST", "");
			rx.add(record, "acc_flag", "");
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "dlco_abrv_nm", StringUtil.replaceToXml(rec.dlco_abrv_nm));
			rx.add(record, "comn_mang_no", rec.comn_mang_no);
			rx.add(record, "rptv_flnm", StringUtil.replaceToXml(rec.rptv_flnm));
			rx.add(record, "dlco_clsf", rec.dlco_clsf);
			rx.add(record, "area", rec.area);
			rx.add(record, "prv_curr_clsf", rec.prv_curr_clsf);
			rx.add(record, "prv_curr_clsf_nm", rec.prv_curr_clsf_nm);
			rx.add(record, "bkst_cnt", rec.bkst_cnt);
			rx.add(record, "tel_no_1", rec.tel_no_1);
			rx.add(record, "tel_no_2", rec.tel_no_2);
			rx.add(record, "tel_no_3", rec.tel_no_3);
			rx.add(record, "tel_no_etc", rec.tel_no_etc);
			rx.add(record, "ptph_no_1", rec.ptph_no_1);
			rx.add(record, "ptph_no_2", rec.ptph_no_2);
			rx.add(record, "ptph_no_3", rec.ptph_no_3);
			rx.add(record, "fax_no_1", rec.fax_no_1);
			rx.add(record, "fax_no_2", rec.fax_no_2);
			rx.add(record, "fax_no_3", rec.fax_no_3);
			rx.add(record, "email", StringUtil.replaceToXml(rec.email));
			rx.add(record, "zip_1", rec.zip_1);
			rx.add(record, "zip_2", rec.zip_2);
			rx.add(record, "addr", StringUtil.replaceToXml(rec.addr));
			rx.add(record, "dtls_addr", StringUtil.replaceToXml(rec.dtls_addr));
			rx.add(record, "magz_deal_yn", rec.magz_deal_yn);
			rx.add(record, "magz_deal_frdt", rec.magz_deal_frdt);
			rx.add(record, "magz_deal_todt", rec.magz_deal_todt);
			rx.add(record, "sep_book_deal_yn", rec.sep_book_deal_yn);
			rx.add(record, "sep_book_deal_frdt", rec.sep_book_deal_frdt);
			rx.add(record, "sep_book_deal_todt", rec.sep_book_deal_todt);
			rx.add(record, "elec_tax_stmt_yn", rec.elec_tax_stmt_yn);
			rx.add(record, "gurt_amt_tot_amt", rec.gurt_amt_tot_amt);
			rx.add(record, "gurt_amt_altn", rec.gurt_amt_altn);
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
		}
		/****** DLCODTLLIST END */

		/****** HNDLMEDILIST BEGIN */
		int HNDLMEDILIST = rx.add(dataSet, "HNDLMEDILIST", "");
		for(int i = 0; i < ds.hndlmedilist.size(); i++) {
			PL_BAS_1220_LHNDLMEDILISTRecord rec = (PL_BAS_1220_LHNDLMEDILISTRecord)ds.hndlmedilist.get(i);
			int record = rx.add(HNDLMEDILIST, "record", "");
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "medi_clsf", rec.medi_clsf);
			rx.add(record, "medi_clsf_nm", StringUtil.replaceToXml(rec.medi_clsf_nm));
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_cd_nm", StringUtil.replaceToXml(rec.medi_cd_nm));
			rx.add(record, "deal_yn", rec.deal_yn);
			rx.add(record, "no_val_exne", rec.no_val_exne);
			rx.add(record, "dcrate", rec.dcrate);
			rx.add(record, "wh_cd", rec.wh_cd);
			rx.add(record, "sendclsf", rec.sendclsf);
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
		}
		/****** HNDLMEDILIST END */

		/****** SENDPLACLIST BEGIN */
		int SENDPLACLIST = rx.add(dataSet, "SENDPLACLIST", "");
		for(int i = 0; i < ds.sendplaclist.size(); i++) {
			PL_BAS_1220_LSENDPLACLISTRecord rec = (PL_BAS_1220_LSENDPLACLISTRecord)ds.sendplaclist.get(i);
			int record = rx.add(SENDPLACLIST, "record", "");
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "send_plac_seq", rec.send_plac_seq);
			rx.add(record, "send_plac_nm", StringUtil.replaceToXml(rec.send_plac_nm));
			rx.add(record, "magz_deal_yn", rec.magz_deal_yn);
			rx.add(record, "sep_book_deal_yn", rec.sep_book_deal_yn);
			rx.add(record, "vexc_dlco_cd", rec.vexc_dlco_cd);
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "fax_no", rec.fax_no);
			rx.add(record, "zip_1", rec.zip_1);
			rx.add(record, "zip_2", rec.zip_2);
			rx.add(record, "addr", rec.addr);
			rx.add(record, "dtls_addr", rec.dtls_addr);
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
		}
		/****** SENDPLACLIST END */

		/****** COLTLIST BEGIN */
		int COLTLIST = rx.add(dataSet, "COLTLIST", "");
		for(int i = 0; i < ds.coltlist.size(); i++) {
			PL_BAS_1220_LCOLTLISTRecord rec = (PL_BAS_1220_LCOLTLISTRecord)ds.coltlist.get(i);
			int record = rx.add(COLTLIST, "record", "");
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "colt_seq", rec.colt_seq);
			rx.add(record, "colt_clsf", rec.colt_clsf);
			rx.add(record, "setup_stat", rec.setup_stat);
			rx.add(record, "colt_obj_nm", StringUtil.replaceToXml(rec.colt_obj_nm));
			rx.add(record, "prty_rank", rec.prty_rank);
			rx.add(record, "acqr_dt", rec.acqr_dt);
			rx.add(record, "colt_setup_amt", rec.colt_setup_amt);
			rx.add(record, "pub_ann_amt", rec.pub_ann_amt);
			rx.add(record, "plcw", rec.plcw);
			rx.add(record, "gurt_strt_dd", rec.gurt_strt_dd);
			rx.add(record, "gurt_end_dd", rec.gurt_end_dd);
			rx.add(record, "insr_stock_no", rec.insr_stock_no);
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
		}
		/****** COLTLIST END */

		/****** GURTPERSLIST BEGIN */
		int GURTPERSLIST = rx.add(dataSet, "GURTPERSLIST", "");
		for(int i = 0; i < ds.gurtperslist.size(); i++) {
			PL_BAS_1220_LGURTPERSLISTRecord rec = (PL_BAS_1220_LGURTPERSLISTRecord)ds.gurtperslist.get(i);
			int record = rx.add(GURTPERSLIST, "record", "");
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "gurt_pers_seq", rec.gurt_pers_seq);
			rx.add(record, "setup_stat", rec.setup_stat);
			rx.add(record, "gurt_pers_flnm", StringUtil.replaceToXml(rec.gurt_pers_flnm));
			rx.add(record, "gurt_pers_prn_1", rec.gurt_pers_prn_1);
			rx.add(record, "gurt_pers_prn_2", rec.gurt_pers_prn_2);
			rx.add(record, "tel_no_1", rec.tel_no_1);
			rx.add(record, "tel_no_2", rec.tel_no_2);
			rx.add(record, "tel_no_3", rec.tel_no_3);
			rx.add(record, "ptph_no_1", rec.ptph_no_1);
			rx.add(record, "ptph_no_2", rec.ptph_no_2);
			rx.add(record, "ptph_no_3", rec.ptph_no_3);
			rx.add(record, "zip_1", rec.zip_1);
			rx.add(record, "zip_2", rec.zip_2);
			rx.add(record, "addr", StringUtil.replaceToXml(rec.addr));
			rx.add(record, "dtls_addr", StringUtil.replaceToXml(rec.dtls_addr));
			rx.add(record, "rshp", rec.rshp);
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
		}
		/****** GURTPERSLIST END */

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
	<GURTPERSLIST>
		<record>
			<dlco_cd/>
			<dlco_seq/>
			<gurt_pers_seq/>
			<setup_stat/>
			<gurt_pers_flnm/>
			<gurt_pers_prn_1/>
			<gurt_pers_prn_2/>
			<tel_no_1/>
			<tel_no_2/>
			<tel_no_3/>
			<ptph_no_1/>
			<ptph_no_2/>
			<ptph_no_3/>
			<zip_1/>
			<zip_2/>
			<addr/>
			<dtls_addr/>
			<rshp/>
			<remk/>
		</record>
	</GURTPERSLIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<COLTLIST>
		<record>
			<dlco_cd/>
			<dlco_seq/>
			<colt_seq/>
			<colt_clsf/>
			<setup_stat/>
			<colt_obj_nm/>
			<prty_rank/>
			<acqr_dt/>
			<colt_setup_amt/>
			<pub_ann_amt/>
			<plcw/>
			<gurt_strt_dd/>
			<gurt_end_dd/>
			<insr_stock_no/>
			<remk/>
		</record>
	</COLTLIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<SENDPLACLIST>
		<record>
			<dlco_cd/>
			<dlco_seq/>
			<send_plac_seq/>
			<send_plac_nm/>
			<magz_deal_yn/>
			<sep_book_deal_yn/>
			<vexc_dlco_cd/>
			<tel_no/>
			<fax_no/>
			<zip_1/>
			<zip_2/>
			<addr/>
			<dtls_addr/>
			<remk/>
		</record>
	</SENDPLACLIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<HNDLMEDILIST>
		<record>
			<dlco_cd/>
			<dlco_seq/>
			<medi_clsf/>
			<medi_clsf_nm/>
			<medi_cd/>
			<medi_cd_nm/>
			<deal_yn/>
			<no_val_exne/>
			<dcrate/>
			<wh_cd/>
			<sendclsf/>
			<remk/>
		</record>
	</HNDLMEDILIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<DLCODTLLIST>
		<record>
			<dlco_cd/>
			<dlco_seq/>
			<dlco_nm/>
			<dlco_abrv_nm/>
			<comn_mang_no/>
			<rptv_flnm/>
			<dlco_clsf/>
			<area/>
			<prv_curr_clsf/>
			<prv_curr_clsf_nm/>
			<bkst_cnt/>
			<tel_no_1/>
			<tel_no_2/>
			<tel_no_3/>
			<tel_no_etc/>
			<ptph_no_1/>
			<ptph_no_2/>
			<ptph_no_3/>
			<fax_no_1/>
			<fax_no_2/>
			<fax_no_3/>
			<email/>
			<zip_1/>
			<zip_2/>
			<addr/>
			<dtls_addr/>
			<magz_deal_yn/>
			<magz_deal_frdt/>
			<magz_deal_todt/>
			<sep_book_deal_yn/>
			<sep_book_deal_frdt/>
			<sep_book_deal_todt/>
			<elec_tax_stmt_yn/>
			<gurt_amt_tot_amt/>
			<gurt_amt_altn/>
			<remk/>
		</record>
	</DLCODTLLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Mar 04 12:56:30 KST 2009 */ %>