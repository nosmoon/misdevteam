<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2130_MDataSet ds = (FC_ACCT_2130_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	rx.add(dataSet, "xx_slip_clsf_cd", ds.xx_slip_clsf_cd);
	rx.add(dataSet, "xx_prof_type_cd_010", ds.xx_prof_type_cd_010);
	rx.add(dataSet, "xx_prof_type_cd_020", ds.xx_prof_type_cd_020);
	rx.add(dataSet, "xx_prof_type_cd_030", ds.xx_prof_type_cd_030);
	rx.add(dataSet, "xx_prof_type_cd_040", ds.xx_prof_type_cd_040);
	rx.add(dataSet, "xx_prof_type_cd_050", ds.xx_prof_type_cd_050);
	rx.add(dataSet, "xx_prof_type_cd_060", ds.xx_prof_type_cd_060);
	rx.add(dataSet, "xx_budg_cd_010", ds.xx_budg_cd_010);
	rx.add(dataSet, "xx_budg_cd_020", ds.xx_budg_cd_020);
	rx.add(dataSet, "xx_budg_cd_030", ds.xx_budg_cd_030);
	rx.add(dataSet, "xx_budg_cd_040", ds.xx_budg_cd_040);
	rx.add(dataSet, "xx_budg_cd_050", ds.xx_budg_cd_050);
	
	try {
		/****** CURMEDI_CD BEGIN */
		recordSet = rx.add(dataSet, "CURMEDI_CD", "");

		for(int i = 0; i < ds.curmedi_cd.size(); i++) {
			FC_ACCT_2130_MCURMEDI_CDRecord rec = (FC_ACCT_2130_MCURMEDI_CDRecord)ds.curmedi_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.addCData(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curmedi_cd.size());
		/****** CURMEDI_CD END */

		/****** CURSLIP_CLSF BEGIN */
		recordSet = rx.add(dataSet, "CURSLIP_CLSF", "");

		for(int i = 0; i < ds.curslip_clsf.size(); i++) {
			FC_ACCT_2130_MCURSLIP_CLSFRecord rec = (FC_ACCT_2130_MCURSLIP_CLSFRecord)ds.curslip_clsf.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.addCData(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curslip_clsf.size());
		/****** CURSLIP_CLSF END */

		/****** CURPROF_CD BEGIN */
		recordSet = rx.add(dataSet, "CURPROF_CD", "");

		for(int i = 0; i < ds.curprof_cd.size(); i++) {
			FC_ACCT_2130_MCURPROF_CDRecord rec = (FC_ACCT_2130_MCURPROF_CDRecord)ds.curprof_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.addCData(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curprof_cd.size());
		/****** CURPROF_CD END */

		/****** CURERPALCED_CD BEGIN */
		recordSet = rx.add(dataSet, "CURERPALCED_CD", "");

		for(int i = 0; i < ds.curerpalced_cd.size(); i++) {
			FC_ACCT_2130_MCURERPALCED_CDRecord rec = (FC_ACCT_2130_MCURERPALCED_CDRecord)ds.curerpalced_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.addCData(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curerpalced_cd.size());
		/****** CURERPALCED_CD END */

		/****** CURDLCO_CLSF_CD BEGIN */
		recordSet = rx.add(dataSet, "CURDLCO_CLSF_CD", "");

		for(int i = 0; i < ds.curdlco_clsf_cd.size(); i++) {
			FC_ACCT_2130_MCURDLCO_CLSF_CDRecord rec = (FC_ACCT_2130_MCURDLCO_CLSF_CDRecord)ds.curdlco_clsf_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.addCData(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curdlco_clsf_cd.size());
		/****** CURDLCO_CLSF_CD END */

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
	<CURMEDI_CD>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURMEDI_CD>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURSLIP_CLSF>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURSLIP_CLSF>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
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
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
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
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
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
*/
%>

<% /* 작성시간 : Thu Mar 26 14:12:41 KST 2009 */ %>