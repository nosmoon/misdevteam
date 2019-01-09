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
	FC_FUNC_6120_MDataSet ds = (FC_FUNC_6120_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_use_dept_cd", ds.getXx_use_dept_cd());
		rx.add(dataSet, "xx_deps_isav_stat_cd_010", ds.getXx_deps_isav_stat_cd_010());
		
		/****** CUR_CBOYJGBCD BEGIN */
		recordSet = rx.add(dataSet, "CUR_CBOYJGBCD", "");

		for(int i = 0; i < ds.cur_cboyjgbcd.size(); i++) {
			FC_FUNC_6120_MCUR_CBOYJGBCDRecord rec = (FC_FUNC_6120_MCUR_CBOYJGBCDRecord)ds.cur_cboyjgbcd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.cur_cboyjgbcd.size());
		/****** CUR_CBOYJGBCD END */

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
	<CUR_CBOYJGBCD>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CUR_CBOYJGBCD>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Mar 11 14:14:38 KST 2009 */ %>