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
	FC_FUNC_4010_MDataSet ds = (FC_FUNC_4010_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** XX_ISSU_CLSF_CD_LIST BEGIN */
		recordSet = rx.add(dataSet, "XX_ISSU_CLSF_CD_LIST", "");

		for(int i = 0; i < ds.xx_issu_clsf_cd_list.size(); i++) {
			FC_FUNC_4010_MXX_ISSU_CLSF_CD_LISTRecord rec = (FC_FUNC_4010_MXX_ISSU_CLSF_CD_LISTRecord)ds.xx_issu_clsf_cd_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.xx_issu_clsf_cd_list.size());
		/****** XX_ISSU_CLSF_CD_LIST END */

		/****** XX_BUDG_CD_LIST BEGIN */
		recordSet = rx.add(dataSet, "XX_BUDG_CD_LIST", "");

		for(int i = 0; i < ds.xx_budg_cd_list.size(); i++) {
			FC_FUNC_4010_MXX_BUDG_CD_LISTRecord rec = (FC_FUNC_4010_MXX_BUDG_CD_LISTRecord)ds.xx_budg_cd_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_abrv_nm", rec.budg_abrv_nm);
			rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "budg_abrv_nm", StringUtil.replaceToXml(rec.budg_abrv_nm));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
		}
		rx.add(recordSet, "totalcnt", ds.xx_budg_cd_list.size());
		/****** XX_BUDG_CD_LIST END */
		
		System.out.println(ds.xx_issu_clsf_cd_list.size());
		System.out.println(ds.xx_budg_cd_list.size());

		/****** CURDLCO_CLSF_CD BEGIN */
		recordSet = rx.add(dataSet, "CURDLCO_CLSF_CD", "");

		for(int i = 0; i < ds.curdlco_clsf_cd.size(); i++) {
			FC_FUNC_4010_MCURDLCO_CLSF_CDRecord rec = (FC_FUNC_4010_MCURDLCO_CLSF_CDRecord)ds.curdlco_clsf_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
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

<% /* 작성시간 : Mon Mar 09 11:18:00 KST 2009 */ %>