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
	FC_FUNC_1030_MDataSet ds = (FC_FUNC_1030_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");
	
	rx.add(dataSet, "xx_dlco_clsf_cd", ds.getXx_dlco_clsf_cd());
	
	try {
		/****** DLCOCLSFCDLIST BEGIN */
		recordSet = rx.add(dataSet, "DLCOCLSFCDLIST", "");

		for(int i = 0; i < ds.dlcoclsfcdlist.size(); i++) {
			FC_FUNC_1030_MDLCOCLSFCDLISTRecord rec = (FC_FUNC_1030_MDLCOCLSFCDLISTRecord)ds.dlcoclsfcdlist.get(i);
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
			FC_FUNC_1030_MDEPSCLSFLISTRecord rec = (FC_FUNC_1030_MDEPSCLSFLISTRecord)ds.depsclsflist.get(i);
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
			FC_FUNC_1030_MXX_CDRecord rec = (FC_FUNC_1030_MXX_CDRecord)ds.xx_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.xx_cd.size());
		/****** XX_CD END */

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
TrustForm�� Instance ����ο� �����ؼ� ���
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
TrustForm�� Instance ����ο� �����ؼ� ���
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

<% /* �ۼ��ð� : Fri Feb 13 20:08:14 KST 2009 */ %>