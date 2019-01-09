<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sal.rec.*
	,	chosun.ciis.sp.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SAL_2720_LDataSet ds = (SP_SAL_2720_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData2 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			SP_SAL_2720_LCURLISTRecord rec = (SP_SAL_2720_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "adms_dstc_cd_nm", rec.adms_dstc_cd_nm);
			rx.add(record, "stot_amt", rec.stot_amt);
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
<sp_sal_2720_l>
	<dataSet>
		<CURLIST>
			<record>
				<dlco_nm/>
				<adms_dstc_cd_nm/>
				<stot_amt/>
			</record>
		</CURLIST>
	</dataSet>
</sp_sal_2720_l>
*/
%>

<% /* 작성시간 : Mon Jul 23 10:27:18 KST 2012 */ %>