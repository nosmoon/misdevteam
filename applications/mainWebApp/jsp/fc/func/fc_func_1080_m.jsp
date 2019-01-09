<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_1080_MDataSet ds = (FC_FUNC_1080_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	String mtry_cnt = ds.mtry_cnt;
	dataSet = rx.add(root, "dataSet", "");
	
	rx.add(dataSet, "xx_dlco_clsf_cd", ds.getXx_dlco_clsf_cd());
	rx.add(dataSet, "xx_now_note_stat_cd_020", ds.getXx_now_note_stat_cd_020());
	rx.add(dataSet, "xx_mang_cd_4", ds.getXx_mang_cd_4());
	
	try {
		/****** DLCOCLSFCDLIST BEGIN */
		recordSet = rx.add(dataSet, "DLCOCLSFCDLIST", "");

		for(int i = 0; i < ds.dlcoclsfcdlist.size(); i++) {
			FC_FUNC_1080_MDLCOCLSFCDLISTRecord rec = (FC_FUNC_1080_MDLCOCLSFCDLISTRecord)ds.dlcoclsfcdlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.dlcoclsfcdlist.size());
		/****** DLCOCLSFCDLIST END */

		/****** DEPSCLSFLIST BEGIN */
		recordSet = rx.add(dataSet, "DEPSCLSFLIST", "");

		for(int i = 0; i < ds.depsclsflist.size(); i++) {
			FC_FUNC_1080_MDEPSCLSFLISTRecord rec = (FC_FUNC_1080_MDEPSCLSFLISTRecord)ds.depsclsflist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.depsclsflist.size());
		/****** DEPSCLSFLIST END */
		
		/****** XX_CD BEGIN */
		recordSet = rx.add(dataSet, "XX_CD", "");
		for(int i = 0; i < ds.xx_cd.size(); i++) {
			FC_FUNC_1080_MXX_CDRecord rec = (FC_FUNC_1080_MXX_CDRecord)ds.xx_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.xx_cd.size());
		/****** XX_CD END */
		
		/****** CHNL_CLSF_LIST BEGIN */
		recordSet = rx.add(dataSet, "CHNL_CLSF_LIST", "");

		for(int i = 0; i < ds.chnl_clsf_list.size(); i++) {
			FC_FUNC_1080_MCHNL_CLSF_LISTRecord rec = (FC_FUNC_1080_MCHNL_CLSF_LISTRecord)ds.chnl_clsf_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.chnl_clsf_list.size());
		/****** CHNL_CLSF_LIST END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		rx.add(dataSet, "mtry_cnt", mtry_cnt);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<DLCOCLSFCDLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</DLCOCLSFCDLIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<DEPSCLSFLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</DEPSCLSFLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Feb 13 20:08:14 KST 2009 */ %>