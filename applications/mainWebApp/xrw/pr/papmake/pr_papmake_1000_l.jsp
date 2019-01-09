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
	PR_PAPMAKE_1000_LDataSet ds = (PR_PAPMAKE_1000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	recordSet = rx.add(root, "gridData", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PAPMAKE_1000_LCURLISTRecord rec = (PR_PAPMAKE_1000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "duty_dt", rec.duty_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "make_yn", rec.make_yn);
			rx.add(record, "matt_yn", rec.matt_yn);
			rx.add(record, "tmhm_yn", rec.tmhm_yn);
			rx.add(record, "matr_yn", rec.matr_yn);
			rx.add(record, "plp_yn", "Y");
			rx.add(record, "clos_clsf", rec.clos_clsf);
			rx.add(record, "clos_clsf_nm", rec.clos_clsf_nm);
		}
		/****** CURLIST END */

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
	<CURLIST>
		<record>
			<cmpy_cd/>
			<duty_dt/>
			<fac_clsf/>
			<wk_duty_nops/>
			<ngt_duty_nops/>
			<dtfree_nops/>
			<vaca_nops/>
			<dspch_nops/>
			<night_shift_liab_pers/>
			<mchn_1_duty_pers/>
			<mchn_2_duty_pers/>
			<mchn_3_duty_pers/>
			<mchn_4_duty_pers/>
			<mchn_duty_pers/>
			<befo_duty_pers/>
			<prt_board_duty_pers/>
			<send_duty_pers/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Apr 09 14:51:37 KST 2009 */ %>