<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.etccar.rec.*
	,	chosun.ciis.mt.etccar.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCCAR_1000_LDataSet ds = (MT_ETCCAR_1000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			MT_ETCCAR_1000_LCURLIST4Record rec = (MT_ETCCAR_1000_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "use_usag", StringUtil.replaceToXml(rec.use_usag));
			//rx.add(record, "use_usag", rec.use_usag);
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_ETCCAR_1000_LCURLIST3Record rec = (MT_ETCCAR_1000_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "gag2", StringUtil.replaceToXml(rec.gag2));
			rx.add(record, "gag1", StringUtil.replaceToXml(rec.gag1));
			rx.add(record, "rowcnt", StringUtil.replaceToXml(rec.rowcnt));
			//rx.add(record, "gag2", rec.gag2);
			//rx.add(record, "gag1", rec.gag1);
			//rx.add(record, "rowcnt", rec.rowcnt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_ETCCAR_1000_LCURLIST2Record rec = (MT_ETCCAR_1000_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record2", "");
			rx.add(record, "dest", StringUtil.replaceToXml(rec.dest));
			rx.add(record, "start_dt", StringUtil.replaceToXml(rec.start_dt));
			rx.add(record, "start_tm", StringUtil.replaceToXml(rec.start_tm));
			rx.add(record, "driv_dt", StringUtil.replaceToXml(rec.driv_dt));
			rx.add(record, "ariv_tm", StringUtil.replaceToXml(rec.ariv_tm));
			rx.add(record, "start_gag", StringUtil.replaceToXml(rec.start_gag));
			rx.add(record, "ariv_gag", StringUtil.replaceToXml(rec.ariv_gag));
			rx.add(record, "drvr_nm", StringUtil.replaceToXml(rec.drvr_nm));
			rx.add(record, "rid_pers", StringUtil.replaceToXml(rec.rid_pers));
			rx.add(record, "rid_deptcd", StringUtil.replaceToXml(rec.rid_deptcd));
			rx.add(record, "rid_dept_nm", StringUtil.replaceToXml(rec.rid_dept_nm));
			rx.add(record, "driv_purp", StringUtil.replaceToXml(rec.driv_purp));
	    rx.add(record, "car_no", "");
      rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
      rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "dest", rec.dest);
			//rx.add(record, "start_dt", rec.start_dt);
			//rx.add(record, "start_tm", rec.start_tm);
			//rx.add(record, "driv_dt", rec.driv_dt);
			//rx.add(record, "ariv_tm", rec.ariv_tm);
			//rx.add(record, "start_gag", rec.start_gag);
			//rx.add(record, "ariv_gag", rec.ariv_gag);
			//rx.add(record, "drvr_nm", rec.drvr_nm);
			//rx.add(record, "rid_pers", rec.rid_pers);
			//rx.add(record, "rid_deptcd", rec.rid_deptcd);
			//rx.add(record, "rid_dept_nm", rec.rid_dept_nm);
			//rx.add(record, "seq", rec.seq);
			//rx.add(record, "occr_dt", rec.occr_dt);
			//rx.add(record, "driv_purp", rec.driv_purp);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_ETCCAR_1000_LCURLIST1Record rec = (MT_ETCCAR_1000_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "drvr_nm", StringUtil.replaceToXml(rec.drvr_nm));
			rx.add(record, "buyoil_dt", StringUtil.replaceToXml(rec.buyoil_dt));
			rx.add(record, "buyoil_tm", StringUtil.replaceToXml(rec.buyoil_tm));
			rx.add(record, "oil_kind", StringUtil.replaceToXml(rec.oil_kind));
			rx.add(record, "buyoil_qunt", StringUtil.replaceToXml(rec.buyoil_qunt));
			rx.add(record, "buyoil_gag", StringUtil.replaceToXml(rec.buyoil_gag));
			rx.add(record, "outsd_oil_dt", StringUtil.replaceToXml(rec.outsd_oil_dt));
			rx.add(record, "outsd_oil_tm", StringUtil.replaceToXml(rec.outsd_oil_tm));
			rx.add(record, "outsd_oil_qunt", StringUtil.replaceToXml(rec.outsd_oil_qunt));
      rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
      rx.add(record, "driv_dt", "");
      rx.add(record, "car_no", "");
      rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "drvr_nm", rec.drvr_nm);
			//rx.add(record, "buyoil_dt", rec.buyoil_dt);
			//rx.add(record, "buyoil_tm", rec.buyoil_tm);
			//rx.add(record, "oil_kind", rec.oil_kind);
			//rx.add(record, "buyoil_qunt", rec.buyoil_qunt);
			//rx.add(record, "buyoil_gag", rec.buyoil_gag);
			//rx.add(record, "outsd_oil_dt", rec.outsd_oil_dt);
			//rx.add(record, "outsd_oil_tm", rec.outsd_oil_tm);
			//rx.add(record, "outsd_oil_qunt", rec.outsd_oil_qunt);
			//rx.add(record, "seq", rec.seq);
			//rx.add(record, "occr_dt", rec.occr_dt);
			//rx.add(record, "remk", rec.remk);
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
<mt_etccar_1000_l>
	<dataSet>
		<CURLIST4>
			<record>
				<use_usag/>
			</record>
		</CURLIST4>
	</dataSet>
</mt_etccar_1000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_etccar_1000_l>
	<dataSet>
		<CURLIST3>
			<record>
				<gag2/>
				<gag1/>
				<rowcnt/>
			</record>
		</CURLIST3>
	</dataSet>
</mt_etccar_1000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_etccar_1000_l>
	<dataSet>
		<CURLIST2>
			<record>
				<dest/>
				<start_dt/>
				<start_tm/>
				<driv_dt/>
				<ariv_tm/>
				<start_gag/>
				<ariv_gag/>
				<drvr_nm/>
				<rid_pers/>
				<rid_deptcd/>
				<rid_dept_nm/>
				<seq/>
				<occr_dt/>
				<driv_purp/>
			</record>
		</CURLIST2>
	</dataSet>
</mt_etccar_1000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_etccar_1000_l>
	<dataSet>
		<CURLIST1>
			<record>
				<drvr_nm/>
				<buyoil_dt/>
				<buyoil_tm/>
				<oil_kind/>
				<buyoil_qunt/>
				<buyoil_gag/>
				<outsd_oil_dt/>
				<outsd_oil_tm/>
				<outsd_oil_qunt/>
				<seq/>
				<occr_dt/>
				<remk/>
			</record>
		</CURLIST1>
	</dataSet>
</mt_etccar_1000_l>
*/
%>

<% /* 작성시간 : Wed Sep 09 13:36:33 KST 2009 */ %>