<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.prnpap.rec.*
	,	chosun.ciis.mt.prnpap.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PRNPAP_2010_LDataSet ds = (MT_PRNPAP_2010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "gridData1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_PRNPAP_2010_LCURLIST1Record rec = (MT_PRNPAP_2010_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "real_matr_clsf", rec.real_matr_clsf);
			rx.add(record, "matr_clsf", rec.matr_clsf);
            rx.add(record, "unit","");
            rx.add(record, "qunt","");
            rx.add(record, "uprc","");
            rx.add(record, "amt" ,"");
            rx.add(record, "seq", "");
            rx.add(record, "sub_seq","");
            rx.add(record, "occr_dt","");
            
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PRNPAP_2010_LCURLISTRecord rec = (MT_PRNPAP_2010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "real_prt_paper_clsf", rec.real_prt_paper_clsf);
			rx.add(record, "real_paper_std", rec.real_paper_std);
			rx.add(record, "prt_nm", rec.prt_nm);
			rx.add(record, "prt_plan_dd_pers", rec.prt_plan_dd_pers);
			rx.add(record, "prt_frdt", rec.prt_frdt);
			rx.add(record, "prt_todt", rec.prt_todt);
			rx.add(record, "prt_tms", rec.prt_tms);
			rx.add(record, "paper_std", rec.paper_std);
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "bw_pcnt", rec.bw_pcnt);
			rx.add(record, "prt_qty", rec.prt_qty);
			rx.add(record, "prt_paper_clsf", rec.prt_paper_clsf);
			rx.add(record, "qunt_out_yn", rec.qunt_out_yn);
			rx.add(record, "paper_gm", rec.paper_gm);
			rx.add(record, "brk_rate", rec.brk_rate);
			rx.add(record, "remk", rec.remk);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
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
	<CURLIST1>
		<record>
			<real_matr_clsf/>
			<matr_clsf/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<occr_dt/>
			<seq/>
			<real_prt_paper_clsf/>
			<real_paper_std/>
			<prt_nm/>
			<prt_plan_dd_pers/>
			<prt_frdt/>
			<prt_todt/>
			<prt_tms/>
			<paper_std/>
			<issu_pcnt/>
			<clr_pcnt/>
			<bw_pcnt/>
			<prt_qty/>
			<prt_paper_clsf/>
			<qunt_out_yn/>
			<paper_gm/>
			<brk_rate/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sat May 23 18:00:58 KST 2009 */ %>