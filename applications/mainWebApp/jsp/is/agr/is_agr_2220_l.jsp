<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.agr.rec.*
	,	chosun.ciis.is.agr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_AGR_2220_LDataSet ds = (IS_AGR_2220_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData2 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_AGR_2220_LCURLISTRecord rec = (IS_AGR_2220_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "suply_amt", rec.suply_amt);
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
<is_agr_2220_l>
	<dataSet>
		<CURLIST>
			<record>
				<chrg_pers/>
				<dlco_nm/>
				<suply_amt/>
			</record>
		</CURLIST>
	</dataSet>
</is_agr_2220_l>
*/
%>

<% /* 작성시간 : Fri May 25 10:45:08 KST 2012 */ %>