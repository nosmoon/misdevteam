<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.papord.rec.*
	,	chosun.ciis.mt.papord.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPORD_1005_LDataSet ds = (MT_PAPORD_1005_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "gridData2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PAPORD_1005_LCURLIST2Record rec = (MT_PAPORD_1005_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "roll_wgt", rec.roll_wgt);
			rx.add(record, "std_ewh_roll_cnt", rec.std_ewh_roll_cnt);
			rx.add(record, "std_ewh_wgt", rec.std_ewh_wgt);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
			//rx.add(record, "std_ewh_roll_cnt", StringUtil.replaceToXml(rec.std_ewh_roll_cnt));
			//rx.add(record, "std_ewh_wgt", StringUtil.replaceToXml(rec.std_ewh_wgt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_PAPORD_1005_LCURLIST1Record rec = (MT_PAPORD_1005_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "aply_dt", rec.aply_dt);
			rx.add(record, "max_ewh_wgt", rec.max_ewh_wgt);
			rx.add(record, "oth_prts_ratio", rec.oth_prts_ratio);
			//rx.add(record, "ewh_ratio", rec.ewh_ratio);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "aply_dt", StringUtil.replaceToXml(rec.aply_dt));
			//rx.add(record, "max_ewh_wgt", StringUtil.replaceToXml(rec.max_ewh_wgt));
			//rx.add(record, "oth_prts_ratio", StringUtil.replaceToXml(rec.oth_prts_ratio));
			//rx.add(record, "ewh_ratio", StringUtil.replaceToXml(rec.ewh_ratio));
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
<mt_papord_1005_l>
	<dataSet>
		<CURLIST2>
			<record>
				<cmpy_cd/>
				<occr_dt/>
				<seq/>
				<matr_cd/>
				<matr_nm/>
				<std_ewh_roll_cnt/>
				<std_ewh_wgt/>
			</record>
		</CURLIST2>
	</dataSet>
</mt_papord_1005_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_papord_1005_l>
	<dataSet>
		<CURLIST1>
			<record>
				<cmpy_cd/>
				<occr_dt/>
				<seq/>
				<fac_clsf/>
				<aply_dt/>
				<max_ewh_wgt/>
				<oth_prts_ratio/>
				<ewh_ratio/>
			</record>
		</CURLIST1>
	</dataSet>
</mt_papord_1005_l>
*/
%>

<% /* 작성시간 : Mon Jul 13 23:37:01 KST 2009 */ %>