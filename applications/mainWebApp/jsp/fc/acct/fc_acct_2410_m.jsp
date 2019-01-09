<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
    ,   chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2410_MDataSet ds = (FC_ACCT_2410_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	rx.add(dataSet, "xx_srch_dlco_clsf_cd", ds.xx_srch_dlco_clsf_cd);
	
	rx.add(dataSet, "xx_job_clsf_02", ds.xx_job_clsf_02);
	rx.add(dataSet, "xx_cd_clsf_030", ds.xx_cd_clsf_030);
	
	rx.add(dataSet, "xx_g_tag", ds.xx_g_tag);
	rx.add(dataSet, "xx_g_tag2", ds.xx_g_tag2);
	
	rx.add(dataSet, "xx_srch_acct_cd", ds.xx_srch_acct_cd);

	try {
		/****** MEDI_CD BEGIN */
		recordSet = rx.add(dataSet, "MEDI_CD", "");

		for(int i = 0; i < ds.medi_cd.size(); i++) {
			FC_ACCT_2410_MMEDI_CDRecord rec = (FC_ACCT_2410_MMEDI_CDRecord)ds.medi_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.addCData(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.medi_cd.size());
		/****** MEDI_CD END */

		/****** SLIP_CLSF_CD BEGIN */
		recordSet = rx.add(dataSet, "SLIP_CLSF_CD", "");

		for(int i = 0; i < ds.slip_clsf_cd.size(); i++) {
			FC_ACCT_2410_MSLIP_CLSF_CDRecord rec = (FC_ACCT_2410_MSLIP_CLSF_CDRecord)ds.slip_clsf_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.addCData(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.slip_clsf_cd.size());
		/****** SLIP_CLSF_CD END */

		/****** MANG_CLSF_CD BEGIN */
		recordSet = rx.add(dataSet, "MANG_CLSF_CD", "");

		for(int i = 0; i < ds.mang_clsf_cd.size(); i++) {
			FC_ACCT_2410_MMANG_CLSF_CDRecord rec = (FC_ACCT_2410_MMANG_CLSF_CDRecord)ds.mang_clsf_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.addCData(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.mang_clsf_cd.size());
		/****** MANG_CLSF_CD END */
		
		/****** CHNL_CLSF_CD_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CHNL_CLSF_CD_CURLIST", "");

		for(int i = 0; i < ds.chnl_clsf_cd_curlist.size(); i++) {
			FC_ACCT_2410_MCHNL_CLSF_CD_CURLISTRecord rec = (FC_ACCT_2410_MCHNL_CLSF_CD_CURLISTRecord)ds.chnl_clsf_cd_curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.addCData(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
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
<dataSet>
	<MEDI_CD>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</MEDI_CD>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<SLIP_CLSF_CD>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</SLIP_CLSF_CD>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<MANG_CLSF_CD>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</MANG_CLSF_CD>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Feb 20 11:22:15 KST 2009 */ %>