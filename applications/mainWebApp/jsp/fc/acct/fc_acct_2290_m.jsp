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
	FC_ACCT_2290_MDataSet ds = (FC_ACCT_2290_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CUR_WHCO_NDSTB_CD_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_WHCO_NDSTB_CD_LIST", "");

		for(int i = 0; i < ds.cur_whco_ndstb_cd_list.size(); i++) {
			FC_ACCT_2290_MCUR_WHCO_NDSTB_CD_LISTRecord rec = (FC_ACCT_2290_MCUR_WHCO_NDSTB_CD_LISTRecord)ds.cur_whco_ndstb_cd_list.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "whco_ndstb_cd", rec.whco_ndstb_cd);
			//rx.add(record, "whco_comn_cost_yn", rec.whco_comn_cost_yn);
			rx.add(record, "whco_ndstb_cd", StringUtil.replaceToXml(rec.whco_ndstb_cd));
			rx.add(record, "whco_comn_cost_yn", StringUtil.replaceToXml(rec.whco_comn_cost_yn));
		}
		rx.add(recordSet, "totalcnt", ds.cur_whco_ndstb_cd_list.size());
		/****** CUR_WHCO_NDSTB_CD_LIST END */

		/****** DLCO_CLSF_CD_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "DLCO_CLSF_CD_CURLIST", "");

		for(int i = 0; i < ds.dlco_clsf_cd_curlist.size(); i++) {
			FC_ACCT_2290_MDLCO_CLSF_CD_CURLISTRecord rec = (FC_ACCT_2290_MDLCO_CLSF_CD_CURLISTRecord)ds.dlco_clsf_cd_curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.dlco_clsf_cd_curlist.size());
		/****** DLCO_CLSF_CD_CURLIST END */

		/****** CUR_BUDGMANGCD_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_BUDGMANGCD_LIST", "");

		for(int i = 0; i < ds.cur_budgmangcd_list.size(); i++) {
			FC_ACCT_2290_MCUR_BUDGMANGCD_LISTRecord rec = (FC_ACCT_2290_MCUR_BUDGMANGCD_LISTRecord)ds.cur_budgmangcd_list.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.cur_budgmangcd_list.size());
		/****** CUR_BUDGMANGCD_LIST END */

		/****** CUR_DLCO_CLSF_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_DLCO_CLSF_LIST", "");

		for(int i = 0; i < ds.cur_dlco_clsf_list.size(); i++) {
			FC_ACCT_2290_MCUR_DLCO_CLSF_LISTRecord rec = (FC_ACCT_2290_MCUR_DLCO_CLSF_LISTRecord)ds.cur_dlco_clsf_list.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.cur_dlco_clsf_list.size());
		/****** CUR_DLCO_CLSF_LIST END */

		/****** MANG_CLSF_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "MANG_CLSF_CURLIST", "");

		for(int i = 0; i < ds.mang_clsf_curlist.size(); i++) {
			FC_ACCT_2290_MMANG_CLSF_CURLISTRecord rec = (FC_ACCT_2290_MMANG_CLSF_CURLISTRecord)ds.mang_clsf_curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.mang_clsf_curlist.size());
		/****** MANG_CLSF_CURLIST END */

		/****** SLIP_CLSF_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "SLIP_CLSF_CURLIST", "");

		for(int i = 0; i < ds.slip_clsf_curlist.size(); i++) {
			FC_ACCT_2290_MSLIP_CLSF_CURLISTRecord rec = (FC_ACCT_2290_MSLIP_CLSF_CURLISTRecord)ds.slip_clsf_curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.slip_clsf_curlist.size());
		/****** SLIP_CLSF_CURLIST END */

		/****** CUR_MANG_ITEM_CD_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_MANG_ITEM_CD_LIST", "");

		for(int i = 0; i < ds.cur_mang_item_cd_list.size(); i++) {
			FC_ACCT_2290_MCUR_MANG_ITEM_CD_LISTRecord rec = (FC_ACCT_2290_MCUR_MANG_ITEM_CD_LISTRecord)ds.cur_mang_item_cd_list.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "mang_item_cd", rec.mang_item_cd);
			//rx.add(record, "drcr_clsf", rec.drcr_clsf);
			rx.add(record, "mang_item_cd", StringUtil.replaceToXml(rec.mang_item_cd));
			rx.add(record, "drcr_clsf", StringUtil.replaceToXml(rec.drcr_clsf));
		}
		rx.add(recordSet, "totalcnt", ds.cur_mang_item_cd_list.size());
		/****** CUR_MANG_ITEM_CD_LIST END */

		/****** CUR_PROF_TYPE_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_PROF_TYPE_LIST", "");

		for(int i = 0; i < ds.cur_prof_type_list.size(); i++) {
			FC_ACCT_2290_MCUR_PROF_TYPE_LISTRecord rec = (FC_ACCT_2290_MCUR_PROF_TYPE_LISTRecord)ds.cur_prof_type_list.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd_nm", rec.cd_nm);
			//rx.add(record, "cd", rec.cd);
			rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.cur_prof_type_list.size());
		/****** CUR_PROF_TYPE_LIST END */

		/****** FRCR_CLSF_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "FRCR_CLSF_CURLIST", "");

		for(int i = 0; i < ds.frcr_clsf_curlist.size(); i++) {
			FC_ACCT_2290_MFRCR_CLSF_CURLISTRecord rec = (FC_ACCT_2290_MFRCR_CLSF_CURLISTRecord)ds.frcr_clsf_curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.frcr_clsf_curlist.size());
		/****** FRCR_CLSF_CURLIST END */

		/****** CUR_ERPLACE_CD_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_ERPLACE_CD_LIST", "");

		for(int i = 0; i < ds.cur_erplace_cd_list.size(); i++) {
			FC_ACCT_2290_MCUR_ERPLACE_CD_LISTRecord rec = (FC_ACCT_2290_MCUR_ERPLACE_CD_LISTRecord)ds.cur_erplace_cd_list.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd_nm", rec.cd_nm);
			//rx.add(record, "cd", rec.cd);
			rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.cur_erplace_cd_list.size());
		/****** CUR_ERPLACE_CD_LIST END */

		/****** MEDI_CD_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "MEDI_CD_CURLIST", "");

		for(int i = 0; i < ds.medi_cd_curlist.size(); i++) {
			FC_ACCT_2290_MMEDI_CD_CURLISTRecord rec = (FC_ACCT_2290_MMEDI_CD_CURLISTRecord)ds.medi_cd_curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.medi_cd_curlist.size());
		/****** MEDI_CD_CURLIST END */

		/****** NOTE_STAT_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "NOTE_STAT_CURLIST", "");

		for(int i = 0; i < ds.note_stat_curlist.size(); i++) {
			FC_ACCT_2290_MNOTE_STAT_CURLISTRecord rec = (FC_ACCT_2290_MNOTE_STAT_CURLISTRecord)ds.note_stat_curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.note_stat_curlist.size());
		/****** NOTE_STAT_CURLIST END */

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
<fc_acct_2290_m>
	<dataSet>
		<CUR_WHCO_NDSTB_CD_LIST>
			<record>
				<whco_ndstb_cd/>
				<whco_comn_cost_yn/>
			</record>
		</CUR_WHCO_NDSTB_CD_LIST>
	</dataSet>
</fc_acct_2290_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2290_m>
	<dataSet>
		<DLCO_CLSF_CD_CURLIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</DLCO_CLSF_CD_CURLIST>
	</dataSet>
</fc_acct_2290_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2290_m>
	<dataSet>
		<CUR_BUDGMANGCD_LIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CUR_BUDGMANGCD_LIST>
	</dataSet>
</fc_acct_2290_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2290_m>
	<dataSet>
		<CUR_DLCO_CLSF_LIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CUR_DLCO_CLSF_LIST>
	</dataSet>
</fc_acct_2290_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2290_m>
	<dataSet>
		<MANG_CLSF_CURLIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</MANG_CLSF_CURLIST>
	</dataSet>
</fc_acct_2290_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2290_m>
	<dataSet>
		<SLIP_CLSF_CURLIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</SLIP_CLSF_CURLIST>
	</dataSet>
</fc_acct_2290_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2290_m>
	<dataSet>
		<CUR_MANG_ITEM_CD_LIST>
			<record>
				<mang_item_cd/>
				<drcr_clsf/>
			</record>
		</CUR_MANG_ITEM_CD_LIST>
	</dataSet>
</fc_acct_2290_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2290_m>
	<dataSet>
		<CUR_PROF_TYPE_LIST>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</CUR_PROF_TYPE_LIST>
	</dataSet>
</fc_acct_2290_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2290_m>
	<dataSet>
		<FRCR_CLSF_CURLIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</FRCR_CLSF_CURLIST>
	</dataSet>
</fc_acct_2290_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2290_m>
	<dataSet>
		<CUR_ERPLACE_CD_LIST>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</CUR_ERPLACE_CD_LIST>
	</dataSet>
</fc_acct_2290_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2290_m>
	<dataSet>
		<MEDI_CD_CURLIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</MEDI_CD_CURLIST>
	</dataSet>
</fc_acct_2290_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2290_m>
	<dataSet>
		<NOTE_STAT_CURLIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</NOTE_STAT_CURLIST>
	</dataSet>
</fc_acct_2290_m>
*/
%>

<% /* 작성시간 : Tue Sep 29 15:53:13 KST 2009 */ %>