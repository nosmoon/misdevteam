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
	FC_FUNC_1050_MDataSet ds = (FC_FUNC_1050_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");
	rx.add(dataSet, "xx_now_note_stat_cd", ds.getXx_now_note_stat_cd());
	rx.add(dataSet, "xx_note_clsf_cd", ds.getXx_note_clsf_cd());
	rx.add(dataSet, "xx_stat_cd", ds.getXx_stat_cd());
	rx.add(dataSet, "xx_mang_cd_4", ds.getXx_mang_cd_4());

	try {
		/****** DEPS_CLSF_CD2 BEGIN */
		recordSet = rx.add(dataSet, "DEPS_CLSF_CD2", "");

		for(int i = 0; i < ds.deps_clsf_cd2.size(); i++) {
			FC_FUNC_1050_MDEPS_CLSF_CD2Record rec = (FC_FUNC_1050_MDEPS_CLSF_CD2Record)ds.deps_clsf_cd2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.deps_clsf_cd2.size());
		/****** DEPS_CLSF_CD2 END */

		/****** DEPS_CLSF_CD1 BEGIN */
		recordSet = rx.add(dataSet, "DEPS_CLSF_CD1", "");

		for(int i = 0; i < ds.deps_clsf_cd1.size(); i++) {
			FC_FUNC_1050_MDEPS_CLSF_CD1Record rec = (FC_FUNC_1050_MDEPS_CLSF_CD1Record)ds.deps_clsf_cd1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.deps_clsf_cd1.size());
		/****** DEPS_CLSF_CD1 END */

		/****** FREX_CD BEGIN */
		recordSet = rx.add(dataSet, "FREX_CD", "");

		for(int i = 0; i < ds.frex_cd.size(); i++) {
			FC_FUNC_1050_MFREX_CDRecord rec = (FC_FUNC_1050_MFREX_CDRecord)ds.frex_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.frex_cd.size());
		/****** FREX_CD END */

		/****** CURDLCO_CLSF_CD BEGIN */
		recordSet = rx.add(dataSet, "CURDLCO_CLSF_CD", "");

		for(int i = 0; i < ds.curdlco_clsf_cd.size(); i++) {
			FC_FUNC_1050_MCURDLCO_CLSF_CDRecord rec = (FC_FUNC_1050_MCURDLCO_CLSF_CDRecord)ds.curdlco_clsf_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
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
	<DEPS_CLSF_CD2>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</DEPS_CLSF_CD2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<DEPS_CLSF_CD1>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</DEPS_CLSF_CD1>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<FREX_CD>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</FREX_CD>
</dataSet>
*/
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

<% /* 작성시간 : Thu Feb 12 14:35:25 KST 2009 */ %>