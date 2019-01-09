<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.leas.rec.*
	,	chosun.ciis.as.leas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_LEAS_1001_LDataSet ds = (AS_LEAS_1001_LDataSet)request.getAttribute("ds");
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
			AS_LEAS_1001_LCURLISTRecord rec = (AS_LEAS_1001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aset_no", rec.aset_no);
			rx.addCData(record, "aset_nm", rec.aset_nm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "leas_obj_good_yn", rec.leas_obj_good_yn);
			rx.add(record, "leas_bldg_cd", rec.leas_bldg_cd);
			rx.add(record, "leas_ern_no", rec.leas_ern_no);
			rx.add(record, "leas_dlco_ern_nm", rec.leas_dlco_ern_nm);
			rx.add(record, "leas_ref_aset_no", rec.leas_ref_aset_no);
			rx.add(record, "leas_ref_aset_nm", rec.leas_ref_aset_nm);
			rx.add(record, "acqr_dt", rec.acqr_dt);
			rx.add(record, "sale_dt", rec.sale_dt);
			rx.add(record, "aset_qunt_cnt", rec.aset_qunt_cnt);
			rx.add(record, "aset_usag", rec.aset_usag);
			rx.add(record, "aset_loca", rec.aset_loca);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "incmg_pers_nm", rec.incmg_pers_nm);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//rx.add(record, "aset_no", StringUtil.replaceToXml(rec.aset_no));
			//rx.add(record, "aset_nm", StringUtil.replaceToXml(rec.aset_nm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "leas_obj_good_yn", StringUtil.replaceToXml(rec.leas_obj_good_yn));
			//rx.add(record, "leas_bldg_cd", StringUtil.replaceToXml(rec.leas_bldg_cd));
			//rx.add(record, "leas_ern_no", StringUtil.replaceToXml(rec.leas_ern_no));
			//rx.add(record, "leas_dlco_ern_nm", StringUtil.replaceToXml(rec.leas_dlco_ern_nm));
			//rx.add(record, "leas_ref_aset_no", StringUtil.replaceToXml(rec.leas_ref_aset_no));
			//rx.add(record, "leas_ref_aset_nm", StringUtil.replaceToXml(rec.leas_ref_aset_nm));
			//rx.add(record, "acqr_dt", StringUtil.replaceToXml(rec.acqr_dt));
			//rx.add(record, "sale_dt", StringUtil.replaceToXml(rec.sale_dt));
			//rx.add(record, "aset_qunt_cnt", StringUtil.replaceToXml(rec.aset_qunt_cnt));
			//rx.add(record, "aset_usag", StringUtil.replaceToXml(rec.aset_usag));
			//rx.add(record, "aset_loca", StringUtil.replaceToXml(rec.aset_loca));
			//rx.add(record, "incmg_dt_tm", StringUtil.replaceToXml(rec.incmg_dt_tm));
			//rx.add(record, "incmg_pers_nm", StringUtil.replaceToXml(rec.incmg_pers_nm));
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
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
<as_leas_1001_l>
	<dataSet>
		<CURLIST>
			<record>
				<aset_no/>
				<aset_nm/>
				<dept_cd/>
				<dept_nm/>
				<leas_obj_good_yn/>
				<leas_bldg_cd/>
				<leas_ern_no/>
				<leas_dlco_ern_nm/>
				<leas_ref_aset_no/>
				<leas_ref_aset_nm/>
				<acqr_dt/>
				<sale_dt/>
				<aset_qunt_cnt/>
				<aset_usag/>
				<aset_loca/>
				<incmg_dt_tm/>
				<incmg_pers_nm/>
				<cmpy_cd/>
			</record>
		</CURLIST>
	</dataSet>
</as_leas_1001_l>
*/
%>

<% /* 작성시간 : Thu May 07 10:54:37 KST 2009 */ %>