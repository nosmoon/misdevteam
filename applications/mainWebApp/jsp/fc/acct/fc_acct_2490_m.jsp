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
	FC_ACCT_2490_MDataSet ds = (FC_ACCT_2490_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	rx.add(dataSet, "xx_srch_dlco_clsf_cd", ds.xx_srch_dlco_clsf_cd);
	rx.add(dataSet, "xx_g_tag", ds.xx_g_tag);

	try {
		/****** MEDI_CD BEGIN */
		recordSet = rx.add(dataSet, "MEDI_CD", "");

		for(int i = 0; i < ds.medi_cd.size(); i++) {
			FC_ACCT_2490_MMEDI_CDRecord rec = (FC_ACCT_2490_MMEDI_CDRecord)ds.medi_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd_nm", rec.cd_nm);
			//rx.add(record, "cd", rec.cd);
			rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.medi_cd.size());
		/****** MEDI_CD END */

		/****** DEPT_BUDG_CD BEGIN */
		recordSet = rx.add(dataSet, "DEPT_BUDG_CD", "");

		for(int i = 0; i < ds.dept_budg_cd.size(); i++) {
			FC_ACCT_2490_MDEPT_BUDG_CDRecord rec = (FC_ACCT_2490_MDEPT_BUDG_CDRecord)ds.dept_budg_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd_nm", rec.cd_nm);
			//rx.add(record, "cd", rec.cd);
			rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.dept_budg_cd.size());
		/****** DEPT_BUDG_CD END */

		/****** DLCO_CLSF_CD BEGIN */
		recordSet = rx.add(dataSet, "DLCO_CLSF_CD", "");

		for(int i = 0; i < ds.dlco_clsf_cd.size(); i++) {
			FC_ACCT_2490_MDLCO_CLSF_CDRecord rec = (FC_ACCT_2490_MDLCO_CLSF_CDRecord)ds.dlco_clsf_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd_nm", rec.cd_nm);
			//rx.add(record, "cd", rec.cd);
			rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.dlco_clsf_cd.size());
		/****** DLCO_CLSF_CD END */

		/****** SLIP_CLSF_CD BEGIN */
		recordSet = rx.add(dataSet, "SLIP_CLSF_CD", "");

		for(int i = 0; i < ds.slip_clsf_cd.size(); i++) {
			FC_ACCT_2490_MSLIP_CLSF_CDRecord rec = (FC_ACCT_2490_MSLIP_CLSF_CDRecord)ds.slip_clsf_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd_nm", rec.cd_nm);
			//rx.add(record, "cd", rec.cd);
			rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.slip_clsf_cd.size());
		/****** SLIP_CLSF_CD END */

		/****** DEPT_CD BEGIN */
		recordSet = rx.add(dataSet, "DEPT_CD", "");

		for(int i = 0; i < ds.dept_cd.size(); i++) {
			FC_ACCT_2490_MDEPT_CDRecord rec = (FC_ACCT_2490_MDEPT_CDRecord)ds.dept_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd_nm", rec.cd_nm);
			//rx.add(record, "cd", rec.cd);
			rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.dept_cd.size());
		/****** DEPT_CD END */

		/****** MANG_CLSF_CD BEGIN */
		recordSet = rx.add(dataSet, "MANG_CLSF_CD", "");

		for(int i = 0; i < ds.mang_clsf_cd.size(); i++) {
			FC_ACCT_2490_MMANG_CLSF_CDRecord rec = (FC_ACCT_2490_MMANG_CLSF_CDRecord)ds.mang_clsf_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd_nm", rec.cd_nm);
			//rx.add(record, "cd", rec.cd);
			rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.mang_clsf_cd.size());
		/****** MANG_CLSF_CD END */

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
<fc_acct_2490_m>
	<dataSet>
		<MEDI_CD>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</MEDI_CD>
	</dataSet>
</fc_acct_2490_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2490_m>
	<dataSet>
		<DEPT_BUDG_CD>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</DEPT_BUDG_CD>
	</dataSet>
</fc_acct_2490_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2490_m>
	<dataSet>
		<DLCO_CLSF_CD>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</DLCO_CLSF_CD>
	</dataSet>
</fc_acct_2490_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2490_m>
	<dataSet>
		<SLIP_CLSF_CD>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</SLIP_CLSF_CD>
	</dataSet>
</fc_acct_2490_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2490_m>
	<dataSet>
		<DEPT_CD>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</DEPT_CD>
	</dataSet>
</fc_acct_2490_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2490_m>
	<dataSet>
		<MANG_CLSF_CD>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</MANG_CLSF_CD>
	</dataSet>
</fc_acct_2490_m>
*/
%>

<% /* 작성시간 : Wed Apr 08 19:54:27 KST 2009 */ %>