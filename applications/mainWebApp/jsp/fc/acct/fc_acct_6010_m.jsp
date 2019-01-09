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
	FC_ACCT_6010_MDataSet ds = (FC_ACCT_6010_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	rx.add(dataSet, "xx_ss_emp_yn", ds.xx_ss_emp_yn);
	rx.add(dataSet, "xx_prof_type_cd", ds.xx_prof_type_cd);
	
	try {
		/****** CURSLIP_CLSF3 BEGIN */
		recordSet = rx.add(dataSet, "CURSLIP_CLSF3", "");

		for(int i = 0; i < ds.curslip_clsf3.size(); i++) {
			FC_ACCT_6010_MCURSLIP_CLSF3Record rec = (FC_ACCT_6010_MCURSLIP_CLSF3Record)ds.curslip_clsf3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curslip_clsf3.size());
		/****** CURSLIP_CLSF3 END */

		/****** CURSLIP_CLSF2 BEGIN */
		recordSet = rx.add(dataSet, "CURSLIP_CLSF2", "");

		for(int i = 0; i < ds.curslip_clsf2.size(); i++) {
			FC_ACCT_6010_MCURSLIP_CLSF2Record rec = (FC_ACCT_6010_MCURSLIP_CLSF2Record)ds.curslip_clsf2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curslip_clsf2.size());
		/****** CURSLIP_CLSF2 END */

		/****** CURSLIP_CLSF1 BEGIN */
		recordSet = rx.add(dataSet, "CURSLIP_CLSF1", "");

		for(int i = 0; i < ds.curslip_clsf1.size(); i++) {
			FC_ACCT_6010_MCURSLIP_CLSF1Record rec = (FC_ACCT_6010_MCURSLIP_CLSF1Record)ds.curslip_clsf1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curslip_clsf1.size());
		/****** CURSLIP_CLSF1 END */

		/****** CURPROF_CD BEGIN */
		recordSet = rx.add(dataSet, "CURPROF_CD", "");

		for(int i = 0; i < ds.curprof_cd.size(); i++) {
			FC_ACCT_6010_MCURPROF_CDRecord rec = (FC_ACCT_6010_MCURPROF_CDRecord)ds.curprof_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curprof_cd.size());
		/****** CURPROF_CD END */

		/****** ELEC_TAX_COMP_CD BEGIN */
		recordSet = rx.add(dataSet, "ELEC_TAX_COMP_CD", "");

		for(int i = 0; i < ds.elec_tax_comp_cd.size(); i++) {
			FC_ACCT_6010_MELEC_TAX_COMP_CDRecord rec = (FC_ACCT_6010_MELEC_TAX_COMP_CDRecord)ds.elec_tax_comp_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.elec_tax_comp_cd.size());
		/****** ELEC_TAX_COMP_CD END */

		/****** CURERPALCED_CD BEGIN */
		recordSet = rx.add(dataSet, "CURERPALCED_CD", "");

		for(int i = 0; i < ds.curerpalced_cd.size(); i++) {
			FC_ACCT_6010_MCURERPALCED_CDRecord rec = (FC_ACCT_6010_MCURERPALCED_CDRecord)ds.curerpalced_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curerpalced_cd.size());
		/****** CURERPALCED_CD END */

		/****** CURDLCO_CLSF_CD BEGIN */
		recordSet = rx.add(dataSet, "CURDLCO_CLSF_CD", "");

		for(int i = 0; i < ds.curdlco_clsf_cd.size(); i++) {
			FC_ACCT_6010_MCURDLCO_CLSF_CDRecord rec = (FC_ACCT_6010_MCURDLCO_CLSF_CDRecord)ds.curdlco_clsf_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curdlco_clsf_cd.size());
		/****** CURDLCO_CLSF_CD END */

		/****** RE_ISSU_RESN_CD BEGIN */
		recordSet = rx.add(dataSet, "RE_ISSU_RESN_CD", "");

		for(int i = 0; i < ds.re_issu_resn_cd.size(); i++) {
			FC_ACCT_6010_MRE_ISSU_RESN_CDRecord rec = (FC_ACCT_6010_MRE_ISSU_RESN_CDRecord)ds.re_issu_resn_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.re_issu_resn_cd.size());
		/****** RE_ISSU_RESN_CD END */

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
<fc_acct_6010_m>
	<dataSet>
		<CURSLIP_CLSF3>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURSLIP_CLSF3>
	</dataSet>
</fc_acct_6010_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_6010_m>
	<dataSet>
		<CURSLIP_CLSF2>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURSLIP_CLSF2>
	</dataSet>
</fc_acct_6010_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_6010_m>
	<dataSet>
		<CURSLIP_CLSF1>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURSLIP_CLSF1>
	</dataSet>
</fc_acct_6010_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_6010_m>
	<dataSet>
		<CURPROF_CD>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURPROF_CD>
	</dataSet>
</fc_acct_6010_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_6010_m>
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
</fc_acct_6010_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_6010_m>
	<dataSet>
		<CURERPALCED_CD>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURERPALCED_CD>
	</dataSet>
</fc_acct_6010_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_6010_m>
	<dataSet>
		<CURDLCO_CLSF_CD>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURDLCO_CLSF_CD>
	</dataSet>
</fc_acct_6010_m>
*/
%>

<% /* 작성시간 : Tue Apr 12 17:51:20 KST 2011 */ %>