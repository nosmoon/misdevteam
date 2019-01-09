<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPINOUT_2207_LDataSet ds = (MT_PAPINOUT_2207_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_2207_LCURLISTRecord rec = (MT_PAPINOUT_2207_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "title", rec.title);
			rx.add(record, "befor_roll", Integer.parseInt(rec.tot_jgroll) + Integer.parseInt(rec.roll));  //전일 재고 ROLL
			rx.add(record, "befor_wgt", Integer.parseInt(rec.tot_jgwgt) + Integer.parseInt(rec.wgt));     //전일 재고 중량
			rx.add(record, "purc_uprc", rec.purc_uprc);
			rx.add(record, "roll", rec.roll);
			rx.add(record, "wgt", rec.wgt);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "tot_jgroll", rec.tot_jgroll);
			rx.add(record, "tot_jgwgt", rec.tot_jgwgt);
			rx.add(record, "tot_jgamt", rec.tot_jgamt);
			rx.add(record, "cut_err_tms", rec.cut_err_tms);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "grp", rec.grp);
			rx.add(record, "vat", "");
			rx.add(record, "roll_wgt", rec.roll_wgt);

			//rx.add(record, "inout_dt", rec.inout_dt);
			//rx.add(record, "iw_roll", rec.iw_roll);
			//rx.add(record, "s_wiibgoroll", rec.s_wiibgoroll);
			//rx.add(record, "s_wccgroll", rec.s_wccgroll);
			//rx.add(record, "iw_wt", rec.iw_wt);
			//rx.add(record, "s_wiibgowt", rec.s_wiibgowt);
			//rx.add(record, "s_wccgwt", rec.s_wccgwt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

		recordSet = rx.add(dataSet, "gridData2", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PAPINOUT_2207_LCURLIST2Record rec = (MT_PAPINOUT_2207_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "prt_dt", rec.prt_dt);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "medi_cdnm", rec.medi_cdnm);
			rx.addCData(record, "sect_cdnm", rec.sect_cdnm);
			rx.add(record, "pap_std", rec.pap_std);
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "bw_pcnt", rec.bw_pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "slip_qty", rec.slip_qty);
			rx.add(record, "prt_wgt", rec.prt_wgt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		
		recordSet = rx.add(dataSet, "argWgt", ds.wgt);
		recordSet = rx.add(dataSet, "argPaji1", ds.pj_arg1);
		recordSet = rx.add(dataSet, "argPaji2", ds.pj_arg2);
		recordSet = rx.add(dataSet, "prt_wgt", ds.prt_wgt);
		recordSet = rx.add(dataSet, "slip_occr_dt", ds.slip_occr_dt);
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
			<title/>
			<roll/>
			<wgt/>
			<purc_uprc/>
			<amt/>
			<tot_jgroll/>
			<tot_jgwgt/>
			<tot_jgamt/>
			<inout_dt/>
			<iw_roll/>
			<s_wiibgoroll/>
			<s_wccgroll/>
			<iw_wt/>
			<s_wiibgowt/>
			<s_wccgwt/>
			<cut_err_tms/>
			<matr_cd/>
			<grp/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Apr 27 18:36:13 KST 2009 */ %>