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
	FC_FUNC_1060_MDataSet ds = (FC_FUNC_1060_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");
	rx.add(dataSet, "xx_incm_clsf_cd_010", ds.getXx_incm_clsf_cd_010());
	rx.add(dataSet, "xx_incm_clsf_cd_020", ds.getXx_incm_clsf_cd_020());
	rx.add(dataSet, "xx_incm_clsf_cd_030", ds.getXx_incm_clsf_cd_030());
	rx.add(dataSet, "xx_incm_clsf_cd_040", ds.getXx_incm_clsf_cd_040());
	rx.add(dataSet, "xx_incm_clsf_cd_050", ds.getXx_incm_clsf_cd_050());
	rx.add(dataSet, "xx_occr_acct_cd_010", ds.getXx_occr_acct_cd_010());
	rx.add(dataSet, "xx_occr_acct_cd_020", ds.getXx_occr_acct_cd_020());
	System.out.println(ds.getXx_occr_acct_cd_010());
	System.out.println(ds.getXx_occr_acct_cd_020());

	try {
		/****** CURDLCO_CLSF_CD BEGIN */
		recordSet = rx.add(dataSet, "CURDLCO_CLSF_CD", "");

		for(int i = 0; i < ds.curdlco_clsf_cd.size(); i++) {
			FC_FUNC_1060_MCURDLCO_CLSF_CDRecord rec = (FC_FUNC_1060_MCURDLCO_CLSF_CDRecord)ds.curdlco_clsf_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.curdlco_clsf_cd.size());
		/****** CURDLCO_CLSF_CD END */

		/****** INCM_CLSF_CD BEGIN */
		recordSet = rx.add(dataSet, "INCM_CLSF_CD", "");

		for(int i = 0; i < ds.incm_clsf_cd.size(); i++) {
			FC_FUNC_1060_MINCM_CLSF_CDRecord rec = (FC_FUNC_1060_MINCM_CLSF_CDRecord)ds.incm_clsf_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.incm_clsf_cd.size());
		/****** INCM_CLSF_CD END */

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
			<cd_nm/>
			<cd/>
		</record>
	</CURDLCO_CLSF_CD>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<INCM_CLSF_CD>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</INCM_CLSF_CD>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Feb 16 12:41:20 KST 2009 */ %>