<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.submatrin.rec.*
	,	chosun.ciis.mt.submatrin.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATRIN_1204_LDataSet ds = (MT_SUBMATRIN_1204_LDataSet)request.getAttribute("ds");
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
			MT_SUBMATRIN_1204_LCURLISTRecord rec = (MT_SUBMATRIN_1204_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "ewh_dt", rec.ewh_dt);
			rx.add(record, "purc_clsf", rec.purc_clsf);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "factcdnm", rec.factcdnm);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "ewh_qunt", rec.ewh_qunt);
			rx.add(record, "ewh_unit", rec.ewh_unit);
			rx.add(record, "ewh_uprc", rec.ewh_uprc);
			rx.add(record, "ewh_amt", rec.ewh_amt);
			rx.add(record, "use_deptcd", rec.use_deptcd);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "owh_dt", rec.owh_dt);
			rx.add(record, "owh_seq", rec.owh_seq);
			rx.add(record, "owh_sub_seq", rec.owh_sub_seq);
			rx.add(record, "incmg_slip_dt", rec.incmg_slip_dt);
			rx.add(record, "ewh_budg_cd", rec.ewh_budg_cd);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_ser_no", rec.medi_ser_no);
			rx.add(record, "bo_item_yn", rec.bo_item_yn);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "owh_budg_cd", rec.owh_budg_cd);
			rx.add(record, "factcdnm", rec.factcdnm);
			rx.add(record, "bimccdnm", rec.bimccdnm);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "addr", rec.addr);
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "fact_no_nm", rec.fac_clsf + " " + rec.factcdnm);
			rx.add(record, "part_cd", rec.part_cd);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "part_clas1_nm", rec.part_clas1_nm);
			if(rec.owh_dt.length() > 0 )
				rx.add(record, "owh_dt_seq_sub", rec.owh_seq + "-" + rec.owh_sub_seq);
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
	<CURLIST>
		<record>
			<ewh_dt/>
			<purc_clsf/>
			<fac_clsf/>
			<matr_cd/>
			<ewh_qunt/>
			<ewh_unit/>
			<ewh_uprc/>
			<ewh_amt/>
			<use_deptcd/>
			<remk/>
			<owh_dt/>
			<owh_seq/>
			<owh_sub_seq/>
			<incmg_slip_dt/>
			<ewh_budg_cd/>
			<chg_pers/>
			<medi_cd/>
			<medi_ser_no/>
			<bo_item_yn/>
			<matr_nm/>
			<owh_budg_cd/>
			<factcdnm/>
			<bimccdnm/>
			<ern/>
			<dlco_cd/>
			<addr/>
			<dlco_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Mar 20 16:51:36 KST 2009 */ %>