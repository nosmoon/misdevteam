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
	FC_ACCT_2010_MDataSet ds = (FC_ACCT_2010_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CHNL_CLSF_CD_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CHNL_CLSF_CD_CURLIST", "");

		for(int i = 0; i < ds.chnl_clsf_cd_curlist.size(); i++) {
			FC_ACCT_2010_MCHNL_CLSF_CD_CURLISTRecord rec = (FC_ACCT_2010_MCHNL_CLSF_CD_CURLISTRecord)ds.chnl_clsf_cd_curlist.get(i);
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