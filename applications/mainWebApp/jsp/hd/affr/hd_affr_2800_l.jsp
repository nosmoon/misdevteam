<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_2800_LDataSet ds = (HD_AFFR_2800_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_2800_LCURLISTRecord rec = (HD_AFFR_2800_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_clsf_cd", rec.emp_clsf_cd);
			rx.add(record, "emp_clsf_nm", rec.emp_clsf_nm);
			rx.add(record, "emp_dtls_clsf", rec.emp_dtls_clsf);
			rx.add(record, "emp_dtls_clsf_nm", rec.emp_dtls_clsf_nm);
			rx.add(record, "emp_clsf", rec.emp_clsf);
			rx.add(record, "nm_engl", rec.nm_engl);
			rx.add(record, "aplc_offi_nm", rec.aplc_offi_nm);
			rx.add(record, "ptph_no", rec.ptph_no);
			rx.add(record, "email_id", rec.email_id);
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "fax_no", rec.fax_no);
			rx.add(record, "zip_1", rec.zip_1);
			rx.add(record, "zip_2", rec.zip_2);
			rx.add(record, "addr", rec.addr);
			rx.add(record, "dtls_addr", rec.dtls_addr);
			rx.add(record, "qunt_side_clam_qunt", "");
			rx.add(record, "dn_side_clam_qunt", "");
			rx.add(record, "remk", "");
			rx.add(record, "zip_temp", "");
			rx.add(record, "aplc_cnfm_yn", "");
		}
		rx.add(dataSet, "totalcnt", ds.curlist.size());
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
			<flnm/>
			<dty_cd/>
			<dty_nm/>
			<posi_cd/>
			<posi_nm/>
			<dept_cd/>
			<dept_nm/>
			<emp_clsf_cd/>
			<emp_clsf_nm/>
			<emp_dtls_clsf/>
			<emp_dtls_clsf_nm/>
			<emp_clsf/>
			<nm_engl/>
			<aplc_offi_nm/>
			<ptph_no/>
			<email_id/>
			<tel_no/>
			<fax_no/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Mar 27 09:41:52 KST 2009 */ %>
