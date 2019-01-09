<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papord.rec.*
	,	chosun.ciis.mt.papord.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPORD_4000_MDataSet ds = (MT_PAPORD_4000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		
		/****** CURLIST1 BEGIN 양출*/
		recordSet = rx.add(dataSet, "dual_out_clsf", "");
		for(int i = 0; i < ds.curlist5.size(); i++) {
			MT_PAPORD_4000_MCURLIST5Record rec = (MT_PAPORD_4000_MCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd + " " + rec.cdnm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist5.size());
		/****** CURLIST1 END */
		
		/****** CURLIST2 BEGIN 매체*/
		recordSet = rx.add(dataSet, "medi_cd", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PAPORD_4000_MCURLIST2Record rec = (MT_PAPORD_4000_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd + " " + rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST2 BEGIN 섹션*/
		recordSet = rx.add(dataSet, "sect_cd", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_PAPORD_4000_MCURLIST3Record rec = (MT_PAPORD_4000_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd + " " + rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST2 BEGIN 매체*/
		recordSet = rx.add(dataSet, "sect_cd_2", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			MT_PAPORD_4000_MCURLIST4Record rec = (MT_PAPORD_4000_MCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd + " " + rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN 공장*/
		recordSet = rx.add(dataSet, "fac_clsf", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_PAPORD_4000_MCURLIST1Record rec = (MT_PAPORD_4000_MCURLIST1Record)ds.curlist1.get(i);
			if(rec.cd_type.equals("FAC_CLSF")) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cdnm);
			}
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
<dataSet>
	<CURLIST4>
		<record>
			<fac_clsf/>
			<paper_std_cd/>
			<paper_std_nm/>
			<matr_cd/>
			<matr_nm/>
			<roll_wgt/>
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
			<cd/>
			<cdnm/>
			<mang_cd_3/>
			<cd_abrv_nm/>
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
			<cd_abrv_nm/>
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
			<cd_type/>
			<cd/>
			<cdnm/>
			<mang_cd_3/>
			<cd_abrv_nm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Apr 09 12:45:30 KST 2009 */ %>