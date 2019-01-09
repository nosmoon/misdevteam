<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.commatr.rec.*
	,	chosun.ciis.mt.commatr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_COMMATR_6610_LDataSet ds = (MT_COMMATR_6610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
	
		recordSet = rx.add(dataSet, "gridData1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_COMMATR_6610_LCURLIST1Record rec = (MT_COMMATR_6610_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "a_01", rec.a_01);
			rx.add(record, "a_02", rec.a_02);
			rx.add(record, "a_03", rec.a_03);
			rx.add(record, "a_04", rec.a_04);
			rx.add(record, "a_05", rec.a_05);
			rx.add(record, "a_06", rec.a_06);
			rx.add(record, "a_07", rec.a_07);
			rx.add(record, "a_08", rec.a_08);
			rx.add(record, "a_09", rec.a_09);
			rx.add(record, "a_10", rec.a_10);
			rx.add(record, "a_11", rec.a_11);
			rx.add(record, "a_12", rec.a_12);
			rx.add(record, "a_avg", rec.a_avg);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "ink", rec.ink);
		}
		/****** CURLIST2 END */
	
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_COMMATR_6610_LCURLISTRecord rec = (MT_COMMATR_6610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "ink", rec.ink);
			rx.add(record, "a_01", rec.a_01);
			rx.add(record, "a_02", rec.a_02);
			rx.add(record, "a_03", rec.a_03);
			rx.add(record, "a_04", rec.a_04);
			rx.add(record, "a_05", rec.a_05);
			rx.add(record, "a_06", rec.a_06);
			rx.add(record, "a_07", rec.a_07);
			rx.add(record, "a_08", rec.a_08);
			rx.add(record, "a_09", rec.a_09);
			rx.add(record, "a_10", rec.a_10);
			rx.add(record, "a_11", rec.a_11);
			rx.add(record, "a_12", rec.a_12);
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "fac_clsf_nm", StringUtil.replaceToXml(rec.fac_clsf_nm));
			//rx.add(record, "ink", StringUtil.replaceToXml(rec.ink));
			//rx.add(record, "a_01", StringUtil.replaceToXml(rec.a_01));
			//rx.add(record, "a_02", StringUtil.replaceToXml(rec.a_02));
			//rx.add(record, "a_03", StringUtil.replaceToXml(rec.a_03));
			//rx.add(record, "a_04", StringUtil.replaceToXml(rec.a_04));
			//rx.add(record, "a_05", StringUtil.replaceToXml(rec.a_05));
			//rx.add(record, "a_06", StringUtil.replaceToXml(rec.a_06));
			//rx.add(record, "a_08", StringUtil.replaceToXml(rec.a_08));
			//rx.add(record, "a_09", StringUtil.replaceToXml(rec.a_09));
			//rx.add(record, "a_10", StringUtil.replaceToXml(rec.a_10));
			//rx.add(record, "a_11", StringUtil.replaceToXml(rec.a_11));
			//rx.add(record, "a_12", StringUtil.replaceToXml(rec.a_12));
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
<mt_commatr_6610_l>
	<dataSet>
		<CURLIST>
			<record>
				<fac_clsf/>
				<fac_clsf_nm/>
				<ink/>
				<a_01/>
				<a_02/>
				<a_03/>
				<a_04/>
				<a_05/>
				<a_06/>
				<a_08/>
				<a_09/>
				<a_10/>
				<a_11/>
				<a_12/>
			</record>
		</CURLIST>
	</dataSet>
</mt_commatr_6610_l>
*/
%>

<% /* 작성시간 : Mon Oct 07 16:11:34 KST 2013 */ %>