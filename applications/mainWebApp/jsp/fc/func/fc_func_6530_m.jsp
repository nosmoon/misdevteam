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
	FC_FUNC_6530_MDataSet ds = (FC_FUNC_6530_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_deps_isav_stat_cd", ds.getXx_deps_isav_stat_cd());
		
		/****** DEPS_ISAV_CLSF_CD BEGIN */
		recordSet = rx.add(dataSet, "DEPS_ISAV_CLSF_CD", "");

		for(int i = 0; i < ds.deps_isav_clsf_cd.size(); i++) {
			FC_FUNC_6530_MDEPS_ISAV_CLSF_CDRecord rec = (FC_FUNC_6530_MDEPS_ISAV_CLSF_CDRecord)ds.deps_isav_clsf_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.deps_isav_clsf_cd.size());
		/****** DEPS_ISAV_CLSF_CD END */

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
	<DEPS_ISAV_CLSF_CD>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</DEPS_ISAV_CLSF_CD>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 17 15:47:29 KST 2009 */ %>