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
	FC_FUNC_8040_MDataSet ds = (FC_FUNC_8040_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_leas_stat_cd", ds.getXx_leas_stat_cd());
		rx.add(dataSet, "xx_acct_cd_010", ds.getXx_acct_cd_010());
		rx.add(dataSet, "xx_leas_clsf_cd", ds.getXx_leas_clsf_cd());
		rx.add(dataSet, "xx_prelae_pay_clsf_cd", ds.getXx_prelae_pay_clsf_cd());
		
		/****** XX_ACCT_CD_LIST BEGIN */
		recordSet = rx.add(dataSet, "XX_ACCT_CD_LIST", "");

		for(int i = 0; i < ds.xx_acct_cd_list.size(); i++) {
			FC_FUNC_8040_MXX_ACCT_CD_LISTRecord rec = (FC_FUNC_8040_MXX_ACCT_CD_LISTRecord)ds.xx_acct_cd_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "acct_abrv_nm", rec.acct_abrv_nm);
			rx.add(record, "acct_cd", rec.acct_cd);
			//rx.add(record, "acct_abrv_nm", StringUtil.replaceToXml(rec.acct_abrv_nm));
			//rx.add(record, "acct_cd", StringUtil.replaceToXml(rec.acct_cd));
		}
		rx.add(recordSet, "totalcnt", ds.xx_acct_cd_list.size());
		/****** XX_ACCT_CD_LIST END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_FUNC_8040_MCURLIST1Record rec = (FC_FUNC_8040_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<fc_func_8040_m>
	<dataSet>
		<CURLIST1>
			<record>
				<cd_abrv_nm/>
				<cd/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_func_8040_m>
*/
%>

<% /* 작성시간 : Thu Apr 09 15:11:08 KST 2009 */ %>