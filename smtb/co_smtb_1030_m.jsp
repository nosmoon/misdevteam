<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.smtb.rec.*
	,	chosun.ciis.co.smtb.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_SMTB_1030_MDataSet ds = (CO_SMTB_1030_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** SMTB_STAT_CD_LIST BEGIN */
		recordSet = rx.add(dataSet, "SMTB_STAT_CD_LIST", "");

		for(int i = 0; i < ds.smtb_stat_cd_list.size(); i++) {
			CO_SMTB_1030_MSMTB_STAT_CD_LISTRecord rec = (CO_SMTB_1030_MSMTB_STAT_CD_LISTRecord)ds.smtb_stat_cd_list.get(i);
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
		rx.add(recordSet, "totalcnt", ds.smtb_stat_cd_list.size());
		/****** SMTB_STAT_CD_LIST END */

		/****** ERPLACE_CD_LIST BEGIN */
		recordSet = rx.add(dataSet, "ERPLACE_CD_LIST", "");

		for(int i = 0; i < ds.erplace_cd_list.size(); i++) {
			CO_SMTB_1030_MERPLACE_CD_LISTRecord rec = (CO_SMTB_1030_MERPLACE_CD_LISTRecord)ds.erplace_cd_list.get(i);
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
		rx.add(recordSet, "totalcnt", ds.erplace_cd_list.size());
		/****** ERPLACE_CD_LIST END */

		/****** DLCO_CLSF_CD_LIST BEGIN */
		recordSet = rx.add(dataSet, "DLCO_CLSF_CD_LIST", "");

		for(int i = 0; i < ds.dlco_clsf_cd_list.size(); i++) {
			CO_SMTB_1030_MDLCO_CLSF_CD_LISTRecord rec = (CO_SMTB_1030_MDLCO_CLSF_CD_LISTRecord)ds.dlco_clsf_cd_list.get(i);
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
		rx.add(recordSet, "totalcnt", ds.dlco_clsf_cd_list.size());
		/****** DLCO_CLSF_CD_LIST END */

		/****** SLIP_CLSF_LIST BEGIN */
		recordSet = rx.add(dataSet, "SLIP_CLSF_LIST", "");

		for(int i = 0; i < ds.slip_clsf_list.size(); i++) {
			CO_SMTB_1030_MSLIP_CLSF_LISTRecord rec = (CO_SMTB_1030_MSLIP_CLSF_LISTRecord)ds.slip_clsf_list.get(i);
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
		rx.add(recordSet, "totalcnt", ds.slip_clsf_list.size());
		/****** SLIP_CLSF_LIST END */

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
<co_smtb_1030_m>
	<dataSet>
		<SMTB_STAT_CD_LIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</SMTB_STAT_CD_LIST>
	</dataSet>
</co_smtb_1030_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<co_smtb_1030_m>
	<dataSet>
		<ERPLACE_CD_LIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</ERPLACE_CD_LIST>
	</dataSet>
</co_smtb_1030_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<co_smtb_1030_m>
	<dataSet>
		<DLCO_CLSF_CD_LIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</DLCO_CLSF_CD_LIST>
	</dataSet>
</co_smtb_1030_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<co_smtb_1030_m>
	<dataSet>
		<SLIP_CLSF_LIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</SLIP_CLSF_LIST>
	</dataSet>
</co_smtb_1030_m>
*/
%>

<% /* 작성시간 : Fri Mar 19 15:28:11 KST 2010 */ %>