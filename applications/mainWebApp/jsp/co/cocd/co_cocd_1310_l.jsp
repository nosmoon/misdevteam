<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.cocd.rec.*
	,	chosun.ciis.co.cocd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_COCD_1310_LDataSet ds = (CO_COCD_1310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int curlist = rx.add(root, "curlist", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_COCD_1310_LCURLISTRecord rec = (CO_COCD_1310_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(curlist, "record", "");
			
			rx.add(record, "seq", i+1);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "pgm_id", rec.pgm_id);
			rx.add(record, "var_nm", rec.var_nm);
			rx.add(record, "var_val", rec.var_val);
			rx.addCData(record, "descri", rec.descri);
			rx.add(record, "menu_id", rec.menu_id);
			rx.add(record, "menu_nm", rec.menu_nm);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
		}
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
<co_cocd_1310_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<pgm_id/>
				<var_nm/>
				<var_val/>
				<descri/>
				<menu_id/>
				<menu_nm/>
				<chg_pers/>
				<chg_dt_tm/>
			</record>
		</CURLIST>
	</dataSet>
</co_cocd_1310_l>
*/
%>

<% /* 작성시간 : Mon Dec 26 15:42:55 KST 2011 */ %>