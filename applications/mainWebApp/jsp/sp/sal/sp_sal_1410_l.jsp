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
	SP_SAL_1410_LDataSet ds = (SP_SAL_1410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			SP_SAL_1410_LCURLIST1Record rec = (SP_SAL_1410_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "seq", rec.seq);
			rx.add(record, "sale_yymm", rec.sale_yymm);
			rx.add(record, "sale_seq", rec.sale_seq);
			rx.add(record, "sale_item_cd", rec.sale_item_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "qty", rec.qty);
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "amt", rec.amt);
		}
		/****** CURLIST1 END */

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
<sp_sal_1410_l>
	<dataSet>
		<CURLIST1>
			<record>
				<seq/>
				<sale_yymm/>
				<sale_seq/>
				<sale_item_cd/>
				<medi_nm/>
				<dlco_nm/>
				<qty/>
				<uprc/>
				<amt/>
			</record>
		</CURLIST1>
	</dataSet>
</sp_sal_1410_l>
*/
%>

<% /* 작성시간 : Wed Jul 11 21:11:39 KST 2012 */ %>