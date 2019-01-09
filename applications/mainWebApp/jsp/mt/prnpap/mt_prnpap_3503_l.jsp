<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.prnpap.rec.*
	,	chosun.ciis.mt.prnpap.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PRNPAP_3503_LDataSet ds = (MT_PRNPAP_3503_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PRNPAP_3503_LCURLISTRecord rec = (MT_PRNPAP_3503_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record" , "");
			int ii = 0 ;
System.out.println(">>"+ rec.cmpy_cd);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "prt_dt", rec.prt_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.addCData(record, "sect_cd", rec.sect_cd);
			int subRecord = rx.add(record, "gridData", "");
			System.out.println(">>>" + i);
			for( ii = i; ii < i + 6; ii++) {
				MT_PRNPAP_3503_LCURLISTRecord rec2 = (MT_PRNPAP_3503_LCURLISTRecord)ds.curlist.get(ii);
				int recordsub = rx.add(subRecord, "record", "");
				rx.add(recordsub, "sub_seq", rec2.sub_seq);
				rx.add(recordsub, "cd", rec2.cd);
				rx.add(recordsub, "cdnm", rec2.cdnm);
				rx.add(recordsub, "cnt", rec2.cnt);
				rx.add(recordsub, "wgt", rec2.wgt);
				rx.add(recordsub, "rem_qunt", rec2.rem_qunt);
				rx.add(recordsub, "mang_cd_1", rec2.mang_cd_1);
				rx.add(recordsub, "mang_cd_2", rec2.mang_cd_2);
				System.out.println(ii);
			}
			i = i + ii - 1;
			System.out.println(ii);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
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
			<cmpy_cd/>
			<occr_dt/>
			<seq/>
			<sub_seq/>
			<issu_dt/>
			<prt_dt/>
			<fac_clsf/>
			<medi_cd/>
			<sect_cd/>
			<cd/>
			<cdnm/>
			<cnt/>
			<wgt/>
			<rem_qunt/>
			<mang_cd_1/>
			<mang_cd_2/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Jun 23 20:54:08 KST 2009 */ %>