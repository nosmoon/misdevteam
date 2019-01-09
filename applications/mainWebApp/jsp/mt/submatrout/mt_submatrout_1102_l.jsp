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
	MT_SUBMATROUT_1102_LDataSet ds = (MT_SUBMATROUT_1102_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	String[][] arrTbl    = null;
	String[]   tbBodyTmp = null;
	String[]   tbhead    = null;
	dataSet = rx.add(root, "tempData", "");

	try {
		
		//arrTbl = new String[ds.curlist4.size()][(ds.curlist1.size() * 3) + 2];
		//System.out.println("x축=" + arrTbl.length + "y축=" + arrTbl[0].length);
		/*
		recordSet = rx.add(dataSet, "gridData4", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_SUBMATROUT_1102_LCURLIST1Record rec = (MT_SUBMATROUT_1102_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "sect_nm", rec.sect_nm);
			for(int ii = 0; ii < ds.curlist4.size(); ii++) {
				arrTbl[ii][(i*3)+3] = rec.medi_cd;
				arrTbl[ii][(i*3)+4] = rec.sect_cd;
			}
		}
		
		for(int i = 0; i < ds.curlist4.size(); i++) {
			MT_SUBMATROUT_1102_LCURLIST4Record rec = (MT_SUBMATROUT_1102_LCURLIST4Record)ds.curlist4.get(i);
			arrTbl[i][0] = rec.matr_cd;
			arrTbl[i][1] = rec.matr_nm;
		}
		
		recordSet = rx.add(dataSet, "ps_matr", "");
		for(int i = 0; i < ds.curlist4.size(); i++) {
			MT_SUBMATROUT_1102_LCURLIST4Record rec = (MT_SUBMATROUT_1102_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.matr_cd);
			rx.add(record, "label", rec.matr_nm);
		}
		
		recordSet = rx.add(dataSet, "medi_cd", "");
		for(int i = 0; i < ds.curlist5.size(); i++) {
			MT_SUBMATROUT_1102_LCURLIST5Record rec = (MT_SUBMATROUT_1102_LCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm_cd);
		}
		
		recordSet = rx.add(dataSet, "sect_cd_1", "");
		for(int i = 0; i < ds.curlist6.size(); i++) {
			MT_SUBMATROUT_1102_LCURLIST6Record rec = (MT_SUBMATROUT_1102_LCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm_cd);
		}
		
		recordSet = rx.add(dataSet, "sect_cd_2", "");
		for(int i = 0; i < ds.curlist7.size(); i++) {
			MT_SUBMATROUT_1102_LCURLIST7Record rec = (MT_SUBMATROUT_1102_LCURLIST7Record)ds.curlist7.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm_cd);
		}
		
		recordSet = rx.add(dataSet, "film_matr", "");
		for(int i = 0; i < ds.curlist8.size(); i++) {
			MT_SUBMATROUT_1102_LCURLIST8Record rec = (MT_SUBMATROUT_1102_LCURLIST8Record)ds.curlist8.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.matr_cd);
			rx.add(record, "label", rec.matr_nm);
		}
		
		recordSet = rx.add(dataSet, "gridData5", "");
		for(int i = 0; i < arrTbl.length; i++) {
			int record = rx.add(recordSet, "record", "");
			for(int ii = 0; ii < arrTbl[i].length; ii++) {
				rx.add(record, "d_" + ii, arrTbl[i][ii]);
			}
		}
		*/
		
		recordSet = rx.add(dataSet, "gridData_sub_2_1", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_SUBMATROUT_1102_LCURLIST2Record rec = (MT_SUBMATROUT_1102_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "owh_qunt", "0");
			rx.add(record, "row", "");
			rx.add(record, "col", "");
		}
		
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData_sub_1", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_SUBMATROUT_1102_LCURLIST1Record rec = (MT_SUBMATROUT_1102_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "seq", "");
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "unit", rec.unit);
			rx.add(record, "yesday_cnt", Long.parseLong(rec.hjg_cnt));
			rx.add(record, "hjg_cnt",   "");
			rx.add(record, "owh_qunt",  0);
			rx.add(record, "owh_uprc", rec.maeipdan);
			rx.add(record, "owh_amt",   0);
			rx.add(record, "owh_dept", rec.dept_cd);
			rx.add(record, "bccgacctcd", rec.owh_budg_cd.substring(0,4));
			rx.add(record, "medi_cd", "");
			rx.add(record, "medi_ser_no", "");
			rx.add(record, "remk", "");
			rx.add(record, "ewh_budg_cd", rec.ewh_budg_cd);
			rx.add(record, "owh_budg_cd", rec.owh_budg_cd);
			rx.add(record, "ewh_dt", "");
			rx.add(record, "hjg_amt", rec.hjg_amt);
			rx.add(record, "dstb_rat_cd", rec.dstb_rat_cd);
			rx.add(record, "curdd_ewh_qunt",   rec.curdd_ewh_qunt);
			rx.add(record, "plan_dt", rec.plan_dt);
			rx.add(record, "prv_cnt", rec.prv_cnt);
			rx.add(record, "ewh_seq", "");
			rx.add(record, "ewh_sub_seq", "");
			rx.add(record, "owh_unit", "");
			rx.add(record, "owh_type", rec.owh_type);
			rx.add(record, "mm_qunt", rec.mm_qunt);
			rx.add(record, "chg_yn", "N");
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST END */
		
		recordSet = rx.add(dataSet, "gridData_sub_2_2", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_SUBMATROUT_1102_LCURLIST3Record rec = (MT_SUBMATROUT_1102_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "seq", "");
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.addCData(record, "sect_nm", rec.sect_nm);
			rx.add(record, "owh_num_shet", "0");
		}

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
	<CURLIST2>
		<record>
			<matr_cd/>
			<matr_nm/>
			<unit/>
			<maeipdan/>
			<ewh_budg_cd/>
			<owh_budg_cd/>
			<std_modl/>
			<hjg_cnt/>
			<hjg_amt/>
			<igacctcdnm/>
			<cgacctcdnm/>
			<dstb_rat_cd/>
			<medi_cd/>
			<sect_cd/>
			<medi_cdnm/>
			<sect_cdnm/>
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
			<medi_cd/>
			<sect_cd/>
			<medi_cdnm/>
			<sect_cdnm/>
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
			<matr_cd/>
			<matr_nm/>
			<unit/>
			<maeipdan/>
			<ewh_budg_cd/>
			<owh_budg_cd/>
			<std_modl/>
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

<% /* 작성시간 : Mon Apr 06 20:39:27 KST 2009 */ %>