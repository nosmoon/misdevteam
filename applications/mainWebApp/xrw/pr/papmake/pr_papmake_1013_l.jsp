<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.papmake.rec.*
	,	chosun.ciis.pr.papmake.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PAPMAKE_1013_LDataSet ds = (PR_PAPMAKE_1013_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int record = 0;
	record = rx.add(root, "tempData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PAPMAKE_1013_LCURLISTRecord rec = (PR_PAPMAKE_1013_LCURLISTRecord)ds.curlist.get(i);
			//int record = rx.add(formData, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "duty_dt", rec.duty_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "wk_duty_nops", rec.wk_duty_nops);
			rx.add(record, "ngt_duty_nops", rec.ngt_duty_nops);
			rx.add(record, "dtfree_nops", rec.dtfree_nops);
			rx.add(record, "vaca_nops", rec.vaca_nops);
			rx.add(record, "dspch_nops", rec.dspch_nops);
			rx.add(record, "etc_nops", rec.etc_nops);
			rx.add(record, "night_shift_liab_pers", rec.night_shift_liab_pers);
			rx.add(record, "mchn_1_duty_pers", rec.mchn_1_duty_pers);
			rx.add(record, "mchn_2_duty_pers", rec.mchn_2_duty_pers);
			rx.add(record, "mchn_3_duty_pers", rec.mchn_3_duty_pers);
			rx.add(record, "mchn_4_duty_pers", rec.mchn_4_duty_pers);
			rx.add(record, "mchn_duty_pers", rec.mchn_duty_pers);
			rx.add(record, "befo_duty_pers", rec.befo_duty_pers);
			rx.add(record, "prt_board_duty_pers", rec.prt_board_duty_pers);
			rx.add(record, "send_duty_pers", rec.send_duty_pers);
			rx.add(record, "etc_duty_pers", rec.etc_duty_pers);
			rx.add(record, "clos_clsf", rec.clos_clsf);
			rx.add(record, "remk", rec.remk);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist.size());
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
			<cmpy_cd/>
			<duty_dt/>
			<fac_clsf/>
			<wk_duty_nops/>
			<mgt_duty_nops/>
			<dtfree_nops/>
			<vaca_nops/>
			<dspch_nops/>
			<etc_nops/>
			<night_shift_liab_pers/>
			<mchn_1_duty_pers/>
			<mchn_2_duty_pers/>
			<mchn_3_duty_pers/>
			<mchn_4_duty_pers/>
			<mchn_duty_pers/>
			<befo_duty_pers/>
			<prt_board_duty_pers/>
			<send_duty_pers/>
			<etc_duty_pers/>
			<clos_clsf/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Jun 17 17:14:58 KST 2009 */ %>