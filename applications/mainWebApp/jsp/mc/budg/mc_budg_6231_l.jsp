<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.budg.rec.*
	,	chosun.ciis.mc.budg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_BUDG_6231_LDataSet ds = (MC_BUDG_6231_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_6231_LCURLISTRecord rec = (MC_BUDG_6231_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pubc_occr_dt", rec.pubc_occr_dt);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "pubc_side", rec.pubc_side);
			rx.add(record, "sect_nm_cd", rec.sect_nm_cd);
			rx.add(record, "sect_nm_cdnm", rec.sect_nm_cdnm);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "pubc_slip_no", rec.pubc_slip_no);
			rx.add(record, "cm", rec.cm);
			rx.add(record, "dn", rec.dn);
			rx.add(record, "arow", rec.arow);
			rx.add(record, "squar", rec.squar);
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "pubc_uprc", rec.pubc_uprc);
			rx.add(record, "loss_squar", rec.loss_squar);
			rx.add(record, "loss_adv_amt", rec.loss_adv_amt);
			rx.add(record, "diff_amt", rec.diff_amt);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "edt_clsf_nm", rec.edt_clsf_nm);
			rx.add(record, "edt_clsf", rec.edt_clsf);
			rx.add(record, "slcrg_pers_nm", rec.slcrg_pers_nm);
			rx.add(record, "slcrg_pers", rec.slcrg_pers);
			rx.add(record, "mchrg_pers_nm", rec.mchrg_pers_nm);
			rx.add(record, "mchrg_pers", rec.mchrg_pers);
			//rx.add(record, "pubc_occr_dt", StringUtil.replaceToXml(rec.pubc_occr_dt));
			//rx.add(record, "sect_cd", StringUtil.replaceToXml(rec.sect_cd));
			//rx.add(record, "pubc_side", StringUtil.replaceToXml(rec.pubc_side));
			//rx.add(record, "sect_nm_cd", StringUtil.replaceToXml(rec.sect_nm_cd));
			//rx.add(record, "sect_nm_cdnm", StringUtil.replaceToXml(rec.sect_nm_cdnm));
			//rx.add(record, "dlco_no", StringUtil.replaceToXml(rec.dlco_no));
			//rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			//rx.add(record, "pubc_slip_no", StringUtil.replaceToXml(rec.pubc_slip_no));
			//rx.add(record, "cm", StringUtil.replaceToXml(rec.cm));
			//rx.add(record, "dn", StringUtil.replaceToXml(rec.dn));
			//rx.add(record, "arow", StringUtil.replaceToXml(rec.arow));
			//rx.add(record, "squar", StringUtil.replaceToXml(rec.squar));
			//rx.add(record, "uprc", StringUtil.replaceToXml(rec.uprc));
			//rx.add(record, "pubc_uprc", StringUtil.replaceToXml(rec.pubc_uprc));
			//rx.add(record, "loss_squar", StringUtil.replaceToXml(rec.loss_squar));
			//rx.add(record, "loss_adv_amt", StringUtil.replaceToXml(rec.loss_adv_amt));
			//rx.add(record, "diff_amt", StringUtil.replaceToXml(rec.diff_amt));
			//rx.add(record, "advt_fee", StringUtil.replaceToXml(rec.advt_fee));
			//rx.add(record, "edt_clsf_nm", StringUtil.replaceToXml(rec.edt_clsf_nm));
			//rx.add(record, "edt_clsf", StringUtil.replaceToXml(rec.edt_clsf));
			//rx.add(record, "slcrg_pers_nm", StringUtil.replaceToXml(rec.slcrg_pers_nm));
			//rx.add(record, "slcrg_pers", StringUtil.replaceToXml(rec.slcrg_pers));
			//rx.add(record, "mchrg_pers_nm", StringUtil.replaceToXml(rec.mchrg_pers_nm));
			//rx.add(record, "mchrg_pers", StringUtil.replaceToXml(rec.mchrg_pers));
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
<mc_budg_6231_l>
	<dataSet>
		<CURLIST>
			<record>
				<pubc_occr_dt/>
				<sect_cd/>
				<pubc_side/>
				<sect_nm_cd/>
				<sect_nm_cdnm/>
				<dlco_no/>
				<dlco_nm/>
				<pubc_slip_no/>
				<cm/>
				<dn/>
				<arow/>
				<squar/>
				<uprc/>
				<pubc_uprc/>
				<loss_squar/>
				<loss_adv_amt/>
				<diff_amt/>
				<advt_fee/>
				<edt_clsf_nm/>
				<edt_clsf/>
				<slcrg_pers_nm/>
				<slcrg_pers/>
				<mchrg_pers_nm/>
				<mchrg_pers/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_6231_l>
*/
%>

<% /* 작성시간 : Wed May 20 14:07:59 KST 2009 */ %>