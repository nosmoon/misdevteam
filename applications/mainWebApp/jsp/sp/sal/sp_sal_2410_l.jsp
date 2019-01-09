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
	SP_SAL_2410_LDataSet ds = (SP_SAL_2410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			SP_SAL_2410_LCURLIST1Record rec = (SP_SAL_2410_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "bo_cd", rec.bo_cd);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "req_amt", rec.req_amt);
			rx.add(record, "dduc_posb_amt", rec.dduc_posb_amt);
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
<sp_sal_2410_l>
	<dataSet>
		<CURLIST1>
			<record>
				<bo_cd/>
				<area_nm/>
				<bo_nm/>
				<amt/>
				<req_amt/>
				<dduc_posb_amt/>
			</record>
		</CURLIST1>
	</dataSet>
</sp_sal_2410_l>
*/
%>

<% /* 작성시간 : Wed Jul 18 14:34:59 KST 2012 */ %>