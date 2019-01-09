<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_1092_LDataSet ds = (HD_INFO_1092_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_INFO_1092_LCURLIST1Record rec = (HD_INFO_1092_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "gurt_insr_entr_dt", rec.gurt_insr_entr_dt);
			rx.add(record, "gurt_insr_mtry_dt", rec.gurt_insr_mtry_dt);
			rx.add(record, "gurt_insr_amt", rec.gurt_insr_amt);
			rx.add(record, "gurt_insr_no", rec.gurt_insr_no);
			//rx.add(record, "gurt_insr_entr_dt", StringUtil.replaceToXml(rec.gurt_insr_entr_dt));
			//rx.add(record, "gurt_insr_mtry_dt", StringUtil.replaceToXml(rec.gurt_insr_mtry_dt));
			//rx.add(record, "gurt_insr_amt", StringUtil.replaceToXml(rec.gurt_insr_amt));
			//rx.add(record, "gurt_insr_no", StringUtil.replaceToXml(rec.gurt_insr_no));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1092_LCURLISTRecord rec = (HD_INFO_1092_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "prtct_obj_clsf_cd", rec.prtct_obj_clsf_cd);
			rx.add(record, "prtct_obj_clsf_nm", rec.prtct_obj_clsf_nm);
			rx.add(record, "prtct_obj_pers_no", rec.prtct_obj_pers_no);
			rx.add(record, "prtct_grad_cd", rec.prtct_grad_cd);
			rx.add(record, "prtct_grad_nm", rec.prtct_grad_nm);
			rx.add(record, "prtct_obj_relatn", rec.prtct_obj_relatn);
			rx.add(record, "prtct_obj_relatn_rshp_cd", rec.prtct_obj_relatn_rshp_cd);
			rx.add(record, "prtct_obj_relatn_rshp_nm", rec.prtct_obj_relatn_rshp_nm);
			rx.add(record, "prtct_appmt_ofbld_cd", rec.prtct_appmt_ofbld_cd);
			rx.add(record, "prtct_appmt_ofbld_nm", rec.prtct_appmt_ofbld_nm);
			//rx.add(record, "prtct_obj_clsf_cd", StringUtil.replaceToXml(rec.prtct_obj_clsf_cd));
			//rx.add(record, "prtct_obj_pers_no", StringUtil.replaceToXml(rec.prtct_obj_pers_no));
			//rx.add(record, "prtct_grad_cd", StringUtil.replaceToXml(rec.prtct_grad_cd));
			//rx.add(record, "prtct_obj_relatn", StringUtil.replaceToXml(rec.prtct_obj_relatn));
			//rx.add(record, "prtct_obj_relatn_rshp_cd", StringUtil.replaceToXml(rec.prtct_obj_relatn_rshp_cd));
			//rx.add(record, "prtct_obj_relatn_rshp_nm", StringUtil.replaceToXml(rec.prtct_obj_relatn_rshp_nm));
			//rx.add(record, "prtct_appmt_ofbld_cd", StringUtil.replaceToXml(rec.prtct_appmt_ofbld_cd));
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
<hd_info_1092_l>
	<dataSet>
		<CURLIST1>
			<record>
				<gurt_insr_entr_dt/>
				<gurt_insr_mtry_dt/>
				<gurt_insr_amt/>
				<gurt_insr_no/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_info_1092_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_info_1092_l>
	<dataSet>
		<CURLIST>
			<record>
				<prtct_obj_clsf_cd/>
				<prtct_obj_pers_no/>
				<prtct_grad_cd/>
				<prtct_obj_relatn/>
				<prtct_obj_relatn_rshp_cd/>
				<prtct_obj_relatn_rshp_nm/>
				<prtct_appmt_ofbld_cd/>
			</record>
		</CURLIST>
	</dataSet>
</hd_info_1092_l>
*/
%>

<% /* 작성시간 : Thu Jun 18 13:58:55 KST 2009 */ %>