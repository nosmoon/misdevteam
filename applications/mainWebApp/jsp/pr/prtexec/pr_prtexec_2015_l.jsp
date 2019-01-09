<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,chosun.ciis.pr.prtexec.rec.*,chosun.ciis.pr.prtexec.ds.*;"
%>

<%
	RwXml rx = new RwXml();
	PR_PRTEXEC_2008_LDataSet ds = (PR_PRTEXEC_2008_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	String[][] arrTbl = null;
	int rowCount = 0;
	int colCount = 0;
	
	recordSet = rx.add(root, "divData", "");

	try {
		arrTbl = new String[ds.curlist_y.size()][ds.curlist_x.size() + 1];
		System.out.println("x축=" + arrTbl.length + "y축=" + arrTbl[0].length);
		formData = rx.add(recordSet, "x_data", "");
		for(int i = 0; i < ds.curlist_x.size(); i++) {
			PR_PRTEXEC_2008_LCURLIST_XRecord rec = (PR_PRTEXEC_2008_LCURLIST_XRecord)ds.curlist_x.get(i);
			int record = rx.add(formData, "record", "");
			arrTbl[0][i + 1] = rec.fac_clsf_nm;
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
		}
		/****** CURLIST_X END */
		
		formData = rx.add(recordSet, "a_data", "");
		for(int i = 0; i < ds.curlist_d.size(); i++) {
			PR_PRTEXEC_2008_LCURLIST_DRecord rec = (PR_PRTEXEC_2008_LCURLIST_DRecord)ds.curlist_d.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "end_clsf", rec.end_clsf);
			rx.add(record, "end_clsf_nm", rec.end_clsf_nm);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "issu_dt", rec.issu_dt);
		}
		/****** CURLIST_A END */
		
		formData = rx.add(recordSet, "y_data", "");
		for(int i = 0; i < ds.curlist_y.size(); i++) {
			PR_PRTEXEC_2008_LCURLIST_YRecord rec = (PR_PRTEXEC_2008_LCURLIST_YRecord)ds.curlist_y.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "occr_yy", rec.occr_yy);
			rx.add(record, "seq", rec.seq);
			arrTbl[i][0] = rec.issu_dt;
		}
		/****** CURLIST_Y END */
		
		for(int i = 0; i < ds.curlist_d.size(); i++) {
			PR_PRTEXEC_2008_LCURLIST_DRecord rec = (PR_PRTEXEC_2008_LCURLIST_DRecord)ds.curlist_d.get(i);
			
			if (i % ds.curlist_y.size() == 0){
				rowCount++;
				colCount = 1;
			} else {
				colCount++;
			}
			System.out.println("rowCount=" + rowCount + "colCount=" + colCount);
			arrTbl[rowCount-1][colCount] = rec.end_clsf_nm;
		}
		
		formData = rx.add(recordSet, "d_data", "");
		for(int i = 0; i < arrTbl.length; i++) {
			int record = rx.add(formData, "record", "");
			for(int ii = 0; ii < arrTbl[i].length; ii++) {
				System.out.println("[" + i + "][" +ii + "]=" + arrTbl[i][ii]);
				if (ii == 0){
					rx.add(record, "remk", arrTbl[i][ii]);
				} else {
					rx.add(record, "d_" + ii, arrTbl[i][ii]);
				}
			}
		}
		//rx.add(recordSet, "totalcnt", ds.curlist_y.size());
		/****** CURLIST_Y END */

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST_X>
		<record>
			<fac_clsf/>
			<fac_clsf_nm/>
		</record>
	</CURLIST_X>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST_D>
		<record>
			<end_clsf/>
			<fac_clsf/>
			<issu_dt/>
		</record>
	</CURLIST_D>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST_Y>
		<record>
			<issu_dt/>
		</record>
	</CURLIST_Y>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Apr 20 12:40:53 KST 2009 */ %>