<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_7030_MDataSet ds = (FC_FUNC_7030_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_loan_repay_clsf_cd", ds.getXx_loan_repay_clsf_cd());
		
		/****** XX_BUDG_CD_LIST BEGIN */
		recordSet = rx.add(dataSet, "XX_BUDG_CD_LIST", "");

		for(int i = 0; i < ds.xx_budg_cd_list.size(); i++) {
			FC_FUNC_7030_MXX_BUDG_CD_LISTRecord rec = (FC_FUNC_7030_MXX_BUDG_CD_LISTRecord)ds.xx_budg_cd_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_abrv_nm", rec.budg_abrv_nm);
			rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "budg_abrv_nm", StringUtil.replaceToXml(rec.budg_abrv_nm));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
		}
		rx.add(recordSet, "totalcnt", ds.xx_budg_cd_list.size());
		/****** XX_BUDG_CD_LIST END */
		
		/****** CURLOANLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLOANLIST", "");

		for(int i = 0; i < ds.curloanlist.size(); i++) {
			FC_FUNC_7030_MCURLOANLISTRecord rec = (FC_FUNC_7030_MCURLOANLISTRecord)ds.curloanlist.get(i);
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
		rx.add(recordSet, "totalcnt", ds.curloanlist.size());
		/****** CURLOANLIST END */

		/****** CURDEPSLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURDEPSLIST2", "");

		for(int i = 0; i < ds.curdepslist2.size(); i++) {
			FC_FUNC_7030_MCURDEPSLIST2Record rec = (FC_FUNC_7030_MCURDEPSLIST2Record)ds.curdepslist2.get(i);
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
		rx.add(recordSet, "totalcnt", ds.curdepslist2.size());
		/****** CURDEPSLIST2 END */

		/****** CURDEPSLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURDEPSLIST1", "");

		for(int i = 0; i < ds.curdepslist1.size(); i++) {
			FC_FUNC_7030_MCURDEPSLIST1Record rec = (FC_FUNC_7030_MCURDEPSLIST1Record)ds.curdepslist1.get(i);
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
		rx.add(recordSet, "totalcnt", ds.curdepslist1.size());
		/****** CURDEPSLIST1 END */

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
<fc_func_7030_m>
	<dataSet>
		<CURLOANLIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLOANLIST>
	</dataSet>
</fc_func_7030_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_func_7030_m>
	<dataSet>
		<CURDEPSLIST2>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURDEPSLIST2>
	</dataSet>
</fc_func_7030_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_func_7030_m>
	<dataSet>
		<CURDEPSLIST1>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURDEPSLIST1>
	</dataSet>
</fc_func_7030_m>
*/
%>

<% /* 작성시간 : Tue Apr 07 16:01:24 KST 2009 */ %>