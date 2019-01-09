<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.etcpc.rec.*
	,	chosun.ciis.mt.etcpc.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCPC_2200_LDataSet ds = (MT_ETCPC_2200_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
    int rowCnt = 1;
	try {
		/****** CURLIST1 BEGIN */
        recordSet = rx.add(dataSet, "hw1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_ETCPC_2200_LCURLIST1Record rec = (MT_ETCPC_2200_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rowCnt", rowCnt);
			rx.add(record, "addm_clsf", rec.addm_clsf);
			rx.add(record, "cmps_item_clsf", rec.cmps_item_clsf);
			rx.add(record, "cmps_item_brand", rec.cmps_item_brand);
			rx.add(record, "cmps_item_spec", rec.cmps_item_spec);
			rx.add(record, "estb_dt", rec.estb_dt);
//	        rx.add(record, "mchn_mang_no_g", rec.mchn_mang_no);
//			rx.add(record, "incmg_pers_ipaddr", rec.incmg_pers_ipaddr);
//			rx.add(record, "incmg_pers", rec.incmg_pers);
//			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
 //   		rx.add(record, "chg_pers", rec.chg_pers);
//			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
			rx.add(record, "seq", rec.seq);
//			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rowCnt++;
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
	<CURLIST1>
		<record>
			<cmpy_cd/>
			<mchn_mang_no/>
			<seq/>
			<addm_clsf/>
			<cmps_item_clsf/>
			<cmps_item_brand/>
			<cmps_item_spec/>
			<estb_dt/>
			<incmg_pers_ipaddr/>
			<incmg_pers/>
			<incmg_dt_tmchg_pers/>
			<chg_dt_tm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 24 15:04:52 KST 2009 */ %>