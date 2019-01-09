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
	MT_SUBMATROUT_1104_LDataSet ds = (MT_SUBMATROUT_1104_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	String[][] arrTbl    = null;
	String[]   tbBodyTmp = null;
	String[]   tbhead    = null;
	int colCount = 0;
	int rowCount = 0;
	dataSet = rx.add(root, "tempData", "");

	try {
		arrTbl = new String[ds.curlist4.size()][(ds.curlist1.size() * 3) + 2];
		System.out.println("x축=" + arrTbl.length + "y축=" + arrTbl[0].length);
		
		recordSet = rx.add(dataSet, "gridData4", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_SUBMATROUT_1104_LCURLIST1Record rec = (MT_SUBMATROUT_1104_LCURLIST1Record)ds.curlist1.get(i);
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
			MT_SUBMATROUT_1104_LCURLIST4Record rec = (MT_SUBMATROUT_1104_LCURLIST4Record)ds.curlist4.get(i);
			arrTbl[i][0] = rec.matr_cd;
			arrTbl[i][1] = rec.matr_nm;
		}
		
		recordSet = rx.add(dataSet, "gridData_sub_2_1", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_SUBMATROUT_1104_LCURLIST2Record rec = (MT_SUBMATROUT_1104_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "owh_qunt", rec.qunt);
		}
		
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_SUBMATROUT_1104_LCURLIST2Record rec = (MT_SUBMATROUT_1104_LCURLIST2Record)ds.curlist2.get(i);
			if (ds.curlist1.size() > 0){
				if (i % (ds.curlist1.size()) == 0){
					rowCount++;
					colCount = 2;
				} else {
					//System.out.println(i + "=" + i + "_" + (ds.curlist3.size() + 1));
					colCount += 3;
				}
				arrTbl[rowCount-1][colCount] = rec.qunt;
			}
		}
		
		recordSet = rx.add(dataSet, "gridData5", "");
		for(int i = 0; i < arrTbl.length; i++) {
			int record = rx.add(recordSet, "record", "");
			for(int ii = 0; ii < arrTbl[i].length; ii++) {
				rx.add(record, "d_" + ii, arrTbl[i][ii]);
			}
		}
		
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "gridData_sub_1", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_SUBMATROUT_1104_LCURLISTRecord rec = (MT_SUBMATROUT_1104_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sub_seq", rec.sub_seq);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "unit", rec.unit);
			rx.add(record, "yesday_cnt", Long.parseLong(rec.hjg_cnt) + Long.parseLong(rec.owh_qunt));
			rx.add(record, "hjg_cnt", rec.hjg_cnt);
			rx.add(record, "owh_qunt", rec.owh_qunt);
			rx.add(record, "owh_uprc", rec.owh_uprc);
			rx.add(record, "owh_amt", rec.owh_amt);
			rx.add(record, "owh_dept", rec.owh_dept);
			rx.add(record, "bccgacctcd", rec.bccgacctcd);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_ser_no", rec.medi_ser_no);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "ewh_budg_cd", rec.ewh_budg_cd);
			rx.add(record, "owh_budg_cd", rec.owh_budg_cd);
			rx.add(record, "ewh_dt", rec.ewh_dt);
			rx.add(record, "hjg_amt", rec.hjg_amt);
			rx.add(record, "dstb_rat_cd", "");
			rx.add(record, "ewh_seq", rec.ewh_seq);
			rx.add(record, "ewh_sub_seq", rec.ewh_sub_seq);
			rx.add(record, "owh_unit", rec.owh_unit);
			rx.add(record, "curdd_ewh_qunt", rec.curdd_ewh_qunt);
			rx.add(record, "plan_dt", rec.plan_dt);
			rx.add(record, "prv_cnt", rec.prv_cnt);
			rx.add(record, "owh_type", rec.owh_type);
			//rx.add(record, "owh_dt", rec.owh_dt);
			//rx.add(record, "fac_clsf", rec.fac_clsf);
			//rx.add(record, "igacctcdnm", rec.igacctcdnm);
			//rx.add(record, "bcigaccntcd", rec.bcigaccntcd);
			//rx.add(record, "bcigaccntcdnm", rec.bcigaccntcdnm);
			//rx.add(record, "medi_cd_nm", rec.medi_cd_nm);
			//rx.add(record, "owh_budg_cd_nm", rec.owh_budg_cd_nm);
			//<ewh_seq/>
			//<ewh_sub_seq/>
			//<owh_unit/>
			//<!--owh_dt-->
			//<!--fac_clsf-->
			////<!--igacctcdnm-->
			//<!--owh_unit-->
			//<!--bcigaccntcd-->
			//<!--bcigaccntcdnm-->
			//<!--medi_cd_nm-->
			//<!--owh_budg_cd_nm-->
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		/*
		recordSet = rx.add(dataSet, "gridData_sub_1", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_SUBMATROUT_1104_LCURLISTRecord rec = (MT_SUBMATROUT_1104_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sub_seq", rec.sub_seq);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "unit", rec.unit);
			rx.add(record, "yesday_cnt", Long.parseLong(rec.hjg_cnt) + Long.parseLong(rec.owh_qunt));
			rx.add(record, "hjg_cnt", rec.hjg_cnt);
			rx.add(record, "owh_qunt", rec.owh_qunt);
			rx.add(record, "owh_uprc", rec.owh_uprc);
			rx.add(record, "owh_amt", rec.owh_amt);
			rx.add(record, "owh_dept", rec.owh_dept);
			rx.add(record, "bccgacctcd", rec.bccgacctcd);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_ser_no", rec.medi_ser_no);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "ewh_budg_cd", rec.ewh_budg_cd);
			rx.add(record, "owh_budg_cd", rec.owh_budg_cd);
			rx.add(record, "ewh_dt", rec.ewh_dt);
			rx.add(record, "hjg_amt", rec.hjg_amt);
			rx.add(record, "dstb_rat_cd", "");
			rx.add(record, "ewh_seq", rec.ewh_seq);
			rx.add(record, "ewh_sub_seq", rec.ewh_sub_seq);
			rx.add(record, "owh_unit", rec.owh_unit);
			rx.add(record, "curdd_ewh_qunt", rec.curdd_ewh_qunt);
			rx.add(record, "plan_dt", rec.plan_dt);
			rx.add(record, "prv_cnt", rec.prv_cnt);
			rx.add(record, "owh_type", rec.owh_type);

			//rx.add(record, "owh_dt", rec.owh_dt);
			//rx.add(record, "fac_clsf", rec.fac_clsf);
			//rx.add(record, "igacctcdnm", rec.igacctcdnm);
			//rx.add(record, "bcigaccntcd", rec.bcigaccntcd);
			//rx.add(record, "bcigaccntcdnm", rec.bcigaccntcdnm);
			//rx.add(record, "medi_cd_nm", rec.medi_cd_nm);
			//rx.add(record, "owh_budg_cd_nm", rec.owh_budg_cd_nm);
			//<ewh_seq/>
			//<ewh_sub_seq/>
			//<owh_unit/>
			//<!--owh_dt-->
			//<!--fac_clsf-->
			////<!--igacctcdnm-->
			//<!--owh_unit-->
			//<!--bcigaccntcd-->
			//<!--bcigaccntcdnm-->
			//<!--medi_cd_nm-->
			//<!--owh_budg_cd_nm-->
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		*/
		/****** CURLIST END */
		
		recordSet = rx.add(dataSet, "gridData_sub_2_2", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_SUBMATROUT_1104_LCURLIST3Record rec = (MT_SUBMATROUT_1104_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sub_seq", rec.sub_seq);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "owh_num_shet", rec.owh_num_shet);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());

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
			<sub_seq/>
			<matr_cd/>
			<matr_nm/>
			<unit/>
			<hjg_cnt/>
			<hjg_amt/>
			<owh_dt/>
			<fac_clsf/>
			<owh_dept/>
			<owh_budg_cd/>
			<bccgacctcd/>
			<igacctcdnm/>
			<owh_qunt/>
			<owh_unit/>
			<owh_uprc/>
			<owh_amt/>
			<medi_cd/>
			<medi_ser_no/>
			<remk/>
			<ewh_budg_cd/>
			<bcigaccntcd/>
			<bcigaccntcdnm/>
			<ewh_dt/>
			<ewh_seq/>
			<ewh_sub_seq/>
			<medi_cd_nm/>
			<owh_budg_cd_nm/>
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
			<sub_seq/>
			<matr_cd/>
			<matr_nm/>
			<unit/>
			<hjg_cnt/>
			<hjg_amt/>
			<owh_dt/>
			<fac_clsf/>
			<owh_dept/>
			<owh_budg_cd/>
			<bccgacctcd/>
			<igacctcdnm/>
			<owh_qunt/>
			<owh_unit/>
			<owh_uprc/>
			<owh_amt/>
			<medi_cd/>
			<medi_ser_no/>
			<remk/>
			<ewh_budg_cd/>
			<bcigaccntcd/>
			<bcigaccntcdnm/>
			<ewh_dt/>
			<ewh_seq/>
			<ewh_sub_seq/>
			<medi_cd_nm/>
			<owh_budg_cd_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Apr 07 09:38:02 KST 2009 */ %>