<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_5101_LDataSet ds = (HD_INFO_5101_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	recordSet = rx.add(root, "tempData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5101_LCURLISTRecord rec = (HD_INFO_5101_LCURLISTRecord)ds.curlist.get(i);
			if ("1".equals(rec.getAddr_clsf())){
				rx.add(recordSet, "cmpy_cd_1", rec.cmpy_cd);
				rx.add(recordSet, "emp_no_1", rec.emp_no);
				//rx.add(recordSet, "addr_clsf_1", rec.addr_clsf);
				rx.add(recordSet, "zip_1_1", rec.zip_1);
				rx.add(recordSet, "zip_2_1", rec.zip_2);
				rx.add(recordSet, "addr_1", rec.addr);
				rx.add(recordSet, "addr_dtls_1", rec.dtls_addr);
				rx.add(recordSet, "tel_no_1", rec.tel_no);
				rx.add(recordSet, "fax_no_1", rec.fax_no);
				rx.add(recordSet, "ptph_no_1", rec.ptph_no);
				rx.add(recordSet, "email_id_1", rec.email_id);
			}
		}
	
		//depth1 = rx.add(recordSet, "addr_clsf_2", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5101_LCURLISTRecord rec = (HD_INFO_5101_LCURLISTRecord)ds.curlist.get(i);
			if ("2".equals(rec.getAddr_clsf())){
				rx.add(recordSet, "cmpy_cd_2", rec.cmpy_cd);
				rx.add(recordSet, "emp_no_2", rec.emp_no);
				//rx.add(recordSet, "addr_clsf_2", rec.addr_clsf);
				rx.add(recordSet, "zip_1_2", rec.zip_1);
				rx.add(recordSet, "zip_2_2", rec.zip_2);
				rx.add(recordSet, "addr_2", rec.addr);
				rx.add(recordSet, "addr_dtls_2", rec.dtls_addr);
				rx.add(recordSet, "tel_no_2", rec.tel_no);
				rx.add(recordSet, "fax_no_2", rec.fax_no);
				rx.add(recordSet, "ptph_no_2", rec.ptph_no);
				rx.add(recordSet, "email_id_2", rec.email_id);
				rx.add(recordSet, "email_cd", rec.email_cd);
			}
		}
	
		//depth1 = rx.add(recordSet, "addr_clsf_3", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5101_LCURLISTRecord rec = (HD_INFO_5101_LCURLISTRecord)ds.curlist.get(i);
			if ("3".equals(rec.getAddr_clsf())){
				rx.add(recordSet, "cmpy_cd_3", rec.cmpy_cd);
				rx.add(recordSet, "emp_no_3", rec.emp_no);
				//rx.add(recordSet, "addr_clsf_3", rec.addr_clsf);
				//rx.add(recordSet, "zip_1_3", rec.zip_1);
				//rx.add(recordSet, "zip_2_3", rec.zip_2);
				//rx.add(recordSet, "addr_3", rec.addr);
				//rx.add(recordSet, "addr_dtls_3", rec.dtls_addr);
				rx.add(recordSet, "forn_zip_3", rec.forn_zip);
				rx.add(recordSet, "forn_addr_3", rec.forn_addr);
				rx.add(recordSet, "tel_no_3", rec.tel_no);
				rx.add(recordSet, "fax_no_3", rec.fax_no);
				rx.add(recordSet, "ptph_no_3", rec.ptph_no);
				rx.add(recordSet, "email_id_3", rec.email_id);
			}
		}
	
		//depth1 = rx.add(recordSet, "addr_clsf_4", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5101_LCURLISTRecord rec = (HD_INFO_5101_LCURLISTRecord)ds.curlist.get(i);
			if ("4".equals(rec.getAddr_clsf())){
				rx.add(recordSet, "cmpy_cd_4", rec.cmpy_cd);
				rx.add(recordSet, "emp_no_4", rec.emp_no);
				//rx.add(recordSet, "addr_clsf_4", rec.addr_clsf);
				//rx.add(recordSet, "zip_1_4", rec.zip_1);
				//rx.add(recordSet, "zip_2_4", rec.zip_2);
				//rx.add(recordSet, "addr_4", rec.addr);
				//rx.add(recordSet, "addr_dtls_4", rec.dtls_addr);
				rx.add(recordSet, "forn_zip_4", rec.forn_zip);
				rx.add(recordSet, "forn_addr_4", rec.forn_addr);
				rx.add(recordSet, "tel_no_4", rec.tel_no);
				rx.add(recordSet, "fax_no_4", rec.fax_no);
				rx.add(recordSet, "ptph_no_4", rec.ptph_no);
				rx.add(recordSet, "email_id_4", rec.email_id);
			}
		}
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5101_LCURLISTRecord rec = (HD_INFO_5101_LCURLISTRecord)ds.curlist.get(i);
			if ("5".equals(rec.getAddr_clsf())){
				rx.add(recordSet, "cmpy_cd_5", rec.cmpy_cd);
				rx.add(recordSet, "emp_no_5", rec.emp_no);
				//rx.add(recordSet, "addr_clsf_4", rec.addr_clsf);
				//rx.add(recordSet, "zip_1_4", rec.zip_1);
				//rx.add(recordSet, "zip_2_4", rec.zip_2);
				//rx.add(recordSet, "addr_4", rec.addr);
				//rx.add(recordSet, "addr_dtls_4", rec.dtls_addr);
				rx.add(recordSet, "tel_no_5", rec.tel_no);
				rx.add(recordSet, "cntc_rshp", rec.cntc_rshp);
			}
		}
		/****** CURLIST END */
		
		
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST", "");

//		for(int i = 0; i < ds.curlist.size(); i++) {
//			HD_INFO_5101_LCURLISTRecord rec = (HD_INFO_5101_LCURLISTRecord)ds.curlist.get(i);
//			int record = rx.add(recordSet, "record", "");
//			rx.add(record, "cmpy_cd", rec.cmpy_cd);
//			rx.add(record, "emp_no", rec.emp_no);
//			rx.add(record, "addr_clsf", rec.addr_clsf);
//			rx.add(record, "zip_1", rec.zip_1);
//			rx.add(record, "zip_2", rec.zip_2);
//			rx.add(record, "addr", rec.addr);
//			rx.add(record, "dtls_addr", rec.dtls_addr);
//			rx.add(record, "tel_no", rec.tel_no);
//			rx.add(record, "fax_no", rec.fax_no);
//			rx.add(record, "ptph_no", rec.ptph_no);
//			rx.add(record, "email_id", rec.email_id);
//		}
//		rx.add(recordSet, "totalcnt", ds.curlist.size());
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
			<cmpy_cd/>
			<emp_no/>
			<addr_clsf/>
			<zip_1/>
			<zip_2/>
			<addr/>
			<dtls_addr/>
			<tel_no/>
			<fax_no/>
			<ptph_no/>
			<email_id/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 15 18:49:36 KST 2009 */ %>