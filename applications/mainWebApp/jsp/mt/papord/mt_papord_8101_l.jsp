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
	MT_PAPORD_8101_LDataSet ds = (MT_PAPORD_8101_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPORD_8101_LCURLISTRecord rec = (MT_PAPORD_8101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "papcmpy_cd", rec.papcmpy_cd);
			rx.add(record, "papcmpy_clsf", rec.papcmpy_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "papcmpy_nm", rec.papcmpy_nm);
			rx.add(record, "d1", rec.d1);
			rx.add(record, "d2", rec.d2);
			rx.add(record, "d3", rec.d3);
			rx.add(record, "d4", rec.d4);
			rx.add(record, "d5", rec.d5);
			rx.add(record, "d6", rec.d6);
			rx.add(record, "d7", rec.d7);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */
		
		
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPORD_8101_LCURLISTRecord rec = (MT_PAPORD_8101_LCURLISTRecord)ds.curlist.get(i);
			if(rec.papcmpy_cd.equals("1101")){
				int record = rx.add(recordSet, "record", "");
				
				rx.add(record, "fac_clsf", rec.fac_clsf);
				rx.add(record, "papcmpy_cd", rec.papcmpy_cd);
				rx.add(record, "papcmpy_clsf", rec.papcmpy_clsf);
				rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
				rx.add(record, "papcmpy_nm", rec.papcmpy_nm);
				rx.add(record, "d1", rec.d1);
				rx.add(record, "d2", rec.d2);
				rx.add(record, "d3", rec.d3);
				rx.add(record, "d4", rec.d4);
				rx.add(record, "d5", rec.d5);
				rx.add(record, "d6", rec.d6);
				rx.add(record, "d7", rec.d7);
			}
		}

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPORD_8101_LCURLISTRecord rec = (MT_PAPORD_8101_LCURLISTRecord)ds.curlist.get(i);
			if(rec.papcmpy_cd.equals("1102")){
				int record = rx.add(recordSet, "record", "");
			
				rx.add(record, "fac_clsf", rec.fac_clsf);
				rx.add(record, "papcmpy_cd", rec.papcmpy_cd);
				rx.add(record, "papcmpy_clsf", rec.papcmpy_clsf);
				rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
				rx.add(record, "papcmpy_nm", rec.papcmpy_nm);
				rx.add(record, "d1", rec.d1);
				rx.add(record, "d2", rec.d2);
				rx.add(record, "d3", rec.d3);
				rx.add(record, "d4", rec.d4);
				rx.add(record, "d5", rec.d5);
				rx.add(record, "d6", rec.d6);
				rx.add(record, "d7", rec.d7);
			}
		}
		
		
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPORD_8101_LCURLISTRecord rec = (MT_PAPORD_8101_LCURLISTRecord)ds.curlist.get(i);
			if(rec.papcmpy_cd.equals("1105")){
				int record = rx.add(recordSet, "record", "");
			
				rx.add(record, "fac_clsf", rec.fac_clsf);
				rx.add(record, "papcmpy_cd", rec.papcmpy_cd);
				rx.add(record, "papcmpy_clsf", rec.papcmpy_clsf);
				rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
				rx.add(record, "papcmpy_nm", rec.papcmpy_nm);
				rx.add(record, "d1", rec.d1);
				rx.add(record, "d2", rec.d2);
				rx.add(record, "d3", rec.d3);
				rx.add(record, "d4", rec.d4);
				rx.add(record, "d5", rec.d5);
				rx.add(record, "d6", rec.d6);
				rx.add(record, "d7", rec.d7);
			}
		}
		
		
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPORD_8101_LCURLISTRecord rec = (MT_PAPORD_8101_LCURLISTRecord)ds.curlist.get(i);
			if(rec.papcmpy_cd.equals("1106")){
				int record = rx.add(recordSet, "record", "");
			
				rx.add(record, "fac_clsf", rec.fac_clsf);
				rx.add(record, "papcmpy_cd", rec.papcmpy_cd);
				rx.add(record, "papcmpy_clsf", rec.papcmpy_clsf);
				rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
				rx.add(record, "papcmpy_nm", rec.papcmpy_nm);
				rx.add(record, "d1", rec.d1);
				rx.add(record, "d2", rec.d2);
				rx.add(record, "d3", rec.d3);
				rx.add(record, "d4", rec.d4);
				rx.add(record, "d5", rec.d5);
				rx.add(record, "d6", rec.d6);
				rx.add(record, "d7", rec.d7);
			}
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
<mt_papord_8101_l>
	<dataSet>
		<CURLIST>
			<record>
				<fac_clsf/>
				<papcmpy_cd/>
				<papcmpy_clsf/>
				<fac_clsf_nm/>
				<papcmpy_nm/>
				<d1/>
				<d2/>
				<d3/>
				<d4/>
				<d5/>
				<d6/>
				<d7/>
			</record>
		</CURLIST>
	</dataSet>
</mt_papord_8101_l>
*/
%>

<% /* 작성시간 : Thu Jun 30 17:24:33 KST 2016 */ %>