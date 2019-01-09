<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.common.rec.*
	,	chosun.ciis.ad.common.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_CO_1200_LDataSet ds = (AD_CO_1200_LDataSet)request.getAttribute("ds");
	int root 		= RwXml.rootNodeID;

	int gridData = rx.add(root, "gridData", "");

	try {
		/****** CURLIST BEGIN */

		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_CO_1200_LCURLISTRecord rec = (AD_CO_1200_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "presi_nm", rec.presi_nm);
			rx.add(record, "eps_clsf_cd", rec.eps_clsf_cd);
			rx.addCData(record, "addr", rec.addr);
			rx.add(record, "chg_dt", rec.chg_dt);
			rx.add(record, "del_yn", rec.del_yn);
			rx.add(record, "dlco_clsf", rec.dlco_clsf);
		}
		/****** CURLIST END */

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<dlco_no/>
			<dlco_nm/>
			<ern/>
			<presi_nm/>
			<eps_clsf_cd/>
			<addr/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Jan 14 16:24:43 KST 2009 */ %>