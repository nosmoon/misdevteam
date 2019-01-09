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
	MT_SUBMATROUT_2003_LDataSet ds = (MT_SUBMATROUT_2003_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData_sub", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_SUBMATROUT_2003_LCURLISTRecord rec = (MT_SUBMATROUT_2003_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sub_seq", "");
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "unit", rec.unit);
			rx.add(record, "hjg_cnt", "");  //현재고
			rx.add(record, "hjg_amt", "");
			rx.add(record, "mov_inout_dt", "");
			rx.add(record, "mov_out_fac_cd", "");
			rx.add(record, "mov_out_deptcd", "");
			rx.add(record, "mov_out_budg_cd", rec.mov_out_budg_cd);
			rx.add(record, "mov_out_budg_acctcd", "");
			rx.add(record, "mov_out_budg_cd_nm", "");
			rx.add(record, "mov_out_budg_acctcdnm", "");
			rx.add(record, "mov_out_qunt", 0);
			rx.add(record, "mov_out_unit", "");
			rx.add(record, "mov_out_uprc", rec.mov_out_uprc);
			rx.add(record, "mov_out_amt",  0);
			rx.add(record, "mov_in_fac_cd", "");
			rx.add(record, "mov_in_deptcd", "");
			rx.add(record, "mov_in_budg_cd", rec.mov_in_budg_cd);
			rx.add(record, "mov_in_budg_acctcd", "");
			rx.add(record, "mov_in_budg_cd_nm", "");
			rx.add(record, "mov_in_budg_acctcdnm", rec.mov_in_budg_acctcdnm);
			rx.add(record, "mov_in_qunt", "");
			rx.add(record, "mov_in_unit", "");
			rx.add(record, "mov_in_uprc", "");
			rx.add(record, "mov_in_amt",  "");
			rx.add(record, "medi_cd", "");
			rx.add(record, "medi_cd_nm", "");
			rx.add(record, "medi_ser_no", "");
			rx.add(record, "remk", "");
			rx.add(record, "hjg_cnt_minus_out_qunt" , rec.hjg_cnt ); //전일재고
			rx.add(record, "cut_hjg_amt", rec.cur_hjg_amt);
			rx.add(record, "dstb_rat_cd", rec.dstb_rat_cd);

			//rx.add(record, "std_modl", rec.std_modl);
			//rx.add(record, "safe_stok", rec.safe_stok);

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
			<matr_cd/>
			<matr_nm/>
			<unit/>
			<mov_out_uprc/>
			<mov_in_budg_cd/>
			<mov_out_budg_cd/>
			<std_modl/>
			<safe_stok/>
			<hjg_cnt/>
			<cur_hjg_amt/>
			<mov_in_budg_acctcdnm/>
			<mov_out_budg_acctcdnm/>
			<dstb_rat_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 31 14:27:15 KST 2009 */ %>