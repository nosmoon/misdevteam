<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_2900_LDataSet ds = (HD_AFFR_2900_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_2900_LCURLISTRecord rec = (HD_AFFR_2900_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "qunt_side_clam_qunt", rec.qunt_side_clam_qunt);
			rx.add(record, "dn_side_clam_qunt", rec.dn_side_clam_qunt);
			rx.addCData(record, "aplc_flnm", rec.aplc_flnm);
			rx.addCData(record, "aplc_engl_flnm", rec.aplc_engl_flnm);
			rx.addCData(record, "aplc_dty_nm", rec.aplc_dty_nm);
			rx.addCData(record, "aplc_offi_nm", rec.aplc_offi_nm);
			rx.addCData(record, "aplc_dept_nm", rec.aplc_dept_nm);
			rx.addCData(record, "tel_no", rec.tel_no);
			rx.addCData(record, "fax_no", rec.fax_no);
			rx.addCData(record, "ceph_no", rec.ceph_no);
			rx.add(record, "email", StringUtil.replaceToXml(rec.email));
			rx.add(record, "zip_1", rec.zip_1);
			rx.add(record, "zip_2", rec.zip_2);
			rx.add(record, "addr", StringUtil.replaceToXml(rec.addr));
			rx.addCData(record, "dtls_addr", StringUtil.replaceToXml(rec.dtls_addr));
			rx.addCData(record, "remk", StringUtil.replaceToXml(rec.remk));
			rx.add(record, "aplc_cnfm_yn", rec.aplc_cnfm_yn);
			rx.add(record, "aplc_cnfm_ynnm", rec.aplc_cnfm_ynnm);
			if(rec.zip_1.length() == 5 ) // 2015.08.04 우편번호 개편으로 인해 수정 함 (이가연) 
			{
				rx.add(record, "zip_temp", rec.zip_1);
			}
			else 
			{
				rx.add(record, "zip_temp", rec.zip_1+"-"+rec.zip_2);
			}
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "qunt_side_clam_qunt", StringUtil.replaceToXml(rec.qunt_side_clam_qunt));
			//rx.add(record, "dn_side_clam_qunt", StringUtil.replaceToXml(rec.dn_side_clam_qunt));
			//rx.add(record, "aplc_flnm", StringUtil.replaceToXml(rec.aplc_flnm));
			//rx.add(record, "aplc_engl_flnm", StringUtil.replaceToXml(rec.aplc_engl_flnm));
			//rx.add(record, "aplc_dty_nm", StringUtil.replaceToXml(rec.aplc_dty_nm));
			//rx.add(record, "aplc_offi_nm", StringUtil.replaceToXml(rec.aplc_offi_nm));
			//rx.add(record, "aplc_dept_nm", StringUtil.replaceToXml(rec.aplc_dept_nm));
			//rx.add(record, "tel_no", StringUtil.replaceToXml(rec.tel_no));
			//rx.add(record, "fax_no", StringUtil.replaceToXml(rec.fax_no));
			//rx.add(record, "ceph_no", StringUtil.replaceToXml(rec.ceph_no));
			//rx.add(record, "email", StringUtil.replaceToXml(rec.email));
			//rx.add(record, "zip_1", StringUtil.replaceToXml(rec.zip_1));
			//rx.add(record, "zip_2", StringUtil.replaceToXml(rec.zip_2));
			//rx.add(record, "addr", StringUtil.replaceToXml(rec.addr));
			//rx.add(record, "dtls_addr", StringUtil.replaceToXml(rec.dtls_addr));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "aplc_cnfm_yn", StringUtil.replaceToXml(rec.aplc_cnfm_yn));
			//rx.add(record, "aplc_cnfm_ynnm", StringUtil.replaceToXml(rec.aplc_cnfm_ynnm));
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
			<occr_dt/>
			<seq/>
			<flnm/>
			<dept_cd/>
			<dty_cd/>
			<posi_cd/>
			<qunt_side_clam_qunt/>
			<dn_side_clam_qunt/>
			<aplc_flnm/>
			<aplc_engl_flnm/>
			<aplc_dty_nm/>
			<aplc_offi_nm/>
			<aplc_dept_nm/>
			<tel_no/>
			<fax_no/>
			<ceph_no/>
			<email/>
			<zip_1/>
			<zip_2/>
			<addr/>
			<dtls_addr/>
			<remk/>
			<aplc_cnfm_yn/>
			<aplc_cnfm_ynnm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Mar 27 13:47:23 KST 2009 */ %>
