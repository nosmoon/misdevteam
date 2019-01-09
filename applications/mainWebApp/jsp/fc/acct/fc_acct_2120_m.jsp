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
	FC_ACCT_2120_MDataSet ds = (FC_ACCT_2120_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** DLCO_CLSF_CD_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "DLCO_CLSF_CD_CURLIST", "");

		for(int i = 0; i < ds.dlco_clsf_cd_curlist.size(); i++) {
			FC_ACCT_2120_MDLCO_CLSF_CD_CURLISTRecord rec = (FC_ACCT_2120_MDLCO_CLSF_CD_CURLISTRecord)ds.dlco_clsf_cd_curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.addCData(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.dlco_clsf_cd_curlist.size());
		/****** DLCO_CLSF_CD_CURLIST END */

		/****** ELEC_TAX_COMP_CD BEGIN */
		recordSet = rx.add(dataSet, "ELEC_TAX_COMP_CD", "");

		for(int i = 0; i < ds.elec_tax_comp_cd.size(); i++) {
			FC_ACCT_2120_MELEC_TAX_COMP_CDRecord rec = (FC_ACCT_2120_MELEC_TAX_COMP_CDRecord)ds.elec_tax_comp_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.addCData(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.elec_tax_comp_cd.size());
		/****** ELEC_TAX_COMP_CD END */

		/****** G2_NOTE_CLSF_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "G2_NOTE_CLSF_CURLIST", "");

		for(int i = 0; i < ds.g2_note_clsf_curlist.size(); i++) {
			FC_ACCT_2120_MG2_NOTE_CLSF_CURLISTRecord rec = (FC_ACCT_2120_MG2_NOTE_CLSF_CURLISTRecord)ds.g2_note_clsf_curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.addCData(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.g2_note_clsf_curlist.size());
		/****** G2_NOTE_CLSF_CURLIST END */

		/****** PROF_KIND_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "PROF_KIND_CURLIST", "");

		for(int i = 0; i < ds.prof_kind_curlist.size(); i++) {
			FC_ACCT_2120_MPROF_KIND_CURLISTRecord rec = (FC_ACCT_2120_MPROF_KIND_CURLISTRecord)ds.prof_kind_curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.addCData(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.prof_kind_curlist.size());
		/****** PROF_KIND_CURLIST END */

		/****** G2_ISSU_CMPY_CD_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "G2_ISSU_CMPY_CD_CURLIST", "");

		for(int i = 0; i < ds.g2_issu_cmpy_cd_curlist.size(); i++) {
			FC_ACCT_2120_MG2_ISSU_CMPY_CD_CURLISTRecord rec = (FC_ACCT_2120_MG2_ISSU_CMPY_CD_CURLISTRecord)ds.g2_issu_cmpy_cd_curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.addCData(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.g2_issu_cmpy_cd_curlist.size());
		/****** G2_ISSU_CMPY_CD_CURLIST END */

		/****** G2_RCPM_ACCT_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "G2_RCPM_ACCT_CURLIST", "");

		for(int i = 0; i < ds.g2_rcpm_acct_curlist.size(); i++) {
			FC_ACCT_2120_MG2_RCPM_ACCT_CURLISTRecord rec = (FC_ACCT_2120_MG2_RCPM_ACCT_CURLISTRecord)ds.g2_rcpm_acct_curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.addCData(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.g2_rcpm_acct_curlist.size());
		/****** G2_RCPM_ACCT_CURLIST END */

		/****** ERPLACE_CD_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "ERPLACE_CD_CURLIST", "");

		for(int i = 0; i < ds.erplace_cd_curlist.size(); i++) {
			FC_ACCT_2120_MERPLACE_CD_CURLISTRecord rec = (FC_ACCT_2120_MERPLACE_CD_CURLISTRecord)ds.erplace_cd_curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.addCData(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.erplace_cd_curlist.size());
		/****** ERPLACE_CD_CURLIST END */

		/****** RCPM_SHET_KIND_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "RCPM_SHET_KIND_CURLIST", "");

		for(int i = 0; i < ds.rcpm_shet_kind_curlist.size(); i++) {
			FC_ACCT_2120_MRCPM_SHET_KIND_CURLISTRecord rec = (FC_ACCT_2120_MRCPM_SHET_KIND_CURLISTRecord)ds.rcpm_shet_kind_curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.addCData(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.rcpm_shet_kind_curlist.size());
		/****** RCPM_SHET_KIND_CURLIST END */

		/****** G1_MANG_CLSF_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "G1_MANG_CLSF_CURLIST", "");

		for(int i = 0; i < ds.g1_mang_clsf_curlist.size(); i++) {
			FC_ACCT_2120_MG1_MANG_CLSF_CURLISTRecord rec = (FC_ACCT_2120_MG1_MANG_CLSF_CURLISTRecord)ds.g1_mang_clsf_curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.addCData(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.g1_mang_clsf_curlist.size());
		/****** G1_MANG_CLSF_CURLIST END */

		/****** SLIP_CLSF_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "SLIP_CLSF_CURLIST", "");

		for(int i = 0; i < ds.slip_clsf_curlist.size(); i++) {
			FC_ACCT_2120_MSLIP_CLSF_CURLISTRecord rec = (FC_ACCT_2120_MSLIP_CLSF_CURLISTRecord)ds.slip_clsf_curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.addCData(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.slip_clsf_curlist.size());
		/****** SLIP_CLSF_CURLIST END */

		/****** G1_FRCR_CLSF_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "G1_FRCR_CLSF_CURLIST", "");

		for(int i = 0; i < ds.g1_frcr_clsf_curlist.size(); i++) {
			FC_ACCT_2120_MG1_FRCR_CLSF_CURLISTRecord rec = (FC_ACCT_2120_MG1_FRCR_CLSF_CURLISTRecord)ds.g1_frcr_clsf_curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.addCData(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.g1_frcr_clsf_curlist.size());
		/****** G1_FRCR_CLSF_CURLIST END */

		/****** G3_WHCO_SLIP_CLSF_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "G3_WHCO_SLIP_CLSF_CURLIST", "");

		for(int i = 0; i < ds.g3_whco_slip_clsf_curlist.size(); i++) {
			FC_ACCT_2120_MG3_WHCO_SLIP_CLSF_CURLISTRecord rec = (FC_ACCT_2120_MG3_WHCO_SLIP_CLSF_CURLISTRecord)ds.g3_whco_slip_clsf_curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.addCData(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.g3_whco_slip_clsf_curlist.size());
		/****** G3_WHCO_SLIP_CLSF_CURLIST END */

		/****** MEDI_CD_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "MEDI_CD_CURLIST", "");

		for(int i = 0; i < ds.medi_cd_curlist.size(); i++) {
			FC_ACCT_2120_MMEDI_CD_CURLISTRecord rec = (FC_ACCT_2120_MMEDI_CD_CURLISTRecord)ds.medi_cd_curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.addCData(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.medi_cd_curlist.size());
		/****** MEDI_CD_CURLIST END */


		/****** CHNL_CLSF_CD_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CHNL_CLSF_CD_CURLIST", "");

		for(int i = 0; i < ds.chnl_clsf_cd_curlist.size(); i++) {
			FC_ACCT_2120_MCHNL_CLSF_CD_CURLISTRecord rec = (FC_ACCT_2120_MCHNL_CLSF_CD_CURLISTRecord)ds.chnl_clsf_cd_curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.addCData(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.chnl_clsf_cd_curlist.size());
		/****** CHNL_CLSF_CD_CURLIST END */
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
<fc_acct_2120_m>
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
</fc_acct_2120_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2120_m>
	<dataSet>
		<ELEC_TAX_COMP_CD>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</ELEC_TAX_COMP_CD>
	</dataSet>
</fc_acct_2120_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2120_m>
	<dataSet>
		<G2_NOTE_CLSF_CURLIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</G2_NOTE_CLSF_CURLIST>
	</dataSet>
</fc_acct_2120_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2120_m>
	<dataSet>
		<PROF_KIND_CURLIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</PROF_KIND_CURLIST>
	</dataSet>
</fc_acct_2120_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2120_m>
	<dataSet>
		<G2_ISSU_CMPY_CD_CURLIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</G2_ISSU_CMPY_CD_CURLIST>
	</dataSet>
</fc_acct_2120_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2120_m>
	<dataSet>
		<G2_RCPM_ACCT_CURLIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</G2_RCPM_ACCT_CURLIST>
	</dataSet>
</fc_acct_2120_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2120_m>
	<dataSet>
		<ERPLACE_CD_CURLIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</ERPLACE_CD_CURLIST>
	</dataSet>
</fc_acct_2120_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2120_m>
	<dataSet>
		<RCPM_SHET_KIND_CURLIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</RCPM_SHET_KIND_CURLIST>
	</dataSet>
</fc_acct_2120_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2120_m>
	<dataSet>
		<G1_MANG_CLSF_CURLIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</G1_MANG_CLSF_CURLIST>
	</dataSet>
</fc_acct_2120_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2120_m>
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
</fc_acct_2120_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2120_m>
	<dataSet>
		<G1_FRCR_CLSF_CURLIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</G1_FRCR_CLSF_CURLIST>
	</dataSet>
</fc_acct_2120_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2120_m>
	<dataSet>
		<G3_WHCO_SLIP_CLSF_CURLIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</G3_WHCO_SLIP_CLSF_CURLIST>
	</dataSet>
</fc_acct_2120_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2120_m>
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
</fc_acct_2120_m>
*/
%>

<% /* 작성시간 : Thu Jun 16 19:23:01 KST 2011 */ %>