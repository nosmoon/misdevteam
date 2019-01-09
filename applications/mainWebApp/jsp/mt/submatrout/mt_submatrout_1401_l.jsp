<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.submatrout.rec.*
	,	chosun.ciis.mt.submatrout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATROUT_1401_LDataSet ds = (MT_SUBMATROUT_1401_LDataSet)request.getAttribute("ds");
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
			MT_SUBMATROUT_1401_LCURLISTRecord rec = (MT_SUBMATROUT_1401_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "unit", rec.unit);
			rx.add(record, "maeipdan", rec.maeipdan);
			rx.add(record, "ewh_budg_cd", rec.ewh_budg_cd);
			rx.add(record, "owh_budg_cd", rec.owh_budg_cd);
			rx.add(record, "std_modl", rec.std_modl);
			rx.add(record, "safe_stok", rec.safe_stok);
			rx.add(record, "hjg_cnt", rec.hjg_cnt);
			rx.add(record, "hjg_amt", rec.hjg_amt);
			rx.add(record, "igacctcdnm", rec.igacctcdnm);
			rx.add(record, "cgacctcdnm", rec.cgacctcdnm);
			rx.add(record, "dstb_rat_cd", rec.dstb_rat_cd);
			rx.add(record, "ordr_qunt", rec.ordr_qunt);
		    rx.add(record, "ordr_cnt" , 0 );
		    rx.add(record, "matr_cnfm_qunt" , rec.matr_cnfm_qunt);
		    rx.add(record, "matr_acpn_yn" , rec.matr_acpn_yn);
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
			<fac_clsf/>
			<matr_cd/>
			<matr_nm/>
			<unit/>
			<maeipdan/>
			<ewh_budg_cd/>
			<owh_budg_cd/>
			<std_modl/>
			<safe_stok/>
			<hjg_cnt/>
			<hjg_amt/>
			<igacctcdnm/>
			<cgacctcdnm/>
			<dstb_rat_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 26 14:55:57 KST 2009 */ %>