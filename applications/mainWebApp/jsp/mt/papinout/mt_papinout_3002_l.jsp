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
	MT_PAPINOUT_3002_LDataSet ds = (MT_PAPINOUT_3002_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String[][] tbBody = null;
	String[]   tbhead  = null;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	recordSet = rx.add(dataSet, "tot_thoWgt", ds.tot_thowgt);  //총 이론 중량
	recordSet = rx.add(dataSet, "prtWgt"    , ds.prtwgt);      //총 인쇄 중량
	recordSet = rx.add(dataSet, "totPjWgt"    , ds.totpjwgt);    //총 파지량
	recordSet = rx.add(dataSet, "gitaPjWgt"    , ds.gitapjwgt); //기타 파지량
	recordSet = rx.add(dataSet, "cnt"    , ds.cnt);
	recordSet = rx.add(dataSet, "pajiYul"    , ds.pajiyul); //파지율

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "gridData2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PAPINOUT_3002_LCURLIST2Record rec = (MT_PAPINOUT_3002_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.addCData(record, "sect_cd", rec.sect_cd);
			rx.add(record, "hdqt_paper_clsf", rec.hdqt_paper_clsf);
			rx.add(record, "prt_clsf", rec.prt_clsf);
			rx.add(record, "pj_kind", rec.pj_kind);
			rx.add(record, "pj_cnt", rec.pj_cnt);
			rx.add(record, "pj_wgt", rec.pj_wgt);
			rx.add(record, "prt_dt", rec.prt_dt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_PAPINOUT_3002_LCURLIST1Record rec = (MT_PAPINOUT_3002_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "prt_dt", rec.prt_dt);
			rx.add(record, "paper_clsf", rec.paper_clsf);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.addCData(record, "sect_cd", rec.sect_cd);
			rx.add(record, "pap_std", rec.pap_std);
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "bw_pcnt", rec.bw_pcnt);
			rx.add(record, "slip_qty", rec.slip_qty);
			rx.add(record, "somo_wgt", rec.somo_wgt);
			rx.add(record, "avgynag", rec.avgynag);
			rx.add(record, "prt_clsf", rec.prt_clsf);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridGitaPaji", "");

		if( ds.curlist.size() > 0 ){
			MT_PAPINOUT_3002_LCURLISTRecord rec = (MT_PAPINOUT_3002_LCURLISTRecord)ds.curlist.get(0);
			rx.add(recordSet, "cmpy_cd", rec.cmpy_cd);
			rx.add(recordSet, "occr_dt", rec.occr_dt);
			rx.add(recordSet, "seq", rec.seq);
			rx.add(recordSet, "sub_seq", rec.sub_seq);
			rx.add(recordSet, "pj_kind", rec.pj_kind);
			rx.add(recordSet, "pj_wgt", rec.pj_wgt);
			rx.add(recordSet, "etc_pj_resn_cd", rec.etc_pj_resn_cd);
			rx.add(recordSet, "remk", rec.remk);

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
	<CURLIST4>
		<record>
			<cd/>
			<cdnm/>
			<mang_cd_1/>
		</record>
	</CURLIST4>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST3>
		<record>
			<medi_sect_cd/>
		</record>
	</CURLIST3>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST2>
		<record>
			<cd/>
			<cdnm/>
			<p_pj_wgt/>
			<p_pj_qunt/>
			<medi_cd/>
			<sect_cd/>
			<m_pj_wgt/>
			<m_pj_qunt/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST1>
		<record>
			<issu_dt/>
			<paper_clsf/>
			<medi_cd/>
			<sect_cd/>
			<pap_std/>
			<issu_pcnt/>
			<clr_pcnt/>
			<bw_pcnt/>
			<slip_qty/>
			<somo_wgt/>
			<somo_paji/>
			<avgynag/>
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
			<sub_seq/>
			<pj_kind/>
			<pj_wgt/>
			<etc_pj_resn_cd/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed May 13 11:11:45 KST 2009 */ %>