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
	HD_INFO_1052_LDataSet ds = (HD_INFO_1052_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int recordSet = 0;
	int depth1 = 0;

	try {
		recordSet = rx.add(root, "tempData", "");
	
		//depth1 = rx.add(recordSet, "addr_clsf_1", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1052_LCURLISTRecord rec = (HD_INFO_1052_LCURLISTRecord)ds.curlist.get(i);
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
				rx.add(recordSet, "email_id_1", rec.email_addr);
				rx.add(recordSet, "email_cd_1", rec.email_cd);
			}
		}
	
		//depth1 = rx.add(recordSet, "addr_clsf_2", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1052_LCURLISTRecord rec = (HD_INFO_1052_LCURLISTRecord)ds.curlist.get(i);
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
				rx.add(recordSet, "email_id_2", rec.email_addr);
				rx.add(recordSet, "email_nm", rec.email_cd);
			}
		}
	
		//depth1 = rx.add(recordSet, "addr_clsf_3", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1052_LCURLISTRecord rec = (HD_INFO_1052_LCURLISTRecord)ds.curlist.get(i);
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
				rx.add(recordSet, "email_id_3", rec.email_addr);
				rx.add(recordSet, "email_cd_3", rec.email_cd);
			}
		}
	
		//depth1 = rx.add(recordSet, "addr_clsf_4", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1052_LCURLISTRecord rec = (HD_INFO_1052_LCURLISTRecord)ds.curlist.get(i);
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
				rx.add(recordSet, "email_id_4", rec.email_addr);
				rx.add(recordSet, "email_cd_4", rec.email_cd);
			}
		}
		//depth1 = rx.add(recordSet, "addr_clsf_4", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1052_LCURLISTRecord rec = (HD_INFO_1052_LCURLISTRecord)ds.curlist.get(i);
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
			<tel_no_1/>
			<tel_no_2/>
			<tel_no_3/>
			<tel_no_4/>
			<fax_no/>
			<ptph_no/>
			<ptph_no_1/>
			<ptph_no_2/>
			<ptph_no_3/>
			<ptph_no_4/>
			<incmp_tel_no/>
			<email_addr/>
			<forn_addr/>
			<forn_tel_no/>
			<forn_ptph_no/>
			<forn_fax_no/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Feb 05 13:00:04 KST 2009 */ %>